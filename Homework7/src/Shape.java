public class Shape {
    String color;
    public Shape(String color) {
        this.color = color;
    }
    public String toString(){
        return "class = "+this.getClass()+":"+" color = "+color;
    }
    public double calcArea(){
        return 0.0;
    }
}
