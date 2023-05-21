package facade;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Pichau
 */
public class Process {
    String usuario;
    int senha, intLimit;
    boolean credentials;
    
    public void credentialsConfirm() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("\nOla, seja bem vindo ao sistema de autenticacao de usuario.\nConfirme seus dados. [Y] or [N]");
        System.out.println("Usuario: " + this.usuario + " Senha: " + this.senha);
        String response = scanner1.nextLine();
        if (response.equals("Y")) {
            System.out.println("Confirmado.");
            this.credentials = true;
        }
        if (response.equals("N")) {
            System.out.println("Negado.");
            this.credentials = false;
        }
        while (!response.equals("Y") && !response.equals("N")) {
            System.out.println("Erro na leitura. Tente novamente.");
            response = scanner1.nextLine();
            if (response.equals("Y") || response.equals("y")) {
                System.out.println("Confirmado.");
                this.credentials = true;
                break;
            }
            if (response.equals("N") || response.equals("n")) {
                System.out.println("Negado.");
                this.credentials = false;
                break;
            }
        }
    }
    
    public boolean checkForPasswordSecurity() {
        this.intLimit = (usuario.length() + 3);
        int mod = this.senha % this.intLimit;
        if (mod % 2 == 0) {
            System.out.println("Sua senha esta incorreta.");
            return false;
        } 
        System.out.println("Senha autenticada.");
        return true;
    }
    
    public boolean checkForName() {
        Random random1 = new Random();
        int randomNumber = random1.nextInt(30) + 5;
        char stringChar = usuario.charAt(4);
        System.out.println("Seu numero e: " + randomNumber);
        if (randomNumber <= 10 || randomNumber >= 25 && usuario.startsWith("Wa")) {
            System.out.println("Falha na autenticacao do seu usuario.");
            return false;
        } else {
            if (usuario.endsWith("x") && randomNumber % 2 == 0) {
                System.out.println("Falha na autenticacao do seu usuario.");
                return false;
            }
            if (usuario.contains("uvv") && randomNumber % 3 == 0) {
                System.out.println("Falha na autenticacao do seu usuario.");
                return false;
            }
            if (stringChar == 'r' || stringChar == 'i') {
                System.out.println("Falha na autenticacao do seu usuario.");
                return false;
            }
        }
        System.out.println("Usuario autenticado.");
        return true;
    }
}
