package com.radek.andersonhelder.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.radek.andersonhelder.entities.Alunos;
import com.radek.andersonhelder.entities.Notas;
import com.radek.andersonhelder.repository.AlunosRepository;
import com.radek.andersonhelder.repository.NotasRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private NotasRepository notasRepository;

	@Autowired
	private AlunosRepository alunosRepository;

	@Override
	public void run(String... args) throws Exception {

		Alunos aluno = new Alunos(null, "Julia", 81, null);
		Alunos aluno2 = new Alunos(null, "Carol", 68, null);
		Alunos aluno3 = new Alunos(null, "Maria", 99, null);
		Alunos aluno4 = new Alunos(null, "Andreia", 78, null);
		Alunos aluno5 = new Alunos(null, "Jaqueline", 63, null);
		Alunos aluno6 = new Alunos(null, "Marcela", 88, null);

		alunosRepository.saveAll(Arrays.asList(aluno, aluno2, aluno3, aluno4, aluno5, aluno6));

		Notas nota1 = new Notas(1, 0, 9);
		Notas nota2 = new Notas(2, 10, 19);
		Notas nota3 = new Notas(3, 20, 29);
		Notas nota4 = new Notas(4, 30, 39);
		Notas nota5 = new Notas(5, 40, 49);
		Notas nota6 = new Notas(6, 50, 59);
		Notas nota7 = new Notas(7, 60, 69);
		Notas nota8 = new Notas(8, 70, 79);
		Notas nota9 = new Notas(9, 80, 89);
		Notas nota10 = new Notas(10, 90, 100);

		notasRepository.saveAll(Arrays.asList(nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8, nota9, nota10));

	}

}
