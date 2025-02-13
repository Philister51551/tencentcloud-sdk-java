/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskResponseInfo extends AbstractModel{

    /**
    * 任务所属Database的名称。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 任务数据量。
    */
    @SerializedName("DataAmount")
    @Expose
    private Long DataAmount;

    /**
    * 任务Id。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 计算时长，单位： ms。
    */
    @SerializedName("UsedTime")
    @Expose
    private Long UsedTime;

    /**
    * 任务输出路径。
    */
    @SerializedName("OutputPath")
    @Expose
    private String OutputPath;

    /**
    * 任务创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务状态：0 初始化， 1 执行中， 2 执行成功，-1 执行失败，-3 已取消。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 任务SQL类型，DDL|DML等
    */
    @SerializedName("SQLType")
    @Expose
    private String SQLType;

    /**
    * 任务SQL语句
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
    * 结果是否过期。
    */
    @SerializedName("ResultExpired")
    @Expose
    private Boolean ResultExpired;

    /**
    * 数据影响统计信息。
    */
    @SerializedName("RowAffectInfo")
    @Expose
    private String RowAffectInfo;

    /**
    * 任务结果数据表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSet")
    @Expose
    private String DataSet;

    /**
    * 失败信息, 例如：errorMessage。该字段已废弃。
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
    * 任务执行进度num/100(%)
    */
    @SerializedName("Percentage")
    @Expose
    private Long Percentage;

    /**
    * 任务执行输出信息。
    */
    @SerializedName("OutputMessage")
    @Expose
    private String OutputMessage;

    /**
    * 执行SQL的引擎类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务进度明细
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgressDetail")
    @Expose
    private String ProgressDetail;

    /**
     * Get 任务所属Database的名称。 
     * @return DatabaseName 任务所属Database的名称。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 任务所属Database的名称。
     * @param DatabaseName 任务所属Database的名称。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 任务数据量。 
     * @return DataAmount 任务数据量。
     */
    public Long getDataAmount() {
        return this.DataAmount;
    }

    /**
     * Set 任务数据量。
     * @param DataAmount 任务数据量。
     */
    public void setDataAmount(Long DataAmount) {
        this.DataAmount = DataAmount;
    }

    /**
     * Get 任务Id。 
     * @return Id 任务Id。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 任务Id。
     * @param Id 任务Id。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 计算时长，单位： ms。 
     * @return UsedTime 计算时长，单位： ms。
     */
    public Long getUsedTime() {
        return this.UsedTime;
    }

    /**
     * Set 计算时长，单位： ms。
     * @param UsedTime 计算时长，单位： ms。
     */
    public void setUsedTime(Long UsedTime) {
        this.UsedTime = UsedTime;
    }

    /**
     * Get 任务输出路径。 
     * @return OutputPath 任务输出路径。
     */
    public String getOutputPath() {
        return this.OutputPath;
    }

    /**
     * Set 任务输出路径。
     * @param OutputPath 任务输出路径。
     */
    public void setOutputPath(String OutputPath) {
        this.OutputPath = OutputPath;
    }

    /**
     * Get 任务创建时间。 
     * @return CreateTime 任务创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间。
     * @param CreateTime 任务创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务状态：0 初始化， 1 执行中， 2 执行成功，-1 执行失败，-3 已取消。 
     * @return State 任务状态：0 初始化， 1 执行中， 2 执行成功，-1 执行失败，-3 已取消。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 任务状态：0 初始化， 1 执行中， 2 执行成功，-1 执行失败，-3 已取消。
     * @param State 任务状态：0 初始化， 1 执行中， 2 执行成功，-1 执行失败，-3 已取消。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 任务SQL类型，DDL|DML等 
     * @return SQLType 任务SQL类型，DDL|DML等
     */
    public String getSQLType() {
        return this.SQLType;
    }

    /**
     * Set 任务SQL类型，DDL|DML等
     * @param SQLType 任务SQL类型，DDL|DML等
     */
    public void setSQLType(String SQLType) {
        this.SQLType = SQLType;
    }

    /**
     * Get 任务SQL语句 
     * @return SQL 任务SQL语句
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set 任务SQL语句
     * @param SQL 任务SQL语句
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    /**
     * Get 结果是否过期。 
     * @return ResultExpired 结果是否过期。
     */
    public Boolean getResultExpired() {
        return this.ResultExpired;
    }

    /**
     * Set 结果是否过期。
     * @param ResultExpired 结果是否过期。
     */
    public void setResultExpired(Boolean ResultExpired) {
        this.ResultExpired = ResultExpired;
    }

    /**
     * Get 数据影响统计信息。 
     * @return RowAffectInfo 数据影响统计信息。
     */
    public String getRowAffectInfo() {
        return this.RowAffectInfo;
    }

    /**
     * Set 数据影响统计信息。
     * @param RowAffectInfo 数据影响统计信息。
     */
    public void setRowAffectInfo(String RowAffectInfo) {
        this.RowAffectInfo = RowAffectInfo;
    }

    /**
     * Get 任务结果数据表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSet 任务结果数据表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSet() {
        return this.DataSet;
    }

    /**
     * Set 任务结果数据表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSet 任务结果数据表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSet(String DataSet) {
        this.DataSet = DataSet;
    }

    /**
     * Get 失败信息, 例如：errorMessage。该字段已废弃。 
     * @return Error 失败信息, 例如：errorMessage。该字段已废弃。
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set 失败信息, 例如：errorMessage。该字段已废弃。
     * @param Error 失败信息, 例如：errorMessage。该字段已废弃。
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    /**
     * Get 任务执行进度num/100(%) 
     * @return Percentage 任务执行进度num/100(%)
     */
    public Long getPercentage() {
        return this.Percentage;
    }

    /**
     * Set 任务执行进度num/100(%)
     * @param Percentage 任务执行进度num/100(%)
     */
    public void setPercentage(Long Percentage) {
        this.Percentage = Percentage;
    }

    /**
     * Get 任务执行输出信息。 
     * @return OutputMessage 任务执行输出信息。
     */
    public String getOutputMessage() {
        return this.OutputMessage;
    }

    /**
     * Set 任务执行输出信息。
     * @param OutputMessage 任务执行输出信息。
     */
    public void setOutputMessage(String OutputMessage) {
        this.OutputMessage = OutputMessage;
    }

    /**
     * Get 执行SQL的引擎类型 
     * @return TaskType 执行SQL的引擎类型
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 执行SQL的引擎类型
     * @param TaskType 执行SQL的引擎类型
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务进度明细
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgressDetail 任务进度明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProgressDetail() {
        return this.ProgressDetail;
    }

    /**
     * Set 任务进度明细
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgressDetail 任务进度明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgressDetail(String ProgressDetail) {
        this.ProgressDetail = ProgressDetail;
    }

    public TaskResponseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskResponseInfo(TaskResponseInfo source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DataAmount != null) {
            this.DataAmount = new Long(source.DataAmount);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.UsedTime != null) {
            this.UsedTime = new Long(source.UsedTime);
        }
        if (source.OutputPath != null) {
            this.OutputPath = new String(source.OutputPath);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.SQLType != null) {
            this.SQLType = new String(source.SQLType);
        }
        if (source.SQL != null) {
            this.SQL = new String(source.SQL);
        }
        if (source.ResultExpired != null) {
            this.ResultExpired = new Boolean(source.ResultExpired);
        }
        if (source.RowAffectInfo != null) {
            this.RowAffectInfo = new String(source.RowAffectInfo);
        }
        if (source.DataSet != null) {
            this.DataSet = new String(source.DataSet);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
        if (source.Percentage != null) {
            this.Percentage = new Long(source.Percentage);
        }
        if (source.OutputMessage != null) {
            this.OutputMessage = new String(source.OutputMessage);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.ProgressDetail != null) {
            this.ProgressDetail = new String(source.ProgressDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DataAmount", this.DataAmount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "UsedTime", this.UsedTime);
        this.setParamSimple(map, prefix + "OutputPath", this.OutputPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "SQLType", this.SQLType);
        this.setParamSimple(map, prefix + "SQL", this.SQL);
        this.setParamSimple(map, prefix + "ResultExpired", this.ResultExpired);
        this.setParamSimple(map, prefix + "RowAffectInfo", this.RowAffectInfo);
        this.setParamSimple(map, prefix + "DataSet", this.DataSet);
        this.setParamSimple(map, prefix + "Error", this.Error);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);
        this.setParamSimple(map, prefix + "OutputMessage", this.OutputMessage);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProgressDetail", this.ProgressDetail);

    }
}

