package tn.esprit.test_ms.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.test_ms.entities.Test;
import tn.esprit.test_ms.repositories.TestRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class TestServiceImp implements TestService{
    TestRepository testRepository;

    @Override
    public List<Test> getAllTests() {
        return testRepository.findAll();
    }

    @Override
    public Test addTest(Test f) {
        return testRepository.save(f);
    }

    @Override
    public Test updateTest(Test f) {
        return testRepository.save(f);
    }

    @Override
    public Test getTestById(long idTest) {
        return testRepository.findById(idTest).orElse(null);
    }

    @Override
    public void deleteTest(long idTest) {
        testRepository.deleteById(idTest);
    }
}
