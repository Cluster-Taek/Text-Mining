import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Minumum Frequency : ");
		int frequency = sc.nextInt();
		String filter [] = {"your","you","my"," ","Question","Answer",". ","for","in","a","the","and","or","is","of","this","\r","to","as","it","so","0","1","2","3","4","5","6","7","8","9"};
		Convert c = new Convert();
		Count count = new Count();
		boolean big = true;
		String printing [][] = new String[c.Converting().size()][2];
		count.counting();
		for(int i = 0; i < count.countIndex.length; i++) {
			for(int j = i + 1; j < count.countIndex.length; j++) {
				if(count.countIndex[i] < count.countIndex[j]) {
					int tmep = count.countIndex[i];
					count.countIndex[i] = count.countIndex[j];
					count.countIndex[j] = tmep;
					String tmepS = count.countVoca[i];
					count.countVoca[i] = count.countVoca[j];
					count.countVoca[j] = tmepS;
				}
			}
		}
		for(int i = 0; i < c.Converting().size(); i++) {
			printing[i][0] = count.countVoca[i];
			printing[i][1] = String.valueOf(count.countIndex[i]);
		}
		System.out.println("-----KeyWord-----");
		for(int i = 0; i < c.Converting().size(); i++) {
			big = true;
			for(int j = 0; j < c.Converting().size(); j++) {
				if((printing[i][0].equalsIgnoreCase(printing[j][0]))&&(Integer.parseInt(printing[i][1]) < Integer.parseInt(printing[j][1]))) {
					big = false;
				}
				for(int k = 0; k < filter.length; k++) {
					if(printing[i][0].equalsIgnoreCase(filter[k])) {
						big = false;
					}
				}
			}
			if(big) {
				if(Integer.parseInt(printing[i][1]) >= frequency) {
					System.out.println(printing[i][0] + " : " + printing[i][1]);
				}
			}
		}
		System.out.println("-----------------");
	}
}
