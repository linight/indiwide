package me.indiwide.indiwide;

import lombok.Data;

/**
 * @author Taras Maslov
 * 5/3/2018
 */
@Data
public class RootOvo {
    String value = "RESPONSE";

    public String getValue() {
        return value;
    }

    public RootOvo setValue(String value) {
        this.value = value;
        return this;
    }
}
