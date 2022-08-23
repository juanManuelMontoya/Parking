package Model;

public class DetallePuesto {

    private Car car;
    private int hrEntry, hrExit;

    public DetallePuesto(Car car, int hrEntry, int hrExit) {
        this.car = car;
        this.hrEntry = hrEntry;
        this.hrExit = hrExit;
    }

    public Car getCar() {
        return car;
    }

    public int getHrEntry() {
        return hrEntry;
    }

    public int getHrExit() {
        return hrExit;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setHrEntry(int hrEntry) {
        this.hrEntry = hrEntry;
    }

    public void setHrExit(int hrExit) {
        this.hrExit = hrExit;
    }

    @Override
    public String toString() {
        return "DetallePuesto{" +
                "car=" + car +
                ", hrEntry=" + hrEntry +
                ", hrExit=" + hrExit +
                '}';
    }
}



