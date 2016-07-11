package ness.tomerbu.edu.fragmentsdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimePickerFragment extends Fragment {

    private Button btnSetTime;
    private TimePicker timePicker;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_time_picker, container, false);
        btnSetTime = (Button) v.findViewById(R.id.btnSave);
        timePicker = (TimePicker) v.findViewById(R.id.timePicker);

        btnSetTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hours = 0;
                int minutes = 0;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                    hours = timePicker.getHour();
                    minutes = timePicker.getMinute();
                }
                else {
                    hours = timePicker.getCurrentHour();
                    minutes = timePicker.getCurrentMinute();
                }

                Toast.makeText(getContext(), "hours: " + hours +" Min: " + minutes, Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

}
