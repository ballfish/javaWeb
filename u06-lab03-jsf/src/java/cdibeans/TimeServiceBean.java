package cdibeans;

import ejb.session.TimeService;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author hychen39@gm.cyut.edu.tw
 */
@Named(value = "timeServiceBean")
@RequestScoped
public class TimeServiceBean {
    @EJB
    TimeService timeService;
    /**
     * Creates a new instance of TimeServiceBean
     */
    public TimeServiceBean() {
    }
    
    public String getCurrentTime(){
        return timeService.getTime();
    }
}