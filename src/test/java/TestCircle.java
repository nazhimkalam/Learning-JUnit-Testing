
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCircle {

    Circle c = null;

    @Before
    public void setup(){
        c = new Circle();
    }

    @Test
    public void testCircleArea()
    {
        double expectedValue = Math.PI * 2 * 2;
        assertEquals(expectedValue,c.computeCircleArea(2.0),0.001);
    }

}
