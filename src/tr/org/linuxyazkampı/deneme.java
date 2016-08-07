package tr.org.linuxyazkampı;

public class deneme {
	private static final double PI = 3.14;
	int yaricap;
	static double daireninAlanı;
	
	double alanBul(int r){
		int yaricap=r;
		daireninAlanı=PI*yaricap*yaricap;
		return daireninAlanı;
	}

	public static void main(String[] args){
		deneme d1=new deneme();
		daireninAlanı=d1.alanBul(5);
		System.out.println(daireninAlanı);
		System.out.println(deneme.daireninAlanı);
		System.out.println(d1.daireninAlanı);
		
	}
}
