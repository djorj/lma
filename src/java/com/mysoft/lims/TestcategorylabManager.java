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
 * Handles database calls for the testcategorylab table.
 */
public class TestcategorylabManager
// extends+ 

// extends- 
{

    /**
     * Column testcategoryid of type Types.INTEGER mapped to Integer.
     */
    public static final int ID_TESTCATEGORYID = 0;
    public static final int TYPE_TESTCATEGORYID = Types.INTEGER;
    public static final String NAME_TESTCATEGORYID = "testcategoryid";

    /**
     * Column institutionid of type Types.INTEGER mapped to Integer.
     */
    public static final int ID_INSTITUTIONID = 1;
    public static final int TYPE_INSTITUTIONID = Types.INTEGER;
    public static final String NAME_INSTITUTIONID = "institutionid";


    private static final String TABLE_NAME = "testcategorylab";

    /**
     * Create an array of type string containing all the fields of the testcategorylab table.
     */
    private static final String[] FIELD_NAMES = 
    {
        "testcategorylab.testcategoryid"
        ,"testcategorylab.institutionid"
    };

    /**
     * Field that contains the comma separated fields of the testcategorylab table.
     */
    private static final String ALL_FIELDS = "testcategorylab.testcategoryid"
                            + ",testcategorylab.institutionid";

    private static TestcategorylabManager singleton = new TestcategorylabManager();

    /**
     * Get the TestcategorylabManager singleton.
     *
     * @return TestcategorylabManager 
     */
    synchronized public static TestcategorylabManager getInstance()
    {
        return singleton;
    }

    /**
     * Sets your own TestcategorylabManager instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(TestcategorylabManager instance)
    {
        singleton = instance;
    }


    /**
     * Creates a new TestcategorylabBean instance.
     *
     * @return the new TestcategorylabBean 
     */
    public TestcategorylabBean createTestcategorylabBean()
    {
        return new TestcategorylabBean();
    }

    //////////////////////////////////////
    // PRIMARY KEY METHODS
    //////////////////////////////////////

    /**
     * Loads a TestcategorylabBean from the testcategorylab using its key fields.
     *
     * @return a unique TestcategorylabBean 
     */
    //12
    public TestcategorylabBean loadByPrimaryKey(Integer testcategoryid, Integer institutionid) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM testcategorylab WHERE testcategorylab.testcategoryid=? and testcategorylab.institutionid=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Manager.setInteger(ps, 1, testcategoryid);
            Manager.setInteger(ps, 2, institutionid);
            TestcategorylabBean pReturn[] = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Integer testcategoryid, Integer institutionid) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        try
        {
            c = getConnection();
            ps = c.prepareStatement("DELETE from testcategorylab WHERE testcategorylab.testcategoryid=? and testcategorylab.institutionid=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Manager.setInteger(ps, 1, testcategoryid);
            Manager.setInteger(ps, 2, institutionid);
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
     * Loads TestcategorylabBean array from the testcategorylab table using its institutionid field.
     *
     * @return an array of TestcategorylabBean 
     */
    // LOAD BY IMPORTED KEY
    public TestcategorylabBean[] loadByInstitutionid(Integer value) throws SQLException 
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM testcategorylab WHERE institutionid=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
     * Deletes from the testcategorylab table by institutionid field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    // DELETE BY IMPORTED KEY
    public int deleteByInstitutionid(Integer value) throws SQLException 
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM testcategorylab WHERE institutionid=?");
            Manager.setInteger(ps, 1, value);
            return ps.executeUpdate();
        }
        finally
        {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads TestcategorylabBean array from the testcategorylab table using its testcategoryid field.
     *
     * @return an array of TestcategorylabBean 
     */
    // LOAD BY IMPORTED KEY
    public TestcategorylabBean[] loadByTestcategoryid(Integer value) throws SQLException 
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM testcategorylab WHERE testcategoryid=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
     * Deletes from the testcategorylab table by testcategoryid field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    // DELETE BY IMPORTED KEY
    public int deleteByTestcategoryid(Integer value) throws SQLException 
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM testcategorylab WHERE testcategoryid=?");
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
     * Retrieves the InstitutionBean object from the testcategorylab.institutionid field.
     *
     * @param pObject the TestcategorylabBean 
     * @return the associated InstitutionBean pObject
     */
    // GET IMPORTED
    public InstitutionBean getInstitutionBean(TestcategorylabBean pObject) throws SQLException
    {
        InstitutionBean other = InstitutionManager.getInstance().createInstitutionBean();
        other.setInstitutionid(pObject.getInstitutionid());
        return InstitutionManager.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the TestcategorylabBean object to the InstitutionBean object.
     *
     * @param pObject the TestcategorylabBean object to use
     * @param pObjectToBeSet the InstitutionBean object to associate to the TestcategorylabBean 
     * @return the associated InstitutionBean pObject
     */
    // SET IMPORTED
    public TestcategorylabBean setInstitutionBean(TestcategorylabBean pObject,InstitutionBean pObjectToBeSet)
    {
        pObject.setInstitutionid(pObjectToBeSet.getInstitutionid());
        return pObject;
    }

    /**
     * Retrieves the TestcategoryBean object from the testcategorylab.testcategoryid field.
     *
     * @param pObject the TestcategorylabBean 
     * @return the associated TestcategoryBean pObject
     */
    // GET IMPORTED
    public TestcategoryBean getTestcategoryBean(TestcategorylabBean pObject) throws SQLException
    {
        TestcategoryBean other = TestcategoryManager.getInstance().createTestcategoryBean();
        other.setTestcategoryid(pObject.getTestcategoryid());
        return TestcategoryManager.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the TestcategorylabBean object to the TestcategoryBean object.
     *
     * @param pObject the TestcategorylabBean object to use
     * @param pObjectToBeSet the TestcategoryBean object to associate to the TestcategorylabBean 
     * @return the associated TestcategoryBean pObject
     */
    // SET IMPORTED
    public TestcategorylabBean setTestcategoryBean(TestcategorylabBean pObject,TestcategoryBean pObjectToBeSet)
    {
        pObject.setTestcategoryid(pObjectToBeSet.getTestcategoryid());
        return pObject;
    }



    //////////////////////////////////////
    // LOAD ALL
    //////////////////////////////////////

    /**
     * Loads all the rows from testcategorylab.
     *
     * @return an array of TestcategorylabManager pObject
     */
    //38
    public TestcategorylabBean[] loadAll() throws SQLException 
    {
        Connection c = null;
        PreparedStatement ps = null;
        try 
        {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM testcategorylab",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
     * Retrieves an array of TestcategorylabBean given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting TestcategorylabBean table 
     */
    //49
    public TestcategorylabBean[] loadByWhere(String where) throws SQLException
    {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves an array of TestcategorylabBean given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting TestcategorylabBean table 
     */
    //51
    public TestcategorylabBean[] loadByWhere(String where, int[] fieldList) throws SQLException
    {
        String sql = null;
        if(fieldList == null)
            sql = "select " + ALL_FIELDS + " from testcategorylab " + where;
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
            buff.append(" from testcategorylab ");
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

            return (TestcategorylabBean[])v.toArray(new TestcategorylabBean[0]);
        }
        finally
        {
            if (v != null) { v.clear(); }
            getManager().close(pStatement, rs);
            freeConnection(c);
        }
    }


    /**
     * Deletes all rows from testcategorylab table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException
    {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the testcategorylab table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM testcategorylab " + where;
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
     * Saves the TestcategorylabBean pObject into the database.
     *
     * @param pObject the TestcategorylabBean pObject to be saved
     */
    //100
    public TestcategorylabBean save(TestcategorylabBean pObject) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        try
        {
            c = getConnection();
            if (pObject.isNew())
            { // SAVE 
                beforeInsert(pObject); // listener callback
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into testcategorylab (");
    
                if (pObject.isTestcategoryidModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("testcategoryid");
                    _dirtyCount++;
                }

                if (pObject.isInstitutionidModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(",");
                    }
                    _sql.append("institutionid");
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

                if (pObject.isTestcategoryidModified()) {
                    Manager.setInteger(ps, ++_dirtyCount, pObject.getTestcategoryid());
                }
    
                if (pObject.isInstitutionidModified()) {
                    Manager.setInteger(ps, ++_dirtyCount, pObject.getInstitutionid());
                }
    
                ps.executeUpdate();
    
                pObject.isNew(false);
                pObject.resetIsModified();
                afterInsert(pObject); // listener callback
            }
            else 
            { // UPDATE 
                beforeUpdate(pObject); // listener callback
                _sql = new StringBuffer("UPDATE testcategorylab SET ");
                boolean useComma=false;

                if (pObject.isTestcategoryidModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("testcategoryid").append("=?");
                }

                if (pObject.isInstitutionidModified()) {
                    if (useComma) {
                        _sql.append(",");
                    } else {
                        useComma=true;
                    }
                    _sql.append("institutionid").append("=?");
                }
                _sql.append(" WHERE ");
                _sql.append("testcategorylab.testcategoryid=? AND testcategorylab.institutionid=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isTestcategoryidModified()) {
                      Manager.setInteger(ps, ++_dirtyCount, pObject.getTestcategoryid());
                }

                if (pObject.isInstitutionidModified()) {
                      Manager.setInteger(ps, ++_dirtyCount, pObject.getInstitutionid());
                }
    
                if (_dirtyCount == 0) {
                     return pObject;
                }
    
                Manager.setInteger(ps, ++_dirtyCount, pObject.getTestcategoryid());
                Manager.setInteger(ps, ++_dirtyCount, pObject.getInstitutionid());
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
     * Saves an array of TestcategorylabBean pObjects into the database.
     *
     * @param pObjects the TestcategorylabBean pObject table to be saved
     * @return the saved TestcategorylabBean array.
     */
    //65
    public TestcategorylabBean[] save(TestcategorylabBean[] pObjects) throws SQLException 
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
     * Loads a unique TestcategorylabBean pObject from a template one giving a c
     *
     * @param pObject the TestcategorylabBean pObject to look for
     * @return the pObject matching the template
     */
    //85
    public TestcategorylabBean loadUniqueUsingTemplate(TestcategorylabBean pObject) throws SQLException
    {
         TestcategorylabBean[] pReturn = loadUsingTemplate(pObject);
         if (pReturn.length == 0)
             return null;
         if (pReturn.length > 1)
             throw new SQLException("More than one element !!");
         return pReturn[0];
     }

    /**
     * Loads an array of TestcategorylabBean from a template one.
     *
     * @param pObject the TestcategorylabBean template to look for
     * @return all the TestcategorylabBean matching the template
     */
    //88
    public TestcategorylabBean[] loadUsingTemplate(TestcategorylabBean pObject) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer where = new StringBuffer("");
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from testcategorylab WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try
        {
            int _dirtyCount = 0;
    
             if (pObject.isTestcategoryidModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("testcategoryid= ?");
             }
    
             if (pObject.isInstitutionidModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("institutionid= ?");
             }
    
             if (_dirtyCount == 0) {
                 throw new SQLException ("The pObject to look for is invalid : not initialized !");
             }
             _sql.append(_sqlWhere);
             c = getConnection();
             ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             _dirtyCount = 0;
    
             if (pObject.isTestcategoryidModified()) {
                 Manager.setInteger(ps, ++_dirtyCount, pObject.getTestcategoryid());
             }
    
             if (pObject.isInstitutionidModified()) {
                 Manager.setInteger(ps, ++_dirtyCount, pObject.getInstitutionid());
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
     * Deletes rows using a TestcategorylabBean template.
     *
     * @param pObject the TestcategorylabBean object(s) to be deleted
     * @return the number of deleted objects
     */
    //63
    public int deleteUsingTemplate(TestcategorylabBean pObject) throws SQLException
    {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try 
        {
            sql = new StringBuffer("DELETE FROM testcategorylab WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isTestcategoryidInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("testcategoryid").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isInstitutionidInitialized()) {
                if (_dirtyAnd > 0)
                    sql.append(" AND ");
                sql.append("institutionid").append("=?");
                _dirtyAnd ++;
            }
    
            c = getConnection();
            ps = c.prepareStatement(sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int _dirtyCount = 0;
    
            if (pObject.isTestcategoryidInitialized()) {
                Manager.setInteger(ps, ++_dirtyCount, pObject.getTestcategoryid());
            }
    
            if (pObject.isInstitutionidInitialized()) {
                Manager.setInteger(ps, ++_dirtyCount, pObject.getInstitutionid());
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
     * Retrieves the number of rows of the table testcategorylab.
     *
     * @return the number of rows returned
     */
    //78
    public int countAll() throws SQLException
    {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table testcategorylab with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException
    {
        String sql = "select count(*) as MCOUNT from testcategorylab " + where;
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
     * Retrieves the number of rows of the table testcategorylab with a prepared statement.
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
     * Looks for the number of elements of a specific TestcategorylabBean pObject given a c
     *
     * @param pObject the TestcategorylabBean pObject to look for
     * @return the number of rows returned
     */
    //83
    public int countUsingTemplate(TestcategorylabBean pObject) throws SQLException
    {
        StringBuffer where = new StringBuffer("");
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try
        {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from testcategorylab WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isTestcategoryidModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("testcategoryid= ?");
                }
    
                if (pObject.isInstitutionidModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("institutionid= ?");
                }
    
                if (_dirtyCount == 0)
                   throw new SQLException ("The pObject to look is unvalid : not initialized !");
    
                _sql.append(_sqlWhere);
                c = getConnection();
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
                _dirtyCount = 0;
    
                if (pObject.isTestcategoryidModified()) {
                    Manager.setInteger(ps, ++_dirtyCount, pObject.getTestcategoryid());
                }
    
                if (pObject.isInstitutionidModified()) {
                    Manager.setInteger(ps, ++_dirtyCount, pObject.getInstitutionid());
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
     * Transforms a ResultSet iterating on the testcategorylab on a TestcategorylabBean pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting TestcategorylabBean pObject
     */
    //72
    public TestcategorylabBean decodeRow(ResultSet rs) throws SQLException
    {
        TestcategorylabBean pObject = createTestcategorylabBean();
        pObject.setTestcategoryid(Manager.getInteger(rs, 1));
        pObject.setInstitutionid(Manager.getInteger(rs, 2));

        pObject.isNew(false);
        pObject.resetIsModified();

        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the testcategorylab table on a TestcategorylabBean pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting TestcategorylabBean pObject
     */
    //73
    public TestcategorylabBean decodeRow(ResultSet rs, int[] fieldList) throws SQLException
    {
        TestcategorylabBean pObject = createTestcategorylabBean();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++)
        {
            switch(fieldList[i]) {
                case ID_TESTCATEGORYID:
                    ++pos;
                    pObject.setTestcategoryid(Manager.getInteger(rs, pos));
                    break;
                case ID_INSTITUTIONID:
                    ++pos;
                    pObject.setInstitutionid(Manager.getInteger(rs, pos));
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
     * @return an array of TestcategorylabBean 
     */
    //41
    public TestcategorylabBean[] loadByPreparedStatement(PreparedStatement ps) throws SQLException
    {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return an array of TestcategorylabBean 
     */
    public TestcategorylabBean[] loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException
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
            return (TestcategorylabBean[])v.toArray(new TestcategorylabBean[0]);
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
    private TestcategorylabListener listener = null;

    /**
     * Registers a unique TestcategorylabListener listener.
     */
    //66.5
    public void registerListener(TestcategorylabListener listener) {
        this.listener = listener;
    }

    /**
     * Before the save of the TestcategorylabBean pObject.
     *
     * @param pObject the TestcategorylabBean pObject to be saved
     */
    //67
    void beforeInsert(TestcategorylabBean pObject) throws SQLException {
        if (listener != null)
            listener.beforeInsert(pObject);
    }

    /**
     * After the save of the TestcategorylabBean pObject.
     *
     * @param pObject the TestcategorylabBean pObject to be saved
     */
    //68
    void afterInsert(TestcategorylabBean pObject) throws SQLException {
        if (listener != null)
            listener.afterInsert(pObject);
    }

    /**
     * Before the update of the TestcategorylabBean pObject.
     *
     * @param pObject the TestcategorylabBean pObject to be updated
     */
    //69
    void beforeUpdate(TestcategorylabBean pObject) throws SQLException {
        if (listener != null)
            listener.beforeUpdate(pObject);
    }

    /**
     * After the update of the TestcategorylabBean pObject.
     *
     * @param pObject the TestcategorylabBean pObject to be updated
     */
    //70
    void afterUpdate(TestcategorylabBean pObject) throws SQLException {
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
