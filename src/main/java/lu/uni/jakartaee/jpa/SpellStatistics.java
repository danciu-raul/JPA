package lu.uni.jakartaee.jpa;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "spell_statistics")
public class SpellStatistics implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "wrong_word")
    private String wrongWord;

    @Column(name = "correct_word")
    private String correctWord;

    @Column(name = "occurrence_count")
    private Integer occurrenceCount;

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

    public Integer getOccurrenceCount() {
        return occurrenceCount;
    }

    public void setOccurrenceCount(Integer occurrenceCount) {
        this.occurrenceCount = occurrenceCount;
    }

    @Override
    public String toString() {
        return "SpellStatistics{" +
                "id=" + id +
                ", wrongWord='" + wrongWord + '\'' +
                ", correctWord='" + correctWord + '\'' +
                ", occurrenceCount=" + occurrenceCount +
                '}';
    }
}
