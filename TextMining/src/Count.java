import java.util.Arrays;

public class Count {
	Convert c = new Convert();
	String countVoca [] = new String[c.Converting().size()];
	int countIndex [] = new int[c.Converting().size()];
	void counting() {
		for(int i = 0; i < c.Converting().size(); i++) {
			for(int j = 0; j < i + 1; j++) {
				if(((String)c.Converting().get(i)).equalsIgnoreCase(countVoca[j])) {
					countIndex[j]++;
				}else {
					countVoca[i] = ((String)c.Converting().get(i));
				}
			}
		}
		countIndex[0]++;
	}
}
