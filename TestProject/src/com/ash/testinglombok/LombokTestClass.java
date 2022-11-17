package com.ash.testinglombok;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class LombokTestClass {

	private String testString;
	private int testInt;
	private String anotherTestString;
	private int anotherTestInt;
	
	
}
