package nyc.c4q.whatismyaddress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        TextView textView= (TextView) findViewById(R.id.displayemail_txt);
        Intent intent =getIntent();
        String sharedpref=intent.getStringExtra("sharedpref");

        textView.setText("your email is "+sharedpref);
    }
}
