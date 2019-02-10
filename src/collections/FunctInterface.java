package collections;

public interface FunctInterface {

	public int getMethodData(String methodName, int hashcode);
	
	public default String getString(String s){
		return s;
		
	}
}
