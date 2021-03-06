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
 * Listener that is notified of docs table changes.
 */
public interface DocsListener
// extends+ 

// extends- 
{
    /**
     * Invoked just before inserting a DocsBean record into the database.
     *
     * @param pObject the DocsBean that is about to be inserted
     */
    public void beforeInsert(DocsBean pObject) throws SQLException;


    /**
     * Invoked just after a DocsBean record is inserted in the database.
     *
     * @param pObject the DocsBean that was just inserted
     */
    public void afterInsert(DocsBean pObject) throws SQLException;


    /**
     * Invoked just before updating a DocsBean record in the database.
     *
     * @param pObject the DocsBean that is about to be updated
     */
    public void beforeUpdate(DocsBean pObject) throws SQLException;


    /**
     * Invoked just after updating a DocsBean record in the database.
     *
     * @param pObject the DocsBean that was just updated
     */
    public void afterUpdate(DocsBean pObject) throws SQLException;


// class+ 

// class- 
}
