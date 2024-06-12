import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        boolean drivingUnderAge = false;
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        
        sc.close();
        
        if (idade >= 18)
        {
        drivingUnderAge = true;
         System.out.println("tem idade para dirigir");
        }
        else
        {
            System.out.println("não tem idade para dirigir");
        }
    }
}
