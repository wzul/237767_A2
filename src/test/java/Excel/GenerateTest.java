package Excel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GenerateTest {

    /**
     * Test of setHeader method, of class Generate.
     */
    @Test
    public void testSetHeader() {
        System.out.println("setHeader");
        String semester = "";
        String course = "";
        String group = "";
        String task = "";
        Generate instance = new Generate("A");
        Generate expResult = instance;
        Generate result = instance.setHeader(semester, course, group, task);
        assertEquals(expResult, result);
    }

    /**
     * Test of setKeyword method, of class Generate.
     */
    @Test
    public void testSetKeyword() {
        System.out.println("setKeyword");
        String[] javaKeywords = new String[0];
        Generate instance = new Generate("A");
        Generate expResult = instance;
        Generate result = instance.setKeyword(javaKeywords);
        assertEquals(expResult, result);
    }

    /**
     * Test of setData method, of class Generate.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        int[][] totalKeywords = new int[0][0];
        String[] javaKeywords = new String[0];
        String[] distinctMatrik = new String[0];
        int[][] totalLOC = new int[0][0];
        int[] totalMatrik = new int[0];
        Generate instance = new Generate("A");
        Generate expResult = instance;
        Generate result = instance.setData(totalKeywords, javaKeywords, distinctMatrik, totalLOC, totalMatrik);
        assertEquals(expResult, result);
    }

    /**
     * Test of processDataObject method, of class Generate.
     */
    @Test
    public void testProcessDataObject() {
        System.out.println("processDataObject");
        Generate instance = new Generate("A");
        instance.header = new String[0][0];
        instance.keyword = new String[0][0];
        instance.data = new String[0][0];
        Generate expResult = instance;
        Generate result = instance.processDataObject();
        assertEquals(expResult, result);
    }

    /**
     * Test of write method, of class Generate.
     */
    @Test
    public void testWrite() {
        System.out.println("write");
        Generate instance = new Generate("A");
        Generate expResult = instance;
        Generate result = instance.write();
        assertEquals(expResult, result);
    }

}
