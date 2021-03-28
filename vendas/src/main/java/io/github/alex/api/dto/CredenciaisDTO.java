package io.github.alex.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Alex
 */
@Data
@NoArgsConstructor
public class CredenciaisDTO {

    private String login;
    private String senha;

}
