public class Rectangle extends Shape {
   private double width;
   private double height;
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString(){
        return "class = " + this.getClass() + ":" + " color = " + color;
    }
    @Override
    public double calcArea(){
        return width*height;
    }
}
