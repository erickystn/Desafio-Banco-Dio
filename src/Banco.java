
import java.util.ArrayList;
import java.util.List;

public class Banco {

private static final String nome = "Pactual";


    private static final List<Conta>  contas = new ArrayList<>();

    public static List<Conta> getContas() {
        return contas;
    }

    public static void imprimirClientes(){
        System.out.printf(" ++++  Lista de Clientes do Banco %s ++++ \n", nome);
        for(Conta conta: contas){
            System.out.printf("Cliente: %s Conta: %d \n",conta.getCliente().getNome(),conta.getNumero());
        }
    }
}
