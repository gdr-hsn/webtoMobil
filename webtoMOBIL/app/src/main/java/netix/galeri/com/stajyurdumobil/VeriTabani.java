package netix.galeri.com.stajyurdumobil;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class VeriTabani extends SQLiteOpenHelper {


    int idBul = 0;
    public static String s1,s2;

    private static final String DATABASE_NAME = "musteriler";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLO_KISILER = "kisiler";


    private static final String ROW_ID = "id";
    private static final String ROW_AD = "ad";
    private static final String ROW_MAIL = "mail";
    private static final String ROW_KULLANICIADI = "kullaniciadi";
    private static final String ROW_SIFRE = "sifre";
    public VeriTabani(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLO_KISILER + "("
                + ROW_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ROW_AD + " TEXT NOT NULL, "
                + ROW_MAIL + " TEXT NOT NULL, "
                + ROW_KULLANICIADI + " TEXT NOT NULL, "
                + ROW_SIFRE + " TEXT NOT NULL)");

    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLO_KISILER);


        onCreate(db);

    }
    public void VeriEkle(String ad, String mail, String kullaniciadi,String sifre){
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues cv = new ContentValues();
            cv.put(ROW_AD, ad);
            cv.put(ROW_MAIL, mail);
            cv.put(ROW_KULLANICIADI, kullaniciadi);
            cv.put(ROW_SIFRE, sifre);
            db.insert(TABLO_KISILER, null,cv);
        }catch (Exception e){
        }
        db.close();
    }

    public List<String> VeriListele(){
        List<String> veriler = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        try {
            String[] stunlar = {ROW_ID,ROW_AD,ROW_MAIL,ROW_KULLANICIADI,ROW_SIFRE};
            Cursor cursor = db.query(TABLO_KISILER, stunlar,"kullaniciadi=? AND sifre=?",null,null,null,null);
            while (cursor.moveToNext()){
                veriler.add(cursor.getString(3)+cursor.getString(4)
                       );

            }
        }catch (Exception e){
        }
        db.close();
        return veriler;


    }

    public boolean checkUser(String kullaniciadi, String sifre) {


        String[] columns = {ROW_KULLANICIADI,ROW_SIFRE};
        SQLiteDatabase db = this.getReadableDatabase();

        String selection = ROW_KULLANICIADI + " = ?" + " AND " + ROW_SIFRE+ " = ?";


        String[] selectionArgs = {kullaniciadi, sifre};


        Cursor cursor = db.query(TABLO_KISILER,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);

        int cursorCount = cursor.getCount();

        cursor.close();
        db.close();
        if (cursorCount > 0) {
            return true;
        }
 return false;

    }


}