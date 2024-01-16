package com.tondeuse.enums;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum ActionsEnum {

    AVANCER("A"),
    GAUCHE("G"),
    DROITE("D");

    private String actionCode;

    ActionsEnum(String codeAction) {
        this.actionCode = codeAction;
    }

    public static ActionsEnum recupererActionDeCode(String code){
        return Arrays.asList(ActionsEnum.values()).stream().filter(a -> a.actionCode.equals(code)).collect(Collectors.toList()).stream().findFirst().get();
    }
}
