import java.util.ArrayList;
import java.util.Objects;

public class Sanie {
    private ArrayList<Renifer> renifery;

    public Sanie() {
        this.renifery = new ArrayList<>();
    }

    public void dodajRenifera(Renifer renifer) {
        renifery.add(renifer);
    }

    public int sumaPredkosci(){
        int suma = 0;
        for(Renifer renifer : renifery){
            suma += renifer.getPredkosc();
        }
        return suma;
    }

    public Renifer najwolniejszyRenifer(){
        Renifer najwolniejszy = renifery.getFirst();
        for(Renifer renifer : renifery){
            if(najwolniejszy.getPredkosc() > renifer.getPredkosc()){
                najwolniejszy = renifer;
            }
        }
        return najwolniejszy;
    }

    @Override
    public String toString() {
        return "Sanie{" +
                "renifery=" + renifery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sanie sanie)) return false;
        return Objects.equals(renifery, sanie.renifery);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(renifery);
    }

    public ArrayList<Renifer> getRenifery() {
        return renifery;
    }

    public void setRenifery(ArrayList<Renifer> renifery) {
        if(renifery == null || renifery.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        this.renifery = renifery;
    }
}
