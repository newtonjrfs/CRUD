package newton.com.crud.Controle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;

import newton.com.crud.DAO.DbHelper;
import newton.com.crud.DAO.MyApp;
import newton.com.crud.DAO.UsuarioDao;
import newton.com.crud.MainActivity;
import newton.com.crud.model.Ser;

public class Pessoa{

    UsuarioDao usuarioDao= new UsuarioDao();


    public void salvarRegistro(String nome, String senha){

        Ser ser = new Ser();
        ser.setNome(nome);
        ser.setSenha(senha);

        usuarioDao.salvarUsuario(ser);

    }

}
