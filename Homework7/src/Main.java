public class Main {
    static Shape[] shapes;
    public static void main(String[] args) {
        shapes=new Shape[]{new Rectangle("black",10.6,6.7),new Rectangle("red",67.6,50.0),
                new Rectangle("blue",45.3,67.0),new Rectangle("brown",20,30),
                new Circle("orange",46.0),new Circle("yellow",50.0),new Circle("grey",30.0),
                new Triangle("purple",40.0,30.0,30.00),new Triangle("pink",20.0,10.0,15.0)};
         printElements();
        System.out.println();
        System.out.println("Sum of areas: "+sumAreaOfShapes());
        System.out.println();
        printArray(sumArea());
   }

    public static void printElements() {
        for (Shape element : shapes) {
            System.out.println(element.toString() + " " + " Area: " + element.calcArea());
        }
    }

    public static double sumAreaOfShapes(){
        double sum=0;
        for(Shape element:shapes){
            sum+=element.calcArea();
        }
        return sum;
    }

    public static double[] sumArea(){
        double sumAreaRectangle=0;
        double sumAreaCircle=0;
        double sumAreaTriangle=0;
        for(Shape element:shapes){
            if(element instanceof Rectangle )
                sumAreaRectangle+=element.calcArea();
            if(element instanceof Circle)
                sumAreaCircle+=element.calcArea();
            if(element instanceof Triangle)
                sumAreaTriangle+=element.calcArea();
        }
       double[] arrayOfSum=new double[]{sumAreaRectangle,sumAreaCircle,sumAreaTriangle};
        return arrayOfSum;
    }

    public static void printArray(double[] arr){
        for(double element: arr){
            System.out.print(element+","+" ");
        }
    }
}
