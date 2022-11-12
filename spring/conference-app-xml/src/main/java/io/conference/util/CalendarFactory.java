package io.conference.util;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

public class CalendarFactory implements FactoryBean<Calendar> {

    private Calendar instance = Calendar.getInstance();

    @Override
    @Nullable
    public Calendar getObject() throws Exception {
        return instance;
    }

    @Override
    @Nullable
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    public void addDays(int num) {
        instance.add(Calendar.DAY_OF_YEAR, num);
    }    
}
