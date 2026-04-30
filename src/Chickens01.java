public class Chickens01 {

    //Produces the total eggs per day
    public static void eggsCollection (int eggsPerChicken, int chickenCount, int totalEggs){

        //Monday
        totalEggs = eggsPerChicken * chickenCount;

        //Tuesday
        chickenCount += 1;
        totalEggs += chickenCount * eggsPerChicken;

        //Wednesday
        chickenCount /= 2;
        totalEggs += chickenCount * eggsPerChicken;

        System.out.println(totalEggs);
    }
    public static void main(String[] args) {

        //Scenario 1 eggsPerChicken = 5, chickenCount = 3
        eggsCollection(5, 3, 0);

        //Scenario 2 eggsPerChicken = 4, chickenCount = 8
        eggsCollection(4, 8, 0);
    }
}
