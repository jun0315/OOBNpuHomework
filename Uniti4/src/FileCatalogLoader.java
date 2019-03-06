import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/**
 * Creates a catalog and loads it with data stored in
 * a file.
 *
 * @author qijun xie
 * @version  1.0.0
 */
public class FileCatalogLoader implements CatalogLoader {
    private static final String PureMike_PREFIX = "PureMilk";
    private static final String Jelly_PREFIX = "Jelly";
    private static final String Yogurt_PREFIX = "Yogurt";
    private static final String MilkDrink_PREFIX = "MilkDrink";
    private static final String Delim = "_";

    /**
     * Loads the information in the specified file into a catalog and return the catalog
     * @param filename the name of a file that contains catalog information
     * @return a product catalog
     * @throws FileNotFoundException if the specified file does not  exist.
     * @throws IOException if there is an error reading the
     * 	 *                     information in the specified file.
     * @throws DataFormatException if the specified file contains malformed data
     * @throws ParseException if the Data conversion is wrong
     */
    public Catalog loadCatalog(String filename) throws FileNotFoundException,
            IOException, DataFormatException,ParseException  {

        Catalog catalog = new Catalog();

        List<Product> productLists = new ArrayList<Product>() ;

        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line = reader.readLine();

        while (line != null) {
            Product product = null;
            if (line.startsWith(PureMike_PREFIX)) {
                product = readPuerMike(line);
            } else if (line.startsWith(Jelly_PREFIX)) {
                product = readJelly(line) ;
            } else if (line.startsWith(Yogurt_PREFIX)) {
                product = readYogurt(line);
            } else if (line.startsWith(MilkDrink_PREFIX)) {
                product = readMilkDrink(line);
            } else {
                throw new DataFormatException(line);
            }

            productLists.add(product);

            line = reader.readLine();
        }

        catalog.setProductList(productLists);
        return  catalog ;
    }

    /**
     *Extracts the PureMike data in the specified line and returns
     * a{@link PureMilk} object that encapsulates the PureMike data
     * @param line a string that contains PureMike data
     * @return a PureMike object that encapsulates the PureMike data in the specified line
     * @throws DataFormatException if the line contains errors.
     * @throws ParseException if the Data conversion is wrong
     */
    private PureMilk readPuerMike(String line) throws DataFormatException,
            ParseException {
        StringTokenizer st = new StringTokenizer(line, Delim);

        if (st.countTokens() != 9) {

            throw new DataFormatException(line);
        } else {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            String s = st.nextToken();

            return new PureMilk(st.nextToken(), st.nextToken(), new BigDecimal(st.nextToken()),
                    sdf.parse(st.nextToken()), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
        }
    }
    /**
     *Extracts the Jelly data in the specified line and returns
     * a{@link Jelly} object that encapsulates the Jelly data
     * @param line a string that contains PureMike data
     * @return a Jelly object that encapsulates the Jelly data in the specified line
     * @throws DataFormatException if the line contains errors.
     * @throws ParseException if the Data conversion is wrong
     */
    private Jelly readJelly(String line) throws DataFormatException,
            ParseException {

        StringTokenizer st = new StringTokenizer(line, Delim);

        if (st.countTokens() != 8) {
            throw new DataFormatException(line);
        } else {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            String s = st.nextToken();

            return new Jelly(st.nextToken(), st.nextToken(), new BigDecimal(st.nextToken()),
                    sdf.parse(st.nextToken()), st.nextToken(), st.nextToken(), st.nextToken());
        }
    }
    /**
     *Extracts the Yogurt data in the specified line and returns
     * a{@link Yogurt} object that encapsulates the PureMike data
     * @param line a string that contains PureMike data
     * @return a Yogurt object that encapsulates the Yogurt data in the specified line
     * @throws DataFormatException if the line contains errors.
     * @throws ParseException if the Data conversion is wrong
     */
    private Yogurt readYogurt(String line) throws DataFormatException,
            ParseException {

        StringTokenizer st = new StringTokenizer(line, Delim);

        if (st.countTokens() != 7) {
            throw new DataFormatException(line);
        } else {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            String s = st.nextToken();

            return new Yogurt(st.nextToken(), st.nextToken(), new BigDecimal(st.nextToken()),
                    sdf.parse(st.nextToken()), st.nextToken(), st.nextToken());
        }
    }
    /**
     *Extracts the MilkDrink data in the specified line and returns
     * a{@link MilkDrink} object that encapsulates the PureMike data
     * @param line a string that contains PureMike data
     * @return a MilkDrink object that encapsulates the MilkDrink data in the specified line
     * @throws DataFormatException if the line contains errors.
     * @throws ParseException if the Data conversion is wrong
     */
    private MilkDrink readMilkDrink(String line) throws DataFormatException,
            ParseException {

        StringTokenizer st = new StringTokenizer(line, Delim);

        if (st.countTokens() != 8) {
            throw new DataFormatException(line);
        } else {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            String s = st.nextToken();

            return new MilkDrink(st.nextToken(), st.nextToken(), new BigDecimal(st.nextToken()),
                    sdf.parse(st.nextToken()), st.nextToken(),st.nextToken(), st.nextToken());
        }
    }

}

