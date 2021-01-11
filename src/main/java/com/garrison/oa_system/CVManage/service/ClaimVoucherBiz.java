package com.garrison.oa_system.CVManage.service;

import com.garrison.oa_system.CVManage.entity.ClaimVoucher;
import com.garrison.oa_system.CVManage.entity.ClaimVoucherItem;
import com.garrison.oa_system.CVManage.entity.DealRecord;

import java.util.List;

public interface ClaimVoucherBiz {
    public void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);
    ClaimVoucher get(int id);
    List<ClaimVoucherItem> getItems(int cvid);
    List<DealRecord> getRecords(int cvid);
    List<ClaimVoucher> getForself(String sn);
    List<ClaimVoucher> getForDeal(String sn);

    public void update(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);
    public void submit(int id);
    public void deal(DealRecord dealRecord);

}
