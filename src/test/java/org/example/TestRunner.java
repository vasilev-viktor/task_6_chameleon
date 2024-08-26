package org.example;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectDirectories;
import org.junit.platform.suite.api.Suite;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@Suite
@IncludeEngines("cucumber")
@SelectDirectories("src/test/resources/features")
@CucumberContextConfiguration
@ContextConfiguration("classpath:spring.xml")
@TestExecutionListeners(inheritListeners = false, listeners = {DependencyInjectionTestExecutionListener.class})
public class TestRunner {
}



//* страница "Список товаров" загружена
//        * ожидается элемент коллекции "Таблица" в течение "10" секунд с параметрами:
//        | field        | value        |
//        | Наименование | Наименование |
//        | Тип          | Тип          |
//        | Экзотический | Экзотический |
//        * количество элементов коллекции "Таблица" ровно "5"
//
//        * сохранить скриншот "Конец теста"
//        * закрыто текущее окно