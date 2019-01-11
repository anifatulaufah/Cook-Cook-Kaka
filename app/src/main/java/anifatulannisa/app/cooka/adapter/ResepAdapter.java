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

import java.util.List;

import anifatulannisa.app.cooka.DetailResepActivity;
import anifatulannisa.app.cooka.R;
import anifatulannisa.app.cooka.model.Resep;

/**
 * Created by nina on 1/7/19.
 */

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ResepViewHolder>{

    private Context getContext;
    private List<Resep> getData;

    public ResepAdapter(Context getContext, List<Resep> getData) {
        this.getContext= getContext;
        this.getData = getData;
    }

    @NonNull
    @Override
    public ResepViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /*View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_resep, parent, false);
        return new ResepViewHolder(view);
        */
        final ResepViewHolder holder = new ResepViewHolder(LayoutInflater .from(parent.getContext()).inflate(R.layout.cardview_item_resep,null));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent;
                int position = holder.getAdapterPosition();
                switch (position) {
                    case 0:
                        intent = new Intent(getContext, DetailResepActivity.class);
                        break;
                    case 1:
                        intent = new Intent(getContext, DetailResepActivity.class);
                        break;
                    case 2:
                        intent = new Intent(getContext, DetailResepActivity.class);
                        break;
                    case 3:
                        intent = new Intent(getContext, DetailResepActivity.class);
                        break;
                    case 4:
                        intent = new Intent(getContext, DetailResepActivity.class);
                        break;
                    case 5:
                        intent = new Intent(getContext, DetailResepActivity.class);
                        break;
                    default:
                        intent = new Intent(getContext, DetailResepActivity.class);
                        break;
                }
                getContext.startActivity(intent);
            }
        });
        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull ResepViewHolder holder, int position) {
        holder.txtJudul.setText(getData.get(position).getJudul());
        holder.imgResep.setImageResource(getData.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return getData.size();
    }

    public static class ResepViewHolder extends RecyclerView.ViewHolder{

        TextView txtJudul;
        ImageView imgResep;

        public ResepViewHolder(View itemView) {
            super(itemView);

            txtJudul = (TextView) itemView.findViewById(R.id.judul_resep);
            imgResep = (ImageView) itemView.findViewById(R.id.img_resep);
        }
    }
}
