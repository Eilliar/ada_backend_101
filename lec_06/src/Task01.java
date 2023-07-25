import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

enum State {
    MG(0.07),
    RJ(0.15),
    SP(0.12);

    public double tax;
    State(double taxValue){
        tax = taxValue;
    }
    public double getTax(){
        return tax;
    }
}
public class Task01 {


    public static void main(String[] args) {

        System.out.println(valorProdutoFinal(250.10, State.MG) == 267.607);
        System.out.println(valorProdutoFinal(250.10, State.RJ) == 287.615);
        System.out.println(valorProdutoFinal(250.10, State.SP) == 280.112);
    }

    public static double valorProdutoFinal(double valorProduto, State State) {
        return arredondar(valorProduto * (1.0 + State.getTax()));

    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}