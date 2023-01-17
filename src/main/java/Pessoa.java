import java.util.Observable;
import java.util.Observer;

public class Pessoa implements Observer{
    private String nome;
    private String ultimaNotificacao;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void assinarArtigo(Artigo assunto) {
        assunto.addObserver((Observer) this);
    }

    public void update(Observable assunto, Object arg1) {
        this.ultimaNotificacao = this.nome + ", novo artigo publicado " + assunto.toString();
    }
}
