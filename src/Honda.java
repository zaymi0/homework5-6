public final class Honda {
    public static void main(String[] args) {
        Wheel wheel = new Wheel(17, 225);
        Car honda = new Car("Honda", "Civic", "Coupe", 2019, wheel,4 );

        System.out.println(honda.getCarDescription());
    }
}
