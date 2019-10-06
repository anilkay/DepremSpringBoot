package com.example.demo.api;

import com.example.demo.model.Deprem;
import com.example.demo.service.DepremService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
Şimdilik Sadece Kandilli İmplementasyonunu kullanıyoruz.
 */
@RequestMapping("api/v1/deprem")
@RestController
public class DepremController {
    public final DepremService depremService;

    @Autowired
    public DepremController(DepremService depremService) {
        this.depremService = depremService;
    }
   @GetMapping()
   public List<Deprem> getAllDeprems(){
       return  depremService.getDepremList();
   }
}
