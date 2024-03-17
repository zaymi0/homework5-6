import java.util.Scanner;

public final class Transport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип транспортного средства");
        String userTransport = scanner.nextLine();

        int chooseMethod = switch (userTransport) {
            case "car" -> 1;
            case "tractor" -> 2;
            default -> {
                System.out.println("ошибка");
                yield 0;
            }
        };
        if (chooseMethod == 1) {
            Car();
        } else if (chooseMethod == 2) {
            Tractor();
        }
    }

    public static void Car() {
        Wheel wheel = new Wheel(17, 225);
        Car honda = new Car("Honda", "Civic", "Coupe", 2019, wheel, 4);
        System.out.println(honda.getCarDescription());
    }
    public static void Tractor() {
        Scanner scanner = new Scanner(System.in);
        Wheel wheel = new Wheel(0,0);
        Wheel[] wheels = new Wheel[4];
        System.out.println("Введите радиус колес передней оси");
        wheel.radiusWheel = scanner.nextInt();
        System.out.println("Введите ширину колес передней оси");
        wheel.widthWheel = scanner.nextInt();

        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = wheel;
            boolean sorted = false;
            while (i == 1 && !sorted) {
                System.out.println("Введите радиус колес задней оси");
                wheel.radiusWheel = scanner.nextInt();
                System.out.println("Введите ширину колес задней оси");
                wheel.widthWheel = scanner.nextInt();
                sorted = true;
            }

        }
        Tractor Mtz = new Tractor("MTZ", "Belarus","tractor",1999,
                wheels,"Tractor bucket" , "-");
        System.out.println(Mtz.getTractorDescription());
    }
}