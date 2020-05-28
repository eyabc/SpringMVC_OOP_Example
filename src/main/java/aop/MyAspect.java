package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @Pointcut("execution(* runSomething())")
    private void iampc() {
        // anything
    }
    @Before("iampc()")
    public void before(JoinPoint joinPoint) {
        System.out.println("얼굴 인식 확인: 문을 개방하라. ");
//        System.out.println("열쇠로 문을 열고 집에 들어간다. ");
    }
    @After("iampc()")
    public void lockDoor(JoinPoint joinPoint) {
        System.out.println("주인님 나갔다! 어이 문 잠가!! ");
    }
}
