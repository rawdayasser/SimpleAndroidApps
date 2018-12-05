package com.example.rawda.socialnetwork.Database;

import android.app.admin.SecurityLog;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.rawda.socialnetwork.Models.Account;
import com.example.rawda.socialnetwork.Models.Message;

import java.util.ArrayList;

public class AccountHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "social_network.db";
    public static final String TABLE_NAME = "Account";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_FIRSTNAME = "firstName";
    public static final String COLUMN_LASTNAME = "lastName";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_PROFILEPHOTO = "profilePhoto";
    public static final String COLUMN_FRIENDID = "friendId";
    /*
    public static final String COLUMN_FRIENDS = "friends";
    public static final String COLUMN_FOLLOWERS = "followers";
    public static final String COLUMN_FOLLOWING = "following";
    public static final String COLUMN_POSTS = "posts";
    public static final String COLUMN_MESSAGES = "messages";
    */
    public AccountHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public AccountHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + COLUMN_ID + " INTEGER PRIMARY KEY, " +
                COLUMN_FIRSTNAME + " TEXT, " + COLUMN_LASTNAME + "TEXT, " + COLUMN_EMAIL + "TEXT, " +
                COLUMN_PASSWORD + " TEXT, " + COLUMN_PROFILEPHOTO + " TEXT," + COLUMN_FRIENDID + " REFERENCES " + COLUMN_ID + ");";
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public boolean add_Account(Account account, int friendId){
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_FIRSTNAME, account.getFirstName());
        contentValues.put(COLUMN_LASTNAME, account.getLastName());
        contentValues.put(COLUMN_EMAIL, account.getEmail());
        contentValues.put(COLUMN_PASSWORD, account.getPassword());
        contentValues.put(COLUMN_PROFILEPHOTO, account.getProfilePhoto());
        contentValues.put(COLUMN_FRIENDID, friendId);
        SQLiteDatabase db = this.getWritableDatabase();
        long numOfRows = db.insert(TABLE_NAME, null, contentValues);
        if (numOfRows > 0) return true;
        return false;
    }
    public boolean update_account(Account account, int friendId){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "UPDATE " + TABLE_NAME  + " SET " + COLUMN_FIRSTNAME + " = " + account.getFirstName() + ", " +
                COLUMN_LASTNAME + " = " + account.getLastName() + ", " + COLUMN_EMAIL + " = " + account.getEmail() + ", " +
                COLUMN_PASSWORD + " = " + account.getPassword() + ", " + COLUMN_PROFILEPHOTO + " = " + account.getProfilePhoto() + ", " +
                COLUMN_FRIENDID + friendId + ";";
        Cursor cursor = db.rawQuery(query, null);
        if (cursor != null) return true;
        return false;
    }

    @Override
    public String toString() {
        return "AccountHandler{}";
    }
}
