package br.ufmg.coltec.tp.e03_adapters;

import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PlaceFragment extends Fragment {

    public PlaceFragment(){
        super(R.layout.fragment_place_details);
    }

    public void atualizaLugar(Place place){
        ImageView placePhoto = this.getActivity().findViewById(R.id.imgPlacePic);
        TextView lblTitle = this.getActivity().findViewById(R.id.lblTitle);
        TextView lblComent = this.getActivity().findViewById(R.id.lblComent);
        RatingBar rtBar = this.getActivity().findViewById(R.id.ratingBar);
        TextView lblDistance = this.getActivity().findViewById(R.id.lblDistance);

        Log.d("Photo ID", "photo id: " + place.getPhotoId());
        placePhoto.setImageResource(place.getPhotoId());
        lblTitle.setText(place.getName());
        lblComent.setText(place.getDescription());
        rtBar.setRating(place.getRate());
        lblDistance.setText(String.format("%sKm", place.getDistance().toString()));

    }

}
