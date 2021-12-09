package pt.unl.fct

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import pt.unl.fct.data.model.RestaurantListAdapter
import java.text.FieldPosition

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListRestaurantsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListRestaurantsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_list_restaurants, container, false)

        val listView = view.findViewById<ListView>(R.id.listRestaurantsFragment)
        listView.adapter = ListAdapter(this)

        return listView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private class ListAdapter(context: Context): BaseAdapter() {
        private val mContext: Context = context

        override fun getCount(): Int {
            return 5
        }

        override fun getItem(position: Int): Any {
            "test string";
            return "test string";
        }

        override fun getItemId(position: Int): Long {
            return position.toLong();
        }

        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
            val layoutInflator = LayoutInflater.from(mContext)
            val entry = layoutInflator.inflate(R.layout.list_item_restaurant, viewGroup, false)

            val restaurantName = entry.findViewById<TextView>(R.id.restaurantName)
            restaurantName.text = "restaurant[position].restaurantName()"

            val restaurantRating = entry.findViewById<TextView>(R.id.restaurantRating)
            restaurantName.text = "restaurant[position].restaurantRating()"

            val restaurantPrice = entry.findViewById<TextView>(R.id.restaurantPrice)
            restaurantName.text = "restaurant[position].restaurantPrice()"

            return entry
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ListRestaurantsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ListRestaurantsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}