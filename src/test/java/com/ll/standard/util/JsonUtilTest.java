package com.ll.standard.util;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class JsonUtilTest {
   @Test
    @DisplayName("맵을 Json으로 바꿀 수 있다.")
    public void t1() {
       Map<String, Object> map = new HashMap<>();
       map.put("name", "이름");

       String jsonStr = Util.json.toString(map);

       assertThat(jsonStr).isEqualTo("""
            {
                "name" : "이름"
            }
            """.stripIndent());
    }

}