package com.suvordm.simplenotes;

import androidx.cardview.widget.CardView;

import com.suvordm.simplenotes.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
