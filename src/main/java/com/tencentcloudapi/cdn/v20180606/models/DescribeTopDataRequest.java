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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopDataRequest extends AbstractModel{

    /**
    * 查询起始日期：yyyy-MM-dd HH:mm:ss
当前仅支持按天粒度的数据查询，参数需为某天的起点时刻
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询起始日期：yyyy-MM-dd HH:mm:ss
当前仅支持按天粒度的数据查询，参数需为某天的结束时刻
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 排序对象，支持以下几种形式：
ip、ua_device、ua_browser、ua_os、referer
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 排序使用的指标名称：
flux：Metric 为 host 时指代访问流量
request：Metric 为 host 时指代访问请求数
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 指定查询域名列表，最多可一次性查询 30 个加速域名明细
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
    */
    @SerializedName("Project")
    @Expose
    private Long Project;

    /**
    * 是否详细显示每个域名的的具体数值
    */
    @SerializedName("Detail")
    @Expose
    private Boolean Detail;

    /**
    * 地域，目前可不填，默认是大陆
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 产品名，目前仅可使用cdn
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 查询起始日期：yyyy-MM-dd HH:mm:ss
当前仅支持按天粒度的数据查询，参数需为某天的起点时刻 
     * @return StartTime 查询起始日期：yyyy-MM-dd HH:mm:ss
当前仅支持按天粒度的数据查询，参数需为某天的起点时刻
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始日期：yyyy-MM-dd HH:mm:ss
当前仅支持按天粒度的数据查询，参数需为某天的起点时刻
     * @param StartTime 查询起始日期：yyyy-MM-dd HH:mm:ss
当前仅支持按天粒度的数据查询，参数需为某天的起点时刻
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询起始日期：yyyy-MM-dd HH:mm:ss
当前仅支持按天粒度的数据查询，参数需为某天的结束时刻 
     * @return EndTime 查询起始日期：yyyy-MM-dd HH:mm:ss
当前仅支持按天粒度的数据查询，参数需为某天的结束时刻
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询起始日期：yyyy-MM-dd HH:mm:ss
当前仅支持按天粒度的数据查询，参数需为某天的结束时刻
     * @param EndTime 查询起始日期：yyyy-MM-dd HH:mm:ss
当前仅支持按天粒度的数据查询，参数需为某天的结束时刻
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 排序对象，支持以下几种形式：
ip、ua_device、ua_browser、ua_os、referer 
     * @return Metric 排序对象，支持以下几种形式：
ip、ua_device、ua_browser、ua_os、referer
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 排序对象，支持以下几种形式：
ip、ua_device、ua_browser、ua_os、referer
     * @param Metric 排序对象，支持以下几种形式：
ip、ua_device、ua_browser、ua_os、referer
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 排序使用的指标名称：
flux：Metric 为 host 时指代访问流量
request：Metric 为 host 时指代访问请求数 
     * @return Filter 排序使用的指标名称：
flux：Metric 为 host 时指代访问流量
request：Metric 为 host 时指代访问请求数
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 排序使用的指标名称：
flux：Metric 为 host 时指代访问流量
request：Metric 为 host 时指代访问请求数
     * @param Filter 排序使用的指标名称：
flux：Metric 为 host 时指代访问流量
request：Metric 为 host 时指代访问请求数
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 指定查询域名列表，最多可一次性查询 30 个加速域名明细 
     * @return Domains 指定查询域名列表，最多可一次性查询 30 个加速域名明细
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 指定查询域名列表，最多可一次性查询 30 个加速域名明细
     * @param Domains 指定查询域名列表，最多可一次性查询 30 个加速域名明细
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主 
     * @return Project 未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
     */
    public Long getProject() {
        return this.Project;
    }

    /**
     * Set 未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
     * @param Project 未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
     */
    public void setProject(Long Project) {
        this.Project = Project;
    }

    /**
     * Get 是否详细显示每个域名的的具体数值 
     * @return Detail 是否详细显示每个域名的的具体数值
     */
    public Boolean getDetail() {
        return this.Detail;
    }

    /**
     * Set 是否详细显示每个域名的的具体数值
     * @param Detail 是否详细显示每个域名的的具体数值
     */
    public void setDetail(Boolean Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 地域，目前可不填，默认是大陆 
     * @return Area 地域，目前可不填，默认是大陆
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域，目前可不填，默认是大陆
     * @param Area 地域，目前可不填，默认是大陆
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 产品名，目前仅可使用cdn 
     * @return Product 产品名，目前仅可使用cdn
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 产品名，目前仅可使用cdn
     * @param Product 产品名，目前仅可使用cdn
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeTopDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopDataRequest(DescribeTopDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Project != null) {
            this.Project = new Long(source.Project);
        }
        if (source.Detail != null) {
            this.Detail = new Boolean(source.Detail);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Project", this.Project);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

