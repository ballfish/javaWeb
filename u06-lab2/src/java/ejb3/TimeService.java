/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb3;
import javax.ejb.Remote;
/**
 *
 * @author a0938
 */
@Remote
public interface TimeService {
    public String getTime();
}
