package Model;

public class Car {

    private String idCar, color;

    public Car(String idCar, String color) {
        this.idCar = idCar;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idCar='" + idCar + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
