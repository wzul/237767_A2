/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileHandler;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wanzu
 */
public class ScanFileTest {
    
    /**
     * Test of getFileContent method, of class ScanFile.
     */
    @Test
    public void testGetFileContent() {
        System.out.println("getFileContent");
        String[] arrayListFile = new String[0];
        String pathFolder = "";
        ScanFile instance = new ScanFile();
        String[][] expResult = new String[0][0];
        String[][] result = instance.getFileContent(arrayListFile, pathFolder);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of readFileContent method, of class ScanFile.
     */
    @Test
    public void testReadFileContent() {
        System.out.println("readFileContent");
        String fileName = "";
        String pathFolder = "";
        int fileNumber = 0;
        ScanFile instance = new ScanFile();
        instance.listFileContent = new LinkedList<>();
        instance.readFileContent(fileName, pathFolder, fileNumber);
    }

    /**
     * Test of getNumberOfFiles method, of class ScanFile.
     */
    @Test
    public void testGetNumberOfFiles() {
        System.out.println("getNumberOfFiles");
        ScanFile instance = new ScanFile();
        instance.fileContent = new String[0][0];
        int expResult = 0;
        int result = instance.getNumberOfFiles();
        assertEquals(expResult, result);
    }
    
}
