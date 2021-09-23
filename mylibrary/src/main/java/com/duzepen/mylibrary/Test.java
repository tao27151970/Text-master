package com.duzepen.mylibrary;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * 项目名称：Text
 * 类描述：
 * 创建人：tao
 * 创建时间：2019/8/1220:22
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class Test {
    public static double addition(double addnum1,double addnum2){
        return addnum1 + addnum2;
    }
    public static void showLog(){
        Log.e("mylibrary","tao tao is good boy");
    }
    public static void showToast(Context mContext){
        Toast.makeText(mContext,"tao tao is good boy",Toast.LENGTH_LONG).show();
    }
}
