public class Triangle extends Figure {

    public double y;

    public Triangle(String name, String color, double x, double y){
        super(name, color, x);
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("ТРЕУГОЛЬНИК");

    }

    @Override
    public double getArea() {
        return ((getX() * y) / 2);
    }

    public double getGipotenuza(){
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(y, 2));
    }

    @Override
    public String toString() {
        return super.toString() + ", гипотенуза: " + getGipotenuza();
    }
}
