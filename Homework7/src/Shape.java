public abstract  class Shape implements Drawable {
    protected String color;
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString(){
        return   this.getClass().getSimpleName() + ":" + " color = " + color;
    }
    public abstract double calcArea();
    @Override
    public void draw() {
        System.out.println(this + " -> "+ this.calcArea());
    }
}
