package data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import model.Account;

public class DBManager extends SQLiteOpenHelper  {

    public static final String DATABASE_NAME ="account_list";
    private static final String TABLE_NAME ="account";
    private static final String ID ="id";
    private static final String NAME ="name";
    private static final String EMAIL ="email";
    private static final String NUMBER ="number";
    private static final String ADDRESS ="address";
    private static final int VERSION =1;
    private Context context;

    public DBManager( Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlQuery = "CREATE TABLE "+TABLE_NAME +" (" +
                ID +" integer, "+
                NAME + " TEXT, "+
                EMAIL +" TEXT, "+
                NUMBER+" TEXT primary key," +
                ADDRESS +" TEXT)";
        db.execSQL(sqlQuery);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //add account
    public void addAccount(Account account){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NAME, account.getName());
        values.put(NUMBER, account.getPhoneNumber());
        values.put(EMAIL, account.getEmail());
        values.put(ADDRESS, account.getAddress());
        //Neu de null thi khi value bang null thi loi

        db.insert(TABLE_NAME,null,values);

        db.close();
    }
}
