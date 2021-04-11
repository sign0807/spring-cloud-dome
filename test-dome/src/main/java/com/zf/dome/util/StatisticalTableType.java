package com.zf.dome.util;

/**
 * @author: 钟凡
 * @program: spring-cloud-dome
 * @description: 仪表盘组件类型
 * @company—date: 利元数据 2021-03-25 17:58
 **/


enum StatisticalTableType {
    /**
     * 指标图
     */
    METRIC_TABLE,
    /**
     * 透视表(明细表同类型)
     */
    PIVOT_TABLE,
    /**
     * 柱形图
     */
    COLUMN_CHART,
    /**
     * 条形图
     */
    BAR_CHART,
    /**
     * 折线图
     */
    LINE_CHART,
    /**
     * 面积图
     */
    AREA_CHART,
    /**
     * 双轴图
     */
    MULTI_AXES_CHART,
    /**
     * 饼图粗圆环
     */
    PIE_CHART,
    /**
     * 雷达图
     */
    RADAR_CHART,
    /**
     * 地图
     */
    MAP_CHART,
    /**
     * 甘特图
     */
    GANTT_CHART,
    /**
     * 数据管理表格
     */
    DATA_MANAGE,
    /**
     * 文本组件
     */
    DESCRIPTION,
    /**
     * 图片组件
     */
    IMAGE,
    /**
     * 筛选组件
     */
    TEXT_FILTER,
    /**
     * 筛选按钮
     */
    FILTER_BTN

    }


