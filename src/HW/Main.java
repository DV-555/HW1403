package HW;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
                                                                                        //int area;
        rectangle.width = 10;
        rectangle.height = 20;

                                                                                        //area = mybox1.getArea();
        System.out.println("Area of Rectangle is " + rectangle.getArea());


        Square square = new Square();
        square.side = 20;                                                               //int area2;

                                                                                        //area2 =mybox2.side * mybox2.side;
        System.out.println("Area of Square is " + square.getArea());


        Circle circle = new Circle();
        circle.radius = 20;                                                            //double area3;

        System.out.println("Area of Circle is " + circle.getArea());

        /*Area of Rectangle is 200
        Area of Square is 400
        Area of Circle is 1256.0

        */


    }
}