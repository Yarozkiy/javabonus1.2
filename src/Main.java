public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 122545;
        int miles = service.calculate(price);

        System.out.println();
        System.out.println("Dear passenger!");
        System.out.println();
        System.out.println("Сongratulations you have accumulated: "+ miles +" bonus miles");
        System.out.println();
        System.out.println();
        System.out.println("Thank you for choosing our airline!=)");

    }
}