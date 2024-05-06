package sg.edu.np.mad.madpractical4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    ArrayList<User> userlist;

    public UserAdapter(ArrayList<User> input) {
        userlist = input;
    }

    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View user = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new UserViewHolder(user);
    }

    public void onBindViewHolder(UserViewHolder holder, int position) {
        User temp = userlist.get(position);
        holder.txt.setText(temp.name);
    }

    public int getItemCount() {
         return userlist.size();
    }

}
