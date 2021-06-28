package br.ufmg.coltec.tp.e03_adapters;

import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PlaceFragment extends Fragment {

    public PlaceFragment(){
        super(R.layout.fragment_place_details);
    }

    public void atualizarLugar(Place lugar) {

        ImageView imgPlace = this.getActivity().findViewById(R.id.img_place_photo);
        TextView txtName = this.getActivity().findViewById(R.id.txt_place_name);
        TextView txtDescription = this.getActivity().findViewById(R.id.txt_place_description);
        TextView txtDistance = this.getActivity().findViewById(R.id.txt_place_distance);
        RatingBar ratPlace = this.getActivity().findViewById(R.id.rating_place);

        imgPlace.setImageResource(lugar.getPhotoId());
        txtName.setText(lugar.getName());
        txtDescription.setText(lugar.getDescription());
        txtDistance.setText(String.format("%s", lugar.getDistance()) + " km");
        ratPlace.setRating(lugar.getRate());

    }
}
