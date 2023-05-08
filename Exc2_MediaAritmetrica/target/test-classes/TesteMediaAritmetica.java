import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MediaAritmeticaTest {

    @Test
    public void testMediaAritmetica() {
        // Arrange
        double numero1 = 10;
        double numero2 = 20;

        // Act
        double media = (numero1 + numero2) / 2;

        // Assert
        assertEquals(15, media);
    }
}
