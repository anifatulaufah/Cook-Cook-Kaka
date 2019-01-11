package anifatulannisa.app.cooka.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import anifatulannisa.app.cooka.DetailActivity;
import anifatulannisa.app.cooka.DetailResepActivity;
import anifatulannisa.app.cooka.model.JustForYou;
import anifatulannisa.app.cooka.R;

/**
 * Created by annisatahira on 07/01/19.
 */

public class JfyAdapter extends RecyclerView.Adapter<JfyAdapter.JfyHolder> {

    Context context;
    private List<JustForYou> jfys;

    public JfyAdapter(Context context, List<JustForYou> jfys) {
        this.context=context;
        this.jfys=jfys;
    }

    @NonNull
    @Override
    public JfyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       final JfyHolder holder = new JfyHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jfy, null));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent;
                int position = holder.getAdapterPosition();
                switch(position){
                    case 0:
                        intent = new Intent(context,DetailActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context,DetailActivity.class);
                        break;
                    default:
                        intent = new Intent(context,DetailActivity.class);
                        break;
            }
            context.startActivity(intent);
        }

    });
        return holder;
    }

    @Override
    public void onBindViewHolder(JfyHolder holder, final int position) {
        Glide.with(context).load(jfys.get(position).getImage()).into(holder.imgJfy);

        holder.txtJfy.setText(jfys.get(position).getJudul());
    }

    @Override
    public int getItemCount() {
        return jfys.size();
    }

    public static class JfyHolder extends RecyclerView.ViewHolder {

        public ImageView imgJfy;
        public TextView txtJfy;
        public View cardItemJfy;

        public JfyHolder(View itemView) {
            super(itemView);
            cardItemJfy = itemView.findViewById(R.id.cardview_jfy);
            imgJfy = itemView.findViewById(R.id.img_jfy);
            txtJfy = itemView.findViewById(R.id.txt_jfy);
        }
    }

}

