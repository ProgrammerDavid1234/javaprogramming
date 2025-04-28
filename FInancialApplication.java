public class FInancialApplication {
    public static void main(String[] args) {
        double principal = 1000; 
        double rate = 5; 
        int time = 10; 

        
        double interest = (principal * rate * time) / 100;
        System.out.println("The simple interest is: " + interest);

        double totalAmount = principal + interest;
        System.out.println("The total amount after " + time + " years is: " + totalAmount);
    }
}
