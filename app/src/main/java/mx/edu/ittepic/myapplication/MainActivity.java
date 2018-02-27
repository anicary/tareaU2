package mx.edu.ittepic.myapplication;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
  
public class MainActivity extends AppCompatActivity {
    Base baseinterna;
    EditText id,nombre,login,proy;
    Button agregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseinterna = new Base(MainActivity.this, "baseinterna", null, 1);
        id = findViewById(R.id.identificador);
        nombre = findViewById(R.id.nombre);
        login = findViewById(R.id.login);
        proy = findViewById(R.id.proyecto);

        agregar = findViewById(R.id.agregar);



        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    SQLiteDatabase base = baseinterna.getWritableDatabase();
                    // String query1 = "insert into usuarios values (1,'JUAN PEREZ','JPEREZ','FINANCIEROS');";
                    //String query2 = "insert into usuarios values (2,'AMALIA SANCHEZ','ASANCHEZ','AUDITORIA');";
                    String query3 = "insert into usuarios values ("+id.getText().toString()+",'"+nombre.getText().toString()+"','"+login.getText().toString()+"','"+proy.getText().toString()+"');";
                    //  base.execSQL(query1);
                    // base.execSQL(query2);
                    base.execSQL(query3);

                } catch (SQLException e) {
                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });



        try {
            SQLiteDatabase base = baseinterna.getReadableDatabase();
            String query1 = "select * from usuarios;";
            base.execSQL(query1);

        } catch (SQLException e) {
            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
        }

        try {
            SQLiteDatabase base = baseinterna.getWritableDatabase();
            // String query1 = "insert into usuarios values (1,'JUAN PEREZ','JPEREZ','FINANCIEROS');";
            //String query2 = "insert into usuarios values (2,'AMALIA SANCHEZ','ASANCHEZ','AUDITORIA');";
            String query3 = "insert into usuarios values (3,'IRASEMA GONZALEZ','IGONZALEZ','IT');";
            //  base.execSQL(query1);
            // base.execSQL(query2);
            base.execSQL(query3);

        } catch (SQLException e) {
            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
        }








    }
}
