
public class Nodo<E>{
	
	private Association<String, String> as;
	private Nodo<E> right;
	private Nodo<E> left;
	
	public Nodo(String ingles, String espanol) {
		right = null;
		left = null;
		as = new Association<String, String>(ingles, espanol);
	}
	
}
