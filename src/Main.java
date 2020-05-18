import java.util.Random;

public class Main {

    public static Object[] fill(int n){

        Object[] array = new Object[n];
        Object obj = null;
        Random random = new Random();
        for (int i = 0; i < n; i++){
            int randomNumber = random.nextInt(4);
            switch (randomNumber){
                case 0:
                    obj = new Square("Квадрат","синий", 2);
                    break;
                case 1:
                    obj = new Triangle("Треугольник", "красный", 56,34);
                    break;
                case 2:
                    obj = new Circle("Круг", "зеленый", 1);
                    break;
                case 3:
                    obj = new Trapeze("Трапеция", ", желтый", 8, 10, 6);
                    break;
            }
            array[i] = obj;
        }
        return array;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int numberRandom = random.nextInt(10);
        for(Object o:fill(numberRandom)){
            System.out.println(o.toString());
        }


    }
}
