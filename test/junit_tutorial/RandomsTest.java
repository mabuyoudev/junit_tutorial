package junit_tutorial;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RandomsTest {

  @Test
  public void choiceでAを返す() throws Exception {
    List<String> options = new ArrayList<String>();
    options.add("A");
    options.add("B");
    Randoms sut = new Randoms();
    // スタブの設定
    sut.generator = new RandomNumberGenerator() {
      @Override
      public int nextInt() {
        return 0;
      }
    };
  }

}
