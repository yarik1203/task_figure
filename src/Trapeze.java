public class Trapeze extends Figure {

    private double y;
    private double z;

    public Trapeze(String name, String color, double x, double y, double z){
        super(name, color, x);
        this.y = y;
        this.z = z;
    }

    @Override
    public void draw() {
        System.out.println("ТРАПЕЦИЯ");
    }

    @Override
    public double getArea() {
        return (((getX() + y)/2) * z);
    }
}
