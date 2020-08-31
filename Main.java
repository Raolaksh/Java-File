package com.company;

import java.util.Scanner;

public class Main {

    static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world");
        //  this is a comment and /* is a multiline line comment */
        /* variables are like containers which store data values
            Variables In Java:
            String, int, float, char, boolean
          */
//        how to declare variables:
//        syntax - <datatype> <variablesName> = <value>;
        String name = "laksh";
        System.out.println(name);
// string contains string, int contains integer, float contains decimal value, char contains one character and boolean contains true false
//        we have to put f in float variables look in 20th line
        int x = 45, y = 55, z = 65;
        float b = 45.22f;
        boolean is_Adult = false;
        System.out.println(x);
        System.out.println(b);
        System.out.println(is_Adult);

/*    Rules for constructing variables in Java:
      1.  can contain digits,underscore,dollar signs, letters
      2.  should begin letters, $ or _'underscore'
      3.  Java is case sensitive language which means laksh and laksh are two different variables altogether
      4.  should not contain whitespaces
      5.  ypu cannot reserve keywords from Java
 */
   /*   Two types of Java data types:
        1. primitive - byte (1 byte), short (2 byte), int (4 byte), long (8 byte), float(4 byte),
           double (8 byte), boolean(1 bit), char (2 byte).
           1 bit = 2 byte
        2. non-primitive or reference data types -
*/

        byte u = 56;
        double d = 32.6258685d;
        System.out.println(u);
        char grade = 'A';
        System.out.println(grade);
//        String l = "laksh"
//                l.char

/*        operators in java
        operand, operator, operand   =   result
          4         +          7     =    11

          types of operators in Java:
          Arithmetic operator
          Assignment operators
          Logical operators
          Comparision operators
 */
//        int num1 = 45, num2 = 78;
//        System.out.println("the value of num1 + num2 is");
//        System.out.println(num1 + num2);
//
//        System.out.println("the value of num1 - num2 is");
//        System.out.println(num1 - num2);
//
//        System.out.println("the value of num1 * num2 is");
//        System.out.println(num1 * num2);
//
//        System.out.println("the value of num1 / num2 is");
//        System.out.println(num1 / num2);
//
//        System.out.println("the value of num1 % num2 is");
//        System.out.println(num1 % num2);
//        System.out.println();
//        ln is for new line
//        % means remainder

//        System.out.println(num1 ++);
//        System.out.println(++num1);
//        System.out.println(num1--);
//        System.out.println(--num1);

//       Explore these operators -  *=, /=, %=

        /*
        comparison operators
        1. == cheks for equality of two values
        2. != cheks if two values are not equal
        3. <   baki ke kudh samjho jese less than equal to ha ki nahi
        4. >
        5. <=
        6. >=

        * logical operators
        1. && - logical and operator - returns true only if both conditions are true
        2. || - logical or operator - returns true if any one condition is true
        3. ! - logical not - reverse the result from true to false and vise versa
         */

//        taking user input in java
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Your Age:");
//        int Age = scan.nextInt();
//        System.out.println(Age);
//uncomment it
        String studio = "Laksh";
        String channel = "OZ GamerX";
//     System.out.println(name);
//     System.out.println(name.length());
//     System.out.println(name.toUpperCase());
//     System.out.println(name.toLowerCase());
//     System.out.println(name + " from\" " + channel);
//     System.out.println(name + " from\\ " + channel);
//     System.out.println(name + " from\t " + channel);
//     System.out.println(name + " from\n " + channel);

//        System.out.println(name.contains("Har"));
//        System.out.println(name.charAt(2));
//        System.out.println(name.endsWith("ry"));
//        System.out.println(name.indexOf("rry"));

//     search in web java math class methods its important

//        int numb1 = 4,  numb2 = 7;
//        System.out.println(Math.max(numb1, numb2));
//        System.out.println(Math.min(numb1, numb2));
//        System.out.println(Math.sqrt(88));
//        System.out.println(Math.abs(-22));
//        System.out.println(Math.abs(88));
//        abs wil convert negative into positive and positive into positive
/*
        System.out.println(Math.random());
        System.out.println(4+(8- 4)*Math.random());
        System.out.println(4+(8-4)*Math.random());
        System.out.println(4+(8-4)*Math.random());
        System.out.println(4+(8-4)*Math.random());
  */
//        this is code uncomment it above you not your above its chhatt above the code.okay this is java math class

//        remember if you did't see it running and see that java is saying that enter input enter anything you want like laksh it running.

// if else conditionals :
//        meaning of if else is agar magar that's it

//        if(Age>98){
//            System.out.println("You are Jhoota no one can jeya that far in Kalyog");
//        }
//
//        else if(Age>18){
//            System.out.println("You are an adult");
//        }
//
//        else if (Age>10){
//            System.out.println("You are a teen");
//        }
//
//        else if(Age>5) {
//            System.out.println("You are not a Kid");
//        }
//        else {
//            System.out.println("You are a Kid");
//        }
// this is if else statement code uncomment it

//          Switch statement in JAVA:

