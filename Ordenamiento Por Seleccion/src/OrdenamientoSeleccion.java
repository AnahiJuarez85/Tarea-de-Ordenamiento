paquete  com.umg.progra3 ;

import  java.util.Arrays ;

public  class  OrdenamientoSeleccion {

	public  static  void  main ( String [] args ) {
		int lista [] = { 51 , 21 , 39 , 80 , 36 };

		Sistema . fuera . println ( " Array: "  +  Arrays . toString (lista));
		ordenamientoSeleccion (lista);
		Sistema . fuera . println ( " Array: "  +  Arrays . toString (lista));
		
	}

	 ordenamientoSeleccion public static  void  ( int a []) { 
		int indiceMenor;
		
		para ( int i =  0 ; i < a . longitud; i ++ ) {
			// comientza con la exploracion del indice i
			indiceMenor = i;
			// j explora la sublista [i + 1] .. [n-1] y busca el menor de todos
			para ( int j = i + 1 ; j < a . longitud; j ++ ) {
				si (a [j] < a [indiceMenor]) {
					indiceMenor = j;
				}		
					
			}
			if (i ! = indiceMenor) {
				intercambiar (a, i, indiceMenor);
			}
		}
	}
	
	static  void  intercambiar ( int [] lista , int  i , int  j ) {
		Sistema . fuera . println ( " intercambiar " + lista [i] + " y " + lista [j]);
		int aux = lista [i];
		lista [i] = lista [j];
		lista [j] = aux;
	}
}