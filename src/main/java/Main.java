import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        int senhaCorreta = 2022;
        int senha = sc.nextInt();

        while (senha != senhaCorreta) {

    System.out.println("Senha incorreta, tente de novo:");
            
       senha = sc.nextInt(); }

    System.out.println("Acesso Permitido");
            
        sc.close();
    }
}