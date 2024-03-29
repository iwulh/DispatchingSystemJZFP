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
import com.yhzhcs.dispatchingsystemjzfp.bean.Datas;
import com.yhzhcs.dispatchingsystemjzfp.bean.ProBean;
import com.yhzhcs.dispatchingsystemjzfp.utils.Constant;
import com.yhzhcs.dispatchingsystemjzfp.utils.LogUtil;

import java.util.List;


/**
 * Created by Administrator on 2018/1/17.
 */

public class ProOnScerllListener implements AbsListView.OnScrollListener {

    //ListView总共显示多少条
    private int totalItemCount;

    //ListView最后的item项
    private int lastItem;

    //用于判断当前是否在加载
    private boolean isLoading;

    //底部加载更多布局
    private View footer;

    //接口回调的实例
    private OnloadDataListener listener;

    //数据
    private List<Datas> data;
    private int index = 1;

    public ProOnScerllListener(View footer) {
        this.footer = footer;
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
     * 开始加载更多新数据，这里每次只更新4条数据
     */
    private void loadMoreData() {
        isLoading = true;
        index++;
        RequestParams params = new RequestParams();
        params.addBodyParameter("pageNow", Integer.toString(index));
        LogUtil.v("hhhhhhhhhh","k=========>>>"+index);
        params.addBodyParameter("pageSize", "5");
        HttpUtils httpUtils = new HttpUtils();
        httpUtils.send(HttpMethod.POST, Constant.URL_PRIMARY_PRODUCTS, params, new RequestCallBack<String>() {
            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {
                LogUtil.v("CESHITAG", "onSuccess===>>>" + responseInfo.result.toString());
                final String body = responseInfo.result;
                //开始加载更多数据
                Gson gosn = new Gson();
                ProBean proBean = gosn.fromJson(body, ProBean.class);
                data = proBean.getDatas();
                LogUtil.i("MAINDATA", "MAINDATA====>>>" + proBean.toString());
            }

            @Override
            public void onFailure(HttpException e, String s) {
                LogUtil.v("CESHITAG", "onFailure===>>>" + s);
            }

            @Override
            public void onLoading(long total, long current, boolean isUploading) {
//                super.onLoading(total, current, isUploading);
                LogUtil.i("ONLOADINGTAG","ONtotal："+total+"______ONcurrent："+current);
                Handler handler = new Handler();
                //模拟一个延迟3秒的刷新功能
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (listener != null) {
                            //回调设置ListView的数据
                            listener.onLoadData(data);
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
        } else {
        }

    }

    //回调接口
    public interface OnloadDataListener {
        void onLoadData(List<Datas> data);
    }
}
