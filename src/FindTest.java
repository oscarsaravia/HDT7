import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindTest {

	@Test
	void test() {
		BinaryTree<Nodo<Association<String, String>>> tree = new BinaryTree<Nodo<Association<String,String>>>();
		tree.addNode("Hello", "Hola");
		String palabra;
		palabra = tree.find("Hello");
		assertEquals("Hola", palabra);
		
	}

}
