package com.nantian.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nantian.dao.OIDMapper;
import com.nantian.entity.OID;
import com.nantian.service.OIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @project: uccp-practice
 * @ClassName: OIDServiceImpl
 * @author:
 * @date: 2021/7/19/0019 16:10
 */
@Service
public class OIDServiceImpl implements OIDService {
    @Autowired
    private OIDMapper oidMapper;

    @Override
    public int insertOID(OID oid) {
        return oidMapper.insertOID(oid);
    }

    @Override
    public int updateOID(OID oid) {
        return oidMapper.updateOIDById(oid);
    }

    @Override
    public List<OID> selectAllOIDs() {
        return oidMapper.selectAllOIDs();
    }

    @Override
    public OID selectOIDById(String oid) {
        return oidMapper.selectOIDById(oid);
    }

    @Override
    public int deleteOID(String id) {
        return oidMapper.deleteOIDById(id);
    }
}
