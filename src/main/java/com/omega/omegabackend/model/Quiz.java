package com.omega.omegabackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "quiz")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String questionText;

    @Column(columnDefinition = "TEXT") // Pour l'image de la question
    private String questionImage;

    private String option1Text;
    @Column(columnDefinition = "TEXT") // Pour l'image de l'option 1
    private String option1Image;

    private String option2Text;
    @Column(columnDefinition = "TEXT") // Pour l'image de l'option 2
    private String option2Image;

    private String option3Text;
    @Column(columnDefinition = "TEXT") // Pour l'image de l'option 3
    private String option3Image;

    private String option4Text;
    @Column(columnDefinition = "TEXT") // Pour l'image de l'option 4
    private String option4Image;

    private int correctOption;

    // --- CONSTRUCTEUR ---
    public Quiz() {}

    // --- GETTERS ET SETTERS ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getQuestionText() { return questionText; }
    public void setQuestionText(String questionText) { this.questionText = questionText; }

    public String getQuestionImage() { return questionImage; }
    public void setQuestionImage(String questionImage) { this.questionImage = questionImage; }

    public String getOption1Text() { return option1Text; }
    public void setOption1Text(String option1Text) { this.option1Text = option1Text; }

    public String getOption1Image() { return option1Image; }
    public void setOption1Image(String option1Image) { this.option1Image = option1Image; }

    public String getOption2Text() { return option2Text; }
    public void setOption2Text(String option2Text) { this.option2Text = option2Text; }

    public String getOption2Image() { return option2Image; }
    public void setOption2Image(String option2Image) { this.option2Image = option2Image; }

    public String getOption3Text() { return option3Text; }
    public void setOption3Text(String option3Text) { this.option3Text = option3Text; }

    public String getOption3Image() { return option3Image; }
    public void setOption3Image(String option3Image) { this.option3Image = option3Image; }

    public String getOption4Text() { return option4Text; }
    public void setOption4Text(String option4Text) { this.option4Text = option4Text; }

    public String getOption4Image() { return option4Image; }
    public void setOption4Image(String option4Image) { this.option4Image = option4Image; }

    public int getCorrectOption() { return correctOption; }
    public void setCorrectOption(int correctOption) { this.correctOption = correctOption; }
}
