package com.ll.standard.util;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class JsonUtilTest {
   @Test
    @DisplayName("맵을 Json으로 바꿀 수 있다. (필드 1개")
    public void t1() {
       Map<String, Object> map = new HashMap<>();
       map.put("name", "이름");

       String jsonStr = Util.json.toString(map);

       assertThat(jsonStr).isEqualTo("""
            {
                "name" : "이름"
            }
            """.stripIndent().trim());
    }

    @Test
    @DisplayName("맵을 Json으로 바꿀 수 있다. (필드 2개")
    public void t2() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("name", "이름");
        map.put("gender", "남자");


        String jsonStr = Util.json.toString(map);

        assertThat(jsonStr).isEqualTo("""
            {
                "name" : "이름",
                "gender" : "남자"
            }
            """.stripIndent().trim());
    }

    @Test
    @DisplayName("맵을 Json으로 바꿀 수 있다. (숫자 필드)")
    public void t3() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("id", 1);
        map.put("name", "이름");
        map.put("gender", "남자");


        String jsonStr = Util.json.toString(map);

        assertThat(jsonStr).isEqualTo("""
            {
                "id" : 1,
                "name" : "이름",
                "gender" : "남자"
            }
            """.stripIndent().trim());
    }

    @Test
    @DisplayName("맵을 Json으로 바꿀 수 있다. (숫자(실수) 필드)")
    public void t4() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("id", 1);
        map.put("name", "이름");
        map.put("gender", "남자");
        map.put("height", 178.1543221);



        String jsonStr = Util.json.toString(map);

        assertThat(jsonStr).isEqualTo("""
            {
                "id" : 1,
                "name" : "이름",
                "gender" : "남자",
                "height" : 178.1543221
            }
            """.stripIndent().trim());
    }

    @Test
    @DisplayName("맵을 Json으로 바꿀 수 있다. (논리 필드)")
    public void t5() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("id", 1);
        map.put("name", "이름");
        map.put("gender", "남자");
        map.put("height", 178.1543221);
        map.put("married", true);




        String jsonStr = Util.json.toString(map);

        assertThat(jsonStr).isEqualTo("""
            {
                "id" : 1,
                "name" : "이름",
                "gender" : "남자",
                "height" : 178.1543221,
                "married" : true
            }
            """.stripIndent().trim());
    }

}