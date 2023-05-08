import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CadastroUsuarioTest {

    @Test
    public void testNomeVazio() {
        String nome = "";
        String cpf = "12345678901";
        int idade = 30;

        assertThrows(IllegalArgumentException.class, () -> {
            new Usuario(nome, cpf, idade);
        });
    }

    @Test
    public void testCPFInvalido() {
        String nome = "João";
        String cpf = "1234567890";
        int idade = 30;

        assertThrows(IllegalArgumentException.class, () -> {
            new Usuario(nome, cpf, idade);
        });
    }

    @Test
    public void testIdadeInvalida() {
        String nome = "João";
        String cpf = "12345678901";
        int idade = -1;
        
        assertThrows(IllegalArgumentException.class, () -> {
            new Usuario(nome, cpf, idade);
        });
    }

    @Test
    public void testCadastroUsuarioSucesso() {
        String nome = "João";
        String cpf = "12345678901";
        int idade = 30;

        Usuario usuario = new Usuario(nome, cpf, idade);

        assertEquals(nome, usuario.getNome());
        assertEquals(cpf, usuario.getCpf());
        assertEquals(idade, usuario.getIdade());
    }
}
