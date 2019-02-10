package collections;
class Collections_Ud_Generic{
    
    private String item;
    private int price;
     
    public Collections_Ud_Generic(String itm, int pr){
        this.item = itm;
        this.price = pr;
    }
     
    @Override
	public int hashCode(){
        System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = price*20;
        hashcode += item.hashCode();
        return hashcode;
    }
     
    @Override
	public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof Collections_Ud_Generic) {
        	Collections_Ud_Generic pp = (Collections_Ud_Generic) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
            }
     public static void main(String[] args) {
    	 Collections_Ud_Generic p=new Collections_Ud_Generic("arafat", 2);
		p.hashCode();
		p.equals(p);
			}
}
