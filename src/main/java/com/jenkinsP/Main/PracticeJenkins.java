package com.jenkinsP.Main;

public class PracticeJenkins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Result is : " +checkIfInputIsAnEvenNumber(122));
	}

	public static boolean checkIfInputIsAnEvenNumber(int number){
        return number % 2 == 0;
    }
}