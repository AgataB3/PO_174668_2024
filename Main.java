public class Main {
    public static void main(String[] args) {
        Elf elf1 = new Elf("Lucek", 90, "Twórca bombek");
        Elf elf2 = new Elf("Marianek", 462, "Twórca zestawów Lego");
        Elf elf3 = new Elf("Janusz", 81, "Sprzątacz");
        Elf elf4 = new Elf("Pacek", 245, "Twórca drewnianych zabawek");
        Elf elf5 = new Elf("Jacek", 121, "Zarządca");

        elf1.przedstawSie();

        Fabryka fabryka1 = new Fabryka(-170, 68);
        fabryka1.dodajPracownika(elf1);
        fabryka1.dodajPracownika(elf2);
        fabryka1.dodajPracownika(elf3);
        fabryka1.dodajPracownika(elf4);
        fabryka1.dodajPracownika(elf5);
        fabryka1.usunPracownika(elf1);
        System.out.println(fabryka1);
        Elf najstarszyElf = fabryka1.najstarszyPracownik();
        najstarszyElf.przedstawSie();

        Renifer renifer1 = new Renifer("Smigacz", 100);
        Renifer renifer2 = new Renifer("Opel", 90);
        Renifer renifer3 = new Renifer("Bambik", 78);
        renifer1.nakarmRenifera();
        System.out.println(renifer1);

        Sanie sanie1 = new Sanie();
        sanie1.dodajRenifera(renifer1);
        sanie1.dodajRenifera(renifer2);
        sanie1.dodajRenifera(renifer3);
        System.out.println(sanie1);
        System.out.println("Suma predkosci: "+sanie1.sumaPredkosci());
        Renifer najwolniejszy = sanie1.najwolniejszyRenifer();
        System.out.println("Najwolniejszy renifer: "+najwolniejszy);
    }
}