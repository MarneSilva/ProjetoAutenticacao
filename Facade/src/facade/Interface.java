package facade;

/**
 *
 * @author Pichau
 */
public class Interface {
    Process mainProcess = new Process();
    public void autenticacao(String username, int password) {
        mainProcess.usuario = username;
        mainProcess.senha = password;
        mainProcess.credentialsConfirm();
        if (mainProcess.credentials == false) {
            System.out.println("Processo encerrado. Credenciais nao confirmadas pelo usuario.");
        } else {
            if (!mainProcess.checkForPasswordSecurity()) {
                System.out.println("Processo encerrado.");
            } else {
                if (!mainProcess.checkForName())
                    System.out.println("Processo encerrado.");
            }
        }
    }
}
