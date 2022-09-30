import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreferenciasDoUsuarioTest {

    @Test
    public void deveRetornarIdioma() {
        PreferenciasDoUsuario.getInstance().setIdioma("pt");
        assertEquals("pt", PreferenciasDoUsuario.getInstance().getIdioma());
    }

    @Test
    public void deveRetornarTamanhoDaFonte() {
        PreferenciasDoUsuario.getInstance().setTamanhoDaFonte(28);
        assertEquals(28, PreferenciasDoUsuario.getInstance().getTamanhoDaFonte());
    }

    @Test
    public void deveRetornarModoNoturno() {
        PreferenciasDoUsuario.getInstance().setModoNoturno(true);
        assertEquals(true, PreferenciasDoUsuario.getInstance().isModoNoturno());
    }
}