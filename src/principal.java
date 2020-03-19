/*
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Sección: 
 * Autor: Oscar Saravia 19322
 */

import java.util.*;

public class principal {

	public static void main(String[] args) {
		
		BinaryTree<Nodo<Association<String, String>>> tree = new BinaryTree<Nodo<Association<String,String>>>();
		Scanner scan = new Scanner(System.in);
		operaciones op = new operaciones();
		
		System.out.println("Ingrese la ruta del archivo que contiene las palabras del diccionario: ");
		String path = scan.nextLine();
		op.importText(path);
		for(int i = 0; i < op.textoinicial.size(); i++) {
			tree.addNode(op.imprimir(i)[0], op.imprimir(i)[1]);
		}
		
		
		
		int opcion = 0;
		while(opcion != 3) {
			System.out.println("\nIngrese la opcion que desea realizar: \n"
					+ "1. Mostrar diccionario InOrder\n"
					+ "2. Traducir Texto\n"
					+ "3. Salir");
			opcion = scan.nextInt();
			scan.nextLine();
			if(opcion == 1) {
				
				tree.InOrder(tree.raiz);
				
				
			}
			else if (opcion == 2){
				System.out.println("Ingrese la ruta del archivo: ");
				path = scan.nextLine();
				String[] oracion = op.traducir(path);
				for(int k = 0; k<oracion.length; k++) {
					if(tree.find(oracion[k]) != null) {
						System.out.print(tree.find(oracion[k])+ " ");
					}
					else {
						System.out.print("*"+oracion[k]+"* ");
					}
				}
			
				
			}
			
		}

	}

}
