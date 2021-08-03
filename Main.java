public class Main {
    public static void main(String[] args) {
        int intialAccount = 100;
        int depositAmount = 900;
      if (depositAmount > 1000) {
            int bonus = (intialAccount + depositAmount) / 100;
            int finalSum = intialAccount + depositAmount + bonus;
            System.out.println("Final Sum");
            System.out.println(finalSum) ;
            System.out.println("Bonus");
            System.out.println(bonus) ;
        } else {

            System.out.println("No_Bonus");
            System.out.println("Final Sum");
            int bonus =0;
            int finalSum = intialAccount + depositAmount;
            System.out.println(finalSum);
        }

    }
}
