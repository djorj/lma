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
 * Listener that is notified of controltype table changes.
 */
public interface ControltypeListener
// extends+ 

// extends- 
{
    /**
     * Invoked just before inserting a ControltypeBean record into the database.
     *
     * @param pObject the ControltypeBean that is about to be inserted
     */
    public void beforeInsert(ControltypeBean pObject) throws SQLException;


    /**
     * Invoked just after a ControltypeBean record is inserted in the database.
     *
     * @param pObject the ControltypeBean that was just inserted
     */
    public void afterInsert(ControltypeBean pObject) throws SQLException;


    /**
     * Invoked just before updating a ControltypeBean record in the database.
     *
     * @param pObject the ControltypeBean that is about to be updated
     */
    public void beforeUpdate(ControltypeBean pObject) throws SQLException;


    /**
     * Invoked just after updating a ControltypeBean record in the database.
     *
     * @param pObject the ControltypeBean that was just updated
     */
    public void afterUpdate(ControltypeBean pObject) throws SQLException;


// class+ 

// class- 
}
