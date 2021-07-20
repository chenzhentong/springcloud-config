package com.nantian.controller;

import com.nantian.entity.OID;
import com.nantian.service.OIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @project: uccp-practice
 * @ClassName: OIDController
 * @author:
 * @date: 2021/7/19/0019 16:15
 */
@Controller
@RequestMapping("/oid")
public class OIDController {

    @Autowired
    private OIDService oidService;

    @RequestMapping("/index")
    public String index(Model model){
        List<OID> oidList = oidService.selectAllOIDs();
        model.addAttribute("oidList",oidList);
        return "oidList";
    }
    @RequestMapping("/{id}")
    @ResponseBody
    public OID selectById(@PathVariable String id){
        OID oid = oidService.selectOIDById(id);
        return oid;
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<OID> selectAll(){
        List<OID> oidList = oidService.selectAllOIDs();
        return oidList;
    }

    @RequestMapping("/delete/{id}")
    public String deleteOID(@PathVariable("id") String id, HttpServletResponse response) throws IOException {
        System.out.println("delete");
        oidService.deleteOID(id);
        response.sendRedirect("/uccp/oid/index");
        return null;
    }

    @GetMapping("/update/{id}")
    public String goUpdate(@PathVariable("id") String id,Model model) {
        OID oid = oidService.selectOIDById(id);
        model.addAttribute("oid",oid);
        return "updateOID";
    }

    @PostMapping(value = "/update",consumes = {"application/x-www-form-urlencoded"})
    public String updateOID( OID oid,HttpServletResponse response) throws IOException {
        System.out.println(oid);
        oidService.updateOID(oid);
        response.sendRedirect("/uccp/oid/index");
        return null;
    }

    @PostMapping(value = "/insert",consumes = {"application/x-www-form-urlencoded"})
    public String insertOID(OID oid, HttpServletResponse response) throws IOException {
        String id = UUID.randomUUID().toString();
        oid.setOID(id);
        oidService.insertOID(oid);
        response.sendRedirect("/uccp/oid/index");
        return null;
    }

    @GetMapping("/insert")
    public String insertOID() {
        return "insertOID";
    }
}
