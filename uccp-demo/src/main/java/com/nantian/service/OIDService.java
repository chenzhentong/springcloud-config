package com.nantian.service;

import com.nantian.entity.OID;

import java.util.List;

/**
 * @project: uccp-practice
 * @ClassName: OIDService
 * @author:
 * @date: 2021/7/19/0019 16:08
 */

public interface OIDService {
    int insertOID(OID oid);
    int updateOID(OID oid);
    List<OID> selectAllOIDs();
    OID selectOIDById(String oid);
    int deleteOID(String id);

}
