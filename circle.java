
public class circle {
	double radius;
	String colour;
	circle (){
		radius=0.0;
		colour="";
	}
	circle (double radius, String colour){
		this.radius=radius;
		this.colour=colour;
	}
	double getradius(){
		return radius;
	}
	void setradius(double radius) {
		this.radius=radius;
	}
	double getarea() {
		return radius*radius*Math.PI;
	}
	String getcolour() {
		return colour;
	}
	void setcolour(String colour) {
		this.colour=colour;
	}
	double getcircumference() {
		return 2*Math.PI*radius;
	}
}
