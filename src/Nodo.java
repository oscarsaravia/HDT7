
public class Nodo<E>{
	
	private Association<String, String> as;
	Nodo<E> right;
	Nodo<E> left;
	
	public Nodo(String ingles, String espanol) {
		right = null;
		left = null;
		as = new Association<String, String>(ingles, espanol);
	}
	
	public Association<String, String> getAss(){
		return as;
		
	}

	
}
