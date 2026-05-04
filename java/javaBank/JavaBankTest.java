import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JavaBankTest{
    @Test
    public void testThatValidateEmailExist(){
        boolean isValid = JavaBank.emailValidator("kpoms@gmail.com");
        assertTrue(isValid);
    }
    
    @Test
    public void testThatEmailLengthIsGreaterThan8(){
        boolean isGreater = JavaBank.emailValidator("kpoms@gmail.com");
        assertTrue(isGreater);
    }
    
    @Test
    public void testThatEmailLengthIsLesserThan8(){
        boolean isLesser = JavaBank.emailValidator("kpo@ma");
        assertFalse(isLesser);
    }
    
    @Test
    public void testThatEmailHasSpecialCharacter(){
        boolean hasCharacter = JavaBank.emailValidator("kpoms@gmail.com");
        assertTrue(hasCharacter);
    }
    
    @Test
    public void testThatEmailDoesNotHaveSpecialCharacter(){
        boolean notHaveCharacter = JavaBank.emailValidator("kpomsgmail.com");
        assertFalse(notHaveCharacter);
    }
    
    @Test
    public void testThatEmailStartWithSpecialCharacter(){
        boolean startWithCharacter = JavaBank.emailValidator("@kpomsgmail.com");
        assertFalse(startWithCharacter);
    }
    
    @Test
    public void testThatEmailEndsWithSpecialCharacter(){
        boolean endsWithCharacter = JavaBank.emailValidator("kpomsgmail.com@");
        assertFalse(endsWithCharacter);
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
}
