package com.bootcampexcersise.module7.activity;

//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.
public class CustomExceptionActivityTest {
    public static void main(String[] args) throws CustomExceptionActivity {
        CustomExceptionActivityTest user = new CustomExceptionActivityTest();
        user.validateUser("John");
        user.validateUser("Vita"); // just to see what happens if name is not in the array
        //1 - Type main method and call validateUser() from it.
        //Call this method with different names to test it
    }
        void validateUser (String name) throws CustomExceptionActivity{
            String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
//flag stores 1 if a match is found else it should remain 0
            int flag = 0;
            for (int i = 0; i < 4; i++) {
                if (validUsers[i] == name) {
                    flag = 1;
                }
            }
            if(flag==0){
                throw new CustomExceptionActivity();
            }else {
                System.out.println("Welcome to Payroll program");
            }

        }

    }
