package com.linkedin.bowser.test;

import org.antlr.gunit.gUnitBaseTest;

public class TestNQL extends gUnitBaseTest {
	
	public void setUp() {
		this.packagePath = "./com/linkedin/bowser/test";
		this.lexerPath = "com.linkedin.bowser.core.grammar.gen.NQLLexer";
		this.parserPath = "com.linkedin.bowser.core.grammar.gen.NQLParser";
	}

	public void testBooleanExpression1() throws Exception {
		// test input: "1"
		Object retval = execParser("booleanExpression", "1", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "1";

		assertEquals("testing rule "+"booleanExpression", expecting, actual);
	}

	public void testBooleanExpression2() throws Exception {
		// test input: "1 + 2"
		Object retval = execParser("booleanExpression", "1 + 2", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.AST, retval);
		Object expecting = "(+ 1 2)";

		assertEquals("testing rule "+"booleanExpression", expecting, actual);
	}

	public void testBooleanExpression3() throws Exception {
		// test input: "1 + (2 + 3)"
		Object retval = execParser("booleanExpression", "1 + (2 + 3)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.AST, retval);
		Object expecting = "(+ 1 (+ 2 3))";

		assertEquals("testing rule "+"booleanExpression", expecting, actual);
	}

	public void testBooleanExpression4() throws Exception {
		// test input: "(1 * 2) / 3"
		Object retval = execParser("booleanExpression", "(1 * 2) / 3", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.AST, retval);
		Object expecting = "(/ (* 1 2) 3)";

		assertEquals("testing rule "+"booleanExpression", expecting, actual);
	}

	public void testBooleanExpression5() throws Exception {
		// test input: "1 + 10/5"
		Object retval = execParser("booleanExpression", "1 + 10/5", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.AST, retval);
		Object expecting = "(+ 1 (/ 10 5))";

		assertEquals("testing rule "+"booleanExpression", expecting, actual);
	}

	public void testBooleanExpression6() throws Exception {
		// test input: "[1]"
		Object retval = execParser("booleanExpression", "[1]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.AST, retval);
		Object expecting = "(LIST 1)";

		assertEquals("testing rule "+"booleanExpression", expecting, actual);
	}

	public void testBooleanExpression7() throws Exception {
		// test input: "[]"
		Object retval = execParser("booleanExpression", "[]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "LIST";

		assertEquals("testing rule "+"booleanExpression", expecting, actual);
	}

	public void testBooleanExpression8() throws Exception {
		// test input: "[1,2,3]"
		Object retval = execParser("booleanExpression", "[1,2,3]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.AST, retval);
		Object expecting = "(LIST 1 2 3)";

		assertEquals("testing rule "+"booleanExpression", expecting, actual);
	}

	public void testBooleanExpression9() throws Exception {
		// test input: "[1,\"a\",3]"
		Object retval = execParser("booleanExpression", "[1,\"a\",3]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.AST, retval);
		Object expecting = "(LIST 1 \"a\" 3)";

		assertEquals("testing rule "+"booleanExpression", expecting, actual);
	}

	public void testBooleanExpression10() throws Exception {
		// test input: "[1,\"a\",[4,5,6]]"
		Object retval = execParser("booleanExpression", "[1,\"a\",[4,5,6]]", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.AST, retval);
		Object expecting = "(LIST 1 \"a\" (LIST 4 5 6))";

		assertEquals("testing rule "+"booleanExpression", expecting, actual);
	}

	public void testBooleanExpression11() throws Exception {
		// test input: "{1}"
		Object retval = execParser("booleanExpression", "{1}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.AST, retval);
		Object expecting = "(SET 1)";

		assertEquals("testing rule "+"booleanExpression", expecting, actual);
	}

	public void testBooleanExpression12() throws Exception {
		// test input: "{\"b\", 1, [1,2], (4,5,6)}"
		Object retval = execParser("booleanExpression", "{\"b\", 1, [1,2], (4,5,6)}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.AST, retval);
		Object expecting = "(SET \"b\" 1 (LIST 1 2) (TUPLE 4 5 6))";

		assertEquals("testing rule "+"booleanExpression", expecting, actual);
	}

	public void testBooleanExpression13() throws Exception {
		// test input: "{}"
		Object retval = execParser("booleanExpression", "{}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.STRING, retval);
		Object expecting = "MAP";

		assertEquals("testing rule "+"booleanExpression", expecting, actual);
	}

	public void testBooleanExpression14() throws Exception {
		// test input: "{1:2, 4 : 5}"
		Object retval = execParser("booleanExpression", "{1:2, 4 : 5}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.AST, retval);
		Object expecting = "(MAP 1 2 4 5)";

		assertEquals("testing rule "+"booleanExpression", expecting, actual);
	}



}