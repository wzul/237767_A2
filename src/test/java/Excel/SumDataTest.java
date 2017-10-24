package Excel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumDataTest {

    /**
     * Test of sortToProperPresentation method, of class SumData.
     */
    @Test
    public void testSortToProperPresentation() {
        System.out.println("sortToProperPresentation");
        SumData instance = new SumData(new String[0], new String[0], "A", "B", "C", "D", new String[0], new int[0][0], new int[0][0]);
        instance.sortToProperPresentation();
    }

    /**
     * Test of getTotalLOC method, of class SumData.
     */
    @Test
    public void testGetTotalLOC() {
        System.out.println("getTotalLOC");
        SumData instance = new SumData(new String[0], new String[0], "A", "B", "C", "D", new String[0], new int[0][0], new int[0][0]);
        int[][] expResult = new int[0][0];
        int[][] result = instance.getTotalLOC();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getTotalKeywordsCount method, of class SumData.
     */
    @Test
    public void testGetTotalKeywordsCount() {
        System.out.println("getTotalKeywordsCount");
        SumData instance = new SumData(new String[0], new String[0], "A", "B", "C", "D", new String[0], new int[0][0], new int[0][0]);
        int[][] expResult = new int[0][0];
        int[][] result = instance.getTotalKeywordsCount();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getTotalForEachMatrik method, of class SumData.
     */
    @Test
    public void testGetTotalForEachMatrik() {
        System.out.println("getTotalForEachMatrik");
        SumData instance = new SumData(new String[0], new String[0], "A", "B", "C", "D", new String[0], new int[0][0], new int[0][0]);
        int[] expResult = new int[0];
        int[] result = instance.getTotalForEachMatrik();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getDistinctMatrik method, of class SumData.
     */
    @Test
    public void testGetDistinctMatrik() {
        System.out.println("getDistinctMatrik");
        SumData instance = new SumData(new String[0], new String[0], "A", "B", "C", "D", new String[0], new int[0][0], new int[0][0]);
        String[] expResult = new String[0];
        String[] result = instance.getDistinctMatrik();
        assertArrayEquals(expResult, result);
    }

}
