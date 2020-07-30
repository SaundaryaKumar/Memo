package com.dromeus.delta.memo;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Query;

@Dao
public interface NoteDao {

    @Query("INSERT into notes (contents) VALUES ('New note')")
    void create();

    @Query("SELECT * from notes")
    List<Note> getAllNotes();

    @Query("UPDATE notes SET contents = :contents where id = :id")
    void save(String contents, int id);
}
