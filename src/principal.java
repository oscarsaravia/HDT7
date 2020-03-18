/*
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Sección: 
 * Autor: Oscar Saravia 19322
 */

public class principal {

	public static void main(String[] args) {
		
		BinaryTree<Nodo<Association<String, String>>> tree = new BinaryTree<Nodo<Association<String,String>>>();
		tree.addNode("Car", "Carro");
		tree.addNode("Andrew", "Andres");
		tree.addNode("Ball", "Pelota");
		tree.InOrder(tree.raiz);


	}

}
