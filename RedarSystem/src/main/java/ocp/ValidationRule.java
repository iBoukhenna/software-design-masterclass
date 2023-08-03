package ocp;
public interface ValidationRule {
    ValidationResult check(FlightPlan flightPlan);
}
