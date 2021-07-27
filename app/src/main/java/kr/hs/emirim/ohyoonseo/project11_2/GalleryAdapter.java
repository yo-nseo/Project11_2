package kr.hs.emirim.ohyoonseo.project11_2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GalleryAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.over_1, R.drawable.over_2, R.drawable.over_3, R.drawable.over_4, R.drawable.over_5,
                        R.drawable.over_6, R.drawable.over_7, R.drawable.over_8, R.drawable.over_9, R.drawable.over_10};
    int[] titleIds = {R.string.title01, R.string.title02, R.string.title03, R.string.title04, R.string.title05,
                        R.string.title06, R.string.title07, R.string.title08, R.string.title09, R.string.title10};

    ImageView imgvLarge;

    public GalleryAdapter(Context context, ImageView imgvLarge) {
        this.context = context;
        this.imgvLarge = imgvLarge;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new ViewGroup.LayoutParams(200, 300));
        imgv.setImageResource(posterIds[position]);
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        final int pos = position;
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgvLarge.setImageResource(posterIds[pos]);
                Toast toast = new Toast(context);
                View toastView = View.inflate(context, R.layout.toast1, null);
                TextView textTitle = toastView.findViewById(R.id.text_title);
                textTitle.setText(titleIds[pos]);
                toast.setView(toastView);
                toast.show();
            }
        });

        return imgv;
    }
}
