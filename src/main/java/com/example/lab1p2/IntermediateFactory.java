package com.example.lab1p2;

public class IntermediateFactory implements GUIGameFactoryIF{
    public CharPanel createCharPanel(){
        return new Intermediate_Char(){};
    }
    public WeaponPanel createWeaponPanel(){
        return new Intermediate_Weapon() {};
    }
}
