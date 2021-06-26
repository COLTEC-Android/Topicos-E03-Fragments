package br.ufmg.coltec.tp.e03_adapters;

import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PlaceFragment extends Fragment {

    public PlaceFragment() {
        super(R.layout.fragment_place_details);
    }

    void atualizaLugar(Place lugar) {
        TextView placeName = this.getView().findViewById(R.id.txt_place_name);
        TextView placeDescription = this.getView().findViewById(R.id.txt_place_description);
        TextView placeDistance = this.getView().findViewById(R.id.txt_place_distance);
        RatingBar placeRating = this.getView().findViewById(R.id.rating_bar);
        ImageView placePhoto = this.getView().findViewById(R.id.img_place_photo);

        placeName.setText(lugar.getName());
        placeDescription.setText(lugar.getDescription());
        placeDistance.setText(String.format("%s KM", lugar.getDistance()));
        placeRating.setRating(lugar.getRate());
        placePhoto.setImageResource(lugar.getPhotoId());
    }

}
