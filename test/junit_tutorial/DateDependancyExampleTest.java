package junit_tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DateDependancyExampleTest {
  
  @Test
  public void doSomethingでdateに現在時刻が設定される() 
      throws Exception {
    DateDependancyExample sut = new DateDependancyExample();
    sut.doSomething();
    // このアサーションは実行タイミングによって
    // 成功にも失敗にもなる
    assertThat(sut.date, is(new Date()));
  }

}
