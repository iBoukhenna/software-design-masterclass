public class CallSignNotEmpty implements ValidationRule {

    @Override
    public ValidationResult check(FlightPlan flightPlan) {
        var result = new ValidationResult();
        if (flightPlan.getCallSign() == null || flightPlan.getCallSign().equals("")) {
            result.errors().add("CallSign is empty");
        }

        return result;
    }
}
