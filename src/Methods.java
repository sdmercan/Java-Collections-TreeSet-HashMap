
public interface Methods<TYPE>{
	
	void put(int id,TYPE type);
	void remove(int id);
	void checkForNewElement(TYPE type);
	void replace(TYPE type);
	void print();
	boolean contains(TYPE type);
	int size();
	
}