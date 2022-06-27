import java.util.Scanner;
public class test_circle {

	public static void main(String[] args) {
		circle c1=new circle();
		circle c2=new circle(10.2,"Purple");
		circle c3=new circle(5.5,"Blue");
		System.out.println("Enter the Radius");
		Scanner input=new Scanner(System.in);
		double r = input.nextDouble();
		System.out.println("Enter the colour for C1");
		String c1colour = input.nextLine();
		c1.setradius(r);
		c1.setcolour(c1colour);
		System.out.println("Radius of C1:"+c1.getradius());
		System.out.println("Radius of C2:"+c2.getradius());
		System.out.println("Colour of C1:"+c1.getcolour());
		System.out.println("Area of C1:"+c1.getarea());
		System.out.println("Area of C2:"+c2.getarea());
		System.out.println("Circumference of C1:"+c1.getcircumference());
		System.out.println("Circumference of C2:"+c2.getcircumference());
	}

}
