public class LuckyNumbers
{

    public LuckyNumbers() { }

    public int randomIntegerBetween(int min, int max) {
        return (int)(Math.random()*(max-min+1))+min;
    }


    public String getLuckyNumbers() {
        String l = "";
        for (int i = 0; i<5; i++) {
            l +=randomIntegerBetween(1, 65)+" ";
        }
        int s = randomIntegerBetween(1, 30);

        return "Your lucky numbers are: "+l+"\nThe super ball is: "+s;
    }


}
