package com.fluidity.weather.service;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.util.HashMap;

@Service
public class YahooService extends YahooWeatherService implements IWeatherService<Channel> {

    private static final HashMap<String, String> woeIds;
    static {

        woeIds = new HashMap<>();
        woeIds.put("vienna", "551801");
        woeIds.put("newyork", "2459115");
        woeIds.put("milan", "718345");//added
        //woeIds.put("sydney", "1105779");
        woeIds.put("victoria", "1411024");
        woeIds.put("stimier", "784266");
    }

    public YahooService() throws JAXBException {
        super();
    }

    @Override
    public Channel getForecast(String city) throws Exception {
        return getForecast(woeIds.get(city), DegreeUnit.CELSIUS);
    }
}
