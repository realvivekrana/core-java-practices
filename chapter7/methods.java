

public class methods {

    static void welcome(){
        System.out.println("Welcome to Java");
    }

    public static int multiplyByFive(int number){
        return number * 5;
    }
    public static void main(String[] args){
        // for(int i = 0; i < 5; i++ ){
        //     welcome();
        // }
        int result = multiplyByFive(5);
        System.out.println(result);
    }
}
