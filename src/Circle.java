public class Circle extends Figure {

    public Circle(String name, String color, double x){
        super(name, color, x);
    }

    @Override
    public void draw() {
        System.out.println("КРУГ");
    }

    @Override
    public double getArea() {
        return Math.PI * (getX() * getX());
    }

    //длина окружности
    public double getCircumference() {
        return Math.PI * 2 * getX();
    }

    @Override
    public String toString() {
        return super.toString() + ", длина окружности: " + getCircumference();
    }
}
