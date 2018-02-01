package komcrad;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Demonstrates bug in chromedriver 2.35 when driving chrome 64
 */
public class App {
    public static void main( String[] args ) throws Exception {
		ChromeDriverManager.getInstance().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		w("loading pager...");
		driver.get("http://pagerjs.com/demo/#!/start/pager");
		w("Done.");
		w("loading config...");
		driver.get("http://pagerjs.com/demo/#!/start/config");
		w("Done.");
		driver.quit();
    }

	public static void w(String s) {System.out.println(s);}
}
