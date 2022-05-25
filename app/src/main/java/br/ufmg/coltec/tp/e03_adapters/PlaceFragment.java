package br.ufmg.coltec.tp.e03_adapters;

import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PlaceFragment extends Fragment {
    public PlaceFragment() {
        super(R.layout.fragment_place_details);
    }

    void atualizaLugar(Place lugar){

        TextView nome = this.getActivity().findViewById(R.id.txt_place_name);
        nome.setText(lugar.getName());

        TextView descricao = this.getActivity().findViewById(R.id.txt_place_description);
        descricao.setText(lugar.getDescription());

        TextView distancia = this.getActivity().findViewById(R.id.txt_place_distance);
        distancia.setText(lugar.getDistance() + "");

        RatingBar avaliacao = this.getActivity().findViewById(R.id.ratting);
        avaliacao.setRating(lugar.getRate());

        ImageView imagem = this.getActivity().findViewById(R.id.img_place_photo);
        imagem.setImageResource(lugar.getPhotoId());


    }
}
