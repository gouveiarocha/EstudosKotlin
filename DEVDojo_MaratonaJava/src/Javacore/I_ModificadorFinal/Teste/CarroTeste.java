package Javacore.I_ModificadorFinal.Teste;

import Javacore.I_ModificadorFinal.Carro;

public class CarroTeste {
    
    public static void main(String[] args) {
        
        Carro c = new Carro();
        //c.VELOCIDADE_MAXIMA = 500;
        c.getComprador().setNome("ALTAIR");
        System.out.println(c.getComprador());
        
    }
    
}
