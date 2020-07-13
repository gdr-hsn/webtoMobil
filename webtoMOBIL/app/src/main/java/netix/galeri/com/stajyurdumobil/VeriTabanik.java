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

public class VeriTabanik extends SQLiteOpenHelper {


    int idBulk = 0;
    public static String s1k,s2k;

    private static final String DATABASE_NAME = "musterilerk";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLO_KISILER = "kisilerk";


    private static final String ROW_ID = "id";

    private static final String ROW_ADAY = "aday";
    private static final String ROW_FIRMA= "firma";
    private static final String ROW_ILAN= "ilan";
    private static final String ROW_HATIRLA = "hatirla";
    public VeriTabanik(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLO_KISILER + "("
                + ROW_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ROW_ADAY + " TEXT NOT NULL, "
                + ROW_FIRMA + " TEXT NOT NULL, "
                + ROW_ILAN + " TEXT NOT NULL, "
                + ROW_HATIRLA + " TEXT NOT NULL)");

    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLO_KISILER);


        onCreate(db);

    }
    public void VeriEklek(String aday, String firma, String ilan,String hatirla){
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues cv = new ContentValues();
            cv.put(ROW_ADAY, aday);
            cv.put(ROW_FIRMA, firma);
            cv.put(ROW_ILAN, ilan);
            cv.put(ROW_HATIRLA, hatirla);
            db.insert(TABLO_KISILER, null,cv);
        }catch (Exception e){
        }
        db.close();
    }

    public List<String> VeriListelek(){
        List<String> verilerk = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        try {
            String[] stunlar = {ROW_ID,ROW_ADAY,ROW_FIRMA,ROW_ILAN,ROW_HATIRLA};
            Cursor cursor = db.query(TABLO_KISILER, stunlar,null,null,null,null,null);
            while (cursor.moveToNext()){
                verilerk.add(cursor.getString(1));

            }
        }catch (Exception e){
        }
        db.close();
        return verilerk;


    }
    public List<String> VeriListelekk(){
        List<String> verilerk = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        try {
            String[] stunlar = {ROW_ID,ROW_ADAY,ROW_FIRMA,ROW_ILAN,ROW_HATIRLA};
            Cursor cursor = db.query(TABLO_KISILER, stunlar,null,null,null,null,null);
            while (cursor.moveToNext()){
                verilerk.add(cursor.getString(2));

            }
        }catch (Exception e){
        }
        db.close();
        return verilerk;


    }
    public List<String> VeriListelekkk(){
        List<String> verilerk = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        try {
            String[] stunlar = {ROW_ID,ROW_ADAY,ROW_FIRMA,ROW_ILAN,ROW_HATIRLA};
            Cursor cursor = db.query(TABLO_KISILER, stunlar,null,null,null,null,null);
            while (cursor.moveToNext()){
                verilerk.add(cursor.getString(2)+cursor.getString(3));

            }
        }catch (Exception e){
        }
        db.close();
        return verilerk;


    }
    public List<String> VeriListelekkkk(){
        List<String> verilerk = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        try {
            String[] stunlar = {ROW_ID,ROW_ADAY,ROW_FIRMA,ROW_ILAN,ROW_HATIRLA};
            Cursor cursor = db.query(TABLO_KISILER, stunlar,null,null,null,null,null);
            while (cursor.moveToNext()){
                verilerk.add(cursor.getString(4));

            }
        }catch (Exception e){
        }
        db.close();
        return verilerk;


    }

    public boolean checkUserk(String aday, String firma,String ilan,String hatirla) {


        String[] columns = {ROW_ADAY,ROW_FIRMA,ROW_ILAN,ROW_HATIRLA};
        SQLiteDatabase db = this.getReadableDatabase();

        String selection = ROW_ADAY + " = ?" + " AND " + ROW_FIRMA+ " = ?" + " AND " + ROW_ILAN + " = ?" + " AND "+" = ?" + ROW_HATIRLA ;


        String[] selectionArgs = {aday, firma,ilan,hatirla};


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