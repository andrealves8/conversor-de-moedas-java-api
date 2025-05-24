package conversordemoedas.model.dto;

import java.util.Map;

public record ConversorTaxasDTO(Map<String, Double> conversion_rates) {
}
