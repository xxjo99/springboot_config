package com.example.test.temp;

import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;

import com.example.test.exception.ApiRuntimeException;
import com.example.test.exception.ExceptionType;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TempService {

    private final TempRepository tempRepository;
    private final Logger mylog = LoggerFactory.getLogger("CONSOLE");

    public List<TempEntity> getAllDatas() {

        // String name = null;
        // name.substring(0);

        throw new ApiRuntimeException(ExceptionType.SERVER_ERROR);
        // return tempRepository.findAll();
    }

    public void saveData(TempEntity tempEntity) {
        tempRepository.save(tempEntity);
    }

}
