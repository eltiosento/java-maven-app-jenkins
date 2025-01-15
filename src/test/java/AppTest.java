import static org.junit.Assert.assertEquals;

import com.example.Application;

public class AppTest {

    public void testApp() {
        Application myApp = new Application();
        String result = myApp.getStatus();

        assertEquals("OK", result);
    }
}
