package kdima90.openschool.user.dto;

import lombok.Data;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;

import java.util.Locale;
import java.util.UUID;
@Data
public class SchoolMessage {
    private UUID id;
    private String name;
    private String street;
    private Integer streetNumber;
    private String city;
    private String postalCode;
    private String federalState;
    private Locale locale;
}
