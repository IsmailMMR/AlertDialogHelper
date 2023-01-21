package com.immr.alertdialoglibrary;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;

public class AlertDialogCustom {

    public void show(Context context, String title, String description, String titleButtonPositive, String titleButtonNegative, Integer image) {
        // Create an alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        final View customLayout = LayoutInflater.from(context).inflate(R.layout.alertdialog_custom, null);
        builder.setView(customLayout);
        AppCompatButton BtnSubmit = (AppCompatButton) customLayout.findViewById(R.id.btnSubmit);
        AppCompatButton BtnCancel = (AppCompatButton) customLayout.findViewById(R.id.btnCancel);
        TextView tvTitle = (TextView) customLayout.findViewById(R.id.tvTitle);
        TextView tvDesc = (TextView) customLayout.findViewById(R.id.tvDesc);
        ImageView imageView = (ImageView) customLayout.findViewById(R.id.imageView);
        AlertDialog dialog = builder.create();

        imageView.setImageResource(image);

        tvTitle.setText(title);
        tvDesc.setText(description);

        BtnCancel.setText(titleButtonNegative);
        BtnCancel.setOnClickListener(view -> {
            dialog.cancel();
            dialog.dismiss();
        });

        BtnSubmit.setText(titleButtonPositive);
        BtnSubmit.setOnClickListener(view -> {
            dialog.cancel();
            dialog.dismiss();
        });

        dialog.show();
    }
}

