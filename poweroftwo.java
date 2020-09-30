package Bitmasking;

public class poweroftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(5));

	}
	public static boolean isPowerOfTwo(int n) {
        if(n==0){
            return n!=0;
        }
       while((n&1)!=1){
           n>>=1;
       }
        return n==1;
       
    }

}
