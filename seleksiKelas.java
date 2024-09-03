import java.util.Scanner;

public class seleksiKelas {
    public static void main(String[] args) {
        int pilihan;
        String kelas=null;

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan pilihan kelas: ");
        System.out.println("1. X RPL 1\n2. X RPL 2\n3. X RPL 3\n4. X RPL 4\n5. X RPL 5\n6. X RPL 6");
        pilihan = in.nextInt();

        switch(pilihan){
            case 1:
            kelas = "XRPL1";
            break;
            case 2:
            kelas = "XRPL2";
            break;
            case 3:
            kelas = "XRPL3";
            break;
            case 4:
            kelas = "XRPL4";
            break;
            case 5:
            kelas = "XRPL5";
            break;
            case 6:
            kelas = "XRPL6";
            break;
        }

        System.out.println("Kelas "+kelas);
    }
    
}
