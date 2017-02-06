package css.cis3334.tipcalculator;

/**
 * Created by echicheko on 2/6/2017.
 */
public class TipCalculator implements TipCalculatorInterface {

    //private Double bill;
    //private Integer numPeople;
    private Double TotalTip;
    private Double tipPerPerson;
    final Double BASIC_TIP = 0.1;

    @Override
    public Double calcTotalTip(Double bill) {
        TotalTip = bill * BASIC_TIP;
        return TotalTip;

    }
    @Override
    public Double calcTipPerPerson(Double bill, Integer numPeople){

        tipPerPerson = calcTotalTip(bill) /numPeople;
        return tipPerPerson;

    }
}