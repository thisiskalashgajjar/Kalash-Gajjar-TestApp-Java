import java.util.Scanner;

public class Test {
    private String[] question;
    private String[][] options;
    private int[] correctOption;
    private int totalQuestions;

    int correct = 0;

    public void attendTest(){
        totalQuestions = 5;
        question = new String[totalQuestions];
        options = new String[totalQuestions][4];
        correctOption = new int[totalQuestions];

        question[0] = "JDK stands for ______";
        options[0] = new String[]{
                "(A) Java deployment Kit", "(B) Java Development Kit", "(C) JavaScript Deployment Kit", "(D) None of these"
        };
        correctOption[0] = 1;

        question[1] = "Multiline comment is created using _______";
        options[1] = new String[]{
                "(A) /* */, (B) //, (C) <!-- -->, (D) All of these"
        };
        correctOption[1] = 0;

        question[2] = "What is driver class";
        options[2] = new String[]{
                "(A) First class mention in code", "(B) A class inherited from first class", "(C) A class that is in charge of running other classes", "(D) None of these"
        };
        correctOption[2] = 2;

        question[3] = "Which class is used to take input from the user?";
        options[3] = new String[]{
                "(A) Scanner, (B) Input, (C) Applier, (D) Both A and B"
        };
        correctOption[3] = 0;

        question[4] = "Which method is used to take a string as input in Java?";
        options[4] = new String[]{
                "(A) next(), (B) nextLine(), (C) .string(), (D) Both A and B"
        };
        correctOption[4] = 3;
    }

    public void questions(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String name = input.next();
        System.out.println("Please enter your student id: ");
        String sId = input.next();
        System.out.println("========================================================================");
        System.out.println("Welcome to COMP228 Java Quiz-01\n");
        System.out.println("========================================================================");
        System.out.println("Name: "+ name);
        System.out.println("Student ID: " + sId);
        System.out.println("========================================================================");

        for(int i = 0; i < totalQuestions; i++){
            System.out.println("========================================================================");
            System.out.println("Question" + (i+1) + ":" + question[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.println("Select any option from the given options: ");
            char userInput = input.next().toUpperCase().charAt(0);
            if(userInput-'A' == correctOption[i]){
                System.out.println("Correct!");
                correct++;
            } else{
                System.out.println("Incorrect.");
            }
            System.out.println("========================================================================");
        }
        double percentage = (double) correct / totalQuestions * 100;
        System.out.println("========================================================================");
        System.out.println("\nTest Result: ");
        System.out.println("========================================================================");
        System.out.println("Correct Answers: " + correct);
        System.out.println("Percentage Correct: " + percentage + "%");

        if (percentage >= 60){
            System.out.println("Congratulations! You have passed the Quiz-01");
        }
        else{
            System.out.println("You've failed the test. Contact your professor to re-attend the test.");
        }

    }
}
