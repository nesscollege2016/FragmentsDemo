package ness.tomerbu.edu.fragmentsdemo;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DateFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_date,
                container, false);
        final DatePicker picker = (DatePicker)
                v.findViewById(R.id.datePicker);

        Button btnSetDate= (Button)
                v.findViewById(R.id.btnSetDate);

        btnSetDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),
                        picker.getDayOfMonth()
                                + " " +
                                picker.getMonth()
                                +" "+
                                picker.getYear(),
                        Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });


        return v;
    }

}
