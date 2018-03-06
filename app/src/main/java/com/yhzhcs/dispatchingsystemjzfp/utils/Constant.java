package com.yhzhcs.dispatchingsystemjzfp.utils;

/**
 * @Description 常量配置
 */

public class Constant {

    public static final String LOG_TAG = "logTag";

    public static final String URL_TITLE = "http://192.168.2.116:8080/cathy/appController/";

    /**
     * 查询新闻动态、政策数据
     * POST提交：分页参数 pageNow 当页最大值 pageSize
     */
    public static final String URL_NEWS = URL_TITLE + "findfpzc";

    /**
     * 查询 动态详情、政策详情
     * POST提交 信息类型 massageType 信息ID id
     */
    public static final String URL_NEWS_DETAILS = URL_TITLE + "findfpzcByIdAndType";

    /**
     * GET查询新闻资讯（政策、动态、农产品）
     */
    public static final String URL_NEWS_INFORMATION = URL_TITLE + "findXwzxByIdAndType";

    /**
     * 查询帮扶任务
     * POST提交 帮扶责任人ID missionId
     */
    public static final String URL_TASK = URL_TITLE + "findMissTaskByMissId";

    /**
     * 查询贫困户信息
     * POST提交 贫困户ID poorHouseId
     */
    public static final String URL_POOR_MASSAGE = URL_TITLE + "findfpById";

    /**
     * 查询贫困户列表
     * POST提交 帮扶责任人ID missionId
     */
    public static final String URL_POOR_LIST = URL_TITLE + "findPoorHouseByMissId";

    /**
     * 查询(贫困户基本信息、生活条件信息)
     * POST提交 贫困户ID poorHouseId
     */
    public static final String URL_POOR_DETAILS = URL_TITLE + "findPoorBaseInfo";

    /**
     * 查询家庭成员信息
     * POST提交 平困户ID poorHouseId
     */
    public static final String URL_POOR_FAMILY = URL_TITLE + "findFamilyList";

    /**
     * 查询贫困户收入信息
     * 提交 贫困户ID poorHouseId
     */
    public static final String URL_POOR_INCOME = URL_TITLE + "findPersonalIncome";

    /**
     * 查询贫困户帮扶图片
     * POST提交 贫困户ID entityId = poorHouseId
     */
    public static final String URL_POOR_IMG = URL_TITLE + "findPictureInfo";

    /**
     * 用户登入
     * POST提交 用户名 username 密码 password
     **/
    public static final String URL_USER_LOGIN = URL_TITLE + "userLogin";

    /**
     * 个人中心
     * POST提交 帮扶责任人ID missionId
     */
    public static final String URL_USER_INFO = URL_TITLE + "findMissById";

    /**
     * 农产品
     * POST提交 分页参数 pageNow 当页最大值 pageSize
     */
    public static final String URL_PRIMARY_PRODUCTS = URL_TITLE + "findProduce";

    /**
     * 农产品详情
     * POST提交 提交农产品ID
     */
    public static final String URL_PRIMARY_PRODUCTS_DETAILS = URL_TITLE + "findProduceById";

    /**
     * 讨论区
     * GET提交
     */
    public static final String URL_FORUM = URL_TITLE + "getTopicJson";

    /**
     * 移除贫困户信息
     * POST提交 帮扶责任人ID missionId 与 贫困户ID poorIds
     */
    public static final String URL_REMOVE_POOR = URL_TITLE + "removePoorHouse";

}