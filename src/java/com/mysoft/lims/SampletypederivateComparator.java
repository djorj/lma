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
 * Comparator class is used to sort the SampletypederivateBean objects.
 */
public class SampletypederivateComparator implements Comparator
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
     * Constructor class for SampletypederivateComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SampletypederivateComparator(SampletypederivateManager.SAMPLETYPEID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SampletypederivateManager.ID_SAMPLETYPEID
     *   <li>SampletypederivateManager.ID_DERIVATETYPEID
     * </ul>
     */
    public SampletypederivateComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for SampletypederivateComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SampletypederivateComparator(SampletypederivateManager.SAMPLETYPEID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SampletypederivateManager.ID_SAMPLETYPEID
     *   <li>SampletypederivateManager.ID_DERIVATETYPEID
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public SampletypederivateComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        SampletypederivateBean b1 = (SampletypederivateBean)pObj1;
        SampletypederivateBean b2 = (SampletypederivateBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case SampletypederivateManager.ID_SAMPLETYPEID:
                if (b1.getSampletypeid() == null && b2.getSampletypeid() != null) {
                    iReturn = -1;
                } else if (b1.getSampletypeid() == null && b2.getSampletypeid() == null) {
                    iReturn = 0;
                } else if (b1.getSampletypeid() != null && b2.getSampletypeid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getSampletypeid().compareTo(b2.getSampletypeid());
                }
                break;
            case SampletypederivateManager.ID_DERIVATETYPEID:
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
            default: 
                throw new IllegalArgumentException("Type passed for the field is not supported");
        }

        return bReverse ? (-1 * iReturn) : iReturn;
    }
// class+ 

// class- 
}
