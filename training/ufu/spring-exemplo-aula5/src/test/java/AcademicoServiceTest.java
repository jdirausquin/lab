import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import wifi.data.Aluno;
import wifi.data.Curso;
import wifi.data.Matricula;
import wifi.service.AcademicoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/applicationContext.xml"})
public class AcademicoServiceTest {

	@Autowired
	private AcademicoService academicoService;
	
	@Test
	public void createCursoAndThenMatricula() {
		Curso c = new Curso(3, "Nutrição");
		academicoService.createCurso(c);
		
		Aluno a = new Aluno(null, "Gabriel Coutinho");
		Matricula m = new Matricula(a, c);
		Matricula matricula = academicoService.createMatricula(m);

		assertNotNull(matricula);
	}
	
	public void createMatriculaTest() {
		Curso c = new Curso(1, "Ciências da Computação");
		Aluno a = new Aluno(1, "Luis Machado Reis");
		
		Matricula m = new Matricula(a, c);

		Matricula matricula = academicoService.createMatricula(m);
		assertNotNull(matricula);
	}

	public void createMatriculaWithPalaTest() {
		Curso c = new Curso(3, "Nutrição");
		Aluno a = new Aluno(null, "Gabriel Coutinho");

		Matricula m = new Matricula(a, c);
		
		Matricula matricula = academicoService.createMatriculaAndCursoAndOrAluno(m);
		assertNotNull(matricula);
	}
}
