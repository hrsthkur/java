import java.util.Scanner;

public class DiceJack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int sum = first + second + third;

        int rollSum = randomSum();

        if(sum-rollSum < 3) {
            System.out.println("You win");
            return;
        }
         System.out.println("You loose");
        


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