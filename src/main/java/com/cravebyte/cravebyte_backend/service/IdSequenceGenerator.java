package com.cravebyte.cravebyte_backend.service;

import com.cravebyte.cravebyte_backend.dao.IdCounterRepository;
import com.cravebyte.cravebyte_backend.entities.IdCounter;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class IdSequenceGenerator {

    private final IdCounterRepository idCounterRepository;
    public IdSequenceGenerator(@Autowired IdCounterRepository idCounterRepository)
    {
        this.idCounterRepository = idCounterRepository;
    }

    @Transactional
    public String foodIdGenerate(String restID)
    {
        restID = restID.split("-")[0];
        String prefix = "FD-"+restID;

        //check if the prefix present in the database or not

        Optional<IdCounter> counterVal= this.idCounterRepository.findByPrefix(prefix);
        IdCounter next = counterVal.orElse(null);

        if(next!=null)
        {
            int val = next.getLastNum();
            this.idCounterRepository.updateLastNumber(prefix,val+1);
            prefix = prefix+"-"+String.format("%03d",val);
        }
        else
        {
            int val = 1;
            IdCounter idCounter = new IdCounter();
            idCounter.setPrefix(prefix);
            idCounter.setLastNum(val+1);
            this.idCounterRepository.save(idCounter);
            prefix = prefix+"-"+String.format("%03d",val);
        }


        return prefix;
    }

    @Transactional
    public String foodCategoryIdGenerate(String catName)
    {
        String prefix = "CAT";

        Optional<IdCounter> counterVal = this.idCounterRepository.findByPrefix(prefix);
        IdCounter next =counterVal.orElse(null);

        if(next!=null)
        {
            int val = next.getLastNum();
            this.idCounterRepository.updateLastNumber(prefix,val+1);
            prefix = prefix+"-"+String.format("%03d",val);

        }
        else
        {
            int val = 1;
            IdCounter counter = new IdCounter();
            counter.setLastNum(val+1);
            counter.setPrefix(prefix);
            this.idCounterRepository.save(counter);
            prefix = prefix+"-"+String.format("%03d",val);

        }

        return prefix;
    }

    @Transactional
    public String foodCuisineIdGenerate()
    {
        String prefix = "CUI";
        Optional<IdCounter> counterVal = this.idCounterRepository.findByPrefix(prefix);
        IdCounter next = counterVal.orElse(null);

        if(next!=null)
        {
            int val = next.getLastNum();
            this.idCounterRepository.updateLastNumber(prefix,val+1);
            prefix = prefix+"-"+String.format("%03d",val);
        }
        else
        {
            int val = 1;
            IdCounter counter = new IdCounter();
            counter.setLastNum(val+1);
            counter.setPrefix(prefix);
            this.idCounterRepository.save(counter);
            prefix = prefix+"-"+String.format("%03d",val);
        }
        return prefix;

    }

    @Transactional
    public String foodUserIdGenerate(String role)
    {
        String prefix = "USR";
        if(role.equals("ADMIN"))
        {
            prefix = "ADM";
        }
        else if (role.equals("MANAGER"))
        {
            prefix= "MAN";
        }
        else if (role.equals("OWNER"))
        {
            prefix = "OWN";
        }
        else if (role.equals("STAFF"))
        {
            prefix = "STF";
        }
        Optional<IdCounter> counterVal = this.idCounterRepository.findByPrefix(prefix);
        IdCounter next = counterVal.orElse(null);

        if(next!=null)
        {
            int val = next.getLastNum();
            this.idCounterRepository.updateLastNumber(prefix,val+1);
            prefix = prefix+"-"+String.format("%03d",val);
        }
        else
        {
            int val = 1;
            IdCounter counter = new IdCounter();
            counter.setLastNum(val+1);
            counter.setPrefix(prefix);
            this.idCounterRepository.save(counter);
            prefix = prefix+"-"+String.format("%03d",val);
        }

        return prefix;
    }

    @Transactional
    public String restIdGenerate()
    {
        String prefix = "RST";
        Optional<IdCounter> counterVal = this.idCounterRepository.findByPrefix(prefix);
        IdCounter next = counterVal.orElse(null);

        if(next!=null)
        {
            int val = next.getLastNum();
            this.idCounterRepository.updateLastNumber(prefix,val+1);
            prefix = prefix+"-"+String.format("%03d",val);
        }
        else
        {
            int val = 1;
            IdCounter counter = new IdCounter();
            counter.setLastNum(val+1);
            counter.setPrefix(prefix);
            this.idCounterRepository.save(counter);
            prefix = prefix+"-"+String.format("%03d",val);
        }

        return prefix;

    }

    @Transactional
    public String orderIdGenerate(String userId)
    {
        //it won't be generated through counter, it will ge generated using the timestamp value

        String prefix = "ORDER-"+userId;
        String milliFormatted = String.valueOf(Instant.now().toEpochMilli());
        prefix = prefix+'-'+milliFormatted;

        return prefix;
    }

    @Transactional
    public String cartIdGenerate(String userId)
    {
        //it won't be generated through counter, it will ge generated using the timestamp value

        String prefix ="CART-"+userId;
        String milliFormatted = String.valueOf(Instant.now().toEpochMilli());
        prefix = prefix+'-'+milliFormatted;

        return prefix;
    }
}
