/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rayvince
 */
public class A_SquareOfANumberTest {
    
    public A_SquareOfANumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        A_SquareOfANumber.main(args);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSquare() throws FileNotFoundException {
        for(int test=1; test<=3; test++){
            String testNum = Integer.toString(test);
            Scanner in = new Scanner(new File("src/TestCases/A" +testNum+ ".in"));
            Scanner out = new Scanner(new File("src/TestCases/A" +testNum+ ".out"));
            
            int testCases = in.nextInt();
            
            if(test==3){
                while(testCases>0){
                int num = in.nextInt();
                String result = "";
                
                if(num<0){
                    result = "INVALID";
                }
                else if (num>1000){
                    result = "TOO BIG";
                }
                else{
                    result = Integer.toString(A_SquareOfANumber.square(num));
                }
                
                String expResult = out.nextLine();
                assertEquals(expResult, result);
                testCases--;
                }
            }
            
            else{
                while(testCases>0){
                int num = in.nextInt();
                int actualResult = A_SquareOfANumber.square(num);
                int expResult = out.nextInt();
                assertEquals(expResult, actualResult);
                testCases--;
                }
            }
            
            System.out.println("Test Case " +testNum+ ": Passed");
        }
    }
    
}
