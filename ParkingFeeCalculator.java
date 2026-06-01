public class ParkingFeeCalculator {
    String vehicleNumber;
    int hoursParked;
    String vehicleType;
    int parkingFee;

    public ParkingFeeCalculator(String vehicleNumber, int hoursParked, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.hoursParked = hoursParked;
        this.vehicleType = vehicleType;
        switch (vehicleType.toLowerCase()) {
            case "bike":
                parkingFee = hoursParked * 10;
                break;
            case "car":
                parkingFee = hoursParked * 30;
                break;
            case "bus":
                parkingFee = hoursParked * 50;
                break;
            default:
                parkingFee = 0;
                break;
        }
    }

    public void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Hours Parked: " + hoursParked);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Fee: ₹" + parkingFee);
    }

    public static void main(String[] args) {
        ParkingFeeCalculator ticket = new ParkingFeeCalculator("KA01AB1234", 4, "Car");
        ticket.display();
    }
}
