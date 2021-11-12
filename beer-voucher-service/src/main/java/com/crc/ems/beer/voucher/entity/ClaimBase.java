package com.crc.ems.beer.voucher.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CLAIM_BASE")
public class ClaimBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "select SEQ_T_CLAIM_BASE.nextval from dual")
    @Column(name = "CLAIM_ID")
    private Short claimId;

    @Column(name = "CLAIM_NO")
    private String claimNo;

    @Column(name = "TP_CODE")
    private String tpCode;

    @Column(name = "TP_NAME")
    private String tpName;

    @Column(name = "APPLY_EMP_ID")
    private String applyEmpId;

    @Column(name = "APPLY_EMP_NAME")
    private String applyEmpName;

    @Column(name = "APPLY_DEPT_CODE")
    private String applyDeptCode;

    @Column(name = "APPLY_DEPT_NAME")
    private String applyDeptName;

    @Column(name = "APPLY_COMP_CODE")
    private String applyCompCode;

    @Column(name = "APPLY_COMP_NAME")
    private String applyCompName;

    @Column(name = "APPLY_JOB_ID")
    private String applyJobId;

    @Column(name = "APPLY_JOB_NAME")
    private String applyJobName;

    @Column(name = "APPLY_EMAIL")
    private String applyEmail;

    @Column(name = "APPLY_PHONE")
    private String applyPhone;

    @Column(name = "APPLY_DATE")
    private Date applyDate;

    @Column(name = "GL_DATE")
    private Date glDate;

    @Column(name = "ITEM2_CODE")
    private String item2Code;

    @Column(name = "ITEM2_NAME")
    private String item2Name;

    @Column(name = "ITEM3_CODE")
    private String item3Code;

    @Column(name = "ITEM3_NAME")
    private String item3Name;

    @Column(name = "OU_CODE")
    private String ouCode;

    @Column(name = "OU_NAME")
    private String ouName;

    @Column(name = "ORG_CODE")
    private String orgCode;

    @Column(name = "ORG_NAME")
    private String orgName;

    @Column(name = "BEFOREHAND_APPLICATION")
    private String beforehandApplication;

    @Column(name = "HAS_VAT")
    private String hasVat;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "INVOICE_NO")
    private String invoiceNo;

    @Column(name = "INVOICE_BATCH_NO")
    private String invoiceBatchNo;

    @Column(name = "INVOICE_DATE")
    private Date invoiceDate;

    @Column(name = "PAYMENT_MODE")
    private String paymentMode;

    @Column(name = "PRICE_AMOUNT")
    private BigDecimal priceAmount;

    @Column(name = "TAX_AMOUNT")
    private BigDecimal taxAmount;

    @Column(name = "APPLY_AMOUNT")
    private BigDecimal applyAmount;

    @Column(name = "PAY_AMOUNT")
    private BigDecimal payAmount;

    @Column(name = "CONTRACT_NO")
    private String contractNo;

    @Column(name = "CONTRACT_NAME")
    private String contractName;

    @Column(name = "CONTRACT_TYPE")
    private String contractType;

    @Column(name = "CONTRACT_AMOUNT")
    private BigDecimal contractAmount;

    @Column(name = "VENDOR_CODE")
    private String vendorCode;

    @Column(name = "VENDOR_NAME")
    private String vendorName;

    @Column(name = "VENDOR_SITE_CODE")
    private String vendorSiteCode;

    @Column(name = "VENDOR_SITE_NAME")
    private String vendorSiteName;

    @Column(name = "VENDOR_ACCOUNT_NAME")
    private String vendorAccountName;

    @Column(name = "VENDOR_ACCOUNT_NO")
    private String vendorAccountNo;

    @Column(name = "VENDOR_BANK_NAME")
    private String vendorBankName;

    @Column(name = "CHARGE_SETTLEMENT")
    private String chargeSettlement;

    @Column(name = "ATTACH_NUM")
    private Short attachNum;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "CR_ACCOUNT_ITEM_CODE")
    private String crAccountItemCode;

    @Column(name = "CR_ACCOUNT_ITEM_NAME")
    private String crAccountItemName;

    @Column(name = "SUMMARY")
    private String summary;

    @Column(name = "INVOICE_STATE")
    private String invoiceState;

    @Column(name = "IMG_STATE")
    private String imgState;

    @Column(name = "PAY_STATE")
    private String payState;

    @Column(name = "PROCESS_INSTANCE_ID")
    private String processInstanceId;

    @Column(name = "PROCESS_STATE")
    private String processState;

    @Column(name = "CREATE_USER")
    private String createUser;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "EXTEND1")
    private Short extend1;

    @Column(name = "EXTEND2")
    private Short extend2;

    @Column(name = "EXTEND3")
    private Short extend3;

    @Column(name = "EXTEND4")
    private Short extend4;

    @Column(name = "EXTEND5")
    private Short extend5;

    @Column(name = "EXTEND6")
    private String extend6;

    @Column(name = "EXTEND7")
    private String extend7;

    @Column(name = "EXTEND8")
    private String extend8;

    @Column(name = "EXTEND9")
    private String extend9;

    @Column(name = "EXTEND10")
    private String extend10;

    @Column(name = "REL_STATE")
    private String relState;

    @Column(name = "WHOLE_ORG_ID")
    private String wholeOrgId;

    @Column(name = "BACK_STATE")
    private String backState;

    @Column(name = "REWARD_AMOUNT")
    private BigDecimal rewardAmount;

    @Column(name = "QUALITY_DEDUCTION_AMOUNT")
    private BigDecimal qualityDeductionAmount;

    @Column(name = "SETTLEMENT_AMOUNT")
    private BigDecimal settlementAmount;

    @Column(name = "LOAD_TYPE")
    private String loadType;

    @Column(name = "REPAYMENT_DATE")
    private Date repaymentDate;

    @Column(name = "BORROWING_AMOUNT")
    private BigDecimal borrowingAmount;

    @Column(name = "ABR_PAY")
    private String abrPay;

    @Column(name = "LABOR_CHARGE_AMOUNT")
    private BigDecimal laborChargeAmount;

    @Column(name = "DEDUCTION_PROJECT_NAME")
    private String deductionProjectName;

    @Column(name = "ADVANCE_PAY")
    private BigDecimal advancePay;

    @Column(name = "PAYMENT_AMOUNT")
    private BigDecimal paymentAmount;

    @Column(name = "PROCESS_TEMPLATE_CODE")
    private String processTemplateCode;

    @Column(name = "PROCESS_TEMPLATE_VERSION")
    private String processTemplateVersion;

    @Column(name = "RECEIVE_AMOUNT")
    private BigDecimal receiveAmount;

    @Column(name = "INVOICE_AMOUNT")
    private BigDecimal invoiceAmount;

    @Column(name = "SRM_DES")
    private String srmDes;

    @Column(name = "ERP_SETTLEMENT_NO")
    private String erpSettlementNo;

    @Column(name = "CONTRACT_UNIT_PRICE")
    private String contractUnitPrice;

    @Column(name = "SETTLEMENT_UNIT_PRICE")
    private String settlementUnitPrice;

    @Column(name = "SETTLEMENT_QUANTITY")
    private String settlementQuantity;

    @Column(name = "ERP_CODE")
    private String erpCode;

    @Column(name = "IMMEDIATE_PAY_AMOUNT")
    private BigDecimal immediatePayAmount;

    @Column(name = "REL_CLAIM_ID")
    private Short relClaimId;

    @Column(name = "SETTLEMENT_DATE_FROM")
    private Date settlementDateFrom;

    @Column(name = "SETTLEMENT_DATE_TO")
    private Date settlementDateTo;

    @Column(name = "CONTRACT_URL")
    private String contractUrl;

    @Column(name = "USER_NAMES")
    private String userNames;

    @Column(name = "USER_IDS")
    private String userIds;

    @Column(name = "UPDATE_EMP_NAME")
    private String updateEmpName;

    @Column(name = "UPDATE_JOB_NAME")
    private String updateJobName;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "PAYMENT_DATE")
    private Date paymentDate;

    @Column(name = "EMERGENCY_LEVEL")
    private String emergencyLevel;

    @Column(name = "VENDOR_BANK_DES")
    private String vendorBankDes;

    @Column(name = "TRAVEL_START_TIME")
    private Date travelStartTime;

    @Column(name = "TRAVEL_END_TIME")
    private Date travelEndTime;

    @Column(name = "TRAVEL_START_CITY")
    private String travelStartCity;

    @Column(name = "TRAVEL_END_CITY")
    private String travelEndCity;

    @Column(name = "ORD_TYPE")
    private String ordType;

    @Column(name = "SJAPPLY_EMP_ID")
    private String sjapplyEmpId;

    @Column(name = "SJAPPLY_DEPT_CODE")
    private String sjapplyDeptCode;

    @Column(name = "SJAPPLY_JOB_ID")
    private String sjapplyJobId;

    @Column(name = "IS_DAIBAO")
    private String isDaibao;

    @Column(name = "IS_CHANGEED_ACCEPT_REIM")
    private String isChangeedAcceptReim;

    @Column(name = "APPLY_ORG_ID")
    private Short applyOrgId;

    @Column(name = "ABNORMAL_PAYMENT")
    private String abnormalPayment;

    @Column(name = "SPECIAL_PAYMENT")
    private String specialPayment;

    @Column(name = "PAY_TYPE")
    private String payType;

    @Column(name = "GENERAL_PAYMENT")
    private String generalPayment;

    @Column(name = "ISLARGEECAPITAL")
    private String islargeecapital;

    @Column(name = "IS_EXCEL_IMP")
    private String isExcelImp;

    @Column(name = "DOC_ID")
    private String docId;

    @Column(name = "DOC_TITLE")
    private String docTitle;

    @Column(name = "LINK")
    private String link;

    @Column(name = "RELATION_CLAIM")
    private String relationClaim;

    @Column(name = "APPLY_DEPT_ID")
    private Short applyDeptId;

    @Column(name = "PROCESS_WORKITEM_ID")
    private BigDecimal processWorkitemId;

    @Column(name = "PROCESS_STATE_NAME")
    private String processStateName;

    @Column(name = "PROCESS_STATE_ID")
    private String processStateId;

    @Column(name = "PROCESS_HANDLER_NAME")
    private String processHandlerName;

    @Column(name = "VENDOR_ID")
    private BigDecimal vendorId;

    @Column(name = "VENDOR_SITE_ID")
    private BigDecimal vendorSiteId;

    @Column(name = "VENDOR_ACCOUNT_ID")
    private BigDecimal vendorAccountId;

    @Column(name = "EXP_CATEGORY_ID")
    private BigDecimal expCategoryId;

    @Column(name = "EXP_CATEGORY_FULL_PATH")
    private String expCategoryFullPath;

    @Column(name = "APPLY_DEPT_FULL_PATH")
    private String applyDeptFullPath;

    @Column(name = "REF_HEAD_ID")
    private BigDecimal refHeadId;

    @Column(name = "REF_HEAD_CODE")
    private String refHeadCode;

    @Column(name = "REF_ORDER_TYPE_CODE")
    private String refOrderTypeCode;

    @Column(name = "REF_ORDER_TYPE_NAME")
    private String refOrderTypeName;

    @Column(name = "CONVERSION_RATE")
    private BigDecimal conversionRate;

    @Column(name = "REDUCED_AMOUNT")
    private BigDecimal reducedAmount;

    @Column(name = "DEDUCT_AMOUNT")
    private BigDecimal deductAmount;

    @Column(name = "EXP_CATEGORY_CODE")
    private String expCategoryCode;

    @Column(name = "PROCESS_STATE_START_TIME")
    private Date processStateStartTime;

    @Column(name = "THIS_TIME_PAY_AMOUNT")
    private BigDecimal thisTimePayAmount;

    @Column(name = "CON_THIS_TIME_PAY_AMOUNT")
    private BigDecimal conThisTimePayAmount;

    @Column(name = "EXP_CATEGORY_NAME")
    private String expCategoryName;

    @Column(name = "EXP_SUB_CATEGORY_NAME")
    private String expSubCategoryName;

    @Column(name = "EXP_SUB_CATEGORY_CODE")
    private String expSubCategoryCode;

    @Column(name = "CURRENT_WRITE_OFF_AMOUNT")
    private BigDecimal currentWriteOffAmount;

    @Column(name = "EXTEND11")
    private Short extend11;

    @Column(name = "EXTEND12")
    private Short extend12;

    @Column(name = "EXTEND13")
    private Short extend13;

    @Column(name = "EXTEND14")
    private Short extend14;

    @Column(name = "EXTEND15")
    private Short extend15;

    @Column(name = "VENDOR_DESC")
    private String vendorDesc;

    @Column(name = "REF_HEAD_AMOUNT")
    private BigDecimal refHeadAmount;

    @Column(name = "DELETE_FLAG")
    private String deleteFlag;

    @Column(name = "BORROWING_BALANCE")
    private BigDecimal borrowingBalance;

    @Column(name = "EXTEND21")
    private String extend21;

    @Column(name = "EXTEND22")
    private String extend22;

    @Column(name = "EXTEND23")
    private String extend23;

    @Column(name = "EXTEND24")
    private String extend24;

    @Column(name = "EXTEND25")
    private String extend25;

    @Column(name = "EXTEND26")
    private String extend26;

    @Column(name = "EXTEND27")
    private String extend27;

    @Column(name = "EXTEND28")
    private String extend28;

    @Column(name = "EXTEND29")
    private String extend29;

    @Column(name = "EXTEND30")
    private String extend30;

    @Column(name = "EXTEND41")
    private Short extend41;

    @Column(name = "EXTEND42")
    private Short extend42;

    @Column(name = "EXTEND43")
    private Short extend43;

    @Column(name = "EXTEND44")
    private Short extend44;

    @Column(name = "EXTEND45")
    private Short extend45;

    @Column(name = "EXTEND61")
    private Date extend61;

    @Column(name = "EXTEND62")
    private Date extend62;

    @Column(name = "EXTEND63")
    private Date extend63;

    @Column(name = "EXTEND64")
    private Date extend64;

    @Column(name = "EXTEND65")
    private Date extend65;

    @Column(name = "IMPORT_INTERFACE")
    private String importInterface;

    @Column(name = "EXCHANGE_RATE_TYPE")
    private String exchangeRateType;

    @Column(name = "IS_COPY")
    private String isCopy;

    @Column(name = "EXTEND66")
    private String extend66;

    @Column(name = "EXTEND67")
    private String extend67;

    @Column(name = "COPY_BATCH_NO")
    private String copyBatchNo;

    @Column(name = "MCC_AVAIL")
    private Short mccAvail;

    @Column(name = "EXTEND34")
    private String extend34;

    @Column(name = "EXTEND35")
    private String extend35;

    @Column(name = "EXTEND36")
    private String extend36;

    @Column(name = "EXTEND37")
    private String extend37;

    @Column(name = "EXTEND38")
    private String extend38;

    @Column(name = "EXTEND39")
    private String extend39;

    @Column(name = "EXTEND40")
    private String extend40;

    @Column(name = "EXTEND46")
    private BigDecimal extend46;

    @Column(name = "EXTEND47")
    private BigDecimal extend47;

    @Column(name = "EXTEND48")
    private BigDecimal extend48;

    @Column(name = "EXTEND49")
    private BigDecimal extend49;

    @Column(name = "EXTEND50")
    private BigDecimal extend50;

    @Column(name = "EXTEND71")
    private String extend71;

    @Column(name = "EXTEND72")
    private String extend72;

    @Column(name = "EXTEND73")
    private String extend73;

    @Column(name = "EXTEND74")
    private String extend74;

    @Column(name = "EXTEND75")
    private String extend75;

    @Column(name = "EXTEND76")
    private String extend76;

    @Column(name = "EXTEND77")
    private String extend77;

    @Column(name = "EXTEND78")
    private String extend78;

    @Column(name = "EXTEND79")
    private String extend79;

    @Column(name = "EXTEND80")
    private String extend80;

    @Column(name = "EXTEND81")
    private String extend81;

    @Column(name = "EXTEND82")
    private String extend82;

    @Column(name = "EXTEND83")
    private String extend83;

    @Column(name = "EXTEND84")
    private String extend84;

    @Column(name = "EXTEND85")
    private String extend85;

    @Column(name = "EXTEND86")
    private String extend86;

    @Column(name = "EXTEND87")
    private String extend87;

    @Column(name = "EXTEND88")
    private String extend88;

    @Column(name = "EXTEND89")
    private String extend89;

    @Column(name = "EXTEND90")
    private String extend90;

    @Column(name = "EXTEND91")
    private String extend91;

    @Column(name = "BU_CODE")
    private String buCode;

    @Column(name = "BU_NAME")
    private String buName;

    @Column(name = "PARENT_CLAIM_BASE_ID")
    private BigDecimal parentClaimBaseId;

    @Column(name = "PARENT_INSTANCE_ID")
    private BigDecimal parentInstanceId;

    @Column(name = "PARENT_ACTIVITY_INSTANCE_ID")
    private BigDecimal parentActivityInstanceId;

    @Column(name = "PARENT_WORKITEM_ID")
    private BigDecimal parentWorkitemId;

    @Column(name = "APPLY_EMP_ROLE")
    private String applyEmpRole;

    @Column(name = "APPLY_EMP_POSITION_TYPE")
    private String applyEmpPositionType;

    @Column(name = "EXTEND33")
    private String extend33;

    @Column(name = "EXTEND32")
    private String extend32;

    @Column(name = "EXTEND31")
    private String extend31;

    @Column(name = "ACTIVITY_NAME")
    private String activityName;

    @Column(name = "MONTH_STATEMENT_NO")
    private String monthStatementNo;

    @Column(name = "APPLY_NO")
    private String applyNo;

    @Column(name = "OLD_THEIR_VENDOR_CODE")
    private String oldTheirVendorCode;

    @Column(name = "OLD_THEIR_VENDOR_NAME")
    private String oldTheirVendorName;

    @Column(name = "CONTRACT_START_DATE")
    private Date contractStartDate;

    @Column(name = "CONTRACT_END_DATE")
    private Date contractEndDate;

    @Column(name = "VENDOR_TAX_NUM")
    private String vendorTaxNum;

    @Column(name = "ACCOUNT_ITEM_CODE")
    private String accountItemCode;

    @Column(name = "ACCOUNT_ITEM_NAME")
    private String accountItemName;

    @Column(name = "AREA_NAME")
    private String areaName;

    @Column(name = "AREA_CODE")
    private String areaCode;

    @Column(name = "FORM_ID")
    private String formId;

    @Column(name = "OVER_STANDARD")
    private String overStandard;

    @Column(name = "CROSS_PROJECT_WRITTENOFF")
    private String crossProjectWrittenoff;

    @Column(name = "EXTEND92")
    private String extend92;

    @Column(name = "EXTEND93")
    private String extend93;

    @Column(name = "OPERATION_POINT_CODE")
    private String operationPointCode;

    @Column(name = "OPERATION_POINT_NAME")
    private String operationPointName;

    @Column(name = "REGION_CODE")
    private String regionCode;

    @Column(name = "REGION_NAME")
    private String regionName;

    @Column(name = "REMAIN_AMOUNT")
    private BigDecimal remainAmount;

    @Column(name = "CREATE_MODE")
    private String createMode;

    @Column(name = "PAYMENT_MONTH_START")
    private Date paymentMonthStart;

    @Column(name = "PAYMENT_MONTH_END")
    private Date paymentMonthEnd;

    @Column(name = "CONTRACT_INOUT")
    private String contractInout;

    @Column(name = "SJVENDOR_CODE")
    private String sjvendorCode;

    @Column(name = "SJVENDOR_NAME")
    private String sjvendorName;

    @Column(name = "SJVENDOR_SITE_NAME")
    private String sjvendorSiteName;

    @Column(name = "SJVENDOR_ACCOUNT_NAME")
    private String sjvendorAccountName;

    @Column(name = "SJVENDOR_ACCOUNT_NO")
    private String sjvendorAccountNo;

    @Column(name = "SJVENDOR_BANK_NAME")
    private String sjvendorBankName;

    @Column(name = "SJVENDOR_BANK_DES")
    private String sjvendorBankDes;

    @Column(name = "ISCOST_SHARING")
    private String iscostSharing;

    @Column(name = "IS_SUBMIT_CHAIRMAN")
    private String isSubmitChairman;

    @Column(name = "IS_LONGTIME_BUSINESS_TRIP")
    private String isLongtimeBusinessTrip;

    @Column(name = "ACCOUNT_BACK")
    private String accountBack;

    @Column(name = "PAYMENT_DEADLINE_DAY")
    private Date paymentDeadlineDay;

    @Column(name = "INVOICE_TYPE")
    private String invoiceType;

    @Column(name = "ORIGINAL_INVOICE")
    private String originalInvoice;

    @Column(name = "IS_FOREIGN_CURRENCY_APPLY")
    private String isForeignCurrencyApply;

    @Column(name = "PROJECT_NO")
    private String projectNo;

    @Column(name = "SOURCE_CLAIM_NO")
    private String sourceClaimNo;

    @Column(name = "SOURCE_CLAIM_ID")
    private String sourceClaimId;

    @Column(name = "PMS_INVOICE_TYPE")
    private String pmsInvoiceType;

    @Column(name = "OVER_BUDGET_FLAG")
    private String overBudgetFlag;

    @Column(name = "BILL_SOURCE")
    private String billSource;

    @Column(name = "SJEKP_NO")
    private String sjekpNo;

    @Column(name = "SJEKP_URL")
    private String sjekpUrl;

    @Column(name = "SJEKP_DOCSUBJECT")
    private String sjekpDocsubject;

    @Column(name = "CONS_NO")
    private String consNo;

    @Column(name = "REFUND_REQUEST_NO")
    private String refundRequestNo;

    @Column(name = "TASK_TYPE")
    private String taskType;

    @Column(name = "TASK_ID")
    private String taskId;

    @Column(name = "REFUND_REQUEST_ID")
    private Short refundRequestId;

    @Column(name = "CIS_TFLX")
    private String cisTflx;

    @Column(name = "IS_PAY")
    private String isPay;

    @Column(name = "SJ_VENDOR_NAME_CIS")
    private String sjVendorNameCis;

    @Column(name = "SJ_VENDOR_BANK_NAME_CIS")
    private String sjVendorBankNameCis;

    @Column(name = "SJ_VENDOR_ACCOUNT_NO_CIS")
    private String sjVendorAccountNoCis;

    @Column(name = "IS_COMPLETED_TRANSFER")
    private String isCompletedTransfer;

    @Column(name = "TOTAL_GROSS_PROFIT_RATE")
    private String totalGrossProfitRate;

    @Column(name = "CRC_SPVR_RCD")
    private BigDecimal crcSpvrRcd;

    @Column(name = "PROJECT_VALUE")
    private String projectValue;

    @Column(name = "PROJECT_VALUE_DES")
    private String projectValueDes;

    @Column(name = "PLAN_COMPLE_TIME")
    private Date planCompleTime;

    @Column(name = "OA_NO")
    private String oaNo;

    @Column(name = "REFUSE_FLAG")
    private String refuseFlag;

    @Column(name = "IS_EASY_TO_LEVY")
    private String isEasyToLevy;

    @Column(name = "BACK_DOC_TIME")
    private Date backDocTime;

    @Column(name = "COLLECT_DOC_STATE")
    private String collectDocState;

    @Column(name = "COLLECT_DOC_TIME")
    private Date collectDocTime;

    @Column(name = "IMAGE_MODE")
    private String imageMode;

    /**
     * @return CLAIM_ID
     */
    public Short getClaimId() {
        return claimId;
    }

    /**
     * @param claimId
     */
    public void setClaimId(Short claimId) {
        this.claimId = claimId;
    }

    /**
     * @return CLAIM_NO
     */
    public String getClaimNo() {
        return claimNo;
    }

    /**
     * @param claimNo
     */
    public void setClaimNo(String claimNo) {
        this.claimNo = claimNo;
    }

    /**
     * @return TP_CODE
     */
    public String getTpCode() {
        return tpCode;
    }

    /**
     * @param tpCode
     */
    public void setTpCode(String tpCode) {
        this.tpCode = tpCode;
    }

    /**
     * @return TP_NAME
     */
    public String getTpName() {
        return tpName;
    }

    /**
     * @param tpName
     */
    public void setTpName(String tpName) {
        this.tpName = tpName;
    }

    /**
     * @return APPLY_EMP_ID
     */
    public String getApplyEmpId() {
        return applyEmpId;
    }

    /**
     * @param applyEmpId
     */
    public void setApplyEmpId(String applyEmpId) {
        this.applyEmpId = applyEmpId;
    }

    /**
     * @return APPLY_EMP_NAME
     */
    public String getApplyEmpName() {
        return applyEmpName;
    }

    /**
     * @param applyEmpName
     */
    public void setApplyEmpName(String applyEmpName) {
        this.applyEmpName = applyEmpName;
    }

    /**
     * @return APPLY_DEPT_CODE
     */
    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    /**
     * @param applyDeptCode
     */
    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode;
    }

    /**
     * @return APPLY_DEPT_NAME
     */
    public String getApplyDeptName() {
        return applyDeptName;
    }

    /**
     * @param applyDeptName
     */
    public void setApplyDeptName(String applyDeptName) {
        this.applyDeptName = applyDeptName;
    }

    /**
     * @return APPLY_COMP_CODE
     */
    public String getApplyCompCode() {
        return applyCompCode;
    }

    /**
     * @param applyCompCode
     */
    public void setApplyCompCode(String applyCompCode) {
        this.applyCompCode = applyCompCode;
    }

    /**
     * @return APPLY_COMP_NAME
     */
    public String getApplyCompName() {
        return applyCompName;
    }

    /**
     * @param applyCompName
     */
    public void setApplyCompName(String applyCompName) {
        this.applyCompName = applyCompName;
    }

    /**
     * @return APPLY_JOB_ID
     */
    public String getApplyJobId() {
        return applyJobId;
    }

    /**
     * @param applyJobId
     */
    public void setApplyJobId(String applyJobId) {
        this.applyJobId = applyJobId;
    }

    /**
     * @return APPLY_JOB_NAME
     */
    public String getApplyJobName() {
        return applyJobName;
    }

    /**
     * @param applyJobName
     */
    public void setApplyJobName(String applyJobName) {
        this.applyJobName = applyJobName;
    }

    /**
     * @return APPLY_EMAIL
     */
    public String getApplyEmail() {
        return applyEmail;
    }

    /**
     * @param applyEmail
     */
    public void setApplyEmail(String applyEmail) {
        this.applyEmail = applyEmail;
    }

    /**
     * @return APPLY_PHONE
     */
    public String getApplyPhone() {
        return applyPhone;
    }

    /**
     * @param applyPhone
     */
    public void setApplyPhone(String applyPhone) {
        this.applyPhone = applyPhone;
    }

    /**
     * @return APPLY_DATE
     */
    public Date getApplyDate() {
        return applyDate;
    }

    /**
     * @param applyDate
     */
    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * @return GL_DATE
     */
    public Date getGlDate() {
        return glDate;
    }

    /**
     * @param glDate
     */
    public void setGlDate(Date glDate) {
        this.glDate = glDate;
    }

    /**
     * @return ITEM2_CODE
     */
    public String getItem2Code() {
        return item2Code;
    }

    /**
     * @param item2Code
     */
    public void setItem2Code(String item2Code) {
        this.item2Code = item2Code;
    }

    /**
     * @return ITEM2_NAME
     */
    public String getItem2Name() {
        return item2Name;
    }

    /**
     * @param item2Name
     */
    public void setItem2Name(String item2Name) {
        this.item2Name = item2Name;
    }

    /**
     * @return ITEM3_CODE
     */
    public String getItem3Code() {
        return item3Code;
    }

    /**
     * @param item3Code
     */
    public void setItem3Code(String item3Code) {
        this.item3Code = item3Code;
    }

    /**
     * @return ITEM3_NAME
     */
    public String getItem3Name() {
        return item3Name;
    }

    /**
     * @param item3Name
     */
    public void setItem3Name(String item3Name) {
        this.item3Name = item3Name;
    }

    /**
     * @return OU_CODE
     */
    public String getOuCode() {
        return ouCode;
    }

    /**
     * @param ouCode
     */
    public void setOuCode(String ouCode) {
        this.ouCode = ouCode;
    }

    /**
     * @return OU_NAME
     */
    public String getOuName() {
        return ouName;
    }

    /**
     * @param ouName
     */
    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    /**
     * @return ORG_CODE
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * @param orgCode
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * @return ORG_NAME
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * @return BEFOREHAND_APPLICATION
     */
    public String getBeforehandApplication() {
        return beforehandApplication;
    }

    /**
     * @param beforehandApplication
     */
    public void setBeforehandApplication(String beforehandApplication) {
        this.beforehandApplication = beforehandApplication;
    }

    /**
     * @return HAS_VAT
     */
    public String getHasVat() {
        return hasVat;
    }

    /**
     * @param hasVat
     */
    public void setHasVat(String hasVat) {
        this.hasVat = hasVat;
    }

    /**
     * @return CURRENCY
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return INVOICE_NO
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * @param invoiceNo
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * @return INVOICE_BATCH_NO
     */
    public String getInvoiceBatchNo() {
        return invoiceBatchNo;
    }

    /**
     * @param invoiceBatchNo
     */
    public void setInvoiceBatchNo(String invoiceBatchNo) {
        this.invoiceBatchNo = invoiceBatchNo;
    }

    /**
     * @return INVOICE_DATE
     */
    public Date getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * @param invoiceDate
     */
    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    /**
     * @return PAYMENT_MODE
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * @param paymentMode
     */
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    /**
     * @return PRICE_AMOUNT
     */
    public BigDecimal getPriceAmount() {
        return priceAmount;
    }

    /**
     * @param priceAmount
     */
    public void setPriceAmount(BigDecimal priceAmount) {
        this.priceAmount = priceAmount;
    }

    /**
     * @return TAX_AMOUNT
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * @param taxAmount
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * @return APPLY_AMOUNT
     */
    public BigDecimal getApplyAmount() {
        return applyAmount;
    }

    /**
     * @param applyAmount
     */
    public void setApplyAmount(BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
    }

    /**
     * @return PAY_AMOUNT
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * @param payAmount
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * @return CONTRACT_NO
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * @param contractNo
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    /**
     * @return CONTRACT_NAME
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * @param contractName
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    /**
     * @return CONTRACT_TYPE
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * @param contractType
     */
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    /**
     * @return CONTRACT_AMOUNT
     */
    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    /**
     * @param contractAmount
     */
    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }

    /**
     * @return VENDOR_CODE
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * @param vendorCode
     */
    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    /**
     * @return VENDOR_NAME
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * @param vendorName
     */
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * @return VENDOR_SITE_CODE
     */
    public String getVendorSiteCode() {
        return vendorSiteCode;
    }

    /**
     * @param vendorSiteCode
     */
    public void setVendorSiteCode(String vendorSiteCode) {
        this.vendorSiteCode = vendorSiteCode;
    }

    /**
     * @return VENDOR_SITE_NAME
     */
    public String getVendorSiteName() {
        return vendorSiteName;
    }

    /**
     * @param vendorSiteName
     */
    public void setVendorSiteName(String vendorSiteName) {
        this.vendorSiteName = vendorSiteName;
    }

    /**
     * @return VENDOR_ACCOUNT_NAME
     */
    public String getVendorAccountName() {
        return vendorAccountName;
    }

    /**
     * @param vendorAccountName
     */
    public void setVendorAccountName(String vendorAccountName) {
        this.vendorAccountName = vendorAccountName;
    }

    /**
     * @return VENDOR_ACCOUNT_NO
     */
    public String getVendorAccountNo() {
        return vendorAccountNo;
    }

    /**
     * @param vendorAccountNo
     */
    public void setVendorAccountNo(String vendorAccountNo) {
        this.vendorAccountNo = vendorAccountNo;
    }

    /**
     * @return VENDOR_BANK_NAME
     */
    public String getVendorBankName() {
        return vendorBankName;
    }

    /**
     * @param vendorBankName
     */
    public void setVendorBankName(String vendorBankName) {
        this.vendorBankName = vendorBankName;
    }

    /**
     * @return CHARGE_SETTLEMENT
     */
    public String getChargeSettlement() {
        return chargeSettlement;
    }

    /**
     * @param chargeSettlement
     */
    public void setChargeSettlement(String chargeSettlement) {
        this.chargeSettlement = chargeSettlement;
    }

    /**
     * @return ATTACH_NUM
     */
    public Short getAttachNum() {
        return attachNum;
    }

    /**
     * @param attachNum
     */
    public void setAttachNum(Short attachNum) {
        this.attachNum = attachNum;
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return CR_ACCOUNT_ITEM_CODE
     */
    public String getCrAccountItemCode() {
        return crAccountItemCode;
    }

    /**
     * @param crAccountItemCode
     */
    public void setCrAccountItemCode(String crAccountItemCode) {
        this.crAccountItemCode = crAccountItemCode;
    }

    /**
     * @return CR_ACCOUNT_ITEM_NAME
     */
    public String getCrAccountItemName() {
        return crAccountItemName;
    }

    /**
     * @param crAccountItemName
     */
    public void setCrAccountItemName(String crAccountItemName) {
        this.crAccountItemName = crAccountItemName;
    }

    /**
     * @return SUMMARY
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return INVOICE_STATE
     */
    public String getInvoiceState() {
        return invoiceState;
    }

    /**
     * @param invoiceState
     */
    public void setInvoiceState(String invoiceState) {
        this.invoiceState = invoiceState;
    }

    /**
     * @return IMG_STATE
     */
    public String getImgState() {
        return imgState;
    }

    /**
     * @param imgState
     */
    public void setImgState(String imgState) {
        this.imgState = imgState;
    }

    /**
     * @return PAY_STATE
     */
    public String getPayState() {
        return payState;
    }

    /**
     * @param payState
     */
    public void setPayState(String payState) {
        this.payState = payState;
    }

    /**
     * @return PROCESS_INSTANCE_ID
     */
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * @param processInstanceId
     */
    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    /**
     * @return PROCESS_STATE
     */
    public String getProcessState() {
        return processState;
    }

    /**
     * @param processState
     */
    public void setProcessState(String processState) {
        this.processState = processState;
    }

    /**
     * @return CREATE_USER
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * @param createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return EXTEND1
     */
    public Short getExtend1() {
        return extend1;
    }

    /**
     * @param extend1
     */
    public void setExtend1(Short extend1) {
        this.extend1 = extend1;
    }

    /**
     * @return EXTEND2
     */
    public Short getExtend2() {
        return extend2;
    }

    /**
     * @param extend2
     */
    public void setExtend2(Short extend2) {
        this.extend2 = extend2;
    }

    /**
     * @return EXTEND3
     */
    public Short getExtend3() {
        return extend3;
    }

    /**
     * @param extend3
     */
    public void setExtend3(Short extend3) {
        this.extend3 = extend3;
    }

    /**
     * @return EXTEND4
     */
    public Short getExtend4() {
        return extend4;
    }

    /**
     * @param extend4
     */
    public void setExtend4(Short extend4) {
        this.extend4 = extend4;
    }

    /**
     * @return EXTEND5
     */
    public Short getExtend5() {
        return extend5;
    }

    /**
     * @param extend5
     */
    public void setExtend5(Short extend5) {
        this.extend5 = extend5;
    }

    /**
     * @return EXTEND6
     */
    public String getExtend6() {
        return extend6;
    }

    /**
     * @param extend6
     */
    public void setExtend6(String extend6) {
        this.extend6 = extend6;
    }

    /**
     * @return EXTEND7
     */
    public String getExtend7() {
        return extend7;
    }

    /**
     * @param extend7
     */
    public void setExtend7(String extend7) {
        this.extend7 = extend7;
    }

    /**
     * @return EXTEND8
     */
    public String getExtend8() {
        return extend8;
    }

    /**
     * @param extend8
     */
    public void setExtend8(String extend8) {
        this.extend8 = extend8;
    }

    /**
     * @return EXTEND9
     */
    public String getExtend9() {
        return extend9;
    }

    /**
     * @param extend9
     */
    public void setExtend9(String extend9) {
        this.extend9 = extend9;
    }

    /**
     * @return EXTEND10
     */
    public String getExtend10() {
        return extend10;
    }

    /**
     * @param extend10
     */
    public void setExtend10(String extend10) {
        this.extend10 = extend10;
    }

    /**
     * @return REL_STATE
     */
    public String getRelState() {
        return relState;
    }

    /**
     * @param relState
     */
    public void setRelState(String relState) {
        this.relState = relState;
    }

    /**
     * @return WHOLE_ORG_ID
     */
    public String getWholeOrgId() {
        return wholeOrgId;
    }

    /**
     * @param wholeOrgId
     */
    public void setWholeOrgId(String wholeOrgId) {
        this.wholeOrgId = wholeOrgId;
    }

    /**
     * @return BACK_STATE
     */
    public String getBackState() {
        return backState;
    }

    /**
     * @param backState
     */
    public void setBackState(String backState) {
        this.backState = backState;
    }

    /**
     * @return REWARD_AMOUNT
     */
    public BigDecimal getRewardAmount() {
        return rewardAmount;
    }

    /**
     * @param rewardAmount
     */
    public void setRewardAmount(BigDecimal rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    /**
     * @return QUALITY_DEDUCTION_AMOUNT
     */
    public BigDecimal getQualityDeductionAmount() {
        return qualityDeductionAmount;
    }

    /**
     * @param qualityDeductionAmount
     */
    public void setQualityDeductionAmount(BigDecimal qualityDeductionAmount) {
        this.qualityDeductionAmount = qualityDeductionAmount;
    }

    /**
     * @return SETTLEMENT_AMOUNT
     */
    public BigDecimal getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * @param settlementAmount
     */
    public void setSettlementAmount(BigDecimal settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    /**
     * @return LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * @param loadType
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * @return REPAYMENT_DATE
     */
    public Date getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * @param repaymentDate
     */
    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    /**
     * @return BORROWING_AMOUNT
     */
    public BigDecimal getBorrowingAmount() {
        return borrowingAmount;
    }

    /**
     * @param borrowingAmount
     */
    public void setBorrowingAmount(BigDecimal borrowingAmount) {
        this.borrowingAmount = borrowingAmount;
    }

    /**
     * @return ABR_PAY
     */
    public String getAbrPay() {
        return abrPay;
    }

    /**
     * @param abrPay
     */
    public void setAbrPay(String abrPay) {
        this.abrPay = abrPay;
    }

    /**
     * @return LABOR_CHARGE_AMOUNT
     */
    public BigDecimal getLaborChargeAmount() {
        return laborChargeAmount;
    }

    /**
     * @param laborChargeAmount
     */
    public void setLaborChargeAmount(BigDecimal laborChargeAmount) {
        this.laborChargeAmount = laborChargeAmount;
    }

    /**
     * @return DEDUCTION_PROJECT_NAME
     */
    public String getDeductionProjectName() {
        return deductionProjectName;
    }

    /**
     * @param deductionProjectName
     */
    public void setDeductionProjectName(String deductionProjectName) {
        this.deductionProjectName = deductionProjectName;
    }

    /**
     * @return ADVANCE_PAY
     */
    public BigDecimal getAdvancePay() {
        return advancePay;
    }

    /**
     * @param advancePay
     */
    public void setAdvancePay(BigDecimal advancePay) {
        this.advancePay = advancePay;
    }

    /**
     * @return PAYMENT_AMOUNT
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * @param paymentAmount
     */
    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * @return PROCESS_TEMPLATE_CODE
     */
    public String getProcessTemplateCode() {
        return processTemplateCode;
    }

    /**
     * @param processTemplateCode
     */
    public void setProcessTemplateCode(String processTemplateCode) {
        this.processTemplateCode = processTemplateCode;
    }

    /**
     * @return PROCESS_TEMPLATE_VERSION
     */
    public String getProcessTemplateVersion() {
        return processTemplateVersion;
    }

    /**
     * @param processTemplateVersion
     */
    public void setProcessTemplateVersion(String processTemplateVersion) {
        this.processTemplateVersion = processTemplateVersion;
    }

    /**
     * @return RECEIVE_AMOUNT
     */
    public BigDecimal getReceiveAmount() {
        return receiveAmount;
    }

    /**
     * @param receiveAmount
     */
    public void setReceiveAmount(BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    /**
     * @return INVOICE_AMOUNT
     */
    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * @param invoiceAmount
     */
    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    /**
     * @return SRM_DES
     */
    public String getSrmDes() {
        return srmDes;
    }

    /**
     * @param srmDes
     */
    public void setSrmDes(String srmDes) {
        this.srmDes = srmDes;
    }

    /**
     * @return ERP_SETTLEMENT_NO
     */
    public String getErpSettlementNo() {
        return erpSettlementNo;
    }

    /**
     * @param erpSettlementNo
     */
    public void setErpSettlementNo(String erpSettlementNo) {
        this.erpSettlementNo = erpSettlementNo;
    }

    /**
     * @return CONTRACT_UNIT_PRICE
     */
    public String getContractUnitPrice() {
        return contractUnitPrice;
    }

    /**
     * @param contractUnitPrice
     */
    public void setContractUnitPrice(String contractUnitPrice) {
        this.contractUnitPrice = contractUnitPrice;
    }

    /**
     * @return SETTLEMENT_UNIT_PRICE
     */
    public String getSettlementUnitPrice() {
        return settlementUnitPrice;
    }

    /**
     * @param settlementUnitPrice
     */
    public void setSettlementUnitPrice(String settlementUnitPrice) {
        this.settlementUnitPrice = settlementUnitPrice;
    }

    /**
     * @return SETTLEMENT_QUANTITY
     */
    public String getSettlementQuantity() {
        return settlementQuantity;
    }

    /**
     * @param settlementQuantity
     */
    public void setSettlementQuantity(String settlementQuantity) {
        this.settlementQuantity = settlementQuantity;
    }

    /**
     * @return ERP_CODE
     */
    public String getErpCode() {
        return erpCode;
    }

    /**
     * @param erpCode
     */
    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    /**
     * @return IMMEDIATE_PAY_AMOUNT
     */
    public BigDecimal getImmediatePayAmount() {
        return immediatePayAmount;
    }

    /**
     * @param immediatePayAmount
     */
    public void setImmediatePayAmount(BigDecimal immediatePayAmount) {
        this.immediatePayAmount = immediatePayAmount;
    }

    /**
     * @return REL_CLAIM_ID
     */
    public Short getRelClaimId() {
        return relClaimId;
    }

    /**
     * @param relClaimId
     */
    public void setRelClaimId(Short relClaimId) {
        this.relClaimId = relClaimId;
    }

    /**
     * @return SETTLEMENT_DATE_FROM
     */
    public Date getSettlementDateFrom() {
        return settlementDateFrom;
    }

    /**
     * @param settlementDateFrom
     */
    public void setSettlementDateFrom(Date settlementDateFrom) {
        this.settlementDateFrom = settlementDateFrom;
    }

    /**
     * @return SETTLEMENT_DATE_TO
     */
    public Date getSettlementDateTo() {
        return settlementDateTo;
    }

    /**
     * @param settlementDateTo
     */
    public void setSettlementDateTo(Date settlementDateTo) {
        this.settlementDateTo = settlementDateTo;
    }

    /**
     * @return CONTRACT_URL
     */
    public String getContractUrl() {
        return contractUrl;
    }

    /**
     * @param contractUrl
     */
    public void setContractUrl(String contractUrl) {
        this.contractUrl = contractUrl;
    }

    /**
     * @return USER_NAMES
     */
    public String getUserNames() {
        return userNames;
    }

    /**
     * @param userNames
     */
    public void setUserNames(String userNames) {
        this.userNames = userNames;
    }

    /**
     * @return USER_IDS
     */
    public String getUserIds() {
        return userIds;
    }

    /**
     * @param userIds
     */
    public void setUserIds(String userIds) {
        this.userIds = userIds;
    }

    /**
     * @return UPDATE_EMP_NAME
     */
    public String getUpdateEmpName() {
        return updateEmpName;
    }

    /**
     * @param updateEmpName
     */
    public void setUpdateEmpName(String updateEmpName) {
        this.updateEmpName = updateEmpName;
    }

    /**
     * @return UPDATE_JOB_NAME
     */
    public String getUpdateJobName() {
        return updateJobName;
    }

    /**
     * @param updateJobName
     */
    public void setUpdateJobName(String updateJobName) {
        this.updateJobName = updateJobName;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return PAYMENT_DATE
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * @param paymentDate
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * @return EMERGENCY_LEVEL
     */
    public String getEmergencyLevel() {
        return emergencyLevel;
    }

    /**
     * @param emergencyLevel
     */
    public void setEmergencyLevel(String emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }

    /**
     * @return VENDOR_BANK_DES
     */
    public String getVendorBankDes() {
        return vendorBankDes;
    }

    /**
     * @param vendorBankDes
     */
    public void setVendorBankDes(String vendorBankDes) {
        this.vendorBankDes = vendorBankDes;
    }

    /**
     * @return TRAVEL_START_TIME
     */
    public Date getTravelStartTime() {
        return travelStartTime;
    }

    /**
     * @param travelStartTime
     */
    public void setTravelStartTime(Date travelStartTime) {
        this.travelStartTime = travelStartTime;
    }

    /**
     * @return TRAVEL_END_TIME
     */
    public Date getTravelEndTime() {
        return travelEndTime;
    }

    /**
     * @param travelEndTime
     */
    public void setTravelEndTime(Date travelEndTime) {
        this.travelEndTime = travelEndTime;
    }

    /**
     * @return TRAVEL_START_CITY
     */
    public String getTravelStartCity() {
        return travelStartCity;
    }

    /**
     * @param travelStartCity
     */
    public void setTravelStartCity(String travelStartCity) {
        this.travelStartCity = travelStartCity;
    }

    /**
     * @return TRAVEL_END_CITY
     */
    public String getTravelEndCity() {
        return travelEndCity;
    }

    /**
     * @param travelEndCity
     */
    public void setTravelEndCity(String travelEndCity) {
        this.travelEndCity = travelEndCity;
    }

    /**
     * @return ORD_TYPE
     */
    public String getOrdType() {
        return ordType;
    }

    /**
     * @param ordType
     */
    public void setOrdType(String ordType) {
        this.ordType = ordType;
    }

    /**
     * @return SJAPPLY_EMP_ID
     */
    public String getSjapplyEmpId() {
        return sjapplyEmpId;
    }

    /**
     * @param sjapplyEmpId
     */
    public void setSjapplyEmpId(String sjapplyEmpId) {
        this.sjapplyEmpId = sjapplyEmpId;
    }

    /**
     * @return SJAPPLY_DEPT_CODE
     */
    public String getSjapplyDeptCode() {
        return sjapplyDeptCode;
    }

    /**
     * @param sjapplyDeptCode
     */
    public void setSjapplyDeptCode(String sjapplyDeptCode) {
        this.sjapplyDeptCode = sjapplyDeptCode;
    }

    /**
     * @return SJAPPLY_JOB_ID
     */
    public String getSjapplyJobId() {
        return sjapplyJobId;
    }

    /**
     * @param sjapplyJobId
     */
    public void setSjapplyJobId(String sjapplyJobId) {
        this.sjapplyJobId = sjapplyJobId;
    }

    /**
     * @return IS_DAIBAO
     */
    public String getIsDaibao() {
        return isDaibao;
    }

    /**
     * @param isDaibao
     */
    public void setIsDaibao(String isDaibao) {
        this.isDaibao = isDaibao;
    }

    /**
     * @return IS_CHANGEED_ACCEPT_REIM
     */
    public String getIsChangeedAcceptReim() {
        return isChangeedAcceptReim;
    }

    /**
     * @param isChangeedAcceptReim
     */
    public void setIsChangeedAcceptReim(String isChangeedAcceptReim) {
        this.isChangeedAcceptReim = isChangeedAcceptReim;
    }

    /**
     * @return APPLY_ORG_ID
     */
    public Short getApplyOrgId() {
        return applyOrgId;
    }

    /**
     * @param applyOrgId
     */
    public void setApplyOrgId(Short applyOrgId) {
        this.applyOrgId = applyOrgId;
    }

    /**
     * @return ABNORMAL_PAYMENT
     */
    public String getAbnormalPayment() {
        return abnormalPayment;
    }

    /**
     * @param abnormalPayment
     */
    public void setAbnormalPayment(String abnormalPayment) {
        this.abnormalPayment = abnormalPayment;
    }

    /**
     * @return SPECIAL_PAYMENT
     */
    public String getSpecialPayment() {
        return specialPayment;
    }

    /**
     * @param specialPayment
     */
    public void setSpecialPayment(String specialPayment) {
        this.specialPayment = specialPayment;
    }

    /**
     * @return PAY_TYPE
     */
    public String getPayType() {
        return payType;
    }

    /**
     * @param payType
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * @return GENERAL_PAYMENT
     */
    public String getGeneralPayment() {
        return generalPayment;
    }

    /**
     * @param generalPayment
     */
    public void setGeneralPayment(String generalPayment) {
        this.generalPayment = generalPayment;
    }

    /**
     * @return ISLARGEECAPITAL
     */
    public String getIslargeecapital() {
        return islargeecapital;
    }

    /**
     * @param islargeecapital
     */
    public void setIslargeecapital(String islargeecapital) {
        this.islargeecapital = islargeecapital;
    }

    /**
     * @return IS_EXCEL_IMP
     */
    public String getIsExcelImp() {
        return isExcelImp;
    }

    /**
     * @param isExcelImp
     */
    public void setIsExcelImp(String isExcelImp) {
        this.isExcelImp = isExcelImp;
    }

    /**
     * @return DOC_ID
     */
    public String getDocId() {
        return docId;
    }

    /**
     * @param docId
     */
    public void setDocId(String docId) {
        this.docId = docId;
    }

    /**
     * @return DOC_TITLE
     */
    public String getDocTitle() {
        return docTitle;
    }

    /**
     * @param docTitle
     */
    public void setDocTitle(String docTitle) {
        this.docTitle = docTitle;
    }

    /**
     * @return LINK
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return RELATION_CLAIM
     */
    public String getRelationClaim() {
        return relationClaim;
    }

    /**
     * @param relationClaim
     */
    public void setRelationClaim(String relationClaim) {
        this.relationClaim = relationClaim;
    }

    /**
     * @return APPLY_DEPT_ID
     */
    public Short getApplyDeptId() {
        return applyDeptId;
    }

    /**
     * @param applyDeptId
     */
    public void setApplyDeptId(Short applyDeptId) {
        this.applyDeptId = applyDeptId;
    }

    /**
     * @return PROCESS_WORKITEM_ID
     */
    public BigDecimal getProcessWorkitemId() {
        return processWorkitemId;
    }

    /**
     * @param processWorkitemId
     */
    public void setProcessWorkitemId(BigDecimal processWorkitemId) {
        this.processWorkitemId = processWorkitemId;
    }

    /**
     * @return PROCESS_STATE_NAME
     */
    public String getProcessStateName() {
        return processStateName;
    }

    /**
     * @param processStateName
     */
    public void setProcessStateName(String processStateName) {
        this.processStateName = processStateName;
    }

    /**
     * @return PROCESS_STATE_ID
     */
    public String getProcessStateId() {
        return processStateId;
    }

    /**
     * @param processStateId
     */
    public void setProcessStateId(String processStateId) {
        this.processStateId = processStateId;
    }

    /**
     * @return PROCESS_HANDLER_NAME
     */
    public String getProcessHandlerName() {
        return processHandlerName;
    }

    /**
     * @param processHandlerName
     */
    public void setProcessHandlerName(String processHandlerName) {
        this.processHandlerName = processHandlerName;
    }

    /**
     * @return VENDOR_ID
     */
    public BigDecimal getVendorId() {
        return vendorId;
    }

    /**
     * @param vendorId
     */
    public void setVendorId(BigDecimal vendorId) {
        this.vendorId = vendorId;
    }

    /**
     * @return VENDOR_SITE_ID
     */
    public BigDecimal getVendorSiteId() {
        return vendorSiteId;
    }

    /**
     * @param vendorSiteId
     */
    public void setVendorSiteId(BigDecimal vendorSiteId) {
        this.vendorSiteId = vendorSiteId;
    }

    /**
     * @return VENDOR_ACCOUNT_ID
     */
    public BigDecimal getVendorAccountId() {
        return vendorAccountId;
    }

    /**
     * @param vendorAccountId
     */
    public void setVendorAccountId(BigDecimal vendorAccountId) {
        this.vendorAccountId = vendorAccountId;
    }

    /**
     * @return EXP_CATEGORY_ID
     */
    public BigDecimal getExpCategoryId() {
        return expCategoryId;
    }

    /**
     * @param expCategoryId
     */
    public void setExpCategoryId(BigDecimal expCategoryId) {
        this.expCategoryId = expCategoryId;
    }

    /**
     * @return EXP_CATEGORY_FULL_PATH
     */
    public String getExpCategoryFullPath() {
        return expCategoryFullPath;
    }

    /**
     * @param expCategoryFullPath
     */
    public void setExpCategoryFullPath(String expCategoryFullPath) {
        this.expCategoryFullPath = expCategoryFullPath;
    }

    /**
     * @return APPLY_DEPT_FULL_PATH
     */
    public String getApplyDeptFullPath() {
        return applyDeptFullPath;
    }

    /**
     * @param applyDeptFullPath
     */
    public void setApplyDeptFullPath(String applyDeptFullPath) {
        this.applyDeptFullPath = applyDeptFullPath;
    }

    /**
     * @return REF_HEAD_ID
     */
    public BigDecimal getRefHeadId() {
        return refHeadId;
    }

    /**
     * @param refHeadId
     */
    public void setRefHeadId(BigDecimal refHeadId) {
        this.refHeadId = refHeadId;
    }

    /**
     * @return REF_HEAD_CODE
     */
    public String getRefHeadCode() {
        return refHeadCode;
    }

    /**
     * @param refHeadCode
     */
    public void setRefHeadCode(String refHeadCode) {
        this.refHeadCode = refHeadCode;
    }

    /**
     * @return REF_ORDER_TYPE_CODE
     */
    public String getRefOrderTypeCode() {
        return refOrderTypeCode;
    }

    /**
     * @param refOrderTypeCode
     */
    public void setRefOrderTypeCode(String refOrderTypeCode) {
        this.refOrderTypeCode = refOrderTypeCode;
    }

    /**
     * @return REF_ORDER_TYPE_NAME
     */
    public String getRefOrderTypeName() {
        return refOrderTypeName;
    }

    /**
     * @param refOrderTypeName
     */
    public void setRefOrderTypeName(String refOrderTypeName) {
        this.refOrderTypeName = refOrderTypeName;
    }

    /**
     * @return CONVERSION_RATE
     */
    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    /**
     * @param conversionRate
     */
    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    /**
     * @return REDUCED_AMOUNT
     */
    public BigDecimal getReducedAmount() {
        return reducedAmount;
    }

    /**
     * @param reducedAmount
     */
    public void setReducedAmount(BigDecimal reducedAmount) {
        this.reducedAmount = reducedAmount;
    }

    /**
     * @return DEDUCT_AMOUNT
     */
    public BigDecimal getDeductAmount() {
        return deductAmount;
    }

    /**
     * @param deductAmount
     */
    public void setDeductAmount(BigDecimal deductAmount) {
        this.deductAmount = deductAmount;
    }

    /**
     * @return EXP_CATEGORY_CODE
     */
    public String getExpCategoryCode() {
        return expCategoryCode;
    }

    /**
     * @param expCategoryCode
     */
    public void setExpCategoryCode(String expCategoryCode) {
        this.expCategoryCode = expCategoryCode;
    }

    /**
     * @return PROCESS_STATE_START_TIME
     */
    public Date getProcessStateStartTime() {
        return processStateStartTime;
    }

    /**
     * @param processStateStartTime
     */
    public void setProcessStateStartTime(Date processStateStartTime) {
        this.processStateStartTime = processStateStartTime;
    }

    /**
     * @return THIS_TIME_PAY_AMOUNT
     */
    public BigDecimal getThisTimePayAmount() {
        return thisTimePayAmount;
    }

    /**
     * @param thisTimePayAmount
     */
    public void setThisTimePayAmount(BigDecimal thisTimePayAmount) {
        this.thisTimePayAmount = thisTimePayAmount;
    }

    /**
     * @return CON_THIS_TIME_PAY_AMOUNT
     */
    public BigDecimal getConThisTimePayAmount() {
        return conThisTimePayAmount;
    }

    /**
     * @param conThisTimePayAmount
     */
    public void setConThisTimePayAmount(BigDecimal conThisTimePayAmount) {
        this.conThisTimePayAmount = conThisTimePayAmount;
    }

    /**
     * @return EXP_CATEGORY_NAME
     */
    public String getExpCategoryName() {
        return expCategoryName;
    }

    /**
     * @param expCategoryName
     */
    public void setExpCategoryName(String expCategoryName) {
        this.expCategoryName = expCategoryName;
    }

    /**
     * @return EXP_SUB_CATEGORY_NAME
     */
    public String getExpSubCategoryName() {
        return expSubCategoryName;
    }

    /**
     * @param expSubCategoryName
     */
    public void setExpSubCategoryName(String expSubCategoryName) {
        this.expSubCategoryName = expSubCategoryName;
    }

    /**
     * @return EXP_SUB_CATEGORY_CODE
     */
    public String getExpSubCategoryCode() {
        return expSubCategoryCode;
    }

    /**
     * @param expSubCategoryCode
     */
    public void setExpSubCategoryCode(String expSubCategoryCode) {
        this.expSubCategoryCode = expSubCategoryCode;
    }

    /**
     * @return CURRENT_WRITE_OFF_AMOUNT
     */
    public BigDecimal getCurrentWriteOffAmount() {
        return currentWriteOffAmount;
    }

    /**
     * @param currentWriteOffAmount
     */
    public void setCurrentWriteOffAmount(BigDecimal currentWriteOffAmount) {
        this.currentWriteOffAmount = currentWriteOffAmount;
    }

    /**
     * @return EXTEND11
     */
    public Short getExtend11() {
        return extend11;
    }

    /**
     * @param extend11
     */
    public void setExtend11(Short extend11) {
        this.extend11 = extend11;
    }

    /**
     * @return EXTEND12
     */
    public Short getExtend12() {
        return extend12;
    }

    /**
     * @param extend12
     */
    public void setExtend12(Short extend12) {
        this.extend12 = extend12;
    }

    /**
     * @return EXTEND13
     */
    public Short getExtend13() {
        return extend13;
    }

    /**
     * @param extend13
     */
    public void setExtend13(Short extend13) {
        this.extend13 = extend13;
    }

    /**
     * @return EXTEND14
     */
    public Short getExtend14() {
        return extend14;
    }

    /**
     * @param extend14
     */
    public void setExtend14(Short extend14) {
        this.extend14 = extend14;
    }

    /**
     * @return EXTEND15
     */
    public Short getExtend15() {
        return extend15;
    }

    /**
     * @param extend15
     */
    public void setExtend15(Short extend15) {
        this.extend15 = extend15;
    }

    /**
     * @return VENDOR_DESC
     */
    public String getVendorDesc() {
        return vendorDesc;
    }

    /**
     * @param vendorDesc
     */
    public void setVendorDesc(String vendorDesc) {
        this.vendorDesc = vendorDesc;
    }

    /**
     * @return REF_HEAD_AMOUNT
     */
    public BigDecimal getRefHeadAmount() {
        return refHeadAmount;
    }

    /**
     * @param refHeadAmount
     */
    public void setRefHeadAmount(BigDecimal refHeadAmount) {
        this.refHeadAmount = refHeadAmount;
    }

    /**
     * @return DELETE_FLAG
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param deleteFlag
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * @return BORROWING_BALANCE
     */
    public BigDecimal getBorrowingBalance() {
        return borrowingBalance;
    }

    /**
     * @param borrowingBalance
     */
    public void setBorrowingBalance(BigDecimal borrowingBalance) {
        this.borrowingBalance = borrowingBalance;
    }

    /**
     * @return EXTEND21
     */
    public String getExtend21() {
        return extend21;
    }

    /**
     * @param extend21
     */
    public void setExtend21(String extend21) {
        this.extend21 = extend21;
    }

    /**
     * @return EXTEND22
     */
    public String getExtend22() {
        return extend22;
    }

    /**
     * @param extend22
     */
    public void setExtend22(String extend22) {
        this.extend22 = extend22;
    }

    /**
     * @return EXTEND23
     */
    public String getExtend23() {
        return extend23;
    }

    /**
     * @param extend23
     */
    public void setExtend23(String extend23) {
        this.extend23 = extend23;
    }

    /**
     * @return EXTEND24
     */
    public String getExtend24() {
        return extend24;
    }

    /**
     * @param extend24
     */
    public void setExtend24(String extend24) {
        this.extend24 = extend24;
    }

    /**
     * @return EXTEND25
     */
    public String getExtend25() {
        return extend25;
    }

    /**
     * @param extend25
     */
    public void setExtend25(String extend25) {
        this.extend25 = extend25;
    }

    /**
     * @return EXTEND26
     */
    public String getExtend26() {
        return extend26;
    }

    /**
     * @param extend26
     */
    public void setExtend26(String extend26) {
        this.extend26 = extend26;
    }

    /**
     * @return EXTEND27
     */
    public String getExtend27() {
        return extend27;
    }

    /**
     * @param extend27
     */
    public void setExtend27(String extend27) {
        this.extend27 = extend27;
    }

    /**
     * @return EXTEND28
     */
    public String getExtend28() {
        return extend28;
    }

    /**
     * @param extend28
     */
    public void setExtend28(String extend28) {
        this.extend28 = extend28;
    }

    /**
     * @return EXTEND29
     */
    public String getExtend29() {
        return extend29;
    }

    /**
     * @param extend29
     */
    public void setExtend29(String extend29) {
        this.extend29 = extend29;
    }

    /**
     * @return EXTEND30
     */
    public String getExtend30() {
        return extend30;
    }

    /**
     * @param extend30
     */
    public void setExtend30(String extend30) {
        this.extend30 = extend30;
    }

    /**
     * @return EXTEND41
     */
    public Short getExtend41() {
        return extend41;
    }

    /**
     * @param extend41
     */
    public void setExtend41(Short extend41) {
        this.extend41 = extend41;
    }

    /**
     * @return EXTEND42
     */
    public Short getExtend42() {
        return extend42;
    }

    /**
     * @param extend42
     */
    public void setExtend42(Short extend42) {
        this.extend42 = extend42;
    }

    /**
     * @return EXTEND43
     */
    public Short getExtend43() {
        return extend43;
    }

    /**
     * @param extend43
     */
    public void setExtend43(Short extend43) {
        this.extend43 = extend43;
    }

    /**
     * @return EXTEND44
     */
    public Short getExtend44() {
        return extend44;
    }

    /**
     * @param extend44
     */
    public void setExtend44(Short extend44) {
        this.extend44 = extend44;
    }

    /**
     * @return EXTEND45
     */
    public Short getExtend45() {
        return extend45;
    }

    /**
     * @param extend45
     */
    public void setExtend45(Short extend45) {
        this.extend45 = extend45;
    }

    /**
     * @return EXTEND61
     */
    public Date getExtend61() {
        return extend61;
    }

    /**
     * @param extend61
     */
    public void setExtend61(Date extend61) {
        this.extend61 = extend61;
    }

    /**
     * @return EXTEND62
     */
    public Date getExtend62() {
        return extend62;
    }

    /**
     * @param extend62
     */
    public void setExtend62(Date extend62) {
        this.extend62 = extend62;
    }

    /**
     * @return EXTEND63
     */
    public Date getExtend63() {
        return extend63;
    }

    /**
     * @param extend63
     */
    public void setExtend63(Date extend63) {
        this.extend63 = extend63;
    }

    /**
     * @return EXTEND64
     */
    public Date getExtend64() {
        return extend64;
    }

    /**
     * @param extend64
     */
    public void setExtend64(Date extend64) {
        this.extend64 = extend64;
    }

    /**
     * @return EXTEND65
     */
    public Date getExtend65() {
        return extend65;
    }

    /**
     * @param extend65
     */
    public void setExtend65(Date extend65) {
        this.extend65 = extend65;
    }

    /**
     * @return IMPORT_INTERFACE
     */
    public String getImportInterface() {
        return importInterface;
    }

    /**
     * @param importInterface
     */
    public void setImportInterface(String importInterface) {
        this.importInterface = importInterface;
    }

    /**
     * @return EXCHANGE_RATE_TYPE
     */
    public String getExchangeRateType() {
        return exchangeRateType;
    }

    /**
     * @param exchangeRateType
     */
    public void setExchangeRateType(String exchangeRateType) {
        this.exchangeRateType = exchangeRateType;
    }

    /**
     * @return IS_COPY
     */
    public String getIsCopy() {
        return isCopy;
    }

    /**
     * @param isCopy
     */
    public void setIsCopy(String isCopy) {
        this.isCopy = isCopy;
    }

    /**
     * @return EXTEND66
     */
    public String getExtend66() {
        return extend66;
    }

    /**
     * @param extend66
     */
    public void setExtend66(String extend66) {
        this.extend66 = extend66;
    }

    /**
     * @return EXTEND67
     */
    public String getExtend67() {
        return extend67;
    }

    /**
     * @param extend67
     */
    public void setExtend67(String extend67) {
        this.extend67 = extend67;
    }

    /**
     * @return COPY_BATCH_NO
     */
    public String getCopyBatchNo() {
        return copyBatchNo;
    }

    /**
     * @param copyBatchNo
     */
    public void setCopyBatchNo(String copyBatchNo) {
        this.copyBatchNo = copyBatchNo;
    }

    /**
     * @return MCC_AVAIL
     */
    public Short getMccAvail() {
        return mccAvail;
    }

    /**
     * @param mccAvail
     */
    public void setMccAvail(Short mccAvail) {
        this.mccAvail = mccAvail;
    }

    /**
     * @return EXTEND34
     */
    public String getExtend34() {
        return extend34;
    }

    /**
     * @param extend34
     */
    public void setExtend34(String extend34) {
        this.extend34 = extend34;
    }

    /**
     * @return EXTEND35
     */
    public String getExtend35() {
        return extend35;
    }

    /**
     * @param extend35
     */
    public void setExtend35(String extend35) {
        this.extend35 = extend35;
    }

    /**
     * @return EXTEND36
     */
    public String getExtend36() {
        return extend36;
    }

    /**
     * @param extend36
     */
    public void setExtend36(String extend36) {
        this.extend36 = extend36;
    }

    /**
     * @return EXTEND37
     */
    public String getExtend37() {
        return extend37;
    }

    /**
     * @param extend37
     */
    public void setExtend37(String extend37) {
        this.extend37 = extend37;
    }

    /**
     * @return EXTEND38
     */
    public String getExtend38() {
        return extend38;
    }

    /**
     * @param extend38
     */
    public void setExtend38(String extend38) {
        this.extend38 = extend38;
    }

    /**
     * @return EXTEND39
     */
    public String getExtend39() {
        return extend39;
    }

    /**
     * @param extend39
     */
    public void setExtend39(String extend39) {
        this.extend39 = extend39;
    }

    /**
     * @return EXTEND40
     */
    public String getExtend40() {
        return extend40;
    }

    /**
     * @param extend40
     */
    public void setExtend40(String extend40) {
        this.extend40 = extend40;
    }

    /**
     * @return EXTEND46
     */
    public BigDecimal getExtend46() {
        return extend46;
    }

    /**
     * @param extend46
     */
    public void setExtend46(BigDecimal extend46) {
        this.extend46 = extend46;
    }

    /**
     * @return EXTEND47
     */
    public BigDecimal getExtend47() {
        return extend47;
    }

    /**
     * @param extend47
     */
    public void setExtend47(BigDecimal extend47) {
        this.extend47 = extend47;
    }

    /**
     * @return EXTEND48
     */
    public BigDecimal getExtend48() {
        return extend48;
    }

    /**
     * @param extend48
     */
    public void setExtend48(BigDecimal extend48) {
        this.extend48 = extend48;
    }

    /**
     * @return EXTEND49
     */
    public BigDecimal getExtend49() {
        return extend49;
    }

    /**
     * @param extend49
     */
    public void setExtend49(BigDecimal extend49) {
        this.extend49 = extend49;
    }

    /**
     * @return EXTEND50
     */
    public BigDecimal getExtend50() {
        return extend50;
    }

    /**
     * @param extend50
     */
    public void setExtend50(BigDecimal extend50) {
        this.extend50 = extend50;
    }

    /**
     * @return EXTEND71
     */
    public String getExtend71() {
        return extend71;
    }

    /**
     * @param extend71
     */
    public void setExtend71(String extend71) {
        this.extend71 = extend71;
    }

    /**
     * @return EXTEND72
     */
    public String getExtend72() {
        return extend72;
    }

    /**
     * @param extend72
     */
    public void setExtend72(String extend72) {
        this.extend72 = extend72;
    }

    /**
     * @return EXTEND73
     */
    public String getExtend73() {
        return extend73;
    }

    /**
     * @param extend73
     */
    public void setExtend73(String extend73) {
        this.extend73 = extend73;
    }

    /**
     * @return EXTEND74
     */
    public String getExtend74() {
        return extend74;
    }

    /**
     * @param extend74
     */
    public void setExtend74(String extend74) {
        this.extend74 = extend74;
    }

    /**
     * @return EXTEND75
     */
    public String getExtend75() {
        return extend75;
    }

    /**
     * @param extend75
     */
    public void setExtend75(String extend75) {
        this.extend75 = extend75;
    }

    /**
     * @return EXTEND76
     */
    public String getExtend76() {
        return extend76;
    }

    /**
     * @param extend76
     */
    public void setExtend76(String extend76) {
        this.extend76 = extend76;
    }

    /**
     * @return EXTEND77
     */
    public String getExtend77() {
        return extend77;
    }

    /**
     * @param extend77
     */
    public void setExtend77(String extend77) {
        this.extend77 = extend77;
    }

    /**
     * @return EXTEND78
     */
    public String getExtend78() {
        return extend78;
    }

    /**
     * @param extend78
     */
    public void setExtend78(String extend78) {
        this.extend78 = extend78;
    }

    /**
     * @return EXTEND79
     */
    public String getExtend79() {
        return extend79;
    }

    /**
     * @param extend79
     */
    public void setExtend79(String extend79) {
        this.extend79 = extend79;
    }

    /**
     * @return EXTEND80
     */
    public String getExtend80() {
        return extend80;
    }

    /**
     * @param extend80
     */
    public void setExtend80(String extend80) {
        this.extend80 = extend80;
    }

    /**
     * @return EXTEND81
     */
    public String getExtend81() {
        return extend81;
    }

    /**
     * @param extend81
     */
    public void setExtend81(String extend81) {
        this.extend81 = extend81;
    }

    /**
     * @return EXTEND82
     */
    public String getExtend82() {
        return extend82;
    }

    /**
     * @param extend82
     */
    public void setExtend82(String extend82) {
        this.extend82 = extend82;
    }

    /**
     * @return EXTEND83
     */
    public String getExtend83() {
        return extend83;
    }

    /**
     * @param extend83
     */
    public void setExtend83(String extend83) {
        this.extend83 = extend83;
    }

    /**
     * @return EXTEND84
     */
    public String getExtend84() {
        return extend84;
    }

    /**
     * @param extend84
     */
    public void setExtend84(String extend84) {
        this.extend84 = extend84;
    }

    /**
     * @return EXTEND85
     */
    public String getExtend85() {
        return extend85;
    }

    /**
     * @param extend85
     */
    public void setExtend85(String extend85) {
        this.extend85 = extend85;
    }

    /**
     * @return EXTEND86
     */
    public String getExtend86() {
        return extend86;
    }

    /**
     * @param extend86
     */
    public void setExtend86(String extend86) {
        this.extend86 = extend86;
    }

    /**
     * @return EXTEND87
     */
    public String getExtend87() {
        return extend87;
    }

    /**
     * @param extend87
     */
    public void setExtend87(String extend87) {
        this.extend87 = extend87;
    }

    /**
     * @return EXTEND88
     */
    public String getExtend88() {
        return extend88;
    }

    /**
     * @param extend88
     */
    public void setExtend88(String extend88) {
        this.extend88 = extend88;
    }

    /**
     * @return EXTEND89
     */
    public String getExtend89() {
        return extend89;
    }

    /**
     * @param extend89
     */
    public void setExtend89(String extend89) {
        this.extend89 = extend89;
    }

    /**
     * @return EXTEND90
     */
    public String getExtend90() {
        return extend90;
    }

    /**
     * @param extend90
     */
    public void setExtend90(String extend90) {
        this.extend90 = extend90;
    }

    /**
     * @return EXTEND91
     */
    public String getExtend91() {
        return extend91;
    }

    /**
     * @param extend91
     */
    public void setExtend91(String extend91) {
        this.extend91 = extend91;
    }

    /**
     * @return BU_CODE
     */
    public String getBuCode() {
        return buCode;
    }

    /**
     * @param buCode
     */
    public void setBuCode(String buCode) {
        this.buCode = buCode;
    }

    /**
     * @return BU_NAME
     */
    public String getBuName() {
        return buName;
    }

    /**
     * @param buName
     */
    public void setBuName(String buName) {
        this.buName = buName;
    }

    /**
     * @return PARENT_CLAIM_BASE_ID
     */
    public BigDecimal getParentClaimBaseId() {
        return parentClaimBaseId;
    }

    /**
     * @param parentClaimBaseId
     */
    public void setParentClaimBaseId(BigDecimal parentClaimBaseId) {
        this.parentClaimBaseId = parentClaimBaseId;
    }

    /**
     * @return PARENT_INSTANCE_ID
     */
    public BigDecimal getParentInstanceId() {
        return parentInstanceId;
    }

    /**
     * @param parentInstanceId
     */
    public void setParentInstanceId(BigDecimal parentInstanceId) {
        this.parentInstanceId = parentInstanceId;
    }

    /**
     * @return PARENT_ACTIVITY_INSTANCE_ID
     */
    public BigDecimal getParentActivityInstanceId() {
        return parentActivityInstanceId;
    }

    /**
     * @param parentActivityInstanceId
     */
    public void setParentActivityInstanceId(BigDecimal parentActivityInstanceId) {
        this.parentActivityInstanceId = parentActivityInstanceId;
    }

    /**
     * @return PARENT_WORKITEM_ID
     */
    public BigDecimal getParentWorkitemId() {
        return parentWorkitemId;
    }

    /**
     * @param parentWorkitemId
     */
    public void setParentWorkitemId(BigDecimal parentWorkitemId) {
        this.parentWorkitemId = parentWorkitemId;
    }

    /**
     * @return APPLY_EMP_ROLE
     */
    public String getApplyEmpRole() {
        return applyEmpRole;
    }

    /**
     * @param applyEmpRole
     */
    public void setApplyEmpRole(String applyEmpRole) {
        this.applyEmpRole = applyEmpRole;
    }

    /**
     * @return APPLY_EMP_POSITION_TYPE
     */
    public String getApplyEmpPositionType() {
        return applyEmpPositionType;
    }

    /**
     * @param applyEmpPositionType
     */
    public void setApplyEmpPositionType(String applyEmpPositionType) {
        this.applyEmpPositionType = applyEmpPositionType;
    }

    /**
     * @return EXTEND33
     */
    public String getExtend33() {
        return extend33;
    }

    /**
     * @param extend33
     */
    public void setExtend33(String extend33) {
        this.extend33 = extend33;
    }

    /**
     * @return EXTEND32
     */
    public String getExtend32() {
        return extend32;
    }

    /**
     * @param extend32
     */
    public void setExtend32(String extend32) {
        this.extend32 = extend32;
    }

    /**
     * @return EXTEND31
     */
    public String getExtend31() {
        return extend31;
    }

    /**
     * @param extend31
     */
    public void setExtend31(String extend31) {
        this.extend31 = extend31;
    }

    /**
     * @return ACTIVITY_NAME
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * @param activityName
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    /**
     * @return MONTH_STATEMENT_NO
     */
    public String getMonthStatementNo() {
        return monthStatementNo;
    }

    /**
     * @param monthStatementNo
     */
    public void setMonthStatementNo(String monthStatementNo) {
        this.monthStatementNo = monthStatementNo;
    }

    /**
     * @return APPLY_NO
     */
    public String getApplyNo() {
        return applyNo;
    }

    /**
     * @param applyNo
     */
    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    /**
     * @return OLD_THEIR_VENDOR_CODE
     */
    public String getOldTheirVendorCode() {
        return oldTheirVendorCode;
    }

    /**
     * @param oldTheirVendorCode
     */
    public void setOldTheirVendorCode(String oldTheirVendorCode) {
        this.oldTheirVendorCode = oldTheirVendorCode;
    }

    /**
     * @return OLD_THEIR_VENDOR_NAME
     */
    public String getOldTheirVendorName() {
        return oldTheirVendorName;
    }

    /**
     * @param oldTheirVendorName
     */
    public void setOldTheirVendorName(String oldTheirVendorName) {
        this.oldTheirVendorName = oldTheirVendorName;
    }

    /**
     * @return CONTRACT_START_DATE
     */
    public Date getContractStartDate() {
        return contractStartDate;
    }

    /**
     * @param contractStartDate
     */
    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    /**
     * @return CONTRACT_END_DATE
     */
    public Date getContractEndDate() {
        return contractEndDate;
    }

    /**
     * @param contractEndDate
     */
    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    /**
     * @return VENDOR_TAX_NUM
     */
    public String getVendorTaxNum() {
        return vendorTaxNum;
    }

    /**
     * @param vendorTaxNum
     */
    public void setVendorTaxNum(String vendorTaxNum) {
        this.vendorTaxNum = vendorTaxNum;
    }

    /**
     * @return ACCOUNT_ITEM_CODE
     */
    public String getAccountItemCode() {
        return accountItemCode;
    }

    /**
     * @param accountItemCode
     */
    public void setAccountItemCode(String accountItemCode) {
        this.accountItemCode = accountItemCode;
    }

    /**
     * @return ACCOUNT_ITEM_NAME
     */
    public String getAccountItemName() {
        return accountItemName;
    }

    /**
     * @param accountItemName
     */
    public void setAccountItemName(String accountItemName) {
        this.accountItemName = accountItemName;
    }

    /**
     * @return AREA_NAME
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * @param areaName
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * @return AREA_CODE
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * @param areaCode
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * @return FORM_ID
     */
    public String getFormId() {
        return formId;
    }

    /**
     * @param formId
     */
    public void setFormId(String formId) {
        this.formId = formId;
    }

    /**
     * @return OVER_STANDARD
     */
    public String getOverStandard() {
        return overStandard;
    }

    /**
     * @param overStandard
     */
    public void setOverStandard(String overStandard) {
        this.overStandard = overStandard;
    }

    /**
     * @return CROSS_PROJECT_WRITTENOFF
     */
    public String getCrossProjectWrittenoff() {
        return crossProjectWrittenoff;
    }

    /**
     * @param crossProjectWrittenoff
     */
    public void setCrossProjectWrittenoff(String crossProjectWrittenoff) {
        this.crossProjectWrittenoff = crossProjectWrittenoff;
    }

    /**
     * @return EXTEND92
     */
    public String getExtend92() {
        return extend92;
    }

    /**
     * @param extend92
     */
    public void setExtend92(String extend92) {
        this.extend92 = extend92;
    }

    /**
     * @return EXTEND93
     */
    public String getExtend93() {
        return extend93;
    }

    /**
     * @param extend93
     */
    public void setExtend93(String extend93) {
        this.extend93 = extend93;
    }

    /**
     * @return OPERATION_POINT_CODE
     */
    public String getOperationPointCode() {
        return operationPointCode;
    }

    /**
     * @param operationPointCode
     */
    public void setOperationPointCode(String operationPointCode) {
        this.operationPointCode = operationPointCode;
    }

    /**
     * @return OPERATION_POINT_NAME
     */
    public String getOperationPointName() {
        return operationPointName;
    }

    /**
     * @param operationPointName
     */
    public void setOperationPointName(String operationPointName) {
        this.operationPointName = operationPointName;
    }

    /**
     * @return REGION_CODE
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * @param regionCode
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * @return REGION_NAME
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * @param regionName
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * @return REMAIN_AMOUNT
     */
    public BigDecimal getRemainAmount() {
        return remainAmount;
    }

    /**
     * @param remainAmount
     */
    public void setRemainAmount(BigDecimal remainAmount) {
        this.remainAmount = remainAmount;
    }

    /**
     * @return CREATE_MODE
     */
    public String getCreateMode() {
        return createMode;
    }

    /**
     * @param createMode
     */
    public void setCreateMode(String createMode) {
        this.createMode = createMode;
    }

    /**
     * @return PAYMENT_MONTH_START
     */
    public Date getPaymentMonthStart() {
        return paymentMonthStart;
    }

    /**
     * @param paymentMonthStart
     */
    public void setPaymentMonthStart(Date paymentMonthStart) {
        this.paymentMonthStart = paymentMonthStart;
    }

    /**
     * @return PAYMENT_MONTH_END
     */
    public Date getPaymentMonthEnd() {
        return paymentMonthEnd;
    }

    /**
     * @param paymentMonthEnd
     */
    public void setPaymentMonthEnd(Date paymentMonthEnd) {
        this.paymentMonthEnd = paymentMonthEnd;
    }

    /**
     * @return CONTRACT_INOUT
     */
    public String getContractInout() {
        return contractInout;
    }

    /**
     * @param contractInout
     */
    public void setContractInout(String contractInout) {
        this.contractInout = contractInout;
    }

    /**
     * @return SJVENDOR_CODE
     */
    public String getSjvendorCode() {
        return sjvendorCode;
    }

    /**
     * @param sjvendorCode
     */
    public void setSjvendorCode(String sjvendorCode) {
        this.sjvendorCode = sjvendorCode;
    }

    /**
     * @return SJVENDOR_NAME
     */
    public String getSjvendorName() {
        return sjvendorName;
    }

    /**
     * @param sjvendorName
     */
    public void setSjvendorName(String sjvendorName) {
        this.sjvendorName = sjvendorName;
    }

    /**
     * @return SJVENDOR_SITE_NAME
     */
    public String getSjvendorSiteName() {
        return sjvendorSiteName;
    }

    /**
     * @param sjvendorSiteName
     */
    public void setSjvendorSiteName(String sjvendorSiteName) {
        this.sjvendorSiteName = sjvendorSiteName;
    }

    /**
     * @return SJVENDOR_ACCOUNT_NAME
     */
    public String getSjvendorAccountName() {
        return sjvendorAccountName;
    }

    /**
     * @param sjvendorAccountName
     */
    public void setSjvendorAccountName(String sjvendorAccountName) {
        this.sjvendorAccountName = sjvendorAccountName;
    }

    /**
     * @return SJVENDOR_ACCOUNT_NO
     */
    public String getSjvendorAccountNo() {
        return sjvendorAccountNo;
    }

    /**
     * @param sjvendorAccountNo
     */
    public void setSjvendorAccountNo(String sjvendorAccountNo) {
        this.sjvendorAccountNo = sjvendorAccountNo;
    }

    /**
     * @return SJVENDOR_BANK_NAME
     */
    public String getSjvendorBankName() {
        return sjvendorBankName;
    }

    /**
     * @param sjvendorBankName
     */
    public void setSjvendorBankName(String sjvendorBankName) {
        this.sjvendorBankName = sjvendorBankName;
    }

    /**
     * @return SJVENDOR_BANK_DES
     */
    public String getSjvendorBankDes() {
        return sjvendorBankDes;
    }

    /**
     * @param sjvendorBankDes
     */
    public void setSjvendorBankDes(String sjvendorBankDes) {
        this.sjvendorBankDes = sjvendorBankDes;
    }

    /**
     * @return ISCOST_SHARING
     */
    public String getIscostSharing() {
        return iscostSharing;
    }

    /**
     * @param iscostSharing
     */
    public void setIscostSharing(String iscostSharing) {
        this.iscostSharing = iscostSharing;
    }

    /**
     * @return IS_SUBMIT_CHAIRMAN
     */
    public String getIsSubmitChairman() {
        return isSubmitChairman;
    }

    /**
     * @param isSubmitChairman
     */
    public void setIsSubmitChairman(String isSubmitChairman) {
        this.isSubmitChairman = isSubmitChairman;
    }

    /**
     * @return IS_LONGTIME_BUSINESS_TRIP
     */
    public String getIsLongtimeBusinessTrip() {
        return isLongtimeBusinessTrip;
    }

    /**
     * @param isLongtimeBusinessTrip
     */
    public void setIsLongtimeBusinessTrip(String isLongtimeBusinessTrip) {
        this.isLongtimeBusinessTrip = isLongtimeBusinessTrip;
    }

    /**
     * @return ACCOUNT_BACK
     */
    public String getAccountBack() {
        return accountBack;
    }

    /**
     * @param accountBack
     */
    public void setAccountBack(String accountBack) {
        this.accountBack = accountBack;
    }

    /**
     * @return PAYMENT_DEADLINE_DAY
     */
    public Date getPaymentDeadlineDay() {
        return paymentDeadlineDay;
    }

    /**
     * @param paymentDeadlineDay
     */
    public void setPaymentDeadlineDay(Date paymentDeadlineDay) {
        this.paymentDeadlineDay = paymentDeadlineDay;
    }

    /**
     * @return INVOICE_TYPE
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * @param invoiceType
     */
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * @return ORIGINAL_INVOICE
     */
    public String getOriginalInvoice() {
        return originalInvoice;
    }

    /**
     * @param originalInvoice
     */
    public void setOriginalInvoice(String originalInvoice) {
        this.originalInvoice = originalInvoice;
    }

    /**
     * @return IS_FOREIGN_CURRENCY_APPLY
     */
    public String getIsForeignCurrencyApply() {
        return isForeignCurrencyApply;
    }

    /**
     * @param isForeignCurrencyApply
     */
    public void setIsForeignCurrencyApply(String isForeignCurrencyApply) {
        this.isForeignCurrencyApply = isForeignCurrencyApply;
    }

    /**
     * @return PROJECT_NO
     */
    public String getProjectNo() {
        return projectNo;
    }

    /**
     * @param projectNo
     */
    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    /**
     * @return SOURCE_CLAIM_NO
     */
    public String getSourceClaimNo() {
        return sourceClaimNo;
    }

    /**
     * @param sourceClaimNo
     */
    public void setSourceClaimNo(String sourceClaimNo) {
        this.sourceClaimNo = sourceClaimNo;
    }

    /**
     * @return SOURCE_CLAIM_ID
     */
    public String getSourceClaimId() {
        return sourceClaimId;
    }

    /**
     * @param sourceClaimId
     */
    public void setSourceClaimId(String sourceClaimId) {
        this.sourceClaimId = sourceClaimId;
    }

    /**
     * @return PMS_INVOICE_TYPE
     */
    public String getPmsInvoiceType() {
        return pmsInvoiceType;
    }

    /**
     * @param pmsInvoiceType
     */
    public void setPmsInvoiceType(String pmsInvoiceType) {
        this.pmsInvoiceType = pmsInvoiceType;
    }

    /**
     * @return OVER_BUDGET_FLAG
     */
    public String getOverBudgetFlag() {
        return overBudgetFlag;
    }

    /**
     * @param overBudgetFlag
     */
    public void setOverBudgetFlag(String overBudgetFlag) {
        this.overBudgetFlag = overBudgetFlag;
    }

    /**
     * @return BILL_SOURCE
     */
    public String getBillSource() {
        return billSource;
    }

    /**
     * @param billSource
     */
    public void setBillSource(String billSource) {
        this.billSource = billSource;
    }

    /**
     * @return SJEKP_NO
     */
    public String getSjekpNo() {
        return sjekpNo;
    }

    /**
     * @param sjekpNo
     */
    public void setSjekpNo(String sjekpNo) {
        this.sjekpNo = sjekpNo;
    }

    /**
     * @return SJEKP_URL
     */
    public String getSjekpUrl() {
        return sjekpUrl;
    }

    /**
     * @param sjekpUrl
     */
    public void setSjekpUrl(String sjekpUrl) {
        this.sjekpUrl = sjekpUrl;
    }

    /**
     * @return SJEKP_DOCSUBJECT
     */
    public String getSjekpDocsubject() {
        return sjekpDocsubject;
    }

    /**
     * @param sjekpDocsubject
     */
    public void setSjekpDocsubject(String sjekpDocsubject) {
        this.sjekpDocsubject = sjekpDocsubject;
    }

    /**
     * @return CONS_NO
     */
    public String getConsNo() {
        return consNo;
    }

    /**
     * @param consNo
     */
    public void setConsNo(String consNo) {
        this.consNo = consNo;
    }

    /**
     * @return REFUND_REQUEST_NO
     */
    public String getRefundRequestNo() {
        return refundRequestNo;
    }

    /**
     * @param refundRequestNo
     */
    public void setRefundRequestNo(String refundRequestNo) {
        this.refundRequestNo = refundRequestNo;
    }

    /**
     * @return TASK_TYPE
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * @param taskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * @return TASK_ID
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * @return REFUND_REQUEST_ID
     */
    public Short getRefundRequestId() {
        return refundRequestId;
    }

    /**
     * @param refundRequestId
     */
    public void setRefundRequestId(Short refundRequestId) {
        this.refundRequestId = refundRequestId;
    }

    /**
     * @return CIS_TFLX
     */
    public String getCisTflx() {
        return cisTflx;
    }

    /**
     * @param cisTflx
     */
    public void setCisTflx(String cisTflx) {
        this.cisTflx = cisTflx;
    }

    /**
     * @return IS_PAY
     */
    public String getIsPay() {
        return isPay;
    }

    /**
     * @param isPay
     */
    public void setIsPay(String isPay) {
        this.isPay = isPay;
    }

    /**
     * @return SJ_VENDOR_NAME_CIS
     */
    public String getSjVendorNameCis() {
        return sjVendorNameCis;
    }

    /**
     * @param sjVendorNameCis
     */
    public void setSjVendorNameCis(String sjVendorNameCis) {
        this.sjVendorNameCis = sjVendorNameCis;
    }

    /**
     * @return SJ_VENDOR_BANK_NAME_CIS
     */
    public String getSjVendorBankNameCis() {
        return sjVendorBankNameCis;
    }

    /**
     * @param sjVendorBankNameCis
     */
    public void setSjVendorBankNameCis(String sjVendorBankNameCis) {
        this.sjVendorBankNameCis = sjVendorBankNameCis;
    }

    /**
     * @return SJ_VENDOR_ACCOUNT_NO_CIS
     */
    public String getSjVendorAccountNoCis() {
        return sjVendorAccountNoCis;
    }

    /**
     * @param sjVendorAccountNoCis
     */
    public void setSjVendorAccountNoCis(String sjVendorAccountNoCis) {
        this.sjVendorAccountNoCis = sjVendorAccountNoCis;
    }

    /**
     * @return IS_COMPLETED_TRANSFER
     */
    public String getIsCompletedTransfer() {
        return isCompletedTransfer;
    }

    /**
     * @param isCompletedTransfer
     */
    public void setIsCompletedTransfer(String isCompletedTransfer) {
        this.isCompletedTransfer = isCompletedTransfer;
    }

    /**
     * @return TOTAL_GROSS_PROFIT_RATE
     */
    public String getTotalGrossProfitRate() {
        return totalGrossProfitRate;
    }

    /**
     * @param totalGrossProfitRate
     */
    public void setTotalGrossProfitRate(String totalGrossProfitRate) {
        this.totalGrossProfitRate = totalGrossProfitRate;
    }

    /**
     * @return CRC_SPVR_RCD
     */
    public BigDecimal getCrcSpvrRcd() {
        return crcSpvrRcd;
    }

    /**
     * @param crcSpvrRcd
     */
    public void setCrcSpvrRcd(BigDecimal crcSpvrRcd) {
        this.crcSpvrRcd = crcSpvrRcd;
    }

    /**
     * @return PROJECT_VALUE
     */
    public String getProjectValue() {
        return projectValue;
    }

    /**
     * @param projectValue
     */
    public void setProjectValue(String projectValue) {
        this.projectValue = projectValue;
    }

    /**
     * @return PROJECT_VALUE_DES
     */
    public String getProjectValueDes() {
        return projectValueDes;
    }

    /**
     * @param projectValueDes
     */
    public void setProjectValueDes(String projectValueDes) {
        this.projectValueDes = projectValueDes;
    }

    /**
     * @return PLAN_COMPLE_TIME
     */
    public Date getPlanCompleTime() {
        return planCompleTime;
    }

    /**
     * @param planCompleTime
     */
    public void setPlanCompleTime(Date planCompleTime) {
        this.planCompleTime = planCompleTime;
    }

    /**
     * @return OA_NO
     */
    public String getOaNo() {
        return oaNo;
    }

    /**
     * @param oaNo
     */
    public void setOaNo(String oaNo) {
        this.oaNo = oaNo;
    }

    /**
     * @return REFUSE_FLAG
     */
    public String getRefuseFlag() {
        return refuseFlag;
    }

    /**
     * @param refuseFlag
     */
    public void setRefuseFlag(String refuseFlag) {
        this.refuseFlag = refuseFlag;
    }

    /**
     * @return IS_EASY_TO_LEVY
     */
    public String getIsEasyToLevy() {
        return isEasyToLevy;
    }

    /**
     * @param isEasyToLevy
     */
    public void setIsEasyToLevy(String isEasyToLevy) {
        this.isEasyToLevy = isEasyToLevy;
    }

    /**
     * @return BACK_DOC_TIME
     */
    public Date getBackDocTime() {
        return backDocTime;
    }

    /**
     * @param backDocTime
     */
    public void setBackDocTime(Date backDocTime) {
        this.backDocTime = backDocTime;
    }

    /**
     * @return COLLECT_DOC_STATE
     */
    public String getCollectDocState() {
        return collectDocState;
    }

    /**
     * @param collectDocState
     */
    public void setCollectDocState(String collectDocState) {
        this.collectDocState = collectDocState;
    }

    /**
     * @return COLLECT_DOC_TIME
     */
    public Date getCollectDocTime() {
        return collectDocTime;
    }

    /**
     * @param collectDocTime
     */
    public void setCollectDocTime(Date collectDocTime) {
        this.collectDocTime = collectDocTime;
    }

    /**
     * @return IMAGE_MODE
     */
    public String getImageMode() {
        return imageMode;
    }

    /**
     * @param imageMode
     */
    public void setImageMode(String imageMode) {
        this.imageMode = imageMode;
    }
}