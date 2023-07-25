import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public class Task02 {
    public static void main(String[] args) throws InvalidStateException {

        System.out.println(valorProdutoFinal(250.10, "MG") == 267.607);
        System.out.println(valorProdutoFinal(250.10, "RJ") == 287.615);
        System.out.println(valorProdutoFinal(250.10, "SP") == 280.112);
        System.out.println(valorProdutoFinal(250.10, "DF") == 280.112);
    }

    public static double valorProdutoFinal(double valorProduto, String state) throws InvalidStateException {
        return arredondar(valorProduto * (1.0 + State.valueOf(state).getTax()));
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}