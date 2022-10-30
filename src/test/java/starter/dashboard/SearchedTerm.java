package starter.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SearchedTerm implements Question<String> {

    public static Question<String> value(){
        return new SearchedTerm();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(SearchedTermOverview.SEARCHED_TERM).getText().trim();
    }
}
