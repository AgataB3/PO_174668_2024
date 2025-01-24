public class Screwdriver extends WorkTool {

    public Screwdriver(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println("Screwdriver used.");
    }
}
