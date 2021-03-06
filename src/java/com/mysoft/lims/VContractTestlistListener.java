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
 * Listener that is notified of v_contract_testlist table changes.
 */
public interface VContractTestlistListener
// extends+ 

// extends- 
{
    /**
     * Invoked just before inserting a VContractTestlistBean record into the database.
     *
     * @param pObject the VContractTestlistBean that is about to be inserted
     */
    public void beforeInsert(VContractTestlistBean pObject) throws SQLException;


    /**
     * Invoked just after a VContractTestlistBean record is inserted in the database.
     *
     * @param pObject the VContractTestlistBean that was just inserted
     */
    public void afterInsert(VContractTestlistBean pObject) throws SQLException;


    /**
     * Invoked just before updating a VContractTestlistBean record in the database.
     *
     * @param pObject the VContractTestlistBean that is about to be updated
     */
    public void beforeUpdate(VContractTestlistBean pObject) throws SQLException;


    /**
     * Invoked just after updating a VContractTestlistBean record in the database.
     *
     * @param pObject the VContractTestlistBean that was just updated
     */
    public void afterUpdate(VContractTestlistBean pObject) throws SQLException;


// class+ 

// class- 
}
