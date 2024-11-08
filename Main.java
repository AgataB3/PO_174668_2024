class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int k = -1;
        System.out.println("Zadanie 1: "+dokladnosc(x, y, k));
        int S = 20;
        System.out.println("Zadanie 2: "+najblizszySasiad(S));
        int[] tab = new int[7];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 0;
        tab[3] = 3;
        tab[4] = 5;
        tab[5] = 1;
        tab[6] = 4;
        System.out.println("Zadanie 4: "+podciag(tab));
        int r = 2;
        System.out.println("Zadanie 5: "+podciag(tab, r));
        int n = 1001;
        System.out.println("Zadanie 6: "+czyPalindrom(n));
        int m = 2;
        System.out.println("Zadanie 7: ");
        palindromLiczbowy(m);
    }
    public static boolean dokladnosc(int x, int y, int k){
        int roznica = Math.abs(x - y);
        return roznica <= Math.pow(10, -k);
    }
    public static int najblizszySasiad(int S){
        int x = 0;
        int y;
        int j = S;
        for(int i = S; i > 1; i--){
            if(Math.sqrt(i) == (int)Math.sqrt(i)){
                x = i;
                break;
            }
        }
        while(true){
            if(Math.sqrt(j) == (int)Math.sqrt(j)){
                y = j;
                break;
            }
            j++;
        }
        if(Math.abs(S - x) < Math.abs(S - y)) return (int)Math.sqrt(x);
        else return (int)Math.sqrt(y);
    }
    public static int podciag(int[] tab){
        int dl = 0;
        int dl_max = 0;
        for(int i = 1; i < tab.length; i++){
            if(tab[i] < tab[i-1]) {
                if(dl == 0) dl = 1;
                dl++;
            }
            else{
                if(dl > dl_max){
                    dl_max = dl;
                }
                dl = 0;
            }
        }
        if(dl > dl_max){
            dl_max = dl;
        }
        return dl_max;
    }
    public static int podciag(int[] tab, int r){
        int dl = 0;
        int dl_max = 0;
        for(int i = 1; i < tab.length; i++){
            if(tab[i-1] - r == tab[i]){
                if(dl == 0) dl = 1;
                dl++;
            }
            else{
                if(dl > dl_max){
                    dl_max = dl;
                }
                dl = 0;
            }
        }
        if(dl > dl_max){
            dl_max = dl;
        }
        return dl_max;
    }
    public static boolean czyPalindrom(int n){
        int dl = 0;
        int x = n;
        int y = n;
        int liczba = 0;
        while(x > 0){
            x /= 10;
            dl++;
        }
        while(y > 0){
            liczba += y%10 * (int)Math.pow(10, dl-1);
            y /= 10;
            dl--;
        }
        return liczba == n;
    }
    public static void palindromLiczbowy(int m){
        for(int i = (int)Math.pow(10, m-1); i < Math.pow(10, m); i++){
            for(int j = i; j < Math.pow(10, m); j++){
                if(czyPalindrom(i*j)) {
                    System.out.println(i+" x "+j+" = "+i*j);
                }
            }
        }
    }
}