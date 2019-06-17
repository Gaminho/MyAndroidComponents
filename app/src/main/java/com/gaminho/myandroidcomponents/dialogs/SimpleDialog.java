package com.gaminho.myandroidcomponents.dialogs;

import android.content.Context;

import androidx.annotation.NonNull;

public class SimpleDialog extends MyAlertDialogBuilder {

    public SimpleDialog(@NonNull Context context, String title, String message) {
        super(context);
        setTitle(title);
        setMessage(message);
    }
}