     /*   switch (Age){
            case 12:
                System.out.println("You are 12 years old");
                break;

            case 56:
                System.out.println("You are 56 years old");
                break;

                case 16:
                System.out.println("You are 16 years old");
                break;

            default:
                System.out.println("You did not match any of the cases");
//                line number 168 uncomment it
      */

//                Quick Quiz:
//                print sunday to saturday based on numbers 1 to 7 typed by the user.

              // LOOPS IN JAVA:
                /*
                while loop
                while (condition){
                this code will keep executing until the condition is true
                remember martin fawler aese hi kuch tha fawler ka kuch packka nahi ha
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i += 1;
        }
              do{
                  System.out.println();
                }while(condition)
                int j = 0;
                do{
                    System.out.println(j);
                    j += 1;
                }while(j<100);
                uncomment do while and while loop
*/
//         For Loop
//        for(statement1;st2;st3){
//                   code to be executed
//                  }
//         FOR LOOP:
//        for(int i=0;i<10;i++){
//            System.out.println(i);
//        }
//        this is code uncomment it
//        BREAK CONTINUE PASS:
//        break ka matlab khatam bahar aa jayo to vo os condition se bahar aa jayega
     /*    for(int i=0;i<10;i++) {

            if (i > 2) {
                 break;
            }
            else{
                System.out.println(i);
                System.out.println();
            }
*/


//        for(int i=0;i<=10;i++) {
//            if (i == 2) {
//                continue;
//            }
//            else {
//                System.out.println(i);
//            }
//            System.out.println(i);

//        }

//         this is code uncomment it

//         JAVA ARRAYS:

// arrays ia samahar of values if i want to store multiple values and i did't want to make different variables then arrays are used
        int [] marks = {1,2,3,5};
        marks[3] = 34; // this will update marks 3
        System.out.println(marks[0]);
        System.out.println(marks[3]);
//  if a want to loop and print all the values then i'll use for loop
//        classic wy to itrate an array
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("this is for each loop");
//     for each loop
        for(int value:marks){
            System.out.println(value);
        }
//    i can remove braces from for loop
        int[][]matrix = {{1,2,3},
                {4,5,6}};
        System.out.println(matrix[0][1]);

//        String [] cars = {"Laksh Forecaster", "Mercedez", "Avantador", "Tesla", "Titanium"};
//        for(String value: cars){
//            System.out.println(value);
//        }
//        this is code uncomment it
//        TRY-CATCH:
        String [] cars = {"Laksh Forecaster", "Mercedez", "Avantador", "Tesla", "Titanium"};
        try{
            System.out.println(cars[5]);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Masoom");
        System.out.println(sum(5,7));
//    this is method calling
//        other code is in line number 7,8,9.

//     project tus-kyo-me
//        majak bhai majak
//        project mini - clculator


        float number_1, number_2;
        System.out.println("Enter first number:");

        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();

        System.out.println("Enter second number:");
//        Scanner scan2 = new Scanner(System.in);
        number_2 = scan.nextFloat();
        System.out.print("You have Entered ");
        System.out.print(number_1);
        System.out.print(" and ");
        System.out.println(number_2);
        String prompt = "Enter 0 for addition, 1 for " +
                "subtraction, 2 for multiplication and 3 for division";
        System.out.println(prompt);
        int input = scan.nextInt();
        switch (input){
            case 0:
                System.out.println("Adding these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 + number_2);
                break;

            case 1:
                System.out.println("Subtracting these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 - number_2);
                break;

            case 2:
                System.out.println("Multiplying these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 * number_2);
                break;

            case 3:
                System.out.println("Dividing these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 / number_2);
                break;

            default:
                System.out.println("Jab mene bola tha ke 0,1,2,3 ke alava kuch nahi dal sakte samajh nahi ati kya ");

        }


    }
}






