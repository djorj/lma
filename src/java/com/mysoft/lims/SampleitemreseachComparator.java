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
 * Comparator class is used to sort the SampleitemreseachBean objects.
 */
public class SampleitemreseachComparator implements Comparator
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
     * Constructor class for SampleitemreseachComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SampleitemreseachComparator(SampleitemreseachManager.SAMPLEITEMRESEACHID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SampleitemreseachManager.ID_SAMPLEITEMRESEACHID
     *   <li>SampleitemreseachManager.ID_CONTRACTSAMPLEITEMID
     *   <li>SampleitemreseachManager.ID_CONTRACTID
     *   <li>SampleitemreseachManager.ID_LABTESTID
     *   <li>SampleitemreseachManager.ID_PRICE
     *   <li>SampleitemreseachManager.ID_REGBYID
     *   <li>SampleitemreseachManager.ID_REGDATE
     *   <li>SampleitemreseachManager.ID_STATUS
     *   <li>SampleitemreseachManager.ID_TOTALSUBTEST
     *   <li>SampleitemreseachManager.ID_PARENTTEST
     *   <li>SampleitemreseachManager.ID_CONFIRMATION1ID
     *   <li>SampleitemreseachManager.ID_CONFIRMATION2ID
     *   <li>SampleitemreseachManager.ID_CONFIRMATION3ID
     *   <li>SampleitemreseachManager.ID_DAYNUM
     *   <li>SampleitemreseachManager.ID_INSTITUTIONID
     *   <li>SampleitemreseachManager.ID_QUALITYCONTROL_PERSON
     *   <li>SampleitemreseachManager.ID_QUALITYCONTROL_DATETIME
     *   <li>SampleitemreseachManager.ID_QUALITYCONTROL_ANSWER
     *   <li>SampleitemreseachManager.ID_RESULT
     *   <li>SampleitemreseachManager.ID_RESULT_DATETIME
     *   <li>SampleitemreseachManager.ID_RESULT_NOTE
     *   <li>SampleitemreseachManager.ID_RESULT_INFO
     *   <li>SampleitemreseachManager.ID_CONFIRAMTION1DATE
     *   <li>SampleitemreseachManager.ID_CONFIRAMTION2DATE
     *   <li>SampleitemreseachManager.ID_CONFIRAMTION3DATE
     *   <li>SampleitemreseachManager.ID_DEVICEID
     *   <li>SampleitemreseachManager.ID_RESULTDESCR
     *   <li>SampleitemreseachManager.ID_SPECIESID
     *   <li>SampleitemreseachManager.ID_STANDARDID
     *   <li>SampleitemreseachManager.ID_NORM
     *   <li>SampleitemreseachManager.ID_NRESULT
     *   <li>SampleitemreseachManager.ID_TRESULT
     * </ul>
     */
    public SampleitemreseachComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for SampleitemreseachComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SampleitemreseachComparator(SampleitemreseachManager.SAMPLEITEMRESEACHID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SampleitemreseachManager.ID_SAMPLEITEMRESEACHID
     *   <li>SampleitemreseachManager.ID_CONTRACTSAMPLEITEMID
     *   <li>SampleitemreseachManager.ID_CONTRACTID
     *   <li>SampleitemreseachManager.ID_LABTESTID
     *   <li>SampleitemreseachManager.ID_PRICE
     *   <li>SampleitemreseachManager.ID_REGBYID
     *   <li>SampleitemreseachManager.ID_REGDATE
     *   <li>SampleitemreseachManager.ID_DELETED
     *   <li>SampleitemreseachManager.ID_STATUS
     *   <li>SampleitemreseachManager.ID_TOTALSUBTEST
     *   <li>SampleitemreseachManager.ID_PARENTTEST
     *   <li>SampleitemreseachManager.ID_CONFIRMATION1ID
     *   <li>SampleitemreseachManager.ID_CONFIRMATION2ID
     *   <li>SampleitemreseachManager.ID_CONFIRMATION3ID
     *   <li>SampleitemreseachManager.ID_DAYNUM
     *   <li>SampleitemreseachManager.ID_INSTITUTIONID
     *   <li>SampleitemreseachManager.ID_QUALITYCONTROL_PERSON
     *   <li>SampleitemreseachManager.ID_QUALITYCONTROL_DATETIME
     *   <li>SampleitemreseachManager.ID_QUALITYCONTROL_ANSWER
     *   <li>SampleitemreseachManager.ID_RESULT
     *   <li>SampleitemreseachManager.ID_RESULT_DATETIME
     *   <li>SampleitemreseachManager.ID_RESULT_NOTE
     *   <li>SampleitemreseachManager.ID_RESULT_INFO
     *   <li>SampleitemreseachManager.ID_RESULT_NORM
     *   <li>SampleitemreseachManager.ID_CONFIRAMTION1DATE
     *   <li>SampleitemreseachManager.ID_CONFIRAMTION2DATE
     *   <li>SampleitemreseachManager.ID_CONFIRAMTION3DATE
     *   <li>SampleitemreseachManager.ID_DEVICEID
     *   <li>SampleitemreseachManager.ID_RESULTDESCR
     *   <li>SampleitemreseachManager.ID_SPECIESID
     *   <li>SampleitemreseachManager.ID_STANDARDID
     *   <li>SampleitemreseachManager.ID_NORM
     *   <li>SampleitemreseachManager.ID_BRESULT
     *   <li>SampleitemreseachManager.ID_NRESULT
     *   <li>SampleitemreseachManager.ID_TRESULT
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public SampleitemreseachComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        SampleitemreseachBean b1 = (SampleitemreseachBean)pObj1;
        SampleitemreseachBean b2 = (SampleitemreseachBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case SampleitemreseachManager.ID_SAMPLEITEMRESEACHID:
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
            case SampleitemreseachManager.ID_CONTRACTSAMPLEITEMID:
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
            case SampleitemreseachManager.ID_CONTRACTID:
                if (b1.getContractid() == null && b2.getContractid() != null) {
                    iReturn = -1;
                } else if (b1.getContractid() == null && b2.getContractid() == null) {
                    iReturn = 0;
                } else if (b1.getContractid() != null && b2.getContractid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getContractid().compareTo(b2.getContractid());
                }
                break;
            case SampleitemreseachManager.ID_LABTESTID:
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
            case SampleitemreseachManager.ID_PRICE:
                if (b1.getPrice() == null && b2.getPrice() != null) {
                    iReturn = -1;
                } else if (b1.getPrice() == null && b2.getPrice() == null) {
                    iReturn = 0;
                } else if (b1.getPrice() != null && b2.getPrice() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getPrice().compareTo(b2.getPrice());
                }
                break;
            case SampleitemreseachManager.ID_REGBYID:
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
            case SampleitemreseachManager.ID_REGDATE:
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
            case SampleitemreseachManager.ID_STATUS:
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
            case SampleitemreseachManager.ID_TOTALSUBTEST:
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
            case SampleitemreseachManager.ID_PARENTTEST:
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
            case SampleitemreseachManager.ID_CONFIRMATION1ID:
                if (b1.getConfirmation1id() == null && b2.getConfirmation1id() != null) {
                    iReturn = -1;
                } else if (b1.getConfirmation1id() == null && b2.getConfirmation1id() == null) {
                    iReturn = 0;
                } else if (b1.getConfirmation1id() != null && b2.getConfirmation1id() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getConfirmation1id().compareTo(b2.getConfirmation1id());
                }
                break;
            case SampleitemreseachManager.ID_CONFIRMATION2ID:
                if (b1.getConfirmation2id() == null && b2.getConfirmation2id() != null) {
                    iReturn = -1;
                } else if (b1.getConfirmation2id() == null && b2.getConfirmation2id() == null) {
                    iReturn = 0;
                } else if (b1.getConfirmation2id() != null && b2.getConfirmation2id() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getConfirmation2id().compareTo(b2.getConfirmation2id());
                }
                break;
            case SampleitemreseachManager.ID_CONFIRMATION3ID:
                if (b1.getConfirmation3id() == null && b2.getConfirmation3id() != null) {
                    iReturn = -1;
                } else if (b1.getConfirmation3id() == null && b2.getConfirmation3id() == null) {
                    iReturn = 0;
                } else if (b1.getConfirmation3id() != null && b2.getConfirmation3id() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getConfirmation3id().compareTo(b2.getConfirmation3id());
                }
                break;
            case SampleitemreseachManager.ID_DAYNUM:
                if (b1.getDaynum() == null && b2.getDaynum() != null) {
                    iReturn = -1;
                } else if (b1.getDaynum() == null && b2.getDaynum() == null) {
                    iReturn = 0;
                } else if (b1.getDaynum() != null && b2.getDaynum() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getDaynum().compareTo(b2.getDaynum());
                }
                break;
            case SampleitemreseachManager.ID_INSTITUTIONID:
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
            case SampleitemreseachManager.ID_QUALITYCONTROL_PERSON:
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
            case SampleitemreseachManager.ID_QUALITYCONTROL_DATETIME:
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
            case SampleitemreseachManager.ID_QUALITYCONTROL_ANSWER:
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
            case SampleitemreseachManager.ID_RESULT:
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
            case SampleitemreseachManager.ID_RESULT_DATETIME:
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
            case SampleitemreseachManager.ID_RESULT_NOTE:
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
            case SampleitemreseachManager.ID_RESULT_INFO:
                if (b1.getResultInfo() == null && b2.getResultInfo() != null) {
                    iReturn = -1;
                } else if (b1.getResultInfo() == null && b2.getResultInfo() == null) {
                    iReturn = 0;
                } else if (b1.getResultInfo() != null && b2.getResultInfo() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getResultInfo().compareTo(b2.getResultInfo());
                }
                break;
            case SampleitemreseachManager.ID_CONFIRAMTION1DATE:
                if (b1.getConfiramtion1date() == null && b2.getConfiramtion1date() != null) {
                    iReturn = -1;
                } else if (b1.getConfiramtion1date() == null && b2.getConfiramtion1date() == null) {
                    iReturn = 0;
                } else if (b1.getConfiramtion1date() != null && b2.getConfiramtion1date() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getConfiramtion1date().compareTo(b2.getConfiramtion1date());
                }
                break;
            case SampleitemreseachManager.ID_CONFIRAMTION2DATE:
                if (b1.getConfiramtion2date() == null && b2.getConfiramtion2date() != null) {
                    iReturn = -1;
                } else if (b1.getConfiramtion2date() == null && b2.getConfiramtion2date() == null) {
                    iReturn = 0;
                } else if (b1.getConfiramtion2date() != null && b2.getConfiramtion2date() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getConfiramtion2date().compareTo(b2.getConfiramtion2date());
                }
                break;
            case SampleitemreseachManager.ID_CONFIRAMTION3DATE:
                if (b1.getConfiramtion3date() == null && b2.getConfiramtion3date() != null) {
                    iReturn = -1;
                } else if (b1.getConfiramtion3date() == null && b2.getConfiramtion3date() == null) {
                    iReturn = 0;
                } else if (b1.getConfiramtion3date() != null && b2.getConfiramtion3date() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getConfiramtion3date().compareTo(b2.getConfiramtion3date());
                }
                break;
            case SampleitemreseachManager.ID_DEVICEID:
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
            case SampleitemreseachManager.ID_RESULTDESCR:
                if (b1.getResultdescr() == null && b2.getResultdescr() != null) {
                    iReturn = -1;
                } else if (b1.getResultdescr() == null && b2.getResultdescr() == null) {
                    iReturn = 0;
                } else if (b1.getResultdescr() != null && b2.getResultdescr() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getResultdescr().compareTo(b2.getResultdescr());
                }
                break;
            case SampleitemreseachManager.ID_SPECIESID:
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
            case SampleitemreseachManager.ID_STANDARDID:
                if (b1.getStandardid() == null && b2.getStandardid() != null) {
                    iReturn = -1;
                } else if (b1.getStandardid() == null && b2.getStandardid() == null) {
                    iReturn = 0;
                } else if (b1.getStandardid() != null && b2.getStandardid() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getStandardid().compareTo(b2.getStandardid());
                }
                break;
            case SampleitemreseachManager.ID_NORM:
                if (b1.getNorm() == null && b2.getNorm() != null) {
                    iReturn = -1;
                } else if (b1.getNorm() == null && b2.getNorm() == null) {
                    iReturn = 0;
                } else if (b1.getNorm() != null && b2.getNorm() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getNorm().compareTo(b2.getNorm());
                }
                break;
            case SampleitemreseachManager.ID_NRESULT:
                if (b1.getNresult() == null && b2.getNresult() != null) {
                    iReturn = -1;
                } else if (b1.getNresult() == null && b2.getNresult() == null) {
                    iReturn = 0;
                } else if (b1.getNresult() != null && b2.getNresult() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getNresult().compareTo(b2.getNresult());
                }
                break;
            case SampleitemreseachManager.ID_TRESULT:
                if (b1.getTresult() == null && b2.getTresult() != null) {
                    iReturn = -1;
                } else if (b1.getTresult() == null && b2.getTresult() == null) {
                    iReturn = 0;
                } else if (b1.getTresult() != null && b2.getTresult() == null) {
                    iReturn = 1;
                } else { 
                    iReturn = b1.getTresult().compareTo(b2.getTresult());
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
