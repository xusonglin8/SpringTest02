package com.cn.tai.pojo;
 
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;
@ConfigurationProperties("user")
@Configuration
@Component
@Data
@ToString
@PropertySource({"classpath:application-dev.properties","classpath:application-dev.properties"})
public class User {
		/*@Override
		public String toString() {
			return "ConfigBean [name=" + name + ", age=" + age + ", number=" + number + ", value=" + value + "]";
		}*/

		private String name;
		private int age;
		private String number;
		private String value;

		/*public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;

		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
*/
	}

