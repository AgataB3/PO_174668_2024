public class TemperatureSensor implements Sensor{
    private double value;
    private String Status;

    public TemperatureSensor(double value, String status) {
        this.value = value;
        Status = status;
    }

    @Override
    public double readValue() {
        return value;
    }

    @Override
    public String getStatus() {
        return Status;
    }

    @Override
    public void reset() {
        System.out.println("Temperature Sensor Reset");
    }
}
