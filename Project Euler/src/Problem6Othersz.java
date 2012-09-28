
public class Problem6Othersz {

	

	public static void main(String[] args){
	
	int test = 2 % 2;
	System.out.println(test);
	
	
	for(long i=1;i<Long.MAX_VALUE;i++) {
        int count=0;
        for(int j=1;j<=20;j++) {
           if(i%j==0) {
              count++;
              if(count==20) {
                 System.out.print(i);
                 System.exit(0);
              }
           } else {
              break;
           }
              
        }
        
	}
	}
}
