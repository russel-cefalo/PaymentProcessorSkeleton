package com.cefalo.school.processor;


import com.cefalo.school.instrument.Instrument;
import com.cefalo.school.instrument.InstrumentType;

public class PaymentProcessor {
    public  void process(Instrument instrument, double amount) throws Exception{
        saveIntoDatabase(instrument, amount);
    }

    public void saveIntoDatabase(Instrument instrument, double amount){
        System.out.println("Saving data into database");
    }

}
