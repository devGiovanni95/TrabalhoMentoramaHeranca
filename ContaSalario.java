public class ContaSalario extends Conta {

//    public ContaSalario(int numero, int agencia, String banco, double saldo) {
//        super(numero, agencia, banco, saldo);
//    }



    public ContaSalario(int numero, int agencia, String banco, double saldo, double sacar, double depositar) {
        super(numero, agencia, banco, saldo, sacar, depositar);
//        int[] quantidadeSaque = new int[1];
//        for(int i = 0; i < quantidadeSaque.length; i++){
//
//        }
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
