abstract public class WorkTool {
    private String name;
    private int productionYear;

    public WorkTool(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    abstract public void use();
}
