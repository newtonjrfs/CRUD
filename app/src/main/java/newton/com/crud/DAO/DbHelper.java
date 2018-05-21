package newton.com.crud.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelper extends SQLiteOpenHelper {

    public static String NOME_DB = "BANCODEDADOS";
    public static int VERSAO = 1;
    public static String TBL_USUARIO = "tbl_usuario";

    private static DbHelper instancia;


    public static DbHelper getInstancia() {
        if (instancia == null) instancia = new DbHelper();
        return instancia;
    }

    public DbHelper() {
        super(MyApp.getContext(), NOME_DB, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE IF NOT EXISTS " + TBL_USUARIO+ " " +
                "(_id INTEGER PRIMARY KEY AUTOINCREMENT,nome TEXT,senha TEXT);";

        try {

            db.execSQL(sql);
            Log.i("INFO DB","Criacao da tabela com sucesso" );

        }catch (Exception e){
            Log.i("INFO DB","Erro ao criar a tabela" + e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
