import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest {

    @Test
    public void shouldSetTemperature() {
        Conditioner cond = new Conditioner();

        cond.currentTemperature = 15;

        int expected = 15;
        int actual = cond.currentTemperature;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxTemperature() {
        Conditioner cond = new Conditioner();

        cond.setToMaxTemp();

        int expected = 30;
        int actual = cond.currentTemperature;

        Assertions.assertEquals(expected, actual);
    }
}
