package com.nova.ui.qs;

import android.content.Context;
import android.widget.Button;
import android.widget.Toast;

public class NovaQuickSettingsController {

    private final Context mContext;

    public NovaQuickSettingsController(Context context) {
        this.mContext = context;
    }

    public void onTileClicked(String tileName) {
        Toast.makeText(mContext, "NOVA OS: " + tileName + " Toggled", Toast.LENGTH_SHORT).show();
    }
}
