package credit;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BidResponse {
    private boolean isApproved;
    private BigDecimal amount;

    public BidResponse(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public BidResponse(boolean isApproved, BigDecimal amount) {
        this.isApproved = isApproved;
        this.amount = amount;
    }
}
