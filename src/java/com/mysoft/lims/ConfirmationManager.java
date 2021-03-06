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

import java.sql.*;
// imports+ 

// imports- 

/**
 * Handles database calls for the confirmation table.
 */
public class ConfirmationManager
// extends+ 

// extends- 
{

    /**
     * Column confirmationid of type Types.BIGINT mapped to Long.
     */
    public static final int ID_CONFIRMATIONID = 0;
    public static final int TYPE_CONFIRMATIONID = Types.BIGINT;
    public static final String NAME_CONFIRMATIONID = "confirmationid";

    /**
     * Column contractsampleitemid of type Types.BIGINT mapped to Long.
     */
    public static final int ID_CONTRACTSAMPLEITEMID = 1;
    public static final int TYPE_CONTRACTSAMPLEITEMID = Types.BIGINT;
    public static final String NAME_CONTRACTSAMPLEITEMID = "contractsampleitemid";

    /**
     * Column status of type Types.BIT mapped to Boolean.
     */
    public static final int ID_STATUS = 2;
    public static final int TYPE_STATUS = Types.BIT;
    public static final String NAME_STATUS = "status";

    /**
     * Column regbyid of type Types.INTEGER mapped to Integer.
     */
    public static final int ID_REGBYID = 3;
    public static final int TYPE_REGBYID = Types.INTEGER;
    public static final String NAME_REGBYID = "regbyid";

    /**
     * Column regdate of type Types.TIMESTAMP mapped to java.sql.Timestamp.
     */
    public static final int ID_REGDATE = 4;
    public static final int TYPE_REGDATE = Types.TIMESTAMP;
    public static final String NAME_REGDATE = "regdate";


    private static final String TABLE_NAME = "confirmation";

    /**
     * Create an array of type string containing all the fields of the confirmation table.
     */
    private static final String[] FIELD_NAMES = 
    {
        "confirmation.confirmationid"
        ,"confirmation.contractsampleitemid"
        ,"confirmation.status"
        ,"confirmation.regbyid"
        ,"confirmation.regdate"
    };

    /**
     * Field that contains the comma separated fields of the confirmation table.
     */
    private static final String ALL_FIELDS = "confirmation.confirmationid"
                            + ",confirmation.contractsampleitemid"
                            + ",confirmation.status"
                            + ",confirmation.regbyid"
                            + ",confirmation.regdate";

    private static ConfirmationManager singleton = new ConfirmationManager();

    /**
     * Get the ConfirmationManager singleton.
     *
     * @return ConfirmationManager 
     */
    synchronized public static ConfirmationManager getInstance()
    {
        return singleton;
    }

    /**
     * Sets your own ConfirmationManager instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(ConfirmationManager instance)
    {
        singleton = instance;
    }


    /**
     * Creates a new ConfirmationBean instance.
     *
     * @return the new ConfirmationBean 
     */
    public ConfirmationBean createConfirmationBean()
    {
        return new ConfirmationBean();
    }

    //////////////////////////////////////
    // PRIMARY KEY METHODS
    //////////////////////////////////////

    /**
     * Loads a ConfirmationBean from the confirmation using its key fields.
     *
     * @return a unique ConfirmationBean 
     */
    //12
    public ConfirmationBean loadByPrimaryKey(Long confirmationid) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM confirmation WHERE confirmation.confirmationid=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Manager.setLong(ps, 1, confirmationid);
            ConfirmationBean pReturn[] = loadByPreparedStatement(ps);
            if (pReturn.length < 1)
                return null;
            else
                return pReturn[0];
        }
        finally
        {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Deletes rows according to its keys.
     *
     * @return the number of deleted rows
     */
    //60
    public int deleteByPrimaryKey(Long confirmationid) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        try
        {
            c = getConnection();
            ps = c.prepareStatement("DELETE from confirmation WHERE confirmation.confirmationid=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Manager.setLong(ps, 1, confirmationid);
            return ps.executeUpdate();
        }
        finally
        {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    
    
    //////////////////////////////////////
    // FOREIGN KEY METHODS 
    //////////////////////////////////////

    /**
     * Loads ConfirmationBean array from the confirmation table using its contractsampleitemid field.
     *
     * @return an array of ConfirmationBean 
     */
    // LOAD BY IMPORTED KEY
    public ConfirmationBean[] loadByContractsampleitemid(Long value) throws SQLException 
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM confirmation WHERE contractsampleitemid=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Manager.setLong(ps, 1, value);
            return loadByPreparedStatement(ps);
        }
        finally
        {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Deletes from the confirmation table by contractsampleitemid field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    // DELETE BY IMPORTED KEY
    public int deleteByContractsampleitemid(Long value) throws SQLException 
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM confirmation WHERE contractsampleitemid=?");
            Manager.setLong(ps, 1, value);
            return ps.executeUpdate();
        }
        finally
        {
            getManager().close(ps);
            freeConnection(c);
        }
    }



    //////////////////////////////////////
    // GET/SET FOREIGN KEY BEAN METHOD
    //////////////////////////////////////
    /**
     * Retrieves the ContractsampleitemBean object from the confirmation.contractsampleitemid field.
     *
     * @param pObject the ConfirmationBean 
     * @return the associated ContractsampleitemBean pObject
     */
    // GET IMPORTED
    public ContractsampleitemBean getContractsampleitemBean(ConfirmationBean pObject) throws SQLException
    {
        ContractsampleitemBean other = ContractsampleitemManager.getInstance().createContractsampleitemBean();
        other.setContractsampleitemid(pObject.getContractsampleitemid());
        return ContractsampleitemManager.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the ConfirmationBean object to the ContractsampleitemBean object.
     *
     * @param pObject the ConfirmationBean object to use
     * @param pObjectToBeSet the ContractsampleitemBean object to associate to the ConfirmationBean 
     * @return the associated ContractsampleitemBean pObject
     */
    // SET IMPORTED
    public ConfirmationBean setContractsampleitemBean(ConfirmationBean pObject,ContractsampleitemBean pObjectToBeSet)
    {
        pObject.setContractsampleitemid(pObjectToBeSet.getContractsampleitemid());
        return pObject;
    }



    //////////////////////////////////////
    // LOAD ALL
    //////////////////////////////////////

    /**
     * Loads all the rows from confirmation.
     *
     * @return an array of ConfirmationManager pObject
     */
    //38
    public ConfirmationBean[] loadAll() throws SQLException 
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM confirmation",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps);
        }
        finally
        {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    //////////////////////////////////////
    // SQL 'WHERE' METHOD
    //////////////////////////////////////
    /**
     * Retrieves an array of ConfirmationBean given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting ConfirmationBean table 
     */
    //49
    public ConfirmationBean[] loadByWhere(String where) throws SQLException
    {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves an array of ConfirmationBean given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting ConfirmationBean table 
     */
    //51
    public ConfirmationBean[] loadByWhere(String where, int[] fieldList) throws SQLException
    {
        String sql = null;
        if(fieldList == null)
            sql = "select " + ALL_FIELDS + " from confirmation " + where;
        else
        {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++)
            {
                if(i != 0)
                    buff.append(",");
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from confirmation ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        java.util.ArrayList v = null;
        try 
        {
            c = getConnection();
            pStatement = c.createStatement();
            rs =  pStatement.executeQuery(sql);
            v = new java.util.ArrayList();
            while(rs.next())
            {
                if(fieldList == null)
                    v.add(decodeRow(rs));
                else
                    v.add(decodeRow(rs, fieldList));
            }

            return (ConfirmationBean[])v.toArray(new ConfirmationBean[0]);
        }
        finally
        {
            if (v != null) { v.clear(); }
            getManager().close(pStatement, rs);
            freeConnection(c);
        }
    }


    /**
     * Deletes all rows from confirmation table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException
    {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the confirmation table using a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     * <br>Attention, if 'WHERE' is omitted it will delete all records. 
     *
     * @param where the sql 'where' clause
     * @return the number of deleted rows
     */
    public int deleteByWhere(String where) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;

        try
        {
            c = getConnection();
            String delByWhereSQL = "DELETE FROM confirmation " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        }
        finally
        {
            getManager().close(ps);
            freeConnection(c);
        }
    }



    ///////////////////////////////////////////////////////////////////////
    // SAVE 
    ///////////////////////////////////////////////////////////////////////
    /**
     * Saves the ConfirmationBean pObject into the database.
     *
     * @param pObject the ConfirmationBean pObject to be saved
     */
    //100
    public ConfirmationBean save(ConfirmationBean pObject) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        try
        {
            c = getConnection();
            if (pObject.isNew())
            { // SAVE 
                if (!pObject.isConfirmationidModified())
                {
                    ps = c.prepareStatement("SELECT nextval('confirmationid_seq')");
                    ResultSet rs = null;
                    try
                    {
                        rs = ps.executeQuery();
                        if(rs.next())
                            pObject.setConfirmationid(Manager.getLong(rs, 1));
                        else
                            getManager().log("ATTENTION: Could not retrieve generated key!");
                    }
                    finally
                    {
                        getManager().close(ps, rs);
                        ps=null;
                    }
                }
                beforeInsert(pObject); // listener callback
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into confirmation (");
    
                if (pObject.isConfirmationidModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("confirmationid");
                    _dirtyCount++;
                }

                if (pObject.isContractsampleitemidModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("contractsampleitemid");
                    _dirtyCount++;
                }

                if (pObject.isStatusModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("status");
                    _dirtyCount++;
                }

                if (pObject.isRegbyidModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("regbyid");
                    _dirtyCount++;
                }

                if (pObject.isRegdateModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("regdate");
                    _dirtyCount++;
                }

                _sql.append(") values (");
                if(_dirtyCount > 0) {
                    _sql.append("?");
                    for(int i = 1; i < _dirtyCount; i++) {
                        _sql.append(",?");
                    }
                }
                _sql.append(")");

                ps = c.prepareStatement(_sql.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                _dirtyCount = 0;

                if (pObject.isConfirmationidModified()) {
                    Manager.setLong(ps, ++_dirtyCount, pObject.getConfirmationid());
                }
    
                if (pObject.isContractsampleitemidModified()) {
                    Manager.setLong(ps, ++_dirtyCount, pObject.getContractsampleitemid());
                }
    
                if (pObject.isStatusModified()) {
                    Manager.setBoolean(ps, ++_dirtyCount, pObject.getStatus());
                }
    
                if (pObject.isRegbyidModified()) {
                    Manager.setInteger(ps, ++_dirtyCount, pObject.getRegbyid());
                }
    
                if (pObject.isRegdateModified()) {
                    ps.setTimestamp(++_dirtyCount, pObject.getRegdate());
                }
    
                ps.executeUpdate();
    
                pObject.isNew(false);
                pObject.resetIsModified();
                afterInsert(pObject); // listener callback
            }
            else 
            { // UPDATE 
                beforeUpdate(pObject); // listener callback
                _sql = new StringBuffer("UPDATE confirmation SET ");
                boolean useComma=false;

                if (pObject.isConfirmationidModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("confirmationid").append("=?");
                }

                if (pObject.isContractsampleitemidModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("contractsampleitemid").append("=?");
                }

                if (pObject.isStatusModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("status").append("=?");
                }

                if (pObject.isRegbyidModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("regbyid").append("=?");
                }

                if (pObject.isRegdateModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("regdate").append("=?");
                }
                _sql.append(" WHERE ");
                _sql.append("confirmation.confirmationid=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isConfirmationidModified()) {
                      Manager.setLong(ps, ++_dirtyCount, pObject.getConfirmationid());
                }

                if (pObject.isContractsampleitemidModified()) {
                      Manager.setLong(ps, ++_dirtyCount, pObject.getContractsampleitemid());
                }

                if (pObject.isStatusModified()) {
                      Manager.setBoolean(ps, ++_dirtyCount, pObject.getStatus());
                }

                if (pObject.isRegbyidModified()) {
                      Manager.setInteger(ps, ++_dirtyCount, pObject.getRegbyid());
                }

                if (pObject.isRegdateModified()) {
                      ps.setTimestamp(++_dirtyCount, pObject.getRegdate());
                }
    
                if (_dirtyCount == 0) {
                     return pObject;
                }
    
                Manager.setLong(ps, ++_dirtyCount, pObject.getConfirmationid());
                ps.executeUpdate();
                pObject.resetIsModified();
                afterUpdate(pObject); // listener callback
            }
    
            return pObject;
        }
        finally
        {
            getManager().close(ps);
            freeConnection(c);
        }
    }



    /**
     * Saves an array of ConfirmationBean pObjects into the database.
     *
     * @param pObjects the ConfirmationBean pObject table to be saved
     * @return the saved ConfirmationBean array.
     */
    //65
    public ConfirmationBean[] save(ConfirmationBean[] pObjects) throws SQLException 
    {
        for (int iIndex = 0; iIndex < pObjects.length; iIndex ++){
            save(pObjects[iIndex]);
        }
        return pObjects;
    }



    ///////////////////////////////////////////////////////////////////////
    // USING TEMPLATE 
    ///////////////////////////////////////////////////////////////////////
    /**
     * Loads a unique ConfirmationBean pObject from a template one giving a c
     *
     * @param pObject the ConfirmationBean pObject to look for
     * @return the pObject matching the template
     */
    //85
    public ConfirmationBean loadUniqueUsingTemplate(ConfirmationBean pObject) throws SQLException
    {
         ConfirmationBean[] pReturn = loadUsingTemplate(pObject);
         if (pReturn.length == 0)
             return null;
         if (pReturn.length > 1)
             throw new SQLException("More than one element !!");
         return pReturn[0];
     }

    /**
     * Loads an array of ConfirmationBean from a template one.
     *
     * @param pObject the ConfirmationBean template to look for
     * @return all the ConfirmationBean matching the template
     */
    //88
    public ConfirmationBean[] loadUsingTemplate(ConfirmationBean pObject) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer where = new StringBuffer("");
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from confirmation WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try
        {
            int _dirtyCount = 0;
    
             if (pObject.isConfirmationidModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("confirmationid= ?");
             }
    
             if (pObject.isContractsampleitemidModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("contractsampleitemid= ?");
             }
    
             if (pObject.isStatusModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("status= ?");
             }
    
             if (pObject.isRegbyidModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("regbyid= ?");
             }
    
             if (pObject.isRegdateModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("regdate= ?");
             }
    
             if (_dirtyCount == 0) {
                 throw new SQLException ("The pObject to look for is invalid : not initialized !");
             }
             _sql.append(_sqlWhere);
             c = getConnection();
             ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             _dirtyCount = 0;
    
             if (pObject.isConfirmationidModified()) {
                 Manager.setLong(ps, ++_dirtyCount, pObject.getConfirmationid());
             }
    
             if (pObject.isContractsampleitemidModified()) {
                 Manager.setLong(ps, ++_dirtyCount, pObject.getContractsampleitemid());
             }
    
             if (pObject.isStatusModified()) {
                 Manager.setBoolean(ps, ++_dirtyCount, pObject.getStatus());
             }
    
             if (pObject.isRegbyidModified()) {
                 Manager.setInteger(ps, ++_dirtyCount, pObject.getRegbyid());
             }
    
             if (pObject.isRegdateModified()) {
                 ps.setTimestamp(++_dirtyCount, pObject.getRegdate());
             }
    
             ps.executeQuery();
             return loadByPreparedStatement(ps);
        }
        finally
        {
            getManager().close(ps);
            freeConnection(c);
        }
    }
    /**
     * Deletes rows using a ConfirmationBean template.
     *
     * @param pObject the ConfirmationBean object(s) to be deleted
     * @return the number of deleted objects
     */
    //63
    public int deleteUsingTemplate(ConfirmationBean pObject) throws SQLException
    {
        if (pObject.isConfirmationidInitialized())
            return deleteByPrimaryKey(pObject.getConfirmationid());
    
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try 
        {
            sql = new StringBuffer("DELETE FROM confirmation WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isConfirmationidInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("confirmationid").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isContractsampleitemidInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("contractsampleitemid").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isStatusInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("status").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isRegbyidInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("regbyid").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isRegdateInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("regdate").append("=?");
                _dirtyAnd ++;
            }
    
            c = getConnection();
            ps = c.prepareStatement(sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int _dirtyCount = 0;
    
            if (pObject.isConfirmationidInitialized()) {
                Manager.setLong(ps, ++_dirtyCount, pObject.getConfirmationid());
            }
    
            if (pObject.isContractsampleitemidInitialized()) {
                Manager.setLong(ps, ++_dirtyCount, pObject.getContractsampleitemid());
            }
    
            if (pObject.isStatusInitialized()) {
                Manager.setBoolean(ps, ++_dirtyCount, pObject.getStatus());
            }
    
            if (pObject.isRegbyidInitialized()) {
                Manager.setInteger(ps, ++_dirtyCount, pObject.getRegbyid());
            }
    
            if (pObject.isRegdateInitialized()) {
                ps.setTimestamp(++_dirtyCount, pObject.getRegdate());
            }
    
            int _rows = ps.executeUpdate();
            return _rows;
        }
        finally
        {
            getManager().close(ps);
            freeConnection(c);
        }
    }



    ///////////////////////////////////////////////////////////////////////
    // COUNT 
    ///////////////////////////////////////////////////////////////////////

    /**
     * Retrieves the number of rows of the table confirmation.
     *
     * @return the number of rows returned
     */
    //78
    public int countAll() throws SQLException
    {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table confirmation with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException
    {
        String sql = "select count(*) as MCOUNT from confirmation " + where;
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        try 
        {
            int iReturn = -1;    
            c = getConnection();
            pStatement = c.createStatement();
            rs =  pStatement.executeQuery(sql);
            if (rs.next())
            {
                iReturn = rs.getInt("MCOUNT");
            }
            if (iReturn != -1)
                return iReturn;
        }
        finally
        {
            getManager().close(pStatement, rs);
            freeConnection(c);
        }
       throw new SQLException("Error in countWhere");
    }

    /**
     * Retrieves the number of rows of the table confirmation with a prepared statement.
     *
     * @param ps the PreparedStatement to be used
     * @return the number of rows returned
     */
    //82
    int countByPreparedStatement(PreparedStatement ps) throws SQLException
    {
        ResultSet rs =  null;
        try 
        {
            int iReturn = -1;
            rs = ps.executeQuery();
            if (rs.next())
                iReturn = rs.getInt("MCOUNT");
            if (iReturn != -1)
                return iReturn;
        }
        finally
        {
            getManager().close(rs);
        }
       throw new SQLException("Error in countByPreparedStatement");
    }

    /**
     * Looks for the number of elements of a specific ConfirmationBean pObject given a c
     *
     * @param pObject the ConfirmationBean pObject to look for
     * @return the number of rows returned
     */
    //83
    public int countUsingTemplate(ConfirmationBean pObject) throws SQLException
    {
        StringBuffer where = new StringBuffer("");
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try
        {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from confirmation WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isConfirmationidModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("confirmationid= ?");
                }
    
                if (pObject.isContractsampleitemidModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("contractsampleitemid= ?");
                }
    
                if (pObject.isStatusModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("status= ?");
                }
    
                if (pObject.isRegbyidModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("regbyid= ?");
                }
    
                if (pObject.isRegdateModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("regdate= ?");
                }
    
                if (_dirtyCount == 0)
                   throw new SQLException ("The pObject to look is unvalid : not initialized !");
    
                _sql.append(_sqlWhere);
                c = getConnection();
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
                _dirtyCount = 0;
    
                if (pObject.isConfirmationidModified()) {
                    Manager.setLong(ps, ++_dirtyCount, pObject.getConfirmationid());
                }
    
                if (pObject.isContractsampleitemidModified()) {
                    Manager.setLong(ps, ++_dirtyCount, pObject.getContractsampleitemid());
                }
    
                if (pObject.isStatusModified()) {
                    Manager.setBoolean(ps, ++_dirtyCount, pObject.getStatus());
                }
    
                if (pObject.isRegbyidModified()) {
                    Manager.setInteger(ps, ++_dirtyCount, pObject.getRegbyid());
                }
    
                if (pObject.isRegdateModified()) {
                    ps.setTimestamp(++_dirtyCount, pObject.getRegdate());
                }
    
                return countByPreparedStatement(ps);
        }
        finally
        {
            getManager().close(ps);
            freeConnection(c);
        }
    }



    ///////////////////////////////////////////////////////////////////////
    // DECODE RESULT SET 
    ///////////////////////////////////////////////////////////////////////
    /**
     * Transforms a ResultSet iterating on the confirmation on a ConfirmationBean pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting ConfirmationBean pObject
     */
    //72
    public ConfirmationBean decodeRow(ResultSet rs) throws SQLException
    {
        ConfirmationBean pObject = createConfirmationBean();
        pObject.setConfirmationid(Manager.getLong(rs, 1));
        pObject.setContractsampleitemid(Manager.getLong(rs, 2));
        pObject.setStatus(Manager.getBoolean(rs, 3));
        pObject.setRegbyid(Manager.getInteger(rs, 4));
        pObject.setRegdate(rs.getTimestamp(5));

        pObject.isNew(false);
        pObject.resetIsModified();

        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the confirmation table on a ConfirmationBean pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting ConfirmationBean pObject
     */
    //73
    public ConfirmationBean decodeRow(ResultSet rs, int[] fieldList) throws SQLException
    {
        ConfirmationBean pObject = createConfirmationBean();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++)
        {
            switch(fieldList[i]) {
                case ID_CONFIRMATIONID:
                    ++pos;
                    pObject.setConfirmationid(Manager.getLong(rs, pos));
                    break;
                case ID_CONTRACTSAMPLEITEMID:
                    ++pos;
                    pObject.setContractsampleitemid(Manager.getLong(rs, pos));
                    break;
                case ID_STATUS:
                    ++pos;
                    pObject.setStatus(Manager.getBoolean(rs, pos));
                    break;
                case ID_REGBYID:
                    ++pos;
                    pObject.setRegbyid(Manager.getInteger(rs, pos));
                    break;
                case ID_REGDATE:
                    ++pos;
                    pObject.setRegdate(rs.getTimestamp(pos));
                    break;
            }
        }
        pObject.isNew(false);
        pObject.resetIsModified();

        return pObject;
    }

    //////////////////////////////////////
    // PREPARED STATEMENT LOADER
    //////////////////////////////////////

    /**
     * Loads all the elements using a prepared statement.
     *
     * @param ps the PreparedStatement to be used
     * @return an array of ConfirmationBean 
     */
    //41
    public ConfirmationBean[] loadByPreparedStatement(PreparedStatement ps) throws SQLException
    {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return an array of ConfirmationBean 
     */
    public ConfirmationBean[] loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException
    {
        ResultSet rs =  null;
        java.util.ArrayList v =  null;
        try
        {
            rs =  ps.executeQuery();
            v = new java.util.ArrayList();
            while(rs.next())
            {
                if(fieldList == null)
                    v.add(decodeRow(rs));
                else 
                    v.add(decodeRow(rs, fieldList));
            }
            return (ConfirmationBean[])v.toArray(new ConfirmationBean[0]);
        }
        finally
        {
            if (v != null) { v.clear(); v = null;}
            getManager().close(rs);
        }
    }

    ///////////////////////////////////////////////////////////////////////
    // LISTENER 
    ///////////////////////////////////////////////////////////////////////
    private ConfirmationListener listener = null;

    /**
     * Registers a unique ConfirmationListener listener.
     */
    //66.5
    public void registerListener(ConfirmationListener listener) {
        this.listener = listener;
    }

    /**
     * Before the save of the ConfirmationBean pObject.
     *
     * @param pObject the ConfirmationBean pObject to be saved
     */
    //67
    void beforeInsert(ConfirmationBean pObject) throws SQLException {
        if (listener != null)
            listener.beforeInsert(pObject);
    }

    /**
     * After the save of the ConfirmationBean pObject.
     *
     * @param pObject the ConfirmationBean pObject to be saved
     */
    //68
    void afterInsert(ConfirmationBean pObject) throws SQLException {
        if (listener != null)
            listener.afterInsert(pObject);
    }

    /**
     * Before the update of the ConfirmationBean pObject.
     *
     * @param pObject the ConfirmationBean pObject to be updated
     */
    //69
    void beforeUpdate(ConfirmationBean pObject) throws SQLException {
        if (listener != null)
            listener.beforeUpdate(pObject);
    }

    /**
     * After the update of the ConfirmationBean pObject.
     *
     * @param pObject the ConfirmationBean pObject to be updated
     */
    //70
    void afterUpdate(ConfirmationBean pObject) throws SQLException {
        if (listener != null)
            listener.afterUpdate(pObject);
    }

    ///////////////////////////////////////////////////////////////////////
    // UTILS  
    ///////////////////////////////////////////////////////////////////////

    /**
     * Retrieves the manager object used to get connections.
     *
     * @return the manager used
     */
    //2
    Manager getManager() {
        return Manager.getInstance();
    }

    /**
     * Frees the connection.
     *
     * @param c the connection to release
     */
    void freeConnection(Connection c) {
        getManager().releaseConnection(c); // back to pool
    }
    /**
     * Gets the connection.
     */
    Connection getConnection() throws SQLException {
        return getManager().getConnection();
    }

// class+ 

// class- 
}
