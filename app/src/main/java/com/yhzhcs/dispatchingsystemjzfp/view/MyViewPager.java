package com.yhzhcs.dispatchingsystemjzfp.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2018/1/26.
 *
 * viewpage 和listview 相互冲突 将父view 传递到viewpage 里面
 *
 * 使用父类的方法 parent.requestDisallowInterceptTouchEvent(true);
 *
 * 当 requestDisallowInterceptTouchEvent 如果为true的时候 表示:父view 不拦截子view的touch 事件
 *
 * 这个方法只是改变flag
 *
 * @author baozi
 *
 */
public class MyViewPager extends ViewPager {
    private ViewGroup parent;

    public MyViewPager(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setNestedpParent(ViewGroup parent) {
        this.parent = parent;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(arg0);
    }

    @Override
    public boolean onTouchEvent(MotionEvent arg0) {
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(arg0);
    }

}
