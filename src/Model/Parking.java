package Model;

import java.util.Date;
import java.util.List;

public class Parking {

    private double vlrHour;
    DetallePuesto[] detallePuestos;
    private boolean isAvailable;

    public Parking(double vlrHour) {
        this.vlrHour = vlrHour;
        this.detallePuestos = new DetallePuesto[10];
    }

    public int searchEmptyPosition(int puesto, Car car){
        if (puesto == 10)
            return 2;
        if (this.detallePuestos[puesto] == null){
            this.detallePuestos[puesto] = this.crearDetallePuesto(car);
            return 1;
        }else {
            return searchEmptyPosition(puesto + 1, car);
        }
    }

    private DetallePuesto crearDetallePuesto(Car car) {
        Date hrEntry = new Date();
        return new DetallePuesto(car, hrEntry.getHours(), 0);
    }


    /**
     * Metodo para la salida de un vehiculo
     * */
    public void carOut(int placa) {
    }

    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) { isAvailable = available; }

    public double getVlrHour() {
        return vlrHour;
    }

    public void setVlrHour(double vlrHour) {
        this.vlrHour = vlrHour;
    }
}
