package quizbank.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CartStorage {
	ArrayList<Cart> cartList = new ArrayList<>();
	private String cartFilename = "cartList.txt";
	private int lastNum;
	private boolean isSaved;
	
	public CartStorage() throws IOException {
		loadBookListFromFile();		
		isSaved = true;
	}
	
	private void loadBookListFromFile() throws IOException {
		FileReader fr;
		try {
			fr = new FileReader(cartFilename);
			BufferedReader br = new BufferedReader(fr);
			String idStr;
			while ((idStr = br.readLine()) != null) {
				if (idStr.equals("")) continue;
				int num = Integer.parseInt(idStr);
				String id = br.readLine();
				String javaCollection = br.readLine();
				int num_java = Integer.parseInt(br.readLine());
				String algorithmsCollection = br.readLine();
				int num_algorithms = Integer.parseInt(br.readLine());
				String interfaceCollection = br.readLine();
				int num_interface = Integer.parseInt(br.readLine());
				cartList.add(new Cart(id, javaCollection, num_java, algorithmsCollection, num_algorithms, interfaceCollection, num_interface));
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException |  NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}


	public void deleteCartItem(String id) {
		cartList.remove(getCartItemById(id));
		isSaved = false;
	}

	private Object getCartItemById(String id) {
		for (Cart cart : cartList) {
			if (cart.getId() == id) {
				return cart;
			}
		}
		return null;
	}

	public void addCartItem(String id, String javaCollection, int num_java, String algorithmsCollection, int num_algorithms, String interfaceCollection, int num_interface) {
		Cart cart = new Cart(id, javaCollection, num_java, algorithmsCollection, num_algorithms, interfaceCollection, num_interface);
		cartList.add(cart);
		isSaved = false;
	}

	public boolean isSaved() {
		return isSaved;
	}
	
	public void saveBookList2File() {
		
		try {
			FileWriter fw = new FileWriter(cartFilename);
			for (Cart cart : cartList) {
				fw.write(cart.getId() + "\n");
				fw.write(cart.getJavaCollection() + "\n");
				fw.write(cart.getNum_java() + "\n");
				fw.write(cart.getAlgorithmsCollection() + "\n");
				fw.write(cart.getNum_algorithms() + "\n");
				fw.write(cart.getInterfaceCollection() + "\n");
				fw.write(cart.getNum_interface() + "\n");
			}
			fw.close();
			isSaved = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	
	public boolean isPossibleId(String id) {
		for (Cart cart : cartList) {
			if (id == cart.getId()) {
				return true;
			}
		}
		return false;
	}


	
}
