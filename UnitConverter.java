public class UnitConverter implements Converter {

    @Override
    public double convertToEuro(double amount) {
        return amount * 1.2;
    }

    @Override
    public double convertToUSD(double amount) {
        return amount * 1.9;
    }

    @Override
    public double getConversionRate(String currency) {
        if(currency.equals("Euro")) {
            return 1.2;
        }
        else if(currency.equals("USD")) {
            return 1.9;
        }
        else{
            return 0.0;
        }
    }
}
