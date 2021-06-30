package br.ufmg.coltec.tp.e03_adapters;

import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PlaceFragment extends Fragment {

    public PlaceFragment(){
        super(R.layout.fragment_place_details);
    }

    public void atualizarLugar(Place lugar){

        ImageView placeImage = this.getActivity().findViewById(R.id.img_place_photo);
        TextView placeName = this.getActivity().findViewById(R.id.txt_place_name);
        TextView placeDescription = this.getActivity().findViewById(R.id.txt_place_description);
        RatingBar placeRating = this.getActivity().findViewById(R.id.rating);
        TextView placeDistance = this.getActivity().findViewById(R.id.txt_place_distance);

        placeImage.setImageResource(lugar.getPhotoId());
        placeName.setText(lugar.getName());
        placeDescription.setText(lugar.getDescription());
        placeRating.setRating(lugar.getRate());
        placeDistance.setText(lugar.getDistance() + " KM");
    }
}
