package com.tencentcloudapi.dcdb.v20180411;
public enum DcdbErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 实例安全组信息添加失败。
     FAILEDOPERATION_ADDINSTANCEINFOFAILED("FailedOperation.AddInstanceInfoFailed"),
     
    // 绑定安全组失败。
     FAILEDOPERATION_ASSOCIATESECURITYGROUPSFAILED("FailedOperation.AssociateSecurityGroupsFailed"),
     
    // 鉴权失败。
     FAILEDOPERATION_AUTHNOSTRATEGY("FailedOperation.AuthNoStrategy"),
     
    // 实例安全组信息清除失败。
     FAILEDOPERATION_CLEARINSTANCEINFOFAILED("FailedOperation.ClearInstanceInfoFailed"),
     
    // 复制账号权限出错。
     FAILEDOPERATION_COPYRIGHTERROR("FailedOperation.CopyRightError"),
     
    // 创建流程失败。
     FAILEDOPERATION_CREATEFLOWFAILED("FailedOperation.CreateFlowFailed"),
     
    // 创建订单失败。
     FAILEDOPERATION_CREATEORDERFAILED("FailedOperation.CreateOrderFailed"),
     
    // 创建账号失败。
     FAILEDOPERATION_CREATEUSERFAILED("FailedOperation.CreateUserFailed"),
     
    // 删除账号失败。
     FAILEDOPERATION_DELETEUSERFAILED("FailedOperation.DeleteUserFailed"),
     
    // 解绑安全组失败。
     FAILEDOPERATION_DISASSOCIATESECURITYGROUPSFAILED("FailedOperation.DisassociateSecurityGroupsFailed"),
     
    // 修改账号权限失败。
     FAILEDOPERATION_MODIFYRIGHTFAILED("FailedOperation.ModifyRightFailed"),
     
    // 消息队列操作失败。
     FAILEDOPERATION_MSGQUEUEOPERATIONFAILED("FailedOperation.MsgQueueOperationFailed"),
     
    // 请求后端接口失败。
     FAILEDOPERATION_OSSOPERATIONFAILED("FailedOperation.OssOperationFailed"),
     
    // 支付订单失败。
     FAILEDOPERATION_PAYFAILED("FailedOperation.PayFailed"),
     
    // 重置账号密码失败。
     FAILEDOPERATION_RESETPASSWORDFAILED("FailedOperation.ResetPasswordFailed"),
     
    // 设置规则失败。
     FAILEDOPERATION_SETRULELOCATIONFAILED("FailedOperation.SetRuleLocationFailed"),
     
    // 标签键值校验或鉴权失败。
     FAILEDOPERATION_TAGDRYRUNERROR("FailedOperation.TagDryRunError"),
     
    // 实例安全组信息更新失败。
     FAILEDOPERATION_UPDATEINSTANCEINFOFAILED("FailedOperation.UpdateInstanceInfoFailed"),
     
    // VPC更新路由失败。
     FAILEDOPERATION_VPCUPDATEROUTEFAILED("FailedOperation.VpcUpdateRouteFailed"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // CAM鉴权请求失败。
     INTERNALERROR_CAMAUTHFAILED("InternalError.CamAuthFailed"),
     
    // 校验VIP状态失败。
     INTERNALERROR_CHECKVIPSTATUSFAILED("InternalError.CheckVipStatusFailed"),
     
    // COS地址配置错误。
     INTERNALERROR_COSCONFIGURATION("InternalError.CosConfiguration"),
     
    // 备份文件签名失败。
     INTERNALERROR_COSSIGNURL("InternalError.CosSignUrl"),
     
    // DB影响行数为0错误。
     INTERNALERROR_DBROWSAFFECTEDERROR("InternalError.DBRowsAffectedError"),
     
    // 查询数据库失败。
     INTERNALERROR_DBOPERATIONFAILED("InternalError.DbOperationFailed"),
     
    // 查询独享集群信息失败。
     INTERNALERROR_FENCEERROR("InternalError.FenceError"),
     
    // 获取数据库实例参数失败。
     INTERNALERROR_GETDBCONFIGFAILED("InternalError.GetDbConfigFailed"),
     
    // 获取数据库列表失败。
     INTERNALERROR_GETDBLISTFAILED("InternalError.GetDbListFailed"),
     
    // 获取数据库对象失败。
     INTERNALERROR_GETDBOBJECTFAILED("InternalError.GetDbObjectFailed"),
     
    // 获取实例详情失败。
     INTERNALERROR_GETINSTANCEDETAILFAILED("InternalError.GetInstanceDetailFailed"),
     
    // 获取实例信息失败。
     INTERNALERROR_GETINSTANCEINFOFAILED("InternalError.GetInstanceInfoFailed"),
     
    // 获取账号当前权限失败。
     INTERNALERROR_GETRIGHTFAILED("InternalError.GetRightFailed"),
     
    // 拉圈安全组详情失败。
     INTERNALERROR_GETSECURITYGROUPDETAILFAILED("InternalError.GetSecurityGroupDetailFailed"),
     
    // 查询虚拟私有网络子网信息失败。
     INTERNALERROR_GETSUBNETFAILED("InternalError.GetSubnetFailed"),
     
    // 获取表信息失败。
     INTERNALERROR_GETTABLEINFOFAILED("InternalError.GetTableInfoFailed"),
     
    // 获取账号列表失败。
     INTERNALERROR_GETUSERLISTFAILED("InternalError.GetUserListFailed"),
     
    // 获取用户安全组配额失败。
     INTERNALERROR_GETUSGQUOTAERROR("InternalError.GetUsgQuotaError"),
     
    // 查询虚拟私有网络信息失败。
     INTERNALERROR_GETVPCFAILED("InternalError.GetVpcFailed"),
     
    // 内部系统错误。
     INTERNALERROR_INNERSYSTEMERROR("InternalError.InnerSystemError"),
     
    // 数据库插入失败。
     INTERNALERROR_INSERTFAIL("InternalError.InsertFail"),
     
    // 用户对当前实例无操作权限。
     INTERNALERROR_INSTANCEOPERATEPERMISSIONERROR("InternalError.InstanceOperatePermissionError"),
     
    // 单实例绑定安全组数量超限。
     INTERNALERROR_INSTANCESGOVERLIMITERROR("InternalError.InstanceSGOverLimitError"),
     
    // 查询实例时返回的资源数量与请求不匹配。
     INTERNALERROR_LISTINSTANCERESPRESOURCECOUNTNOTMATCHERROR("InternalError.ListInstanceRespResourceCountNotMatchError"),
     
    // 查询实例错误。
     INTERNALERROR_LISTINSTANCESERROR("InternalError.ListInstancesError"),
     
    // 拉取项目列表失败。
     INTERNALERROR_LISTPROJECTFAILED("InternalError.ListProjectFailed"),
     
    // 数据库操作失败。
     INTERNALERROR_OPERATEDATABASEFAILED("InternalError.OperateDatabaseFailed"),
     
    // 操作读DB数据错误。
     INTERNALERROR_QUERYDATABASEFAILED("InternalError.QueryDatabaseFailed"),
     
    // 查询订单信息失败。
     INTERNALERROR_QUERYORDERFAILED("InternalError.QueryOrderFailed"),
     
    // 查询价格失败。
     INTERNALERROR_QUERYPRICEFAILED("InternalError.QueryPriceFailed"),
     
    // 操作读DB数据错误。
     INTERNALERROR_READDATABASEFAILED("InternalError.ReadDatabaseFailed"),
     
    // 路由未发现。
     INTERNALERROR_ROUTENOTFOUND("InternalError.RouteNotFound"),
     
    // 资源安全组策略下发错误。
     INTERNALERROR_SETSVCLOCATIONFAILED("InternalError.SetSvcLocationFailed"),
     
    // 数据库更新失败。
     INTERNALERROR_UPDATEDATABASEFAILED("InternalError.UpdateDatabaseFailed"),
     
    // 外网操作失败。
     INTERNALERROR_WANSERVICEFAILED("InternalError.WanServiceFailed"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 密码包含了非法字符。
     INVALIDPARAMETER_CHARACTERERROR("InvalidParameter.CharacterError"),
     
    // 入参校验失败。
     INVALIDPARAMETER_CHECKPARAMNOTPASS("InvalidParameter.CheckParamNotPass"),
     
    // 未指定需要查询的订单ID。
     INVALIDPARAMETER_DEALNAMENOTGIVEN("InvalidParameter.DealNameNotGiven"),
     
    // 找不到指定的流程信息。
     INVALIDPARAMETER_FLOWNOTFOUND("InvalidParameter.FlowNotFound"),
     
    // 参数合法性校验错误。
     INVALIDPARAMETER_GENERICPARAMETERERROR("InvalidParameter.GenericParameterError"),
     
    // 非法参数。
     INVALIDPARAMETER_ILLEGALPARAMETERERROR("InvalidParameter.IllegalParameterError"),
     
    // 未找到请求的实例。
     INVALIDPARAMETER_INSTANCENOTFOUND("InvalidParameter.InstanceNotFound"),
     
    // 该接口不支持此付费类型的实例。
     INVALIDPARAMETER_NOTSUPPORTEDPAYMODE("InvalidParameter.NotSupportedPayMode"),
     
    // 没有权限操作该接口或资源。
     INVALIDPARAMETER_PERMISSIONDENIED("InvalidParameter.PermissionDenied"),
     
    // 安全组合法性校验不通过。
     INVALIDPARAMETER_SGCHECKFAIL("InvalidParameter.SGCheckFail"),
     
    // 找不到对应的售卖规格。
     INVALIDPARAMETER_SPECNOTFOUND("InvalidParameter.SpecNotFound"),
     
    // 找不到指定的虚拟私有网络子网。
     INVALIDPARAMETER_SUBNETNOTFOUND("InvalidParameter.SubnetNotFound"),
     
    // snat子网不支持申请IP。
     INVALIDPARAMETER_SUBNETUNAVAILABLE("InvalidParameter.SubnetUnavailable"),
     
    // 找不到指定的虚拟私有网络。
     INVALIDPARAMETER_VPCNOTFOUND("InvalidParameter.VpcNotFound"),
     
    // 想要创建的账号已经存在。
     INVALIDPARAMETERVALUE_ACCOUNTALREADYEXISTS("InvalidParameterValue.AccountAlreadyExists"),
     
    // 该实例不支持此同步模式。
     INVALIDPARAMETERVALUE_BADSYNCMODE("InvalidParameterValue.BadSyncMode"),
     
    // 指定的权限无法赋予给该账号。
     INVALIDPARAMETERVALUE_BADUSERRIGHT("InvalidParameterValue.BadUserRight"),
     
    // 账号类型不正确。
     INVALIDPARAMETERVALUE_BADUSERTYPE("InvalidParameterValue.BadUserType"),
     
    // 找不到数据库实例所属的独享集群。
     INVALIDPARAMETERVALUE_ILLEGALEXCLUSTERID("InvalidParameterValue.IllegalExclusterID"),
     
    // 初始化数据库实例参数错误。
     INVALIDPARAMETERVALUE_ILLEGALINITPARAM("InvalidParameterValue.IllegalInitParam"),
     
    // 商品数量超出限制。
     INVALIDPARAMETERVALUE_ILLEGALQUANTITY("InvalidParameterValue.IllegalQuantity"),
     
    // 权限参数不正确。
     INVALIDPARAMETERVALUE_ILLEGALRIGHTPARAM("InvalidParameterValue.IllegalRightParam"),
     
    // 找不到指定的可用区。
     INVALIDPARAMETERVALUE_ILLEGALZONE("InvalidParameterValue.IllegalZone"),
     
    // 分片不存在。
     INVALIDPARAMETERVALUE_SHARDNOTEXIST("InvalidParameterValue.ShardNotExist"),
     
    // 找不到数据库实例对应的规格信息。
     INVALIDPARAMETERVALUE_SPECIDILLEGAL("InvalidParameterValue.SpecIdIllegal"),
     
    // 系统用户不允许操作。
     INVALIDPARAMETERVALUE_SUPERUSERFORBIDDEN("InvalidParameterValue.SuperUserForbidden"),
     
    // 请求过于频繁。
     LIMITEXCEEDED_TOOFREQUENTLYCALLED("LimitExceeded.TooFrequentlyCalled"),
     
    // 指定的账号不存在。
     RESOURCENOTFOUND_ACCOUNTDOESNOTEXIST("ResourceNotFound.AccountDoesNotExist"),
     
    // 实例不存在。
     RESOURCENOTFOUND_INSTANCENOTFOUND("ResourceNotFound.InstanceNotFound"),
     
    // 找不到指定的数据库实例。
     RESOURCENOTFOUND_NOINSTANCEFOUND("ResourceNotFound.NoInstanceFound"),
     
    // 接入安全组产品配置不存在。
     RESOURCENOTFOUND_PRODUCTCONFIGNOTEXISTEDERROR("ResourceNotFound.ProductConfigNotExistedError"),
     
    // 实例状态错误，不能初始化。
     RESOURCEUNAVAILABLE_BADINSTANCESTATUS("ResourceUnavailable.BadInstanceStatus"),
     
    // COS API调用错误。
     RESOURCEUNAVAILABLE_COSAPIFAILED("ResourceUnavailable.CosApiFailed"),
     
    // 独享集群状态异常。
     RESOURCEUNAVAILABLE_EXCLUSTERSTATUSABNORMAL("ResourceUnavailable.ExclusterStatusAbnormal"),
     
    // 数据库实例已被删除。
     RESOURCEUNAVAILABLE_INSTANCEALREADYDELETED("ResourceUnavailable.InstanceAlreadyDeleted"),
     
    // 数据库实例已经被锁定，当前无法操作。
     RESOURCEUNAVAILABLE_INSTANCEHASBEENLOCKED("ResourceUnavailable.InstanceHasBeenLocked"),
     
    // 数据库实例状态不正确，当前无法操作。
     RESOURCEUNAVAILABLE_INSTANCESTATUSABNORMAL("ResourceUnavailable.InstanceStatusAbnormal"),
     
    // 没有权限操作该接口或资源。
     UNAUTHORIZEDOPERATION_PERMISSIONDENIED("UnauthorizedOperation.PermissionDenied"),
     
    // 不支持的无效操作。
     UNSUPPORTEDOPERATION_INVALIDOPERATION("UnsupportedOperation.InvalidOperation"),
     
    // Proxy软件版本太旧，请联系客服升级到新版本后再试。
     UNSUPPORTEDOPERATION_OLDPROXYVERSION("UnsupportedOperation.OldProxyVersion");
     
    private String value;
    private DcdbErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

