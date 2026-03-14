import java.util.Scanner;

public class DiceJack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        
        if(check(first,second,third)){
            System.out.println("Bro!! Enter num less than 6");
        }
        int sum = first + second + third;

        int rollSum = randomSum();

        if(sum-rollSum < 3) {
            System.out.println("You win");
            return;
        }
         System.out.println("You loose");
        


    }

    public static boolean check(int a,int b,int c){
        return (a > 6 || b > 6 || c > 6);
    }

    public static int randomSum(){
        int first = random();
        int second = random();
        int third = random();

        int sum = first + second + third;
        return sum;
    }

    public static int random(){
        int num = ((int)(Math.random()*10)%6)+1;;
        return num;
    }




}