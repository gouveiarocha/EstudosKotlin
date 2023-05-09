package UdemyCurso.suites;

import UdemyCurso.servicos.CalculadoraTest;
import UdemyCurso.servicos.CalculoValorLocacaoTest;
import UdemyCurso.servicos.LocacaoServiceTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculadoraTest.class,
        CalculoValorLocacaoTest.class,
        LocacaoServiceTest.class
})

public class SuiteExecucao {
    //Remova se puder!
}
