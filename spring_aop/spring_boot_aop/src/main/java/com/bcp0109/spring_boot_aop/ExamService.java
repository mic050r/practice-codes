package com.bcp0109.spring_boot_aop;

import com.bcp0109.spring_boot_aop.annotation.Trace;
import org.springframework.stereotype.Service;

@Service
public class ExamService {

    private final ExamRepository examRepository;

    public ExamService(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    @Trace
    public void request(String itemId) {
        examRepository.save(itemId);
    }
}
