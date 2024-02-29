package com.example.test.temp;

import java.rmi.ServerException;
import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TempService {

    private final TempRepository tempRepository;
    private final Logger mylog = LoggerFactory.getLogger("CONSOLE");

    public List<TempEntity> getAllDatas() {

        throw new NullPointerException();
        // return tempRepository.findAll();
    }

    public void saveData(TempEntity tempEntity) {
        tempRepository.save(tempEntity);
    }

}
