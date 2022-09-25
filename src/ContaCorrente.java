public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("Conta Corrente de %s - ag: %d  conta: %d  saldo: %.2f \n",super.cliente.getNome(),
                super.agencia,super.numero, super.saldo);
    }
}
