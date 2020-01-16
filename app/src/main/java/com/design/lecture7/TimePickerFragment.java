package com.design.lecture7;
        import android.app.DatePickerDialog;
        import android.app.Dialog;
        import android.app.TimePickerDialog;
        import android.os.Bundle;
        import android.widget.DatePicker;
        import android.widget.TimePicker;
        import android.widget.Toast;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.fragment.app.DialogFragment;

        import java.text.SimpleDateFormat;
        import java.util.Calendar;
        import java.util.Locale;

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar c=Calendar.getInstance();
        int hour=c.get(Calendar.HOUR);
        int minute=c.get(Calendar.MINUTE);
        return new TimePickerDialog(getContext(),this,hour,minute,true);
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.HOUR,i);
        c.set(Calendar.MINUTE,i1);
        String date=i+":"+i1;
        Toast.makeText(getContext(),date,Toast.LENGTH_LONG).show();

    }
}
