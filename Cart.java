import java.util.HashMap;
import java.util.Map;

public class Cart{
	HashMap<String, Integer> cart = new HashMap<String, Integer>();

	public void tambahProduk(String kodeProduk, int kuantitas){
		if(cart.containsKey(kodeProduk)){
			cart.put(kodeProduk, cart.get(kodeProduk) + kuantitas);
		} else{
			cart.put(kodeProduk, kuantitas);
		}
	}

	public void hapusProduk(String kodeProduk){
		if(cart.containsKey(kodeProduk)){
			cart.remove(kodeProduk);
		} else {
		}
	}

	public void tampilkanCart(){
		cart.forEach(
         	(key, value)
                -> System.out.println(key + " (" + value + ")"));
	}
}