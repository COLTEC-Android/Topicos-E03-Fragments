package br.ufmg.coltec.tp.e03_adapters;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class PlaceDetailsFragment extends Fragment {

    public PlaceDetailsFragment(){
        super(R.layout.fragment_place_details);
    }

    public void atualizarLugar(Place place){
        TextView txtTitulo = this.getView().findViewById(R.id.fragTitulo);
        TextView txtDesc = this.getView().findViewById(R.id.fragDesc);
        TextView txtDist = this.getView().findViewById(R.id.fragDistancia);
        ImageView fotoLugar = this.getView().findViewById(R.id.fragFoto);
        RatingBar ratingBar = this.getView().findViewById(R.id.fragRating);

        txtTitulo.setText(place.getName());
        txtDesc.setText(place.getDescription());
        txtDist.setText(place.getDistance() + " KM");
        fotoLugar.setImageResource(place.getPhotoId());
        ratingBar.setRating(place.getRate());

    }
}