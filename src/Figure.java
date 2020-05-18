public abstract class Figure {

    private String name;
    private String color;
    private double x;
    private double y;

    public Figure(String name, String color, double x){

        this.name = name;
        this.color = color;
        this.x = x;
    }

    public abstract void draw();
    public abstract double getArea();

    public double getX() {
        return x;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Фигура: " + this.name + ", площадь: " + this.getArea() + " кв.ед, цвет: " + this.color;
    }
}
