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
 * Comparator class is used to sort the ProductunitBean objects.
 */
public class ProductunitComparator implements Comparator
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
     * Constructor class for ProductunitComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ProductunitComparator(ProductunitManager.PRODUCTID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ProductunitManager.ID_PRODUCTID
     *   <li>ProductunitManager.ID_PUNITID
     *   <li>ProductunitManager.ID_AMOUNT
     * </ul>
     */
    public ProductunitComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for ProductunitComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ProductunitComparator(ProductunitManager.PRODUCTID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ProductunitManager.ID_PRODUCTID
     *   <li>ProductunitManager.ID_PUNITID
     *   <li>ProductunitManager.ID_AMOUNT
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public ProductunitComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        ProductunitBean b1 = (ProductunitBean)pObj1;
        ProductunitBean b2 = (ProductunitBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case ProductunitManager.ID_PRODUCTID:
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
            case ProductunitManager.ID_PUNITID:
                if (b1.getPunitid() == null && b2.getPunitid() != null) {
                    iReturn = -1;
                } else if (b1.getPunitid() == null && b2.getPunitid() == null) {
                    iReturn = 0;
                } else if (b1.getPunitid() != null && b2.getPunitid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getPunitid().compareTo(b2.getPunitid());
                }
                break;
            case ProductunitManager.ID_AMOUNT:
                if (b1.getAmount() == null && b2.getAmount() != null) {
                    iReturn = -1;
                } else if (b1.getAmount() == null && b2.getAmount() == null) {
                    iReturn = 0;
                } else if (b1.getAmount() != null && b2.getAmount() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getAmount().compareTo(b2.getAmount());
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
