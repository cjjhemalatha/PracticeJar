package jenkinsP;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PracticeJenkinsTest {

	@Test
    public void testInputIsEven(){
        System.out.println("Executing test");
        assertTrue(PracticeJenkins.checkIfInputIsAnEvenNumber(22)); // Assertion
    }

}
