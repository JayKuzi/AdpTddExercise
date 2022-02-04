package za.ac.cput;

public class JodyKearns {
    private double measurement;
    private String unitOfMeasurement;

    public JodyKearns(double measurement, String unitOfMeasurement) {
        this.measurement = measurement;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public String measurementConverter() {

        switch (unitOfMeasurement.toUpperCase()) {
            case "CM":
                return "The measurement in Inches is: " + (measurement / 2.54);
            case "F":
                return "The measurement in Centimeters is: " + (measurement * 2.54);
            default:
                return "Invalid unit of measurement";
        }

    }

    public double getMeasurement() {
        return measurement;
    }

    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    @Override
    public String toString() {
        return "Measurement = " + measurement + ", Unit of measurement = " + unitOfMeasurement;
    }

}
