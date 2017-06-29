package com.it.xzr.mothersonhealth.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by GN on 2017/6/28.
 */

public class SQLiteHelper extends SQLiteOpenHelper{
    /**数据库创建的构造方法   数据库名称  grouplist.db , 版本号为1
     * */
    public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "text.db", null, 1);
    }

    /**
     * 初始化数据库的表结构*/
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table bybmjl (id integer primary key autoincrement,VXm varchar(100)),VZjhm varchar(300)," +
                "dtCsrq varchar(300)");

    }

    /**
     * 数据库版本升级时调用*/
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop if table exists bybmjl");
        onCreate(sqLiteDatabase);
    }
}
