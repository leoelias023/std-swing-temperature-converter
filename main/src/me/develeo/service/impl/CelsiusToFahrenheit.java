package me.develeo.service.impl;

import java.math.BigDecimal;
import me.develeo.service.TemperatureConverter;

public class CelsiusToFahrenheit implements TemperatureConverter {

    @Override
    public BigDecimal convert(BigDecimal value) {

        if (value == null) {
            throw new IllegalArgumentException("A value of valid temperature in Celsius must be provided");
        }

        return value
            .multiply(BigDecimal.valueOf(1.8))
            .add(BigDecimal.valueOf(32));
    }
}
