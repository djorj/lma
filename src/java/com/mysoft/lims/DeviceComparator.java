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
 * Comparator class is used to sort the DeviceBean objects.
 */
public class DeviceComparator implements Comparator
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
     * Constructor class for DeviceComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new DeviceComparator(DeviceManager.DEVICEID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>DeviceManager.ID_DEVICEID
     *   <li>DeviceManager.ID_NAME
     *   <li>DeviceManager.ID_MODEL
     *   <li>DeviceManager.ID_SN
     *   <li>DeviceManager.ID_CREATEDATE
     *   <li>DeviceManager.ID_CONDITIOIN
     *   <li>DeviceManager.ID_INSTITUTIONID
     * </ul>
     */
    public DeviceComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for DeviceComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new DeviceComparator(DeviceManager.DEVICEID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>DeviceManager.ID_DEVICEID
     *   <li>DeviceManager.ID_NAME
     *   <li>DeviceManager.ID_MODEL
     *   <li>DeviceManager.ID_SN
     *   <li>DeviceManager.ID_CREATEDATE
     *   <li>DeviceManager.ID_CONDITIOIN
     *   <li>DeviceManager.ID_INSTITUTIONID
     *   <li>DeviceManager.ID_DELETED
     *   <li>DeviceManager.ID_HASPLATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public DeviceComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        DeviceBean b1 = (DeviceBean)pObj1;
        DeviceBean b2 = (DeviceBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case DeviceManager.ID_DEVICEID:
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
            case DeviceManager.ID_NAME:
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
            case DeviceManager.ID_MODEL:
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
            case DeviceManager.ID_SN:
                if (b1.getSn() == null && b2.getSn() != null) {
                    iReturn = -1;
                } else if (b1.getSn() == null && b2.getSn() == null) {
                    iReturn = 0;
                } else if (b1.getSn() != null && b2.getSn() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getSn().compareTo(b2.getSn());
                }
                break;
            case DeviceManager.ID_CREATEDATE:
                if (b1.getCreatedate() == null && b2.getCreatedate() != null) {
                    iReturn = -1;
                } else if (b1.getCreatedate() == null && b2.getCreatedate() == null) {
                    iReturn = 0;
                } else if (b1.getCreatedate() != null && b2.getCreatedate() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getCreatedate().compareTo(b2.getCreatedate());
                }
                break;
            case DeviceManager.ID_CONDITIOIN:
                if (b1.getConditioin() == null && b2.getConditioin() != null) {
                    iReturn = -1;
                } else if (b1.getConditioin() == null && b2.getConditioin() == null) {
                    iReturn = 0;
                } else if (b1.getConditioin() != null && b2.getConditioin() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getConditioin().compareTo(b2.getConditioin());
                }
                break;
            case DeviceManager.ID_INSTITUTIONID:
                if (b1.getInstitutionid() == null && b2.getInstitutionid() != null) {
                    iReturn = -1;
                } else if (b1.getInstitutionid() == null && b2.getInstitutionid() == null) {
                    iReturn = 0;
                } else if (b1.getInstitutionid() != null && b2.getInstitutionid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getInstitutionid().compareTo(b2.getInstitutionid());
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