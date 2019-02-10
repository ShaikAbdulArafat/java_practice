package collections;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Hashtable_userdefined_generics {
public static void main(String[] args) {
	Hashtable<Integer,emp> ht=new Hashtable<>();
	ht.put(1,new emp("arafat",1334,15000));
	ht.put(2,new emp("arif",2312,100000));
	ht.put(3,new emp("aslam",1321,40000));
	System.out.println(ht);
	
	Set<Integer> num=ht.keySet();
	for(Integer nums:num)
	System.out.println(nums+"-->"+ht.get(nums));
	ht.put(4, new emp("naziya",1231,6000));
	
	emp e= new emp("naziya", 4, 6000);
	
	System.out.println("... using entryset....");
	Set<Entry<Integer, emp>> numm=ht.entrySet();
	for(Entry<Integer, emp> num1:numm){
		System.out.println(num1.getKey()+"-->"+num1.getValue());
		if(ht.contains(e)){
			System.out.println(num1.getValue());
		}
	}
	System.out.println("----------------------");
	System.out.println("size of the hash table is  :"+ht.size());
	System.out.println("is hash table empty  ?:"+ht.isEmpty());
	System.out.println("is hash table contains the value? "+ht.containsKey(4));
}
}
class emp{
	String name;
	int id;
	int sal;
	public emp(String name,int id, int sal){
		this.name=name;
		this.id=id;
		this.sal=sal;
			}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString(){
		return "Id :"+this.id+"  "+ "name :"+this.name+"  sal "+this.sal;
	}
	@Override
	public int hashCode(){
	    System.out.println("In hashcode");
        return this.getId();
    }
     
    @Override
    public boolean equals(Object obj) {
        emp e = null;
        if(obj instanceof emp){
            e = (emp) obj;
        }
        System.out.println("In equals");
        if(this.getId() == e.getId()){
            return true;
        } else {
            return false;
        }
	}
}