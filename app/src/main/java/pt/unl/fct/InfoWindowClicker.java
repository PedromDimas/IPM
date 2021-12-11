package pt.unl.fct;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class InfoWindowClicker implements GoogleMap.OnInfoWindowClickListener {
    private Context context;
    public InfoWindowClicker(Context context) {
        this.context = context;
    }

    @Override
    public void onInfoWindowClick(@NonNull Marker marker) {
        context.startActivity(new Intent(context,RegisterActivity.class));
    }
}
