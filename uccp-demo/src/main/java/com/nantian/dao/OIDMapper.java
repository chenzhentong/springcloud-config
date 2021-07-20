package com.nantian.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nantian.entity.OID;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @project: uccp-practice
 * @ClassName: OIDMapper
 * @author:
 * @date: 2021/7/19/0019 16:05
 */
@Mapper
public interface OIDMapper extends BaseMapper<OID> {

    List<OID> selectAllOIDs();
    OID selectOIDById(String oid);
    int updateOIDById(OID oid);
    int deleteOIDById(String id);
    int insertOID(OID oid);

}
