package mx.edu.ittepic.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Carolina Mondragon on 26/02/2018.
 */

    public class Base extends SQLiteOpenHelper {
        public Base(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db)
        {
            db.execSQL("CREATE TABLE usuarios(idusuarios INTEGER PRIMARY KEY, nombre  VARCHAR(400), login VARCHAR(400),proyecto VARCHAR(400));");

        /*db.execSQL("INSERT INTO usuarios values (1,'JUAN PEREZ','JPEREZ','FINANCIEROS') ;");
        db.execSQL("INSERT INTO usuarios values (2,'AMALIA SANCHEZ','ASANCHEZ','AUDITORIA') ;");
        db.execSQL("INSERT INTO usuarios values (3,'IRASEMA GONZALEZ','IGONZALEZ','IT') ;"); */
        }
        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
    }


