import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //System.out.println("Película La lista de schindler");
       
       int anioLanzamiento = 1993;
       double evaluacion=4.9;
       boolean incluidoEnPlanBasico = true;
       String nombre= "La lista de schindler";
       String sinopsis= """
       		Mejor película de época
       		""";
       double mediaNotaUsuario =0;
       int i=1;
       System.out.println("Nombre película: "+nombre);
       System.out.println("Año de lanzamiento: "+anioLanzamiento);
       System.out.println("Puntuación: "+evaluacion);
       
       if(incluidoEnPlanBasico==true) {
       System.out.println("Película incluida en plan básico");
       }else
       {
    	   System.out.println("Película no incluida en plan básico");
       }
       if(anioLanzamiento >= 2023) {
    	   System.out.println("Película popular en el momento");
       }else 
       {
    	   System.out.println("Película retro que vale la pena ver");
       }
      
       while(i<4) {
    	   System.out.println("Ingresa tu evaluación para la película La lista de schindler: ");
    	   Scanner teclado = new Scanner(System.in);
           double notaUsuario = teclado.nextDouble();
    	   mediaNotaUsuario= mediaNotaUsuario+ notaUsuario;
    	   i++;
       }
       mediaNotaUsuario=mediaNotaUsuario/3;
       System.out.println("La nota media para la película es: "+mediaNotaUsuario);
	}
       
}
