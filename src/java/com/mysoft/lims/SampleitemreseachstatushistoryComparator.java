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
 * Comparator class is used to sort the SampleitemreseachstatushistoryBean objects.
 */
public class SampleitemreseachstatushistoryComparator implements Comparator
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
     * Constructor class for SampleitemreseachstatushistoryComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SampleitemreseachstatushistoryComparator(SampleitemreseachstatushistoryManager.SAMPLEITEMRESEACHSTATUSHISTORYID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SampleitemreseachstatushistoryManager.ID_SAMPLEITEMRESEACHSTATUSHISTORYID
     *   <li>SampleitemreseachstatushistoryManager.ID_SAMPLEITEMRESEACHID
     *   <li>SampleitemreseachstatushistoryManager.ID_STATUS
     *   <li>SampleitemreseachstatushistoryManager.ID_REASON
     *   <li>SampleitemreseachstatushistoryManager.ID_METHOD
     *   <li>SampleitemreseachstatushistoryManager.ID_STATUSDATE
     *   <li>SampleitemreseachstatushistoryManager.ID_REGBYID
     *   <li>SampleitemreseachstatushistoryManager.ID_REGDATE
     * </ul>
     */
    public SampleitemreseachstatushistoryComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for SampleitemreseachstatushistoryComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SampleitemreseachstatushistoryComparator(SampleitemreseachstatushistoryManager.SAMPLEITEMRESEACHSTATUSHISTORYID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SampleitemreseachstatushistoryManager.ID_SAMPLEITEMRESEACHSTATUSHISTORYID
     *   <li>SampleitemreseachstatushistoryManager.ID_SAMPLEITEMRESEACHID
     *   <li>SampleitemreseachstatushistoryManager.ID_STATUS
     *   <li>SampleitemreseachstatushistoryManager.ID_REASON
     *   <li>SampleitemreseachstatushistoryManager.ID_METHOD
     *   <li>SampleitemreseachstatushistoryManager.ID_STATUSDATE
     *   <li>SampleitemreseachstatushistoryManager.ID_REGBYID
     *   <li>SampleitemreseachstatushistoryManager.ID_REGDATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public SampleitemreseachstatushistoryComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        SampleitemreseachstatushistoryBean b1 = (SampleitemreseachstatushistoryBean)pObj1;
        SampleitemreseachstatushistoryBean b2 = (SampleitemreseachstatushistoryBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case SampleitemreseachstatushistoryManager.ID_SAMPLEITEMRESEACHSTATUSHISTORYID:
                if (b1.getSampleitemreseachstatushistoryid() == null && b2.getSampleitemreseachstatushistoryid() != null) {
                    iReturn = -1;
                } else if (b1.getSampleitemreseachstatushistoryid() == null && b2.getSampleitemreseachstatushistoryid() == null) {
                    iReturn = 0;
                } else if (b1.getSampleitemreseachstatushistoryid() != null && b2.getSampleitemreseachstatushistoryid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getSampleitemreseachstatushistoryid().compareTo(b2.getSampleitemreseachstatushistoryid());
                }
                break;
            case SampleitemreseachstatushistoryManager.ID_SAMPLEITEMRESEACHID:
                if (b1.getSampleitemreseachid() == null && b2.getSampleitemreseachid() != null) {
                    iReturn = -1;
                } else if (b1.getSampleitemreseachid() == null && b2.getSampleitemreseachid() == null) {
                    iReturn = 0;
                } else if (b1.getSampleitemreseachid() != null && b2.getSampleitemreseachid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getSampleitemreseachid().compareTo(b2.getSampleitemreseachid());
                }
                break;
            case SampleitemreseachstatushistoryManager.ID_STATUS:
                if (b1.getStatus() == null && b2.getStatus() != null) {
                    iReturn = -1;
                } else if (b1.getStatus() == null && b2.getStatus() == null) {
                    iReturn = 0;
                } else if (b1.getStatus() != null && b2.getStatus() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getStatus().compareTo(b2.getStatus());
                }
                break;
            case SampleitemreseachstatushistoryManager.ID_REASON:
                if (b1.getReason() == null && b2.getReason() != null) {
                    iReturn = -1;
                } else if (b1.getReason() == null && b2.getReason() == null) {
                    iReturn = 0;
                } else if (b1.getReason() != null && b2.getReason() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getReason().compareTo(b2.getReason());
                }
                break;
            case SampleitemreseachstatushistoryManager.ID_METHOD:
                if (b1.getMethod() == null && b2.getMethod() != null) {
                    iReturn = -1;
                } else if (b1.getMethod() == null && b2.getMethod() == null) {
                    iReturn = 0;
                } else if (b1.getMethod() != null && b2.getMethod() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getMethod().compareTo(b2.getMethod());
                }
                break;
            case SampleitemreseachstatushistoryManager.ID_STATUSDATE:
                if (b1.getStatusdate() == null && b2.getStatusdate() != null) {
                    iReturn = -1;
                } else if (b1.getStatusdate() == null && b2.getStatusdate() == null) {
                    iReturn = 0;
                } else if (b1.getStatusdate() != null && b2.getStatusdate() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getStatusdate().compareTo(b2.getStatusdate());
                }
                break;
            case SampleitemreseachstatushistoryManager.ID_REGBYID:
                if (b1.getRegbyid() == null && b2.getRegbyid() != null) {
                    iReturn = -1;
                } else if (b1.getRegbyid() == null && b2.getRegbyid() == null) {
                    iReturn = 0;
                } else if (b1.getRegbyid() != null && b2.getRegbyid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getRegbyid().compareTo(b2.getRegbyid());
                }
                break;
            case SampleitemreseachstatushistoryManager.ID_REGDATE:
                if (b1.getRegdate() == null && b2.getRegdate() != null) {
                    iReturn = -1;
                } else if (b1.getRegdate() == null && b2.getRegdate() == null) {
                    iReturn = 0;
                } else if (b1.getRegdate() != null && b2.getRegdate() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getRegdate().compareTo(b2.getRegdate());
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