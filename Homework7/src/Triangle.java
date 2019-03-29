public class Triangle extends Shape {
    double a;
    double b;
    double c;
    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String toString(){
        return "class = "+this.getClass()+":"+" color = "+color;
    }
    @Override
    public double calcArea(){
        double p=(a+b+c)/2;
        return Math.sqrt(p*((p-a)*(p-b)*(p-c)));
    }
}
