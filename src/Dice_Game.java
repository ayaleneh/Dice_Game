import java.util.Scanner;

public class Dice_Game {
    //PROGRAMMED BY AYALENEH YILMA
    public static void main(String[] args) {
        int sum=0;
        int random1,random2,random3,random4;
        String Roll_again="";
        System.out.println("|____________________________|");
        System.out.println("|********WELLCOME TO*********|");
        System.out.println("|SIMPLE TWO ROLLING DICE GAME|");
        System.out.println("|----------------------------|");

        System.out.println("|----------------------------|");
        System.out.println("|**Let's Play Roll DICE! ****|");
        System.out.println("|----------------------------|");
        random1 = (int) (Math.random() * 6 + 1);
        //System.out.println(random1);
        random2 = (int) (Math.random() * 6 + 1);
        //System.out.println(random2);
        System.out.println("YOUR ROLLS " + random1 + " &" + random2);

        if((random1==1)&&(random2==1)){
            sum=25;
            System.out.println("Score: "+sum);
        }
        else if((random1==1)||(random2==1)){
            sum=0;
            System.out.println("Score: "+sum);
        }
        else{
            sum=random1+random2;
            System.out.println("Score: "+sum);
        }

        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Roll again ?  type 'yes' || type 'q' to exit  ");
            Roll_again = scanner.nextLine();
            if (Roll_again.equalsIgnoreCase("q")) {
                System.exit(0);
            } else if(Roll_again.equalsIgnoreCase("yes")) {
                random3 = (int) (Math.random() * 6 + 1);
                //System.out.println(random3);
                random4 = (int) (Math.random() * 6 + 1);
                //System.out.println(random4);
                System.out.println("YOUR ROLLS " + random3 + " &" + random4);
                if((random3==1)||(random4==1)){

                    System.out.println("Score: "+sum);
                }
                else if((random3==1)&&(random4==1)){
                    sum=sum+25;
                    System.out.println("Score: "+sum);
                }
                else{
                    sum=sum+random3+random4;
                    System.out.println("Score: "+sum);
                }
            }
            else{
                System.out.println("please type 'yes' to Roll again or 'q' to exit");
            }
            if(sum>100){
                System.out.println(" You have scored over 100");
                System.out.println("Thank you for playing!");
                System.exit(0);
            }
        }
    }
}
