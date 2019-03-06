/**
 * This class implements a method that obtains an plain text
 * representation of a {@link Sales} object.
 * @author qijun xie
 * @version 1.0.0
 */
public class PlainTextSalesFormatter implements SalesFormatter {

    private final static String NEW_LINE = System.getProperty("line.separator");

    static private PlainTextSalesFormatter singletonInstance = null ;

    private PlainTextSalesFormatter() {

    }

    /**
     * Obtain the single instance of class
     * <code>PlainTextSalesFormatter</code>
     * @return the single instance of <code>PlainTextSalesFormatter</code>
     */
    static public PlainTextSalesFormatter getSingletonInstance(){
        if (singletonInstance == null)
            singletonInstance = new PlainTextSalesFormatter();
        return  singletonInstance ;
    }

    /**
     * Obtain a palin text representation of the specified Sales
     * @param sales the kinds of order
     * @return a palin text representation of the specified Sales
     */
    public String formatOrders(Sales sales){
        String out = new String();
        int i = 1 ;
        for( Order order : sales ){
            out += "------------------------" + NEW_LINE;
            out += "Order " + i + NEW_LINE + NEW_LINE;
            i++;
            double amout = 0 ;
           for( OrderItem orderItem: order){
               out += orderItem.getQuantity() + " " + orderItem.getProduct().getCode() +
                       " " + orderItem.getProduct().getPrice() + NEW_LINE ;
               amout += orderItem.getQuantity()*orderItem.getProduct().getPrice();
           }
           out += NEW_LINE + "Total = " + amout + NEW_LINE ;
        }
        return  out ;
    }
}
