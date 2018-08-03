package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import math.AdditionTest;
import math.DivisionTest;
import math.MultiplicationTest;
import math.SubtractionTest;		

@RunWith(Suite.class)				
@Suite.SuiteClasses({				
    AdditionTest.class,			
    SubtractionTest.class,
    MultiplicationTest.class,
    DivisionTest.class
})		

public class TestRunner {		
// This class remains empty,it is used only as a holder for the above annotations		
}
