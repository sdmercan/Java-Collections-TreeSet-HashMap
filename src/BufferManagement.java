import java.util.HashMap;
import java.util.TreeSet;

public class BufferManagement implements Methods<Object> {

	HashMap<Integer,Object> bufferIDMap=new HashMap<>();
	
	@Override
	public void put(int bufferID,Object object) {
		bufferIDMap.put(bufferID,object);
	}

	@Override
	public void remove(int bufferID) {
		bufferIDMap.remove(bufferID);
	}
	
	@Override
	public void checkForNewElement(Object object) {
		TreeSet<Integer> set=new TreeSet<>(bufferIDMap.keySet());
		remove(set.first());
		put(set.last()+1,object);
	}
	
	@Override
	public void replace(Object object) {
		TreeSet<Integer> set=new TreeSet<>(bufferIDMap.keySet());
		for (Integer integer : set) {
			if(bufferIDMap.get(integer).equals(object)) {
				remove(integer);
			}
		}
		put(set.last()+1,object);
		
	}
	
	@Override
	public void print() {
		System.out.println(bufferIDMap);
	}
	
	@Override
	public boolean contains(Object object) {
		if(bufferIDMap.containsValue(object)) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return bufferIDMap.size();
	}

}