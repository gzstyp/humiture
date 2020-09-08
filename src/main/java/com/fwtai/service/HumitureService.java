package com.fwtai.service;

import com.fwtai.dao.DaoHandle;
import com.fwtai.tool.ToolClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 楼层的货位号管理
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-28 10:21
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@Service
public class HumitureService{

    @Autowired
    private DaoHandle daoHandle;

    public String listData(){
        List<Map<String,Object>> list = daoHandle.queryForListMap("humiture.getListData");
        return ToolClient.queryJson(list);
    }
}