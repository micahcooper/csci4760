
package dmeReviews;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_01-b59-fcs
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "ReviewListService", targetNamespace = "http://cs4300/", wsdlLocation = "http://zion.cs.uga.edu:8081/dmeReviews/ReviewListService?wsdl")
public class ReviewListService
    extends Service
{

    private final static URL REVIEWLISTSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://zion.cs.uga.edu:8081/dmeReviews/ReviewListService?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        REVIEWLISTSERVICE_WSDL_LOCATION = url;
    }

    public ReviewListService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReviewListService() {
        super(REVIEWLISTSERVICE_WSDL_LOCATION, new QName("http://cs4300/", "ReviewListService"));
    }

    /**
     * 
     * @return
     *     returns ReviewList
     */
    @WebEndpoint(name = "ReviewListPort")
    public ReviewList getReviewListPort() {
        return (ReviewList)super.getPort(new QName("http://cs4300/", "ReviewListPort"), ReviewList.class);
    }

}