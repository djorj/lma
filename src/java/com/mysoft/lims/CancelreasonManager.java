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
 * Handles database calls for the cancelreason table.
 */
public class CancelreasonManager
// extends+ 

// extends- 
{

    /**
     * Column cancelreasonid of type Types.INTEGER mapped to Integer.
     */
    public static final int ID_CANCELREASONID = 0;
    public static final int TYPE_CANCELREASONID = Types.INTEGER;
    public static final String NAME_CANCELREASONID = "cancelreasonid";

    /**
     * Column name of type Types.VARCHAR mapped to String.
     */
    public static final int ID_NAME = 1;
    public static final int TYPE_NAME = Types.VARCHAR;
    public static final String NAME_NAME = "name";


    private static final String TABLE_NAME = "cancelreason";

    /**
     * Create an array of type string containing all the fields of the cancelreason table.
     */
    private static final String[] FIELD_NAMES = 
    {
        "cancelreason.cancelreasonid"
        ,"cancelreason.name"
    };

    /**
     * Field that contains the comma separated fields of the cancelreason table.
     */
    private static final String ALL_FIELDS = "cancelreason.cancelreasonid"
                            + ",cancelreason.name";

    private static CancelreasonManager singleton = new CancelreasonManager();

    /**
     * Get the CancelreasonManager singleton.
     *
     * @return CancelreasonManager 
     */
    synchronized public static CancelreasonManager getInstance()
    {
        return singleton;
    }

    /**
     * Sets your own CancelreasonManager instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(CancelreasonManager instance)
    {
        singleton = instance;
    }


    /**
     * Creates a new CancelreasonBean instance.
     *
     * @return the new CancelreasonBean 
     */
    public CancelreasonBean createCancelreasonBean()
    {
        return new CancelreasonBean();
    }

    //////////////////////////////////////
    // PRIMARY KEY METHODS
    //////////////////////////////////////

    /**
     * Loads a CancelreasonBean from the cancelreason using its key fields.
     *
     * @return a unique CancelreasonBean 
     */
    //12
    public CancelreasonBean loadByPrimaryKey(Integer cancelreasonid) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM cancelreason WHERE cancelreason.cancelreasonid=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Manager.setInteger(ps, 1, cancelreasonid);
            CancelreasonBean pReturn[] = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Integer cancelreasonid) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        try
        {
            c = getConnection();
            ps = c.prepareStatement("DELETE from cancelreason WHERE cancelreason.cancelreasonid=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Manager.setInteger(ps, 1, cancelreasonid);
            return ps.executeUpdate();
        }
        finally
        {
            getManager().close(ps);
            freeConnection(c);
        }
    }



    //////////////////////////////////////
    // LOAD ALL
    //////////////////////////////////////

    /**
     * Loads all the rows from cancelreason.
     *
     * @return an array of CancelreasonManager pObject
     */
    //38
    public CancelreasonBean[] loadAll() throws SQLException 
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM cancelreason",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
     * Retrieves an array of CancelreasonBean given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting CancelreasonBean table 
     */
    //49
    public CancelreasonBean[] loadByWhere(String where) throws SQLException
    {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves an array of CancelreasonBean given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting CancelreasonBean table 
     */
    //51
    public CancelreasonBean[] loadByWhere(String where, int[] fieldList) throws SQLException
    {
        String sql = null;
        if(fieldList == null)
            sql = "select " + ALL_FIELDS + " from cancelreason " + where;
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
            buff.append(" from cancelreason ");
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

            return (CancelreasonBean[])v.toArray(new CancelreasonBean[0]);
        }
        finally
        {
            if (v != null) { v.clear(); }
            getManager().close(pStatement, rs);
            freeConnection(c);
        }
    }


    /**
     * Deletes all rows from cancelreason table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException
    {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the cancelreason table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM cancelreason " + where;
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
     * Saves the CancelreasonBean pObject into the database.
     *
     * @param pObject the CancelreasonBean pObject to be saved
     */
    //100
    public CancelreasonBean save(CancelreasonBean pObject) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        try
        {
            c = getConnection();
            if (pObject.isNew())
            { // SAVE 
                if (!pObject.isCancelreasonidModified())
                {
                    ps = c.prepareStatement("SELECT nextval('cancelreasonid_seq')");
                    ResultSet rs = null;
                    try
                    {
                        rs = ps.executeQuery();
                        if(rs.next())
                            pObject.setCancelreasonid(Manager.getInteger(rs, 1));
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
                _sql = new StringBuffer("INSERT into cancelreason (");
    
                if (pObject.isCancelreasonidModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("cancelreasonid");
                    _dirtyCount++;
                }

                if (pObject.isNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("name");
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

                if (pObject.isCancelreasonidModified()) {
                    Manager.setInteger(ps, ++_dirtyCount, pObject.getCancelreasonid());
                }
    
                if (pObject.isNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getName());
                }
    
                ps.executeUpdate();
    
                pObject.isNew(false);
                pObject.resetIsModified();
                afterInsert(pObject); // listener callback
            }
            else 
            { // UPDATE 
                beforeUpdate(pObject); // listener callback
                _sql = new StringBuffer("UPDATE cancelreason SET ");
                boolean useComma=false;

                if (pObject.isCancelreasonidModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("cancelreasonid").append("=?");
                }

                if (pObject.isNameModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("name").append("=?");
                }
                _sql.append(" WHERE ");
                _sql.append("cancelreason.cancelreasonid=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isCancelreasonidModified()) {
                      Manager.setInteger(ps, ++_dirtyCount, pObject.getCancelreasonid());
                }

                if (pObject.isNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getName());
                }
    
                if (_dirtyCount == 0) {
                     return pObject;
                }
    
                Manager.setInteger(ps, ++_dirtyCount, pObject.getCancelreasonid());
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
     * Saves an array of CancelreasonBean pObjects into the database.
     *
     * @param pObjects the CancelreasonBean pObject table to be saved
     * @return the saved CancelreasonBean array.
     */
    //65
    public CancelreasonBean[] save(CancelreasonBean[] pObjects) throws SQLException 
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
     * Loads a unique CancelreasonBean pObject from a template one giving a c
     *
     * @param pObject the CancelreasonBean pObject to look for
     * @return the pObject matching the template
     */
    //85
    public CancelreasonBean loadUniqueUsingTemplate(CancelreasonBean pObject) throws SQLException
    {
         CancelreasonBean[] pReturn = loadUsingTemplate(pObject);
         if (pReturn.length == 0)
             return null;
         if (pReturn.length > 1)
             throw new SQLException("More than one element !!");
         return pReturn[0];
     }

    /**
     * Loads an array of CancelreasonBean from a template one.
     *
     * @param pObject the CancelreasonBean template to look for
     * @return all the CancelreasonBean matching the template
     */
    //88
    public CancelreasonBean[] loadUsingTemplate(CancelreasonBean pObject) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer where = new StringBuffer("");
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from cancelreason WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try
        {
            int _dirtyCount = 0;
    
             if (pObject.isCancelreasonidModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("cancelreasonid= ?");
             }
    
             if (pObject.isNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("name= ?");
             }
    
             if (_dirtyCount == 0) {
                 throw new SQLException ("The pObject to look for is invalid : not initialized !");
             }
             _sql.append(_sqlWhere);
             c = getConnection();
             ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             _dirtyCount = 0;
    
             if (pObject.isCancelreasonidModified()) {
                 Manager.setInteger(ps, ++_dirtyCount, pObject.getCancelreasonid());
             }
    
             if (pObject.isNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getName());
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
     * Deletes rows using a CancelreasonBean template.
     *
     * @param pObject the CancelreasonBean object(s) to be deleted
     * @return the number of deleted objects
     */
    //63
    public int deleteUsingTemplate(CancelreasonBean pObject) throws SQLException
    {
        if (pObject.isCancelreasonidInitialized())
            return deleteByPrimaryKey(pObject.getCancelreasonid());
    
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try 
        {
            sql = new StringBuffer("DELETE FROM cancelreason WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isCancelreasonidInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("cancelreasonid").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNameInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("name").append("=?");
                _dirtyAnd ++;
            }
    
            c = getConnection();
            ps = c.prepareStatement(sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int _dirtyCount = 0;
    
            if (pObject.isCancelreasonidInitialized()) {
                Manager.setInteger(ps, ++_dirtyCount, pObject.getCancelreasonid());
            }
    
            if (pObject.isNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getName());
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
     * Retrieves the number of rows of the table cancelreason.
     *
     * @return the number of rows returned
     */
    //78
    public int countAll() throws SQLException
    {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table cancelreason with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException
    {
        String sql = "select count(*) as MCOUNT from cancelreason " + where;
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
     * Retrieves the number of rows of the table cancelreason with a prepared statement.
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
     * Looks for the number of elements of a specific CancelreasonBean pObject given a c
     *
     * @param pObject the CancelreasonBean pObject to look for
     * @return the number of rows returned
     */
    //83
    public int countUsingTemplate(CancelreasonBean pObject) throws SQLException
    {
        StringBuffer where = new StringBuffer("");
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try
        {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from cancelreason WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isCancelreasonidModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("cancelreasonid= ?");
                }
    
                if (pObject.isNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("name= ?");
                }
    
                if (_dirtyCount == 0)
                   throw new SQLException ("The pObject to look is unvalid : not initialized !");
    
                _sql.append(_sqlWhere);
                c = getConnection();
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
                _dirtyCount = 0;
    
                if (pObject.isCancelreasonidModified()) {
                    Manager.setInteger(ps, ++_dirtyCount, pObject.getCancelreasonid());
                }
    
                if (pObject.isNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getName());
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
     * Transforms a ResultSet iterating on the cancelreason on a CancelreasonBean pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting CancelreasonBean pObject
     */
    //72
    public CancelreasonBean decodeRow(ResultSet rs) throws SQLException
    {
        CancelreasonBean pObject = createCancelreasonBean();
        pObject.setCancelreasonid(Manager.getInteger(rs, 1));
        pObject.setName(rs.getString(2));

        pObject.isNew(false);
        pObject.resetIsModified();

        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the cancelreason table on a CancelreasonBean pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting CancelreasonBean pObject
     */
    //73
    public CancelreasonBean decodeRow(ResultSet rs, int[] fieldList) throws SQLException
    {
        CancelreasonBean pObject = createCancelreasonBean();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++)
        {
            switch(fieldList[i]) {
                case ID_CANCELREASONID:
                    ++pos;
                    pObject.setCancelreasonid(Manager.getInteger(rs, pos));
                    break;
                case ID_NAME:
                    ++pos;
                    pObject.setName(rs.getString(pos));
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
     * @return an array of CancelreasonBean 
     */
    //41
    public CancelreasonBean[] loadByPreparedStatement(PreparedStatement ps) throws SQLException
    {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return an array of CancelreasonBean 
     */
    public CancelreasonBean[] loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException
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
            return (CancelreasonBean[])v.toArray(new CancelreasonBean[0]);
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
    private CancelreasonListener listener = null;

    /**
     * Registers a unique CancelreasonListener listener.
     */
    //66.5
    public void registerListener(CancelreasonListener listener) {
        this.listener = listener;
    }

    /**
     * Before the save of the CancelreasonBean pObject.
     *
     * @param pObject the CancelreasonBean pObject to be saved
     */
    //67
    void beforeInsert(CancelreasonBean pObject) throws SQLException {
        if (listener != null)
            listener.beforeInsert(pObject);
    }

    /**
     * After the save of the CancelreasonBean pObject.
     *
     * @param pObject the CancelreasonBean pObject to be saved
     */
    //68
    void afterInsert(CancelreasonBean pObject) throws SQLException {
        if (listener != null)
            listener.afterInsert(pObject);
    }

    /**
     * Before the update of the CancelreasonBean pObject.
     *
     * @param pObject the CancelreasonBean pObject to be updated
     */
    //69
    void beforeUpdate(CancelreasonBean pObject) throws SQLException {
        if (listener != null)
            listener.beforeUpdate(pObject);
    }

    /**
     * After the update of the CancelreasonBean pObject.
     *
     * @param pObject the CancelreasonBean pObject to be updated
     */
    //70
    void afterUpdate(CancelreasonBean pObject) throws SQLException {
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
