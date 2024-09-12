import java.util.Scanner;
public class CarTester{
    public static Car addCar(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter the car's name: ");
        String name = reader.nextLine();

        System.out.println("Please enter the car's miles: ");
        int miles = reader.nextInt();

        System.out.println("Please enter the car's gallons: ");
        double gallons = reader.nextDouble();

        return new Car(name, miles, gallons);
    }
    public static void main(String[] args){
        System.out.println(addCar().toString());
        System.out.println(addCar().toString());
    }
}
