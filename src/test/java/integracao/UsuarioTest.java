package integracao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UsuarioTest {
    Usuario usuario;

    @Test
    public void deveAvaliarUmUsuarioValido() {
        usuario = new Usuario("davi", "123");
        boolean isUsuarioValido = usuario.autenticarUsuario(usuario);
        assertTrue(isUsuarioValido);
    }

    @Test
    public void deveAvaliarUsuarioNulo() {
        usuario = new Usuario("davi", "123");
        boolean isUsuarioValido = usuario.autenticarUsuario(null);
        assertFalse(isUsuarioValido);
    }

    @Test
    public void deveAvaliarNomeNulo() {
        usuario = new Usuario(null, "123");
        Usuario outroUsuario = new Usuario("davi", "123");
        boolean isUsuarioValido = outroUsuario.autenticarUsuario(usuario);
        assertFalse(isUsuarioValido);
    }

    @Test
    public void deveAvaliarSenhaNula() {
        usuario = new Usuario("davi", null);
        Usuario outroUsuario = new Usuario("davi", "123");
        boolean isUsuarioValido = outroUsuario.autenticarUsuario(usuario);
        assertFalse(isUsuarioValido);
    }

    @Test
    public void deveFalharAutenticacaoNomeDiferente() {
        usuario = new Usuario("davi", "123");
        Usuario outroUsuario = new Usuario("joao", "123");
        boolean isUsuarioValido = outroUsuario.autenticarUsuario(usuario);
        assertFalse(isUsuarioValido);
    }

    @Test
    public void deveFalharAutenticacaoSenhaDiferente() {
        usuario = new Usuario("davi", "123");
        Usuario outroUsuario = new Usuario("davi", "456");
        boolean isUsuarioValido = outroUsuario.autenticarUsuario(usuario);
        assertFalse(isUsuarioValido);
    }
}
