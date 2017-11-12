package com.google.ar.core.examples.java.helloar;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by index on 11/11/17.
 */

public class adjustmentDialog extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.adjustment_dialog, container, false);
        getDialog().setTitle("Adjustment Dialog");
        final HelloArActivity activity = (HelloArActivity) getContext();

        Button dismiss = (Button) rootView.findViewById(R.id.dismiss);
        final EditText scale = (EditText) rootView.findViewById(R.id.scale);

        scale.setText(Float.toString(activity.getObjectScale()));
        dismiss.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                activity.setObjectScale(Float.valueOf(scale.getText().toString()));
                dismiss();
            }
        });
        return rootView;
    }

}