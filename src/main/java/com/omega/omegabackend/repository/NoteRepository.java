package com.omega.omegabackend.repository;

import com.omega.omegabackend.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
