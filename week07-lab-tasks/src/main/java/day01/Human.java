package day01;

import java.time.LocalDate;

public class Human {
    private static String name;
    private static int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        if(isValidName(name)&&isValidYearOfBirth(yearOfBirth)){
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }


    }

    public static boolean isValidName(String name){
        if(!name.contains(" ")&&name.split(" ").length==1){
            throw new IllegalArgumentException("The name is not correct!");
        }
            return true;

    }
    public static boolean isValidYearOfBirth(int YearOfBirth)throws IllegalArgumentException{
        if((LocalDate.now().getYear()-yearOfBirth) > 120){
            throw new IllegalArgumentException("Cannot be older than 120 year!");
        }
            return true;
    }

    public static void main(String[] args) {
        System.out.println(LocalDate.now().getYear()-1999>120);
    }

}
