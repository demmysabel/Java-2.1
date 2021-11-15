public class main {
    public static void main(String[] args) {
        int ticketPrice = 10_000;
        int PriceForMiles = 20;
        int Miles = 1;
        int amountMiles = ticketPrice/PriceForMiles*Miles;
        System.out.println("Мили" + amountMiles);
    }

}