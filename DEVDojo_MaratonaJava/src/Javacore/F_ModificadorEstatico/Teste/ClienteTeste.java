package Javacore.F_ModificadorEstatico.Teste;

import Javacore.F_ModificadorEstatico.Cliente;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente c = new Cliente();
        System.out.println("Exibindo a quantidade de parcelas possiveis: ");
        for (int parcela : c.getParcelas()) {
            System.out.print(parcela + " ");
        }

    }

}
