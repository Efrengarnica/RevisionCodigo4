import java.util.Scanner;

public class Codigo4 {
	public static void main(String [] args) {
	 Scanner s = new Scanner(System.in);
	  
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): "); 
	    String j1 = s.nextLine();
	    
	    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in);
	    String j2 = s2.nextLine();
	    
	    if( (j2.equals("tijeras")||j2.equals("piedra")||j2.equals("papel")) && (j1.equals("tijeras")||j1.equals("piedra")||j1.equals("papel")) )
	    {
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) {
	            g = 1;
	          }
	          break;

	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	            }
	          break;
	          
	        case "tijeras":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default: 
	        
	      }
	      System.out.println("Gana el jugador " + g);
	      
	    }
	    } else {
	    	System.out.println("Uno de los jugadores no seleccionó una opción válida");
	    }
	    s.close();
	    s2.close();	}
}
