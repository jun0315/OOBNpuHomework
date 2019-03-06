public class Product {
    private String code ;
    private String description ;
    private String price ;

    public String getCode(){
        return this.code ;
    }
    public String getDescription(){
        return this.description ;
    }
    public String getPrice(){
        return this.price ;
    }
    public boolean equals(Object o){
        if(o instanceof Product){
            ....
        }
        else return
    }
}
