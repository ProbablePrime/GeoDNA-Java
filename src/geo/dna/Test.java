package geo.dna;

class Wait {
	  public static void oneSec() {
	    try {
	      Thread.currentThread().sleep(1000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }

	  public static void manySec(long s) {
	    try {
	      Thread.currentThread().sleep(s * 1000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }
	}

public class Test {
	public static void main(String[] args) {
		String wellington = GeoDNA.encode( -41.288889, 174.777222);
		if( wellington.equals("etctttagatagtgacagtcta")) System.out.println("Wellington's DNA is correct" );
		System.out.println(wellington);
		Wait.manySec(5);
		/*double[] bits = GeoDNA.decode( wellington );
		ok ( value_is_near( bits[0], -41.288889 ), "Latitude converted back correctly." );
		ok ( value_is_near( bits[1], 174.777222 ), "Longitude converted back correctly." );*/
	}
}
