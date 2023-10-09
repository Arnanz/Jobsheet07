import java.util.Scanner;

public class WhileKelipatan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kelipatan, jumlah, counter, i;
        jumlah = 0;
        counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = sc.nextInt();

        i = 1; // Initialize i with 1

        // while loop
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++; // Increment i by 1
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
    }
}