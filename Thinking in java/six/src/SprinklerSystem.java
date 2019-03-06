class WaterSource{
    private String s ;
    WaterSource(){
        System.out.println("WaterSource()");
        s = new String("Constructed");
    }
    public String toString(){
        return s ;
    }
}
public class SprinklerSystem {
    private String valve1,valve2;
    WaterSource source ;
    int i ;
    float f ;
    void print(){
        source = new WaterSource() ;
        System.out.println("value1 = " + valve1);
        System.out.println("value = " + valve2);
        System.out.println("souce = " +source);
    }

    public static void main(String[] args) {
        SprinklerSystem x = new SprinklerSystem();
        x.print();
    }
}
