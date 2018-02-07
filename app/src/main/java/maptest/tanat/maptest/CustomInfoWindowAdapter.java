package maptest.tanat.maptest;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by TaNaT on 07.02.2018.
 */

public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

    private Activity context;

    public CustomInfoWindowAdapter(Activity context){
        this.context = context;
    }

    @Override
    public View getInfoWindow(Marker marker) {

        View view = LayoutInflater.from(context).inflate(R.layout.dialog_event_marker, null);

        TextView tvTitle = (TextView) view.findViewById(R.id.textView_dialog_address);
        TextView tvData = (TextView) view.findViewById(R.id.textView_dialog_date);
        TextView tvPoison = (TextView) view.findViewById(R.id.textView_dialog_event);

        tvTitle.setText("Place name");
        tvData.setText("28 Oct 2017");
        tvPoison.setText("Poison");
        return view;
    }

    @Override
    public View getInfoContents(Marker marker) {
/*        View view = context.getLayoutInflater().inflate(R.layout.customwindow, null);

        TextView tvTitle = (TextView) view.findViewById(R.id.tv_title);
        TextView tvSubTitle = (TextView) view.findViewById(R.id.tv_subtitle);

        tvTitle.setText(marker.getTitle());
        tvSubTitle.setText(marker.getSnippet());*/

//        View view = context.getLayoutInflater().inflate(R.layout.dialog_event_marker, null);

/*        View view = LayoutInflater.from(context).inflate(R.layout.dialog_event_marker, null);

        TextView tvTitle = (TextView) view.findViewById(R.id.textView_dialog_address);
        TextView tvData = (TextView) view.findViewById(R.id.textView_dialog_date);
        TextView tvPoison = (TextView) view.findViewById(R.id.textView_dialog_event);

        tvTitle.setText("Place name");
        tvData.setText("28 Oct 2017");
        tvPoison.setText("Poison");
        return view;*/

        return null;
    }
}