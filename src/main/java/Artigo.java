import java.util.Observable;

public class Artigo extends Observable {
    private String tema;
    private String autor;
    private String fonte;

    public Artigo(String nome, String autor, String fonte) {
        this.tema = nome;
        this.autor = autor;
        this.fonte = fonte;
    }

    public void publicarArtigo(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Artigo{" +
                "nome='" + tema + '\'' +
                ", autor='" + autor + '\'' +
                ", fonte='" + fonte + '\'' +
                '}';
    }
}
