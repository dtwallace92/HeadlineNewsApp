package com.example.dtwal.headlinenews;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/**
 * Created by dtwal on 2/26/2018.
 */

public class SourceAdapter extends ArrayAdapter<Source> {

    public SourceAdapter(@NonNull Context context, int resource, @NonNull List<Source> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Source source = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.source_layout, parent, false);
        }

        TextView textViewTitle = convertView.findViewById(R.id.textView_title);
        TextView textViewPublishedAt = convertView.findViewById(R.id.textView_publishedAt);
        TextView textViewDescription = convertView.findViewById(R.id.textView_description);

        textViewTitle.setText(source.getTitle());
        textViewPublishedAt.setText(source.getPublihsedAt());
        textViewDescription.setText(source.getDescription());


        return convertView;
    }
}
