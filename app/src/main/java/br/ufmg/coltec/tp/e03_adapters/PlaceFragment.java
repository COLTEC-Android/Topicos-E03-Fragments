package br.ufmg.coltec.tp.e03_adapters;

import androidx.fragment.app.Fragment;

import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class PlaceFragment extends Fragment {
    public PlaceFragment(){
        super(R.layout.fragment_place_details);
    }

    public void atualizaLugar(Place lugar){

        ImageView localImage = this.getActivity().findViewById(R.id.img_place_photo);
        TextView localName = this.getActivity().findViewById(R.id.txt_place_name);
        TextView localDescricao = this.getActivity().findViewById(R.id.txt_place_description);
        RatingBar localRate = this.getActivity().findViewById(R.id.rtb_rate);
        TextView localdistance = this.getActivity().findViewById(R.id.txt_place_distance);

        localImage.setImageResource(lugar.getPhotoId());
        localName.setText(lugar.getName());
        localDescricao.setText(lugar.getDescription());
        localRate.setRating(lugar.getRate());
        localdistance.setText(lugar.getDistance() + " KM");

    }

}
