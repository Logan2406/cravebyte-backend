package com.cravebyte.cravebyte_backend.service;

import com.cravebyte.cravebyte_backend.dao.IdCounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdSequenceGenerator {

    private IdCounterRepository idCounterRepository;
    public IdSequenceGenerator(@Autowired IdCounterRepository idCounterRepository)
    {
        this.idCounterRepository = idCounterRepository;
    }

    public String foodIdGenerate()
    {
        return null;
    }

    public String foodCategoryIdGenerate()
    {
        return null;
    }

    public String foodCuisineIdGenerate()
    {
        return null;
    }

    public String foodUserIdGenerate()
    {
        return null;
    }

    public String restIdGenerate()
    {
        return null;
    }

    public String orderIdGenerate()
    {
        return null;
    }

    public String cartIdGenerate()
    {
        return null;
    }
}
