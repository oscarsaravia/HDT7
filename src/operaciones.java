import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class operaciones {
	
	
	private File file;
	String [] oracion;
	ArrayList<String> textoinicial = new ArrayList<String>();
	private String str;
	private String answer;
	
	public ArrayList<String> importText(String path) {
		try {
			file = new File(path);
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				str = scan.nextLine();
				answer = str.substring(str.indexOf("(")+1,str.indexOf(")"));
				textoinicial.add(answer);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	
	return textoinicial;
	}
	
	public String[] imprimir(int i) {
		String[] arr = textoinicial.get(i).split(", ");
		return arr;
		
	}
	
	public String[] traducir(String path) {
		try {
			file = new File(path);
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				oracion = scan.nextLine().split(" ");
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return oracion;
	}
	
}
