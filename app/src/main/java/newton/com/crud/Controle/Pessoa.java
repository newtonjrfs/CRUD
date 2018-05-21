package newton.com.crud.Controle;

import android.content.Context;
import android.util.Log;

import newton.com.crud.DAO.UsuarioDao;
import newton.com.crud.model.Ser;

public class Pessoa {


    UsuarioDao usuarioDao = new UsuarioDao(Context.getA);


    public void salvarRegistro(String nome, String senha){

        Ser ser = new Ser();
        ser.setNome(nome);
        ser.setSenha(senha);

        Log.i("teste pessoa","passou aki tambem" );

        usuarioDao.salvarUsuario(ser);

    }

}
