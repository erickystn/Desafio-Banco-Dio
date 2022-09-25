public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("Conta Poupanca de %s - ag: %d  conta: %d  saldo: %.2f \n",super.cliente.getNome(),
                super.agencia,super.numero, super.saldo);

    }
}
