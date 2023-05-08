import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AcrescimoProdutoTest {

    @Test
    public void testAcrescimoProduto() {
        // Arrange
        double valorProduto = 50;

        // Act
        double novoValorProduto = valorProduto * 1.1;

        // Assert
        assertEquals(55, novoValorProduto);
    }

    @Test
    public void testValorInvalido() {
        // Arrange
        double valorProduto = 0;

        // Act & Assert
        assertThrows(ArithmeticException.class, () -> {
            AcrescimoProduto.main(new String[]{String.valueOf(valorProduto)});
        });
    }
}
