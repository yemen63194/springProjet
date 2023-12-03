package tn.esprit.se.springproject.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j

public class LoggingAspect {
    @Before("execution(* tn.esprit.se.springproject.service.BlocService.addBloc(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }

 //   @After("execution(* tn.esprit.se.springproject.service.*.*(..))")
 ///   public void logMethodExit(JoinPoint joinPoint) {
 ///       String name = joinPoint.getSignature().getName();
 //       log.info("In method " + name + " : ");
//    }
//    @AfterReturning("execution(* tn.esprit.se.springproject.service.*.*(..))")
//    public void logMethodExitwitherror(JoinPoint joinPoint) {
 //       String name = joinPoint.getSignature().getName();
 //       log.info("In method " + name + " : ");
//    }
//    @AfterThrowing("execution(* tn.esprit.se.springproject.service.*.*(..))")
  //  public void logMethodEXCEPTION(JoinPoint joinPoint) {
  //      String name = joinPoint.getSignature().getName();
  //      log.info("In method " + name + " : ");
  //  }


}