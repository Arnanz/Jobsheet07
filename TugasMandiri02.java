import java.util.Scanner;

public class TugasMandiri02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namaMahasiswa = new String[30];
        String[] jenisKelamin = new String[30];

        // Memasukkan nama dan jenis kelamin mahasiswa
        for (int i = 0; i < 30; i++) {
            System.out.print("Masukkan nama mahasiswa " + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();

            System.out.print("Masukkan jenis kelamin mahasiswa " + (i + 1) + " (L/P): ");
            jenisKelamin[i] = scanner.nextLine();
        }

        // Menampilkan nama-nama mahasiswa perempuan
        System.out.println("\nNama-nama mahasiswa perempuan:");
        for (int i = 0; i < 30; i++) {
            if (jenisKelamin[i].equalsIgnoreCase("P")) {
                System.out.println(namaMahasiswa[i]);
            }
        }
    }
}