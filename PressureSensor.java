public class PressureSensor implements Sensor{
    private double value;
    private String Status;

    public PressureSensor(double value, String status) {
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
        System.out.println("Pressure Sensor Reset");
    }
}
