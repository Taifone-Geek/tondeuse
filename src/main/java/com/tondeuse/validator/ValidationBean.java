package com.tondeuse.validator;

import com.tondeuse.dto.PelouseDto;
import com.tondeuse.dto.TondeuseDto;

import java.util.Optional;


public class ValidationBean {
    public boolean validerPelpuseDto(PelouseDto bean){
        return Optional.ofNullable(bean.getCoinSuperieur()).orElse("")
                .matches("^(\\s)*\\d(\\s)*\\d(\\s)*$");
    }

    public boolean validerTondeuseDto(TondeuseDto bean){
        return Optional.ofNullable(bean.getMouvement()).orElse("")
                            .matches("^[G DA]*$")
                && Optional.ofNullable(bean.getPosInitial()).orElse("")
                            .matches("^(\\s)*\\d(\\s)*\\d(\\s)*[\\sNEWS]$");
    }

}
