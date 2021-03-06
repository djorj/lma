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
 * Handles database calls for the price table.
 */
public class PriceManager
// extends+ 

// extends- 
{

    /**
     * Column priceid of type Types.INTEGER mapped to Integer.
     */
    public static final int ID_PRICEID = 0;
    public static final int TYPE_PRICEID = Types.INTEGER;
    public static final String NAME_PRICEID = "priceid";

    /**
     * Column pricedate of type Types.DATE mapped to java.util.Date.
     */
    public static final int ID_PRICEDATE = 1;
    public static final int TYPE_PRICEDATE = Types.DATE;
    public static final String NAME_PRICEDATE = "pricedate";

    /**
     * Column reason of type Types.VARCHAR mapped to String.
     */
    public static final int ID_REASON = 2;
    public static final int TYPE_REASON = Types.VARCHAR;
    public static final String NAME_REASON = "reason";

    /**
     * Column price of type Types.DOUBLE mapped to Double.
     */
    public static final int ID_PRICE = 3;
    public static final int TYPE_PRICE = Types.DOUBLE;
    public static final String NAME_PRICE = "price";

    /**
     * Column labtestid of type Types.INTEGER mapped to Integer.
     */
    public static final int ID_LABTESTID = 4;
    public static final int TYPE_LABTESTID = Types.INTEGER;
    public static final String NAME_LABTESTID = "labtestid";


    private static final String TABLE_NAME = "price";

    /**
     * Create an array of type string containing all the fields of the price table.
     */
    private static final String[] FIELD_NAMES = 
    {
        "price.priceid"
        ,"price.pricedate"
        ,"price.reason"
        ,"price.price"
        ,"price.labtestid"
    };

    /**
     * Field that contains the comma separated fields of the price table.
     */
    private static final String ALL_FIELDS = "price.priceid"
                            + ",price.pricedate"
                            + ",price.reason"
                            + ",price.price"
                            + ",price.labtestid";

    private static PriceManager singleton = new PriceManager();

    /**
     * Get the PriceManager singleton.
     *
     * @return PriceManager 
     */
    synchronized public static PriceManager getInstance()
    {
        return singleton;
    }

    /**
     * Sets your own PriceManager instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(PriceManager instance)
    {
        singleton = instance;
    }


    /**
     * Creates a new PriceBean instance.
     *
     * @return the new PriceBean 
     */
    public PriceBean createPriceBean()
    {
        return new PriceBean();
    }

    //////////////////////////////////////
    // PRIMARY KEY METHODS
    //////////////////////////////////////

    /**
     * Loads a PriceBean from the price using its key fields.
     *
     * @return a unique PriceBean 
     */
    //12
    public PriceBean loadByPrimaryKey(Integer priceid) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM price WHERE price.priceid=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Manager.setInteger(ps, 1, priceid);
            PriceBean pReturn[] = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Integer priceid) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        try
        {
            c = getConnection();
            ps = c.prepareStatement("DELETE from price WHERE price.priceid=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Manager.setInteger(ps, 1, priceid);
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
     * Loads PriceBean array from the price table using its labtestid field.
     *
     * @return an array of PriceBean 
     */
    // LOAD BY IMPORTED KEY
    public PriceBean[] loadByLabtestid(Integer value) throws SQLException 
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM price WHERE labtestid=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Manager.setInteger(ps, 1, value);
            return loadByPreparedStatement(ps);
        }
        finally
        {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Deletes from the price table by labtestid field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    // DELETE BY IMPORTED KEY
    public int deleteByLabtestid(Integer value) throws SQLException 
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM price WHERE labtestid=?");
            Manager.setInteger(ps, 1, value);
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
     * Retrieves the LabtestBean object from the price.labtestid field.
     *
     * @param pObject the PriceBean 
     * @return the associated LabtestBean pObject
     */
    // GET IMPORTED
    public LabtestBean getLabtestBean(PriceBean pObject) throws SQLException
    {
        LabtestBean other = LabtestManager.getInstance().createLabtestBean();
        other.setLabtestid(pObject.getLabtestid());
        return LabtestManager.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the PriceBean object to the LabtestBean object.
     *
     * @param pObject the PriceBean object to use
     * @param pObjectToBeSet the LabtestBean object to associate to the PriceBean 
     * @return the associated LabtestBean pObject
     */
    // SET IMPORTED
    public PriceBean setLabtestBean(PriceBean pObject,LabtestBean pObjectToBeSet)
    {
        pObject.setLabtestid(pObjectToBeSet.getLabtestid());
        return pObject;
    }



    //////////////////////////////////////
    // LOAD ALL
    //////////////////////////////////////

    /**
     * Loads all the rows from price.
     *
     * @return an array of PriceManager pObject
     */
    //38
    public PriceBean[] loadAll() throws SQLException 
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM price",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
     * Retrieves an array of PriceBean given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting PriceBean table 
     */
    //49
    public PriceBean[] loadByWhere(String where) throws SQLException
    {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves an array of PriceBean given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting PriceBean table 
     */
    //51
    public PriceBean[] loadByWhere(String where, int[] fieldList) throws SQLException
    {
        String sql = null;
        if(fieldList == null)
            sql = "select " + ALL_FIELDS + " from price " + where;
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
            buff.append(" from price ");
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

            return (PriceBean[])v.toArray(new PriceBean[0]);
        }
        finally
        {
            if (v != null) { v.clear(); }
            getManager().close(pStatement, rs);
            freeConnection(c);
        }
    }


    /**
     * Deletes all rows from price table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException
    {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the price table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM price " + where;
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
     * Saves the PriceBean pObject into the database.
     *
     * @param pObject the PriceBean pObject to be saved
     */
    //100
    public PriceBean save(PriceBean pObject) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        try
        {
            c = getConnection();
            if (pObject.isNew())
            { // SAVE 
                if (!pObject.isPriceidModified())
                {
                    ps = c.prepareStatement("SELECT nextval('priceid_seq')");
                    ResultSet rs = null;
                    try
                    {
                        rs = ps.executeQuery();
                        if(rs.next())
                            pObject.setPriceid(Manager.getInteger(rs, 1));
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
                _sql = new StringBuffer("INSERT into price (");
    
                if (pObject.isPriceidModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("priceid");
                    _dirtyCount++;
                }

                if (pObject.isPricedateModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("pricedate");
                    _dirtyCount++;
                }

                if (pObject.isReasonModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("reason");
                    _dirtyCount++;
                }

                if (pObject.isPriceModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("price");
                    _dirtyCount++;
                }

                if (pObject.isLabtestidModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("labtestid");
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

                if (pObject.isPriceidModified()) {
                    Manager.setInteger(ps, ++_dirtyCount, pObject.getPriceid());
                }
    
                if (pObject.isPricedateModified()) {
                    if (pObject.getPricedate() == null) ps.setNull(++_dirtyCount, Types.DATE); else ps.setDate(++_dirtyCount, new java.sql.Date(pObject.getPricedate().getTime()));
                }
    
                if (pObject.isReasonModified()) {
                    ps.setString(++_dirtyCount, pObject.getReason());
                }
    
                if (pObject.isPriceModified()) {
                    Manager.setDouble(ps, ++_dirtyCount, pObject.getPrice());
                }
    
                if (pObject.isLabtestidModified()) {
                    Manager.setInteger(ps, ++_dirtyCount, pObject.getLabtestid());
                }
    
                ps.executeUpdate();
    
                pObject.isNew(false);
                pObject.resetIsModified();
                afterInsert(pObject); // listener callback
            }
            else 
            { // UPDATE 
                beforeUpdate(pObject); // listener callback
                _sql = new StringBuffer("UPDATE price SET ");
                boolean useComma=false;

                if (pObject.isPriceidModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("priceid").append("=?");
                }

                if (pObject.isPricedateModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("pricedate").append("=?");
                }

                if (pObject.isReasonModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("reason").append("=?");
                }

                if (pObject.isPriceModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("price").append("=?");
                }

                if (pObject.isLabtestidModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("labtestid").append("=?");
                }
                _sql.append(" WHERE ");
                _sql.append("price.priceid=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isPriceidModified()) {
                      Manager.setInteger(ps, ++_dirtyCount, pObject.getPriceid());
                }

                if (pObject.isPricedateModified()) {
                      if (pObject.getPricedate() == null) ps.setNull(++_dirtyCount, Types.DATE); else ps.setDate(++_dirtyCount, new java.sql.Date(pObject.getPricedate().getTime()));
                }

                if (pObject.isReasonModified()) {
                      ps.setString(++_dirtyCount, pObject.getReason());
                }

                if (pObject.isPriceModified()) {
                      Manager.setDouble(ps, ++_dirtyCount, pObject.getPrice());
                }

                if (pObject.isLabtestidModified()) {
                      Manager.setInteger(ps, ++_dirtyCount, pObject.getLabtestid());
                }
    
                if (_dirtyCount == 0) {
                     return pObject;
                }
    
                Manager.setInteger(ps, ++_dirtyCount, pObject.getPriceid());
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
     * Saves an array of PriceBean pObjects into the database.
     *
     * @param pObjects the PriceBean pObject table to be saved
     * @return the saved PriceBean array.
     */
    //65
    public PriceBean[] save(PriceBean[] pObjects) throws SQLException 
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
     * Loads a unique PriceBean pObject from a template one giving a c
     *
     * @param pObject the PriceBean pObject to look for
     * @return the pObject matching the template
     */
    //85
    public PriceBean loadUniqueUsingTemplate(PriceBean pObject) throws SQLException
    {
         PriceBean[] pReturn = loadUsingTemplate(pObject);
         if (pReturn.length == 0)
             return null;
         if (pReturn.length > 1)
             throw new SQLException("More than one element !!");
         return pReturn[0];
     }

    /**
     * Loads an array of PriceBean from a template one.
     *
     * @param pObject the PriceBean template to look for
     * @return all the PriceBean matching the template
     */
    //88
    public PriceBean[] loadUsingTemplate(PriceBean pObject) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer where = new StringBuffer("");
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from price WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try
        {
            int _dirtyCount = 0;
    
             if (pObject.isPriceidModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("priceid= ?");
             }
    
             if (pObject.isPricedateModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("pricedate= ?");
             }
    
             if (pObject.isReasonModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("reason= ?");
             }
    
             if (pObject.isPriceModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("price= ?");
             }
    
             if (pObject.isLabtestidModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("labtestid= ?");
             }
    
             if (_dirtyCount == 0) {
                 throw new SQLException ("The pObject to look for is invalid : not initialized !");
             }
             _sql.append(_sqlWhere);
             c = getConnection();
             ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             _dirtyCount = 0;
    
             if (pObject.isPriceidModified()) {
                 Manager.setInteger(ps, ++_dirtyCount, pObject.getPriceid());
             }
    
             if (pObject.isPricedateModified()) {
                 if (pObject.getPricedate() == null) ps.setNull(++_dirtyCount, Types.DATE); else ps.setDate(++_dirtyCount, new java.sql.Date(pObject.getPricedate().getTime()));
             }
    
             if (pObject.isReasonModified()) {
                 ps.setString(++_dirtyCount, pObject.getReason());
             }
    
             if (pObject.isPriceModified()) {
                 Manager.setDouble(ps, ++_dirtyCount, pObject.getPrice());
             }
    
             if (pObject.isLabtestidModified()) {
                 Manager.setInteger(ps, ++_dirtyCount, pObject.getLabtestid());
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
     * Deletes rows using a PriceBean template.
     *
     * @param pObject the PriceBean object(s) to be deleted
     * @return the number of deleted objects
     */
    //63
    public int deleteUsingTemplate(PriceBean pObject) throws SQLException
    {
        if (pObject.isPriceidInitialized())
            return deleteByPrimaryKey(pObject.getPriceid());
    
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try 
        {
            sql = new StringBuffer("DELETE FROM price WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isPriceidInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("priceid").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isPricedateInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("pricedate").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isReasonInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("reason").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isPriceInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("price").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isLabtestidInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("labtestid").append("=?");
                _dirtyAnd ++;
            }
    
            c = getConnection();
            ps = c.prepareStatement(sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int _dirtyCount = 0;
    
            if (pObject.isPriceidInitialized()) {
                Manager.setInteger(ps, ++_dirtyCount, pObject.getPriceid());
            }
    
            if (pObject.isPricedateInitialized()) {
                if (pObject.getPricedate() == null) ps.setNull(++_dirtyCount, Types.DATE); else ps.setDate(++_dirtyCount, new java.sql.Date(pObject.getPricedate().getTime()));
            }
    
            if (pObject.isReasonInitialized()) {
                ps.setString(++_dirtyCount, pObject.getReason());
            }
    
            if (pObject.isPriceInitialized()) {
                Manager.setDouble(ps, ++_dirtyCount, pObject.getPrice());
            }
    
            if (pObject.isLabtestidInitialized()) {
                Manager.setInteger(ps, ++_dirtyCount, pObject.getLabtestid());
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
     * Retrieves the number of rows of the table price.
     *
     * @return the number of rows returned
     */
    //78
    public int countAll() throws SQLException
    {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table price with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException
    {
        String sql = "select count(*) as MCOUNT from price " + where;
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
     * Retrieves the number of rows of the table price with a prepared statement.
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
     * Looks for the number of elements of a specific PriceBean pObject given a c
     *
     * @param pObject the PriceBean pObject to look for
     * @return the number of rows returned
     */
    //83
    public int countUsingTemplate(PriceBean pObject) throws SQLException
    {
        StringBuffer where = new StringBuffer("");
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try
        {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from price WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isPriceidModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("priceid= ?");
                }
    
                if (pObject.isPricedateModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("pricedate= ?");
                }
    
                if (pObject.isReasonModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("reason= ?");
                }
    
                if (pObject.isPriceModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("price= ?");
                }
    
                if (pObject.isLabtestidModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("labtestid= ?");
                }
    
                if (_dirtyCount == 0)
                   throw new SQLException ("The pObject to look is unvalid : not initialized !");
    
                _sql.append(_sqlWhere);
                c = getConnection();
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
                _dirtyCount = 0;
    
                if (pObject.isPriceidModified()) {
                    Manager.setInteger(ps, ++_dirtyCount, pObject.getPriceid());
                }
    
                if (pObject.isPricedateModified()) {
                    if (pObject.getPricedate() == null) ps.setNull(++_dirtyCount, Types.DATE); else ps.setDate(++_dirtyCount, new java.sql.Date(pObject.getPricedate().getTime()));
                }
    
                if (pObject.isReasonModified()) {
                    ps.setString(++_dirtyCount, pObject.getReason());
                }
    
                if (pObject.isPriceModified()) {
                    Manager.setDouble(ps, ++_dirtyCount, pObject.getPrice());
                }
    
                if (pObject.isLabtestidModified()) {
                    Manager.setInteger(ps, ++_dirtyCount, pObject.getLabtestid());
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
     * Transforms a ResultSet iterating on the price on a PriceBean pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting PriceBean pObject
     */
    //72
    public PriceBean decodeRow(ResultSet rs) throws SQLException
    {
        PriceBean pObject = createPriceBean();
        pObject.setPriceid(Manager.getInteger(rs, 1));
        pObject.setPricedate(rs.getDate(2));
        pObject.setReason(rs.getString(3));
        pObject.setPrice(Manager.getDouble(rs, 4));
        pObject.setLabtestid(Manager.getInteger(rs, 5));

        pObject.isNew(false);
        pObject.resetIsModified();

        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the price table on a PriceBean pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting PriceBean pObject
     */
    //73
    public PriceBean decodeRow(ResultSet rs, int[] fieldList) throws SQLException
    {
        PriceBean pObject = createPriceBean();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++)
        {
            switch(fieldList[i]) {
                case ID_PRICEID:
                    ++pos;
                    pObject.setPriceid(Manager.getInteger(rs, pos));
                    break;
                case ID_PRICEDATE:
                    ++pos;
                    pObject.setPricedate(rs.getDate(pos));
                    break;
                case ID_REASON:
                    ++pos;
                    pObject.setReason(rs.getString(pos));
                    break;
                case ID_PRICE:
                    ++pos;
                    pObject.setPrice(Manager.getDouble(rs, pos));
                    break;
                case ID_LABTESTID:
                    ++pos;
                    pObject.setLabtestid(Manager.getInteger(rs, pos));
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
     * @return an array of PriceBean 
     */
    //41
    public PriceBean[] loadByPreparedStatement(PreparedStatement ps) throws SQLException
    {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return an array of PriceBean 
     */
    public PriceBean[] loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException
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
            return (PriceBean[])v.toArray(new PriceBean[0]);
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
    private PriceListener listener = null;

    /**
     * Registers a unique PriceListener listener.
     */
    //66.5
    public void registerListener(PriceListener listener) {
        this.listener = listener;
    }

    /**
     * Before the save of the PriceBean pObject.
     *
     * @param pObject the PriceBean pObject to be saved
     */
    //67
    void beforeInsert(PriceBean pObject) throws SQLException {
        if (listener != null)
            listener.beforeInsert(pObject);
    }

    /**
     * After the save of the PriceBean pObject.
     *
     * @param pObject the PriceBean pObject to be saved
     */
    //68
    void afterInsert(PriceBean pObject) throws SQLException {
        if (listener != null)
            listener.afterInsert(pObject);
    }

    /**
     * Before the update of the PriceBean pObject.
     *
     * @param pObject the PriceBean pObject to be updated
     */
    //69
    void beforeUpdate(PriceBean pObject) throws SQLException {
        if (listener != null)
            listener.beforeUpdate(pObject);
    }

    /**
     * After the update of the PriceBean pObject.
     *
     * @param pObject the PriceBean pObject to be updated
     */
    //70
    void afterUpdate(PriceBean pObject) throws SQLException {
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
