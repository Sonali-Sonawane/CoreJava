package programs;
import java.util.*;

public class CountTheWord {
public static void main(String[] args) {
		
		List<String> namelist = new ArrayList<>();
		namelist.add("Sonali");
		namelist.add("Silky");
		namelist.add("Sumit");
		namelist.add("Ashu");
		namelist.add("Aru");
		namelist.add("Neha");
		namelist.add("Vrushu");
		
		Long count = namelist.stream().filter(s -> s.length() > 5).count();
		System.out.println("Total name with more than 5 lenth is : "+count);  
	}
}
