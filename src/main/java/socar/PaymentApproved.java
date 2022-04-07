package socar;


public class PaymentApproved extends AbstractEvent {

    private Long payId;
    private Long rsvId;
    private Long carId;
    private String status;

    public PaymentApproved(){
        super();
    }

    public Long getPayId() {
        return payId;
    }

    public void setPayId(Long PayId) {
        this.payId = payId;
    }
    public Long getRsvId() {
        return rsvId;
    }

    public void setRsvId(Long RsvId) {
        this.rsvId = rsvId;
    }
    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long CarId) {
        this.carId = carId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String Status) {
        this.status = status;
    }
}
