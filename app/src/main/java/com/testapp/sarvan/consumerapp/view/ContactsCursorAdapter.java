package com.testapp.sarvan.consumerapp.view;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.testapp.sarvan.consumerapp.R;

/**
 * Created by sarva on 10-08-2017.
 */

public class ContactsCursorAdapter extends CursorAdapter {
    public ContactsCursorAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    public static final String CONTACT_NAME = "contactName";
    public static final String CONTACT_PHONE = "contactPhone";

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(
                R.layout.contact_list_item, viewGroup, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        String contactName = cursor.getString(
                cursor.getColumnIndex(CONTACT_NAME));
        String contactPhone = cursor.getString(
                cursor.getColumnIndex(CONTACT_PHONE));
        TextView nameTextView = view.findViewById(R.id.nameTextView);
        TextView phoneTextView = view.findViewById(R.id.phoneTextView);
        nameTextView.setText(contactName);
        phoneTextView.setText(contactPhone);
    }
}
