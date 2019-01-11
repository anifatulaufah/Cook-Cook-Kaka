package anifatulannisa.app.cooka.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import anifatulannisa.app.cooka.R;
import anifatulannisa.app.cooka.model.Resep;
import anifatulannisa.app.cooka.adapter.ResepAdapter;

/**
 * Created by annisatahira on 07/01/19.
 */

public class  FragmentAllRecipe extends Fragment {

    View v;
    private List<Resep> lstResep;
    private RecyclerView rvResep;

    public FragmentAllRecipe() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.allrecipe_fragment,container,false);
        rvResep = (RecyclerView) v.findViewById((R.id.resep_rv));
        ResepAdapter resepAdapter = new ResepAdapter(getContext(), lstResep);
        rvResep.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rvResep.setAdapter(resepAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstResep = new ArrayList<>();
        lstResep.add(new Resep("Tumis Kangkung",R.drawable.tumis_kangkung ));
        lstResep.add(new Resep("Mie Goreng Jawa",R.drawable.mie ));
        lstResep.add(new Resep("Perkedel Kentang",R.drawable.perkedel ));
        lstResep.add(new Resep("Sayur Sop",R.drawable.sup ));
        lstResep.add(new Resep("Beef Steak",R.drawable.steak ));
        lstResep.add(new Resep("Sayur Asem",R.drawable.sayur_asem ));

    }
}
