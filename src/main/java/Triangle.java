public class Triangle {
  private int mSide1;
  private int mSide2;
  private int mSide3;

  public Triangle(int side1, int side2, int side3) {
    mSide1 = side1;
    mSide2 = side2;
    mSide3 = side3;
  }

  public int getSide1() {
    return mSide1;
  }

  public int getSide2() {
    return mSide2;
  }

  public int getSide3() {
    return mSide3;
  }

  public boolean isEquilateral() {
    return ((mSide1 == mSide2) && (mSide2 == mSide3));
  }

  // (side1 == side2 and side1 != side3) or (side2 == side3 and side3 != side1) or (side1 == side3 and side1 != side2)
  public boolean isIsosceles() {
    return (((mSide1 == mSide2) && (mSide1 != mSide3)) || ((mSide2 == mSide3) && (mSide3 != mSide1)) || ((mSide1 == mSide3) && (mSide1 != mSide2)));
  }

  // (side1 != side2 && side 2 != side3)
  public boolean isScalene() {
    return ((mSide1 != mSide2) && (mSide2 != mSide3) && (mSide1 != mSide3));
  }

  // (side1 + side2 > side3) or (side1 + side3 > side2) or (side2 + side3 > side1)
  public boolean isNotTriangle() {
    return (((mSide1 + mSide2) < mSide3) || ((mSide1 + mSide3) < mSide2) || ((mSide2 + mSide3) < mSide1));
  }
}
