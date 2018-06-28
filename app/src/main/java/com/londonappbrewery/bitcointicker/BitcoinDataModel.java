package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

   private Double mLastBitcoinPriceDouble ;
   private String mLastBitcoinPriceString;

    public static BitcoinDataModel fromJson(JSONObject jsonObject){
        try {
            BitcoinDataModel bitcoin = new BitcoinDataModel();

            bitcoin.mLastBitcoinPriceDouble = jsonObject.getDouble("last");
            bitcoin.mLastBitcoinPriceString = Double.toString(bitcoin.mLastBitcoinPriceDouble);

            return bitcoin;
        }   catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getLastBitcoinPriceString() {
        return mLastBitcoinPriceString;
    }
}
