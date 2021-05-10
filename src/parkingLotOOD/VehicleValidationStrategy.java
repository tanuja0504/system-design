package parkingLotOOD;

public interface VehicleValidationStrategy {
    void validate(VehicleEntryEvent vehicle) throws IllegitimateVehicleException;
}
