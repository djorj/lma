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
 * Comparator class is used to sort the ExtraparamBean objects.
 */
public class ExtraparamComparator implements Comparator
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
     * Constructor class for ExtraparamComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ExtraparamComparator(ExtraparamManager.EXTRAPARAMID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ExtraparamManager.ID_EXTRAPARAMID
     *   <li>ExtraparamManager.ID_NAME
     *   <li>ExtraparamManager.ID_DESCRIPTION
     *   <li>ExtraparamManager.ID_RESTYPEID
     *   <li>ExtraparamManager.ID_SAMPLETYPEID
     *   <li>ExtraparamManager.ID_LABTESTID
     * </ul>
     */
    public ExtraparamComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for ExtraparamComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ExtraparamComparator(ExtraparamManager.EXTRAPARAMID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ExtraparamManager.ID_EXTRAPARAMID
     *   <li>ExtraparamManager.ID_NAME
     *   <li>ExtraparamManager.ID_DESCRIPTION
     *   <li>ExtraparamManager.ID_RESTYPEID
     *   <li>ExtraparamManager.ID_SAMPLETYPEID
     *   <li>ExtraparamManager.ID_LABTESTID
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public ExtraparamComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        ExtraparamBean b1 = (ExtraparamBean)pObj1;
        ExtraparamBean b2 = (ExtraparamBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case ExtraparamManager.ID_EXTRAPARAMID:
                if (b1.getExtraparamid() == null && b2.getExtraparamid() != null) {
                    iReturn = -1;
                } else if (b1.getExtraparamid() == null && b2.getExtraparamid() == null) {
                    iReturn = 0;
                } else if (b1.getExtraparamid() != null && b2.getExtraparamid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getExtraparamid().compareTo(b2.getExtraparamid());
                }
                break;
            case ExtraparamManager.ID_NAME:
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
            case ExtraparamManager.ID_DESCRIPTION:
                if (b1.getDescription() == null && b2.getDescription() != null) {
                    iReturn = -1;
                } else if (b1.getDescription() == null && b2.getDescription() == null) {
                    iReturn = 0;
                } else if (b1.getDescription() != null && b2.getDescription() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getDescription().compareTo(b2.getDescription());
                }
                break;
            case ExtraparamManager.ID_RESTYPEID:
                if (b1.getRestypeid() == null && b2.getRestypeid() != null) {
                    iReturn = -1;
                } else if (b1.getRestypeid() == null && b2.getRestypeid() == null) {
                    iReturn = 0;
                } else if (b1.getRestypeid() != null && b2.getRestypeid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getRestypeid().compareTo(b2.getRestypeid());
                }
                break;
            case ExtraparamManager.ID_SAMPLETYPEID:
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
            case ExtraparamManager.ID_LABTESTID:
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
            default: 
                throw new IllegalArgumentException("Type passed for the field is not supported");
        }

        return bReverse ? (-1 * iReturn) : iReturn;
    }
// class+ 

// class- 
}