package Javacore.J_Enumeracao.Teste;

import Javacore.J_Enumeracao.Cliente;
import Javacore.J_Enumeracao.TipoCliente;

public class ClienteTeste {
    
    public static void main(String[] args) {
        
        Cliente c = new Cliente("Carlos", TipoCliente.PESSOA_JURIDICA, Cliente.TipoFormaPagamento.DINHEIRO);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(c.toString());
        
    }
    
}
