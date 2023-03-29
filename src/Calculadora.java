
public class Calculadora{

    public static void soma(double numeral1, double numeral2){
        
        double resultado = numeral1 + numeral2;

        System.out.println("Soma " + resultado);
    }

    public static void subtracao(double numeral1, double numeral2){
        
        double resultado = numeral1 - numeral2;

        System.out.println("Subtração "+resultado);
    }

    public static void divisao(double numeral1, double numeral2){
        
        double resultado = numeral1 / numeral2;

        System.out.println("Divisão "+resultado);
    }

    public static void multiplicacao(double numeral1, double numeral2){
        
        double resultado = numeral1 * numeral2;

        System.out.println("Multiplicação "+resultado);
    }
}