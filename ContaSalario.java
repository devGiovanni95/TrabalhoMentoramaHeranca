public class ContaSalario extends Conta {
    private int Saques = 2;

    public ContaSalario(int numero, int agencia, String banco, double saldo, double sacar, double depositar) {
        super(numero, agencia, banco, saldo, sacar, depositar);
        this.sacar = this.Saques;
    }

    public void Comparador{
    if (getSaldo() >= getSacar() || getSacar() >= 2 ){
        System.out.println("Saldo da conta atual depois do saque R$ " + (getSaldo() - getSacar()));
    }else {
        System.out.println("Valor de saque indisponivel por falta de saldo na conta. Valor de saque disponivel R$ "+ getSaldo());
    }
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
        return  (this.getSaldo() + this.depositar - this.getSacar());
    }

}
