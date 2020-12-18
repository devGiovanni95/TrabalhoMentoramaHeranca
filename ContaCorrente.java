public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double sacar, double depositar, double chequeEspecial) {
        super(numero, agencia, banco, saldo, sacar, depositar);
        this.chequeEspecial = chequeEspecial;
    }
//    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
//        super(numero, agencia, banco, saldo, sacar);
//        this.chequeEspecial = chequeEspecial;
//    }


    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                ", saldo=" + saldo +
                ", sacar=" + sacar +
                ", depositar=" + depositar +
                '}';
    }

    @Override
    public double getSaldo() {
        return (this.chequeEspecial + saldo);
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
        if (getSacar() <= getSaldo() ) {
            return this.getSaldo() + this.depositar - this.getSacar();
        }else {
            return this.getSaldo() + this.depositar;
        }
    }
}
