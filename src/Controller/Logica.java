package Controller;

import Model.Car;

import javax.swing.*;
import java.util.List;

public class Logica {

    Car car;


    public void init() {
        int value = Integer.parseInt(JOptionPane.showInputDialog(this.getMenuText()));

        selectMenuItem(value);
    }

    private void selectMenuItem(int value) {
        switch (value){
            case 1:
                registerCar();
               break;
            case 2:
                System.out.println("sisas2");
                break;
        }
    }


    public String getMenuText(){
        return "Bienvenido al Parkin lot \n" +
                "1. Registrar auto \n" +
                "2. Salida auto";
    }

    private void registerCar(){
        String idCar="";
        String color="";

        try {

            idCar=JOptionPane.showInputDialog("Ingrese la placa del vehículo");
            color=JOptionPane.showInputDialog("Ingrese el color del vehículo");

        } catch (NumberFormatException e) {

        }

    }
}
