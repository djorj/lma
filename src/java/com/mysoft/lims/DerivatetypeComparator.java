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
 * Comparator class is used to sort the DerivatetypeBean objects.
 */
public class DerivatetypeComparator implements Comparator
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
     * Constructor class for DerivatetypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new DerivatetypeComparator(DerivatetypeManager.DERIVATETYPEID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>DerivatetypeManager.ID_DERIVATETYPEID
     *   <li>DerivatetypeManager.ID_NAME
     *   <li>DerivatetypeManager.ID_TYPE
     * </ul>
     */
    public DerivatetypeComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for DerivatetypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new DerivatetypeComparator(DerivatetypeManager.DERIVATETYPEID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>DerivatetypeManager.ID_DERIVATETYPEID
     *   <li>DerivatetypeManager.ID_NAME
     *   <li>DerivatetypeManager.ID_TYPE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public DerivatetypeComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        DerivatetypeBean b1 = (DerivatetypeBean)pObj1;
        DerivatetypeBean b2 = (DerivatetypeBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case DerivatetypeManager.ID_DERIVATETYPEID:
                if (b1.getDerivatetypeid() == null && b2.getDerivatetypeid() != null) {
                    iReturn = -1;
                } else if (b1.getDerivatetypeid() == null && b2.getDerivatetypeid() == null) {
                    iReturn = 0;
                } else if (b1.getDerivatetypeid() != null && b2.getDerivatetypeid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getDerivatetypeid().compareTo(b2.getDerivatetypeid());
                }
                break;
            case DerivatetypeManager.ID_NAME:
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
            case DerivatetypeManager.ID_TYPE:
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
