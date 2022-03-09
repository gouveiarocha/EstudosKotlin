package Javacore.L_ClassesAbstratas.Teste;

import Javacore.L_ClassesAbstratas.Funcionario;
import Javacore.L_ClassesAbstratas.Gerente;
import Javacore.L_ClassesAbstratas.Vendedor;

public class FuncionarioTeste {
    
    public static void main(String[] args) {
        
        Gerente g = new Gerente("Douglas", "001-1", 2000);
        g.calcularSalario();
        g.imprime();
        System.out.println(g);
        
        Vendedor v = new Vendedor("Marcelo", "002-2", 2000, 3500);
        v.calcularSalario();
        v.imprime();
        System.out.println(v);
        
    }

}
