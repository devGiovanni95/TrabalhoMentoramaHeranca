
public abstract class Conta {
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;/* private so e disponivel dentro da propria conta*/
    protected double sacar;
    protected double depositar;
    protected  double saldoAtualizado;


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
    /* como o get saldo sera uma classe abstrata por ter uma funcao
     e mostrar um valor especifico
    em cada tipo de conta ele se torna uma classe abtrata
    sendo assim ele nao podera retornar nada

    {
        return saldo;
    }*/

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

    public void setSaldoAtualizado(double saldoAtualizado) {
        this.saldoAtualizado = saldoAtualizado;
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
