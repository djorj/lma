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
 * Comparator class is used to sort the OperBean objects.
 */
public class OperComparator implements Comparator
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
     * Constructor class for OperComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new OperComparator(OperManager.OPERID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>OperManager.ID_OPERID
     *   <li>OperManager.ID_NAME
     *   <li>OperManager.ID_TYPE
     * </ul>
     */
    public OperComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for OperComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new OperComparator(OperManager.OPERID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>OperManager.ID_OPERID
     *   <li>OperManager.ID_NAME
     *   <li>OperManager.ID_TYPE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public OperComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        OperBean b1 = (OperBean)pObj1;
        OperBean b2 = (OperBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case OperManager.ID_OPERID:
                if (b1.getOperid() == null && b2.getOperid() != null) {
                    iReturn = -1;
                } else if (b1.getOperid() == null && b2.getOperid() == null) {
                    iReturn = 0;
                } else if (b1.getOperid() != null && b2.getOperid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getOperid().compareTo(b2.getOperid());
                }
                break;
            case OperManager.ID_NAME:
                if (b1.getName() == null && b2.getName() != null) {
                    iReturn = -1;
                } else if (b1.getName() == null && b2.getName() == null) {
                    iReturn = 0;
                } else if (b1.getName() != null && b2.getName() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getName().compareTo(b2.getName());
                }
                break;
            case OperManager.ID_TYPE:
                if (b1.getType() == null && b2.getType() != null) {
                    iReturn = -1;
                } else if (b1.getType() == null && b2.getType() == null) {
                    iReturn = 0;
                } else if (b1.getType() != null && b2.getType() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getType().compareTo(b2.getType());
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
