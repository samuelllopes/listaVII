import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTemperatura {

    @Test
    public void testConversorTemperatura() {
        double temperaturaFahrenheit = 68;
        double temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8;
        assertEquals(20, temperaturaCelsius);
    }
}
