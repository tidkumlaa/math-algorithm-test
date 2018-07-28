package test.tidkumlaa;

//import org.junit.platform.runner.JUnitPlatform;
//import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import test.tidkumlaa.math.MathFactorial;
import test.tidkumlaa.math.Mathgcd;
import test.tidkumlaa.math.Mathlcm;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
@RunWith(JUnitPlatform.class)

@SelectClasses({
	MathFactorial.class,
	Mathgcd.class,
	Mathlcm.class
})
*/
@RunWith(Suite.class)

@Suite.SuiteClasses({
	MathFactorial.class,
	Mathgcd.class,
	Mathlcm.class
})


public class UnitTestSuite {
	
}
