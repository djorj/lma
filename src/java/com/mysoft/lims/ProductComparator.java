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
 * Comparator class is used to sort the ProductBean objects.
 */
public class ProductComparator implements Comparator
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
     * Constructor class for ProductComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ProductComparator(ProductManager.PRODUCTID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ProductManager.ID_PRODUCTID
     *   <li>ProductManager.ID_CODE
     *   <li>ProductManager.ID_NAME
     *   <li>ProductManager.ID_PUNITID
     *   <li>ProductManager.ID_LIMITQTY
     *   <li>ProductManager.ID_EXP1
     *   <li>ProductManager.ID_EXP2
     *   <li>ProductManager.ID_PRODUCTGROUPID
     *   <li>ProductManager.ID_INVNUMBER
     *   <li>ProductManager.ID_SERIALNUM
     *   <li>ProductManager.ID_BRANDNAME
     *   <li>ProductManager.ID_MODEL
     * </ul>
     */
    public ProductComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for ProductComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ProductComparator(ProductManager.PRODUCTID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ProductManager.ID_PRODUCTID
     *   <li>ProductManager.ID_CODE
     *   <li>ProductManager.ID_NAME
     *   <li>ProductManager.ID_PUNITID
     *   <li>ProductManager.ID_LIMITQTY
     *   <li>ProductManager.ID_EXP1
     *   <li>ProductManager.ID_EXP2
     *   <li>ProductManager.ID_PRODUCTGROUPID
     *   <li>ProductManager.ID_INVNUMBER
     *   <li>ProductManager.ID_SERIALNUM
     *   <li>ProductManager.ID_BRANDNAME
     *   <li>ProductManager.ID_MODEL
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public ProductComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        ProductBean b1 = (ProductBean)pObj1;
        ProductBean b2 = (ProductBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case ProductManager.ID_PRODUCTID:
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
            case ProductManager.ID_CODE:
                if (b1.getCode() == null && b2.getCode() != null) {
                    iReturn = -1;
                } else if (b1.getCode() == null && b2.getCode() == null) {
                    iReturn = 0;
                } else if (b1.getCode() != null && b2.getCode() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getCode().compareTo(b2.getCode());
                }
                break;
            case ProductManager.ID_NAME:
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
            case ProductManager.ID_PUNITID:
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
            case ProductManager.ID_LIMITQTY:
                if (b1.getLimitqty() == null && b2.getLimitqty() != null) {
                    iReturn = -1;
                } else if (b1.getLimitqty() == null && b2.getLimitqty() == null) {
                    iReturn = 0;
                } else if (b1.getLimitqty() != null && b2.getLimitqty() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getLimitqty().compareTo(b2.getLimitqty());
                }
                break;
            case ProductManager.ID_EXP1:
                if (b1.getExp1() == null && b2.getExp1() != null) {
                    iReturn = -1;
                } else if (b1.getExp1() == null && b2.getExp1() == null) {
                    iReturn = 0;
                } else if (b1.getExp1() != null && b2.getExp1() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getExp1().compareTo(b2.getExp1());
                }
                break;
            case ProductManager.ID_EXP2:
                if (b1.getExp2() == null && b2.getExp2() != null) {
                    iReturn = -1;
                } else if (b1.getExp2() == null && b2.getExp2() == null) {
                    iReturn = 0;
                } else if (b1.getExp2() != null && b2.getExp2() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getExp2().compareTo(b2.getExp2());
                }
                break;
            case ProductManager.ID_PRODUCTGROUPID:
                if (b1.getProductgroupid() == null && b2.getProductgroupid() != null) {
                    iReturn = -1;
                } else if (b1.getProductgroupid() == null && b2.getProductgroupid() == null) {
                    iReturn = 0;
                } else if (b1.getProductgroupid() != null && b2.getProductgroupid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getProductgroupid().compareTo(b2.getProductgroupid());
                }
                break;
            case ProductManager.ID_INVNUMBER:
                if (b1.getInvnumber() == null && b2.getInvnumber() != null) {
                    iReturn = -1;
                } else if (b1.getInvnumber() == null && b2.getInvnumber() == null) {
                    iReturn = 0;
                } else if (b1.getInvnumber() != null && b2.getInvnumber() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getInvnumber().compareTo(b2.getInvnumber());
                }
                break;
            case ProductManager.ID_SERIALNUM:
                if (b1.getSerialnum() == null && b2.getSerialnum() != null) {
                    iReturn = -1;
                } else if (b1.getSerialnum() == null && b2.getSerialnum() == null) {
                    iReturn = 0;
                } else if (b1.getSerialnum() != null && b2.getSerialnum() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getSerialnum().compareTo(b2.getSerialnum());
                }
                break;
            case ProductManager.ID_BRANDNAME:
                if (b1.getBrandname() == null && b2.getBrandname() != null) {
                    iReturn = -1;
                } else if (b1.getBrandname() == null && b2.getBrandname() == null) {
                    iReturn = 0;
                } else if (b1.getBrandname() != null && b2.getBrandname() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getBrandname().compareTo(b2.getBrandname());
                }
                break;
            case ProductManager.ID_MODEL:
                if (b1.getModel() == null && b2.getModel() != null) {
                    iReturn = -1;
                } else if (b1.getModel() == null && b2.getModel() == null) {
                    iReturn = 0;
                } else if (b1.getModel() != null && b2.getModel() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getModel().compareTo(b2.getModel());
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
