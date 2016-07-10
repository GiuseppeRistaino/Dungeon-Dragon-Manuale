package monteverde.manual;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ManualActivity extends AppCompatActivity {

    public Button buttonArmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        buttonArmi = (Button)findViewById(R.id.button3);

        /* il Bottone Armi*/

        buttonArmi.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View arg0) {
                // definisco l'intenzione
                Intent ManualActivity = new Intent(ManualActivity.this , ListaArmiActivity.class);
                // passo all'attivazione dell'activity Manual Activity.java
                startActivity(ManualActivity);

            }
        });


    }

    /*fine classe manualActivity*/
}




