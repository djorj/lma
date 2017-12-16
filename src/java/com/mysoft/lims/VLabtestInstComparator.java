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

import java.util.Comparator;
// imports+ 

// imports- 

/**
 * Comparator class is used to sort the VLabtestInstBean objects.
 */
public class VLabtestInstComparator implements Comparator
// extends+ 

// extends- 
{
    /**
     * Holds the field on which the comparison is performed.
     */
    private int iType;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for VLabtestInstComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new VLabtestInstComparator(VLabtestInstManager.LABTESTID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>VLabtestInstManager.ID_LABTESTID
     *   <li>VLabtestInstManager.ID_TESTNAME
     *   <li>VLabtestInstManager.ID_INSTITUTIONID
     *   <li>VLabtestInstManager.ID_LAB
     * </ul>
     */
    public VLabtestInstComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for VLabtestInstComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new VLabtestInstComparator(VLabtestInstManager.LABTESTID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>VLabtestInstManager.ID_LABTESTID
     *   <li>VLabtestInstManager.ID_TESTNAME
     *   <li>VLabtestInstManager.ID_INSTITUTIONID
     *   <li>VLabtestInstManager.ID_LAB
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public VLabtestInstComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        VLabtestInstBean b1 = (VLabtestInstBean)pObj1;
        VLabtestInstBean b2 = (VLabtestInstBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case VLabtestInstManager.ID_LABTESTID:
                if (b1.getLabtestid() == null && b2.getLabtestid() != null) {
                    iReturn = -1;
                } else if (b1.getLabtestid() == null && b2.getLabtestid() == null) {
                    iReturn = 0;
                } else if (b1.getLabtestid() != null && b2.getLabtestid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getLabtestid().compareTo(b2.getLabtestid());
                }
                break;
            case VLabtestInstManager.ID_TESTNAME:
                if (b1.getTestname() == null && b2.getTestname() != null) {
                    iReturn = -1;
                } else if (b1.getTestname() == null && b2.getTestname() == null) {
                    iReturn = 0;
                } else if (b1.getTestname() != null && b2.getTestname() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getTestname().compareTo(b2.getTestname());
                }
                break;
            case VLabtestInstManager.ID_INSTITUTIONID:
                if (b1.getInstitutionid() == null && b2.getInstitutionid() != null) {
                    iReturn = -1;
                } else if (b1.getInstitutionid() == null && b2.getInstitutionid() == null) {
                    iReturn = 0;
                } else if (b1.getInstitutionid() != null && b2.getInstitutionid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getInstitutionid().compareTo(b2.getInstitutionid());
                }
                break;
            case VLabtestInstManager.ID_LAB:
                if (b1.getLab() == null && b2.getLab() != null) {
                    iReturn = -1;
                } else if (b1.getLab() == null && b2.getLab() == null) {
                    iReturn = 0;
                } else if (b1.getLab() != null && b2.getLab() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getLab().compareTo(b2.getLab());
                }
                break;
            default: 
                throw new IllegalArgumentException("Type passed for the field is not supported");
        }

        return bReverse ? (-1 * iReturn) : iReturn;
    }
// class+ 

// class- 
}