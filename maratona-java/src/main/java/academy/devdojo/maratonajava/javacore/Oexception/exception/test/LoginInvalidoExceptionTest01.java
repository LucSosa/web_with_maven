package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        logar();
    }

    private static void logar() {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuario");
        String usernameDigitado = scanner.nextLine();
        System.out.println("Senha");
        String senhaDigitado = scanner.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado)) {
            try {
                throw new LoginInvalidoException("Usuario ou senha invalidos");
            } catch (LoginInvalidoException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Conectado com sucesso!");
    }
}
