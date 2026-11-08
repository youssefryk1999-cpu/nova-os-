package com.nova.ui.clock;

import android.content.Context;
import android.text.format.DateFormat;
import android.widget.TextView;
import java.util.Calendar;

public class NovaBoldDualClockController {
    private final TextView mHoursView;
    private final TextView mMinutesView;
    private final TextView mDateView;
    private final Context mContext;

    public NovaBoldDualClockController(Context context, TextView hours, TextView minutes, TextView date) {
        this.mContext = context;
        this.mHoursView = hours;
        this.mMinutesView = minutes;
        this.mDateView = date;
    }

    public void updateTime() {
        Calendar calendar = Calendar.getInstance();
        boolean is24Hour = DateFormat.is24HourFormat(mContext);
        String hourFormat = is24Hour ? "HH" : "hh";
        String hours = DateFormat.format(hourFormat, calendar).toString();
        String minutes = DateFormat.format("mm", calendar).toString();
        String date = DateFormat.format("EEE, MMM d", calendar).toString();

        if (mHoursView != null) mHoursView.setText(hours);
        if (mMinutesView != null) mMinutesView.setText(minutes);
        if (mDateView != null) mDateView.setText(date);
    }
}
