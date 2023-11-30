package com.htth.web.mapper;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

public class ClassConverter implements Converter<Integer,String> {

    @Override
    public String convert(MappingContext<Integer, String> context) {
        Integer clazzValue= context.getSource();
        switch (clazzValue){
            case 1: return "Võ Sĩ";
            case 2: return "Kiếm Sĩ";
            case 3: return "Đầu Bếp";
            case 4: return "Hoa Tiêu";
            case 5: return "Xạ Thủ";
            default: return null;
        }
    }
}
