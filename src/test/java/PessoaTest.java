import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {
    @Test
    void deveNotificarPessoa() {
        Artigo artigo = new Artigo("Tecnologia", "Fulano", "Revista X");
        Pessoa pessoa = new Pessoa("Beltrano");
        pessoa.assinarArtigo(artigo);
        artigo.publicarArtigo();
        assertEquals("Beltrano, novo artigo publicado Artigo{nome='Tecnologia', autor='Fulano', fonte='Revista X'}", pessoa.getUltimaNotificacao());
    }

    @Test
    void deveNotificarPessoas() {
        Artigo artigo = new Artigo("Tecnologia", "Fulano", "Revista X");
        Pessoa pessoa1 = new Pessoa("Beltrano");
        Pessoa pessoa2 = new Pessoa("Cicrano");
        pessoa1.assinarArtigo(artigo);
        pessoa2.assinarArtigo(artigo);
        artigo.publicarArtigo();
        assertEquals("Beltrano, novo artigo publicado Artigo{nome='Tecnologia', autor='Fulano', fonte='Revista X'}", pessoa1.getUltimaNotificacao());
        assertEquals("Cicrano, novo artigo publicado Artigo{nome='Tecnologia', autor='Fulano', fonte='Revista X'}", pessoa2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarAluno() {
        Artigo artigo = new Artigo("Tecnologia", "Fulano", "Revista X");
        Pessoa pessoa = new Pessoa("Beltrano");
        artigo.publicarArtigo();
        assertEquals(null, pessoa.getUltimaNotificacao());
    }

    @Test
    void deveNotificarAlunoTurmaA() {
        Artigo artigo1 = new Artigo("Tecnologia", "Fulano", "Revista X");
        Artigo artigo2 = new Artigo("Ciencia", "Lorem", "Revista X");
        Pessoa pessoa1 = new Pessoa("Beltrano");
        Pessoa pessoa2 = new Pessoa("Cicrano");
        pessoa1.assinarArtigo(artigo1);
        pessoa2.assinarArtigo(artigo2);
        artigo1.publicarArtigo();
        assertEquals("Beltrano, novo artigo publicado Artigo{nome='Tecnologia', autor='Fulano', fonte='Revista X'}", pessoa1.getUltimaNotificacao());
        assertEquals(null, pessoa2.getUltimaNotificacao());
    }
}
