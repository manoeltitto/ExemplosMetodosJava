public class Quadrilatero {

   /* 
   Estes códigos implementam métodos com sobrecarga. 
   Abaixo, refazemos os códigos com uso de Return
   
   public static void area(double lado) {
		System.out.println("Quadrado: "+ lado * lado);
	}
	
	public static void area(double lado1, double lado2) {
		System.out.println("Retângulo: "+ lado1 * lado2);
	}
	
	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("Trapédio: "+ ((baseMaior * baseMenor)*altura)/2);
	}
    */

    public static double area(double lado) {
		return  lado * lado;
	}
	
	public static double area (double lado1, double lado2) {
	    return lado1 * lado2;
	}
	
	public static double area(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior * baseMenor)*altura)/2;
	}
}