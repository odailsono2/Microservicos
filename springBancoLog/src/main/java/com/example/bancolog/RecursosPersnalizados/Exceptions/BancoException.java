package com.example.bancolog.RecursosPersnalizados.Exceptions;

public class BancoException extends Exception{
    public BancoException(String message) {
        super(message);
    }

    public BancoException(String message, Throwable cause) {
        super(message, cause);
    }
}
