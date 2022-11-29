package com.devseth.batch.batch.config;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
class FirstJobListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("this is before Job" + jobExecution.getJobInstance().getJobName());
        System.out.println("this is param " + jobExecution.getJobParameters());
        System.out.println("this is context" + jobExecution.getExecutionContext());
        jobExecution.getExecutionContext().put("seth","seth value");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("this is after Job" + jobExecution.getJobInstance().getJobName());
        System.out.println("this is param " + jobExecution.getJobParameters());
        System.out.println("this is context" + jobExecution.getExecutionContext());
    }
}
