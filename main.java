package testCricle;

public class main {
    public static void main(String[] args) {
        System.out.println("Circle 1");
        testCircle circle =new testCircle();
        circle.setRadius(5);
        System.out.println("color : "+ circle.getColor());
        System.out.println("R = "+ circle.getRadius());
        System.out.println("Area = "+ circle.getArea());
        System.out.println("Circle 2");
        testCircle circle1=new testCircle(5);
        System.out.println("Area 2 = "+ circle1.getArea());
    }
}
