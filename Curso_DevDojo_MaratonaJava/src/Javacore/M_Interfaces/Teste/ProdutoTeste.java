package Javacore.M_Interfaces.Teste;

import Javacore.M_Interfaces.Produto;

public class ProdutoTeste {
    
    public static void main(String[] args) {
        
        Produto p = new Produto("Notbook", 4, 3000);
        p.calcularImposto();
        p.calcularFrete();
        System.out.println(p);
        
    }

}
