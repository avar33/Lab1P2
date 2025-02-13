package com.example.lab1p2;

public class AdvancedFactory implements GUIGameFactoryIF{
    public CharPanel createCharPanel(){
        return new Advanced_Char() {};
    }
    public WeaponPanel createWeaponPanel(){
        return new Advanced_Weapon() {};
    }
}
