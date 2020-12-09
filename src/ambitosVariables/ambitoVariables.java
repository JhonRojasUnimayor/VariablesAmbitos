package ambitosVariables;

//Ejemplo de ámbito de un bloque. 
/*
 * 
 * ejemplo de amabitos
 */
class Ambito { 

	public static void main(String args[]) { 
	
		int x; // conocida para todo el código que está dentro de main 
		
		x = 10; 
		
		if(x == 10) 
		{ // comienzo de un nuevo ámbito 
		
				int y = 20; // conocida solamente dentro de este bloque 
		
		//aquí, se conocen tanto x como y. 
		
			System.out.println("x e y: " + x + " " + y); 
		
			x	 = y * 2; 
		
		} 
		
		//y = 100; // Error! Aquí no se conoce y 
		//System.out.println("x es " + y);// error, valor de 'y' no es visible,Los objetos declarados en el ámbito interior no son visibles fuera del mismo. 

		                
		
		System.out.println("x es " + x);  //aquí todavía se conoce x.
		
		  
	} 
}	




