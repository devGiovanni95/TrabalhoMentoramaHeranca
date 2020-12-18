public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, double sacar, double depositar, int diaAniversario /*double taxaDeJuros*/) {
        super(numero, agencia, banco, saldo, sacar, depositar);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = 0;
        if (diaAniversario >= 16) {
            taxaDeJuros = 0.03;
        } else {
            taxaDeJuros = 0.01;
        }
        ;
    }

//    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros) {
//        super(numero, agencia, banco, saldo);
//        this.diaAniversario = diaAniversario;
//        this.taxaDeJuros = taxaDeJuros;
//    }


    @Override
    public double getSaldo() {
        return this.saldo + (this.taxaDeJuros * this.saldo);
    }

    @Override
    public double getSacar() {
        return this.sacar;
    }

    @Override
    public double getDepositar() {
        return this.depositar;
    }

    @Override
    public double getSaldoAtualizado() {
        if (getSacar() <= getSaldo()) {
            return this.getSaldo() + this.depositar - this.getSacar();
        } else {
            return this.getSaldo() + this.depositar;
        }
    }
}

