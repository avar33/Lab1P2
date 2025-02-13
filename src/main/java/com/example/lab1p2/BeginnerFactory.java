package com.example.lab1p2;

public class BeginnerFactory implements GUIGameFactoryIF{
    public CharPanel createCharPanel(){
        return new Beginner_Char() {};
    }
    public WeaponPanel createWeaponPanel(){
        return new Beginner_Weapon() {};
    }
}
