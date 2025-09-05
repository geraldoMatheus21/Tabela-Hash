package aprendizado;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aula {

	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------");
		System.out.println("HashSet");
		
		Set<String> nomes = new HashSet<>();
		String[] nome = {
				"Ana", 
				"Carlos", 
				"Mariana", 
				"Pedro", 
				"Julia", 
				"Lucas", 
				"Beatriz", 
				"Rafael", 
				"Isabela", 
				"Gabriel"};
		
		for(String o : nome) {
			nomes.add(o);
		}
		
		System.out.println(nomes);
		
		System.out.println("----------------------------------------------");
		System.out.println("LinkedHashSet");
		
		Set<String> name = new LinkedHashSet<String>();
		
		for(String i : nome) {
			name.add(i);
		}
		
		System.out.println(name);
		
		System.out.println("----------------------------------------------");
		System.out.println("TreeSet");
		
		Set<String> n = new TreeSet<String>();
		
		for(String i : nome) {
			n.add(i);
		}
		
		System.out.println(n);
	}

}
