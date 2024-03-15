package kdima90.openschool.user.dto;

import java.util.Locale;
import java.util.UUID;

public record UserResponseEntity(
    UUID id,
    String name,
    String street,
    Integer streetNumber,
    String city,
    String postalCode,
    String federalState,
    Locale locale) {}
