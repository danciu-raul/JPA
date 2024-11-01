package lu.uni.jakartaee.jpa;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Named("statistics")
@SessionScoped
public class StatisticsBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final Logger logger = Logger.getLogger(StatisticsBean.class.getName());

    private int topCount = 10;
    private List<SpellStatistics> topErrors;

    @Inject
    private SpellCheckService spellCheckService;

    public void loadStatistics() {
        logger.info("Loading statistics with top count: " + topCount);
        topErrors = spellCheckService.getTopErrors(topCount);
        logger.info("Statistics loaded with " + topErrors.size() + " entries.");
    }

    public int getTopCount() {
        return topCount;
    }

    public void setTopCount(int topCount) {
        this.topCount = topCount;
    }

    public List<SpellStatistics> getTopErrors() {
        return topErrors;
    }

    public void setTopErrors(List<SpellStatistics> topErrors) {
        this.topErrors = topErrors;
    }
}
