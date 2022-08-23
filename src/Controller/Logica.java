package Controller;

import Model.Car;

import javax.swing.*;
import java.util.List;

public class Logica {


    public void init() {
        int value = Integer.parseInt(JOptionPane.showInputDialog(this.getMenuText()));

        selectMenuItem(value);
    }

    private void selectMenuItem(int value) {
        switch (value){
            case 1:
                System.out.println("sisas");
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
}
