## Example 4

Calculate the time required to run 1000 kilometers by different transportation ways.

Car: 

average speed A*B/C

Plane: 

average speed A+B+C

------

Code is below
```
import java.lang.*;

 interface Common {

      double runTimer(double a, double b, double c);

           String getName(); //transportation name

}

 class Plane implements Common  {

      public double runTimer(double a, double b, double c)  {

            return (a+ b + c);

      }

           public String getName(){

                   return "Plane";

           }

}

 class Car implements Common {

      public double runTimer(double a, double b, double c) {
            return ( a*b/c );
      }

            public String getName(){
                   return "Car";
           }
}

public class ComputeTime {

      public static void main(Stringargs[])  {

            double A=3;

            double B=5;

            double C=6;

            double v,t;

                            Commond=new Car();

           v=d.runTimer(A,B,C);

            t=1000/v;

           System.out.println(d.getName()+"has average speed: "+v+" km/h");

           System.out.println(d.getName()+"spends："+t+" hours");

                            d=newPlane();

                            v=d.runTimer(10,30,40);

                            t=1000/v;

           System.out.println(d.getName()+"has average speed: "+v+" km/h");

            System.out.println(d.getName()+"spends："+t+" hours");

      }

}
```