import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class putTest {

	@Test
	void test() {
		BinaryTree<Nodo<Association<String, String>>> tree = new BinaryTree<Nodo<Association<String,String>>>();
		boolean prueba;
		tree.addNode("Hello", "Hola");
		if(tree.raiz != null) {
			prueba = true;
		}
		else {
			prueba = false;
		}
		assertEquals(true, prueba);
	}

}
