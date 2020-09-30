package Bitmasking;

public class Poweroffour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfFour(8));

	}
	public static  boolean isPowerOfFour(int n) {
        if(n==0){
            return n!=0;
        }
        while((n&1)!=1 && n>=1){
            n>>=1;
            if((n&1)==1){
                return false;
            }
            n>>=1;
        }
        return n==1;
        
    }
}
