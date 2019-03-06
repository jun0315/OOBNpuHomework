/**
 * This class implements a method that obtains an HTML text
 * representation of a {@link Sales} object.
 * @author qijun xie
 * @version 1.0.0
 */
public class HTMLSalesFormatter implements SalesFormatter {
    private final String NEW_LINE = System.getProperty("line.separator");

    static private HTMLSalesFormatter singletonInstance = null ;

    private HTMLSalesFormatter(){

    };
    /**
     * Obtain the single instance of class
     * <code>HTMLSalesFormatter</code>
     * @return the single instance of <code>HTMLSalesFormatter</code>
     */
    static public HTMLSalesFormatter getSingletonInstance(){
        if(singletonInstance == null)
            singletonInstance = new HTMLSalesFormatter();
        return singletonInstance ;
    }
    /**
     * Obtain a HTML text representation of the specified Sales
     * @param sales the kinds of order
     * @return a HTML text representation of the specified Sales
     */
    public String formatOrders(Sales sales){
        String out = new String();
        out += "<html>" + NEW_LINE + "  " + "<body>" + NEW_LINE +
                "    <center><h2>Orders</h2></center>" + NEW_LINE ;
        for(Order order : sales){
            double amout = 0 ;
            out += "    <hr>" + NEW_LINE;
            for(OrderItem orderItem : order){
                amout += orderItem.getQuantity()*orderItem.getProduct().getPrice();
            }
            out += "    <h4>Total = " + amout +"</h4>" + NEW_LINE;
            for(OrderItem orderItem : order) {
                out += "      <p>" + NEW_LINE + "        <b>code:</b> " + orderItem.getProduct().getCode()
                        + "<br>" + NEW_LINE + "        <b>quantity:</b> " + orderItem.getQuantity()
                        + "<br>" + NEW_LINE + "        <b>price:</b> " + orderItem.getProduct().getPrice()
                        + NEW_LINE + "      </p>" + NEW_LINE;
            }
        }
        out += "  </body>" + NEW_LINE + "</html>" ;
        return out ;
    }

}
