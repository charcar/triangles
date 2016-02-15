import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void newTriangle_setsSide1() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(2, testTriangle.getSide1());
  }
  @Test
  public void newTriangle_setsSide2() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(2, testTriangle.getSide2());
  }
  @Test
  public void newTriangle_setsSide3() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(2, testTriangle.getSide3());
  }

  @Test
  public void isEquilateral_whenAllSidesEqual_true() {
    Triangle testTriangle = new Triangle(3, 3, 3);
    assertEquals(true, testTriangle.isEquilateral());
  }

  @Test
  public void isIsosceles_whenTwoSidesEqual_true() {
    Triangle testTriangle = new Triangle(4, 4, 5);
    assertEquals(true, testTriangle.isIsosceles());
  }

  @Test
  public void isScalene_whenNoSidesEqual_true() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(true, testTriangle.isScalene());
  }

  @Test
  public void isNotATriangle_whenSumOfTwoSidesIsLessThanLengthOfThird_true() {
    Triangle testTriangle = new Triangle(2, 2, 8);
    assertEquals(true, testTriangle.isNotTriangle());
  }



  // first test if equilateral
  //
  // @Test
  // public void isSquare_whenNotASquare_false() {
  //   Rectangle testRectangle = new Rectangle (2, 4);
  //   assertEquals(false, testRectangle.isSquare());
  // }
  //
  // @Test
  // public void isSquare_whenASquare_true() {
  //   Rectangle testRectangle = new Rectangle (3, 3);
  //   assertEquals(true, testRectangle.isSquare());
  // }
}
