public class Main {

    public static void main(String[] args){

        Cliente pedro = new Cliente();
        pedro.setNome("Pedro Paulo");

        Conta cc = new ContaCorrente(pedro);
        Banco.getContas().add(cc);
        Conta poupanca = new ContaPoupanca(pedro);
        Banco.getContas().add(poupanca);

        cc.depositar(100);
        cc.transferir(40, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Banco.imprimirClientes();


    }
}
