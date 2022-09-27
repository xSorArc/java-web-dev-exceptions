package org.launchcode.exercises;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        System.out.println(Divide(10, 0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Jeff", "NoJava");

        // Test out your CheckFileExtension() function!
        System.out.println(CheckFileExtension(studentFiles.get("Brad")));
    }

    public static int Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("You can't divide by 0.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        return x / y;
    }

    public static int CheckFileExtension(String fileName) {
        // If a student’s submitted file ends in .java, they get 1 point.
        // If a student’s submitted file doesn’t end in .java, they get 0 points.
        // If the file submitted is null or an empty string, an exception should be thrown, and you
        // should give the student -1 points. What kind of exception is up to you, including to
        // a custom exception!

        if (fileName == null || fileName.equals("")) {
            try {
                throw new NoFileSubmittedException("File must be turned in to get credit!");
            } catch (NoFileSubmittedException e) {
                e.printStackTrace();
            }
            return -1;
        }

        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }

}
