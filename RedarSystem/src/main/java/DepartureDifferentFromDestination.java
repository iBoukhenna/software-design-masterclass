public class DepartureDifferentFromDestination implements ValidationRule {

    @Override
    public ValidationResult check(FlightPlan flightPlan) {
        var result = new ValidationResult();
        if (flightPlan.getDeparture() == null && flightPlan.getDeparture().equals(flightPlan.getDestination())) {
            result.errors().add("Departure and destination are the same");
        }

        return result;
    }
}
