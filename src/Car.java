public class Car {
    String carBrand; //= "Honda";
    String carModel; //= "Civic";
    String carBody; //= "Coupe";
    int carYear; //= 2019;
    Wheel[] wheels;


    public Car (String carBrand, String carModel, String carBody, int carYear, Wheel[] wheels) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carBody = carBody;
        this.carYear = carYear;
        this.wheels = wheels;
    }

    public Car (String carBrand, String carModel, String carBody, int carYear, Wheel wheel, int numberOfWheels ) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carBody = carBody;
        this.carYear = carYear;
        this.wheels = new Wheel[numberOfWheels];
        for (int i = 0; i < numberOfWheels; i++) {
            wheels[i] = wheel;

        }
    }

    public String getCarDescription () {
        return String.format("Марка: %S\nМодель: %S\nГод выпуска: %d\nТип кузова: %S\nКоличество колес: %d" +
                        "\nРадиус колеса: %d\nШирина колеса: %d", carBrand, carModel, carYear, carBody, wheels.length,
                wheels[0].radiusWheel, wheels[0].widthWheel);
    }
}