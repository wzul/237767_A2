package FolderHandler;

import static com.wzul.a2.Assignment2.PATHFOLDER;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListFileTest {
    
    /**
     * Test of listFilesForFolder method, of class ListFile.
     */
    @Test
    public void testListFilesForFolder() {
        System.out.println("listFilesForFolder");
        File folder = new File(Path.getPath(PATHFOLDER));
        ListFile instance = new ListFile();
        ListFile expResult = instance;
        ListFile result = instance.listFilesForFolder(folder);
        assertEquals(expResult, result);
    }

    /**
     * Test of addToList method, of class ListFile.
     */
    @Test
    public void testAddToList() {
        System.out.println("addToList");
        String extName = "aa.java";
        ListFile instance = new ListFile();
        instance.addToList(extName);
    }

    /**
     * Test of checkJavaExtension method, of class ListFile.
     */
    @Test
    public void testCheckJavaExtension() {
        System.out.println("checkJavaExtension");
        String extName = "mmm.java";
        ListFile instance = new ListFile();
        boolean expResult = true;
        boolean result = instance.checkJavaExtension(extName);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListFile method, of class ListFile.
     */
    @Test
    public void testGetListFile() {
        System.out.println("getListFile");
        ListFile instance = new ListFile();
        String[] expResult = new String[0];
        String[] result = instance.getListFile();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of toString method, of class ListFile.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListFile instance = new ListFile();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
