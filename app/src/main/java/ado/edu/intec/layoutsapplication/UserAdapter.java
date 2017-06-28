package ado.edu.intec.layoutsapplication;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Yobany.Diaz on 6/24/2017.
 */

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(Context context, ArrayList<User> object) {
        super(context,0, object);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        User user = getItem(position);
        if (convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }

        TextView tvName= (TextView) convertView.findViewById(R.id.textUserTitle);
        TextView tvAddress= (TextView) convertView.findViewById(R.id.textUserSubtitle);
        tvName.setText(user.name);
        tvAddress.setText(user.address);
        return convertView;
    }
}