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
 * Listener that is notified of devicelabtest table changes.
 */
public interface DevicelabtestListener
// extends+ 

// extends- 
{
    /**
     * Invoked just before inserting a DevicelabtestBean record into the database.
     *
     * @param pObject the DevicelabtestBean that is about to be inserted
     */
    public void beforeInsert(DevicelabtestBean pObject) throws SQLException;


    /**
     * Invoked just after a DevicelabtestBean record is inserted in the database.
     *
     * @param pObject the DevicelabtestBean that was just inserted
     */
    public void afterInsert(DevicelabtestBean pObject) throws SQLException;


    /**
     * Invoked just before updating a DevicelabtestBean record in the database.
     *
     * @param pObject the DevicelabtestBean that is about to be updated
     */
    public void beforeUpdate(DevicelabtestBean pObject) throws SQLException;


    /**
     * Invoked just after updating a DevicelabtestBean record in the database.
     *
     * @param pObject the DevicelabtestBean that was just updated
     */
    public void afterUpdate(DevicelabtestBean pObject) throws SQLException;


// class+ 

// class- 
}
