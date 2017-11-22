package nyc.c4q.whatismyaddress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

class ActicityMail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);


        RecyclerView bookrecyclerview = (RecyclerView) findViewById(R.id.mail_recyclerview);



    }
}
