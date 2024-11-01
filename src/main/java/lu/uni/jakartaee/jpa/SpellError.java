package lu.uni.jakartaee.jpa;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "spell_errors")
public class SpellError implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "wrong_word")
    private String wrongWord;

    @Column(name = "correct_word")
    private String correctWord;

    @Column(name = "context")
    private String context;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWrongWord() {
        return wrongWord;
    }

    public void setWrongWord(String wrongWord) {
        this.wrongWord = wrongWord;
    }

    public String getCorrectWord() {
        return correctWord;
    }

    public void setCorrectWord(String correctWord) {
        this.correctWord = correctWord;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "SpellError{" +
                "id=" + id +
                ", wrongWord='" + wrongWord + '\'' +
                ", correctWord='" + correctWord + '\'' +
                ", context='" + context + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
