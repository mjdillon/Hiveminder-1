package org.nerdcircus.android.hiveminder;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import android.util.Log;

public class TaskAdapter extends ArrayAdapter
{
    private String TAG = "TaskAdapter";

    public TaskAdapter(Context context, int layout, Task[] tasks){
        super(context, layout, tasks);
    }

    public void bindView(View view, Context context, Task task){
        TextView desc = (TextView) view.findViewById(R.id.tasktext);
        subject.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));

        subject.setText(task.summary);
    }

}

