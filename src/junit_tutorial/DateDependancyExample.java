package junit_tutorial;

import java.util.Date;

public class DateDependancyExample {
  
  Date date = new Date();
  
  public void doSomething() {
    this.date = new Date();
    // 何らかの処理（省略）
  }
}
