package sg.edu.np.mad.madpractical4;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView txt;
    public UserViewHolder(View userView) {
        super(userView);
        txt = userView.findViewById(android.R.id.text1);
    }
}
