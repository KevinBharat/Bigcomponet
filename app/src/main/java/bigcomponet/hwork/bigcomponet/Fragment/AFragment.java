package bigcomponet.hwork.bigcomponet.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import bigcomponet.hwork.bigcomponet.R;

public class AFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootview = inflater.inflate(R.layout.fragment_a,container,false);

        return rootview;
    }
}
