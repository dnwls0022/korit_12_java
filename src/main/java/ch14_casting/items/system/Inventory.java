package ch14_casting.items.system;

import ch14_casting.items.*; // *의 별칭은 하위의 클래스를 모두 import

public class Inventory {
    //필드생성
    private Weapon[] weaponSlots;

    //생성자
    public Inventory(int slot) {
        this.weaponSlots = new Weapon[slot];
    }

    //메서드 명 addWeapon(Weapon weapon)
    public void addWeapon(Weapon weapon) {
        //for문
        for (int i = 0; i < weaponSlots.length; i++) {
            if (weaponSlots[i] == null) {
                weaponSlots[i] = weapon;
                System.out.println((i + 1) + "번 슬롯에 무기를 창작했습니다. ");
                return;
            }

        }
        System.out.println("인벤토리가 가득 찼습니다.");

    }

    //메서드생성 attackAll()
    public void attackAll() {
        for (Weapon weapon : weaponSlots) {
            if (weapon != null) {
                weapon.attack();
                continue;
            }
            System.out.println("무기장착 x");

        }
    }
    //메서드생성 useSpecialAbilities()

    public void useSpecialAbilities() {
        System.out.println("다운캐스팅");
        for (Weapon weapon : weaponSlots) {
            if (weapon == null) {
                System.out.println("무기장착 x 스킬 x");
                continue;
            }
            if (weapon instanceof Sword) {
                Sword sword = (Sword) weapon;
                sword.parry();
            } else if (weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                bow.snipe();
            } else if (weapon instanceof Staff) {
                Staff staff = (Staff) weapon;
                staff.castSpell();
            } else
                System.out.println();
        }
    }
    //중괄호 세미콜론 대소문자
}

