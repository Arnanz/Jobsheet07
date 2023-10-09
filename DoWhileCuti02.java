import java.util.Scanner;

public class DoWhileCuti02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jatahCuti;
        int jumlahHari;
        String konfirmasi;
        
        System.out.print("Jatah cuti: ");
        jatahCuti = input.nextInt();
        
        do {
            System.out.println("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = input.next();
            
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("Jumlah hari: ");
                jumlahHari = input.nextInt();
                
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                }
            }else if(konfirmasi.equalsIgnoreCase("t")) {
                System.out.println("Program selesai");
                break;
            }
        } while (jatahCuti > 0);
        
        input.close();
    }
}