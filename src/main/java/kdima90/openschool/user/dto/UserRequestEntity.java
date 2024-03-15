package kdima90.openschool.user.dto;

import lombok.Data;

import java.util.Locale;

@Data
public class UserRequestEntity{
   protected String firstname;
   protected String lastname;
   protected String email;
   protected String street;
   protected Integer streetNumber;
   protected String city;
   protected String postalCode;
   protected String federalState;
   protected Locale locale;
}