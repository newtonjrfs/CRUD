package newton.com.crud.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import newton.com.crud.model.Ser;

public class UsuarioDao {

    private SQLiteDatabase sql;

    public UsuarioDao(){
        DbHelper db = DbHelper.getInstancia();
        sql = db.getWritableDatabase();
    }


    public void salvarUsuario(Ser ser){

        ContentValues cv = new ContentValues();
        cv.put("nome", ser.getNome());
        cv.put("senha", ser.getSenha());

        sql.insert("tbl_usuario",null,cv);
    }


}
