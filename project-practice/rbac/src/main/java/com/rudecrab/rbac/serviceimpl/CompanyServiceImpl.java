package com.rudecrab.rbac.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rudecrab.rbac.mapper.CompanyMapper;
import com.rudecrab.rbac.model.entity.Company;
import com.rudecrab.rbac.service.CompanyService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

/**
 * @author RudeCrab
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyService {
    @Override
    public Set<Long> getIdsByUserId(Long userId) {
        return baseMapper.selectIdsByUserId(userId);
    }

    @Override
    public void removeByUserId(Serializable userId) {
        baseMapper.deleteByUserId(userId);
    }

    @Override
    public void insertCompanyByUserId(Long userId, Collection<Long> companyIds) {
        baseMapper.insertCompanyByUserId(userId, companyIds);
    }
}
