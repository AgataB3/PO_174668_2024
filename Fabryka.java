import java.util.ArrayList;
import java.util.Objects;

public class Fabryka {
    private ArrayList<Elf> elfy;
    private double dlGeo;
    private double szGeo;


    public Fabryka(double dlGeo, double szGeo) {
        this.elfy = new ArrayList<>();
        if(dlGeo < -180 || dlGeo > 180) {
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        this.dlGeo = dlGeo;
        if(szGeo < -90 || szGeo > 90) {
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        this.szGeo = szGeo;
    }

    public void dodajPracownika(Elf elf) {
        elfy.add(elf);
    }

    public void usunPracownika(Elf elf) {
        elfy.remove(elf);
    }

    public Elf najstarszyPracownik(){
        Elf najstarszy = elfy.getFirst();
        for(Elf elf : elfy) {
            if(najstarszy.getWiek() < elf.getWiek()) {
                najstarszy = elf;
            }
        }
        return najstarszy;
    }

    @Override
    public String toString() {
        return "Fabryka{" +
                "elfy=" + elfy +
                ", dlGeo=" + dlGeo +
                ", szGeo=" + szGeo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fabryka fabryka)) return false;
        return dlGeo == fabryka.dlGeo && szGeo == fabryka.szGeo && Objects.equals(elfy, fabryka.elfy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elfy, dlGeo, szGeo);
    }

    public ArrayList<Elf> getElfy() {
        return elfy;
    }

    public void setElfy(ArrayList<Elf> elfy) {
        if(elfy == null || elfy.isEmpty()) {
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        this.elfy = elfy;
    }

    public double getDlGeo() {
        return dlGeo;
    }

    public void setDlGeo(double dlGeo) {
        if(dlGeo < -180 || dlGeo > 180) {
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        this.dlGeo = dlGeo;
    }

    public double getSzGeo() {
        return szGeo;
    }

    public void setSzGeo(double szGeo) {
        if(szGeo < -90 || szGeo > 90) {
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        this.szGeo = szGeo;
    }
}
