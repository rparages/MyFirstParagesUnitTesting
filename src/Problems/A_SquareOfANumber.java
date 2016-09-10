package Problems;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class A_SquareOfANumber {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/TestCases/A3.in"));
        int testCases = in.nextInt();
        while(testCases>0){
            int num = in.nextInt();
            
            if (num<0){
                System.out.println("INVALID");
            }
            else if (num>1000){
                System.out.println("TOO BIG");
            }
            else{
                System.out.println(square(num));     
            }
            testCases--;
        }
    }
    
    public static int square(int num){
        return num*num;
    }
    
}
