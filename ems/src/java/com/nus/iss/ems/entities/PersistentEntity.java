
package com.nus.iss.ems.entities;

import java.io.Serializable;

/**
 *
 * @author Dr. Spock (spock at dev.java.net)
 */
public interface PersistentEntity<PK extends Serializable> extends Serializable {

    PK getId();

    boolean isNew();
    
}
