import java.util.Objects;

public class Renifer {
    private String imie;
    private int predkosc;

    public Renifer(String imie, int predkosc) {
        this.imie = imie;
        this.predkosc = predkosc;
    }

    public void nakarmRenifera(){
        predkosc += 5;
    }

    @Override
    public String toString() {
        return "Renifer{" +
                "imie='" + imie + '\'' +
                ", predkosc=" + predkosc +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Renifer renifer)) return false;
        return predkosc == renifer.predkosc && Objects.equals(imie, renifer.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, predkosc);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie == null || imie.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        this.imie = imie;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        if(predkosc < 0){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        this.predkosc = predkosc;
    }
}
