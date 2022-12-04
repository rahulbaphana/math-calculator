import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();

        Assertions.assertEquals("Hello World!", helloWorld.greet());
    }
}
