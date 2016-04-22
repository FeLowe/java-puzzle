import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class PuzzleTest { //("extends FluentTest" goes in front of PuzzleTest, outside de curly braces)needs to change "BlankTest" according of how you named it on your BlankTest.java file//
//   public WebDriver webDriver = new HtmlUnitDriver();
//
//   @Override
//  public WebDriver getDefaultDriver() {
//    return webDriver;
//  }
//
//  @ClassRule
//  public static ServerRule server = new ServerRule();

 // @Test
 // public void rootTest() {
 //   goTo("http://localhost:4567/");
 //    fill("#???").with("?");// (fill: method that calls from your "home.vtl" file)(with: fake user iNPUT YOU CREATED JUST TO DO A TEST).
 //    submit(".btn");
 //    assertThat(pageSource()).contains("what you want to be found related to your method");
 // }
  @Test
  public void runPuzzle_checkIfItReturnsSenteceInputterByUser_string(){
    Puzzle testPuzzle = new Puzzle();
    String expected = "cat";
    assertEquals(expected, testPuzzle.runPuzzle("cat"));
  }
}
