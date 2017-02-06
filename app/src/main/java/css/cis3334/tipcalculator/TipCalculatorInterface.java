package css.cis3334.tipcalculator;

/**
 * Created by echicheko on 2/6/2017.
 */
public interface TipCalculatorInterface {
    Double calcTotalTip(Double bill);

    Double calcTipPerPerson(Double bill, Integer numPeople);
}
