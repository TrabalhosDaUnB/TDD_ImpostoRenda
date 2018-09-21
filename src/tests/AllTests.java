package tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CadastroDeducaoTeste.class, CadastroRendimentoTeste.class, CadastroUsuarioTeste.class })
public class AllTests {

}


//Exemplo usando categoria
//@RunWith(Categories.class)
//@IncludeCategory(TesteDeValor.class)
//@SuiteClasses({ CadastroDeducaoTeste.class, CadastroRendimentoTeste.class, CadastroUsuarioTeste.class })
//public class TesteDeValor.class{}


//@RunWith(Categories.class)
//@IncludeCategory(SlowTests.class)
//@SuiteClasses( { A.class, B.class }) // Note that Categories is a kind of Suite
//public class SlowTestSuite {
//  // Will run A.b and B.c, but not A.a
//}
//
//@RunWith(Categories.class)
//@IncludeCategory(SlowTests.class)
//@ExcludeCategory(FastTests.class)
//@SuiteClasses( { A.class, B.class }) // Note that Categories is a kind of Suite
//public class SlowTestSuite {
//  // Will run A.b, but not A.a or B.c
//}