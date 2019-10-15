class A <Type> {
  private Type x;

  int aX = 10;

  public void setAx(Type aX) {
    x = aX;
  }

  public Type getAx() {
    return x;
  }

  public void display() {
    System.out.println("This is the display method of Ax");
  }
}

class B extends A {
  private int x;

  int aX = 20;

  public void setBx(int aX) {
    x = aX;
  }
}

public class C extends B {
  private int x;

  int aX = 30;

  public void setCx(int aX) {
    x = aX;
  }

  public void setXInA(int aX) {
    super.setAx(aX);
    super.display();
  }

  public static void main(String args[]) {
    C out = new C();
    out.setXInA(10);
  }
  
/*
  public int getXInA() {
    return super.getAx();
  }
*/
}