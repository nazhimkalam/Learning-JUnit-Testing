import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

public class TestCalculator
{
    Calculator c = null;

    @BeforeEach
    public void setUp()
    {
        c = new Calculator();
    }

    @BeforeAll
    static void beforeAllInit()
    {
        System.out.println("This runs before all . . .");
    }

    @AfterEach
    void cleanup()
    {
        System.out.println("Cleaning up . . .");
    }

    @Test   // this @Test annotation is used to code the following code for testing purposes
    public void testAdd()
    {
        assertEquals(8, c.add(3,5));
    }

    @RepeatedTest(5)
    public void testAdd2()
    {
        assertEquals(12, c.add(3,9));
    }

    @Test   // this @Test annotation is used to code the following code for testing purposes
    public void testMul()
    {
        // This will run only in JDK 8 or Higher due to the use of Lambda
//        assertAll(
//                () -> assertEquals(4, c.mul(2,2)),
//                () -> assertEquals(8, c.mul(5,2)),
//                () -> assertEquals(10, c.mul(5,2)),
//                () -> assertEquals(26, c.mul(13,2))
//        );
    }

    @Test   // this @Test annotation is used to code the following code for testing purposes
    @Disabled // this skips this test
    public void testSub()
    {
        assertEquals(5,c.sub(10,5));
    }

    @Test   // this @Test annotation is used to code the following code for testing purposes
    @DisplayName("Testing for ArithmeticException")
    void testDiv()
    {
        // There will be an arithmetic error will be thrown when you divide by 0
//        assertThrows(ArithmeticException.class,() -> c1.div(1,0), "Cannot divide by 0"); This line works with JDK 8 or higher
//        assertThrows(ArithmeticException.class, new Executable() {
//            public void execute() throws Throwable {
//                c.div(1, 0);
//            }
//        }, "Cannot divide by 0 error");

        assertThrows(ArithmeticException.class, new Executable() {
            public void execute() throws Throwable {
                c.div(1, 0);
            }
        }, "Cannot divide by 0 error");
    }



}
