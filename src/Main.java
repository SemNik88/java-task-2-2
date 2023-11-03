
public class Main {
    public static void main(String[] args) {

// Объявляем переменные для входных данных и
// параметров программы: начального счёта,
// суммы пополнения и тп
        int initialBalance = 500; // в рублях
        int replenishmentAmount = 1500; // в рублях
        int bonusThreshold = 1000; // в рублях
        int bonusRate = 1; // в рублях за каждые 100 рублей пополнения

// Условным оператором проверяем, превысила ли
// сумма пополнения порог, и для этих двух разных
// сценариев рассчитываем сумму бонуса и выводим
// на экран.
        int bonus;
        if (replenishmentAmount > bonusThreshold) {
            // Если сумма пополнения больше порога, то бонус равен
            // количеству полных 100 рублей в сумме пополнения, умноженному на ставку бонуса
            bonus = (replenishmentAmount / 100) * bonusRate;
        } else {
            // Если сумма пополнения меньше или равна порогу, то бонус равен нулю
            bonus = 0;
        }

// Рассчитываем итоговый счёт, прибавляя к начальному балансу
// сумму пополнения и сумму бонуса
        int finalBalance = initialBalance + replenishmentAmount + bonus;

// Выводим результат на экран
        System.out.println("Начальный баланс: " + initialBalance + " рублей");
        System.out.println("Сумма пополнения: " + replenishmentAmount + " рублей");
        System.out.println("Бонус: " + bonus + " рублей");
        System.out.println("Итоговый баланс: " + finalBalance + " рублей");

    }
}