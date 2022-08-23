package Model;

import javax.swing.*;
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
     * Metodo para el registro del carro en detallePuesto
     * @param idCar
     * @param color
     */
    public void registerCar(String idCar,String color){

        Car car = null;
        car = new Car(idCar,color);
        if (searchEmptyPosition(0,car)==1){
            JOptionPane.showMessageDialog(null,"Se registro exitoso");
        }else{
            JOptionPane.showMessageDialog(null,"El parqueadero esta lleno");
        }

       for (int i=0;i<detallePuestos.length;i++){
           System.out.println(detallePuestos[i].toString());
       }

    }

    /**
     * Metodo para la salida de un vehiculo
     * */
    public int carOut(String placa, int position) {
        if (compareCarsID(placa, this.detallePuestos[position].getCar())){
            this.detallePuestos[position] = null;
            return 1;
        }else{
            return carOut(placa, position + 1);
        }
    }

    /**
     * Metodo para comparar una placa ingresada y las almacenadas en el array
     * @param placa
     * @param car
     * @return
     */
    private Boolean compareCarsID(String placa, Car car){
        if (car.getIdCar().equalsIgnoreCase(placa))
            return true;

        return false;
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
