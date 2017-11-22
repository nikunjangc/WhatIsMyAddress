package nyc.c4q.whatismyaddress;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Nikunjan on 11/21/17.
 */

public class EmailAdaptor extends RecyclerView.Adapter<EmailVIewHolder>{
    private List<Model> email;

    public EmailAdaptor(List<Model> email) {
        this.email = email;
    }

    @Override
    public EmailVIewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_mail,parent,false);
        return new EmailViewHolder(childView);

    }

    @Override
    public void onBindViewHolder(EmailVIewHolder holder, int position) {
            Model email=
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
