package br.com.roji.rojisushibar.database;

/**
 * Created by Fernando Júnior on 24/09/2015.
 */

import android.content.Context;
import android.database.sqlite.*;

public class DataBase extends SQLiteOpenHelper {
    public DataBase(Context context) {
        super(context, "DELIVERY", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ScriptSQL.getCreateBanco());


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
