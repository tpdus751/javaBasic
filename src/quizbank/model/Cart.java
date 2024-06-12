package quizbank.model;

public class Cart {
	public String id;
	private String javaCollection; 
	private int num_java;
	private String algorithmsCollection;
	private int num_algorithms;
	private String interfaceCollection;
	private int num_interface;
	CustomerStorage customerStorage;
	
	public Cart(String id, String javaCollection, int num_java, String algorithmsCollection, int num_algorithms,
			String interfaceCollection, int num_interface) {
		this.id = id;
		this.javaCollection = javaCollection;
		this.num_java = num_java;
		this.algorithmsCollection = algorithmsCollection;
		this.num_algorithms = num_algorithms;
		this.interfaceCollection = interfaceCollection;
		this.num_interface = num_interface;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getJavaCollection() {
		return javaCollection;
	}

	public void setJavaCollection(String javaCollection) {
		this.javaCollection = javaCollection;
	}

	public int getNum_java() {
		return num_java;
	}

	public void setNum_java(int num_java) {
		this.num_java = num_java;
	}

	public String getAlgorithmsCollection() {
		return algorithmsCollection;
	}

	public void setAlgorithmsCollection(String algorithmeCollection) {
		this.algorithmsCollection = algorithmsCollection;
	}

	public int getNum_algorithms() {
		return num_algorithms;
	}

	public void setNum_algorithms(int num_algorithms) {
		this.num_algorithms = num_algorithms;
	}

	public String getInterfaceCollection() {
		return interfaceCollection;
	}

	public void setInterfaceCollection(String interfaceCollection) {
		this.interfaceCollection = interfaceCollection;
	}

	public int getNum_interface() {
		return num_interface;
	}

	public void setNum_interface(int num_interface) {
		this.num_interface = num_interface;
	}
	
	
}
