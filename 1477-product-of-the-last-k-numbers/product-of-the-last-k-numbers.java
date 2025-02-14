class ProductOfNumbers {

    ArrayList<Integer> res;
    public ProductOfNumbers() {
        res=new ArrayList<>();
        
    }
    
    public void add(int num) {
        res.add(num);
        
    }
    
    public int getProduct(int k) {
        int i=res.size()-1;
        int product=1;
        while(k-->0){
            product*=res.get(i);
            i--;
        }
        return product;
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */