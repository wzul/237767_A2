package FileHandler.Identify;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JavaKeywordsTest {
    
    /**
     * Test of findKeywords method, of class JavaKeywords.
     */
    @Test
    public void testFindKeywords() {
        System.out.println("findKeywords");
        String[][] fileContent = new String[0][0];
        JavaKeywords instance = new JavaKeywords();
        instance.findKeywords(fileContent);
    }

    /**
     * Test of calculateForKeyword method, of class JavaKeywords.
     */
    @Test
    public void testCalculateForKeyword() {
        System.out.println("calculateForKeyword");
        String[][] fileContent = new String[0][0];
        JavaKeywords instance = new JavaKeywords();
        instance.calculateForKeyword(fileContent);
    }

    /**
     * Test of javaKeywordExists method, of class JavaKeywords.
     */
    @Test
    public void testJavaKeywordExists() {
        System.out.println("javaKeywordExists");
        String sentence = "";
        String search = "";
        JavaKeywords instance = new JavaKeywords();
        boolean expResult = true;
        boolean result = instance.javaKeywordExists(sentence, search);
        assertEquals(expResult, result);
    }
    
}
