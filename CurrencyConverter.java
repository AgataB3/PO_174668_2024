public class CurrencyConverter implements Converter {

    @Override
    public double convertToEuro(double amount) {
        return amount * 4.4;
    }

    @Override
    public double convertToUSD(double amount) {
        return amount * 4.2;
    }

    @Override
    public double getConversionRate(String currency) {
        if(currency.equals("Euro")) {
            return 4.4;
        }
        else if(currency.equals("USD")) {
            return 4.2;
        }
        else{
            return 0.0;
        }
    }
}
