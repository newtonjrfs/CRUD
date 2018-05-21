package newton.com.crud.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelper extends SQLiteOpenHelper {

    private static final String NOME_DB = "BANCODEDADOS";
    private static final int VERSAO = 1;


    public DbHelper(Context context) {
        super(context, NOME_DB, null, VERSAO);
        Log.i("INFO DB","testeeeeeeeeeeeeeeeeeeeee" );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE tbl_usuario (_id INTEGER PRIMARY KEY AUTOINCREMENT,nome TEXT,senha TEXT);");
        Log.i("INFO DB","testeeeeeeeeeeeeeeeeeeeee" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
