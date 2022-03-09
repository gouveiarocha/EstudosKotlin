package Javacore.O_Exception.CheckedExceptions;

public class Leitor1 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Fechando Leitor1");
    }

}
