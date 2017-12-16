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
 * Comparator class is used to sort the QualitycontrolBean objects.
 */
public class QualitycontrolComparator implements Comparator
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
     * Constructor class for QualitycontrolComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new QualitycontrolComparator(QualitycontrolManager.QUALITYCONTROLID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>QualitycontrolManager.ID_QUALITYCONTROLID
     *   <li>QualitycontrolManager.ID_CONTRACTSAMPLEITEMID
     *   <li>QualitycontrolManager.ID_QC_PERSON
     *   <li>QualitycontrolManager.ID_QC_DATETIME
     *   <li>QualitycontrolManager.ID_POSITIVE
     *   <li>QualitycontrolManager.ID_NEGATIVE
     *   <li>QualitycontrolManager.ID_INFO
     *   <li>QualitycontrolManager.ID_REGBYID
     *   <li>QualitycontrolManager.ID_REGDATE
     *   <li>QualitycontrolManager.ID_LOT
     *   <li>QualitycontrolManager.ID_DEVICEID
     * </ul>
     */
    public QualitycontrolComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for QualitycontrolComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new QualitycontrolComparator(QualitycontrolManager.QUALITYCONTROLID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>QualitycontrolManager.ID_QUALITYCONTROLID
     *   <li>QualitycontrolManager.ID_CONTRACTSAMPLEITEMID
     *   <li>QualitycontrolManager.ID_QC_PERSON
     *   <li>QualitycontrolManager.ID_QC_DATETIME
     *   <li>QualitycontrolManager.ID_POSITIVE
     *   <li>QualitycontrolManager.ID_NEGATIVE
     *   <li>QualitycontrolManager.ID_INFO
     *   <li>QualitycontrolManager.ID_DELETED
     *   <li>QualitycontrolManager.ID_REGBYID
     *   <li>QualitycontrolManager.ID_REGDATE
     *   <li>QualitycontrolManager.ID_LOT
     *   <li>QualitycontrolManager.ID_DEVICEID
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public QualitycontrolComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        QualitycontrolBean b1 = (QualitycontrolBean)pObj1;
        QualitycontrolBean b2 = (QualitycontrolBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case QualitycontrolManager.ID_QUALITYCONTROLID:
                if (b1.getQualitycontrolid() == null && b2.getQualitycontrolid() != null) {
                    iReturn = -1;
                } else if (b1.getQualitycontrolid() == null && b2.getQualitycontrolid() == null) {
                    iReturn = 0;
                } else if (b1.getQualitycontrolid() != null && b2.getQualitycontrolid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getQualitycontrolid().compareTo(b2.getQualitycontrolid());
                }
                break;
            case QualitycontrolManager.ID_CONTRACTSAMPLEITEMID:
                if (b1.getContractsampleitemid() == null && b2.getContractsampleitemid() != null) {
                    iReturn = -1;
                } else if (b1.getContractsampleitemid() == null && b2.getContractsampleitemid() == null) {
                    iReturn = 0;
                } else if (b1.getContractsampleitemid() != null && b2.getContractsampleitemid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getContractsampleitemid().compareTo(b2.getContractsampleitemid());
                }
                break;
            case QualitycontrolManager.ID_QC_PERSON:
                if (b1.getQcPerson() == null && b2.getQcPerson() != null) {
                    iReturn = -1;
                } else if (b1.getQcPerson() == null && b2.getQcPerson() == null) {
                    iReturn = 0;
                } else if (b1.getQcPerson() != null && b2.getQcPerson() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getQcPerson().compareTo(b2.getQcPerson());
                }
                break;
            case QualitycontrolManager.ID_QC_DATETIME:
                if (b1.getQcDatetime() == null && b2.getQcDatetime() != null) {
                    iReturn = -1;
                } else if (b1.getQcDatetime() == null && b2.getQcDatetime() == null) {
                    iReturn = 0;
                } else if (b1.getQcDatetime() != null && b2.getQcDatetime() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getQcDatetime().compareTo(b2.getQcDatetime());
                }
                break;
            case QualitycontrolManager.ID_POSITIVE:
                if (b1.getPositive() == null && b2.getPositive() != null) {
                    iReturn = -1;
                } else if (b1.getPositive() == null && b2.getPositive() == null) {
                    iReturn = 0;
                } else if (b1.getPositive() != null && b2.getPositive() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getPositive().compareTo(b2.getPositive());
                }
                break;
            case QualitycontrolManager.ID_NEGATIVE:
                if (b1.getNegative() == null && b2.getNegative() != null) {
                    iReturn = -1;
                } else if (b1.getNegative() == null && b2.getNegative() == null) {
                    iReturn = 0;
                } else if (b1.getNegative() != null && b2.getNegative() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getNegative().compareTo(b2.getNegative());
                }
                break;
            case QualitycontrolManager.ID_INFO:
                if (b1.getInfo() == null && b2.getInfo() != null) {
                    iReturn = -1;
                } else if (b1.getInfo() == null && b2.getInfo() == null) {
                    iReturn = 0;
                } else if (b1.getInfo() != null && b2.getInfo() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getInfo().compareTo(b2.getInfo());
                }
                break;
            case QualitycontrolManager.ID_REGBYID:
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
            case QualitycontrolManager.ID_REGDATE:
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
            case QualitycontrolManager.ID_LOT:
                if (b1.getLot() == null && b2.getLot() != null) {
                    iReturn = -1;
                } else if (b1.getLot() == null && b2.getLot() == null) {
                    iReturn = 0;
                } else if (b1.getLot() != null && b2.getLot() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getLot().compareTo(b2.getLot());
                }
                break;
            case QualitycontrolManager.ID_DEVICEID:
                if (b1.getDeviceid() == null && b2.getDeviceid() != null) {
                    iReturn = -1;
                } else if (b1.getDeviceid() == null && b2.getDeviceid() == null) {
                    iReturn = 0;
                } else if (b1.getDeviceid() != null && b2.getDeviceid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getDeviceid().compareTo(b2.getDeviceid());
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