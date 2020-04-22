package com.practice.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AspectLogging {

	@Pointcut("execution(* com.practice.springaop.dao.*.*(..))")
	public void forDAOPackages() {

	}

	// @Before("execution(public void addAccount())")
	// @Before("execution(public void
	// com.practice.springaop.dao.AccountDAO.addAccount())")
	// @Before("execution(public void add*())")
	// @Before("execution(* add*())")
	// @Before("execution(* add*(com.practice.springaop.dao.Account))")
	// @Before("execution(* add*(com.practice.springaop.dao.Account,..))")
	// @Before("execution(* add*(..))")
	@Before("forDAOPackages()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n====>>> Executing @Before advice on addAccount()");
	}

	@Before("forDAOPackagesNotForGetterSetter()")
	public void afterAddAccountAdvice() {
		System.out.println("\n====>>> Executing Api Analystics");
	}

	@Pointcut("execution(* com.practice.springaop.dao.*.get*(..))")
	public void getter() {
	}

	@Pointcut("execution(* com.practice.springaop.dao.*.set*(..))")
	public void setter() {
	}

	@Pointcut("forDAOPackages() && !(getter()||setter())")
	public void forDAOPackagesNotForGetterSetter() {

	}
}
