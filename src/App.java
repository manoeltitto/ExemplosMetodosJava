
public class App {
    public static void main(String[] args) throws Exception {
       //Chamando métodos da Calculadora
       
       /*Calculadora.soma(10,5);
       Calculadora.subtracao(10,6);
    	Calculadora.divisao(100, 7);
    	Calculadora.multiplicacao(20,20);

        //chamando método Quadriláteros com sobrecarga

        Quadrilatero.area(3);
    	Quadrilatero.area(5,5);
    	Quadrilatero.area(7,8,9);
        */

        System.out.println("\nCódigos reescritos pela implementaçao\ndo Return nos métodos da classe 'Quadrilatero'\n");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área Retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área Trapézio: " + areaTrapezio);
    }
}
