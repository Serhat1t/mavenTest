package org.example;

public class Grader {
    public char determineLetterGrade(int numberGrade) {
        if (numberGrade < 0) {
            throw new IllegalArgumentException("Cannot number");
        } else if (numberGrade < 60) {
            return 'F';
        } else {
            return 'A';
        }
    }
}
