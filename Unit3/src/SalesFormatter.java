/**
 * the interface defines a method that obtain the String representation of a
 * {@link Sales} object.
 *
 * @author qijun xie
 * @version 1.0.0
 * @see Sales
 */
public interface SalesFormatter {
    /**
     * Obtains the string representation of the specified kinds of order
     * @param sales the kinds of order
     * @return the string representation of the specified orders
     */
    String formatOrders(Sales sales);
}
