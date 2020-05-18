public class Square extends Figure {

    public Square(String name, String color, double x){
        super(name, color, x);
    }

    @Override
    public void draw() {
        System.out.println("КВАДРАТ");

    }

    @Override
    public double getArea() {
        return (getX() * 2);
    }

    public double getLengthOfSide() {
        return getX();
    }

    @Override
    public String toString() {
        return super.toString() + ", длина стороны: " + getLengthOfSide();
    }
}
