package easy;

public class gugudan {
	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				int result=i*j;
				System.out.println(i+"*"+j+"="+ result);
				if(j==9) {
					System.out.println("=======");
				}
			}
		}
	
	}
}