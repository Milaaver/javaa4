public class MainS2 {
    public static void main(String[] args) {
        int intialAccount = 100;
        int depositAmount = 100;
        int finalAccount = intialAccount + depositAmount;
        if (depositAmount < 1000) {
            System.out.println("Final Account");
            System.out.println(finalAccount);
            System.out.println("No_Bonus");
        } else {
           int bonus = (intialAccount + depositAmount) / 100;
            System.out.println("Bonus");
            System.out.println(bonus) ;
            System.out.println("Final Account");
            System.out.println(finalAccount);
        }

    }
}

