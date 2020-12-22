
public abstract class Conta {
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;
    protected double sacar;
    protected double depositar;
    protected double saldoAtualizado;
    protected double saldoAtualizado2;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public abstract double getSaldo();


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract double getSacar();

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public abstract double getDepositar();

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public abstract double getSaldoAtualizado();

    public abstract double getSaldoAtualizado2();


    public void setSaldoAtualizado(double saldoAtualizado) {
        this.saldoAtualizado = saldoAtualizado;
    }

    public void setSaldoAtualizado2(double saldoAtualizado2) {
        this.saldoAtualizado2 = saldoAtualizado2;
    }

    public Conta(int numero, int agencia, String banco, double saldo, double sacar, double depositar) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
        this.sacar = sacar;
        this.depositar = depositar;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", banco='" + banco + '\'' +
                ", saldo=" + saldo +
                ", sacar=" + sacar +
                ", depositar=" + depositar +
                '}';
    }
}
