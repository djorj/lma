// --------------------------------------------------------
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: org.postgresql.Driver
// 
// Please help us improve this tool by reporting:
//    problems,
//    suggestions,
//    feedbacks,
//    ideas,
//  to http://sourceforge.net/projects/sql2java/
// --------------------------------------------------------

package com.mysoft.lims;

import java.sql.SQLException;
// imports+ 

// imports- 


/**
 * Listener that is notified of inventory table changes.
 */
public interface InventoryListener
// extends+ 

// extends- 
{
    /**
     * Invoked just before inserting a InventoryBean record into the database.
     *
     * @param pObject the InventoryBean that is about to be inserted
     */
    public void beforeInsert(InventoryBean pObject) throws SQLException;


    /**
     * Invoked just after a InventoryBean record is inserted in the database.
     *
     * @param pObject the InventoryBean that was just inserted
     */
    public void afterInsert(InventoryBean pObject) throws SQLException;


    /**
     * Invoked just before updating a InventoryBean record in the database.
     *
     * @param pObject the InventoryBean that is about to be updated
     */
    public void beforeUpdate(InventoryBean pObject) throws SQLException;


    /**
     * Invoked just after updating a InventoryBean record in the database.
     *
     * @param pObject the InventoryBean that was just updated
     */
    public void afterUpdate(InventoryBean pObject) throws SQLException;


// class+ 

// class- 
}
