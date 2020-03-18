public class BinaryTree<E> {
	
	private Nodo<E> raiz;
	
	public void addNode(String ing, String esp) {
		Nodo<E> nodoinicial = new Nodo<E>(ing, esp);
		if(raiz == null) {
			raiz = nodoinicial;
		}
		else{
			Nodo<E> focus = raiz;
			Nodo<E> padre;
			
			while(true) {
				padre = focus;
			}
		}
	}
	
}
