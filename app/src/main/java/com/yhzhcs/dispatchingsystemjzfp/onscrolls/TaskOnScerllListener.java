package com.yhzhcs.dispatchingsystemjzfp.onscrolls;

import android.os.Handler;
import android.view.View;
import android.widget.AbsListView;

import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest.HttpMethod;
import com.yhzhcs.dispatchingsystemjzfp.bean.TaskBeans;
import com.yhzhcs.dispatchingsystemjzfp.bean.Tasklists;
import com.yhzhcs.dispatchingsystemjzfp.utils.Constant;
import com.yhzhcs.dispatchingsystemjzfp.utils.LogUtil;

import java.util.List;

/**
 * Created by Administrator on 2018/1/26.
 */

public class TaskOnScerllListener implements AbsListView.OnScrollListener {

    //ListView总共显示多少条
    private int totalItemCount;

    //ListView最后的item项
    private int lastItem;

    //用于判断当前是否在加载
    private boolean isLoading;

    //底部加载更多布局
    private View footer;

    private String missionId;

    //接口回调的实例
    private OnloadDataListener listener;

    //数据
    private List<Tasklists> data;

    public TaskOnScerllListener(View footer, String missionId) {
        this.footer = footer;
        this.missionId = missionId;
    }

    //设置接口回调的实例
    public void setOnLoadDataListener(OnloadDataListener listener) {
        this.listener = listener;
    }

    /**
     * 滑动状态变化
     *
     * @param view
     * @param scrollState 1 SCROLL_STATE_TOUCH_SCROLL是拖动   2 SCROLL_STATE_FLING是惯性滑动  0SCROLL_STATE_IDLE是停止 , 只有当在不同状态间切换的时候才会执行
     */
    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        //如果数据没有加载，并且滑动状态是停止的，而且到达了最后一个item项
        if (!isLoading && lastItem == totalItemCount && scrollState == SCROLL_STATE_IDLE) {
            //显示加载更多
            footer.setVisibility(View.VISIBLE);
            //开始加载更多数据
            loadMoreData();
        }
    }


    /**
     * 当加载数据完成后，设置加载标志为false表示没有加载数据了
     * 并且设置底部加载更多为隐藏
     */
    private void loadComplete() {
        isLoading = false;
        footer.setVisibility(View.GONE);

    }

    /**
     * 开始加载更多新数据，这里每次只更新三条数据
     */
    private void loadMoreData() {
        isLoading = true;
        HttpUtils httpUtils = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("missionId", missionId);
        httpUtils.send(HttpMethod.POST, Constant.URL_TASK, params, new RequestCallBack<String>() {
            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {
                LogUtil.v("TASK_HTTP", "onSuccess" + responseInfo.result.toString());
                String body = responseInfo.result;
                Gson gson = new Gson();
                TaskBeans taskBeans = gson.fromJson(body, TaskBeans.class);
                data = taskBeans.getTaskLists();
            }

            @Override
            public void onFailure(HttpException e, String s) {
                LogUtil.v("TASK_HTTP", "onFailure" + s);
            }

            @Override
            public void onLoading(long total, long current, boolean isUploading) {

                Handler handler = new Handler();

                //模拟一个延迟3秒的刷新功能
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (listener != null) {
                            //回调设置ListView的数据
                            //listener.onLoadData(data);
                            //加载完成后操作什么
                            loadComplete();
                        }
                    }
                }, 3000);
            }
        });
    }

    /**
     * 监听可见界面的情况
     *
     * @param view             ListView
     * @param firstVisibleItem 第一个可见的 item 的索引
     * @param visibleItemCount 可以显示的 item的条数
     * @param totalItemCount   总共有多少个 item
     */
    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        //当可见界面的第一个item  +  当前界面多有可见的界面个数就可以得到最后一个item项了
        lastItem = firstVisibleItem + visibleItemCount;

        //总listView的item个数
        this.totalItemCount = totalItemCount;
        if (firstVisibleItem >= lastItem) {
//            spinner.setVisibility(View.VISIBLE);
        } else {
//            spinner.setVisibility(View.GONE);
        }
    }

    //回调接口
    public interface OnloadDataListener {
        void onLoadData(List<Tasklists> data);
    }


}
