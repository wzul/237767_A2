package FileHandler;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Identify_AdapterTest {

    /**
     * Test of findAll method, of class Identify_Adapter.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        String[][] fileContent = new String[0][0];
        Identify_Adapter instance = new Identify_Adapter(new String[0][0]);
        instance.findAll(fileContent);
    }

    /**
     * Test of getSemester method, of class Identify_Adapter.
     */
    @Test
    public void testGetSemester() {
        System.out.println("getSemester");
        Identify_Adapter instance = new Identify_Adapter(new String[0][0]);
        String expResult = null;
        String result = instance.getSemester();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCourse method, of class Identify_Adapter.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Identify_Adapter instance = new Identify_Adapter(new String[0][0]);
        String expResult = null;
        String result = instance.getCourse();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGroup method, of class Identify_Adapter.
     */
    @Test
    public void testGetGroup() {
        System.out.println("getGroup");
        Identify_Adapter instance = new Identify_Adapter(new String[0][0]);
        String expResult = null;
        String result = instance.getGroup();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTask method, of class Identify_Adapter.
     */
    @Test
    public void testGetTask() {
        System.out.println("getTask");
        Identify_Adapter instance = new Identify_Adapter(new String[0][0]);
        String expResult = null;
        String result = instance.getTask();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Identify_Adapter.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Identify_Adapter instance = new Identify_Adapter(new String[0][0]);
        String[] expResult = new String[0];
        String[] result = instance.getName();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getMatrik method, of class Identify_Adapter.
     */
    @Test
    public void testGetMatrik() {
        System.out.println("getMatrik");
        Identify_Adapter instance = new Identify_Adapter(new String[0][0]);
        String[] expResult = new String[0];
        String[] result = instance.getMatrik();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getKeywordsCount method, of class Identify_Adapter.
     */
    @Test
    public void testGetKeywordsCount() {
        System.out.println("getKeywordsCount");
        Identify_Adapter instance = new Identify_Adapter(new String[0][0]);
        int[][] expResult = new int[0][0];
        int[][] result = instance.getKeywordsCount();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getJavaKeywords method, of class Identify_Adapter.
     */
    @Test
    public void testGetJavaKeywords() {
        System.out.println("getJavaKeywords");
        Identify_Adapter instance = new Identify_Adapter(new String[0][0]);
        String[] expResult = {"abstract", "assert", "boolean ",
        "break", "byte ", "case", "catch", "char ", "class", "const",
        "continue", "default", "do", "double ", "else", "extends", "false",
        "final", "finally", "float ", "for", "goto", "if", "implements",
        "import", "instanceof", "int ", "interface", "long ", "native",
        "new", "null", "package", "private", "protected", "public",
        "return", "short", "static", "strictfp", "super", "switch",
        "synchronized", "this", "throw", "throws", "transient", "true",
        "try", "void", "volatile", "while", "enum"};
        String[] result = instance.getJavaKeywords();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getLineOfCode method, of class Identify_Adapter.
     */
    @Test
    public void testGetLineOfCode() {
        System.out.println("getLineOfCode");
        Identify_Adapter instance = new Identify_Adapter(new String[0][0]);
        int[][] expResult = new int[0][0];
        int[][] result = instance.getLineOfCode();
        assertArrayEquals(expResult, result);
    }

}
