package ejb;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Portable JNDI names for EJB TimeServiceBean: 
 * [java:global/u06_time_service_ejb/TimeServiceBean, 
 * java:global/u06_time_service_ejb/TimeServiceBean!ejb3.session.TimeService]
 * @author steven
 */
@Stateless
//expose the public methods to local views
@LocalBean
public class TimeServiceEJB{

    public String getTime() {
//        Java SE 7
//        Formatter fmt = new Formatter();
//        Calendar cal = Calendar.getInstance();
//        fmt.format("%tr", cal);
        
        // New DateTime API in Java SE 8
        LocalDateTime current = LocalDateTime.now(); // get the current date
        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String dataTimeStr = current.format(df);
        return dataTimeStr;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}