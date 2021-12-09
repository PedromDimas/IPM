package pt.unl.fct;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import pt.unl.fct.data.model.Restaurant;
import pt.unl.fct.data.model.RestaurantListAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListRestaurantsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListRestaurantsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ListRestaurantsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListRestaurantsFragment newInstance(String param1, String param2) {
        ListRestaurantsFragment fragment = new ListRestaurantsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_restaurants, container, false);

        ListView lv = (ListView) view.findViewById(R.id.listview);

        //HARDCODED
        /*ArrayList<Restaurant> list = new ArrayList<>();
        Restaurant r1 = new Restaurant(01,"name01","10/10","1$",38.736946, -9.142685);
        Restaurant r2 = new Restaurant(01,"name02","10/10","1$",38.3947, -9.0420);
        Restaurant r3 = new Restaurant(01,"name03","10/10","1$",38.676525, -9.165105);

        list.add(r1);
        list.add(r2);
        list.add(r3);*/

        String[] items = {
                "Restaurant 1",
                "Restaurant 2",
                "Restaurant 3"
        };

        ArrayAdapter<String> list = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                items
        );


        ListAdapter adapter = list;

        lv.setAdapter(adapter);

        return view;
    }
}