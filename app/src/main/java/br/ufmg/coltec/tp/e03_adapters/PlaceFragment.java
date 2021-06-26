package br.ufmg.coltec.tp.e03_adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PlaceFragment extends Fragment {

    //construtor
    public PlaceFragment(){
        super(R.layout.fragment_places_details);
    }

    void updatePlace(Place place){

        ImageView placePhoto = this.getActivity().findViewById(R.id.img_place_photo);
        TextView placeName = this.getActivity().findViewById(R.id.txt_place_name);
        TextView placeText = this.getActivity().findViewById(R.id.txt_place_description);
        RatingBar placeEvaluation = this.getActivity().findViewById(R.id.evaluation_place);
        TextView placeDistance = this.getActivity().findViewById(R.id.txt_place_distance);

        placePhoto.setImageResource(place.getPhotoId());
        placeName.setText(place.getName());
        placeText.setText(place.getDescription());
        placeEvaluation.setRating(place.getRate());
        placeDistance.setText(place.getDistance());
    }
}
