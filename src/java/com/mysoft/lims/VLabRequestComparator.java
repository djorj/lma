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
 * Comparator class is used to sort the VLabRequestBean objects.
 */
public class VLabRequestComparator implements Comparator
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
     * Constructor class for VLabRequestComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new VLabRequestComparator(VLabRequestManager.LABTESTID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>VLabRequestManager.ID_LABTESTID
     *   <li>VLabRequestManager.ID_LABTESTNAME
     *   <li>VLabRequestManager.ID_SAMPLENAME
     *   <li>VLabRequestManager.ID_SAMPLEITEMRESEACHID
     *   <li>VLabRequestManager.ID_PARENTTEST
     *   <li>VLabRequestManager.ID_TOTALSUBTEST
     *   <li>VLabRequestManager.ID_CONTRACTSAMPLEITEMID
     *   <li>VLabRequestManager.ID_STATUS
     *   <li>VLabRequestManager.ID_REGDATE
     *   <li>VLabRequestManager.ID_ENDDATE
     *   <li>VLabRequestManager.ID_QUALITYCONTROL_PERSON
     *   <li>VLabRequestManager.ID_QUALITYCONTROL_DATETIME
     *   <li>VLabRequestManager.ID_QUALITYCONTROL_ANSWER
     *   <li>VLabRequestManager.ID_RESULT
     *   <li>VLabRequestManager.ID_RESULT_DATETIME
     *   <li>VLabRequestManager.ID_RESULT_NOTE
     *   <li>VLabRequestManager.ID_AUTHORNAME
     *   <li>VLabRequestManager.ID_AUTHORID
     *   <li>VLabRequestManager.ID_SAMPLETYPEID
     * </ul>
     */
    public VLabRequestComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for VLabRequestComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new VLabRequestComparator(VLabRequestManager.LABTESTID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>VLabRequestManager.ID_LABTESTID
     *   <li>VLabRequestManager.ID_LABTESTNAME
     *   <li>VLabRequestManager.ID_SAMPLENAME
     *   <li>VLabRequestManager.ID_SAMPLEITEMRESEACHID
     *   <li>VLabRequestManager.ID_PARENTTEST
     *   <li>VLabRequestManager.ID_TOTALSUBTEST
     *   <li>VLabRequestManager.ID_CONTRACTSAMPLEITEMID
     *   <li>VLabRequestManager.ID_STATUS
     *   <li>VLabRequestManager.ID_REGDATE
     *   <li>VLabRequestManager.ID_ENDDATE
     *   <li>VLabRequestManager.ID_QUALITYCONTROL_PERSON
     *   <li>VLabRequestManager.ID_QUALITYCONTROL_DATETIME
     *   <li>VLabRequestManager.ID_QUALITYCONTROL_ANSWER
     *   <li>VLabRequestManager.ID_RESULT
     *   <li>VLabRequestManager.ID_RESULT_DATETIME
     *   <li>VLabRequestManager.ID_RESULT_NOTE
     *   <li>VLabRequestManager.ID_AUTHORNAME
     *   <li>VLabRequestManager.ID_AUTHORID
     *   <li>VLabRequestManager.ID_SAMPLETYPEID
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public VLabRequestComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        VLabRequestBean b1 = (VLabRequestBean)pObj1;
        VLabRequestBean b2 = (VLabRequestBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case VLabRequestManager.ID_LABTESTID:
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
            case VLabRequestManager.ID_LABTESTNAME:
                if (b1.getLabtestname() == null && b2.getLabtestname() != null) {
                    iReturn = -1;
                } else if (b1.getLabtestname() == null && b2.getLabtestname() == null) {
                    iReturn = 0;
                } else if (b1.getLabtestname() != null && b2.getLabtestname() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getLabtestname().compareTo(b2.getLabtestname());
                }
                break;
            case VLabRequestManager.ID_SAMPLENAME:
                if (b1.getSamplename() == null && b2.getSamplename() != null) {
                    iReturn = -1;
                } else if (b1.getSamplename() == null && b2.getSamplename() == null) {
                    iReturn = 0;
                } else if (b1.getSamplename() != null && b2.getSamplename() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getSamplename().compareTo(b2.getSamplename());
                }
                break;
            case VLabRequestManager.ID_SAMPLEITEMRESEACHID:
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
            case VLabRequestManager.ID_PARENTTEST:
                if (b1.getParenttest() == null && b2.getParenttest() != null) {
                    iReturn = -1;
                } else if (b1.getParenttest() == null && b2.getParenttest() == null) {
                    iReturn = 0;
                } else if (b1.getParenttest() != null && b2.getParenttest() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getParenttest().compareTo(b2.getParenttest());
                }
                break;
            case VLabRequestManager.ID_TOTALSUBTEST:
                if (b1.getTotalsubtest() == null && b2.getTotalsubtest() != null) {
                    iReturn = -1;
                } else if (b1.getTotalsubtest() == null && b2.getTotalsubtest() == null) {
                    iReturn = 0;
                } else if (b1.getTotalsubtest() != null && b2.getTotalsubtest() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getTotalsubtest().compareTo(b2.getTotalsubtest());
                }
                break;
            case VLabRequestManager.ID_CONTRACTSAMPLEITEMID:
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
            case VLabRequestManager.ID_STATUS:
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
            case VLabRequestManager.ID_REGDATE:
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
            case VLabRequestManager.ID_ENDDATE:
                if (b1.getEnddate() == null && b2.getEnddate() != null) {
                    iReturn = -1;
                } else if (b1.getEnddate() == null && b2.getEnddate() == null) {
                    iReturn = 0;
                } else if (b1.getEnddate() != null && b2.getEnddate() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getEnddate().compareTo(b2.getEnddate());
                }
                break;
            case VLabRequestManager.ID_QUALITYCONTROL_PERSON:
                if (b1.getQualitycontrolPerson() == null && b2.getQualitycontrolPerson() != null) {
                    iReturn = -1;
                } else if (b1.getQualitycontrolPerson() == null && b2.getQualitycontrolPerson() == null) {
                    iReturn = 0;
                } else if (b1.getQualitycontrolPerson() != null && b2.getQualitycontrolPerson() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getQualitycontrolPerson().compareTo(b2.getQualitycontrolPerson());
                }
                break;
            case VLabRequestManager.ID_QUALITYCONTROL_DATETIME:
                if (b1.getQualitycontrolDatetime() == null && b2.getQualitycontrolDatetime() != null) {
                    iReturn = -1;
                } else if (b1.getQualitycontrolDatetime() == null && b2.getQualitycontrolDatetime() == null) {
                    iReturn = 0;
                } else if (b1.getQualitycontrolDatetime() != null && b2.getQualitycontrolDatetime() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getQualitycontrolDatetime().compareTo(b2.getQualitycontrolDatetime());
                }
                break;
            case VLabRequestManager.ID_QUALITYCONTROL_ANSWER:
                if (b1.getQualitycontrolAnswer() == null && b2.getQualitycontrolAnswer() != null) {
                    iReturn = -1;
                } else if (b1.getQualitycontrolAnswer() == null && b2.getQualitycontrolAnswer() == null) {
                    iReturn = 0;
                } else if (b1.getQualitycontrolAnswer() != null && b2.getQualitycontrolAnswer() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getQualitycontrolAnswer().compareTo(b2.getQualitycontrolAnswer());
                }
                break;
            case VLabRequestManager.ID_RESULT:
                if (b1.getResult() == null && b2.getResult() != null) {
                    iReturn = -1;
                } else if (b1.getResult() == null && b2.getResult() == null) {
                    iReturn = 0;
                } else if (b1.getResult() != null && b2.getResult() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getResult().compareTo(b2.getResult());
                }
                break;
            case VLabRequestManager.ID_RESULT_DATETIME:
                if (b1.getResultDatetime() == null && b2.getResultDatetime() != null) {
                    iReturn = -1;
                } else if (b1.getResultDatetime() == null && b2.getResultDatetime() == null) {
                    iReturn = 0;
                } else if (b1.getResultDatetime() != null && b2.getResultDatetime() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getResultDatetime().compareTo(b2.getResultDatetime());
                }
                break;
            case VLabRequestManager.ID_RESULT_NOTE:
                if (b1.getResultNote() == null && b2.getResultNote() != null) {
                    iReturn = -1;
                } else if (b1.getResultNote() == null && b2.getResultNote() == null) {
                    iReturn = 0;
                } else if (b1.getResultNote() != null && b2.getResultNote() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getResultNote().compareTo(b2.getResultNote());
                }
                break;
            case VLabRequestManager.ID_AUTHORNAME:
                if (b1.getAuthorname() == null && b2.getAuthorname() != null) {
                    iReturn = -1;
                } else if (b1.getAuthorname() == null && b2.getAuthorname() == null) {
                    iReturn = 0;
                } else if (b1.getAuthorname() != null && b2.getAuthorname() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getAuthorname().compareTo(b2.getAuthorname());
                }
                break;
            case VLabRequestManager.ID_AUTHORID:
                if (b1.getAuthorid() == null && b2.getAuthorid() != null) {
                    iReturn = -1;
                } else if (b1.getAuthorid() == null && b2.getAuthorid() == null) {
                    iReturn = 0;
                } else if (b1.getAuthorid() != null && b2.getAuthorid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getAuthorid().compareTo(b2.getAuthorid());
                }
                break;
            case VLabRequestManager.ID_SAMPLETYPEID:
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
            default: 
                throw new IllegalArgumentException("Type passed for the field is not supported");
        }

        return bReverse ? (-1 * iReturn) : iReturn;
    }
// class+ 

// class- 
}