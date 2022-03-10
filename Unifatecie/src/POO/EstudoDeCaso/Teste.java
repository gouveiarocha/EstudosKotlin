package POO.EstudoDeCaso;

import POO.EstudoDeCaso.model.ContaCorrente;

public class Teste {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente("Douglas Gouveia", 555611, 0055);

        contaCorrente.depositar(1555.22); //deposito ok
        contaCorrente.depositar(100.24); //deposito ok

        contaCorrente.sacar(10000.10); //erro ao sacar

        //simulando saque utilizando o retorno proposto
        double valor = 8000.15;
        if (contaCorrente.sacar(valor) == 1){
            //sucesso ao sacar
        } else if (contaCorrente.sacar(valor) == 0){
            //erro ao sacara
        }

        contaCorrente.sacar(1000); //sacar ok

        contaCorrente.imprimir();

    }

}
