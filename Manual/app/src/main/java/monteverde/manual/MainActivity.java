package monteverde.manual;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Questi Sono i bottoni*/
         button = (Button)findViewById(R.id.button);
         button2 = (Button)findViewById(R.id.button2);



        /*adesso inserisco l'inteliggenza al bottone uno*/
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                // definisco l'intenzione
                Intent MainActivity = new Intent(MainActivity.this , ManualActivity.class);

                // passo all'attivazione dell'activity Manual Activity.java
                startActivity(MainActivity);

            }
        });

        /*adesso inserisco l'inteliggenza al bottone Due*/
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                // definisco l'intenzione
                Intent MainActivity = new Intent(MainActivity.this , SchedaActivity.class);

                // passo all'attivazione dell'activity Manual Activity.java
                startActivity(MainActivity);

            }
        });



        /* le ultime due parentesi graffe sono una della classe
    principale e la penultima del metodo principale onCreate*/
    }



}
