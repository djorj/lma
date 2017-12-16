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
 * Comparator class is used to sort the StockmovementBean objects.
 */
public class StockmovementComparator implements Comparator
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
     * Constructor class for StockmovementComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StockmovementComparator(StockmovementManager.STOCKMOVEMENTID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StockmovementManager.ID_STOCKMOVEMENTID
     *   <li>StockmovementManager.ID_STOCKID
     *   <li>StockmovementManager.ID_OPERDATE
     *   <li>StockmovementManager.ID_PRODUCTID
     *   <li>StockmovementManager.ID_OPERID
     *   <li>StockmovementManager.ID_QUANTITY
     *   <li>StockmovementManager.ID_UNITPRICE
     *   <li>StockmovementManager.ID_PARENTID
     *   <li>StockmovementManager.ID_CURQUANTITY
     *   <li>StockmovementManager.ID_MSTOCKID
     *   <li>StockmovementManager.ID_MCONTRAGENTID
     *   <li>StockmovementManager.ID_TESTRESULTID
     *   <li>StockmovementManager.ID_TESTRESULTQUANTITY
     *   <li>StockmovementManager.ID_INVOICEID
     *   <li>StockmovementManager.ID_NOTE
     *   <li>StockmovementManager.ID_REGBYID
     *   <li>StockmovementManager.ID_REGDATE
     *   <li>StockmovementManager.ID_EXPDATE1
     *   <li>StockmovementManager.ID_EXPDATE2
     * </ul>
     */
    public StockmovementComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for StockmovementComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StockmovementComparator(StockmovementManager.STOCKMOVEMENTID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StockmovementManager.ID_STOCKMOVEMENTID
     *   <li>StockmovementManager.ID_STOCKID
     *   <li>StockmovementManager.ID_OPERDATE
     *   <li>StockmovementManager.ID_PRODUCTID
     *   <li>StockmovementManager.ID_OPERID
     *   <li>StockmovementManager.ID_QUANTITY
     *   <li>StockmovementManager.ID_UNITPRICE
     *   <li>StockmovementManager.ID_PARENTID
     *   <li>StockmovementManager.ID_CURQUANTITY
     *   <li>StockmovementManager.ID_MSTOCKID
     *   <li>StockmovementManager.ID_MCONTRAGENTID
     *   <li>StockmovementManager.ID_TESTRESULTID
     *   <li>StockmovementManager.ID_TESTRESULTQUANTITY
     *   <li>StockmovementManager.ID_INVOICEID
     *   <li>StockmovementManager.ID_NOTE
     *   <li>StockmovementManager.ID_REGBYID
     *   <li>StockmovementManager.ID_REGDATE
     *   <li>StockmovementManager.ID_EXPDATE1
     *   <li>StockmovementManager.ID_EXPDATE2
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public StockmovementComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        StockmovementBean b1 = (StockmovementBean)pObj1;
        StockmovementBean b2 = (StockmovementBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case StockmovementManager.ID_STOCKMOVEMENTID:
                if (b1.getStockmovementid() == null && b2.getStockmovementid() != null) {
                    iReturn = -1;
                } else if (b1.getStockmovementid() == null && b2.getStockmovementid() == null) {
                    iReturn = 0;
                } else if (b1.getStockmovementid() != null && b2.getStockmovementid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getStockmovementid().compareTo(b2.getStockmovementid());
                }
                break;
            case StockmovementManager.ID_STOCKID:
                if (b1.getStockid() == null && b2.getStockid() != null) {
                    iReturn = -1;
                } else if (b1.getStockid() == null && b2.getStockid() == null) {
                    iReturn = 0;
                } else if (b1.getStockid() != null && b2.getStockid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getStockid().compareTo(b2.getStockid());
                }
                break;
            case StockmovementManager.ID_OPERDATE:
                if (b1.getOperdate() == null && b2.getOperdate() != null) {
                    iReturn = -1;
                } else if (b1.getOperdate() == null && b2.getOperdate() == null) {
                    iReturn = 0;
                } else if (b1.getOperdate() != null && b2.getOperdate() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getOperdate().compareTo(b2.getOperdate());
                }
                break;
            case StockmovementManager.ID_PRODUCTID:
                if (b1.getProductid() == null && b2.getProductid() != null) {
                    iReturn = -1;
                } else if (b1.getProductid() == null && b2.getProductid() == null) {
                    iReturn = 0;
                } else if (b1.getProductid() != null && b2.getProductid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getProductid().compareTo(b2.getProductid());
                }
                break;
            case StockmovementManager.ID_OPERID:
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
            case StockmovementManager.ID_QUANTITY:
                if (b1.getQuantity() == null && b2.getQuantity() != null) {
                    iReturn = -1;
                } else if (b1.getQuantity() == null && b2.getQuantity() == null) {
                    iReturn = 0;
                } else if (b1.getQuantity() != null && b2.getQuantity() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getQuantity().compareTo(b2.getQuantity());
                }
                break;
            case StockmovementManager.ID_UNITPRICE:
                if (b1.getUnitprice() == null && b2.getUnitprice() != null) {
                    iReturn = -1;
                } else if (b1.getUnitprice() == null && b2.getUnitprice() == null) {
                    iReturn = 0;
                } else if (b1.getUnitprice() != null && b2.getUnitprice() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getUnitprice().compareTo(b2.getUnitprice());
                }
                break;
            case StockmovementManager.ID_PARENTID:
                if (b1.getParentid() == null && b2.getParentid() != null) {
                    iReturn = -1;
                } else if (b1.getParentid() == null && b2.getParentid() == null) {
                    iReturn = 0;
                } else if (b1.getParentid() != null && b2.getParentid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getParentid().compareTo(b2.getParentid());
                }
                break;
            case StockmovementManager.ID_CURQUANTITY:
                if (b1.getCurquantity() == null && b2.getCurquantity() != null) {
                    iReturn = -1;
                } else if (b1.getCurquantity() == null && b2.getCurquantity() == null) {
                    iReturn = 0;
                } else if (b1.getCurquantity() != null && b2.getCurquantity() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getCurquantity().compareTo(b2.getCurquantity());
                }
                break;
            case StockmovementManager.ID_MSTOCKID:
                if (b1.getMstockid() == null && b2.getMstockid() != null) {
                    iReturn = -1;
                } else if (b1.getMstockid() == null && b2.getMstockid() == null) {
                    iReturn = 0;
                } else if (b1.getMstockid() != null && b2.getMstockid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getMstockid().compareTo(b2.getMstockid());
                }
                break;
            case StockmovementManager.ID_MCONTRAGENTID:
                if (b1.getMcontragentid() == null && b2.getMcontragentid() != null) {
                    iReturn = -1;
                } else if (b1.getMcontragentid() == null && b2.getMcontragentid() == null) {
                    iReturn = 0;
                } else if (b1.getMcontragentid() != null && b2.getMcontragentid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getMcontragentid().compareTo(b2.getMcontragentid());
                }
                break;
            case StockmovementManager.ID_TESTRESULTID:
                if (b1.getTestresultid() == null && b2.getTestresultid() != null) {
                    iReturn = -1;
                } else if (b1.getTestresultid() == null && b2.getTestresultid() == null) {
                    iReturn = 0;
                } else if (b1.getTestresultid() != null && b2.getTestresultid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getTestresultid().compareTo(b2.getTestresultid());
                }
                break;
            case StockmovementManager.ID_TESTRESULTQUANTITY:
                if (b1.getTestresultquantity() == null && b2.getTestresultquantity() != null) {
                    iReturn = -1;
                } else if (b1.getTestresultquantity() == null && b2.getTestresultquantity() == null) {
                    iReturn = 0;
                } else if (b1.getTestresultquantity() != null && b2.getTestresultquantity() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getTestresultquantity().compareTo(b2.getTestresultquantity());
                }
                break;
            case StockmovementManager.ID_INVOICEID:
                if (b1.getInvoiceid() == null && b2.getInvoiceid() != null) {
                    iReturn = -1;
                } else if (b1.getInvoiceid() == null && b2.getInvoiceid() == null) {
                    iReturn = 0;
                } else if (b1.getInvoiceid() != null && b2.getInvoiceid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getInvoiceid().compareTo(b2.getInvoiceid());
                }
                break;
            case StockmovementManager.ID_NOTE:
                if (b1.getNote() == null && b2.getNote() != null) {
                    iReturn = -1;
                } else if (b1.getNote() == null && b2.getNote() == null) {
                    iReturn = 0;
                } else if (b1.getNote() != null && b2.getNote() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getNote().compareTo(b2.getNote());
                }
                break;
            case StockmovementManager.ID_REGBYID:
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
            case StockmovementManager.ID_REGDATE:
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
            case StockmovementManager.ID_EXPDATE1:
                if (b1.getExpdate1() == null && b2.getExpdate1() != null) {
                    iReturn = -1;
                } else if (b1.getExpdate1() == null && b2.getExpdate1() == null) {
                    iReturn = 0;
                } else if (b1.getExpdate1() != null && b2.getExpdate1() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getExpdate1().compareTo(b2.getExpdate1());
                }
                break;
            case StockmovementManager.ID_EXPDATE2:
                if (b1.getExpdate2() == null && b2.getExpdate2() != null) {
                    iReturn = -1;
                } else if (b1.getExpdate2() == null && b2.getExpdate2() == null) {
                    iReturn = 0;
                } else if (b1.getExpdate2() != null && b2.getExpdate2() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getExpdate2().compareTo(b2.getExpdate2());
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