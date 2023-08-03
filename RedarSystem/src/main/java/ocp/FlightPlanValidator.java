package ocp;
import java.util.ArrayList;
import java.util.List;

public class FlightPlanValidator {
    private final List<ValidationRule> rules = new ArrayList<>();

    public void registerRule(ValidationRule rule) {
        this.rules.add(rule);
    }

    public ValidationResult validate(FlightPlan flightPlan) {
        var combinedValidationResult = new ValidationResult();
        rules.forEach(rule -> {
            var result = rule.check(flightPlan);
            combinedValidationResult.errors().addAll(result.errors());
        });
        return combinedValidationResult;
    }
}
