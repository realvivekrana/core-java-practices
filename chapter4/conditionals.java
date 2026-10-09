package chapter4;

public class conditionals {
    public static void main(String[] args){

        //This is a if else
        // int age = 21;
        // if (age >= 22){
        //     System.out.println("You can buy Window");
        // }else{
        //     System.out.println("You can buy Mackbook");
        // }

        //This is a else if statement
        // String singal = "Green";
        // if(singal.equals("Red")){
        //     System.out.println("Stop");
        // }else if(singal.equals("Yelllow")){
        //     System.out.println("Ready");
        // }else if(singal.equals("Green")){
        //     System.out.println("Go");
        // }else{
        //     System.out.println("Invalid Singal");
        // }

        //This is a switch statement

        int day = 10;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid day Number");   
        }
    }
}
