package com.example.lab1p2;

public class AdvancedFactory implements GUIGameFactoryIF{
    public CharPanel createCharPanel(){
//        Advanced_Char advCharPane = new Advanced_Char() {
//            @Override
//            public void setBackground() {
//                super.setBackground();
//            }
//
//            @Override
//            public void addCharacter() {
//                super.addCharacter();
//            }
//        };
        return new Advanced_Char() {};
    }
    public WeaponPanel createWeaponPanel(){
        Advanced_Weapon advWeapon = new Advanced_Weapon() {
            @Override
            public void setBackground() {
                super.setBackground();
            }
            @Override
            public void addWeapon(){
                super.addWeapon();
            }
        };
        return advWeapon;
    }
}
