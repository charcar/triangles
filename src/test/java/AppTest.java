import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Enter three sides");
  }

  // what happens after a user submits the form
  @Test
  public void triangleTestIsEquilateral() {
    goTo("http://localhost:4567/");
    fill("#side1").with("5");
    fill("#side2").with("5");
    fill("#side3").with("5");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is equilateral");
  }

  @Test
  public void triangleTestisScalene() {
    goTo("http://localhost:4567/");
    fill("#side1").with("2");
    fill("#side2").with("3");
    fill("#side3").with("4");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is scalene");
  }

  @Test
  public void triangleTestisIsosceles() {
    goTo("http://localhost:4567/");
    fill("#side1").with("3");
    fill("#side2").with("3");
    fill("#side3").with("5");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is isosceles");
  }

  @Test
  public void triangleTestisImpossible() {
    goTo("http://localhost:4567/");
    fill("#side1").with("2");
    fill("#side2").with("2");
    fill("#side3").with("8");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is impossible");
  }
}
