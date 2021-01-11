package com.garrison.oa_system.CVManage.dao;

import com.garrison.oa_system.CVManage.entity.ClaimVoucher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("claimVoucherDao")
public interface ClaimVoucherDao {
    public void insert(ClaimVoucher claimVoucher);
    public void update(ClaimVoucher claimVoucher);
    public void delete(int id);

    ClaimVoucher select(int id);
    List<ClaimVoucher> selectByCreateSn(String csn);
    List<ClaimVoucher> selectByNextDealSn(String ndsn);
}
