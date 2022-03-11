package br.edu.ifpb.core.domain;


public class CPF {

    // 11122233344
    private static final int TAMANHOCPF = 11;
    private String numeroCpf;

    public CPF() {
    }

    public CPF(String numero) {
        this.numeroCpf = numero;
    }

    public boolean valido() {
        return this.numeroCpf.length() == TAMANHOCPF;
    }

    // 111.222.333-44
    public String formatado() {
        return String.format(
                "%s.%s.%s-%s",
                this.numeroCpf.substring(0,3), // 111222
                this.numeroCpf.substring(3,6),
                this.numeroCpf.substring(6,9),
                this.numeroCpf.substring(9,11)
        );
    }

    @Override
    public String toString() {
        return formatado();
    }

    public String valor() {
        return this.numeroCpf;
    }
}