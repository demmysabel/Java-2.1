public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10_000;
        int priceForMiles = 20;
        int miles = 1;
        int amountMiles = ticketPrice/priceForMiles*miles;
        System.out.println("Мили" + amountMiles);
    }

}