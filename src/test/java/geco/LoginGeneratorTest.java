package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginGenerator aLoginGenerator;

    @Before
    public void setUp()throws Exception{
        String[] start = new String[]{"JROL", "BPER", "CGUR", "JDUP", "JARAL", "JARAL1"};
        aLoginGenerator = new LoginGenerator((new LoginService(start)));
    }

    @Test
    public void generateLoginForNomAndPrenom() throws Exception{
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Durand", "Paul");
        Assert.assertEquals("PDUR", login);
    }

    @Test
    public void generateLoginForJRAL2() throws Exception{
        String login1 = aLoginGenerator.generateLoginForNomAndPrenom("Ralling", "John");
        String login2 = aLoginGenerator.generateLoginForNomAndPrenom("Ralling", "John");
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Ralling", "John");

        Assert.assertEquals("JRAL2", login);
    }


}