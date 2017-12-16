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
 * Listener that is notified of trlib table changes.
 */
public interface TrlibListener
// extends+ 

// extends- 
{
    /**
     * Invoked just before inserting a TrlibBean record into the database.
     *
     * @param pObject the TrlibBean that is about to be inserted
     */
    public void beforeInsert(TrlibBean pObject) throws SQLException;


    /**
     * Invoked just after a TrlibBean record is inserted in the database.
     *
     * @param pObject the TrlibBean that was just inserted
     */
    public void afterInsert(TrlibBean pObject) throws SQLException;


    /**
     * Invoked just before updating a TrlibBean record in the database.
     *
     * @param pObject the TrlibBean that is about to be updated
     */
    public void beforeUpdate(TrlibBean pObject) throws SQLException;


    /**
     * Invoked just after updating a TrlibBean record in the database.
     *
     * @param pObject the TrlibBean that was just updated
     */
    public void afterUpdate(TrlibBean pObject) throws SQLException;


// class+ 

// class- 
}