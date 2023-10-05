package integracao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class CursosTest {
	Cursos cursos;
	
	@Test
	public void deveListarCursos() {
		cursos = new Cursos();
	    List<String> listaDeCursos = cursos.ListarCursos();
	    assertEquals("A lista de cursos não deve ser nula", false, listaDeCursos == null);
	    assertEquals("A lista de cursos não deve estar vazia", false, listaDeCursos.isEmpty());
	}
	
}