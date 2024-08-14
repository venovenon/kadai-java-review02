
public class Review01 {

    public static void main(String[] args) {

        int kakaku = 2000;
        double zei = 0.1;

        int result = tax(kakaku, zei);
        System.out.println(kakaku + "円の商品の税込価格は" + (kakaku + result) + "円（消費税は" + result + "円）です。");

    }

    public static int tax(int price, double rate) {

        int outTax = (int) (price * rate);
        return outTax;

    }

}