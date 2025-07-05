package com.punit.merchant_management.service;

import com.punit.merchant_management.entity.TestEntity;
import com.punit.merchant_management.model.TestModel;
import com.punit.merchant_management.repository.TestRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public TestEntity saveTestEntity(TestModel testModel) {
        TestEntity testEntity = new TestEntity();
        BeanUtils.copyProperties(testModel, testEntity);
        TestEntity save = testRepository.save(testEntity);
        return save;
    }
}
