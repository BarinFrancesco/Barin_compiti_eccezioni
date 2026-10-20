package org.example;

// Eccezione Unchecked perché estende RuntimeException
public class ImportoNonValidoException extends RuntimeException {

    public ImportoNonValidoException(String messaggio) {
        super(messaggio);
    }
}