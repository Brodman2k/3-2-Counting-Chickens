public class Chickens02 {

    //Egg profits
    public static void eggProfits (){

        //Eggs collected
        int Monday = 100;
        int Tuesday = 121;
        int Wednesday = 117;

        //Profit
        double dailyAverage = (double) (Monday + Tuesday + Wednesday) / 3;
        double monthlyAverage = dailyAverage * 30;
        double monthlyProfit = monthlyAverage * ((double) 18 / 100);

        //Print out
        System.out.println("Daily Average:   " + dailyAverage);
        System.out.println("Monthly Average: " + monthlyAverage);
        System.out.println("Monthly Profit:  $" + monthlyProfit);

    }
    public static void main(String[] args) {
        eggProfits();
    }
}
