package Javacore.O_Exception.CustomException;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Usuário ou senha invalidos...");
    }
    
}
