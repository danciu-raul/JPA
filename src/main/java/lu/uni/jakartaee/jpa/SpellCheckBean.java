package lu.uni.jakartaee.jpa;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.inject.Inject;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Named("spellCheck")
@SessionScoped
public class SpellCheckBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final Logger logger = Logger.getLogger(SpellCheckBean.class.getName());

    private String inputText;
    private List<SpellError> errors;

    @Inject
    private SpellCheckService spellCheckService;

    public void checkSpelling() {
        logger.info("Checking spelling for input: " + inputText);
        try {
            errors = spellCheckService.checkText(inputText);
            logger.info("Spelling check completed with " + errors.size() + " errors found.");
        } catch (IOException e) {
            logger.severe("Error during spell check: " + e.getMessage());
        }
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public List<SpellError> getErrors() {
        return errors;
    }

    public void setErrors(List<SpellError> errors) {
        this.errors = errors;
    }
}
