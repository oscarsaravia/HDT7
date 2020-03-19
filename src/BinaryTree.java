public class BinaryTree<E> {
	
	Nodo<E> raiz;
	
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
				if(ing.compareTo(focus.getAss().getIngles()) < 0) {
					focus = focus.left;
					if(focus == null) {
						padre.left = nodoinicial;
						return;
					}
					
				}else {
					focus = focus.right;
					if(focus == null) {
						padre.right = nodoinicial;
						return;
					}
				}
			}
		}
	}
	
	public void InOrder(Nodo<E> focus) {
		if(focus != null) {
			InOrder(focus.left);
			System.out.println(focus.getAss().palabra);
			InOrder(focus.right);
			
		}
	}
	
	public String find(String key){
		Nodo<E> focus = raiz;
		
		while(focus.getAss().getIngles().equalsIgnoreCase(key) != true) {
			if(key.compareTo(focus.getAss().getIngles()) < 0) {
				focus = focus.left;
			}
			else {
				focus = focus.right;
			}
			if(focus == null) {
				return null;
			}

		}
		return focus.getAss().getEspanol();
		
		
	}
}
