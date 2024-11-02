package y2021.q5;

public class Test {
    public static void main(String[] args) {

        int balance = 100, amount = 200;
        try{
            amount /= 0;
        }catch (Exception e){
            System.out.println("E " + e);
        }finally {
            balance -= amount;
            System.out.println(balance);
        }
    }
}
