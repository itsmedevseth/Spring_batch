package com.devseth.batch.batch.Listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class FirstStepListener implements StepExecutionListener {
    @Override
    public void beforeStep(StepExecution stepExecution) {
        System.out.println("before Step " + stepExecution.getStepName());
        System.out.println("Job exec cont " + stepExecution.getJobExecution().getExecutionContext());
        System.out.println("Step exec const " + stepExecution.getExecutionContext());
        stepExecution.getExecutionContext().put("sec", "sec value");

    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        System.out.println("after Step " + stepExecution.getStepName());
        System.out.println("Job exec cont " + stepExecution.getJobExecution().getExecutionContext());
        System.out.println("Step exec const " + stepExecution.getExecutionContext());
        return null;
    }
}
