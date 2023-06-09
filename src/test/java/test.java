import org.example.Grader;
import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void findMaxTest(){
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int exp =3;
        int actual= new Main().largest(arr);
        assertEquals("dizideki en büyük elaman bu değil",exp,actual);
    }
    @Test
    public void find(){
        var grader =new Grader();
        assertEquals('F', grader.determineLetterGrade(50));
    }
}
