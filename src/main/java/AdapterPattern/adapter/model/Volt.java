package AdapterPattern.adapter.model;

public class Volt {
    private int volts;//one instance variable
    public Volt(int volts){ //constructor
        this.volts=volts;
    }

    public int getVolts() {//getter method
        return volts;
    }

    @Override
    public String toString() {
        return "Volt{" +
                "volts=" + volts +
                '}';
    }
}
