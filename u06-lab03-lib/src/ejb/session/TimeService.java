/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session;

import javax.ejb.Remote;

/**
 *
 * @author steven
 */
@Remote
public interface TimeService {
    public String getTime();
}
