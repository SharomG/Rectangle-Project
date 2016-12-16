public class Rectangle {
	double length;
	double width;
	
public double calculateArea(){
	return length * width;
}
public double calculatePerimeter(){
	return 2 * length + 2 * width;
}
public static void main(String[]args){
 Rectangle square = new Rectangle();
 square.length = 6.5;
 square.width = 6.5;
 System.out.println(square.calculateArea());
 System.out.println(square.calculatePerimeter());
}




}
