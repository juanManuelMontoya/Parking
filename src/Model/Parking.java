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

    /**
     * Metodo para buscar un espacio vacio en el array
     * @param puesto
     * @param car
     * @return
     */
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

    /**
     * Metodo para crear un objeto de tipo detallePuesto
     * @param car
     * @return
     */
    private DetallePuesto crearDetallePuesto(Car car) {
        Date hrEntry = new Date();
        return new DetallePuesto(car, hrEntry.getHours(), 0);
    }

    /**
     * Metodo para el registro del carro en detallePuesto
     * @param idCar
     * @param color
     */
    public int registerCar(String idCar,String color){

        Car car = null;
        car = new Car(idCar,color);
        if (searchEmptyPosition(0,car)==1) {
            JOptionPane.showMessageDialog(null, "Se registro exitoso");

            /*for (int i = 0; i < detallePuestos.length; i++) {
                System.out.println(detallePuestos[i].toString());
            }*/
            return 1;
        }
        JOptionPane.showMessageDialog(null,"El parqueadero esta lleno");
        return 0;

    }

    /**
     * Metodo para la salida de un vehiculo
     * */
    public int carOut(String placa, int position) {
        if (position == 10)
            return 2;
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

    /**
     * Metodo para imprimir la lista de autos dentro del parqueadero
     * @return
     */
    public int listOfCars() {
        try {
            for (int i = 0; i < this.detallePuestos.length; i++) {
                if (this.detallePuestos[i] != null)
                    System.out.println(getDetalleListaCarro(i + 1,this.detallePuestos[i].getCar()));
            }
            return 1;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    /**
     * Metodo Para obtener el texto de la lista de vehiculos
     * @param index
     * @param carro
     * @return
     */
    private String getDetalleListaCarro(int index,Car carro) {
        return "Puesto " + index + " : " + carro.getIdCar() + " - " + carro.getColor();
    }
}
