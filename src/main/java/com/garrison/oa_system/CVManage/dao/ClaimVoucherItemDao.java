package com.garrison.oa_system.CVManage.dao;

import com.garrison.oa_system.CVManage.entity.ClaimVoucherItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("claimVoucherItemDao")
public interface ClaimVoucherItemDao {
    public void insert(ClaimVoucherItem claimVoucherItem);
    public void update(ClaimVoucherItem claimVoucherItem);
    public void delete(int id);
    List<ClaimVoucherItem> selectByClaimVoucher(int cvid);
}
