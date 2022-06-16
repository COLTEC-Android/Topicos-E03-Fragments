package br.ufmg.coltec.tp.e03_adapters;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import org.w3c.dom.Text;

public class PlaceFragment extends Fragment {

    public PlaceFragment(){
        super(R.layout.fragment_place_details);

    }

    void atualizaLugar(Place lugar){
        ImageView imagem = this.getActivity().findViewById(R.id.imagem);
        imagem.setImageResource(lugar.getPhotoId());

        TextView titulo = this.getActivity().findViewById(R.id.titulo);
        titulo.setText(lugar.getName());

        TextView subtitulo = this.getActivity().findViewById(R.id.subtitulo);
        titulo.setText(lugar.getDescription());

        RatingBar nota = this.getActivity().findViewById(R.id.nota);
        nota.setRating(lugar.getRate());

        TextView distancia = this.getActivity().findViewById(R.id.distancia);
        distancia.setText(lugar.getDistance()+"km");

    }

}
