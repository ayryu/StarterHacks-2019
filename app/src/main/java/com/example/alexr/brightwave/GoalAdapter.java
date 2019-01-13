package com.example.alexr.brightwave;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GoalAdapter extends ArrayAdapter<Goal> {
    public GoalAdapter(Activity context, ArrayList<Goal> goals) {
        super(context, 0, goals);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.single_list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Goal currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.goal_text_view);
        miwokTextView.setText(currentWord.getMainGoal());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.subgoal_text_view);
        defaultTextView.setText(currentWord.getSubGoal());

        return listItemView;
    }
}