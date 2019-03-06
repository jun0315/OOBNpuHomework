/**
 * This class implements a method that obtains an XML
 * representation of a {@link Sales} object.
 * @author qijun xie
 * @version 1.0.0
 */
public class XMLSalesFormatter implements SalesFormatter {
    private final static String NEW_LINE = System.getProperty("line.separator");

    static private XMLSalesFormatter singletonInstance = null ;

    private XMLSalesFormatter(){

    }
    /**
     * Obtain the single instance of class
     * <code>XMLSalesFormatter</code>
     * @return the single instance of <code>XMLSalesFormatter</code>
     */
    public static XMLSalesFormatter getSingletonInstance(){
        if(singletonInstance == null)
            singletonInstance = new XMLSalesFormatter();
        return singletonInstance ;
    }
    /**
     * Obtain a XML text representation of the specified Sales
     * @param sales the kinds of order
     * @return a XML text representation of the specified Sales
     */
    public String formatOrders(Sales sales){
        String out = new String();
        out += "<Sales>" + NEW_LINE ;
        for(Order order : sales){
            double amout = 0 ;
            for(OrderItem orderItem : order){
                amout += orderItem.getQuantity()*orderItem.getProduct().getPrice();
            }
            out += "  <Order total=\"" + amout + "\">" + NEW_LINE;
            for (OrderItem orderItem : order){
                out += "    <OrderItem quantity=\"" + orderItem.getQuantity()
                        + "\" price=\"" + orderItem.getProduct().getPrice()
                        + "\">" + orderItem.getProduct().getCode()
                        + "</OrderItem>" + NEW_LINE ;
            }
            out += "  </Order>" + NEW_LINE ;
        }
        out += "</Sales>" + NEW_LINE ;
        return  out ;
    }

}
