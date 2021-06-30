package br.ufmg.coltec.tp.e03_adapters;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class PlaceFragment extends Fragment {

    public PlaceFragment() {
        super(R.layout.fragment_place_details);
    }

    public void atualizaLugar(Place lugar) {
        ImageView imgPlace = this.getActivity().findViewById(R.id.img_place_photo);
        TextView namePlace = this.getActivity().findViewById(R.id.txt_place_name);
        TextView descriptionPlace = this.getActivity().findViewById(R.id.txt_place_description);
        RatingBar rtgBarPlace = this.getActivity().findViewById(R.id.rtg_bar_rate);
        TextView distancePlace = this.getActivity().findViewById(R.id.txt_place_distance);

        imgPlace.setImageResource(lugar.getPhotoId());
        namePlace.setText(lugar.getName());
        descriptionPlace.setText(lugar.getDescription());
        rtgBarPlace.setRating(lugar.getRate());
        distancePlace.setText(lugar.getDistance() + "Km");

    }
}
