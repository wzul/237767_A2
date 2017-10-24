package FileHandler.Identify;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LOCTest {
    
    /**
     * Test of findLOC method, of class LOC.
     */
    @Test
    public void testFindLOC() {
        System.out.println("findLOC");
        String[][] fileContent = new String[0][0];
        LOC instance = new LOC();
        instance.findLOC(fileContent);
    }

    /**
     * Test of calculateForEmptyLine method, of class LOC.
     */
    @Test
    public void testCalculateForEmptyLine() {
        System.out.println("calculateForEmptyLine");
        String[][] fileContent = new String[0][0];
        LOC instance = new LOC();
        instance.calculateForEmptyLine(fileContent);
    }
    
}
