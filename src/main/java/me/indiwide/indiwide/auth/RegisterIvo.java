package me.indiwide.indiwide.auth;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @author Taras Maslov
 * 5/3/2018
 */
@Data
class RegisterIvo {
    @Length(min = 8, max = 100)
    String login;
    
    @Length(min = 8, max = 100)
    String password;
}
