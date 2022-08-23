package Model;

import java.util.Date;
import java.util.List;

public class Parking {

    private double vlrHour;
    DetallePuesto[] detallePuestos;

    public Parking(double vlrHour) {
        this.vlrHour = vlrHour;
        this.detallePuestos = new DetallePuesto[10];
    }

    public int searchEmptyPosition(int puesto, Car car){
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

    public double getVlrHour() {
        return vlrHour;
    }

    public void setVlrHour(double vlrHour) {
        this.vlrHour = vlrHour;
    }
}
