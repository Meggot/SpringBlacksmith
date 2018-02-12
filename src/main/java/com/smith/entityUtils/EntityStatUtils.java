package com.smith.entityUtils;

import com.smith.model.playerModels.StatType;

import java.util.ArrayList;
import java.util.List;

public class EntityStatUtils {
    public static List<StatType> getGenericStats() {
        return new ArrayList<StatType>() {{
            add(StatType.AbilityPower);
            add(StatType.Agilty);
            add(StatType.CriticalStrike);
            add(StatType.Damage);
            add(StatType.Focus);
            add(StatType.Mana);
            add(StatType.Stamina);
        }};
    }
}
