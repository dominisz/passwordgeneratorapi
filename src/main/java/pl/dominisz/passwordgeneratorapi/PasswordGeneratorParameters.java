package pl.dominisz.passwordgeneratorapi;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PasswordGeneratorParameters {

    private int passwordLength;
    private boolean includeSymbols;
    private boolean includeNumbers;
    private boolean includeLowercaseCharacters;
    private boolean includeUppercaseCharacters;

}

