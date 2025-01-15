import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Application;

public class AppTest {

    @Test
    public void testApp() {
        Application myApp = new Application();
        String result = myApp.getStatus();

        assertEquals("OK", result);
    }
}
