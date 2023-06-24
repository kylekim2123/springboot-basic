package com.devcourse.voucherapp.entity.voucher;

import java.util.UUID;

public class FixDiscountVoucher implements Voucher {

    private final UUID voucherId;
    private final int discountPrice;

    public FixDiscountVoucher(UUID voucherId, int discountPrice) {
        this.voucherId = voucherId;
        this.discountPrice = discountPrice;
    }

    @Override
    public UUID getVoucherId() {
        return voucherId;
    }

    @Override
    public String toString() {
        return voucherId + ", 고정 할인, " + discountPrice + "원";
    }
}
