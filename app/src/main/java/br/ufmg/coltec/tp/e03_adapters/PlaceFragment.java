package br.ufmg.coltec.tp.e03_adapters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PlaceFragment extends Fragment {
    // Declaração das variáveis de instância dos componentes da tela
    private ImageView imageView;
    private TextView tituloTextView;
    private TextView descricaoTextView;
    private TextView distanciaTextView;
    private RatingBar notaRatingBar;

    // ...

    public void atualizaLugar(Place lugar) {
        // Atualiza os componentes da tela com base no objeto Place enviado como parâmetro

        // Recupera os componentes da tela usando o método findViewById() da Activity
        imageView = this.getActivity().findViewById(R.id.imageView);
        tituloTextView = this.getActivity().findViewById(R.id.titleTextView);
        descricaoTextView = this.getActivity().findViewById(R.id.descriptionTextView);
        distanciaTextView = this.getActivity().findViewById(R.id.distanceTextView);
        notaRatingBar = this.getActivity().findViewById(R.id.ratingBar);

        // Define a imagem da ImageView com base no lugar recebido
        imageView.setImageResource(lugar.getPhotoId());

        // Define os textos dos TextViews com base no lugar recebido
        tituloTextView.setText(lugar.getName());
        descricaoTextView.setText(lugar.getDescription());
        //distanciaTextView.setText(lugar.getDistance());

        // Define a nota da RatingBar com base no lugar recebido
        notaRatingBar.setRating(lugar.getRate());
    }
    public PlaceFragment() {
        // Construtor padrão
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Carrega o layout do fragmento
        return inflater.inflate(R.layout.fragment_place_details, container, false);
    }
}
