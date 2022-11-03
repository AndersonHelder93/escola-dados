package com.radek.andersonhelder.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.radek.andersonhelder.entities.Alunos;
import com.radek.andersonhelder.entities.Notas;
import com.radek.andersonhelder.repository.AlunosRepository;
import com.radek.andersonhelder.repository.NotasRepository;

@RestController
@RequestMapping(value = "/alunos")
public class AlunosController {

	@Autowired
	AlunosRepository alunosRepository;

	@Autowired
	NotasRepository notasRepository;

	@GetMapping
	public ResponseEntity<List<Alunos>> buscarPessoas() {
		List<Alunos> al = alunosRepository.findAll();
		for (Alunos aluno : al) {
			System.out.print(aluno);
		}
		return ResponseEntity.ok().body(alunosRepository.findAll());
	}

	@PostMapping(value = "/salvar")
	public Alunos salvarPessoa(@RequestBody Alunos aluno) {
		List<Notas> notas = notasRepository.findAll();
		for (Notas nota : notas) {
			if (aluno.getValor() >= nota.getValorMin() && aluno.getValor() <= nota.getValorMax()) {
				aluno.setNota(nota);

			}

		}

		return alunosRepository.save(aluno);

	}

}
