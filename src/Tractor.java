public class Tractor extends Car {
    private final String tractorAttachments;
    private final String tractorTrailerEquipment;

    public Tractor (String carBrand, String carModel, String carBody, int carYear, Wheel[] wheels,
                           String tractorAttachments, String tractorTrailerEquipment) {
        super(carBrand, carModel, "tractor", carYear, wheels);
        this.tractorAttachments = tractorAttachments;
        this.tractorTrailerEquipment = tractorTrailerEquipment;
    }

    public String getTractorDescription () {
        return String.format("Марка: %S\nМодель: %S\nГод выпуска: %d\nТип кузова: %S\nРадиус колес передней оси: %d" +
                        "\nШирина колес передней оси: %d\nРадиус колес задней оси: %d\nШирин колес задней оси: %d" +
                        "\nТип навесного оборудования: %S\nТип прицепа: %S",
                carBrand, carModel, carYear, carBody, wheels[0].radiusWheel, wheels[0].widthWheel,wheels[2].radiusWheel,
                wheels[2].widthWheel, tractorAttachments, tractorTrailerEquipment);

    }

}
