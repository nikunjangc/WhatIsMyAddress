package nyc.c4q.whatismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     public static final String SHARED_PREFS_KEY="sharedPrefsTesting";

    private EditText email;
    private Button saveEmail;
    private Button display;
    private SharedPreferences save;
    Boolean intFound=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText) findViewById(R.id.editText1);
        saveEmail=(Button) findViewById(R.id.btn1);
        display=(Button) findViewById(R.id.btn2);

        save= getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY,MODE_PRIVATE);
//        do {
//            String text = email.getText().toString();
//            try {
//                int num = Integer.parseInt(text);
//            } catch (NumberFormatException e) {
//                intFound = true;
//                Toast.makeText(getApplicationContext(), "number not allowed", Toast.LENGTH_LONG).show();
//            }
//        } while (intFound = true) ;
        saveEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor=save.edit();
                editor.putString(email.getText().toString(),email.getText().toString());
                editor.apply();
                Toast t = Toast.makeText(getApplicationContext(), ""+email.getText(), Toast.LENGTH_LONG);
                t.show();


            }
        });
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this,RecyclerActivity.class);
                 intent.putExtra("sharedPref",SHARED_PREFS_KEY);
                startActivity(intent);

            }
        });


    }
}
