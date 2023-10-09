import java.util.Scanner;

public class WhileGaji02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahKaryawan;
        int jumlahJamLembur;
        double gajiLembur;
        double totalGajiLembur = 0; // Initialize totalGajiLembur to 0
        String jabatan;
        
        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = input.nextInt();
        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ":");
            jabatan = input.next();
            System.out.println("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = input.nextInt();
            i++;
            
            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("Manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan tidak valid");
                i--;
                continue;
            }
            
            totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur: " + totalGajiLembur);
        }
        
        input.close();
    }
}