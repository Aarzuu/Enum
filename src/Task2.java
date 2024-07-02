import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2.2.İstifadəçiyə müvafiq kodu daxil edərək elementi seçməyə icazə verin
        System.out.println("for beer: A1; for chocoMilk: A2; for cocaCola: B1; for coffee: B2; for orangeJuice: C1; for pepsi: C2; for water: D1; for end: F");
        String option = sc.next();
        Double total = 0D;
        while (true) {
            switch (option) {
                case "A1":
                    total += Beverages.beer.getPrice();
                    break;
                case "A2":
                    total += Beverages.chocoMilk.getPrice();
                    break;
                case "B1":
                    total += Beverages.cocaCola.getPrice();
                    break;
                case "B2":
                    total += Beverages.coffee.getPrice();
                    break;
                case "C1":
                    total += Beverages.orangeJuice.getPrice();
                    break;
                case "C2":
                    total += Beverages.pepsi.getPrice();
                    break;
                case "D1":
                    total += Beverages.water.getPrice();
                    break;
                case "F":
                    ////2.3.Seçilmiş ickilerin ümumi qiymətini hesablayın və göstərin.
                    System.out.println(total); //muellim ise yaramir sonsuz dovre girir :(((
                    return;
                default:
                    System.out.println("wrong combination");
            }
        }
    }
}
