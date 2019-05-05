package arrays;

public class CoinsJar {
	public static void main(String[] args) {
		int []coinsJar= {10,25,10,25,10,5,5,10};
		
		int quarters,nickles,dimes;
		quarters=nickles=dimes=0;
		for (int coin : coinsJar) {
			switch(coin) {
			case 5: nickles++;
			break;
			case 10: dimes++;
			break;
			case 25: quarters++;
			}
		}
		System.out.println("In coinsJar we have "+ nickles+"nickles" + dimes +"dimes"+"quarers"+ quarters);
		
	}

}
