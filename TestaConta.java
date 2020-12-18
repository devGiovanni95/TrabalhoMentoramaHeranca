public class TestaConta {
    public static void main(String[] args) {
      /*  Conta c1 = new Conta(1,1,"Banco Inter ", 10.00);
        System.out.println(c1);
*/

        ContaCorrente cc1 = new ContaCorrente(22,1,"Banco Inter", 100.00,50.00,60.00, 1000.00);
        System.out.println(cc1);

        System.out.println("O saldo da conta corrente é R$ " + cc1.getSaldo());
        if (cc1.getSaldo() >= cc1.getSacar()){
            System.out.println("Saldo da conta atual depois do saque R$ " + (cc1.getSaldo() - cc1.getSacar()));
        }else {
            System.out.println("Valor de saque indisponivel por falta de saldo na conta. Valor de saque disponivel R$ "+ cc1.getSaldo());
        }

        if (cc1.getDepositar() <= 0){
            System.out.println("Valor para ser depositado indisponivel ");
        }else {
            System.out.println("Deposito efetuado com sucesso. Seu saldo após deposito R$ "+ (cc1.getSaldo() + cc1.depositar));
        }

        System.out.println("Saldo atualizado é de R$ " + cc1.getSaldoAtualizado());


        ContaPoupanca p1 = new ContaPoupanca(33,3, "Banco Inter", 10.00, 50,20,15);
        System.out.println("O saldo da conta poupança é de R$ " + p1.getSaldo() + " atualizado com taxa de juros ");

        if (p1.getSaldo() >= p1.getSacar()){
            System.out.println("Saldo da conta atual depois do saque R$ " + (p1.getSaldo() - p1.getSacar()));
        }else {
            System.out.println("Valor de saque indisponivel por falta de saldo na conta. Valor de saque disponivel R$ "+ p1.getSaldo());
        }

        if (p1.getDepositar() <= 0){
            System.out.println("Valor para ser depositado indisponivel ");
        }else {
            System.out.println("Deposito efetuado com sucesso. Seu saldo após deposito R$ "+ (p1.getSaldo() + p1.depositar));
        }
       // System.out.println("Deposito efetuado com sucesso. Seu saldo após deposito R$ "+ (p1.getSaldo() + p1.depositar));

        System.out.println("Saldo atualizado é de R$ " + p1.getSaldoAtualizado());



    ContaSalario cs1 = new ContaSalario(33,3, "Banco Inter", 10.00, 50,20);
        System.out.println("O saldo da conta poupança é de R$ " + cs1.getSaldo());

                if (cs1.getSaldo() >= cs1.getSacar()){
                System.out.println("Saldo da conta atual depois do saque R$ " + (cs1.getSaldo() - cs1.getSacar()));
                }else {
                System.out.println("Valor de saque indisponivel por falta de saldo na conta. Valor de saque disponivel R$ "+ p1.getSaldo());
                }

                if (cs1.getDepositar() <= 0){
                System.out.println("Valor para ser depositado indisponivel ");
                }else {
                System.out.println("Deposito efetuado com sucesso. Seu saldo após deposito R$ "+ (cs1.getSaldo() + cs1.depositar));
                }
                // System.out.println("Deposito efetuado com sucesso. Seu saldo após deposito R$ "+ (p1.getSaldo() + p1.depositar));

                System.out.println("Saldo atualizado é de R$ " + p1.getSaldoAtualizado());
                }
}



