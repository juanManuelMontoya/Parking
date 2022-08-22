package Model;

public class Parking {

    private String idCar;
    private int hrEntry, hrExit;
    private double vlrHour;

    public Parking(String idCar, int hrEntry, int hrExit, double vlrHour) {
        this.idCar = idCar;
        this.hrEntry = hrEntry;
        this.hrExit = hrExit;
        this.vlrHour = vlrHour;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "idCar='" + idCar + '\'' +
                ", hrEntry=" + hrEntry +
                ", hrExit=" + hrExit +
                ", vlrHour=" + vlrHour +
                '}';
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public int getHrEntry() {
        return hrEntry;
    }

    public void setHrEntry(int hrEntry) {
        this.hrEntry = hrEntry;
    }

    public int getHrExit() {
        return hrExit;
    }

    public void setHrExit(int hrExit) {
        this.hrExit = hrExit;
    }

    public double getVlrHour() {
        return vlrHour;
    }

    public void setVlrHour(double vlrHour) {
        this.vlrHour = vlrHour;
    }
}
