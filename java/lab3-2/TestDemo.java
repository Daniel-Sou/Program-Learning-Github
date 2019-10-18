abstract class A {
    //normal method
    public void fun(){
         System.out.println("Normal");
	}

    //abstract method
    public abstract void print();	
}

public class TestDemo {
 	public static void main(String[] args) {
	A a = new A();
	}
}