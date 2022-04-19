package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.domain.Country;
import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.domain.Currency;
import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
