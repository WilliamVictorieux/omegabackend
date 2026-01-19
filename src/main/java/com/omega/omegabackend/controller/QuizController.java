package com.omega.omegabackend.controller;

import com.omega.omegabackend.model.Quiz;
import com.omega.omegabackend.model.Note;
import com.omega.omegabackend.model.Score;
import com.omega.omegabackend.repository.QuizRepository;
import com.omega.omegabackend.repository.NoteRepository;
import com.omega.omegabackend.repository.ScoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api") // Préfixe global
@CrossOrigin(origins = "*") // Autoriser toutes les origines (Android Studio)
public class QuizController {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private NoteRepository noteRepo;

    @Autowired
    private ScoreRepository scoreRepo;

    // ====================== SECTION QUIZ ======================
    @GetMapping("/quizzes")
    public List<Quiz> getAllQuizzes() { 
        return quizRepository.findAll(); 
    }

    @PostMapping("/quizzes")
    public Quiz createQuiz(@RequestBody Quiz quiz) { 
        return quizRepository.save(quiz); 
    }

    @PutMapping("/quizzes/{id}")
    public Quiz updateQuiz(@PathVariable Long id, @RequestBody Quiz details) {
        details.setId(id);
        return quizRepository.save(details);
    }

    @DeleteMapping("/quizzes/{id}")
    public void deleteQuiz(@PathVariable Long id) { 
        quizRepository.deleteById(id); 
    }

    // ====================== SECTION NOTES ======================
    @PostMapping("/notes")
    public Note saveNote(@RequestBody Note note) { 
        return noteRepo.save(note); 
    }

    // 🔹 AJOUTER GET POUR NOTES
    @GetMapping("/notes")
    public List<Note> getAllNotes() {
        return noteRepo.findAll();
    }

    // ====================== SECTION SCORES ======================
    @PostMapping("/scores")
    public Score saveScore(@RequestBody Score score) { 
        return scoreRepo.save(score); 
    }

    // 🔹 AJOUTER GET POUR SCORES
    @GetMapping("/scores")
    public List<Score> getAllScores() {
        return scoreRepo.findAll();
    }

    // Récupérer les top 5 scores
    @GetMapping("/scores/top5")
    public List<Score> getTop5() { 
        return scoreRepo.findTop5ByOrderByValeurDesc(); 
    }
}
