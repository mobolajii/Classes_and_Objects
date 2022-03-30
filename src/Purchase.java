import java.util.Scanner;

public class Purchase {

    String article;
    double price;
    int quantity;

    public Purchase(String article, double price, int quantity){
        this.article = article;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getArticle() {
        return article;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String article1 = sc.nextLine();
        double price1 = sc.nextDouble();
        int quantity1 = sc.nextInt();

        Purchase purchase1 = new Purchase(article1, price1, quantity1);
        System.out.println(purchase1.getArticle()+ " "+ purchase1.getPrice() + " " + purchase1.getQuantity());
    }
}
