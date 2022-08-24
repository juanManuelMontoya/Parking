package Controller;

import Model.Parking;
import javax.swing.*;

public class Logica {

    Parking parking;
    public void init() {
        parking = new Parking(2000);
        int value = 1;
        while (value != 4 ){
            try {
                value = Integer.parseInt(JOptionPane.showInputDialog(this.getMenuText()));
            }catch (Exception e){
                System.out.println("No puedes ingresar ese caracter \nError:"+e.getMessage());
                value = 6;
            }
            value = selectMenuItem(value);
        }

    }

    private int selectMenuItem(int value) {
        int newValue = 0;
        switch (value){
            case 1:
                String  idplaca = this.getCarAtributes("Ingrese la placa del auto que desea registrar");
                String  color = this.getCarAtributes("Ingrese el color del auto que desea registrar");

                newValue = parking.registerCar(idplaca,color);
                break;
            case 2:
                String placa = this.getCarAtributes("ingrese la placa del auto que va a salir");
                newValue = parking.carOut(placa,0);
                break;
            case 3:
                newValue = parking.listOfCars();
                break;
            case 4:
                newValue = 4;
                break;
        }
        return newValue;
    }


    /**
     * Metodo para obtener Texto del menu
     * @return
     */
    public String getMenuText(){
        return "Bienvenido al Parkin lot \n" +
                "1. Registrar auto \n" +
                "2. Salida auto \n" +
                "3. Lista de autos \n" +
                "4. Salir";
    }


    public String getCarAtributes(String title){
        String val = null;
        do{
            val = JOptionPane.showInputDialog(title);
        }while (val == null || val == "");
        return val;
    }
}
