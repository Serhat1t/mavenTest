package org.example;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.example.Grader;



public class GraderTest {
    @Test
     public void fiftyNineShouldReturn(){
        var grader =new Grader();
        assertEquals('F',grader.determineLetterGrade(60));
    }
    @Test
    public void connotNumber(){
        Grader grader=new Grader();
        assertThrows(IllegalArgumentException.class,()->{
            grader.determineLetterGrade(-1);
        });
    }

}