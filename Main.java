public class Main {
    public static void main(String[] args) {
        int intialAccount = 100;
        int depositAmount = 1200;
        int bonus;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
            int finalSum = intialAccount + depositAmount + bonus;
            System.out.println("Final Sum");
            System.out.println(finalSum) ;
            System.out.println("Bonus");
            System.out.println(bonus) ;
        } else {
            bonus = 0;
            System.out.println("No_Bonus");
            System.out.println("Final Sum");
        }



    }
}
