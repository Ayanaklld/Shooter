public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                new Gun(),
                new MachineGun(),
                new RPG(),
                new SlightShot(),
                new WaterGun()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot >= weaponSlots.length) {
            System.out.println("Игрок лезет в корман №" + slot + ", но там пусто... может стоит поискать оружие в других карманах?");
            return;
        }

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot - 1];
        // Огонь!
        weapon.shot();
    }
}
