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
 * Comparator class is used to sort the PersonelltypeBean objects.
 */
public class PersonelltypeComparator implements Comparator
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
     * Constructor class for PersonelltypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new PersonelltypeComparator(PersonelltypeManager.PERSONELLTYPEID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>PersonelltypeManager.ID_PERSONELLTYPEID
     *   <li>PersonelltypeManager.ID_NAME
     *   <li>PersonelltypeManager.ID_DESCRIPTION
     *   <li>PersonelltypeManager.ID_CODE
     *   <li>PersonelltypeManager.ID_COMPANYID
     * </ul>
     */
    public PersonelltypeComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for PersonelltypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new PersonelltypeComparator(PersonelltypeManager.PERSONELLTYPEID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>PersonelltypeManager.ID_PERSONELLTYPEID
     *   <li>PersonelltypeManager.ID_NAME
     *   <li>PersonelltypeManager.ID_DESCRIPTION
     *   <li>PersonelltypeManager.ID_CODE
     *   <li>PersonelltypeManager.ID_COMPANYID
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public PersonelltypeComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        PersonelltypeBean b1 = (PersonelltypeBean)pObj1;
        PersonelltypeBean b2 = (PersonelltypeBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case PersonelltypeManager.ID_PERSONELLTYPEID:
                if (b1.getPersonelltypeid() == null && b2.getPersonelltypeid() != null) {
                    iReturn = -1;
                } else if (b1.getPersonelltypeid() == null && b2.getPersonelltypeid() == null) {
                    iReturn = 0;
                } else if (b1.getPersonelltypeid() != null && b2.getPersonelltypeid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getPersonelltypeid().compareTo(b2.getPersonelltypeid());
                }
                break;
            case PersonelltypeManager.ID_NAME:
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
            case PersonelltypeManager.ID_DESCRIPTION:
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
            case PersonelltypeManager.ID_CODE:
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
            case PersonelltypeManager.ID_COMPANYID:
                if (b1.getCompanyid() == null && b2.getCompanyid() != null) {
                    iReturn = -1;
                } else if (b1.getCompanyid() == null && b2.getCompanyid() == null) {
                    iReturn = 0;
                } else if (b1.getCompanyid() != null && b2.getCompanyid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getCompanyid().compareTo(b2.getCompanyid());
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