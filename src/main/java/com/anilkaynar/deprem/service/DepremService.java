package com.example.demo.service;

import com.example.demo.dao.DepremDao;
import com.example.demo.model.Deprem;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepremService {
    public final DepremDao depremDao;


    public DepremService(@Qualifier("Kandilli")DepremDao depremDao) {
        this.depremDao = depremDao;
    }
    public List<Deprem> getDepremList(){
       List<Deprem> deprems= depremDao.getDepremList();
        return deprems;
    }
}
