import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz :");
        int n = klavye.nextInt();


        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=2
                    *i-1;j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
