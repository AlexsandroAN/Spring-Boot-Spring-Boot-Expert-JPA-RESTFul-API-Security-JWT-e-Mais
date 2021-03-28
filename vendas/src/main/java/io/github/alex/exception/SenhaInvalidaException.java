package io.github.alex.exception;

/**
 *
 * @author Alex
 */
public class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException() {
        super("Senha inválida.");
    }

}
