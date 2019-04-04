package sort;
import sort.Hilfe;
public class Main {

	
	private int[] s;
	
	
	public Main() {
		s = new int[50];
		for(int i = 0;i<50;i++) {
			s[i] = Hilfe.zufall(0, 50);
		}
		
		print(gnomesort(s));
	}
	
	
	
	public static void main(String[] args) {
		Main m;
		m = new Main();
	}
	
	public int[] gnomesort(int[] l) {
		int[] p = l;
		int n = 0;
		
		while(!(n==49)) {

			if(p[n]<=p[n+1]) {
				n++;
			}else {
				int t1 = p[n];
				int t2 = p[n+1];
				p[n]=t2;
				p[n+1]=t1;
				if(!(n==0)) {
						n--;
				}
				}
			}

		return p;
		}

	
	
	public void print(int[] l) {
		for(int i = 0;i<l.length;i++) {
			System.out.println(l[i]);
		}
	}

}
