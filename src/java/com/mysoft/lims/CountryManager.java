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
 * Handles database calls for the country table.
 */
public class CountryManager
// extends+ 

// extends- 
{

    /**
     * Column countryid of type Types.INTEGER mapped to Integer.
     */
    public static final int ID_COUNTRYID = 0;
    public static final int TYPE_COUNTRYID = Types.INTEGER;
    public static final String NAME_COUNTRYID = "countryid";

    /**
     * Column code of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CODE = 1;
    public static final int TYPE_CODE = Types.VARCHAR;
    public static final String NAME_CODE = "code";

    /**
     * Column nameen of type Types.VARCHAR mapped to String.
     */
    public static final int ID_NAMEEN = 2;
    public static final int TYPE_NAMEEN = Types.VARCHAR;
    public static final String NAME_NAMEEN = "nameen";

    /**
     * Column namege of type Types.VARCHAR mapped to String.
     */
    public static final int ID_NAMEGE = 3;
    public static final int TYPE_NAMEGE = Types.VARCHAR;
    public static final String NAME_NAMEGE = "namege";


    private static final String TABLE_NAME = "country";

    /**
     * Create an array of type string containing all the fields of the country table.
     */
    private static final String[] FIELD_NAMES = 
    {
        "country.countryid"
        ,"country.code"
        ,"country.nameen"
        ,"country.namege"
    };

    /**
     * Field that contains the comma separated fields of the country table.
     */
    private static final String ALL_FIELDS = "country.countryid"
                            + ",country.code"
                            + ",country.nameen"
                            + ",country.namege";

    private static CountryManager singleton = new CountryManager();

    /**
     * Get the CountryManager singleton.
     *
     * @return CountryManager 
     */
    synchronized public static CountryManager getInstance()
    {
        return singleton;
    }

    /**
     * Sets your own CountryManager instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(CountryManager instance)
    {
        singleton = instance;
    }


    /**
     * Creates a new CountryBean instance.
     *
     * @return the new CountryBean 
     */
    public CountryBean createCountryBean()
    {
        return new CountryBean();
    }

    //////////////////////////////////////
    // PRIMARY KEY METHODS
    //////////////////////////////////////

    /**
     * Loads a CountryBean from the country using its key fields.
     *
     * @return a unique CountryBean 
     */
    //12
    public CountryBean loadByPrimaryKey(Integer countryid) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM country WHERE country.countryid=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Manager.setInteger(ps, 1, countryid);
            CountryBean pReturn[] = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Integer countryid) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        try
        {
            c = getConnection();
            ps = c.prepareStatement("DELETE from country WHERE country.countryid=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Manager.setInteger(ps, 1, countryid);
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
     * Loads all the rows from country.
     *
     * @return an array of CountryManager pObject
     */
    //38
    public CountryBean[] loadAll() throws SQLException 
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM country",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
     * Retrieves an array of CountryBean given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting CountryBean table 
     */
    //49
    public CountryBean[] loadByWhere(String where) throws SQLException
    {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves an array of CountryBean given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting CountryBean table 
     */
    //51
    public CountryBean[] loadByWhere(String where, int[] fieldList) throws SQLException
    {
        String sql = null;
        if(fieldList == null)
            sql = "select " + ALL_FIELDS + " from country " + where;
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
            buff.append(" from country ");
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

            return (CountryBean[])v.toArray(new CountryBean[0]);
        }
        finally
        {
            if (v != null) { v.clear(); }
            getManager().close(pStatement, rs);
            freeConnection(c);
        }
    }


    /**
     * Deletes all rows from country table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException
    {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the country table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM country " + where;
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
     * Saves the CountryBean pObject into the database.
     *
     * @param pObject the CountryBean pObject to be saved
     */
    //100
    public CountryBean save(CountryBean pObject) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        try
        {
            c = getConnection();
            if (pObject.isNew())
            { // SAVE 
                if (!pObject.isCountryidModified())
                {
                    ps = c.prepareStatement("SELECT nextval('countryid_seq')");
                    ResultSet rs = null;
                    try
                    {
                        rs = ps.executeQuery();
                        if(rs.next())
                            pObject.setCountryid(Manager.getInteger(rs, 1));
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
                _sql = new StringBuffer("INSERT into country (");
    
                if (pObject.isCountryidModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("countryid");
                    _dirtyCount++;
                }

                if (pObject.isCodeModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("code");
                    _dirtyCount++;
                }

                if (pObject.isNameenModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("nameen");
                    _dirtyCount++;
                }

                if (pObject.isNamegeModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("namege");
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

                if (pObject.isCountryidModified()) {
                    Manager.setInteger(ps, ++_dirtyCount, pObject.getCountryid());
                }
    
                if (pObject.isCodeModified()) {
                    ps.setString(++_dirtyCount, pObject.getCode());
                }
    
                if (pObject.isNameenModified()) {
                    ps.setString(++_dirtyCount, pObject.getNameen());
                }
    
                if (pObject.isNamegeModified()) {
                    ps.setString(++_dirtyCount, pObject.getNamege());
                }
    
                ps.executeUpdate();
    
                pObject.isNew(false);
                pObject.resetIsModified();
                afterInsert(pObject); // listener callback
            }
            else 
            { // UPDATE 
                beforeUpdate(pObject); // listener callback
                _sql = new StringBuffer("UPDATE country SET ");
                boolean useComma=false;

                if (pObject.isCountryidModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("countryid").append("=?");
                }

                if (pObject.isCodeModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("code").append("=?");
                }

                if (pObject.isNameenModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("nameen").append("=?");
                }

                if (pObject.isNamegeModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("namege").append("=?");
                }
                _sql.append(" WHERE ");
                _sql.append("country.countryid=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isCountryidModified()) {
                      Manager.setInteger(ps, ++_dirtyCount, pObject.getCountryid());
                }

                if (pObject.isCodeModified()) {
                      ps.setString(++_dirtyCount, pObject.getCode());
                }

                if (pObject.isNameenModified()) {
                      ps.setString(++_dirtyCount, pObject.getNameen());
                }

                if (pObject.isNamegeModified()) {
                      ps.setString(++_dirtyCount, pObject.getNamege());
                }
    
                if (_dirtyCount == 0) {
                     return pObject;
                }
    
                Manager.setInteger(ps, ++_dirtyCount, pObject.getCountryid());
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
     * Saves an array of CountryBean pObjects into the database.
     *
     * @param pObjects the CountryBean pObject table to be saved
     * @return the saved CountryBean array.
     */
    //65
    public CountryBean[] save(CountryBean[] pObjects) throws SQLException 
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
     * Loads a unique CountryBean pObject from a template one giving a c
     *
     * @param pObject the CountryBean pObject to look for
     * @return the pObject matching the template
     */
    //85
    public CountryBean loadUniqueUsingTemplate(CountryBean pObject) throws SQLException
    {
         CountryBean[] pReturn = loadUsingTemplate(pObject);
         if (pReturn.length == 0)
             return null;
         if (pReturn.length > 1)
             throw new SQLException("More than one element !!");
         return pReturn[0];
     }

    /**
     * Loads an array of CountryBean from a template one.
     *
     * @param pObject the CountryBean template to look for
     * @return all the CountryBean matching the template
     */
    //88
    public CountryBean[] loadUsingTemplate(CountryBean pObject) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer where = new StringBuffer("");
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from country WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try
        {
            int _dirtyCount = 0;
    
             if (pObject.isCountryidModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("countryid= ?");
             }
    
             if (pObject.isCodeModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("code= ?");
             }
    
             if (pObject.isNameenModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("nameen= ?");
             }
    
             if (pObject.isNamegeModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("namege= ?");
             }
    
             if (_dirtyCount == 0) {
                 throw new SQLException ("The pObject to look for is invalid : not initialized !");
             }
             _sql.append(_sqlWhere);
             c = getConnection();
             ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             _dirtyCount = 0;
    
             if (pObject.isCountryidModified()) {
                 Manager.setInteger(ps, ++_dirtyCount, pObject.getCountryid());
             }
    
             if (pObject.isCodeModified()) {
                 ps.setString(++_dirtyCount, pObject.getCode());
             }
    
             if (pObject.isNameenModified()) {
                 ps.setString(++_dirtyCount, pObject.getNameen());
             }
    
             if (pObject.isNamegeModified()) {
                 ps.setString(++_dirtyCount, pObject.getNamege());
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
     * Deletes rows using a CountryBean template.
     *
     * @param pObject the CountryBean object(s) to be deleted
     * @return the number of deleted objects
     */
    //63
    public int deleteUsingTemplate(CountryBean pObject) throws SQLException
    {
        if (pObject.isCountryidInitialized())
            return deleteByPrimaryKey(pObject.getCountryid());
    
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try 
        {
            sql = new StringBuffer("DELETE FROM country WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isCountryidInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("countryid").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCodeInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("code").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNameenInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("nameen").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNamegeInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("namege").append("=?");
                _dirtyAnd ++;
            }
    
            c = getConnection();
            ps = c.prepareStatement(sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int _dirtyCount = 0;
    
            if (pObject.isCountryidInitialized()) {
                Manager.setInteger(ps, ++_dirtyCount, pObject.getCountryid());
            }
    
            if (pObject.isCodeInitialized()) {
                ps.setString(++_dirtyCount, pObject.getCode());
            }
    
            if (pObject.isNameenInitialized()) {
                ps.setString(++_dirtyCount, pObject.getNameen());
            }
    
            if (pObject.isNamegeInitialized()) {
                ps.setString(++_dirtyCount, pObject.getNamege());
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
    // MANY TO MANY: LOAD OTHER BEAN VIA JUNCTION TABLE 
    ///////////////////////////////////////////////////////////////////////
    /**
     * Retrieves an array of TunitBean using the relation table Tunit given a CountryBean object.
     *
     * @param pObject the CountryBean pObject to be used
     * @return an array of TunitBean 
     */
    // MANY TO MANY
    public TunitBean[] loadTunitViaTunit(CountryBean pObject) throws SQLException
    {
         Connection c = null;
         PreparedStatement ps = null;
         String strSQL =      " SELECT "
                         + "        *"
                         + " FROM  "
                         + "        tunit,tunit"
                         + " WHERE "    
                         + "     tunit.countryid = ?"
                         + " AND tunit.punitid = tunit.tunitid";
         try
         {
             c = getConnection();
             ps = c.prepareStatement(strSQL,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             Manager.setInteger(ps, 1, pObject.getCountryid());
             return TunitManager.getInstance().loadByPreparedStatement(ps);
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
     * Retrieves the number of rows of the table country.
     *
     * @return the number of rows returned
     */
    //78
    public int countAll() throws SQLException
    {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table country with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException
    {
        String sql = "select count(*) as MCOUNT from country " + where;
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
     * Retrieves the number of rows of the table country with a prepared statement.
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
     * Looks for the number of elements of a specific CountryBean pObject given a c
     *
     * @param pObject the CountryBean pObject to look for
     * @return the number of rows returned
     */
    //83
    public int countUsingTemplate(CountryBean pObject) throws SQLException
    {
        StringBuffer where = new StringBuffer("");
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try
        {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from country WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isCountryidModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("countryid= ?");
                }
    
                if (pObject.isCodeModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("code= ?");
                }
    
                if (pObject.isNameenModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("nameen= ?");
                }
    
                if (pObject.isNamegeModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("namege= ?");
                }
    
                if (_dirtyCount == 0)
                   throw new SQLException ("The pObject to look is unvalid : not initialized !");
    
                _sql.append(_sqlWhere);
                c = getConnection();
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
                _dirtyCount = 0;
    
                if (pObject.isCountryidModified()) {
                    Manager.setInteger(ps, ++_dirtyCount, pObject.getCountryid());
                }
    
                if (pObject.isCodeModified()) {
                    ps.setString(++_dirtyCount, pObject.getCode());
                }
    
                if (pObject.isNameenModified()) {
                    ps.setString(++_dirtyCount, pObject.getNameen());
                }
    
                if (pObject.isNamegeModified()) {
                    ps.setString(++_dirtyCount, pObject.getNamege());
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
     * Transforms a ResultSet iterating on the country on a CountryBean pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting CountryBean pObject
     */
    //72
    public CountryBean decodeRow(ResultSet rs) throws SQLException
    {
        CountryBean pObject = createCountryBean();
        pObject.setCountryid(Manager.getInteger(rs, 1));
        pObject.setCode(rs.getString(2));
        pObject.setNameen(rs.getString(3));
        pObject.setNamege(rs.getString(4));

        pObject.isNew(false);
        pObject.resetIsModified();

        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the country table on a CountryBean pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting CountryBean pObject
     */
    //73
    public CountryBean decodeRow(ResultSet rs, int[] fieldList) throws SQLException
    {
        CountryBean pObject = createCountryBean();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++)
        {
            switch(fieldList[i]) {
                case ID_COUNTRYID:
                    ++pos;
                    pObject.setCountryid(Manager.getInteger(rs, pos));
                    break;
                case ID_CODE:
                    ++pos;
                    pObject.setCode(rs.getString(pos));
                    break;
                case ID_NAMEEN:
                    ++pos;
                    pObject.setNameen(rs.getString(pos));
                    break;
                case ID_NAMEGE:
                    ++pos;
                    pObject.setNamege(rs.getString(pos));
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
     * @return an array of CountryBean 
     */
    //41
    public CountryBean[] loadByPreparedStatement(PreparedStatement ps) throws SQLException
    {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return an array of CountryBean 
     */
    public CountryBean[] loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException
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
            return (CountryBean[])v.toArray(new CountryBean[0]);
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
    private CountryListener listener = null;

    /**
     * Registers a unique CountryListener listener.
     */
    //66.5
    public void registerListener(CountryListener listener) {
        this.listener = listener;
    }

    /**
     * Before the save of the CountryBean pObject.
     *
     * @param pObject the CountryBean pObject to be saved
     */
    //67
    void beforeInsert(CountryBean pObject) throws SQLException {
        if (listener != null)
            listener.beforeInsert(pObject);
    }

    /**
     * After the save of the CountryBean pObject.
     *
     * @param pObject the CountryBean pObject to be saved
     */
    //68
    void afterInsert(CountryBean pObject) throws SQLException {
        if (listener != null)
            listener.afterInsert(pObject);
    }

    /**
     * Before the update of the CountryBean pObject.
     *
     * @param pObject the CountryBean pObject to be updated
     */
    //69
    void beforeUpdate(CountryBean pObject) throws SQLException {
        if (listener != null)
            listener.beforeUpdate(pObject);
    }

    /**
     * After the update of the CountryBean pObject.
     *
     * @param pObject the CountryBean pObject to be updated
     */
    //70
    void afterUpdate(CountryBean pObject) throws SQLException {
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