package org.example;

public class ContoBancario {
    private double saldo;

    public ContoBancario(double saldoIniziale) {
        this.saldo = saldoIniziale;
    }

    public double getSaldo() {
        return saldo;
    }

    // Serve 'throws' perché SaldoInsufficienteException è una Checked Exception
    public void preleva(double importo) throws SaldoInsufficienteException {
        if (importo <= 0) {
            throw new ImportoNonValidoException("L'importo inserito non è valido: " + importo);
        }

        if (importo > saldo) {
            throw new SaldoInsufficienteException(saldo, importo);
        }

        saldo = saldo - importo;
        System.out.println("Prelievo riuscito! Nuovo saldo: " + saldo + "€");
    }
}