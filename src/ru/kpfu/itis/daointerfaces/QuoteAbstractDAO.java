package ru.kpfu.itis.daointerfaces;

import ru.kpfu.itis.entities.Quote;
import ru.kpfu.itis.entities.Theme;

import java.util.List;

/**
 * Created by Ilya on 25.11.2015.
 */
public interface QuoteAbstractDAO extends AbstractDAO<Quote, String> {
    public List<Quote> getQuoteByTheme(Theme theme);
    public Quote getBy
}
