package geco;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    @Test
    public void loginExists() {
        String[] loginsExistants ={"Paul Dupond"};

        LoginService ls = new LoginService(loginsExistants);
        assertTrue("le login est reconnue", ls.loginExists("Paul Dupond"));
    }

    @Test
    public void addLogin() {

        String[] loginsExistants ={"Paul Dupond"};

        LoginService ls = new LoginService(loginsExistants);
        ls.addLogin("Pierre Dupard");
        assertTrue("le login a été ajouté", ls.loginExists("Pierre Dupard"));

    }

    @Test
    public void findAllLoginsStartingWith() {

        String[] loginsExistants ={"Paul Dupond"};

        LoginService ls = new LoginService(loginsExistants);
        //   ls.addLogin("Pierre Dupard");
        assertEquals("Paul Dupond", ls.findAllLoginsStartingWith("Paul").get(0));
    }

    @Test
    public void findAllLogins() {
        String[] loginsExistants ={"Paul Dupond"};
        List<String> lss = new ArrayList<>();
        lss.add("Paul Dupond");
        lss.add("Pierre Dupard");

        LoginService ls = new LoginService(loginsExistants);
        ls.addLogin("Pierre Dupard");
        assertEquals(lss, ls.findAllLogins());
    }
}