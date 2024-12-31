import java.util.Scanner;

public class AOT {

 public static void main(String ag[]) {
  double are,b,h;
  Scanner s = new Scanner(System.in);   
  System.out.print("Enter values for base:");
  b = s.nextInt();
  System.out.print("Enter value for height:");
  h = s.nextInt();

  are = (1.0/2)*b*h;   
  System.out.println("area of triangle :" + are);
 }
}
