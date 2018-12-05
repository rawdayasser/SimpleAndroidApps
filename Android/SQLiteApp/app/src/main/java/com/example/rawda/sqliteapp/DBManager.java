package com.example.rawda.sqliteapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;


public class DBManager {
    private DatabaseHelper dbHelper;
    private Context context;
    private SQLiteDatabase sqLiteDatabase;

    public DBManager(Context context) {
        this.context = context;
    }

    public DBManager open() throws SQLException{
        dbHelper = new DatabaseHelper(context);
        sqLiteDatabase = dbHelper.getWritableDatabase();
        return  this;
    }

    public void close(){
        dbHelper.close();
    }

    public void insert(String name, String desc){
        ContentValues contentValue = new ContentValues();
        contentValue.put(DatabaseHelper.SUBJECT, name);
        contentValue.put(DatabaseHelper.DESC, desc);
        sqLiteDatabase.insert(DatabaseHelper.TABLE_NAME, null, contentValue);
    }
    public Cursor fetch(){
        String[] columns = {DatabaseHelper._ID, DatabaseHelper.SUBJECT, DatabaseHelper.DESC};
        Cursor cursor = sqLiteDatabase.query(DatabaseHelper.TABLE_NAME, columns, null, null, null, null,
                null);
        if (cursor != null){
            cursor.moveToNext();
        }
        return cursor;
    }
    public int update(long _id, String name, String desc){
        ContentValues contentValue = new ContentValues();
        contentValue.put(DatabaseHelper.SUBJECT, name);
        contentValue.put(DatabaseHelper.DESC, desc);
        int numOfRows = sqLiteDatabase.update(DatabaseHelper.TABLE_NAME, contentValue,  DatabaseHelper._ID + " = " + _id, null);
        return numOfRows;
    }

    public void delete(long _id){
        sqLiteDatabase.delete(DatabaseHelper.TABLE_NAME, DatabaseHelper._ID + " = " + _id, null);

    }

}
