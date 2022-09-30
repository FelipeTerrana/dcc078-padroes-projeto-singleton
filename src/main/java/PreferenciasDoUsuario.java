public class PreferenciasDoUsuario {
    private static PreferenciasDoUsuario instance = new PreferenciasDoUsuario();
    private PreferenciasDoUsuario() {}

    public static PreferenciasDoUsuario getInstance() {
        return instance;
    }

    private String idioma;
    private boolean modoNoturno;
    private int tamanhoDaFonte;

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isModoNoturno() {
        return modoNoturno;
    }

    public void setModoNoturno(boolean modoNoturno) {
        this.modoNoturno = modoNoturno;
    }

    public int getTamanhoDaFonte() {
        return tamanhoDaFonte;
    }

    public void setTamanhoDaFonte(int tamanhoDaFonte) {
        this.tamanhoDaFonte = tamanhoDaFonte;
    }
}
