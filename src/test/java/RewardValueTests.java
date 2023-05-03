import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        int milesValue = 28571;
        assertEquals(milesValue, RewardValue.convertToMiles(cashValue));
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double cashValue = 35;
        assertEquals(cashValue, RewardValue.convertToCash(milesValue));
    }
}
