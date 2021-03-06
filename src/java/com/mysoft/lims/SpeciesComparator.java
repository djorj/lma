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
 * Comparator class is used to sort the SpeciesBean objects.
 */
public class SpeciesComparator implements Comparator
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
     * Constructor class for SpeciesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SpeciesComparator(SpeciesManager.SPECIESID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SpeciesManager.ID_SPECIESID
     *   <li>SpeciesManager.ID_NAME
     * </ul>
     */
    public SpeciesComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for SpeciesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SpeciesComparator(SpeciesManager.SPECIESID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SpeciesManager.ID_SPECIESID
     *   <li>SpeciesManager.ID_NAME
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public SpeciesComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        SpeciesBean b1 = (SpeciesBean)pObj1;
        SpeciesBean b2 = (SpeciesBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case SpeciesManager.ID_SPECIESID:
                if (b1.getSpeciesid() == null && b2.getSpeciesid() != null) {
                    iReturn = -1;
                } else if (b1.getSpeciesid() == null && b2.getSpeciesid() == null) {
                    iReturn = 0;
                } else if (b1.getSpeciesid() != null && b2.getSpeciesid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getSpeciesid().compareTo(b2.getSpeciesid());
                }
                break;
            case SpeciesManager.ID_NAME:
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
            default: 
                throw new IllegalArgumentException("Type passed for the field is not supported");
        }

        return bReverse ? (-1 * iReturn) : iReturn;
    }
// class+ 

// class- 
}
