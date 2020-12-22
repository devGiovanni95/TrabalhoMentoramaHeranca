public class ContaSalario extends Conta {
    protected double saque2 = 2;

    public ContaSalario(int numero, int agencia, String banco, double saldo, double sacar, double depositar, double saque2) {
        super(numero, agencia, banco, saldo, sacar, depositar);
        this.saque2 = saque2;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "saque2=" + saque2 +
                ", saldo=" + saldo +
                ", sacar=" + sacar +
                ", depositar=" + depositar +
                ", saldoAtualizado=" + saldoAtualizado +
                ", saldoAtualizado2=" + saldoAtualizado2 +
                '}';
    }

    @Override

    public double getSaldo() {
        return saldo;
    }

    @Override
    public double getSacar() {
        return sacar;
    }

    @Override
    public double getDepositar() {
        return depositar;
    }

    @Override
    public double getSaldoAtualizado() {
        if (getSacar() <= getSaldo()) {
            return this.getSaldo() + this.depositar - this.getSacar();
        } else {
            return this.getSaldo() + this.depositar;
        }
    }

    public double getSaldoAtualizado2() {
        if (getSaque2() <= getSaldoAtualizado()) {
            return this.getSaldoAtualizado() - this.getSaque2();
        } else {
            return this.getSaldoAtualizado();
        }
    }

    public double getSaque2() {
        return saque2;
    }
}
