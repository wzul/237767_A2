package FileHandler.Identify;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CommentsTest {
    
    /**
     * Test of findComments method, of class Comments.
     */
    @Test
    public void testFindComments() {
        System.out.println("findComments");
        String[][] fileContent = new String[0][0];
        Comments instance = new Comments();
        instance.findComments(fileContent);
    }

    /**
     * Test of setFixedCommentTitle method, of class Comments.
     */
    @Test
    public void testSetFixedCommentTitle() {
        System.out.println("setFixedCommentTitle");
        String[][] fileContent = new String[0][0];
        Comments instance = new Comments();
        instance.setFixedCommentTitle(fileContent);
    }

    /**
     * Test of checkFixedCommentKeyword method, of class Comments.
     */
    @Test
    public void testCheckFixedCommentKeyword() {
        System.out.println("checkFixedCommentKeyword");
        String sentence = "";
        String search = "";
        Comments instance = new Comments();
        boolean expResult = false;
        boolean result = instance.checkFixedCommentKeyword(sentence, search);
        assertEquals(expResult, result);
    }

    /**
     * Test of grepThisWord method, of class Comments.
     */
    @Test
    public void testGrepThisWord() {
        System.out.println("grepThisWord");
        String sentence = "";
        String search = "";
        Comments instance = new Comments();
        String expResult = "";
        String result = instance.grepThisWord(sentence, search);
        assertEquals(expResult, result);
    }

    /**
     * Test of setVariableCommentTitle method, of class Comments.
     */
    @Test
    public void testSetVariableCommentTitle() {
        System.out.println("setVariableCommentTitle");
        String[][] fileContent = new String[0][0];
        Comments instance = new Comments();
        instance.setVariableCommentTitle(fileContent);
    }
    
}
