package FolderHandler;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PathTest {

    /**
     * Test of getPath method, of class Path.
     */
    @Test
    public void testGetPath() {
        System.out.println("getPath");
        String folderName = "";
        String expResult = "C:\\Users\\wanzu\\Documents\\NetBeansProjects\\237767_A2\\";
        String result = Path.getPath(folderName);
        assertEquals(expResult, result);
    }
    
}