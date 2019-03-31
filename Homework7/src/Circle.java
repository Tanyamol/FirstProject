
public class Circle extends Shape {
  private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "class = " + this.getClass() + ":" + " color = " + color;
    }
    @Override
    public double calcArea(){
        return Math.PI*radius*radius;
    }
}
