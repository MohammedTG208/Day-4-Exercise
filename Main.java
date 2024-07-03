import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1.Write a program that prints the numbers from 1 to 100 such that:
        //If the number is a multiple of 3, you need to print "Fizz" instead of that
        //number.
        System.out.println("===Exercise 1===");
        for (int i = 1; i <=100 ; i++) {
            if (i%3==0){
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else if (i%5==0 && i%3==0) {
                System.out.println("FizzBuzz");
            }
        }
        //2.Write a Java program to reverse a string.
        Scanner entertext=new Scanner(System.in);
        System.out.println("===Exercise 2===");
        System.out.println("Enter text to reverse it");
        String text=entertext.nextLine();
        String fullText="";
        int takeText =text.length()-1;
        do {
            fullText+=""+text.charAt(takeText);
            takeText--;
        }while (takeText !=-1);
        System.out.println(fullText);

        //3.Write a program to find the factorial value of any number entered
        //through the keyboard.
        System.out.println("===Exercise 3===");
        Scanner factorial=new Scanner(System.in);
        System.out.println("Enter number to get factorial : ");
        int userNum=factorial.nextInt();
        int result =1;
        int fac=userNum;
        do {
            if (userNum == 0) {
                result=1;
                break;
            }else {
                result *= fac;
                fac--;
            }
        }while (fac!=0);
        System.out.println("the factorial number is: "+ result);
        //4.Two numbers are entered through the keyboard. Write a program to find
        //the value of one number raised to the power of another. (Do not use Java
        //built-in method)
        System.out.println("===Exercise 4===");
        Scanner power =new Scanner(System.in);
        System.out.println("Enter number: ");
        int number1= power.nextInt();
        System.out.println("Enter number raised to the power of number "+ number1);
        int number2= power.nextInt();
        int total=1;
        for (int p = 0; p <number2 ; p++) {
            total*=number1;
        }
        System.out.println(total);
        //5.Write a program that reads a set of integers, and then prints the sum of
        //the even and odd integers.
        System.out.println("===Exercise 5===");
        Scanner userNumber = new Scanner(System.in);
        int odd=0;
        int even=0;
        int numberComp;
        String stop;
        do {
            System.out.println("Enter number: ");
            numberComp= userNumber.nextInt();

            if (numberComp%2==0){
                odd+=numberComp;
            }else {
                even+=numberComp;
            }
            System.out.println("Do you want to complete?? Y/N");
            stop=userNumber.next();
        }while (!stop.equalsIgnoreCase("N"));
        System.out.println("Sum odd= "+odd+"\n"+"Sum even= "+even);

        //6.Write a program that prompts the user to input a positive integer. It
        //should then output a message indicating whether the number is a prime
        //number.
        Scanner prime=new Scanner(System.in);
        System.out.println("===Exercise 6===");
        System.out.println("Enter number : ");
        int checkNum=prime.nextInt();
        int counter=0;
       if (checkNum>=2) {
           for (int j = checkNum; j>=1 ; j--) {
               if (checkNum%j==0){
                 counter++;
               }
           }
           if (counter>2){
               System.out.println(checkNum+" is not prime number");
           }else {
               System.out.println(checkNum+" is prime number");
           }

       }
       else {
           System.out.println("not prime number");
       }

        //7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        //another for loop to print the days (Days 1 -7) for each week.
        System.out.println("===Exercise 7===");
        for (int week = 1; week <=4 ; week++) {
            System.out.println(" Week"+ week);
            for (int day = 1; day <=7 ; day++) {
                System.out.println("day"+ day);
            }
        }

        //8.Write a program thats check if the word is a palindrome or not. hint: A
        //string is said to be a palindrome if it is the same if we start reading it from
        //left to right or right to left.
        System.out.println("===Exercise 8===");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Text");
        String check = scanner.nextLine();
        int index=check.length()-1;
        String isMatch="";
        do {
            isMatch+=""+check.charAt(index);
            index--;
        }while (index!=-1);
        if (isMatch.equals(check)) {
            System.out.println("is match");
        }else {
            System.out.println("Not match");
        }
    }

    }