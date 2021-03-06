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
 * Listener that is notified of reportform table changes.
 */
public interface ReportformListener
// extends+ 

// extends- 
{
    /**
     * Invoked just before inserting a ReportformBean record into the database.
     *
     * @param pObject the ReportformBean that is about to be inserted
     */
    public void beforeInsert(ReportformBean pObject) throws SQLException;


    /**
     * Invoked just after a ReportformBean record is inserted in the database.
     *
     * @param pObject the ReportformBean that was just inserted
     */
    public void afterInsert(ReportformBean pObject) throws SQLException;


    /**
     * Invoked just before updating a ReportformBean record in the database.
     *
     * @param pObject the ReportformBean that is about to be updated
     */
    public void beforeUpdate(ReportformBean pObject) throws SQLException;


    /**
     * Invoked just after updating a ReportformBean record in the database.
     *
     * @param pObject the ReportformBean that was just updated
     */
    public void afterUpdate(ReportformBean pObject) throws SQLException;


// class+ 

// class- 
}
