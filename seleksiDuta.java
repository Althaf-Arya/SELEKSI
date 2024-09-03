import java.util.Scanner;

public class seleksiDuta {
    public static void main(String[] args) {
        String nama,kelas,perilaku;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan nama: ");
        nama = s.nextLine();
        
        System.out.println("Masukkan kelas: ");
        kelas = s.next();
        if(kelas.equalsIgnoreCase("X") || kelas.equalsIgnoreCase("XI")){
            System.out.println("Perilaku siswa:(Baik/Jahat) ");
            perilaku = s.next();
            if(perilaku.equalsIgnoreCase("Baik")){
                System.out.println("Masukkan nilai rata rata: ");
                nilai = s.nextInt();
                if(nilai >=90){
                    System.out.println("Selamat, Orang tua mu pasti bangga ");
                }else{
                    System.out.println("NT bro, nilaimu kek botol yakult");
                }
            }else{
                System.out.println("NT bro, kelakuanmu kek kriminal ");
            }
        }else{
            System.out.println("NT bro, kamu terlalu sepuh");
        }
    }
    
}
