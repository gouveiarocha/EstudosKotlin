package Javacore.G_ExercicioAssociacao.Teste;

import Javacore.G_ExercicioAssociacao.Aluno;
import Javacore.G_ExercicioAssociacao.Seminario;

public class TesteSeminario {
    
    public static void main(String[] args) {
        
        Seminario seminario = new Seminario();
        
        Aluno aluno1 = new Aluno("Douglas Gouveia", 28);
        
        aluno1.setSeminario(seminario);
        aluno1.imprimeDados();       
        
    }
    
}
