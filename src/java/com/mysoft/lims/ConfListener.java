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
 * Listener that is notified of conf table changes.
 */
public interface ConfListener
// extends+ 

// extends- 
{
    /**
     * Invoked just before inserting a ConfBean record into the database.
     *
     * @param pObject the ConfBean that is about to be inserted
     */
    public void beforeInsert(ConfBean pObject) throws SQLException;


    /**
     * Invoked just after a ConfBean record is inserted in the database.
     *
     * @param pObject the ConfBean that was just inserted
     */
    public void afterInsert(ConfBean pObject) throws SQLException;


    /**
     * Invoked just before updating a ConfBean record in the database.
     *
     * @param pObject the ConfBean that is about to be updated
     */
    public void beforeUpdate(ConfBean pObject) throws SQLException;


    /**
     * Invoked just after updating a ConfBean record in the database.
     *
     * @param pObject the ConfBean that was just updated
     */
    public void afterUpdate(ConfBean pObject) throws SQLException;


// class+ 

// class- 
}