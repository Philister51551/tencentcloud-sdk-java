package com.tencentcloudapi.ccc.v20200210;
public enum CccErrorCode {
    // 重复账号。
     FAILEDOPERATION_DUPLICATEDACCOUNT("FailedOperation.DuplicatedAccount"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 内部数据库访问失败。
     INTERNALERROR_DBERROR("InternalError.DBError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 实例不存在。
     INVALIDPARAMETER_INSTANCENOTEXIST("InvalidParameter.InstanceNotExist"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 账号不存在。
     INVALIDPARAMETERVALUE_ACCOUNTNOTEXIST("InvalidParameterValue.AccountNotExist"),
     
    // 实例不存在。
     INVALIDPARAMETERVALUE_INSTANCENOTEXIST("InvalidParameterValue.InstanceNotExist"),
     
    // 查询记录不存在。
     INVALIDPARAMETERVALUE_RECORDNOTEXIST("InvalidParameterValue.RecordNotExist"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 超出数量限制。
     LIMITEXCEEDED_OUTOFCOUNTLIMIT("LimitExceeded.OutOfCountLimit"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter");
     
    private String value;
    private CccErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

