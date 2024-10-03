// Generated from SQLiteParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, ABORT_=25, 
		ACTION_=26, ADD_=27, AFTER_=28, ALL_=29, ALTER_=30, ANALYZE_=31, AND_=32, 
		AS_=33, ASC_=34, ATTACH_=35, AUTOINCREMENT_=36, BEFORE_=37, BEGIN_=38, 
		BETWEEN_=39, BY_=40, CASCADE_=41, CASE_=42, CAST_=43, CHECK_=44, COLLATE_=45, 
		COLUMN_=46, COMMIT_=47, CONFLICT_=48, CONSTRAINT_=49, CREATE_=50, CROSS_=51, 
		CURRENT_DATE_=52, CURRENT_TIME_=53, CURRENT_TIMESTAMP_=54, DATABASE_=55, 
		DEFAULT_=56, DEFERRABLE_=57, DEFERRED_=58, DELETE_=59, DESC_=60, DETACH_=61, 
		DISTINCT_=62, DROP_=63, EACH_=64, ELSE_=65, END_=66, ESCAPE_=67, EXCEPT_=68, 
		EXCLUSIVE_=69, EXISTS_=70, EXPLAIN_=71, FAIL_=72, FOR_=73, FOREIGN_=74, 
		FROM_=75, FULL_=76, GLOB_=77, GROUP_=78, HAVING_=79, IF_=80, IGNORE_=81, 
		IMMEDIATE_=82, IN_=83, INDEX_=84, INDEXED_=85, INITIALLY_=86, INNER_=87, 
		INSERT_=88, INSTEAD_=89, INTERSECT_=90, INTO_=91, IS_=92, ISNULL_=93, 
		JOIN_=94, KEY_=95, LEFT_=96, LIKE_=97, LIMIT_=98, MATCH_=99, NATURAL_=100, 
		NO_=101, NOT_=102, NOTNULL_=103, NULL_=104, OF_=105, OFFSET_=106, ON_=107, 
		OR_=108, ORDER_=109, OUTER_=110, PLAN_=111, PRAGMA_=112, PRIMARY_=113, 
		QUERY_=114, RAISE_=115, RECURSIVE_=116, REFERENCES_=117, REGEXP_=118, 
		REINDEX_=119, RELEASE_=120, RENAME_=121, REPLACE_=122, RESTRICT_=123, 
		RETURNING_=124, RIGHT_=125, ROLLBACK_=126, ROW_=127, ROWS_=128, SAVEPOINT_=129, 
		SELECT_=130, SET_=131, TABLE_=132, TEMP_=133, TEMPORARY_=134, THEN_=135, 
		TO_=136, TRANSACTION_=137, TRIGGER_=138, UNION_=139, UNIQUE_=140, UPDATE_=141, 
		USING_=142, VACUUM_=143, VALUES_=144, VIEW_=145, VIRTUAL_=146, WHEN_=147, 
		WHERE_=148, WITH_=149, WITHOUT_=150, FIRST_VALUE_=151, OVER_=152, PARTITION_=153, 
		RANGE_=154, PRECEDING_=155, UNBOUNDED_=156, CURRENT_=157, FOLLOWING_=158, 
		CUME_DIST_=159, DENSE_RANK_=160, LAG_=161, LAST_VALUE_=162, LEAD_=163, 
		NTH_VALUE_=164, NTILE_=165, PERCENT_RANK_=166, RANK_=167, ROW_NUMBER_=168, 
		GENERATED_=169, ALWAYS_=170, STORED_=171, TRUE_=172, FALSE_=173, WINDOW_=174, 
		NULLS_=175, FIRST_=176, LAST_=177, FILTER_=178, GROUPS_=179, EXCLUDE_=180, 
		TIES_=181, OTHERS_=182, DO_=183, NOTHING_=184, IDENTIFIER=185, NUMERIC_LITERAL=186, 
		BIND_PARAMETER=187, STRING_LITERAL=188, BLOB_LITERAL=189, SINGLE_LINE_COMMENT=190, 
		MULTILINE_COMMENT=191, SPACES=192, UNEXPECTED_CHAR=193;
	public static final int
		RULE_parse = 0, RULE_sql_stmt_list = 1, RULE_sql_stmt = 2, RULE_alter_table_stmt = 3, 
		RULE_analyze_stmt = 4, RULE_attach_stmt = 5, RULE_begin_stmt = 6, RULE_commit_stmt = 7, 
		RULE_rollback_stmt = 8, RULE_savepoint_stmt = 9, RULE_release_stmt = 10, 
		RULE_create_index_stmt = 11, RULE_indexed_column = 12, RULE_create_table_stmt = 13, 
		RULE_column_def = 14, RULE_type_name = 15, RULE_column_constraint = 16, 
		RULE_signed_number = 17, RULE_table_constraint = 18, RULE_foreign_key_clause = 19, 
		RULE_conflict_clause = 20, RULE_create_trigger_stmt = 21, RULE_create_view_stmt = 22, 
		RULE_create_virtual_table_stmt = 23, RULE_with_clause = 24, RULE_cte_table_name = 25, 
		RULE_recursive_cte = 26, RULE_common_table_expression = 27, RULE_delete_stmt = 28, 
		RULE_delete_stmt_limited = 29, RULE_detach_stmt = 30, RULE_drop_stmt = 31, 
		RULE_expr = 32, RULE_raise_function = 33, RULE_literal_value = 34, RULE_value_row = 35, 
		RULE_values_clause = 36, RULE_insert_stmt = 37, RULE_returning_clause = 38, 
		RULE_upsert_clause = 39, RULE_pragma_stmt = 40, RULE_pragma_value = 41, 
		RULE_reindex_stmt = 42, RULE_select_stmt = 43, RULE_join_clause = 44, 
		RULE_select_core = 45, RULE_factored_select_stmt = 46, RULE_simple_select_stmt = 47, 
		RULE_compound_select_stmt = 48, RULE_table_or_subquery = 49, RULE_result_column = 50, 
		RULE_join_operator = 51, RULE_join_constraint = 52, RULE_compound_operator = 53, 
		RULE_update_stmt = 54, RULE_column_name_list = 55, RULE_update_stmt_limited = 56, 
		RULE_qualified_table_name = 57, RULE_vacuum_stmt = 58, RULE_filter_clause = 59, 
		RULE_window_defn = 60, RULE_over_clause = 61, RULE_frame_spec = 62, RULE_frame_clause = 63, 
		RULE_simple_function_invocation = 64, RULE_aggregate_function_invocation = 65, 
		RULE_window_function_invocation = 66, RULE_common_table_stmt = 67, RULE_order_by_stmt = 68, 
		RULE_limit_stmt = 69, RULE_ordering_term = 70, RULE_asc_desc = 71, RULE_frame_left = 72, 
		RULE_frame_right = 73, RULE_frame_single = 74, RULE_window_function = 75, 
		RULE_offset = 76, RULE_default_value = 77, RULE_partition_by = 78, RULE_order_by_expr = 79, 
		RULE_order_by_expr_asc_desc = 80, RULE_expr_asc_desc = 81, RULE_initial_select = 82, 
		RULE_recursive_select = 83, RULE_unary_operator = 84, RULE_error_message = 85, 
		RULE_module_argument = 86, RULE_column_alias = 87, RULE_keyword = 88, 
		RULE_name = 89, RULE_function_name = 90, RULE_schema_name = 91, RULE_table_name = 92, 
		RULE_table_or_index_name = 93, RULE_column_name = 94, RULE_collation_name = 95, 
		RULE_foreign_table = 96, RULE_index_name = 97, RULE_trigger_name = 98, 
		RULE_view_name = 99, RULE_module_name = 100, RULE_pragma_name = 101, RULE_savepoint_name = 102, 
		RULE_table_alias = 103, RULE_transaction_name = 104, RULE_window_name = 105, 
		RULE_alias = 106, RULE_filename = 107, RULE_base_window_name = 108, RULE_simple_func = 109, 
		RULE_aggregate_func = 110, RULE_table_function_name = 111, RULE_any_name = 112;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
			"attach_stmt", "begin_stmt", "commit_stmt", "rollback_stmt", "savepoint_stmt", 
			"release_stmt", "create_index_stmt", "indexed_column", "create_table_stmt", 
			"column_def", "type_name", "column_constraint", "signed_number", "table_constraint", 
			"foreign_key_clause", "conflict_clause", "create_trigger_stmt", "create_view_stmt", 
			"create_virtual_table_stmt", "with_clause", "cte_table_name", "recursive_cte", 
			"common_table_expression", "delete_stmt", "delete_stmt_limited", "detach_stmt", 
			"drop_stmt", "expr", "raise_function", "literal_value", "value_row", 
			"values_clause", "insert_stmt", "returning_clause", "upsert_clause", 
			"pragma_stmt", "pragma_value", "reindex_stmt", "select_stmt", "join_clause", 
			"select_core", "factored_select_stmt", "simple_select_stmt", "compound_select_stmt", 
			"table_or_subquery", "result_column", "join_operator", "join_constraint", 
			"compound_operator", "update_stmt", "column_name_list", "update_stmt_limited", 
			"qualified_table_name", "vacuum_stmt", "filter_clause", "window_defn", 
			"over_clause", "frame_spec", "frame_clause", "simple_function_invocation", 
			"aggregate_function_invocation", "window_function_invocation", "common_table_stmt", 
			"order_by_stmt", "limit_stmt", "ordering_term", "asc_desc", "frame_left", 
			"frame_right", "frame_single", "window_function", "offset", "default_value", 
			"partition_by", "order_by_expr", "order_by_expr_asc_desc", "expr_asc_desc", 
			"initial_select", "recursive_select", "unary_operator", "error_message", 
			"module_argument", "column_alias", "keyword", "name", "function_name", 
			"schema_name", "table_name", "table_or_index_name", "column_name", "collation_name", 
			"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
			"pragma_name", "savepoint_name", "table_alias", "transaction_name", "window_name", 
			"alias", "filename", "base_window_name", "simple_func", "aggregate_func", 
			"table_function_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'", "'ABORT'", "'ACTION'", "'ADD'", 
			"'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'AS'", "'ASC'", 
			"'ATTACH'", "'AUTOINCREMENT'", "'BEFORE'", "'BEGIN'", "'BETWEEN'", "'BY'", 
			"'CASCADE'", "'CASE'", "'CAST'", "'CHECK'", "'COLLATE'", "'COLUMN'", 
			"'COMMIT'", "'CONFLICT'", "'CONSTRAINT'", "'CREATE'", "'CROSS'", "'CURRENT_DATE'", 
			"'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'DATABASE'", "'DEFAULT'", "'DEFERRABLE'", 
			"'DEFERRED'", "'DELETE'", "'DESC'", "'DETACH'", "'DISTINCT'", "'DROP'", 
			"'EACH'", "'ELSE'", "'END'", "'ESCAPE'", "'EXCEPT'", "'EXCLUSIVE'", "'EXISTS'", 
			"'EXPLAIN'", "'FAIL'", "'FOR'", "'FOREIGN'", "'FROM'", "'FULL'", "'GLOB'", 
			"'GROUP'", "'HAVING'", "'IF'", "'IGNORE'", "'IMMEDIATE'", "'IN'", "'INDEX'", 
			"'INDEXED'", "'INITIALLY'", "'INNER'", "'INSERT'", "'INSTEAD'", "'INTERSECT'", 
			"'INTO'", "'IS'", "'ISNULL'", "'JOIN'", "'KEY'", "'LEFT'", "'LIKE'", 
			"'LIMIT'", "'MATCH'", "'NATURAL'", "'NO'", "'NOT'", "'NOTNULL'", "'NULL'", 
			"'OF'", "'OFFSET'", "'ON'", "'OR'", "'ORDER'", "'OUTER'", "'PLAN'", "'PRAGMA'", 
			"'PRIMARY'", "'QUERY'", "'RAISE'", "'RECURSIVE'", "'REFERENCES'", "'REGEXP'", 
			"'REINDEX'", "'RELEASE'", "'RENAME'", "'REPLACE'", "'RESTRICT'", "'RETURNING'", 
			"'RIGHT'", "'ROLLBACK'", "'ROW'", "'ROWS'", "'SAVEPOINT'", "'SELECT'", 
			"'SET'", "'TABLE'", "'TEMP'", "'TEMPORARY'", "'THEN'", "'TO'", "'TRANSACTION'", 
			"'TRIGGER'", "'UNION'", "'UNIQUE'", "'UPDATE'", "'USING'", "'VACUUM'", 
			"'VALUES'", "'VIEW'", "'VIRTUAL'", "'WHEN'", "'WHERE'", "'WITH'", "'WITHOUT'", 
			"'FIRST_VALUE'", "'OVER'", "'PARTITION'", "'RANGE'", "'PRECEDING'", "'UNBOUNDED'", 
			"'CURRENT'", "'FOLLOWING'", "'CUME_DIST'", "'DENSE_RANK'", "'LAG'", "'LAST_VALUE'", 
			"'LEAD'", "'NTH_VALUE'", "'NTILE'", "'PERCENT_RANK'", "'RANK'", "'ROW_NUMBER'", 
			"'GENERATED'", "'ALWAYS'", "'STORED'", "'TRUE'", "'FALSE'", "'WINDOW'", 
			"'NULLS'", "'FIRST'", "'LAST'", "'FILTER'", "'GROUPS'", "'EXCLUDE'", 
			"'TIES'", "'OTHERS'", "'DO'", "'NOTHING'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "ABORT_", 
			"ACTION_", "ADD_", "AFTER_", "ALL_", "ALTER_", "ANALYZE_", "AND_", "AS_", 
			"ASC_", "ATTACH_", "AUTOINCREMENT_", "BEFORE_", "BEGIN_", "BETWEEN_", 
			"BY_", "CASCADE_", "CASE_", "CAST_", "CHECK_", "COLLATE_", "COLUMN_", 
			"COMMIT_", "CONFLICT_", "CONSTRAINT_", "CREATE_", "CROSS_", "CURRENT_DATE_", 
			"CURRENT_TIME_", "CURRENT_TIMESTAMP_", "DATABASE_", "DEFAULT_", "DEFERRABLE_", 
			"DEFERRED_", "DELETE_", "DESC_", "DETACH_", "DISTINCT_", "DROP_", "EACH_", 
			"ELSE_", "END_", "ESCAPE_", "EXCEPT_", "EXCLUSIVE_", "EXISTS_", "EXPLAIN_", 
			"FAIL_", "FOR_", "FOREIGN_", "FROM_", "FULL_", "GLOB_", "GROUP_", "HAVING_", 
			"IF_", "IGNORE_", "IMMEDIATE_", "IN_", "INDEX_", "INDEXED_", "INITIALLY_", 
			"INNER_", "INSERT_", "INSTEAD_", "INTERSECT_", "INTO_", "IS_", "ISNULL_", 
			"JOIN_", "KEY_", "LEFT_", "LIKE_", "LIMIT_", "MATCH_", "NATURAL_", "NO_", 
			"NOT_", "NOTNULL_", "NULL_", "OF_", "OFFSET_", "ON_", "OR_", "ORDER_", 
			"OUTER_", "PLAN_", "PRAGMA_", "PRIMARY_", "QUERY_", "RAISE_", "RECURSIVE_", 
			"REFERENCES_", "REGEXP_", "REINDEX_", "RELEASE_", "RENAME_", "REPLACE_", 
			"RESTRICT_", "RETURNING_", "RIGHT_", "ROLLBACK_", "ROW_", "ROWS_", "SAVEPOINT_", 
			"SELECT_", "SET_", "TABLE_", "TEMP_", "TEMPORARY_", "THEN_", "TO_", "TRANSACTION_", 
			"TRIGGER_", "UNION_", "UNIQUE_", "UPDATE_", "USING_", "VACUUM_", "VALUES_", 
			"VIEW_", "VIRTUAL_", "WHEN_", "WHERE_", "WITH_", "WITHOUT_", "FIRST_VALUE_", 
			"OVER_", "PARTITION_", "RANGE_", "PRECEDING_", "UNBOUNDED_", "CURRENT_", 
			"FOLLOWING_", "CUME_DIST_", "DENSE_RANK_", "LAG_", "LAST_VALUE_", "LEAD_", 
			"NTH_VALUE_", "NTILE_", "PERCENT_RANK_", "RANK_", "ROW_NUMBER_", "GENERATED_", 
			"ALWAYS_", "STORED_", "TRUE_", "FALSE_", "WINDOW_", "NULLS_", "FIRST_", 
			"LAST_", "FILTER_", "GROUPS_", "EXCLUDE_", "TIES_", "OTHERS_", "DO_", 
			"NOTHING_", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLiteParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLiteParser(TokenStream input) {
		super(input);
		// System.out.println("johnson");
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLiteParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << ALTER_) | (1L << ANALYZE_) | (1L << ATTACH_) | (1L << BEGIN_) | (1L << COMMIT_) | (1L << CREATE_) | (1L << DELETE_) | (1L << DETACH_) | (1L << DROP_))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (END_ - 66)) | (1L << (EXPLAIN_ - 66)) | (1L << (INSERT_ - 66)) | (1L << (PRAGMA_ - 66)) | (1L << (REINDEX_ - 66)) | (1L << (RELEASE_ - 66)) | (1L << (REPLACE_ - 66)) | (1L << (ROLLBACK_ - 66)) | (1L << (SAVEPOINT_ - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (SELECT_ - 130)) | (1L << (UPDATE_ - 130)) | (1L << (VACUUM_ - 130)) | (1L << (VALUES_ - 130)) | (1L << (WITH_ - 130)))) != 0)) {
				{
				{
				setState(226);
				sql_stmt_list();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(234);
				match(SCOL);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			sql_stmt();
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(241);
						match(SCOL);
						}
						}
						setState(244); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(246);
					sql_stmt();
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(252);
					match(SCOL);
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_stmtContext drop_stmt() {
			return getRuleContext(Drop_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode EXPLAIN_() { return getToken(SQLiteParser.EXPLAIN_, 0); }
		public TerminalNode QUERY_() { return getToken(SQLiteParser.QUERY_, 0); }
		public TerminalNode PLAN_() { return getToken(SQLiteParser.PLAN_, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPLAIN_) {
				{
				setState(258);
				match(EXPLAIN_);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY_) {
					{
					setState(259);
					match(QUERY_);
					setState(260);
					match(PLAN_);
					}
				}

				}
			}

			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(265);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(266);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(267);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(268);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(269);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(270);
				create_index_stmt();
				}
				break;
			case 7:
				{
				setState(271);
				create_table_stmt();
				}
				break;
			case 8:
				{
				setState(272);
				create_trigger_stmt();
				}
				break;
			case 9:
				{
				setState(273);
				create_view_stmt();
				}
				break;
			case 10:
				{
				setState(274);
				create_virtual_table_stmt();
				}
				break;
			case 11:
				{
				setState(275);
				delete_stmt();
				}
				break;
			case 12:
				{
				setState(276);
				delete_stmt_limited();
				}
				break;
			case 13:
				{
				setState(277);
				detach_stmt();
				}
				break;
			case 14:
				{
				setState(278);
				drop_stmt();
				}
				break;
			case 15:
				{
				setState(279);
				insert_stmt();
				}
				break;
			case 16:
				{
				setState(280);
				pragma_stmt();
				}
				break;
			case 17:
				{
				setState(281);
				reindex_stmt();
				}
				break;
			case 18:
				{
				setState(282);
				release_stmt();
				}
				break;
			case 19:
				{
				setState(283);
				rollback_stmt();
				}
				break;
			case 20:
				{
				setState(284);
				savepoint_stmt();
				}
				break;
			case 21:
				{
				setState(285);
				select_stmt();
				}
				break;
			case 22:
				{
				setState(286);
				update_stmt();
				}
				break;
			case 23:
				{
				setState(287);
				update_stmt_limited();
				}
				break;
			case 24:
				{
				setState(288);
				vacuum_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public Table_nameContext new_table_name;
		public Column_nameContext old_column_name;
		public Column_nameContext new_column_name;
		public TerminalNode ALTER_() { return getToken(SQLiteParser.ALTER_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode RENAME_() { return getToken(SQLiteParser.RENAME_, 0); }
		public TerminalNode ADD_() { return getToken(SQLiteParser.ADD_, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode DROP_() { return getToken(SQLiteParser.DROP_, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode TO_() { return getToken(SQLiteParser.TO_, 0); }
		public TerminalNode COLUMN_() { return getToken(SQLiteParser.COLUMN_, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(ALTER_);
			setState(292);
			match(TABLE_);
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(293);
				schema_name();
				setState(294);
				match(DOT);
				}
				break;
			}
			setState(298);
			table_name();
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RENAME_:
				{
				setState(299);
				match(RENAME_);
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(300);
					match(TO_);
					setState(301);
					((Alter_table_stmtContext)_localctx).new_table_name = table_name();
					}
					break;
				case 2:
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(302);
						match(COLUMN_);
						}
						break;
					}
					setState(305);
					((Alter_table_stmtContext)_localctx).old_column_name = column_name();
					setState(306);
					match(TO_);
					setState(307);
					((Alter_table_stmtContext)_localctx).new_column_name = column_name();
					}
					break;
				}
				}
				break;
			case ADD_:
				{
				setState(311);
				match(ADD_);
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(312);
					match(COLUMN_);
					}
					break;
				}
				setState(315);
				column_def();
				}
				break;
			case DROP_:
				{
				setState(316);
				match(DROP_);
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(317);
					match(COLUMN_);
					}
					break;
				}
				setState(320);
				column_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode ANALYZE_() { return getToken(SQLiteParser.ANALYZE_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAnalyze_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(ANALYZE_);
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(324);
				schema_name();
				}
				break;
			case 2:
				{
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(325);
					schema_name();
					setState(326);
					match(DOT);
					}
					break;
				}
				setState(330);
				table_or_index_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode ATTACH_() { return getToken(SQLiteParser.ATTACH_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DATABASE_() { return getToken(SQLiteParser.DATABASE_, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAttach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ATTACH_);
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(334);
				match(DATABASE_);
				}
				break;
			}
			setState(337);
			expr(0);
			setState(338);
			match(AS_);
			setState(339);
			schema_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode BEGIN_() { return getToken(SQLiteParser.BEGIN_, 0); }
		public TerminalNode TRANSACTION_() { return getToken(SQLiteParser.TRANSACTION_, 0); }
		public TerminalNode DEFERRED_() { return getToken(SQLiteParser.DEFERRED_, 0); }
		public TerminalNode IMMEDIATE_() { return getToken(SQLiteParser.IMMEDIATE_, 0); }
		public TerminalNode EXCLUSIVE_() { return getToken(SQLiteParser.EXCLUSIVE_, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitBegin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(BEGIN_);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (DEFERRED_ - 58)) | (1L << (EXCLUSIVE_ - 58)) | (1L << (IMMEDIATE_ - 58)))) != 0)) {
				{
				setState(342);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (DEFERRED_ - 58)) | (1L << (EXCLUSIVE_ - 58)) | (1L << (IMMEDIATE_ - 58)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION_) {
				{
				setState(345);
				match(TRANSACTION_);
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(346);
					transaction_name();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode COMMIT_() { return getToken(SQLiteParser.COMMIT_, 0); }
		public TerminalNode END_() { return getToken(SQLiteParser.END_, 0); }
		public TerminalNode TRANSACTION_() { return getToken(SQLiteParser.TRANSACTION_, 0); }
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !(_la==COMMIT_ || _la==END_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION_) {
				{
				setState(352);
				match(TRANSACTION_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode TRANSACTION_() { return getToken(SQLiteParser.TRANSACTION_, 0); }
		public TerminalNode TO_() { return getToken(SQLiteParser.TO_, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode SAVEPOINT_() { return getToken(SQLiteParser.SAVEPOINT_, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(ROLLBACK_);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION_) {
				{
				setState(356);
				match(TRANSACTION_);
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO_) {
				{
				setState(359);
				match(TO_);
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(360);
					match(SAVEPOINT_);
					}
					break;
				}
				setState(363);
				savepoint_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode SAVEPOINT_() { return getToken(SQLiteParser.SAVEPOINT_, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSavepoint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(SAVEPOINT_);
			setState(367);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode RELEASE_() { return getToken(SQLiteParser.RELEASE_, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode SAVEPOINT_() { return getToken(SQLiteParser.SAVEPOINT_, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitRelease_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(RELEASE_);
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(370);
				match(SAVEPOINT_);
				}
				break;
			}
			setState(373);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode INDEX_() { return getToken(SQLiteParser.INDEX_, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(CREATE_);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE_) {
				{
				setState(376);
				match(UNIQUE_);
				}
			}

			setState(379);
			match(INDEX_);
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(380);
				match(IF_);
				setState(381);
				match(NOT_);
				setState(382);
				match(EXISTS_);
				}
				break;
			}
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(385);
				schema_name();
				setState(386);
				match(DOT);
				}
				break;
			}
			setState(390);
			index_name();
			setState(391);
			match(ON_);
			setState(392);
			table_name();
			setState(393);
			match(OPEN_PAR);
			setState(394);
			indexed_column();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(395);
				match(COMMA);
				setState(396);
				indexed_column();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(CLOSE_PAR);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(403);
				match(WHERE_);
				setState(404);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(407);
				column_name();
				}
				break;
			case 2:
				{
				setState(408);
				expr(0);
				}
				break;
			}
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE_) {
				{
				setState(411);
				match(COLLATE_);
				setState(412);
				collation_name();
				}
			}

			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(415);
				asc_desc();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public Token row_ROW_ID;
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode TEMP_() { return getToken(SQLiteParser.TEMP_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(SQLiteParser.TEMPORARY_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode WITHOUT_() { return getToken(SQLiteParser.WITHOUT_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(CREATE_);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMP_ || _la==TEMPORARY_) {
				{
				setState(419);
				_la = _input.LA(1);
				if ( !(_la==TEMP_ || _la==TEMPORARY_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(422);
			match(TABLE_);
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(423);
				match(IF_);
				setState(424);
				match(NOT_);
				setState(425);
				match(EXISTS_);
				}
				break;
			}
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(428);
				schema_name();
				setState(429);
				match(DOT);
				}
				break;
			}
			setState(433);
			table_name();
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(434);
				match(OPEN_PAR);
				setState(435);
				column_def();
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(436);
						match(COMMA);
						setState(437);
						column_def();
						}
						} 
					}
					setState(442);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(443);
					match(COMMA);
					setState(444);
					table_constraint();
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(450);
				match(CLOSE_PAR);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHOUT_) {
					{
					setState(451);
					match(WITHOUT_);
					setState(452);
					((Create_table_stmtContext)_localctx).row_ROW_ID = match(IDENTIFIER);
					}
				}

				}
				break;
			case AS_:
				{
				setState(455);
				match(AS_);
				setState(456);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			column_name();
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(460);
				type_name();
				}
				break;
			}
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS_) | (1L << CHECK_) | (1L << COLLATE_) | (1L << CONSTRAINT_) | (1L << DEFAULT_))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (NOT_ - 102)) | (1L << (NULL_ - 102)) | (1L << (PRIMARY_ - 102)) | (1L << (REFERENCES_ - 102)) | (1L << (UNIQUE_ - 102)))) != 0) || _la==GENERATED_) {
				{
				{
				setState(463);
				column_constraint();
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(469);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(472); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(474);
				match(OPEN_PAR);
				setState(475);
				signed_number();
				setState(476);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(478);
				match(OPEN_PAR);
				setState(479);
				signed_number();
				setState(480);
				match(COMMA);
				setState(481);
				signed_number();
				setState(482);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode CHECK_() { return getToken(SQLiteParser.CHECK_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode DEFAULT_() { return getToken(SQLiteParser.DEFAULT_, 0); }
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public TerminalNode CONSTRAINT_() { return getToken(SQLiteParser.CONSTRAINT_, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode PRIMARY_() { return getToken(SQLiteParser.PRIMARY_, 0); }
		public TerminalNode KEY_() { return getToken(SQLiteParser.KEY_, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode GENERATED_() { return getToken(SQLiteParser.GENERATED_, 0); }
		public TerminalNode ALWAYS_() { return getToken(SQLiteParser.ALWAYS_, 0); }
		public TerminalNode STORED_() { return getToken(SQLiteParser.STORED_, 0); }
		public TerminalNode VIRTUAL_() { return getToken(SQLiteParser.VIRTUAL_, 0); }
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public TerminalNode AUTOINCREMENT_() { return getToken(SQLiteParser.AUTOINCREMENT_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_) {
				{
				setState(486);
				match(CONSTRAINT_);
				setState(487);
				name();
				}
			}

			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY_:
				{
				{
				setState(490);
				match(PRIMARY_);
				setState(491);
				match(KEY_);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC_ || _la==DESC_) {
					{
					setState(492);
					asc_desc();
					}
				}

				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(495);
					conflict_clause();
					}
				}

				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUTOINCREMENT_) {
					{
					setState(498);
					match(AUTOINCREMENT_);
					}
				}

				}
				}
				break;
			case NOT_:
			case NULL_:
			case UNIQUE_:
				{
				setState(506);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT_:
				case NULL_:
					{
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT_) {
						{
						setState(501);
						match(NOT_);
						}
					}

					setState(504);
					match(NULL_);
					}
					break;
				case UNIQUE_:
					{
					setState(505);
					match(UNIQUE_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(508);
					conflict_clause();
					}
				}

				}
				break;
			case CHECK_:
				{
				setState(511);
				match(CHECK_);
				setState(512);
				match(OPEN_PAR);
				setState(513);
				expr(0);
				setState(514);
				match(CLOSE_PAR);
				}
				break;
			case DEFAULT_:
				{
				setState(516);
				match(DEFAULT_);
				setState(523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(517);
					signed_number();
					}
					break;
				case 2:
					{
					setState(518);
					literal_value();
					}
					break;
				case 3:
					{
					setState(519);
					match(OPEN_PAR);
					setState(520);
					expr(0);
					setState(521);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case COLLATE_:
				{
				setState(525);
				match(COLLATE_);
				setState(526);
				collation_name();
				}
				break;
			case REFERENCES_:
				{
				setState(527);
				foreign_key_clause();
				}
				break;
			case AS_:
			case GENERATED_:
				{
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GENERATED_) {
					{
					setState(528);
					match(GENERATED_);
					setState(529);
					match(ALWAYS_);
					}
				}

				setState(532);
				match(AS_);
				setState(533);
				match(OPEN_PAR);
				setState(534);
				expr(0);
				setState(535);
				match(CLOSE_PAR);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRTUAL_ || _la==STORED_) {
					{
					setState(536);
					_la = _input.LA(1);
					if ( !(_la==VIRTUAL_ || _la==STORED_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(541);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(544);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode CHECK_() { return getToken(SQLiteParser.CHECK_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FOREIGN_() { return getToken(SQLiteParser.FOREIGN_, 0); }
		public TerminalNode KEY_() { return getToken(SQLiteParser.KEY_, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode CONSTRAINT_() { return getToken(SQLiteParser.CONSTRAINT_, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode PRIMARY_() { return getToken(SQLiteParser.PRIMARY_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_) {
				{
				setState(546);
				match(CONSTRAINT_);
				setState(547);
				name();
				}
			}

			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY_:
			case UNIQUE_:
				{
				setState(553);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIMARY_:
					{
					setState(550);
					match(PRIMARY_);
					setState(551);
					match(KEY_);
					}
					break;
				case UNIQUE_:
					{
					setState(552);
					match(UNIQUE_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(555);
				match(OPEN_PAR);
				setState(556);
				indexed_column();
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(557);
					match(COMMA);
					setState(558);
					indexed_column();
					}
					}
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(564);
				match(CLOSE_PAR);
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(565);
					conflict_clause();
					}
				}

				}
				break;
			case CHECK_:
				{
				setState(568);
				match(CHECK_);
				setState(569);
				match(OPEN_PAR);
				setState(570);
				expr(0);
				setState(571);
				match(CLOSE_PAR);
				}
				break;
			case FOREIGN_:
				{
				setState(573);
				match(FOREIGN_);
				setState(574);
				match(KEY_);
				setState(575);
				match(OPEN_PAR);
				setState(576);
				column_name();
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(577);
					match(COMMA);
					setState(578);
					column_name();
					}
					}
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(584);
				match(CLOSE_PAR);
				setState(585);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode REFERENCES_() { return getToken(SQLiteParser.REFERENCES_, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> ON_() { return getTokens(SQLiteParser.ON_); }
		public TerminalNode ON_(int i) {
			return getToken(SQLiteParser.ON_, i);
		}
		public List<TerminalNode> MATCH_() { return getTokens(SQLiteParser.MATCH_); }
		public TerminalNode MATCH_(int i) {
			return getToken(SQLiteParser.MATCH_, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode DEFERRABLE_() { return getToken(SQLiteParser.DEFERRABLE_, 0); }
		public List<TerminalNode> DELETE_() { return getTokens(SQLiteParser.DELETE_); }
		public TerminalNode DELETE_(int i) {
			return getToken(SQLiteParser.DELETE_, i);
		}
		public List<TerminalNode> UPDATE_() { return getTokens(SQLiteParser.UPDATE_); }
		public TerminalNode UPDATE_(int i) {
			return getToken(SQLiteParser.UPDATE_, i);
		}
		public List<TerminalNode> SET_() { return getTokens(SQLiteParser.SET_); }
		public TerminalNode SET_(int i) {
			return getToken(SQLiteParser.SET_, i);
		}
		public List<TerminalNode> CASCADE_() { return getTokens(SQLiteParser.CASCADE_); }
		public TerminalNode CASCADE_(int i) {
			return getToken(SQLiteParser.CASCADE_, i);
		}
		public List<TerminalNode> RESTRICT_() { return getTokens(SQLiteParser.RESTRICT_); }
		public TerminalNode RESTRICT_(int i) {
			return getToken(SQLiteParser.RESTRICT_, i);
		}
		public List<TerminalNode> NO_() { return getTokens(SQLiteParser.NO_); }
		public TerminalNode NO_(int i) {
			return getToken(SQLiteParser.NO_, i);
		}
		public List<TerminalNode> ACTION_() { return getTokens(SQLiteParser.ACTION_); }
		public TerminalNode ACTION_(int i) {
			return getToken(SQLiteParser.ACTION_, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<TerminalNode> NULL_() { return getTokens(SQLiteParser.NULL_); }
		public TerminalNode NULL_(int i) {
			return getToken(SQLiteParser.NULL_, i);
		}
		public List<TerminalNode> DEFAULT_() { return getTokens(SQLiteParser.DEFAULT_); }
		public TerminalNode DEFAULT_(int i) {
			return getToken(SQLiteParser.DEFAULT_, i);
		}
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode INITIALLY_() { return getToken(SQLiteParser.INITIALLY_, 0); }
		public TerminalNode DEFERRED_() { return getToken(SQLiteParser.DEFERRED_, 0); }
		public TerminalNode IMMEDIATE_() { return getToken(SQLiteParser.IMMEDIATE_, 0); }
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(REFERENCES_);
			setState(590);
			foreign_table();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(591);
				match(OPEN_PAR);
				setState(592);
				column_name();
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(593);
					match(COMMA);
					setState(594);
					column_name();
					}
					}
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(600);
				match(CLOSE_PAR);
				}
			}

			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATCH_ || _la==ON_) {
				{
				setState(616);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON_:
					{
					setState(604);
					match(ON_);
					setState(605);
					_la = _input.LA(1);
					if ( !(_la==DELETE_ || _la==UPDATE_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(612);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SET_:
						{
						setState(606);
						match(SET_);
						setState(607);
						_la = _input.LA(1);
						if ( !(_la==DEFAULT_ || _la==NULL_) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case CASCADE_:
						{
						setState(608);
						match(CASCADE_);
						}
						break;
					case RESTRICT_:
						{
						setState(609);
						match(RESTRICT_);
						}
						break;
					case NO_:
						{
						setState(610);
						match(NO_);
						setState(611);
						match(ACTION_);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case MATCH_:
					{
					setState(614);
					match(MATCH_);
					setState(615);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_) {
					{
					setState(621);
					match(NOT_);
					}
				}

				setState(624);
				match(DEFERRABLE_);
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INITIALLY_) {
					{
					setState(625);
					match(INITIALLY_);
					setState(626);
					_la = _input.LA(1);
					if ( !(_la==DEFERRED_ || _la==IMMEDIATE_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public TerminalNode CONFLICT_() { return getToken(SQLiteParser.CONFLICT_, 0); }
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(ON_);
			setState(632);
			match(CONFLICT_);
			setState(633);
			_la = _input.LA(1);
			if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (FAIL_ - 72)) | (1L << (IGNORE_ - 72)) | (1L << (REPLACE_ - 72)) | (1L << (ROLLBACK_ - 72)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode TRIGGER_() { return getToken(SQLiteParser.TRIGGER_, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode BEGIN_() { return getToken(SQLiteParser.BEGIN_, 0); }
		public TerminalNode END_() { return getToken(SQLiteParser.END_, 0); }
		public TerminalNode DELETE_() { return getToken(SQLiteParser.DELETE_, 0); }
		public TerminalNode INSERT_() { return getToken(SQLiteParser.INSERT_, 0); }
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode BEFORE_() { return getToken(SQLiteParser.BEFORE_, 0); }
		public TerminalNode AFTER_() { return getToken(SQLiteParser.AFTER_, 0); }
		public TerminalNode INSTEAD_() { return getToken(SQLiteParser.INSTEAD_, 0); }
		public List<TerminalNode> OF_() { return getTokens(SQLiteParser.OF_); }
		public TerminalNode OF_(int i) {
			return getToken(SQLiteParser.OF_, i);
		}
		public TerminalNode FOR_() { return getToken(SQLiteParser.FOR_, 0); }
		public TerminalNode EACH_() { return getToken(SQLiteParser.EACH_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode WHEN_() { return getToken(SQLiteParser.WHEN_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public TerminalNode TEMP_() { return getToken(SQLiteParser.TEMP_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(SQLiteParser.TEMPORARY_, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCreate_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(CREATE_);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMP_ || _la==TEMPORARY_) {
				{
				setState(636);
				_la = _input.LA(1);
				if ( !(_la==TEMP_ || _la==TEMPORARY_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(639);
			match(TRIGGER_);
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(640);
				match(IF_);
				setState(641);
				match(NOT_);
				setState(642);
				match(EXISTS_);
				}
				break;
			}
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(645);
				schema_name();
				setState(646);
				match(DOT);
				}
				break;
			}
			setState(650);
			trigger_name();
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEFORE_:
				{
				setState(651);
				match(BEFORE_);
				}
				break;
			case AFTER_:
				{
				setState(652);
				match(AFTER_);
				}
				break;
			case INSTEAD_:
				{
				setState(653);
				match(INSTEAD_);
				setState(654);
				match(OF_);
				}
				break;
			case DELETE_:
			case INSERT_:
			case UPDATE_:
				break;
			default:
				break;
			}
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE_:
				{
				setState(657);
				match(DELETE_);
				}
				break;
			case INSERT_:
				{
				setState(658);
				match(INSERT_);
				}
				break;
			case UPDATE_:
				{
				setState(659);
				match(UPDATE_);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF_) {
					{
					setState(660);
					match(OF_);
					setState(661);
					column_name();
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(662);
						match(COMMA);
						setState(663);
						column_name();
						}
						}
						setState(668);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(673);
			match(ON_);
			setState(674);
			table_name();
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR_) {
				{
				setState(675);
				match(FOR_);
				setState(676);
				match(EACH_);
				setState(677);
				match(ROW_);
				}
			}

			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN_) {
				{
				setState(680);
				match(WHEN_);
				setState(681);
				expr(0);
				}
			}

			setState(684);
			match(BEGIN_);
			setState(693); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(685);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(686);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(687);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(688);
					select_stmt();
					}
					break;
				}
				setState(691);
				match(SCOL);
				}
				}
				setState(695); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DELETE_ || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (INSERT_ - 88)) | (1L << (REPLACE_ - 88)) | (1L << (SELECT_ - 88)) | (1L << (UPDATE_ - 88)) | (1L << (VALUES_ - 88)) | (1L << (WITH_ - 88)))) != 0) );
			setState(697);
			match(END_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode VIEW_() { return getToken(SQLiteParser.VIEW_, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode TEMP_() { return getToken(SQLiteParser.TEMP_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(SQLiteParser.TEMPORARY_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(CREATE_);
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMP_ || _la==TEMPORARY_) {
				{
				setState(700);
				_la = _input.LA(1);
				if ( !(_la==TEMP_ || _la==TEMPORARY_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(703);
			match(VIEW_);
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(704);
				match(IF_);
				setState(705);
				match(NOT_);
				setState(706);
				match(EXISTS_);
				}
				break;
			}
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(709);
				schema_name();
				setState(710);
				match(DOT);
				}
				break;
			}
			setState(714);
			view_name();
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(715);
				match(OPEN_PAR);
				setState(716);
				column_name();
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(717);
					match(COMMA);
					setState(718);
					column_name();
					}
					}
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(724);
				match(CLOSE_PAR);
				}
			}

			setState(728);
			match(AS_);
			setState(729);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode VIRTUAL_() { return getToken(SQLiteParser.VIRTUAL_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode USING_() { return getToken(SQLiteParser.USING_, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCreate_virtual_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(CREATE_);
			setState(732);
			match(VIRTUAL_);
			setState(733);
			match(TABLE_);
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(734);
				match(IF_);
				setState(735);
				match(NOT_);
				setState(736);
				match(EXISTS_);
				}
				break;
			}
			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(739);
				schema_name();
				setState(740);
				match(DOT);
				}
				break;
			}
			setState(744);
			table_name();
			setState(745);
			match(USING_);
			setState(746);
			module_name();
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(747);
				match(OPEN_PAR);
				setState(748);
				module_argument();
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(749);
					match(COMMA);
					setState(750);
					module_argument();
					}
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(756);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode WITH_() { return getToken(SQLiteParser.WITH_, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> AS_() { return getTokens(SQLiteParser.AS_); }
		public TerminalNode AS_(int i) {
			return getToken(SQLiteParser.AS_, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public TerminalNode RECURSIVE_() { return getToken(SQLiteParser.RECURSIVE_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(WITH_);
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(761);
				match(RECURSIVE_);
				}
				break;
			}
			setState(764);
			cte_table_name();
			setState(765);
			match(AS_);
			setState(766);
			match(OPEN_PAR);
			setState(767);
			select_stmt();
			setState(768);
			match(CLOSE_PAR);
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(769);
				match(COMMA);
				setState(770);
				cte_table_name();
				setState(771);
				match(AS_);
				setState(772);
				match(OPEN_PAR);
				setState(773);
				select_stmt();
				setState(774);
				match(CLOSE_PAR);
				}
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			table_name();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(782);
				match(OPEN_PAR);
				setState(783);
				column_name();
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(784);
					match(COMMA);
					setState(785);
					column_name();
					}
					}
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(791);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Recursive_cteContext extends ParserRuleContext {
		public Cte_table_nameContext cte_table_name() {
			return getRuleContext(Cte_table_nameContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Initial_selectContext initial_select() {
			return getRuleContext(Initial_selectContext.class,0);
		}
		public TerminalNode UNION_() { return getToken(SQLiteParser.UNION_, 0); }
		public Recursive_selectContext recursive_select() {
			return getRuleContext(Recursive_selectContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode ALL_() { return getToken(SQLiteParser.ALL_, 0); }
		public Recursive_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursive_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterRecursive_cte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitRecursive_cte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitRecursive_cte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Recursive_cteContext recursive_cte() throws RecognitionException {
		Recursive_cteContext _localctx = new Recursive_cteContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_recursive_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			cte_table_name();
			setState(796);
			match(AS_);
			setState(797);
			match(OPEN_PAR);
			setState(798);
			initial_select();
			setState(799);
			match(UNION_);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL_) {
				{
				setState(800);
				match(ALL_);
				}
			}

			setState(803);
			recursive_select();
			setState(804);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			table_name();
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(807);
				match(OPEN_PAR);
				setState(808);
				column_name();
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(809);
					match(COMMA);
					setState(810);
					column_name();
					}
					}
					setState(815);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(816);
				match(CLOSE_PAR);
				}
			}

			setState(820);
			match(AS_);
			setState(821);
			match(OPEN_PAR);
			setState(822);
			select_stmt();
			setState(823);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode DELETE_() { return getToken(SQLiteParser.DELETE_, 0); }
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(825);
				with_clause();
				}
			}

			setState(828);
			match(DELETE_);
			setState(829);
			match(FROM_);
			setState(830);
			qualified_table_name();
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(831);
				match(WHERE_);
				setState(832);
				expr(0);
				}
			}

			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(835);
				returning_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode DELETE_() { return getToken(SQLiteParser.DELETE_, 0); }
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDelete_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(838);
				with_clause();
				}
			}

			setState(841);
			match(DELETE_);
			setState(842);
			match(FROM_);
			setState(843);
			qualified_table_name();
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(844);
				match(WHERE_);
				setState(845);
				expr(0);
				}
			}

			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(848);
				returning_clause();
				}
			}

			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_ || _la==ORDER_) {
				{
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_) {
					{
					setState(851);
					order_by_stmt();
					}
				}

				setState(854);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode DETACH_() { return getToken(SQLiteParser.DETACH_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DATABASE_() { return getToken(SQLiteParser.DATABASE_, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDetach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(DETACH_);
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(858);
				match(DATABASE_);
				}
				break;
			}
			setState(861);
			schema_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_stmtContext extends ParserRuleContext {
		public Token object;
		public TerminalNode DROP_() { return getToken(SQLiteParser.DROP_, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode INDEX_() { return getToken(SQLiteParser.INDEX_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public TerminalNode TRIGGER_() { return getToken(SQLiteParser.TRIGGER_, 0); }
		public TerminalNode VIEW_() { return getToken(SQLiteParser.VIEW_, 0); }
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDrop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDrop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDrop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_drop_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(DROP_);
			setState(864);
			((Drop_stmtContext)_localctx).object = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (INDEX_ - 84)) | (1L << (TABLE_ - 84)) | (1L << (TRIGGER_ - 84)) | (1L << (VIEW_ - 84)))) != 0)) ) {
				((Drop_stmtContext)_localctx).object = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(865);
				match(IF_);
				setState(866);
				match(EXISTS_);
				}
				break;
			}
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(869);
				schema_name();
				setState(870);
				match(DOT);
				}
				break;
			}
			setState(874);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SQLiteParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode CAST_() { return getToken(SQLiteParser.CAST_, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode CASE_() { return getToken(SQLiteParser.CASE_, 0); }
		public TerminalNode END_() { return getToken(SQLiteParser.END_, 0); }
		public List<TerminalNode> WHEN_() { return getTokens(SQLiteParser.WHEN_); }
		public TerminalNode WHEN_(int i) {
			return getToken(SQLiteParser.WHEN_, i);
		}
		public List<TerminalNode> THEN_() { return getTokens(SQLiteParser.THEN_); }
		public TerminalNode THEN_(int i) {
			return getToken(SQLiteParser.THEN_, i);
		}
		public TerminalNode ELSE_() { return getToken(SQLiteParser.ELSE_, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SQLiteParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SQLiteParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLiteParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLiteParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLiteParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLiteParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLiteParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLiteParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLiteParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLiteParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLiteParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLiteParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLiteParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLiteParser.NOT_EQ2, 0); }
		public TerminalNode IS_() { return getToken(SQLiteParser.IS_, 0); }
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public TerminalNode IN_() { return getToken(SQLiteParser.IN_, 0); }
		public TerminalNode LIKE_() { return getToken(SQLiteParser.LIKE_, 0); }
		public TerminalNode GLOB_() { return getToken(SQLiteParser.GLOB_, 0); }
		public TerminalNode MATCH_() { return getToken(SQLiteParser.MATCH_, 0); }
		public TerminalNode REGEXP_() { return getToken(SQLiteParser.REGEXP_, 0); }
		public TerminalNode AND_() { return getToken(SQLiteParser.AND_, 0); }
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public TerminalNode BETWEEN_() { return getToken(SQLiteParser.BETWEEN_, 0); }
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode ESCAPE_() { return getToken(SQLiteParser.ESCAPE_, 0); }
		public TerminalNode ISNULL_() { return getToken(SQLiteParser.ISNULL_, 0); }
		public TerminalNode NOTNULL_() { return getToken(SQLiteParser.NOTNULL_, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public Table_function_nameContext table_function_name() {
			return getRuleContext(Table_function_nameContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(877);
				literal_value();
				}
				break;
			case 2:
				{
				setState(878);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(887);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(882);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
					case 1:
						{
						setState(879);
						schema_name();
						setState(880);
						match(DOT);
						}
						break;
					}
					setState(884);
					table_name();
					setState(885);
					match(DOT);
					}
					break;
				}
				setState(889);
				column_name();
				}
				break;
			case 4:
				{
				setState(890);
				unary_operator();
				setState(891);
				expr(21);
				}
				break;
			case 5:
				{
				setState(893);
				function_name();
				setState(894);
				match(OPEN_PAR);
				setState(907);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case ABORT_:
				case ACTION_:
				case ADD_:
				case AFTER_:
				case ALL_:
				case ALTER_:
				case ANALYZE_:
				case AND_:
				case AS_:
				case ASC_:
				case ATTACH_:
				case AUTOINCREMENT_:
				case BEFORE_:
				case BEGIN_:
				case BETWEEN_:
				case BY_:
				case CASCADE_:
				case CASE_:
				case CAST_:
				case CHECK_:
				case COLLATE_:
				case COLUMN_:
				case COMMIT_:
				case CONFLICT_:
				case CONSTRAINT_:
				case CREATE_:
				case CROSS_:
				case CURRENT_DATE_:
				case CURRENT_TIME_:
				case CURRENT_TIMESTAMP_:
				case DATABASE_:
				case DEFAULT_:
				case DEFERRABLE_:
				case DEFERRED_:
				case DELETE_:
				case DESC_:
				case DETACH_:
				case DISTINCT_:
				case DROP_:
				case EACH_:
				case ELSE_:
				case END_:
				case ESCAPE_:
				case EXCEPT_:
				case EXCLUSIVE_:
				case EXISTS_:
				case EXPLAIN_:
				case FAIL_:
				case FOR_:
				case FOREIGN_:
				case FROM_:
				case FULL_:
				case GLOB_:
				case GROUP_:
				case HAVING_:
				case IF_:
				case IGNORE_:
				case IMMEDIATE_:
				case IN_:
				case INDEX_:
				case INDEXED_:
				case INITIALLY_:
				case INNER_:
				case INSERT_:
				case INSTEAD_:
				case INTERSECT_:
				case INTO_:
				case IS_:
				case ISNULL_:
				case JOIN_:
				case KEY_:
				case LEFT_:
				case LIKE_:
				case LIMIT_:
				case MATCH_:
				case NATURAL_:
				case NO_:
				case NOT_:
				case NOTNULL_:
				case NULL_:
				case OF_:
				case OFFSET_:
				case ON_:
				case OR_:
				case ORDER_:
				case OUTER_:
				case PLAN_:
				case PRAGMA_:
				case PRIMARY_:
				case QUERY_:
				case RAISE_:
				case RECURSIVE_:
				case REFERENCES_:
				case REGEXP_:
				case REINDEX_:
				case RELEASE_:
				case RENAME_:
				case REPLACE_:
				case RESTRICT_:
				case RIGHT_:
				case ROLLBACK_:
				case ROW_:
				case ROWS_:
				case SAVEPOINT_:
				case SELECT_:
				case SET_:
				case TABLE_:
				case TEMP_:
				case TEMPORARY_:
				case THEN_:
				case TO_:
				case TRANSACTION_:
				case TRIGGER_:
				case UNION_:
				case UNIQUE_:
				case UPDATE_:
				case USING_:
				case VACUUM_:
				case VALUES_:
				case VIEW_:
				case VIRTUAL_:
				case WHEN_:
				case WHERE_:
				case WITH_:
				case WITHOUT_:
				case FIRST_VALUE_:
				case OVER_:
				case PARTITION_:
				case RANGE_:
				case PRECEDING_:
				case UNBOUNDED_:
				case CURRENT_:
				case FOLLOWING_:
				case CUME_DIST_:
				case DENSE_RANK_:
				case LAG_:
				case LAST_VALUE_:
				case LEAD_:
				case NTH_VALUE_:
				case NTILE_:
				case PERCENT_RANK_:
				case RANK_:
				case ROW_NUMBER_:
				case GENERATED_:
				case ALWAYS_:
				case STORED_:
				case TRUE_:
				case FALSE_:
				case WINDOW_:
				case NULLS_:
				case FIRST_:
				case LAST_:
				case FILTER_:
				case GROUPS_:
				case EXCLUDE_:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					{
					setState(896);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						setState(895);
						match(DISTINCT_);
						}
						break;
					}
					setState(898);
					expr(0);
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(899);
						match(COMMA);
						setState(900);
						expr(0);
						}
						}
						setState(905);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case STAR:
					{
					setState(906);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(909);
				match(CLOSE_PAR);
				setState(911);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(910);
					filter_clause();
					}
					break;
				}
				setState(914);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(913);
					over_clause();
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(916);
				match(OPEN_PAR);
				setState(917);
				expr(0);
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(918);
					match(COMMA);
					setState(919);
					expr(0);
					}
					}
					setState(924);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(925);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(927);
				match(CAST_);
				setState(928);
				match(OPEN_PAR);
				setState(929);
				expr(0);
				setState(930);
				match(AS_);
				setState(931);
				type_name();
				setState(932);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS_ || _la==NOT_) {
					{
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT_) {
						{
						setState(934);
						match(NOT_);
						}
					}

					setState(937);
					match(EXISTS_);
					}
				}

				setState(940);
				match(OPEN_PAR);
				setState(941);
				select_stmt();
				setState(942);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(944);
				match(CASE_);
				setState(946);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(945);
					expr(0);
					}
					break;
				}
				setState(953); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(948);
					match(WHEN_);
					setState(949);
					expr(0);
					setState(950);
					match(THEN_);
					setState(951);
					expr(0);
					}
					}
					setState(955); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN_ );
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE_) {
					{
					setState(957);
					match(ELSE_);
					setState(958);
					expr(0);
					}
				}

				setState(961);
				match(END_);
				}
				break;
			case 10:
				{
				setState(963);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1091);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1089);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(966);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(967);
						match(PIPE2);
						setState(968);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(969);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(970);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(971);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(972);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(973);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(974);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(975);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(976);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(977);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(978);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(979);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(980);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(981);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1000);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
						case 1:
							{
							setState(982);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(983);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(984);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(985);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(986);
							match(IS_);
							}
							break;
						case 6:
							{
							setState(987);
							match(IS_);
							setState(988);
							match(NOT_);
							}
							break;
						case 7:
							{
							setState(989);
							match(IS_);
							setState(991);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NOT_) {
								{
								setState(990);
								match(NOT_);
								}
							}

							setState(993);
							match(DISTINCT_);
							setState(994);
							match(FROM_);
							}
							break;
						case 8:
							{
							setState(995);
							match(IN_);
							}
							break;
						case 9:
							{
							setState(996);
							match(LIKE_);
							}
							break;
						case 10:
							{
							setState(997);
							match(GLOB_);
							}
							break;
						case 11:
							{
							setState(998);
							match(MATCH_);
							}
							break;
						case 12:
							{
							setState(999);
							match(REGEXP_);
							}
							break;
						}
						setState(1002);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1003);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1004);
						match(AND_);
						setState(1005);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1006);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1007);
						match(OR_);
						setState(1008);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1009);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1010);
						match(IS_);
						setState(1012);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
						case 1:
							{
							setState(1011);
							match(NOT_);
							}
							break;
						}
						setState(1014);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1015);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1017);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(1016);
							match(NOT_);
							}
						}

						setState(1019);
						match(BETWEEN_);
						setState(1020);
						expr(0);
						setState(1021);
						match(AND_);
						setState(1022);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1024);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1025);
						match(COLLATE_);
						setState(1026);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1027);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1029);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(1028);
							match(NOT_);
							}
						}

						setState(1031);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (GLOB_ - 77)) | (1L << (LIKE_ - 77)) | (1L << (MATCH_ - 77)) | (1L << (REGEXP_ - 77)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1032);
						expr(0);
						setState(1035);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
						case 1:
							{
							setState(1033);
							match(ESCAPE_);
							setState(1034);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1037);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1042);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ISNULL_:
							{
							setState(1038);
							match(ISNULL_);
							}
							break;
						case NOTNULL_:
							{
							setState(1039);
							match(NOTNULL_);
							}
							break;
						case NOT_:
							{
							setState(1040);
							match(NOT_);
							setState(1041);
							match(NULL_);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1044);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1046);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(1045);
							match(NOT_);
							}
						}

						setState(1048);
						match(IN_);
						setState(1087);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
						case 1:
							{
							setState(1049);
							match(OPEN_PAR);
							setState(1059);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
							case 1:
								{
								setState(1050);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1051);
								expr(0);
								setState(1056);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1052);
									match(COMMA);
									setState(1053);
									expr(0);
									}
									}
									setState(1058);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1061);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1065);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
							case 1:
								{
								setState(1062);
								schema_name();
								setState(1063);
								match(DOT);
								}
								break;
							}
							setState(1067);
							table_name();
							}
							break;
						case 3:
							{
							setState(1071);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
							case 1:
								{
								setState(1068);
								schema_name();
								setState(1069);
								match(DOT);
								}
								break;
							}
							setState(1073);
							table_function_name();
							setState(1074);
							match(OPEN_PAR);
							setState(1083);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << ABORT_) | (1L << ACTION_) | (1L << ADD_) | (1L << AFTER_) | (1L << ALL_) | (1L << ALTER_) | (1L << ANALYZE_) | (1L << AND_) | (1L << AS_) | (1L << ASC_) | (1L << ATTACH_) | (1L << AUTOINCREMENT_) | (1L << BEFORE_) | (1L << BEGIN_) | (1L << BETWEEN_) | (1L << BY_) | (1L << CASCADE_) | (1L << CASE_) | (1L << CAST_) | (1L << CHECK_) | (1L << COLLATE_) | (1L << COLUMN_) | (1L << COMMIT_) | (1L << CONFLICT_) | (1L << CONSTRAINT_) | (1L << CREATE_) | (1L << CROSS_) | (1L << CURRENT_DATE_) | (1L << CURRENT_TIME_) | (1L << CURRENT_TIMESTAMP_) | (1L << DATABASE_) | (1L << DEFAULT_) | (1L << DEFERRABLE_) | (1L << DEFERRED_) | (1L << DELETE_) | (1L << DESC_) | (1L << DETACH_) | (1L << DISTINCT_) | (1L << DROP_))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EACH_ - 64)) | (1L << (ELSE_ - 64)) | (1L << (END_ - 64)) | (1L << (ESCAPE_ - 64)) | (1L << (EXCEPT_ - 64)) | (1L << (EXCLUSIVE_ - 64)) | (1L << (EXISTS_ - 64)) | (1L << (EXPLAIN_ - 64)) | (1L << (FAIL_ - 64)) | (1L << (FOR_ - 64)) | (1L << (FOREIGN_ - 64)) | (1L << (FROM_ - 64)) | (1L << (FULL_ - 64)) | (1L << (GLOB_ - 64)) | (1L << (GROUP_ - 64)) | (1L << (HAVING_ - 64)) | (1L << (IF_ - 64)) | (1L << (IGNORE_ - 64)) | (1L << (IMMEDIATE_ - 64)) | (1L << (IN_ - 64)) | (1L << (INDEX_ - 64)) | (1L << (INDEXED_ - 64)) | (1L << (INITIALLY_ - 64)) | (1L << (INNER_ - 64)) | (1L << (INSERT_ - 64)) | (1L << (INSTEAD_ - 64)) | (1L << (INTERSECT_ - 64)) | (1L << (INTO_ - 64)) | (1L << (IS_ - 64)) | (1L << (ISNULL_ - 64)) | (1L << (JOIN_ - 64)) | (1L << (KEY_ - 64)) | (1L << (LEFT_ - 64)) | (1L << (LIKE_ - 64)) | (1L << (LIMIT_ - 64)) | (1L << (MATCH_ - 64)) | (1L << (NATURAL_ - 64)) | (1L << (NO_ - 64)) | (1L << (NOT_ - 64)) | (1L << (NOTNULL_ - 64)) | (1L << (NULL_ - 64)) | (1L << (OF_ - 64)) | (1L << (OFFSET_ - 64)) | (1L << (ON_ - 64)) | (1L << (OR_ - 64)) | (1L << (ORDER_ - 64)) | (1L << (OUTER_ - 64)) | (1L << (PLAN_ - 64)) | (1L << (PRAGMA_ - 64)) | (1L << (PRIMARY_ - 64)) | (1L << (QUERY_ - 64)) | (1L << (RAISE_ - 64)) | (1L << (RECURSIVE_ - 64)) | (1L << (REFERENCES_ - 64)) | (1L << (REGEXP_ - 64)) | (1L << (REINDEX_ - 64)) | (1L << (RELEASE_ - 64)) | (1L << (RENAME_ - 64)) | (1L << (REPLACE_ - 64)) | (1L << (RESTRICT_ - 64)) | (1L << (RIGHT_ - 64)) | (1L << (ROLLBACK_ - 64)) | (1L << (ROW_ - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ROWS_ - 128)) | (1L << (SAVEPOINT_ - 128)) | (1L << (SELECT_ - 128)) | (1L << (SET_ - 128)) | (1L << (TABLE_ - 128)) | (1L << (TEMP_ - 128)) | (1L << (TEMPORARY_ - 128)) | (1L << (THEN_ - 128)) | (1L << (TO_ - 128)) | (1L << (TRANSACTION_ - 128)) | (1L << (TRIGGER_ - 128)) | (1L << (UNION_ - 128)) | (1L << (UNIQUE_ - 128)) | (1L << (UPDATE_ - 128)) | (1L << (USING_ - 128)) | (1L << (VACUUM_ - 128)) | (1L << (VALUES_ - 128)) | (1L << (VIEW_ - 128)) | (1L << (VIRTUAL_ - 128)) | (1L << (WHEN_ - 128)) | (1L << (WHERE_ - 128)) | (1L << (WITH_ - 128)) | (1L << (WITHOUT_ - 128)) | (1L << (FIRST_VALUE_ - 128)) | (1L << (OVER_ - 128)) | (1L << (PARTITION_ - 128)) | (1L << (RANGE_ - 128)) | (1L << (PRECEDING_ - 128)) | (1L << (UNBOUNDED_ - 128)) | (1L << (CURRENT_ - 128)) | (1L << (FOLLOWING_ - 128)) | (1L << (CUME_DIST_ - 128)) | (1L << (DENSE_RANK_ - 128)) | (1L << (LAG_ - 128)) | (1L << (LAST_VALUE_ - 128)) | (1L << (LEAD_ - 128)) | (1L << (NTH_VALUE_ - 128)) | (1L << (NTILE_ - 128)) | (1L << (PERCENT_RANK_ - 128)) | (1L << (RANK_ - 128)) | (1L << (ROW_NUMBER_ - 128)) | (1L << (GENERATED_ - 128)) | (1L << (ALWAYS_ - 128)) | (1L << (STORED_ - 128)) | (1L << (TRUE_ - 128)) | (1L << (FALSE_ - 128)) | (1L << (WINDOW_ - 128)) | (1L << (NULLS_ - 128)) | (1L << (FIRST_ - 128)) | (1L << (LAST_ - 128)) | (1L << (FILTER_ - 128)) | (1L << (GROUPS_ - 128)) | (1L << (EXCLUDE_ - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
								{
								setState(1075);
								expr(0);
								setState(1080);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1076);
									match(COMMA);
									setState(1077);
									expr(0);
									}
									}
									setState(1082);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
							}

							setState(1085);
							match(CLOSE_PAR);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1093);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode RAISE_() { return getToken(SQLiteParser.RAISE_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(RAISE_);
			setState(1095);
			match(OPEN_PAR);
			setState(1100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGNORE_:
				{
				setState(1096);
				match(IGNORE_);
				}
				break;
			case ABORT_:
			case FAIL_:
			case ROLLBACK_:
				{
				setState(1097);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || _la==FAIL_ || _la==ROLLBACK_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1098);
				match(COMMA);
				setState(1099);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1102);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLiteParser.BLOB_LITERAL, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public TerminalNode TRUE_() { return getToken(SQLiteParser.TRUE_, 0); }
		public TerminalNode FALSE_() { return getToken(SQLiteParser.FALSE_, 0); }
		public TerminalNode CURRENT_TIME_() { return getToken(SQLiteParser.CURRENT_TIME_, 0); }
		public TerminalNode CURRENT_DATE_() { return getToken(SQLiteParser.CURRENT_DATE_, 0); }
		public TerminalNode CURRENT_TIMESTAMP_() { return getToken(SQLiteParser.CURRENT_TIMESTAMP_, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (CURRENT_DATE_ - 52)) | (1L << (CURRENT_TIME_ - 52)) | (1L << (CURRENT_TIMESTAMP_ - 52)) | (1L << (NULL_ - 52)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (TRUE_ - 172)) | (1L << (FALSE_ - 172)) | (1L << (NUMERIC_LITERAL - 172)) | (1L << (STRING_LITERAL - 172)) | (1L << (BLOB_LITERAL - 172)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_rowContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Value_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterValue_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitValue_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitValue_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_rowContext value_row() throws RecognitionException {
		Value_rowContext _localctx = new Value_rowContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_value_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			match(OPEN_PAR);
			setState(1107);
			expr(0);
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1108);
				match(COMMA);
				setState(1109);
				expr(0);
				}
				}
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1115);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Values_clauseContext extends ParserRuleContext {
		public TerminalNode VALUES_() { return getToken(SQLiteParser.VALUES_, 0); }
		public List<Value_rowContext> value_row() {
			return getRuleContexts(Value_rowContext.class);
		}
		public Value_rowContext value_row(int i) {
			return getRuleContext(Value_rowContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterValues_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitValues_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitValues_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Values_clauseContext values_clause() throws RecognitionException {
		Values_clauseContext _localctx = new Values_clauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(VALUES_);
			setState(1118);
			value_row();
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1119);
				match(COMMA);
				setState(1120);
				value_row();
				}
				}
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode INTO_() { return getToken(SQLiteParser.INTO_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode INSERT_() { return getToken(SQLiteParser.INSERT_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public TerminalNode DEFAULT_() { return getToken(SQLiteParser.DEFAULT_, 0); }
		public TerminalNode VALUES_() { return getToken(SQLiteParser.VALUES_, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Values_clauseContext values_clause() {
			return getRuleContext(Values_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Upsert_clauseContext upsert_clause() {
			return getRuleContext(Upsert_clauseContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1126);
				with_clause();
				}
			}

			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1129);
				match(INSERT_);
				}
				break;
			case 2:
				{
				setState(1130);
				match(REPLACE_);
				}
				break;
			case 3:
				{
				setState(1131);
				match(INSERT_);
				setState(1132);
				match(OR_);
				setState(1133);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (FAIL_ - 72)) | (1L << (IGNORE_ - 72)) | (1L << (REPLACE_ - 72)) | (1L << (ROLLBACK_ - 72)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1136);
			match(INTO_);
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1137);
				schema_name();
				setState(1138);
				match(DOT);
				}
				break;
			}
			setState(1142);
			table_name();
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_) {
				{
				setState(1143);
				match(AS_);
				setState(1144);
				table_alias();
				}
			}

			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1147);
				match(OPEN_PAR);
				setState(1148);
				column_name();
				setState(1153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1149);
					match(COMMA);
					setState(1150);
					column_name();
					}
					}
					setState(1155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1156);
				match(CLOSE_PAR);
				}
			}

			setState(1169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_:
			case VALUES_:
			case WITH_:
				{
				{
				setState(1162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1160);
					values_clause();
					}
					break;
				case 2:
					{
					setState(1161);
					select_stmt();
					}
					break;
				}
				setState(1165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(1164);
					upsert_clause();
					}
				}

				}
				}
				break;
			case DEFAULT_:
				{
				setState(1167);
				match(DEFAULT_);
				setState(1168);
				match(VALUES_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(1171);
				returning_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Returning_clauseContext extends ParserRuleContext {
		public TerminalNode RETURNING_() { return getToken(SQLiteParser.RETURNING_, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Returning_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returning_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterReturning_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitReturning_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitReturning_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Returning_clauseContext returning_clause() throws RecognitionException {
		Returning_clauseContext _localctx = new Returning_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_returning_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(RETURNING_);
			setState(1175);
			result_column();
			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1176);
				match(COMMA);
				setState(1177);
				result_column();
				}
				}
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Upsert_clauseContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public TerminalNode CONFLICT_() { return getToken(SQLiteParser.CONFLICT_, 0); }
		public TerminalNode DO_() { return getToken(SQLiteParser.DO_, 0); }
		public TerminalNode NOTHING_() { return getToken(SQLiteParser.NOTHING_, 0); }
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public TerminalNode SET_() { return getToken(SQLiteParser.SET_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<TerminalNode> WHERE_() { return getTokens(SQLiteParser.WHERE_); }
		public TerminalNode WHERE_(int i) {
			return getToken(SQLiteParser.WHERE_, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_name_listContext> column_name_list() {
			return getRuleContexts(Column_name_listContext.class);
		}
		public Column_name_listContext column_name_list(int i) {
			return getRuleContext(Column_name_listContext.class,i);
		}
		public Upsert_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upsert_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterUpsert_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitUpsert_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitUpsert_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Upsert_clauseContext upsert_clause() throws RecognitionException {
		Upsert_clauseContext _localctx = new Upsert_clauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_upsert_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			match(ON_);
			setState(1184);
			match(CONFLICT_);
			setState(1199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1185);
				match(OPEN_PAR);
				setState(1186);
				indexed_column();
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1187);
					match(COMMA);
					setState(1188);
					indexed_column();
					}
					}
					setState(1193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1194);
				match(CLOSE_PAR);
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE_) {
					{
					setState(1195);
					match(WHERE_);
					setState(1196);
					expr(0);
					}
				}

				}
			}

			setState(1201);
			match(DO_);
			setState(1228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTHING_:
				{
				setState(1202);
				match(NOTHING_);
				}
				break;
			case UPDATE_:
				{
				setState(1203);
				match(UPDATE_);
				setState(1204);
				match(SET_);
				{
				setState(1207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1205);
					column_name();
					}
					break;
				case 2:
					{
					setState(1206);
					column_name_list();
					}
					break;
				}
				setState(1209);
				match(ASSIGN);
				setState(1210);
				expr(0);
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1211);
					match(COMMA);
					setState(1214);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						setState(1212);
						column_name();
						}
						break;
					case 2:
						{
						setState(1213);
						column_name_list();
						}
						break;
					}
					setState(1216);
					match(ASSIGN);
					setState(1217);
					expr(0);
					}
					}
					setState(1223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE_) {
					{
					setState(1224);
					match(WHERE_);
					setState(1225);
					expr(0);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode PRAGMA_() { return getToken(SQLiteParser.PRAGMA_, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			match(PRAGMA_);
			setState(1234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1231);
				schema_name();
				setState(1232);
				match(DOT);
				}
				break;
			}
			setState(1236);
			pragma_name();
			setState(1243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(1237);
				match(ASSIGN);
				setState(1238);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(1239);
				match(OPEN_PAR);
				setState(1240);
				pragma_value();
				setState(1241);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case ALTER_:
			case ANALYZE_:
			case ATTACH_:
			case BEGIN_:
			case COMMIT_:
			case CREATE_:
			case DELETE_:
			case DETACH_:
			case DROP_:
			case END_:
			case EXPLAIN_:
			case INSERT_:
			case PRAGMA_:
			case REINDEX_:
			case RELEASE_:
			case REPLACE_:
			case ROLLBACK_:
			case SAVEPOINT_:
			case SELECT_:
			case UPDATE_:
			case VACUUM_:
			case VALUES_:
			case WITH_:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_pragma_value);
		try {
			setState(1248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1247);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode REINDEX_() { return getToken(SQLiteParser.REINDEX_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitReindex_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			match(REINDEX_);
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1251);
				collation_name();
				}
				break;
			case 2:
				{
				setState(1255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1252);
					schema_name();
					setState(1253);
					match(DOT);
					}
					break;
				}
				setState(1259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1257);
					table_name();
					}
					break;
				case 2:
					{
					setState(1258);
					index_name();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Common_table_stmtContext common_table_stmt() {
			return getRuleContext(Common_table_stmtContext.class,0);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1263);
				common_table_stmt();
				}
			}

			setState(1266);
			select_core();
			setState(1272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1267);
					compound_operator();
					setState(1268);
					select_core();
					}
					} 
				}
				setState(1274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_) {
				{
				setState(1275);
				order_by_stmt();
				}
			}

			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_) {
				{
				setState(1278);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			table_or_subquery();
			setState(1289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==CROSS_ || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (FULL_ - 76)) | (1L << (INNER_ - 76)) | (1L << (JOIN_ - 76)) | (1L << (LEFT_ - 76)) | (1L << (NATURAL_ - 76)) | (1L << (RIGHT_ - 76)))) != 0)) {
				{
				{
				setState(1282);
				join_operator();
				setState(1283);
				table_or_subquery();
				setState(1285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1284);
					join_constraint();
					}
					break;
				}
				}
				}
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public ExprContext whereExpr;
		public ExprContext expr;
		public List<ExprContext> groupByExpr = new ArrayList<ExprContext>();
		public ExprContext havingExpr;
		public TerminalNode SELECT_() { return getToken(SQLiteParser.SELECT_, 0); }
		public List<Result_columnContext> Select_coreContext() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public TerminalNode GROUP_() { return getToken(SQLiteParser.GROUP_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public TerminalNode WINDOW_() { return getToken(SQLiteParser.WINDOW_, 0); }
		public List<Window_nameContext> window_name() {
			return getRuleContexts(Window_nameContext.class);
		}
		public Window_nameContext window_name(int i) {
			return getRuleContext(Window_nameContext.class,i);
		}
		public List<TerminalNode> AS_() { return getTokens(SQLiteParser.AS_); }
		public TerminalNode AS_(int i) {
			return getToken(SQLiteParser.AS_, i);
		}
		public List<Window_defnContext> window_defn() {
			return getRuleContexts(Window_defnContext.class);
		}
		public Window_defnContext window_defn(int i) {
			return getRuleContext(Window_defnContext.class,i);
		}
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public TerminalNode ALL_() { return getToken(SQLiteParser.ALL_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode HAVING_() { return getToken(SQLiteParser.HAVING_, 0); }
		public Values_clauseContext values_clause() {
			return getRuleContext(Values_clauseContext.class,0);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_select_core);
		int _la;
		try {
			setState(1355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1292);
				match(SELECT_);
				setState(1294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1293);
					_la = _input.LA(1);
					if ( !(_la==ALL_ || _la==DISTINCT_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1296);
				result_column();
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1297);
					match(COMMA);
					setState(1298);
					result_column();
					}
					}
					setState(1303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM_) {
					{
					setState(1304);
					match(FROM_);
					setState(1314);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						setState(1305);
						table_or_subquery();
						setState(1310);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1306);
							match(COMMA);
							setState(1307);
							table_or_subquery();
							}
							}
							setState(1312);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1313);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE_) {
					{
					setState(1318);
					match(WHERE_);
					setState(1319);
					((Select_coreContext)_localctx).whereExpr = expr(0);
					}
				}

				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP_) {
					{
					setState(1322);
					match(GROUP_);
					setState(1323);
					match(BY_);
					setState(1324);
					((Select_coreContext)_localctx).expr = expr(0);
					((Select_coreContext)_localctx).groupByExpr.add(((Select_coreContext)_localctx).expr);
					setState(1329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1325);
						match(COMMA);
						setState(1326);
						((Select_coreContext)_localctx).expr = expr(0);
						((Select_coreContext)_localctx).groupByExpr.add(((Select_coreContext)_localctx).expr);
						}
						}
						setState(1331);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1334);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==HAVING_) {
						{
						setState(1332);
						match(HAVING_);
						setState(1333);
						((Select_coreContext)_localctx).havingExpr = expr(0);
						}
					}

					}
				}

				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WINDOW_) {
					{
					setState(1338);
					match(WINDOW_);
					setState(1339);
					window_name();
					setState(1340);
					match(AS_);
					setState(1341);
					window_defn();
					setState(1349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1342);
						match(COMMA);
						setState(1343);
						window_name();
						setState(1344);
						match(AS_);
						setState(1345);
						window_defn();
						}
						}
						setState(1351);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				}
				break;
			case VALUES_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1354);
				values_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_factored_select_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public Common_table_stmtContext common_table_stmt() {
			return getRuleContext(Common_table_stmtContext.class,0);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1359);
				common_table_stmt();
				}
			}

			setState(1362);
			select_core();
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_) {
				{
				setState(1363);
				order_by_stmt();
				}
			}

			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_) {
				{
				setState(1366);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Common_table_stmtContext common_table_stmt() {
			return getRuleContext(Common_table_stmtContext.class,0);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public List<TerminalNode> UNION_() { return getTokens(SQLiteParser.UNION_); }
		public TerminalNode UNION_(int i) {
			return getToken(SQLiteParser.UNION_, i);
		}
		public List<TerminalNode> INTERSECT_() { return getTokens(SQLiteParser.INTERSECT_); }
		public TerminalNode INTERSECT_(int i) {
			return getToken(SQLiteParser.INTERSECT_, i);
		}
		public List<TerminalNode> EXCEPT_() { return getTokens(SQLiteParser.EXCEPT_); }
		public TerminalNode EXCEPT_(int i) {
			return getToken(SQLiteParser.EXCEPT_, i);
		}
		public List<TerminalNode> ALL_() { return getTokens(SQLiteParser.ALL_); }
		public TerminalNode ALL_(int i) {
			return getToken(SQLiteParser.ALL_, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1369);
				common_table_stmt();
				}
			}

			setState(1372);
			select_core();
			setState(1382); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1379);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNION_:
					{
					setState(1373);
					match(UNION_);
					setState(1375);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL_) {
						{
						setState(1374);
						match(ALL_);
						}
					}

					}
					break;
				case INTERSECT_:
					{
					setState(1377);
					match(INTERSECT_);
					}
					break;
				case EXCEPT_:
					{
					setState(1378);
					match(EXCEPT_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1381);
				select_core();
				}
				}
				setState(1384); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EXCEPT_ || _la==INTERSECT_ || _la==UNION_ );
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_) {
				{
				setState(1386);
				order_by_stmt();
				}
			}

			setState(1390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_) {
				{
				setState(1389);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode INDEXED_() { return getToken(SQLiteParser.INDEXED_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Table_function_nameContext table_function_name() {
			return getRuleContext(Table_function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_table_or_subquery);
		int _la;
		try {
			setState(1456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1392);
					schema_name();
					setState(1393);
					match(DOT);
					}
					break;
				}
				setState(1397);
				table_name();
				setState(1402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
					case 1:
						{
						setState(1398);
						match(AS_);
						}
						break;
					}
					setState(1401);
					table_alias();
					}
					break;
				}
				setState(1409);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INDEXED_:
					{
					setState(1404);
					match(INDEXED_);
					setState(1405);
					match(BY_);
					setState(1406);
					index_name();
					}
					break;
				case NOT_:
					{
					setState(1407);
					match(NOT_);
					setState(1408);
					match(INDEXED_);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case ALTER_:
				case ANALYZE_:
				case ATTACH_:
				case BEGIN_:
				case COMMIT_:
				case CREATE_:
				case CROSS_:
				case DELETE_:
				case DETACH_:
				case DROP_:
				case END_:
				case EXCEPT_:
				case EXPLAIN_:
				case FULL_:
				case GROUP_:
				case INNER_:
				case INSERT_:
				case INTERSECT_:
				case JOIN_:
				case LEFT_:
				case LIMIT_:
				case NATURAL_:
				case ON_:
				case ORDER_:
				case PRAGMA_:
				case REINDEX_:
				case RELEASE_:
				case REPLACE_:
				case RETURNING_:
				case RIGHT_:
				case ROLLBACK_:
				case SAVEPOINT_:
				case SELECT_:
				case UNION_:
				case UPDATE_:
				case USING_:
				case VACUUM_:
				case VALUES_:
				case WHERE_:
				case WITH_:
				case WINDOW_:
					break;
				default:
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1411);
					schema_name();
					setState(1412);
					match(DOT);
					}
					break;
				}
				setState(1416);
				table_function_name();
				setState(1417);
				match(OPEN_PAR);
				setState(1418);
				expr(0);
				setState(1423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1419);
					match(COMMA);
					setState(1420);
					expr(0);
					}
					}
					setState(1425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1426);
				match(CLOSE_PAR);
				setState(1431);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						setState(1427);
						match(AS_);
						}
						break;
					}
					setState(1430);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1433);
				match(OPEN_PAR);
				setState(1443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1434);
					table_or_subquery();
					setState(1439);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1435);
						match(COMMA);
						setState(1436);
						table_or_subquery();
						}
						}
						setState(1441);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1442);
					join_clause();
					}
					break;
				}
				setState(1445);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1447);
				match(OPEN_PAR);
				setState(1448);
				select_stmt();
				setState(1449);
				match(CLOSE_PAR);
				setState(1454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1451);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
					case 1:
						{
						setState(1450);
						match(AS_);
						}
						break;
					}
					setState(1453);
					table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_result_column);
		int _la;
		try {
			setState(1470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1458);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1459);
				table_name();
				setState(1460);
				match(DOT);
				setState(1461);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1463);
				expr(0);
				setState(1468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS_ || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1465);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS_) {
						{
						setState(1464);
						match(AS_);
						}
					}

					setState(1467);
					column_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public TerminalNode JOIN_() { return getToken(SQLiteParser.JOIN_, 0); }
		public TerminalNode NATURAL_() { return getToken(SQLiteParser.NATURAL_, 0); }
		public TerminalNode INNER_() { return getToken(SQLiteParser.INNER_, 0); }
		public TerminalNode CROSS_() { return getToken(SQLiteParser.CROSS_, 0); }
		public TerminalNode LEFT_() { return getToken(SQLiteParser.LEFT_, 0); }
		public TerminalNode RIGHT_() { return getToken(SQLiteParser.RIGHT_, 0); }
		public TerminalNode FULL_() { return getToken(SQLiteParser.FULL_, 0); }
		public TerminalNode OUTER_() { return getToken(SQLiteParser.OUTER_, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_join_operator);
		int _la;
		try {
			setState(1485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1472);
				match(COMMA);
				}
				break;
			case CROSS_:
			case FULL_:
			case INNER_:
			case JOIN_:
			case LEFT_:
			case NATURAL_:
			case RIGHT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL_) {
					{
					setState(1473);
					match(NATURAL_);
					}
				}

				setState(1482);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FULL_:
				case LEFT_:
				case RIGHT_:
					{
					setState(1476);
					_la = _input.LA(1);
					if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (FULL_ - 76)) | (1L << (LEFT_ - 76)) | (1L << (RIGHT_ - 76)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1478);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER_) {
						{
						setState(1477);
						match(OUTER_);
						}
					}

					}
					break;
				case INNER_:
					{
					setState(1480);
					match(INNER_);
					}
					break;
				case CROSS_:
					{
					setState(1481);
					match(CROSS_);
					}
					break;
				case JOIN_:
					break;
				default:
					break;
				}
				setState(1484);
				match(JOIN_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING_() { return getToken(SQLiteParser.USING_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_join_constraint);
		int _la;
		try {
			setState(1501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1487);
				match(ON_);
				setState(1488);
				expr(0);
				}
				break;
			case USING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1489);
				match(USING_);
				setState(1490);
				match(OPEN_PAR);
				setState(1491);
				column_name();
				setState(1496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1492);
					match(COMMA);
					setState(1493);
					column_name();
					}
					}
					setState(1498);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1499);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode UNION_() { return getToken(SQLiteParser.UNION_, 0); }
		public TerminalNode ALL_() { return getToken(SQLiteParser.ALL_, 0); }
		public TerminalNode INTERSECT_() { return getToken(SQLiteParser.INTERSECT_, 0); }
		public TerminalNode EXCEPT_() { return getToken(SQLiteParser.EXCEPT_, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_compound_operator);
		int _la;
		try {
			setState(1509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNION_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503);
				match(UNION_);
				setState(1505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL_) {
					{
					setState(1504);
					match(ALL_);
					}
				}

				}
				break;
			case INTERSECT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1507);
				match(INTERSECT_);
				}
				break;
			case EXCEPT_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1508);
				match(EXCEPT_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode SET_() { return getToken(SQLiteParser.SET_, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_name_listContext> column_name_list() {
			return getRuleContexts(Column_name_listContext.class);
		}
		public Column_name_listContext column_name_list(int i) {
			return getRuleContext(Column_name_listContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1511);
				with_clause();
				}
			}

			setState(1514);
			match(UPDATE_);
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1515);
				match(OR_);
				setState(1516);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (FAIL_ - 72)) | (1L << (IGNORE_ - 72)) | (1L << (REPLACE_ - 72)) | (1L << (ROLLBACK_ - 72)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1519);
			qualified_table_name();
			setState(1520);
			match(SET_);
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1521);
				column_name();
				}
				break;
			case 2:
				{
				setState(1522);
				column_name_list();
				}
				break;
			}
			setState(1525);
			match(ASSIGN);
			setState(1526);
			expr(0);
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1527);
				match(COMMA);
				setState(1530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1528);
					column_name();
					}
					break;
				case 2:
					{
					setState(1529);
					column_name_list();
					}
					break;
				}
				setState(1532);
				match(ASSIGN);
				setState(1533);
				expr(0);
				}
				}
				setState(1539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM_) {
				{
				setState(1540);
				match(FROM_);
				setState(1550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1541);
					table_or_subquery();
					setState(1546);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1542);
						match(COMMA);
						setState(1543);
						table_or_subquery();
						}
						}
						setState(1548);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1549);
					join_clause();
					}
					break;
				}
				}
			}

			setState(1556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(1554);
				match(WHERE_);
				setState(1555);
				expr(0);
				}
			}

			setState(1559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(1558);
				returning_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_name_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			match(OPEN_PAR);
			setState(1562);
			column_name();
			setState(1567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1563);
				match(COMMA);
				setState(1564);
				column_name();
				}
				}
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1570);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode SET_() { return getToken(SQLiteParser.SET_, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_name_listContext> column_name_list() {
			return getRuleContexts(Column_name_listContext.class);
		}
		public Column_name_listContext column_name_list(int i) {
			return getRuleContext(Column_name_listContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitUpdate_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1572);
				with_clause();
				}
			}

			setState(1575);
			match(UPDATE_);
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1576);
				match(OR_);
				setState(1577);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (FAIL_ - 72)) | (1L << (IGNORE_ - 72)) | (1L << (REPLACE_ - 72)) | (1L << (ROLLBACK_ - 72)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1580);
			qualified_table_name();
			setState(1581);
			match(SET_);
			setState(1584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1582);
				column_name();
				}
				break;
			case 2:
				{
				setState(1583);
				column_name_list();
				}
				break;
			}
			setState(1586);
			match(ASSIGN);
			setState(1587);
			expr(0);
			setState(1598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1588);
				match(COMMA);
				setState(1591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1589);
					column_name();
					}
					break;
				case 2:
					{
					setState(1590);
					column_name_list();
					}
					break;
				}
				setState(1593);
				match(ASSIGN);
				setState(1594);
				expr(0);
				}
				}
				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(1601);
				match(WHERE_);
				setState(1602);
				expr(0);
				}
			}

			setState(1606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(1605);
				returning_clause();
				}
			}

			setState(1612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_ || _la==ORDER_) {
				{
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_) {
					{
					setState(1608);
					order_by_stmt();
					}
				}

				setState(1611);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode INDEXED_() { return getToken(SQLiteParser.INDEXED_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_qualified_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1614);
				schema_name();
				setState(1615);
				match(DOT);
				}
				break;
			}
			setState(1619);
			table_name();
			setState(1622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_) {
				{
				setState(1620);
				match(AS_);
				setState(1621);
				alias();
				}
			}

			setState(1629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEXED_:
				{
				setState(1624);
				match(INDEXED_);
				setState(1625);
				match(BY_);
				setState(1626);
				index_name();
				}
				break;
			case NOT_:
				{
				setState(1627);
				match(NOT_);
				setState(1628);
				match(INDEXED_);
				}
				break;
			case EOF:
			case SCOL:
			case ALTER_:
			case ANALYZE_:
			case ATTACH_:
			case BEGIN_:
			case COMMIT_:
			case CREATE_:
			case DELETE_:
			case DETACH_:
			case DROP_:
			case END_:
			case EXPLAIN_:
			case INSERT_:
			case LIMIT_:
			case ORDER_:
			case PRAGMA_:
			case REINDEX_:
			case RELEASE_:
			case REPLACE_:
			case RETURNING_:
			case ROLLBACK_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case UPDATE_:
			case VACUUM_:
			case VALUES_:
			case WHERE_:
			case WITH_:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode VACUUM_() { return getToken(SQLiteParser.VACUUM_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode INTO_() { return getToken(SQLiteParser.INTO_, 0); }
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_vacuum_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			match(VACUUM_);
			setState(1633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1632);
				schema_name();
				}
				break;
			}
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO_) {
				{
				setState(1635);
				match(INTO_);
				setState(1636);
				filename();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Filter_clauseContext extends ParserRuleContext {
		public TerminalNode FILTER_() { return getToken(SQLiteParser.FILTER_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Filter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFilter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFilter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFilter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_clauseContext filter_clause() throws RecognitionException {
		Filter_clauseContext _localctx = new Filter_clauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_filter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			match(FILTER_);
			setState(1640);
			match(OPEN_PAR);
			setState(1641);
			match(WHERE_);
			setState(1642);
			expr(0);
			setState(1643);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_defnContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public List<TerminalNode> BY_() { return getTokens(SQLiteParser.BY_); }
		public TerminalNode BY_(int i) {
			return getToken(SQLiteParser.BY_, i);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public Base_window_nameContext base_window_name() {
			return getRuleContext(Base_window_nameContext.class,0);
		}
		public TerminalNode PARTITION_() { return getToken(SQLiteParser.PARTITION_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Frame_specContext frame_spec() {
			return getRuleContext(Frame_specContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Window_defnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_defn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterWindow_defn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitWindow_defn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitWindow_defn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_defnContext window_defn() throws RecognitionException {
		Window_defnContext _localctx = new Window_defnContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_window_defn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			match(OPEN_PAR);
			setState(1647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1646);
				base_window_name();
				}
				break;
			}
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION_) {
				{
				setState(1649);
				match(PARTITION_);
				setState(1650);
				match(BY_);
				setState(1651);
				expr(0);
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1652);
					match(COMMA);
					setState(1653);
					expr(0);
					}
					}
					setState(1658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(1661);
			match(ORDER_);
			setState(1662);
			match(BY_);
			setState(1663);
			ordering_term();
			setState(1668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1664);
				match(COMMA);
				setState(1665);
				ordering_term();
				}
				}
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ROWS_ - 128)) | (1L << (RANGE_ - 128)) | (1L << (GROUPS_ - 128)))) != 0)) {
				{
				setState(1671);
				frame_spec();
				}
			}

			setState(1674);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Over_clauseContext extends ParserRuleContext {
		public TerminalNode OVER_() { return getToken(SQLiteParser.OVER_, 0); }
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Base_window_nameContext base_window_name() {
			return getRuleContext(Base_window_nameContext.class,0);
		}
		public TerminalNode PARTITION_() { return getToken(SQLiteParser.PARTITION_, 0); }
		public List<TerminalNode> BY_() { return getTokens(SQLiteParser.BY_); }
		public TerminalNode BY_(int i) {
			return getToken(SQLiteParser.BY_, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public Frame_specContext frame_spec() {
			return getRuleContext(Frame_specContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOver_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOver_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOver_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Over_clauseContext over_clause() throws RecognitionException {
		Over_clauseContext _localctx = new Over_clauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			match(OVER_);
			setState(1710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(1677);
				window_name();
				}
				break;
			case 2:
				{
				setState(1678);
				match(OPEN_PAR);
				setState(1680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(1679);
					base_window_name();
					}
					break;
				}
				setState(1692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1682);
					match(PARTITION_);
					setState(1683);
					match(BY_);
					setState(1684);
					expr(0);
					setState(1689);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1685);
						match(COMMA);
						setState(1686);
						expr(0);
						}
						}
						setState(1691);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_) {
					{
					setState(1694);
					match(ORDER_);
					setState(1695);
					match(BY_);
					setState(1696);
					ordering_term();
					setState(1701);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1697);
						match(COMMA);
						setState(1698);
						ordering_term();
						}
						}
						setState(1703);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ROWS_ - 128)) | (1L << (RANGE_ - 128)) | (1L << (GROUPS_ - 128)))) != 0)) {
					{
					setState(1706);
					frame_spec();
					}
				}

				setState(1709);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Frame_specContext extends ParserRuleContext {
		public Frame_clauseContext frame_clause() {
			return getRuleContext(Frame_clauseContext.class,0);
		}
		public TerminalNode EXCLUDE_() { return getToken(SQLiteParser.EXCLUDE_, 0); }
		public TerminalNode NO_() { return getToken(SQLiteParser.NO_, 0); }
		public TerminalNode OTHERS_() { return getToken(SQLiteParser.OTHERS_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode GROUP_() { return getToken(SQLiteParser.GROUP_, 0); }
		public TerminalNode TIES_() { return getToken(SQLiteParser.TIES_, 0); }
		public Frame_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFrame_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFrame_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFrame_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_specContext frame_spec() throws RecognitionException {
		Frame_specContext _localctx = new Frame_specContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_frame_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			frame_clause();
			setState(1722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDE_) {
				{
				setState(1713);
				match(EXCLUDE_);
				setState(1720);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NO_:
					{
					setState(1714);
					match(NO_);
					setState(1715);
					match(OTHERS_);
					}
					break;
				case CURRENT_:
					{
					setState(1716);
					match(CURRENT_);
					setState(1717);
					match(ROW_);
					}
					break;
				case GROUP_:
					{
					setState(1718);
					match(GROUP_);
					}
					break;
				case TIES_:
					{
					setState(1719);
					match(TIES_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Frame_clauseContext extends ParserRuleContext {
		public TerminalNode RANGE_() { return getToken(SQLiteParser.RANGE_, 0); }
		public TerminalNode ROWS_() { return getToken(SQLiteParser.ROWS_, 0); }
		public TerminalNode GROUPS_() { return getToken(SQLiteParser.GROUPS_, 0); }
		public Frame_singleContext frame_single() {
			return getRuleContext(Frame_singleContext.class,0);
		}
		public TerminalNode BETWEEN_() { return getToken(SQLiteParser.BETWEEN_, 0); }
		public Frame_leftContext frame_left() {
			return getRuleContext(Frame_leftContext.class,0);
		}
		public TerminalNode AND_() { return getToken(SQLiteParser.AND_, 0); }
		public Frame_rightContext frame_right() {
			return getRuleContext(Frame_rightContext.class,0);
		}
		public Frame_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFrame_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFrame_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFrame_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_clauseContext frame_clause() throws RecognitionException {
		Frame_clauseContext _localctx = new Frame_clauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_frame_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			_la = _input.LA(1);
			if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ROWS_ - 128)) | (1L << (RANGE_ - 128)) | (1L << (GROUPS_ - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(1725);
				frame_single();
				}
				break;
			case 2:
				{
				setState(1726);
				match(BETWEEN_);
				setState(1727);
				frame_left();
				setState(1728);
				match(AND_);
				setState(1729);
				frame_right();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_function_invocationContext extends ParserRuleContext {
		public Simple_funcContext simple_func() {
			return getRuleContext(Simple_funcContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Simple_function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_function_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSimple_function_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSimple_function_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSimple_function_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_function_invocationContext simple_function_invocation() throws RecognitionException {
		Simple_function_invocationContext _localctx = new Simple_function_invocationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_simple_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			simple_func();
			setState(1734);
			match(OPEN_PAR);
			setState(1744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1735);
				expr(0);
				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1736);
					match(COMMA);
					setState(1737);
					expr(0);
					}
					}
					setState(1742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1743);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1746);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_function_invocationContext extends ParserRuleContext {
		public Aggregate_funcContext aggregate_func() {
			return getRuleContext(Aggregate_funcContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Aggregate_function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAggregate_function_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAggregate_function_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAggregate_function_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_function_invocationContext aggregate_function_invocation() throws RecognitionException {
		Aggregate_function_invocationContext _localctx = new Aggregate_function_invocationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_aggregate_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			aggregate_func();
			setState(1749);
			match(OPEN_PAR);
			setState(1762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1751);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(1750);
					match(DISTINCT_);
					}
					break;
				}
				setState(1753);
				expr(0);
				setState(1758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1754);
					match(COMMA);
					setState(1755);
					expr(0);
					}
					}
					setState(1760);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1761);
				match(STAR);
				}
				break;
			case CLOSE_PAR:
				break;
			default:
				break;
			}
			setState(1764);
			match(CLOSE_PAR);
			setState(1766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER_) {
				{
				setState(1765);
				filter_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_function_invocationContext extends ParserRuleContext {
		public Window_functionContext window_function() {
			return getRuleContext(Window_functionContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode OVER_() { return getToken(SQLiteParser.OVER_, 0); }
		public Window_defnContext window_defn() {
			return getRuleContext(Window_defnContext.class,0);
		}
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Window_function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_function_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterWindow_function_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitWindow_function_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitWindow_function_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_function_invocationContext window_function_invocation() throws RecognitionException {
		Window_function_invocationContext _localctx = new Window_function_invocationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_window_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			window_function();
			setState(1769);
			match(OPEN_PAR);
			setState(1779);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1770);
				expr(0);
				setState(1775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1771);
					match(COMMA);
					setState(1772);
					expr(0);
					}
					}
					setState(1777);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1778);
				match(STAR);
				}
				break;
			case CLOSE_PAR:
				break;
			default:
				break;
			}
			setState(1781);
			match(CLOSE_PAR);
			setState(1783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER_) {
				{
				setState(1782);
				filter_clause();
				}
			}

			setState(1785);
			match(OVER_);
			setState(1788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(1786);
				window_defn();
				}
				break;
			case 2:
				{
				setState(1787);
				window_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_stmtContext extends ParserRuleContext {
		public TerminalNode WITH_() { return getToken(SQLiteParser.WITH_, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode RECURSIVE_() { return getToken(SQLiteParser.RECURSIVE_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Common_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCommon_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCommon_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCommon_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_stmtContext common_table_stmt() throws RecognitionException {
		Common_table_stmtContext _localctx = new Common_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_common_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			match(WITH_);
			setState(1792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(1791);
				match(RECURSIVE_);
				}
				break;
			}
			setState(1794);
			common_table_expression();
			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1795);
				match(COMMA);
				setState(1796);
				common_table_expression();
				}
				}
				setState(1801);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_stmtContext extends ParserRuleContext {
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Order_by_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOrder_by_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOrder_by_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOrder_by_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_stmtContext order_by_stmt() throws RecognitionException {
		Order_by_stmtContext _localctx = new Order_by_stmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_order_by_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			match(ORDER_);
			setState(1803);
			match(BY_);
			setState(1804);
			ordering_term();
			setState(1809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1805);
				match(COMMA);
				setState(1806);
				ordering_term();
				}
				}
				setState(1811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_stmtContext extends ParserRuleContext {
		public TerminalNode LIMIT_() { return getToken(SQLiteParser.LIMIT_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OFFSET_() { return getToken(SQLiteParser.OFFSET_, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Limit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterLimit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitLimit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitLimit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_stmtContext limit_stmt() throws RecognitionException {
		Limit_stmtContext _localctx = new Limit_stmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_limit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			match(LIMIT_);
			setState(1813);
			expr(0);
			setState(1816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==OFFSET_) {
				{
				setState(1814);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==OFFSET_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1815);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public TerminalNode NULLS_() { return getToken(SQLiteParser.NULLS_, 0); }
		public TerminalNode FIRST_() { return getToken(SQLiteParser.FIRST_, 0); }
		public TerminalNode LAST_() { return getToken(SQLiteParser.LAST_, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			expr(0);
			setState(1821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE_) {
				{
				setState(1819);
				match(COLLATE_);
				setState(1820);
				collation_name();
				}
			}

			setState(1824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(1823);
				asc_desc();
				}
			}

			setState(1828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS_) {
				{
				setState(1826);
				match(NULLS_);
				setState(1827);
				_la = _input.LA(1);
				if ( !(_la==FIRST_ || _la==LAST_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Asc_descContext extends ParserRuleContext {
		public TerminalNode ASC_() { return getToken(SQLiteParser.ASC_, 0); }
		public TerminalNode DESC_() { return getToken(SQLiteParser.DESC_, 0); }
		public Asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asc_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAsc_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAsc_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAsc_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asc_descContext asc_desc() throws RecognitionException {
		Asc_descContext _localctx = new Asc_descContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_asc_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			_la = _input.LA(1);
			if ( !(_la==ASC_ || _la==DESC_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Frame_leftContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRECEDING_() { return getToken(SQLiteParser.PRECEDING_, 0); }
		public TerminalNode FOLLOWING_() { return getToken(SQLiteParser.FOLLOWING_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SQLiteParser.UNBOUNDED_, 0); }
		public Frame_leftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFrame_left(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFrame_left(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFrame_left(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_leftContext frame_left() throws RecognitionException {
		Frame_leftContext _localctx = new Frame_leftContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_frame_left);
		try {
			setState(1842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1832);
				expr(0);
				setState(1833);
				match(PRECEDING_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1835);
				expr(0);
				setState(1836);
				match(FOLLOWING_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1838);
				match(CURRENT_);
				setState(1839);
				match(ROW_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1840);
				match(UNBOUNDED_);
				setState(1841);
				match(PRECEDING_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Frame_rightContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRECEDING_() { return getToken(SQLiteParser.PRECEDING_, 0); }
		public TerminalNode FOLLOWING_() { return getToken(SQLiteParser.FOLLOWING_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SQLiteParser.UNBOUNDED_, 0); }
		public Frame_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFrame_right(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFrame_right(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFrame_right(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_rightContext frame_right() throws RecognitionException {
		Frame_rightContext _localctx = new Frame_rightContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_frame_right);
		try {
			setState(1854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1844);
				expr(0);
				setState(1845);
				match(PRECEDING_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1847);
				expr(0);
				setState(1848);
				match(FOLLOWING_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1850);
				match(CURRENT_);
				setState(1851);
				match(ROW_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1852);
				match(UNBOUNDED_);
				setState(1853);
				match(FOLLOWING_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Frame_singleContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRECEDING_() { return getToken(SQLiteParser.PRECEDING_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SQLiteParser.UNBOUNDED_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public Frame_singleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFrame_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFrame_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFrame_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_singleContext frame_single() throws RecognitionException {
		Frame_singleContext _localctx = new Frame_singleContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_frame_single);
		try {
			setState(1863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1856);
				expr(0);
				setState(1857);
				match(PRECEDING_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1859);
				match(UNBOUNDED_);
				setState(1860);
				match(PRECEDING_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1861);
				match(CURRENT_);
				setState(1862);
				match(ROW_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_functionContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public TerminalNode OVER_() { return getToken(SQLiteParser.OVER_, 0); }
		public Order_by_expr_asc_descContext order_by_expr_asc_desc() {
			return getRuleContext(Order_by_expr_asc_descContext.class,0);
		}
		public TerminalNode FIRST_VALUE_() { return getToken(SQLiteParser.FIRST_VALUE_, 0); }
		public TerminalNode LAST_VALUE_() { return getToken(SQLiteParser.LAST_VALUE_, 0); }
		public Partition_byContext partition_by() {
			return getRuleContext(Partition_byContext.class,0);
		}
		public Frame_clauseContext frame_clause() {
			return getRuleContext(Frame_clauseContext.class,0);
		}
		public TerminalNode CUME_DIST_() { return getToken(SQLiteParser.CUME_DIST_, 0); }
		public TerminalNode PERCENT_RANK_() { return getToken(SQLiteParser.PERCENT_RANK_, 0); }
		public Order_by_exprContext order_by_expr() {
			return getRuleContext(Order_by_exprContext.class,0);
		}
		public TerminalNode DENSE_RANK_() { return getToken(SQLiteParser.DENSE_RANK_, 0); }
		public TerminalNode RANK_() { return getToken(SQLiteParser.RANK_, 0); }
		public TerminalNode ROW_NUMBER_() { return getToken(SQLiteParser.ROW_NUMBER_, 0); }
		public TerminalNode LAG_() { return getToken(SQLiteParser.LAG_, 0); }
		public TerminalNode LEAD_() { return getToken(SQLiteParser.LEAD_, 0); }
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public TerminalNode NTH_VALUE_() { return getToken(SQLiteParser.NTH_VALUE_, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode NTILE_() { return getToken(SQLiteParser.NTILE_, 0); }
		public Window_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterWindow_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitWindow_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitWindow_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_functionContext window_function() throws RecognitionException {
		Window_functionContext _localctx = new Window_functionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_window_function);
		int _la;
		try {
			setState(1950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST_VALUE_:
			case LAST_VALUE_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1865);
				_la = _input.LA(1);
				if ( !(_la==FIRST_VALUE_ || _la==LAST_VALUE_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1866);
				match(OPEN_PAR);
				setState(1867);
				expr(0);
				setState(1868);
				match(CLOSE_PAR);
				setState(1869);
				match(OVER_);
				setState(1870);
				match(OPEN_PAR);
				setState(1872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1871);
					partition_by();
					}
				}

				setState(1874);
				order_by_expr_asc_desc();
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ROWS_ - 128)) | (1L << (RANGE_ - 128)) | (1L << (GROUPS_ - 128)))) != 0)) {
					{
					setState(1875);
					frame_clause();
					}
				}

				setState(1878);
				match(CLOSE_PAR);
				}
				break;
			case CUME_DIST_:
			case PERCENT_RANK_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1880);
				_la = _input.LA(1);
				if ( !(_la==CUME_DIST_ || _la==PERCENT_RANK_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1881);
				match(OPEN_PAR);
				setState(1882);
				match(CLOSE_PAR);
				setState(1883);
				match(OVER_);
				setState(1884);
				match(OPEN_PAR);
				setState(1886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1885);
					partition_by();
					}
				}

				setState(1889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_) {
					{
					setState(1888);
					order_by_expr();
					}
				}

				setState(1891);
				match(CLOSE_PAR);
				}
				break;
			case DENSE_RANK_:
			case RANK_:
			case ROW_NUMBER_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1892);
				_la = _input.LA(1);
				if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (DENSE_RANK_ - 160)) | (1L << (RANK_ - 160)) | (1L << (ROW_NUMBER_ - 160)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1893);
				match(OPEN_PAR);
				setState(1894);
				match(CLOSE_PAR);
				setState(1895);
				match(OVER_);
				setState(1896);
				match(OPEN_PAR);
				setState(1898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1897);
					partition_by();
					}
				}

				setState(1900);
				order_by_expr_asc_desc();
				setState(1901);
				match(CLOSE_PAR);
				}
				break;
			case LAG_:
			case LEAD_:
				enterOuterAlt(_localctx, 4);
				{
				setState(1903);
				_la = _input.LA(1);
				if ( !(_la==LAG_ || _la==LEAD_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1904);
				match(OPEN_PAR);
				setState(1905);
				expr(0);
				setState(1907);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(1906);
					offset();
					}
					break;
				}
				setState(1910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1909);
					default_value();
					}
				}

				setState(1912);
				match(CLOSE_PAR);
				setState(1913);
				match(OVER_);
				setState(1914);
				match(OPEN_PAR);
				setState(1916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1915);
					partition_by();
					}
				}

				setState(1918);
				order_by_expr_asc_desc();
				setState(1919);
				match(CLOSE_PAR);
				}
				break;
			case NTH_VALUE_:
				enterOuterAlt(_localctx, 5);
				{
				setState(1921);
				match(NTH_VALUE_);
				setState(1922);
				match(OPEN_PAR);
				setState(1923);
				expr(0);
				setState(1924);
				match(COMMA);
				setState(1925);
				signed_number();
				setState(1926);
				match(CLOSE_PAR);
				setState(1927);
				match(OVER_);
				setState(1928);
				match(OPEN_PAR);
				setState(1930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1929);
					partition_by();
					}
				}

				setState(1932);
				order_by_expr_asc_desc();
				setState(1934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ROWS_ - 128)) | (1L << (RANGE_ - 128)) | (1L << (GROUPS_ - 128)))) != 0)) {
					{
					setState(1933);
					frame_clause();
					}
				}

				setState(1936);
				match(CLOSE_PAR);
				}
				break;
			case NTILE_:
				enterOuterAlt(_localctx, 6);
				{
				setState(1938);
				match(NTILE_);
				setState(1939);
				match(OPEN_PAR);
				setState(1940);
				expr(0);
				setState(1941);
				match(CLOSE_PAR);
				setState(1942);
				match(OVER_);
				setState(1943);
				match(OPEN_PAR);
				setState(1945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1944);
					partition_by();
					}
				}

				setState(1947);
				order_by_expr_asc_desc();
				setState(1948);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			match(COMMA);
			setState(1953);
			signed_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDefault_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDefault_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDefault_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			match(COMMA);
			setState(1956);
			signed_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_byContext extends ParserRuleContext {
		public TerminalNode PARTITION_() { return getToken(SQLiteParser.PARTITION_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Partition_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterPartition_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitPartition_by(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitPartition_by(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_byContext partition_by() throws RecognitionException {
		Partition_byContext _localctx = new Partition_byContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_partition_by);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			match(PARTITION_);
			setState(1959);
			match(BY_);
			setState(1961); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1960);
					expr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1963); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_exprContext extends ParserRuleContext {
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Order_by_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOrder_by_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOrder_by_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOrder_by_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_exprContext order_by_expr() throws RecognitionException {
		Order_by_exprContext _localctx = new Order_by_exprContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_order_by_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			match(ORDER_);
			setState(1966);
			match(BY_);
			setState(1968); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1967);
				expr(0);
				}
				}
				setState(1970); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << ABORT_) | (1L << ACTION_) | (1L << ADD_) | (1L << AFTER_) | (1L << ALL_) | (1L << ALTER_) | (1L << ANALYZE_) | (1L << AND_) | (1L << AS_) | (1L << ASC_) | (1L << ATTACH_) | (1L << AUTOINCREMENT_) | (1L << BEFORE_) | (1L << BEGIN_) | (1L << BETWEEN_) | (1L << BY_) | (1L << CASCADE_) | (1L << CASE_) | (1L << CAST_) | (1L << CHECK_) | (1L << COLLATE_) | (1L << COLUMN_) | (1L << COMMIT_) | (1L << CONFLICT_) | (1L << CONSTRAINT_) | (1L << CREATE_) | (1L << CROSS_) | (1L << CURRENT_DATE_) | (1L << CURRENT_TIME_) | (1L << CURRENT_TIMESTAMP_) | (1L << DATABASE_) | (1L << DEFAULT_) | (1L << DEFERRABLE_) | (1L << DEFERRED_) | (1L << DELETE_) | (1L << DESC_) | (1L << DETACH_) | (1L << DISTINCT_) | (1L << DROP_))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EACH_ - 64)) | (1L << (ELSE_ - 64)) | (1L << (END_ - 64)) | (1L << (ESCAPE_ - 64)) | (1L << (EXCEPT_ - 64)) | (1L << (EXCLUSIVE_ - 64)) | (1L << (EXISTS_ - 64)) | (1L << (EXPLAIN_ - 64)) | (1L << (FAIL_ - 64)) | (1L << (FOR_ - 64)) | (1L << (FOREIGN_ - 64)) | (1L << (FROM_ - 64)) | (1L << (FULL_ - 64)) | (1L << (GLOB_ - 64)) | (1L << (GROUP_ - 64)) | (1L << (HAVING_ - 64)) | (1L << (IF_ - 64)) | (1L << (IGNORE_ - 64)) | (1L << (IMMEDIATE_ - 64)) | (1L << (IN_ - 64)) | (1L << (INDEX_ - 64)) | (1L << (INDEXED_ - 64)) | (1L << (INITIALLY_ - 64)) | (1L << (INNER_ - 64)) | (1L << (INSERT_ - 64)) | (1L << (INSTEAD_ - 64)) | (1L << (INTERSECT_ - 64)) | (1L << (INTO_ - 64)) | (1L << (IS_ - 64)) | (1L << (ISNULL_ - 64)) | (1L << (JOIN_ - 64)) | (1L << (KEY_ - 64)) | (1L << (LEFT_ - 64)) | (1L << (LIKE_ - 64)) | (1L << (LIMIT_ - 64)) | (1L << (MATCH_ - 64)) | (1L << (NATURAL_ - 64)) | (1L << (NO_ - 64)) | (1L << (NOT_ - 64)) | (1L << (NOTNULL_ - 64)) | (1L << (NULL_ - 64)) | (1L << (OF_ - 64)) | (1L << (OFFSET_ - 64)) | (1L << (ON_ - 64)) | (1L << (OR_ - 64)) | (1L << (ORDER_ - 64)) | (1L << (OUTER_ - 64)) | (1L << (PLAN_ - 64)) | (1L << (PRAGMA_ - 64)) | (1L << (PRIMARY_ - 64)) | (1L << (QUERY_ - 64)) | (1L << (RAISE_ - 64)) | (1L << (RECURSIVE_ - 64)) | (1L << (REFERENCES_ - 64)) | (1L << (REGEXP_ - 64)) | (1L << (REINDEX_ - 64)) | (1L << (RELEASE_ - 64)) | (1L << (RENAME_ - 64)) | (1L << (REPLACE_ - 64)) | (1L << (RESTRICT_ - 64)) | (1L << (RIGHT_ - 64)) | (1L << (ROLLBACK_ - 64)) | (1L << (ROW_ - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ROWS_ - 128)) | (1L << (SAVEPOINT_ - 128)) | (1L << (SELECT_ - 128)) | (1L << (SET_ - 128)) | (1L << (TABLE_ - 128)) | (1L << (TEMP_ - 128)) | (1L << (TEMPORARY_ - 128)) | (1L << (THEN_ - 128)) | (1L << (TO_ - 128)) | (1L << (TRANSACTION_ - 128)) | (1L << (TRIGGER_ - 128)) | (1L << (UNION_ - 128)) | (1L << (UNIQUE_ - 128)) | (1L << (UPDATE_ - 128)) | (1L << (USING_ - 128)) | (1L << (VACUUM_ - 128)) | (1L << (VALUES_ - 128)) | (1L << (VIEW_ - 128)) | (1L << (VIRTUAL_ - 128)) | (1L << (WHEN_ - 128)) | (1L << (WHERE_ - 128)) | (1L << (WITH_ - 128)) | (1L << (WITHOUT_ - 128)) | (1L << (FIRST_VALUE_ - 128)) | (1L << (OVER_ - 128)) | (1L << (PARTITION_ - 128)) | (1L << (RANGE_ - 128)) | (1L << (PRECEDING_ - 128)) | (1L << (UNBOUNDED_ - 128)) | (1L << (CURRENT_ - 128)) | (1L << (FOLLOWING_ - 128)) | (1L << (CUME_DIST_ - 128)) | (1L << (DENSE_RANK_ - 128)) | (1L << (LAG_ - 128)) | (1L << (LAST_VALUE_ - 128)) | (1L << (LEAD_ - 128)) | (1L << (NTH_VALUE_ - 128)) | (1L << (NTILE_ - 128)) | (1L << (PERCENT_RANK_ - 128)) | (1L << (RANK_ - 128)) | (1L << (ROW_NUMBER_ - 128)) | (1L << (GENERATED_ - 128)) | (1L << (ALWAYS_ - 128)) | (1L << (STORED_ - 128)) | (1L << (TRUE_ - 128)) | (1L << (FALSE_ - 128)) | (1L << (WINDOW_ - 128)) | (1L << (NULLS_ - 128)) | (1L << (FIRST_ - 128)) | (1L << (LAST_ - 128)) | (1L << (FILTER_ - 128)) | (1L << (GROUPS_ - 128)) | (1L << (EXCLUDE_ - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_expr_asc_descContext extends ParserRuleContext {
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public Expr_asc_descContext expr_asc_desc() {
			return getRuleContext(Expr_asc_descContext.class,0);
		}
		public Order_by_expr_asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expr_asc_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOrder_by_expr_asc_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOrder_by_expr_asc_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOrder_by_expr_asc_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_expr_asc_descContext order_by_expr_asc_desc() throws RecognitionException {
		Order_by_expr_asc_descContext _localctx = new Order_by_expr_asc_descContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_order_by_expr_asc_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			match(ORDER_);
			setState(1973);
			match(BY_);
			setState(1974);
			expr_asc_desc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_asc_descContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Asc_descContext> asc_desc() {
			return getRuleContexts(Asc_descContext.class);
		}
		public Asc_descContext asc_desc(int i) {
			return getRuleContext(Asc_descContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Expr_asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_asc_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterExpr_asc_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitExpr_asc_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitExpr_asc_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_asc_descContext expr_asc_desc() throws RecognitionException {
		Expr_asc_descContext _localctx = new Expr_asc_descContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_expr_asc_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976);
			expr(0);
			setState(1978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(1977);
				asc_desc();
				}
			}

			setState(1987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1980);
				match(COMMA);
				setState(1981);
				expr(0);
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC_ || _la==DESC_) {
					{
					setState(1982);
					asc_desc();
					}
				}

				}
				}
				setState(1989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initial_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Initial_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterInitial_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitInitial_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitInitial_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_selectContext initial_select() throws RecognitionException {
		Initial_selectContext _localctx = new Initial_selectContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_initial_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Recursive_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Recursive_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursive_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterRecursive_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitRecursive_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitRecursive_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Recursive_selectContext recursive_select() throws RecognitionException {
		Recursive_selectContext _localctx = new Recursive_selectContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_recursive_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1992);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLiteParser.TILDE, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1994);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==NOT_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_module_argument);
		try {
			setState(2000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1998);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1999);
				column_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode ACTION_() { return getToken(SQLiteParser.ACTION_, 0); }
		public TerminalNode ADD_() { return getToken(SQLiteParser.ADD_, 0); }
		public TerminalNode AFTER_() { return getToken(SQLiteParser.AFTER_, 0); }
		public TerminalNode ALL_() { return getToken(SQLiteParser.ALL_, 0); }
		public TerminalNode ALTER_() { return getToken(SQLiteParser.ALTER_, 0); }
		public TerminalNode ANALYZE_() { return getToken(SQLiteParser.ANALYZE_, 0); }
		public TerminalNode AND_() { return getToken(SQLiteParser.AND_, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public TerminalNode ASC_() { return getToken(SQLiteParser.ASC_, 0); }
		public TerminalNode ATTACH_() { return getToken(SQLiteParser.ATTACH_, 0); }
		public TerminalNode AUTOINCREMENT_() { return getToken(SQLiteParser.AUTOINCREMENT_, 0); }
		public TerminalNode BEFORE_() { return getToken(SQLiteParser.BEFORE_, 0); }
		public TerminalNode BEGIN_() { return getToken(SQLiteParser.BEGIN_, 0); }
		public TerminalNode BETWEEN_() { return getToken(SQLiteParser.BETWEEN_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public TerminalNode CASCADE_() { return getToken(SQLiteParser.CASCADE_, 0); }
		public TerminalNode CASE_() { return getToken(SQLiteParser.CASE_, 0); }
		public TerminalNode CAST_() { return getToken(SQLiteParser.CAST_, 0); }
		public TerminalNode CHECK_() { return getToken(SQLiteParser.CHECK_, 0); }
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public TerminalNode COLUMN_() { return getToken(SQLiteParser.COLUMN_, 0); }
		public TerminalNode COMMIT_() { return getToken(SQLiteParser.COMMIT_, 0); }
		public TerminalNode CONFLICT_() { return getToken(SQLiteParser.CONFLICT_, 0); }
		public TerminalNode CONSTRAINT_() { return getToken(SQLiteParser.CONSTRAINT_, 0); }
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode CROSS_() { return getToken(SQLiteParser.CROSS_, 0); }
		public TerminalNode CURRENT_DATE_() { return getToken(SQLiteParser.CURRENT_DATE_, 0); }
		public TerminalNode CURRENT_TIME_() { return getToken(SQLiteParser.CURRENT_TIME_, 0); }
		public TerminalNode CURRENT_TIMESTAMP_() { return getToken(SQLiteParser.CURRENT_TIMESTAMP_, 0); }
		public TerminalNode DATABASE_() { return getToken(SQLiteParser.DATABASE_, 0); }
		public TerminalNode DEFAULT_() { return getToken(SQLiteParser.DEFAULT_, 0); }
		public TerminalNode DEFERRABLE_() { return getToken(SQLiteParser.DEFERRABLE_, 0); }
		public TerminalNode DEFERRED_() { return getToken(SQLiteParser.DEFERRED_, 0); }
		public TerminalNode DELETE_() { return getToken(SQLiteParser.DELETE_, 0); }
		public TerminalNode DESC_() { return getToken(SQLiteParser.DESC_, 0); }
		public TerminalNode DETACH_() { return getToken(SQLiteParser.DETACH_, 0); }
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public TerminalNode DROP_() { return getToken(SQLiteParser.DROP_, 0); }
		public TerminalNode EACH_() { return getToken(SQLiteParser.EACH_, 0); }
		public TerminalNode ELSE_() { return getToken(SQLiteParser.ELSE_, 0); }
		public TerminalNode END_() { return getToken(SQLiteParser.END_, 0); }
		public TerminalNode ESCAPE_() { return getToken(SQLiteParser.ESCAPE_, 0); }
		public TerminalNode EXCEPT_() { return getToken(SQLiteParser.EXCEPT_, 0); }
		public TerminalNode EXCLUSIVE_() { return getToken(SQLiteParser.EXCLUSIVE_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public TerminalNode EXPLAIN_() { return getToken(SQLiteParser.EXPLAIN_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode FOR_() { return getToken(SQLiteParser.FOR_, 0); }
		public TerminalNode FOREIGN_() { return getToken(SQLiteParser.FOREIGN_, 0); }
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public TerminalNode FULL_() { return getToken(SQLiteParser.FULL_, 0); }
		public TerminalNode GLOB_() { return getToken(SQLiteParser.GLOB_, 0); }
		public TerminalNode GROUP_() { return getToken(SQLiteParser.GROUP_, 0); }
		public TerminalNode HAVING_() { return getToken(SQLiteParser.HAVING_, 0); }
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public TerminalNode IMMEDIATE_() { return getToken(SQLiteParser.IMMEDIATE_, 0); }
		public TerminalNode IN_() { return getToken(SQLiteParser.IN_, 0); }
		public TerminalNode INDEX_() { return getToken(SQLiteParser.INDEX_, 0); }
		public TerminalNode INDEXED_() { return getToken(SQLiteParser.INDEXED_, 0); }
		public TerminalNode INITIALLY_() { return getToken(SQLiteParser.INITIALLY_, 0); }
		public TerminalNode INNER_() { return getToken(SQLiteParser.INNER_, 0); }
		public TerminalNode INSERT_() { return getToken(SQLiteParser.INSERT_, 0); }
		public TerminalNode INSTEAD_() { return getToken(SQLiteParser.INSTEAD_, 0); }
		public TerminalNode INTERSECT_() { return getToken(SQLiteParser.INTERSECT_, 0); }
		public TerminalNode INTO_() { return getToken(SQLiteParser.INTO_, 0); }
		public TerminalNode IS_() { return getToken(SQLiteParser.IS_, 0); }
		public TerminalNode ISNULL_() { return getToken(SQLiteParser.ISNULL_, 0); }
		public TerminalNode JOIN_() { return getToken(SQLiteParser.JOIN_, 0); }
		public TerminalNode KEY_() { return getToken(SQLiteParser.KEY_, 0); }
		public TerminalNode LEFT_() { return getToken(SQLiteParser.LEFT_, 0); }
		public TerminalNode LIKE_() { return getToken(SQLiteParser.LIKE_, 0); }
		public TerminalNode LIMIT_() { return getToken(SQLiteParser.LIMIT_, 0); }
		public TerminalNode MATCH_() { return getToken(SQLiteParser.MATCH_, 0); }
		public TerminalNode NATURAL_() { return getToken(SQLiteParser.NATURAL_, 0); }
		public TerminalNode NO_() { return getToken(SQLiteParser.NO_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode NOTNULL_() { return getToken(SQLiteParser.NOTNULL_, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public TerminalNode OF_() { return getToken(SQLiteParser.OF_, 0); }
		public TerminalNode OFFSET_() { return getToken(SQLiteParser.OFFSET_, 0); }
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public TerminalNode OUTER_() { return getToken(SQLiteParser.OUTER_, 0); }
		public TerminalNode PLAN_() { return getToken(SQLiteParser.PLAN_, 0); }
		public TerminalNode PRAGMA_() { return getToken(SQLiteParser.PRAGMA_, 0); }
		public TerminalNode PRIMARY_() { return getToken(SQLiteParser.PRIMARY_, 0); }
		public TerminalNode QUERY_() { return getToken(SQLiteParser.QUERY_, 0); }
		public TerminalNode RAISE_() { return getToken(SQLiteParser.RAISE_, 0); }
		public TerminalNode RECURSIVE_() { return getToken(SQLiteParser.RECURSIVE_, 0); }
		public TerminalNode REFERENCES_() { return getToken(SQLiteParser.REFERENCES_, 0); }
		public TerminalNode REGEXP_() { return getToken(SQLiteParser.REGEXP_, 0); }
		public TerminalNode REINDEX_() { return getToken(SQLiteParser.REINDEX_, 0); }
		public TerminalNode RELEASE_() { return getToken(SQLiteParser.RELEASE_, 0); }
		public TerminalNode RENAME_() { return getToken(SQLiteParser.RENAME_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public TerminalNode RESTRICT_() { return getToken(SQLiteParser.RESTRICT_, 0); }
		public TerminalNode RIGHT_() { return getToken(SQLiteParser.RIGHT_, 0); }
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode ROWS_() { return getToken(SQLiteParser.ROWS_, 0); }
		public TerminalNode SAVEPOINT_() { return getToken(SQLiteParser.SAVEPOINT_, 0); }
		public TerminalNode SELECT_() { return getToken(SQLiteParser.SELECT_, 0); }
		public TerminalNode SET_() { return getToken(SQLiteParser.SET_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public TerminalNode TEMP_() { return getToken(SQLiteParser.TEMP_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(SQLiteParser.TEMPORARY_, 0); }
		public TerminalNode THEN_() { return getToken(SQLiteParser.THEN_, 0); }
		public TerminalNode TO_() { return getToken(SQLiteParser.TO_, 0); }
		public TerminalNode TRANSACTION_() { return getToken(SQLiteParser.TRANSACTION_, 0); }
		public TerminalNode TRIGGER_() { return getToken(SQLiteParser.TRIGGER_, 0); }
		public TerminalNode UNION_() { return getToken(SQLiteParser.UNION_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public TerminalNode USING_() { return getToken(SQLiteParser.USING_, 0); }
		public TerminalNode VACUUM_() { return getToken(SQLiteParser.VACUUM_, 0); }
		public TerminalNode VALUES_() { return getToken(SQLiteParser.VALUES_, 0); }
		public TerminalNode VIEW_() { return getToken(SQLiteParser.VIEW_, 0); }
		public TerminalNode VIRTUAL_() { return getToken(SQLiteParser.VIRTUAL_, 0); }
		public TerminalNode WHEN_() { return getToken(SQLiteParser.WHEN_, 0); }
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public TerminalNode WITH_() { return getToken(SQLiteParser.WITH_, 0); }
		public TerminalNode WITHOUT_() { return getToken(SQLiteParser.WITHOUT_, 0); }
		public TerminalNode FIRST_VALUE_() { return getToken(SQLiteParser.FIRST_VALUE_, 0); }
		public TerminalNode OVER_() { return getToken(SQLiteParser.OVER_, 0); }
		public TerminalNode PARTITION_() { return getToken(SQLiteParser.PARTITION_, 0); }
		public TerminalNode RANGE_() { return getToken(SQLiteParser.RANGE_, 0); }
		public TerminalNode PRECEDING_() { return getToken(SQLiteParser.PRECEDING_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SQLiteParser.UNBOUNDED_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode FOLLOWING_() { return getToken(SQLiteParser.FOLLOWING_, 0); }
		public TerminalNode CUME_DIST_() { return getToken(SQLiteParser.CUME_DIST_, 0); }
		public TerminalNode DENSE_RANK_() { return getToken(SQLiteParser.DENSE_RANK_, 0); }
		public TerminalNode LAG_() { return getToken(SQLiteParser.LAG_, 0); }
		public TerminalNode LAST_VALUE_() { return getToken(SQLiteParser.LAST_VALUE_, 0); }
		public TerminalNode LEAD_() { return getToken(SQLiteParser.LEAD_, 0); }
		public TerminalNode NTH_VALUE_() { return getToken(SQLiteParser.NTH_VALUE_, 0); }
		public TerminalNode NTILE_() { return getToken(SQLiteParser.NTILE_, 0); }
		public TerminalNode PERCENT_RANK_() { return getToken(SQLiteParser.PERCENT_RANK_, 0); }
		public TerminalNode RANK_() { return getToken(SQLiteParser.RANK_, 0); }
		public TerminalNode ROW_NUMBER_() { return getToken(SQLiteParser.ROW_NUMBER_, 0); }
		public TerminalNode GENERATED_() { return getToken(SQLiteParser.GENERATED_, 0); }
		public TerminalNode ALWAYS_() { return getToken(SQLiteParser.ALWAYS_, 0); }
		public TerminalNode STORED_() { return getToken(SQLiteParser.STORED_, 0); }
		public TerminalNode TRUE_() { return getToken(SQLiteParser.TRUE_, 0); }
		public TerminalNode FALSE_() { return getToken(SQLiteParser.FALSE_, 0); }
		public TerminalNode WINDOW_() { return getToken(SQLiteParser.WINDOW_, 0); }
		public TerminalNode NULLS_() { return getToken(SQLiteParser.NULLS_, 0); }
		public TerminalNode FIRST_() { return getToken(SQLiteParser.FIRST_, 0); }
		public TerminalNode LAST_() { return getToken(SQLiteParser.LAST_, 0); }
		public TerminalNode FILTER_() { return getToken(SQLiteParser.FILTER_, 0); }
		public TerminalNode GROUPS_() { return getToken(SQLiteParser.GROUPS_, 0); }
		public TerminalNode EXCLUDE_() { return getToken(SQLiteParser.EXCLUDE_, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2004);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABORT_) | (1L << ACTION_) | (1L << ADD_) | (1L << AFTER_) | (1L << ALL_) | (1L << ALTER_) | (1L << ANALYZE_) | (1L << AND_) | (1L << AS_) | (1L << ASC_) | (1L << ATTACH_) | (1L << AUTOINCREMENT_) | (1L << BEFORE_) | (1L << BEGIN_) | (1L << BETWEEN_) | (1L << BY_) | (1L << CASCADE_) | (1L << CASE_) | (1L << CAST_) | (1L << CHECK_) | (1L << COLLATE_) | (1L << COLUMN_) | (1L << COMMIT_) | (1L << CONFLICT_) | (1L << CONSTRAINT_) | (1L << CREATE_) | (1L << CROSS_) | (1L << CURRENT_DATE_) | (1L << CURRENT_TIME_) | (1L << CURRENT_TIMESTAMP_) | (1L << DATABASE_) | (1L << DEFAULT_) | (1L << DEFERRABLE_) | (1L << DEFERRED_) | (1L << DELETE_) | (1L << DESC_) | (1L << DETACH_) | (1L << DISTINCT_) | (1L << DROP_))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EACH_ - 64)) | (1L << (ELSE_ - 64)) | (1L << (END_ - 64)) | (1L << (ESCAPE_ - 64)) | (1L << (EXCEPT_ - 64)) | (1L << (EXCLUSIVE_ - 64)) | (1L << (EXISTS_ - 64)) | (1L << (EXPLAIN_ - 64)) | (1L << (FAIL_ - 64)) | (1L << (FOR_ - 64)) | (1L << (FOREIGN_ - 64)) | (1L << (FROM_ - 64)) | (1L << (FULL_ - 64)) | (1L << (GLOB_ - 64)) | (1L << (GROUP_ - 64)) | (1L << (HAVING_ - 64)) | (1L << (IF_ - 64)) | (1L << (IGNORE_ - 64)) | (1L << (IMMEDIATE_ - 64)) | (1L << (IN_ - 64)) | (1L << (INDEX_ - 64)) | (1L << (INDEXED_ - 64)) | (1L << (INITIALLY_ - 64)) | (1L << (INNER_ - 64)) | (1L << (INSERT_ - 64)) | (1L << (INSTEAD_ - 64)) | (1L << (INTERSECT_ - 64)) | (1L << (INTO_ - 64)) | (1L << (IS_ - 64)) | (1L << (ISNULL_ - 64)) | (1L << (JOIN_ - 64)) | (1L << (KEY_ - 64)) | (1L << (LEFT_ - 64)) | (1L << (LIKE_ - 64)) | (1L << (LIMIT_ - 64)) | (1L << (MATCH_ - 64)) | (1L << (NATURAL_ - 64)) | (1L << (NO_ - 64)) | (1L << (NOT_ - 64)) | (1L << (NOTNULL_ - 64)) | (1L << (NULL_ - 64)) | (1L << (OF_ - 64)) | (1L << (OFFSET_ - 64)) | (1L << (ON_ - 64)) | (1L << (OR_ - 64)) | (1L << (ORDER_ - 64)) | (1L << (OUTER_ - 64)) | (1L << (PLAN_ - 64)) | (1L << (PRAGMA_ - 64)) | (1L << (PRIMARY_ - 64)) | (1L << (QUERY_ - 64)) | (1L << (RAISE_ - 64)) | (1L << (RECURSIVE_ - 64)) | (1L << (REFERENCES_ - 64)) | (1L << (REGEXP_ - 64)) | (1L << (REINDEX_ - 64)) | (1L << (RELEASE_ - 64)) | (1L << (RENAME_ - 64)) | (1L << (REPLACE_ - 64)) | (1L << (RESTRICT_ - 64)) | (1L << (RIGHT_ - 64)) | (1L << (ROLLBACK_ - 64)) | (1L << (ROW_ - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ROWS_ - 128)) | (1L << (SAVEPOINT_ - 128)) | (1L << (SELECT_ - 128)) | (1L << (SET_ - 128)) | (1L << (TABLE_ - 128)) | (1L << (TEMP_ - 128)) | (1L << (TEMPORARY_ - 128)) | (1L << (THEN_ - 128)) | (1L << (TO_ - 128)) | (1L << (TRANSACTION_ - 128)) | (1L << (TRIGGER_ - 128)) | (1L << (UNION_ - 128)) | (1L << (UNIQUE_ - 128)) | (1L << (UPDATE_ - 128)) | (1L << (USING_ - 128)) | (1L << (VACUUM_ - 128)) | (1L << (VALUES_ - 128)) | (1L << (VIEW_ - 128)) | (1L << (VIRTUAL_ - 128)) | (1L << (WHEN_ - 128)) | (1L << (WHERE_ - 128)) | (1L << (WITH_ - 128)) | (1L << (WITHOUT_ - 128)) | (1L << (FIRST_VALUE_ - 128)) | (1L << (OVER_ - 128)) | (1L << (PARTITION_ - 128)) | (1L << (RANGE_ - 128)) | (1L << (PRECEDING_ - 128)) | (1L << (UNBOUNDED_ - 128)) | (1L << (CURRENT_ - 128)) | (1L << (FOLLOWING_ - 128)) | (1L << (CUME_DIST_ - 128)) | (1L << (DENSE_RANK_ - 128)) | (1L << (LAG_ - 128)) | (1L << (LAST_VALUE_ - 128)) | (1L << (LEAD_ - 128)) | (1L << (NTH_VALUE_ - 128)) | (1L << (NTILE_ - 128)) | (1L << (PERCENT_RANK_ - 128)) | (1L << (RANK_ - 128)) | (1L << (ROW_NUMBER_ - 128)) | (1L << (GENERATED_ - 128)) | (1L << (ALWAYS_ - 128)) | (1L << (STORED_ - 128)) | (1L << (TRUE_ - 128)) | (1L << (FALSE_ - 128)) | (1L << (WINDOW_ - 128)) | (1L << (NULLS_ - 128)) | (1L << (FIRST_ - 128)) | (1L << (LAST_ - 128)) | (1L << (FILTER_ - 128)) | (1L << (GROUPS_ - 128)) | (1L << (EXCLUDE_ - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2006);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSchema_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2020);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2022);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2030);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2032);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2034);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2036);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterWindow_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitWindow_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitWindow_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_nameContext window_name() throws RecognitionException {
		Window_nameContext _localctx = new Window_nameContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilenameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_window_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Base_window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_window_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterBase_window_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitBase_window_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitBase_window_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_window_nameContext base_window_name() throws RecognitionException {
		Base_window_nameContext _localctx = new Base_window_nameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_base_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_funcContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Simple_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSimple_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSimple_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSimple_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_funcContext simple_func() throws RecognitionException {
		Simple_funcContext _localctx = new Simple_funcContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_simple_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_funcContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Aggregate_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAggregate_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAggregate_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAggregate_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_funcContext aggregate_func() throws RecognitionException {
		Aggregate_funcContext _localctx = new Aggregate_funcContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_aggregate_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2048);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_function_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_function_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_function_nameContext table_function_name() throws RecognitionException {
		Table_function_nameContext _localctx = new Table_function_nameContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_table_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2050);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_any_name);
		try {
			setState(2059);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2052);
				match(IDENTIFIER);
				}
				break;
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(2053);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2054);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(2055);
				match(OPEN_PAR);
				setState(2056);
				any_name();
				setState(2057);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c3\u0810\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\3\2\7\2\u00e6\n\2\f\2\16\2"+
		"\u00e9\13\2\3\2\3\2\3\3\7\3\u00ee\n\3\f\3\16\3\u00f1\13\3\3\3\3\3\6\3"+
		"\u00f5\n\3\r\3\16\3\u00f6\3\3\7\3\u00fa\n\3\f\3\16\3\u00fd\13\3\3\3\7"+
		"\3\u0100\n\3\f\3\16\3\u0103\13\3\3\4\3\4\3\4\5\4\u0108\n\4\5\4\u010a\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0124\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u012b"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0132\n\5\3\5\3\5\3\5\3\5\5\5\u0138\n\5\3"+
		"\5\3\5\5\5\u013c\n\5\3\5\3\5\3\5\5\5\u0141\n\5\3\5\5\5\u0144\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u014b\n\6\3\6\5\6\u014e\n\6\3\7\3\7\5\7\u0152\n\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\5\b\u015a\n\b\3\b\3\b\5\b\u015e\n\b\5\b\u0160\n"+
		"\b\3\t\3\t\5\t\u0164\n\t\3\n\3\n\5\n\u0168\n\n\3\n\3\n\5\n\u016c\n\n\3"+
		"\n\5\n\u016f\n\n\3\13\3\13\3\13\3\f\3\f\5\f\u0176\n\f\3\f\3\f\3\r\3\r"+
		"\5\r\u017c\n\r\3\r\3\r\3\r\3\r\5\r\u0182\n\r\3\r\3\r\3\r\5\r\u0187\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0190\n\r\f\r\16\r\u0193\13\r\3\r\3\r"+
		"\3\r\5\r\u0198\n\r\3\16\3\16\5\16\u019c\n\16\3\16\3\16\5\16\u01a0\n\16"+
		"\3\16\5\16\u01a3\n\16\3\17\3\17\5\17\u01a7\n\17\3\17\3\17\3\17\3\17\5"+
		"\17\u01ad\n\17\3\17\3\17\3\17\5\17\u01b2\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u01b9\n\17\f\17\16\17\u01bc\13\17\3\17\3\17\7\17\u01c0\n\17\f\17"+
		"\16\17\u01c3\13\17\3\17\3\17\3\17\5\17\u01c8\n\17\3\17\3\17\5\17\u01cc"+
		"\n\17\3\20\3\20\5\20\u01d0\n\20\3\20\7\20\u01d3\n\20\f\20\16\20\u01d6"+
		"\13\20\3\21\6\21\u01d9\n\21\r\21\16\21\u01da\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u01e7\n\21\3\22\3\22\5\22\u01eb\n\22\3"+
		"\22\3\22\3\22\5\22\u01f0\n\22\3\22\5\22\u01f3\n\22\3\22\5\22\u01f6\n\22"+
		"\3\22\5\22\u01f9\n\22\3\22\3\22\5\22\u01fd\n\22\3\22\5\22\u0200\n\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u020e"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0215\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u021c\n\22\5\22\u021e\n\22\3\23\5\23\u0221\n\23\3\23\3\23\3\24\3"+
		"\24\5\24\u0227\n\24\3\24\3\24\3\24\5\24\u022c\n\24\3\24\3\24\3\24\3\24"+
		"\7\24\u0232\n\24\f\24\16\24\u0235\13\24\3\24\3\24\5\24\u0239\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0246\n\24\f\24"+
		"\16\24\u0249\13\24\3\24\3\24\3\24\5\24\u024e\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u0256\n\25\f\25\16\25\u0259\13\25\3\25\3\25\5\25\u025d"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0267\n\25\3\25\3\25"+
		"\7\25\u026b\n\25\f\25\16\25\u026e\13\25\3\25\5\25\u0271\n\25\3\25\3\25"+
		"\3\25\5\25\u0276\n\25\5\25\u0278\n\25\3\26\3\26\3\26\3\26\3\27\3\27\5"+
		"\27\u0280\n\27\3\27\3\27\3\27\3\27\5\27\u0286\n\27\3\27\3\27\3\27\5\27"+
		"\u028b\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u0292\n\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\7\27\u029b\n\27\f\27\16\27\u029e\13\27\5\27\u02a0\n"+
		"\27\5\27\u02a2\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u02a9\n\27\3\27\3\27"+
		"\5\27\u02ad\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u02b4\n\27\3\27\3\27\6"+
		"\27\u02b8\n\27\r\27\16\27\u02b9\3\27\3\27\3\30\3\30\5\30\u02c0\n\30\3"+
		"\30\3\30\3\30\3\30\5\30\u02c6\n\30\3\30\3\30\3\30\5\30\u02cb\n\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u02d2\n\30\f\30\16\30\u02d5\13\30\3\30\3\30"+
		"\5\30\u02d9\n\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u02e4"+
		"\n\31\3\31\3\31\3\31\5\31\u02e9\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u02f2\n\31\f\31\16\31\u02f5\13\31\3\31\3\31\5\31\u02f9\n\31\3\32"+
		"\3\32\5\32\u02fd\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u030b\n\32\f\32\16\32\u030e\13\32\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u0315\n\33\f\33\16\33\u0318\13\33\3\33\3\33\5\33\u031c\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0324\n\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u032e\n\35\f\35\16\35\u0331\13\35\3\35\3\35\5\35"+
		"\u0335\n\35\3\35\3\35\3\35\3\35\3\35\3\36\5\36\u033d\n\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u0344\n\36\3\36\5\36\u0347\n\36\3\37\5\37\u034a\n\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u0351\n\37\3\37\5\37\u0354\n\37\3\37\5"+
		"\37\u0357\n\37\3\37\5\37\u035a\n\37\3 \3 \5 \u035e\n \3 \3 \3!\3!\3!\3"+
		"!\5!\u0366\n!\3!\3!\3!\5!\u036b\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0375"+
		"\n\"\3\"\3\"\3\"\5\"\u037a\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0383\n"+
		"\"\3\"\3\"\3\"\7\"\u0388\n\"\f\"\16\"\u038b\13\"\3\"\5\"\u038e\n\"\3\""+
		"\3\"\5\"\u0392\n\"\3\"\5\"\u0395\n\"\3\"\3\"\3\"\3\"\7\"\u039b\n\"\f\""+
		"\16\"\u039e\13\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u03aa\n\""+
		"\3\"\5\"\u03ad\n\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u03b5\n\"\3\"\3\"\3\"\3"+
		"\"\3\"\6\"\u03bc\n\"\r\"\16\"\u03bd\3\"\3\"\5\"\u03c2\n\"\3\"\3\"\3\""+
		"\5\"\u03c7\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u03e2\n\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u03eb\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u03f7\n\"\3\"\3\"\3\"\5\"\u03fc\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u0408\n\"\3\"\3\"\3\"\3\"\5\"\u040e\n\"\3\"\3\"\3\"\3\""+
		"\3\"\5\"\u0415\n\"\3\"\3\"\5\"\u0419\n\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0421"+
		"\n\"\f\"\16\"\u0424\13\"\5\"\u0426\n\"\3\"\3\"\3\"\3\"\5\"\u042c\n\"\3"+
		"\"\3\"\3\"\3\"\5\"\u0432\n\"\3\"\3\"\3\"\3\"\3\"\7\"\u0439\n\"\f\"\16"+
		"\"\u043c\13\"\5\"\u043e\n\"\3\"\3\"\5\"\u0442\n\"\7\"\u0444\n\"\f\"\16"+
		"\"\u0447\13\"\3#\3#\3#\3#\3#\3#\5#\u044f\n#\3#\3#\3$\3$\3%\3%\3%\3%\7"+
		"%\u0459\n%\f%\16%\u045c\13%\3%\3%\3&\3&\3&\3&\7&\u0464\n&\f&\16&\u0467"+
		"\13&\3\'\5\'\u046a\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u0471\n\'\3\'\3\'\3\'\3"+
		"\'\5\'\u0477\n\'\3\'\3\'\3\'\5\'\u047c\n\'\3\'\3\'\3\'\3\'\7\'\u0482\n"+
		"\'\f\'\16\'\u0485\13\'\3\'\3\'\5\'\u0489\n\'\3\'\3\'\5\'\u048d\n\'\3\'"+
		"\5\'\u0490\n\'\3\'\3\'\5\'\u0494\n\'\3\'\5\'\u0497\n\'\3(\3(\3(\3(\7("+
		"\u049d\n(\f(\16(\u04a0\13(\3)\3)\3)\3)\3)\3)\7)\u04a8\n)\f)\16)\u04ab"+
		"\13)\3)\3)\3)\5)\u04b0\n)\5)\u04b2\n)\3)\3)\3)\3)\3)\3)\5)\u04ba\n)\3"+
		")\3)\3)\3)\3)\5)\u04c1\n)\3)\3)\3)\7)\u04c6\n)\f)\16)\u04c9\13)\3)\3)"+
		"\5)\u04cd\n)\5)\u04cf\n)\3*\3*\3*\3*\5*\u04d5\n*\3*\3*\3*\3*\3*\3*\3*"+
		"\5*\u04de\n*\3+\3+\3+\5+\u04e3\n+\3,\3,\3,\3,\3,\5,\u04ea\n,\3,\3,\5,"+
		"\u04ee\n,\5,\u04f0\n,\3-\5-\u04f3\n-\3-\3-\3-\3-\7-\u04f9\n-\f-\16-\u04fc"+
		"\13-\3-\5-\u04ff\n-\3-\5-\u0502\n-\3.\3.\3.\3.\5.\u0508\n.\7.\u050a\n"+
		".\f.\16.\u050d\13.\3/\3/\5/\u0511\n/\3/\3/\3/\7/\u0516\n/\f/\16/\u0519"+
		"\13/\3/\3/\3/\3/\7/\u051f\n/\f/\16/\u0522\13/\3/\5/\u0525\n/\5/\u0527"+
		"\n/\3/\3/\5/\u052b\n/\3/\3/\3/\3/\3/\7/\u0532\n/\f/\16/\u0535\13/\3/\3"+
		"/\5/\u0539\n/\5/\u053b\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0546\n/\f/\16"+
		"/\u0549\13/\5/\u054b\n/\3/\5/\u054e\n/\3\60\3\60\3\61\5\61\u0553\n\61"+
		"\3\61\3\61\5\61\u0557\n\61\3\61\5\61\u055a\n\61\3\62\5\62\u055d\n\62\3"+
		"\62\3\62\3\62\5\62\u0562\n\62\3\62\3\62\5\62\u0566\n\62\3\62\6\62\u0569"+
		"\n\62\r\62\16\62\u056a\3\62\5\62\u056e\n\62\3\62\5\62\u0571\n\62\3\63"+
		"\3\63\3\63\5\63\u0576\n\63\3\63\3\63\5\63\u057a\n\63\3\63\5\63\u057d\n"+
		"\63\3\63\3\63\3\63\3\63\3\63\5\63\u0584\n\63\3\63\3\63\3\63\5\63\u0589"+
		"\n\63\3\63\3\63\3\63\3\63\3\63\7\63\u0590\n\63\f\63\16\63\u0593\13\63"+
		"\3\63\3\63\5\63\u0597\n\63\3\63\5\63\u059a\n\63\3\63\3\63\3\63\3\63\7"+
		"\63\u05a0\n\63\f\63\16\63\u05a3\13\63\3\63\5\63\u05a6\n\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\5\63\u05ae\n\63\3\63\5\63\u05b1\n\63\5\63\u05b3\n\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u05bc\n\64\3\64\5\64\u05bf\n"+
		"\64\5\64\u05c1\n\64\3\65\3\65\5\65\u05c5\n\65\3\65\3\65\5\65\u05c9\n\65"+
		"\3\65\3\65\5\65\u05cd\n\65\3\65\5\65\u05d0\n\65\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\7\66\u05d9\n\66\f\66\16\66\u05dc\13\66\3\66\3\66\5\66\u05e0"+
		"\n\66\3\67\3\67\5\67\u05e4\n\67\3\67\3\67\5\67\u05e8\n\67\38\58\u05eb"+
		"\n8\38\38\38\58\u05f0\n8\38\38\38\38\58\u05f6\n8\38\38\38\38\38\58\u05fd"+
		"\n8\38\38\38\78\u0602\n8\f8\168\u0605\138\38\38\38\38\78\u060b\n8\f8\16"+
		"8\u060e\138\38\58\u0611\n8\58\u0613\n8\38\38\58\u0617\n8\38\58\u061a\n"+
		"8\39\39\39\39\79\u0620\n9\f9\169\u0623\139\39\39\3:\5:\u0628\n:\3:\3:"+
		"\3:\5:\u062d\n:\3:\3:\3:\3:\5:\u0633\n:\3:\3:\3:\3:\3:\5:\u063a\n:\3:"+
		"\3:\3:\7:\u063f\n:\f:\16:\u0642\13:\3:\3:\5:\u0646\n:\3:\5:\u0649\n:\3"+
		":\5:\u064c\n:\3:\5:\u064f\n:\3;\3;\3;\5;\u0654\n;\3;\3;\3;\5;\u0659\n"+
		";\3;\3;\3;\3;\3;\5;\u0660\n;\3<\3<\5<\u0664\n<\3<\3<\5<\u0668\n<\3=\3"+
		"=\3=\3=\3=\3=\3>\3>\5>\u0672\n>\3>\3>\3>\3>\3>\7>\u0679\n>\f>\16>\u067c"+
		"\13>\5>\u067e\n>\3>\3>\3>\3>\3>\7>\u0685\n>\f>\16>\u0688\13>\3>\5>\u068b"+
		"\n>\3>\3>\3?\3?\3?\3?\5?\u0693\n?\3?\3?\3?\3?\3?\7?\u069a\n?\f?\16?\u069d"+
		"\13?\5?\u069f\n?\3?\3?\3?\3?\3?\7?\u06a6\n?\f?\16?\u06a9\13?\5?\u06ab"+
		"\n?\3?\5?\u06ae\n?\3?\5?\u06b1\n?\3@\3@\3@\3@\3@\3@\3@\3@\5@\u06bb\n@"+
		"\5@\u06bd\n@\3A\3A\3A\3A\3A\3A\3A\5A\u06c6\nA\3B\3B\3B\3B\3B\7B\u06cd"+
		"\nB\fB\16B\u06d0\13B\3B\5B\u06d3\nB\3B\3B\3C\3C\3C\5C\u06da\nC\3C\3C\3"+
		"C\7C\u06df\nC\fC\16C\u06e2\13C\3C\5C\u06e5\nC\3C\3C\5C\u06e9\nC\3D\3D"+
		"\3D\3D\3D\7D\u06f0\nD\fD\16D\u06f3\13D\3D\5D\u06f6\nD\3D\3D\5D\u06fa\n"+
		"D\3D\3D\3D\5D\u06ff\nD\3E\3E\5E\u0703\nE\3E\3E\3E\7E\u0708\nE\fE\16E\u070b"+
		"\13E\3F\3F\3F\3F\3F\7F\u0712\nF\fF\16F\u0715\13F\3G\3G\3G\3G\5G\u071b"+
		"\nG\3H\3H\3H\5H\u0720\nH\3H\5H\u0723\nH\3H\3H\5H\u0727\nH\3I\3I\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0735\nJ\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K"+
		"\u0741\nK\3L\3L\3L\3L\3L\3L\3L\5L\u074a\nL\3M\3M\3M\3M\3M\3M\3M\5M\u0753"+
		"\nM\3M\3M\5M\u0757\nM\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0761\nM\3M\5M\u0764"+
		"\nM\3M\3M\3M\3M\3M\3M\3M\5M\u076d\nM\3M\3M\3M\3M\3M\3M\3M\5M\u0776\nM"+
		"\3M\5M\u0779\nM\3M\3M\3M\3M\5M\u077f\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\5M\u078d\nM\3M\3M\5M\u0791\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u079c"+
		"\nM\3M\3M\3M\5M\u07a1\nM\3N\3N\3N\3O\3O\3O\3P\3P\3P\6P\u07ac\nP\rP\16"+
		"P\u07ad\3Q\3Q\3Q\6Q\u07b3\nQ\rQ\16Q\u07b4\3R\3R\3R\3R\3S\3S\5S\u07bd\n"+
		"S\3S\3S\3S\5S\u07c2\nS\7S\u07c4\nS\fS\16S\u07c7\13S\3T\3T\3U\3U\3V\3V"+
		"\3W\3W\3X\3X\5X\u07d3\nX\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3"+
		"`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3"+
		"k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3r\3r\3r\3r\3r\5r\u080e\n"+
		"r\3r\4\u01ba\u01da\3Bs\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\2\37\5\2"+
		"<<GGTT\4\2\61\61DD\3\2\u0087\u0088\4\2\u0094\u0094\u00ad\u00ad\3\2\n\13"+
		"\4\2==\u008f\u008f\4\2::jj\4\2<<TT\7\2\33\33JJSS||\u0080\u0080\6\2VV\u0086"+
		"\u0086\u008c\u008c\u0093\u0093\4\2\t\t\16\17\3\2\20\23\3\2\24\27\6\2O"+
		"Occeexx\5\2\33\33JJ\u0080\u0080\7\2\668jj\u00ae\u00af\u00bc\u00bc\u00be"+
		"\u00bf\4\2\37\37@@\5\2NNbb\177\177\5\2\u0082\u0082\u009c\u009c\u00b5\u00b5"+
		"\4\2\7\7ll\3\2\u00b2\u00b3\4\2$$>>\4\2\u0099\u0099\u00a4\u00a4\4\2\u00a1"+
		"\u00a1\u00a8\u00a8\4\2\u00a2\u00a2\u00a9\u00aa\4\2\u00a3\u00a3\u00a5\u00a5"+
		"\4\2\n\fhh\4\2\u00bb\u00bb\u00be\u00be\4\2\33}\177\u00b6\2\u092c\2\u00e7"+
		"\3\2\2\2\4\u00ef\3\2\2\2\6\u0109\3\2\2\2\b\u0125\3\2\2\2\n\u0145\3\2\2"+
		"\2\f\u014f\3\2\2\2\16\u0157\3\2\2\2\20\u0161\3\2\2\2\22\u0165\3\2\2\2"+
		"\24\u0170\3\2\2\2\26\u0173\3\2\2\2\30\u0179\3\2\2\2\32\u019b\3\2\2\2\34"+
		"\u01a4\3\2\2\2\36\u01cd\3\2\2\2 \u01d8\3\2\2\2\"\u01ea\3\2\2\2$\u0220"+
		"\3\2\2\2&\u0226\3\2\2\2(\u024f\3\2\2\2*\u0279\3\2\2\2,\u027d\3\2\2\2."+
		"\u02bd\3\2\2\2\60\u02dd\3\2\2\2\62\u02fa\3\2\2\2\64\u030f\3\2\2\2\66\u031d"+
		"\3\2\2\28\u0328\3\2\2\2:\u033c\3\2\2\2<\u0349\3\2\2\2>\u035b\3\2\2\2@"+
		"\u0361\3\2\2\2B\u03c6\3\2\2\2D\u0448\3\2\2\2F\u0452\3\2\2\2H\u0454\3\2"+
		"\2\2J\u045f\3\2\2\2L\u0469\3\2\2\2N\u0498\3\2\2\2P\u04a1\3\2\2\2R\u04d0"+
		"\3\2\2\2T\u04e2\3\2\2\2V\u04e4\3\2\2\2X\u04f2\3\2\2\2Z\u0503\3\2\2\2\\"+
		"\u054d\3\2\2\2^\u054f\3\2\2\2`\u0552\3\2\2\2b\u055c\3\2\2\2d\u05b2\3\2"+
		"\2\2f\u05c0\3\2\2\2h\u05cf\3\2\2\2j\u05df\3\2\2\2l\u05e7\3\2\2\2n\u05ea"+
		"\3\2\2\2p\u061b\3\2\2\2r\u0627\3\2\2\2t\u0653\3\2\2\2v\u0661\3\2\2\2x"+
		"\u0669\3\2\2\2z\u066f\3\2\2\2|\u068e\3\2\2\2~\u06b2\3\2\2\2\u0080\u06be"+
		"\3\2\2\2\u0082\u06c7\3\2\2\2\u0084\u06d6\3\2\2\2\u0086\u06ea\3\2\2\2\u0088"+
		"\u0700\3\2\2\2\u008a\u070c\3\2\2\2\u008c\u0716\3\2\2\2\u008e\u071c\3\2"+
		"\2\2\u0090\u0728\3\2\2\2\u0092\u0734\3\2\2\2\u0094\u0740\3\2\2\2\u0096"+
		"\u0749\3\2\2\2\u0098\u07a0\3\2\2\2\u009a\u07a2\3\2\2\2\u009c\u07a5\3\2"+
		"\2\2\u009e\u07a8\3\2\2\2\u00a0\u07af\3\2\2\2\u00a2\u07b6\3\2\2\2\u00a4"+
		"\u07ba\3\2\2\2\u00a6\u07c8\3\2\2\2\u00a8\u07ca\3\2\2\2\u00aa\u07cc\3\2"+
		"\2\2\u00ac\u07ce\3\2\2\2\u00ae\u07d2\3\2\2\2\u00b0\u07d4\3\2\2\2\u00b2"+
		"\u07d6\3\2\2\2\u00b4\u07d8\3\2\2\2\u00b6\u07da\3\2\2\2\u00b8\u07dc\3\2"+
		"\2\2\u00ba\u07de\3\2\2\2\u00bc\u07e0\3\2\2\2\u00be\u07e2\3\2\2\2\u00c0"+
		"\u07e4\3\2\2\2\u00c2\u07e6\3\2\2\2\u00c4\u07e8\3\2\2\2\u00c6\u07ea\3\2"+
		"\2\2\u00c8\u07ec\3\2\2\2\u00ca\u07ee\3\2\2\2\u00cc\u07f0\3\2\2\2\u00ce"+
		"\u07f2\3\2\2\2\u00d0\u07f4\3\2\2\2\u00d2\u07f6\3\2\2\2\u00d4\u07f8\3\2"+
		"\2\2\u00d6\u07fa\3\2\2\2\u00d8\u07fc\3\2\2\2\u00da\u07fe\3\2\2\2\u00dc"+
		"\u0800\3\2\2\2\u00de\u0802\3\2\2\2\u00e0\u0804\3\2\2\2\u00e2\u080d\3\2"+
		"\2\2\u00e4\u00e6\5\4\3\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00eb\7\2\2\3\u00eb\3\3\2\2\2\u00ec\u00ee\7\3\2\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00fb\5\6\4\2\u00f3\u00f5\7\3"+
		"\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\5\6\4\2\u00f9\u00f4\3\2"+
		"\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u0101\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\7\3\2\2\u00ff\u00fe\3\2"+
		"\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\5\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0107\7I\2\2\u0105\u0106\7t\2\2\u0106"+
		"\u0108\7q\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2"+
		"\2\2\u0109\u0104\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0123\3\2\2\2\u010b"+
		"\u0124\5\b\5\2\u010c\u0124\5\n\6\2\u010d\u0124\5\f\7\2\u010e\u0124\5\16"+
		"\b\2\u010f\u0124\5\20\t\2\u0110\u0124\5\30\r\2\u0111\u0124\5\34\17\2\u0112"+
		"\u0124\5,\27\2\u0113\u0124\5.\30\2\u0114\u0124\5\60\31\2\u0115\u0124\5"+
		":\36\2\u0116\u0124\5<\37\2\u0117\u0124\5> \2\u0118\u0124\5@!\2\u0119\u0124"+
		"\5L\'\2\u011a\u0124\5R*\2\u011b\u0124\5V,\2\u011c\u0124\5\26\f\2\u011d"+
		"\u0124\5\22\n\2\u011e\u0124\5\24\13\2\u011f\u0124\5X-\2\u0120\u0124\5"+
		"n8\2\u0121\u0124\5r:\2\u0122\u0124\5v<\2\u0123\u010b\3\2\2\2\u0123\u010c"+
		"\3\2\2\2\u0123\u010d\3\2\2\2\u0123\u010e\3\2\2\2\u0123\u010f\3\2\2\2\u0123"+
		"\u0110\3\2\2\2\u0123\u0111\3\2\2\2\u0123\u0112\3\2\2\2\u0123\u0113\3\2"+
		"\2\2\u0123\u0114\3\2\2\2\u0123\u0115\3\2\2\2\u0123\u0116\3\2\2\2\u0123"+
		"\u0117\3\2\2\2\u0123\u0118\3\2\2\2\u0123\u0119\3\2\2\2\u0123\u011a\3\2"+
		"\2\2\u0123\u011b\3\2\2\2\u0123\u011c\3\2\2\2\u0123\u011d\3\2\2\2\u0123"+
		"\u011e\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0123\u0122\3\2\2\2\u0124\7\3\2\2\2\u0125\u0126\7 \2\2\u0126\u012a"+
		"\7\u0086\2\2\u0127\u0128\5\u00b8]\2\u0128\u0129\7\4\2\2\u0129\u012b\3"+
		"\2\2\2\u012a\u0127\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u0143\5\u00ba^\2\u012d\u0137\7{\2\2\u012e\u012f\7\u008a\2\2\u012f\u0138"+
		"\5\u00ba^\2\u0130\u0132\7\60\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2"+
		"\2\u0132\u0133\3\2\2\2\u0133\u0134\5\u00be`\2\u0134\u0135\7\u008a\2\2"+
		"\u0135\u0136\5\u00be`\2\u0136\u0138\3\2\2\2\u0137\u012e\3\2\2\2\u0137"+
		"\u0131\3\2\2\2\u0138\u0144\3\2\2\2\u0139\u013b\7\35\2\2\u013a\u013c\7"+
		"\60\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u0144\5\36\20\2\u013e\u0140\7A\2\2\u013f\u0141\7\60\2\2\u0140\u013f\3"+
		"\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\5\u00be`\2"+
		"\u0143\u012d\3\2\2\2\u0143\u0139\3\2\2\2\u0143\u013e\3\2\2\2\u0144\t\3"+
		"\2\2\2\u0145\u014d\7!\2\2\u0146\u014e\5\u00b8]\2\u0147\u0148\5\u00b8]"+
		"\2\u0148\u0149\7\4\2\2\u0149\u014b\3\2\2\2\u014a\u0147\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\5\u00bc_\2\u014d\u0146\3\2\2"+
		"\2\u014d\u014a\3\2\2\2\u014d\u014e\3\2\2\2\u014e\13\3\2\2\2\u014f\u0151"+
		"\7%\2\2\u0150\u0152\79\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\5B\"\2\u0154\u0155\7#\2\2\u0155\u0156\5\u00b8"+
		"]\2\u0156\r\3\2\2\2\u0157\u0159\7(\2\2\u0158\u015a\t\2\2\2\u0159\u0158"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015f\3\2\2\2\u015b\u015d\7\u008b\2"+
		"\2\u015c\u015e\5\u00d2j\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0160\3\2\2\2\u015f\u015b\3\2\2\2\u015f\u0160\3\2\2\2\u0160\17\3\2\2"+
		"\2\u0161\u0163\t\3\2\2\u0162\u0164\7\u008b\2\2\u0163\u0162\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\21\3\2\2\2\u0165\u0167\7\u0080\2\2\u0166\u0168\7"+
		"\u008b\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016e\3\2\2\2"+
		"\u0169\u016b\7\u008a\2\2\u016a\u016c\7\u0083\2\2\u016b\u016a\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\5\u00ceh\2\u016e\u0169"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\23\3\2\2\2\u0170\u0171\7\u0083\2\2"+
		"\u0171\u0172\5\u00ceh\2\u0172\25\3\2\2\2\u0173\u0175\7z\2\2\u0174\u0176"+
		"\7\u0083\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2"+
		"\2\u0177\u0178\5\u00ceh\2\u0178\27\3\2\2\2\u0179\u017b\7\64\2\2\u017a"+
		"\u017c\7\u008e\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u0181\7V\2\2\u017e\u017f\7R\2\2\u017f\u0180\7h\2\2\u0180"+
		"\u0182\7H\2\2\u0181\u017e\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0186\3\2"+
		"\2\2\u0183\u0184\5\u00b8]\2\u0184\u0185\7\4\2\2\u0185\u0187\3\2\2\2\u0186"+
		"\u0183\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\5\u00c4"+
		"c\2\u0189\u018a\7m\2\2\u018a\u018b\5\u00ba^\2\u018b\u018c\7\5\2\2\u018c"+
		"\u0191\5\32\16\2\u018d\u018e\7\7\2\2\u018e\u0190\5\32\16\2\u018f\u018d"+
		"\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0197\7\6\2\2\u0195\u0196\7\u0096"+
		"\2\2\u0196\u0198\5B\"\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\31\3\2\2\2\u0199\u019c\5\u00be`\2\u019a\u019c\5B\"\2\u019b\u0199\3\2"+
		"\2\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019e\7/\2\2\u019e"+
		"\u01a0\5\u00c0a\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2"+
		"\3\2\2\2\u01a1\u01a3\5\u0090I\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2"+
		"\2\u01a3\33\3\2\2\2\u01a4\u01a6\7\64\2\2\u01a5\u01a7\t\4\2\2\u01a6\u01a5"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ac\7\u0086\2"+
		"\2\u01a9\u01aa\7R\2\2\u01aa\u01ab\7h\2\2\u01ab\u01ad\7H\2\2\u01ac\u01a9"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b1\3\2\2\2\u01ae\u01af\5\u00b8]"+
		"\2\u01af\u01b0\7\4\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01cb\5\u00ba^\2\u01b4\u01b5\7\5\2"+
		"\2\u01b5\u01ba\5\36\20\2\u01b6\u01b7\7\7\2\2\u01b7\u01b9\5\36\20\2\u01b8"+
		"\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01bb\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01bb\u01c1\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\7\7\2\2\u01be"+
		"\u01c0\5&\24\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4"+
		"\u01c7\7\6\2\2\u01c5\u01c6\7\u0098\2\2\u01c6\u01c8\7\u00bb\2\2\u01c7\u01c5"+
		"\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cc\3\2\2\2\u01c9\u01ca\7#\2\2\u01ca"+
		"\u01cc\5X-\2\u01cb\u01b4\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\35\3\2\2\2"+
		"\u01cd\u01cf\5\u00be`\2\u01ce\u01d0\5 \21\2\u01cf\u01ce\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d4\3\2\2\2\u01d1\u01d3\5\"\22\2\u01d2\u01d1\3"+
		"\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\37\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d9\5\u00b4[\2\u01d8\u01d7\3\2"+
		"\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01e6\3\2\2\2\u01dc\u01dd\7\5\2\2\u01dd\u01de\5$\23\2\u01de\u01df\7\6"+
		"\2\2\u01df\u01e7\3\2\2\2\u01e0\u01e1\7\5\2\2\u01e1\u01e2\5$\23\2\u01e2"+
		"\u01e3\7\7\2\2\u01e3\u01e4\5$\23\2\u01e4\u01e5\7\6\2\2\u01e5\u01e7\3\2"+
		"\2\2\u01e6\u01dc\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"!\3\2\2\2\u01e8\u01e9\7\63\2\2\u01e9\u01eb\5\u00b4[\2\u01ea\u01e8\3\2"+
		"\2\2\u01ea\u01eb\3\2\2\2\u01eb\u021d\3\2\2\2\u01ec\u01ed\7s\2\2\u01ed"+
		"\u01ef\7a\2\2\u01ee\u01f0\5\u0090I\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3"+
		"\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01f3\5*\26\2\u01f2\u01f1\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f6\7&\2\2\u01f5\u01f4\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u021e\3\2\2\2\u01f7\u01f9\7h\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fd\7j"+
		"\2\2\u01fb\u01fd\7\u008e\2\2\u01fc\u01f8\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd"+
		"\u01ff\3\2\2\2\u01fe\u0200\5*\26\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200\u021e\3\2\2\2\u0201\u0202\7.\2\2\u0202\u0203\7\5\2\2\u0203"+
		"\u0204\5B\"\2\u0204\u0205\7\6\2\2\u0205\u021e\3\2\2\2\u0206\u020d\7:\2"+
		"\2\u0207\u020e\5$\23\2\u0208\u020e\5F$\2\u0209\u020a\7\5\2\2\u020a\u020b"+
		"\5B\"\2\u020b\u020c\7\6\2\2\u020c\u020e\3\2\2\2\u020d\u0207\3\2\2\2\u020d"+
		"\u0208\3\2\2\2\u020d\u0209\3\2\2\2\u020e\u021e\3\2\2\2\u020f\u0210\7/"+
		"\2\2\u0210\u021e\5\u00c0a\2\u0211\u021e\5(\25\2\u0212\u0213\7\u00ab\2"+
		"\2\u0213\u0215\7\u00ac\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0217\7#\2\2\u0217\u0218\7\5\2\2\u0218\u0219\5B\""+
		"\2\u0219\u021b\7\6\2\2\u021a\u021c\t\5\2\2\u021b\u021a\3\2\2\2\u021b\u021c"+
		"\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u01ec\3\2\2\2\u021d\u01fc\3\2\2\2\u021d"+
		"\u0201\3\2\2\2\u021d\u0206\3\2\2\2\u021d\u020f\3\2\2\2\u021d\u0211\3\2"+
		"\2\2\u021d\u0214\3\2\2\2\u021e#\3\2\2\2\u021f\u0221\t\6\2\2\u0220\u021f"+
		"\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\7\u00bc\2"+
		"\2\u0223%\3\2\2\2\u0224\u0225\7\63\2\2\u0225\u0227\5\u00b4[\2\u0226\u0224"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u024d\3\2\2\2\u0228\u0229\7s\2\2\u0229"+
		"\u022c\7a\2\2\u022a\u022c\7\u008e\2\2\u022b\u0228\3\2\2\2\u022b\u022a"+
		"\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\7\5\2\2\u022e\u0233\5\32\16\2"+
		"\u022f\u0230\7\7\2\2\u0230\u0232\5\32\16\2\u0231\u022f\3\2\2\2\u0232\u0235"+
		"\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0236\u0238\7\6\2\2\u0237\u0239\5*\26\2\u0238\u0237\3\2"+
		"\2\2\u0238\u0239\3\2\2\2\u0239\u024e\3\2\2\2\u023a\u023b\7.\2\2\u023b"+
		"\u023c\7\5\2\2\u023c\u023d\5B\"\2\u023d\u023e\7\6\2\2\u023e\u024e\3\2"+
		"\2\2\u023f\u0240\7L\2\2\u0240\u0241\7a\2\2\u0241\u0242\7\5\2\2\u0242\u0247"+
		"\5\u00be`\2\u0243\u0244\7\7\2\2\u0244\u0246\5\u00be`\2\u0245\u0243\3\2"+
		"\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024b\7\6\2\2\u024b\u024c\5("+
		"\25\2\u024c\u024e\3\2\2\2\u024d\u022b\3\2\2\2\u024d\u023a\3\2\2\2\u024d"+
		"\u023f\3\2\2\2\u024e\'\3\2\2\2\u024f\u0250\7w\2\2\u0250\u025c\5\u00c2"+
		"b\2\u0251\u0252\7\5\2\2\u0252\u0257\5\u00be`\2\u0253\u0254\7\7\2\2\u0254"+
		"\u0256\5\u00be`\2\u0255\u0253\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255"+
		"\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u0257\3\2\2\2\u025a"+
		"\u025b\7\6\2\2\u025b\u025d\3\2\2\2\u025c\u0251\3\2\2\2\u025c\u025d\3\2"+
		"\2\2\u025d\u026c\3\2\2\2\u025e\u025f\7m\2\2\u025f\u0266\t\7\2\2\u0260"+
		"\u0261\7\u0085\2\2\u0261\u0267\t\b\2\2\u0262\u0267\7+\2\2\u0263\u0267"+
		"\7}\2\2\u0264\u0265\7g\2\2\u0265\u0267\7\34\2\2\u0266\u0260\3\2\2\2\u0266"+
		"\u0262\3\2\2\2\u0266\u0263\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u026b\3\2"+
		"\2\2\u0268\u0269\7e\2\2\u0269\u026b\5\u00b4[\2\u026a\u025e\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026d\u0277\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0271\7h\2\2\u0270"+
		"\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0275\7;"+
		"\2\2\u0273\u0274\7X\2\2\u0274\u0276\t\t\2\2\u0275\u0273\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0270\3\2\2\2\u0277\u0278\3\2"+
		"\2\2\u0278)\3\2\2\2\u0279\u027a\7m\2\2\u027a\u027b\7\62\2\2\u027b\u027c"+
		"\t\n\2\2\u027c+\3\2\2\2\u027d\u027f\7\64\2\2\u027e\u0280\t\4\2\2\u027f"+
		"\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0285\7\u008c"+
		"\2\2\u0282\u0283\7R\2\2\u0283\u0284\7h\2\2\u0284\u0286\7H\2\2\u0285\u0282"+
		"\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u028a\3\2\2\2\u0287\u0288\5\u00b8]"+
		"\2\u0288\u0289\7\4\2\2\u0289\u028b\3\2\2\2\u028a\u0287\3\2\2\2\u028a\u028b"+
		"\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u0291\5\u00c6d\2\u028d\u0292\7\'\2"+
		"\2\u028e\u0292\7\36\2\2\u028f\u0290\7[\2\2\u0290\u0292\7k\2\2\u0291\u028d"+
		"\3\2\2\2\u0291\u028e\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u02a1\3\2\2\2\u0293\u02a2\7=\2\2\u0294\u02a2\7Z\2\2\u0295\u029f\7\u008f"+
		"\2\2\u0296\u0297\7k\2\2\u0297\u029c\5\u00be`\2\u0298\u0299\7\7\2\2\u0299"+
		"\u029b\5\u00be`\2\u029a\u0298\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a"+
		"\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029f"+
		"\u0296\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u0293\3\2"+
		"\2\2\u02a1\u0294\3\2\2\2\u02a1\u0295\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a4\7m\2\2\u02a4\u02a8\5\u00ba^\2\u02a5\u02a6\7K\2\2\u02a6\u02a7\7"+
		"B\2\2\u02a7\u02a9\7\u0081\2\2\u02a8\u02a5\3\2\2\2\u02a8\u02a9\3\2\2\2"+
		"\u02a9\u02ac\3\2\2\2\u02aa\u02ab\7\u0095\2\2\u02ab\u02ad\5B\"\2\u02ac"+
		"\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b7\7("+
		"\2\2\u02af\u02b4\5n8\2\u02b0\u02b4\5L\'\2\u02b1\u02b4\5:\36\2\u02b2\u02b4"+
		"\5X-\2\u02b3\u02af\3\2\2\2\u02b3\u02b0\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\7\3\2\2\u02b6\u02b8\3\2"+
		"\2\2\u02b7\u02b3\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\7D\2\2\u02bc-\3\2\2\2\u02bd"+
		"\u02bf\7\64\2\2\u02be\u02c0\t\4\2\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3"+
		"\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c5\7\u0093\2\2\u02c2\u02c3\7R\2\2"+
		"\u02c3\u02c4\7h\2\2\u02c4\u02c6\7H\2\2\u02c5\u02c2\3\2\2\2\u02c5\u02c6"+
		"\3\2\2\2\u02c6\u02ca\3\2\2\2\u02c7\u02c8\5\u00b8]\2\u02c8\u02c9\7\4\2"+
		"\2\u02c9\u02cb\3\2\2\2\u02ca\u02c7\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc"+
		"\3\2\2\2\u02cc\u02d8\5\u00c8e\2\u02cd\u02ce\7\5\2\2\u02ce\u02d3\5\u00be"+
		"`\2\u02cf\u02d0\7\7\2\2\u02d0\u02d2\5\u00be`\2\u02d1\u02cf\3\2\2\2\u02d2"+
		"\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\3\2"+
		"\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d7\7\6\2\2\u02d7\u02d9\3\2\2\2\u02d8"+
		"\u02cd\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\7#"+
		"\2\2\u02db\u02dc\5X-\2\u02dc/\3\2\2\2\u02dd\u02de\7\64\2\2\u02de\u02df"+
		"\7\u0094\2\2\u02df\u02e3\7\u0086\2\2\u02e0\u02e1\7R\2\2\u02e1\u02e2\7"+
		"h\2\2\u02e2\u02e4\7H\2\2\u02e3\u02e0\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e8\3\2\2\2\u02e5\u02e6\5\u00b8]\2\u02e6\u02e7\7\4\2\2\u02e7\u02e9"+
		"\3\2\2\2\u02e8\u02e5\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02eb\5\u00ba^\2\u02eb\u02ec\7\u0090\2\2\u02ec\u02f8\5\u00caf\2\u02ed"+
		"\u02ee\7\5\2\2\u02ee\u02f3\5\u00aeX\2\u02ef\u02f0\7\7\2\2\u02f0\u02f2"+
		"\5\u00aeX\2\u02f1\u02ef\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2"+
		"\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f7"+
		"\7\6\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02ed\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"\61\3\2\2\2\u02fa\u02fc\7\u0097\2\2\u02fb\u02fd\7v\2\2\u02fc\u02fb\3\2"+
		"\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\5\64\33\2\u02ff"+
		"\u0300\7#\2\2\u0300\u0301\7\5\2\2\u0301\u0302\5X-\2\u0302\u030c\7\6\2"+
		"\2\u0303\u0304\7\7\2\2\u0304\u0305\5\64\33\2\u0305\u0306\7#\2\2\u0306"+
		"\u0307\7\5\2\2\u0307\u0308\5X-\2\u0308\u0309\7\6\2\2\u0309\u030b\3\2\2"+
		"\2\u030a\u0303\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d"+
		"\3\2\2\2\u030d\63\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u031b\5\u00ba^\2\u0310"+
		"\u0311\7\5\2\2\u0311\u0316\5\u00be`\2\u0312\u0313\7\7\2\2\u0313\u0315"+
		"\5\u00be`\2\u0314\u0312\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2"+
		"\2\u0316\u0317\3\2\2\2\u0317\u0319\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031a"+
		"\7\6\2\2\u031a\u031c\3\2\2\2\u031b\u0310\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
		"\65\3\2\2\2\u031d\u031e\5\64\33\2\u031e\u031f\7#\2\2\u031f\u0320\7\5\2"+
		"\2\u0320\u0321\5\u00a6T\2\u0321\u0323\7\u008d\2\2\u0322\u0324\7\37\2\2"+
		"\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326"+
		"\5\u00a8U\2\u0326\u0327\7\6\2\2\u0327\67\3\2\2\2\u0328\u0334\5\u00ba^"+
		"\2\u0329\u032a\7\5\2\2\u032a\u032f\5\u00be`\2\u032b\u032c\7\7\2\2\u032c"+
		"\u032e\5\u00be`\2\u032d\u032b\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d"+
		"\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0332\3\2\2\2\u0331\u032f\3\2\2\2\u0332"+
		"\u0333\7\6\2\2\u0333\u0335\3\2\2\2\u0334\u0329\3\2\2\2\u0334\u0335\3\2"+
		"\2\2\u0335\u0336\3\2\2\2\u0336\u0337\7#\2\2\u0337\u0338\7\5\2\2\u0338"+
		"\u0339\5X-\2\u0339\u033a\7\6\2\2\u033a9\3\2\2\2\u033b\u033d\5\62\32\2"+
		"\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f"+
		"\7=\2\2\u033f\u0340\7M\2\2\u0340\u0343\5t;\2\u0341\u0342\7\u0096\2\2\u0342"+
		"\u0344\5B\"\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0346\3\2"+
		"\2\2\u0345\u0347\5N(\2\u0346\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347;"+
		"\3\2\2\2\u0348\u034a\5\62\32\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2"+
		"\u034a\u034b\3\2\2\2\u034b\u034c\7=\2\2\u034c\u034d\7M\2\2\u034d\u0350"+
		"\5t;\2\u034e\u034f\7\u0096\2\2\u034f\u0351\5B\"\2\u0350\u034e\3\2\2\2"+
		"\u0350\u0351\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u0354\5N(\2\u0353\u0352"+
		"\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0359\3\2\2\2\u0355\u0357\5\u008aF"+
		"\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u035a"+
		"\5\u008cG\2\u0359\u0356\3\2\2\2\u0359\u035a\3\2\2\2\u035a=\3\2\2\2\u035b"+
		"\u035d\7?\2\2\u035c\u035e\79\2\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2\2"+
		"\2\u035e\u035f\3\2\2\2\u035f\u0360\5\u00b8]\2\u0360?\3\2\2\2\u0361\u0362"+
		"\7A\2\2\u0362\u0365\t\13\2\2\u0363\u0364\7R\2\2\u0364\u0366\7H\2\2\u0365"+
		"\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u036a\3\2\2\2\u0367\u0368\5\u00b8"+
		"]\2\u0368\u0369\7\4\2\2\u0369\u036b\3\2\2\2\u036a\u0367\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\5\u00e2r\2\u036dA\3\2\2"+
		"\2\u036e\u036f\b\"\1\2\u036f\u03c7\5F$\2\u0370\u03c7\7\u00bd\2\2\u0371"+
		"\u0372\5\u00b8]\2\u0372\u0373\7\4\2\2\u0373\u0375\3\2\2\2\u0374\u0371"+
		"\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\5\u00ba^"+
		"\2\u0377\u0378\7\4\2\2\u0378\u037a\3\2\2\2\u0379\u0374\3\2\2\2\u0379\u037a"+
		"\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u03c7\5\u00be`\2\u037c\u037d\5\u00aa"+
		"V\2\u037d\u037e\5B\"\27\u037e\u03c7\3\2\2\2\u037f\u0380\5\u00b6\\\2\u0380"+
		"\u038d\7\5\2\2\u0381\u0383\7@\2\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2"+
		"\2\2\u0383\u0384\3\2\2\2\u0384\u0389\5B\"\2\u0385\u0386\7\7\2\2\u0386"+
		"\u0388\5B\"\2\u0387\u0385\3\2\2\2\u0388\u038b\3\2\2\2\u0389\u0387\3\2"+
		"\2\2\u0389\u038a\3\2\2\2\u038a\u038e\3\2\2\2\u038b\u0389\3\2\2\2\u038c"+
		"\u038e\7\t\2\2\u038d\u0382\3\2\2\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2"+
		"\2\2\u038e\u038f\3\2\2\2\u038f\u0391\7\6\2\2\u0390\u0392\5x=\2\u0391\u0390"+
		"\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0394\3\2\2\2\u0393\u0395\5|?\2\u0394"+
		"\u0393\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u03c7\3\2\2\2\u0396\u0397\7\5"+
		"\2\2\u0397\u039c\5B\"\2\u0398\u0399\7\7\2\2\u0399\u039b\5B\"\2\u039a\u0398"+
		"\3\2\2\2\u039b\u039e\3\2\2\2\u039c\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d"+
		"\u039f\3\2\2\2\u039e\u039c\3\2\2\2\u039f\u03a0\7\6\2\2\u03a0\u03c7\3\2"+
		"\2\2\u03a1\u03a2\7-\2\2\u03a2\u03a3\7\5\2\2\u03a3\u03a4\5B\"\2\u03a4\u03a5"+
		"\7#\2\2\u03a5\u03a6\5 \21\2\u03a6\u03a7\7\6\2\2\u03a7\u03c7\3\2\2\2\u03a8"+
		"\u03aa\7h\2\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\3\2"+
		"\2\2\u03ab\u03ad\7H\2\2\u03ac\u03a9\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad"+
		"\u03ae\3\2\2\2\u03ae\u03af\7\5\2\2\u03af\u03b0\5X-\2\u03b0\u03b1\7\6\2"+
		"\2\u03b1\u03c7\3\2\2\2\u03b2\u03b4\7,\2\2\u03b3\u03b5\5B\"\2\u03b4\u03b3"+
		"\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03bb\3\2\2\2\u03b6\u03b7\7\u0095\2"+
		"\2\u03b7\u03b8\5B\"\2\u03b8\u03b9\7\u0089\2\2\u03b9\u03ba\5B\"\2\u03ba"+
		"\u03bc\3\2\2\2\u03bb\u03b6\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03bb\3\2"+
		"\2\2\u03bd\u03be\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf\u03c0\7C\2\2\u03c0"+
		"\u03c2\5B\"\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2"+
		"\2\2\u03c3\u03c4\7D\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c7\5D#\2\u03c6\u036e"+
		"\3\2\2\2\u03c6\u0370\3\2\2\2\u03c6\u0379\3\2\2\2\u03c6\u037c\3\2\2\2\u03c6"+
		"\u037f\3\2\2\2\u03c6\u0396\3\2\2\2\u03c6\u03a1\3\2\2\2\u03c6\u03ac\3\2"+
		"\2\2\u03c6\u03b2\3\2\2\2\u03c6\u03c5\3\2\2\2\u03c7\u0445\3\2\2\2\u03c8"+
		"\u03c9\f\26\2\2\u03c9\u03ca\7\r\2\2\u03ca\u0444\5B\"\27\u03cb\u03cc\f"+
		"\25\2\2\u03cc\u03cd\t\f\2\2\u03cd\u0444\5B\"\26\u03ce\u03cf\f\24\2\2\u03cf"+
		"\u03d0\t\6\2\2\u03d0\u0444\5B\"\25\u03d1\u03d2\f\23\2\2\u03d2\u03d3\t"+
		"\r\2\2\u03d3\u0444\5B\"\24\u03d4\u03d5\f\22\2\2\u03d5\u03d6\t\16\2\2\u03d6"+
		"\u0444\5B\"\23\u03d7\u03ea\f\21\2\2\u03d8\u03eb\7\b\2\2\u03d9\u03eb\7"+
		"\30\2\2\u03da\u03eb\7\31\2\2\u03db\u03eb\7\32\2\2\u03dc\u03eb\7^\2\2\u03dd"+
		"\u03de\7^\2\2\u03de\u03eb\7h\2\2\u03df\u03e1\7^\2\2\u03e0\u03e2\7h\2\2"+
		"\u03e1\u03e0\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4"+
		"\7@\2\2\u03e4\u03eb\7M\2\2\u03e5\u03eb\7U\2\2\u03e6\u03eb\7c\2\2\u03e7"+
		"\u03eb\7O\2\2\u03e8\u03eb\7e\2\2\u03e9\u03eb\7x\2\2\u03ea\u03d8\3\2\2"+
		"\2\u03ea\u03d9\3\2\2\2\u03ea\u03da\3\2\2\2\u03ea\u03db\3\2\2\2\u03ea\u03dc"+
		"\3\2\2\2\u03ea\u03dd\3\2\2\2\u03ea\u03df\3\2\2\2\u03ea\u03e5\3\2\2\2\u03ea"+
		"\u03e6\3\2\2\2\u03ea\u03e7\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03e9\3\2"+
		"\2\2\u03eb\u03ec\3\2\2\2\u03ec\u0444\5B\"\22\u03ed\u03ee\f\20\2\2\u03ee"+
		"\u03ef\7\"\2\2\u03ef\u0444\5B\"\21\u03f0\u03f1\f\17\2\2\u03f1\u03f2\7"+
		"n\2\2\u03f2\u0444\5B\"\20\u03f3\u03f4\f\b\2\2\u03f4\u03f6\7^\2\2\u03f5"+
		"\u03f7\7h\2\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3\2"+
		"\2\2\u03f8\u0444\5B\"\t\u03f9\u03fb\f\7\2\2\u03fa\u03fc\7h\2\2\u03fb\u03fa"+
		"\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\7)\2\2\u03fe"+
		"\u03ff\5B\"\2\u03ff\u0400\7\"\2\2\u0400\u0401\5B\"\b\u0401\u0444\3\2\2"+
		"\2\u0402\u0403\f\13\2\2\u0403\u0404\7/\2\2\u0404\u0444\5\u00c0a\2\u0405"+
		"\u0407\f\n\2\2\u0406\u0408\7h\2\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2"+
		"\2\2\u0408\u0409\3\2\2\2\u0409\u040a\t\17\2\2\u040a\u040d\5B\"\2\u040b"+
		"\u040c\7E\2\2\u040c\u040e\5B\"\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2\2"+
		"\2\u040e\u0444\3\2\2\2\u040f\u0414\f\t\2\2\u0410\u0415\7_\2\2\u0411\u0415"+
		"\7i\2\2\u0412\u0413\7h\2\2\u0413\u0415\7j\2\2\u0414\u0410\3\2\2\2\u0414"+
		"\u0411\3\2\2\2\u0414\u0412\3\2\2\2\u0415\u0444\3\2\2\2\u0416\u0418\f\6"+
		"\2\2\u0417\u0419\7h\2\2\u0418\u0417\3\2\2\2\u0418\u0419\3\2\2\2\u0419"+
		"\u041a\3\2\2\2\u041a\u0441\7U\2\2\u041b\u0425\7\5\2\2\u041c\u0426\5X-"+
		"\2\u041d\u0422\5B\"\2\u041e\u041f\7\7\2\2\u041f\u0421\5B\"\2\u0420\u041e"+
		"\3\2\2\2\u0421\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423"+
		"\u0426\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u041c\3\2\2\2\u0425\u041d\3\2"+
		"\2\2\u0425\u0426\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0442\7\6\2\2\u0428"+
		"\u0429\5\u00b8]\2\u0429\u042a\7\4\2\2\u042a\u042c\3\2\2\2\u042b\u0428"+
		"\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u0442\5\u00ba^"+
		"\2\u042e\u042f\5\u00b8]\2\u042f\u0430\7\4\2\2\u0430\u0432\3\2\2\2\u0431"+
		"\u042e\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0434\5\u00e0"+
		"q\2\u0434\u043d\7\5\2\2\u0435\u043a\5B\"\2\u0436\u0437\7\7\2\2\u0437\u0439"+
		"\5B\"\2\u0438\u0436\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a"+
		"\u043b\3\2\2\2\u043b\u043e\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u0435\3\2"+
		"\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\7\6\2\2\u0440"+
		"\u0442\3\2\2\2\u0441\u041b\3\2\2\2\u0441\u042b\3\2\2\2\u0441\u0431\3\2"+
		"\2\2\u0442\u0444\3\2\2\2\u0443\u03c8\3\2\2\2\u0443\u03cb\3\2\2\2\u0443"+
		"\u03ce\3\2\2\2\u0443\u03d1\3\2\2\2\u0443\u03d4\3\2\2\2\u0443\u03d7\3\2"+
		"\2\2\u0443\u03ed\3\2\2\2\u0443\u03f0\3\2\2\2\u0443\u03f3\3\2\2\2\u0443"+
		"\u03f9\3\2\2\2\u0443\u0402\3\2\2\2\u0443\u0405\3\2\2\2\u0443\u040f\3\2"+
		"\2\2\u0443\u0416\3\2\2\2\u0444\u0447\3\2\2\2\u0445\u0443\3\2\2\2\u0445"+
		"\u0446\3\2\2\2\u0446C\3\2\2\2\u0447\u0445\3\2\2\2\u0448\u0449\7u\2\2\u0449"+
		"\u044e\7\5\2\2\u044a\u044f\7S\2\2\u044b\u044c\t\20\2\2\u044c\u044d\7\7"+
		"\2\2\u044d\u044f\5\u00acW\2\u044e\u044a\3\2\2\2\u044e\u044b\3\2\2\2\u044f"+
		"\u0450\3\2\2\2\u0450\u0451\7\6\2\2\u0451E\3\2\2\2\u0452\u0453\t\21\2\2"+
		"\u0453G\3\2\2\2\u0454\u0455\7\5\2\2\u0455\u045a\5B\"\2\u0456\u0457\7\7"+
		"\2\2\u0457\u0459\5B\"\2\u0458\u0456\3\2\2\2\u0459\u045c\3\2\2\2\u045a"+
		"\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045d\3\2\2\2\u045c\u045a\3\2"+
		"\2\2\u045d\u045e\7\6\2\2\u045eI\3\2\2\2\u045f\u0460\7\u0092\2\2\u0460"+
		"\u0465\5H%\2\u0461\u0462\7\7\2\2\u0462\u0464\5H%\2\u0463\u0461\3\2\2\2"+
		"\u0464\u0467\3\2\2\2\u0465\u0463\3\2\2\2\u0465\u0466\3\2\2\2\u0466K\3"+
		"\2\2\2\u0467\u0465\3\2\2\2\u0468\u046a\5\62\32\2\u0469\u0468\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\u0470\3\2\2\2\u046b\u0471\7Z\2\2\u046c\u0471\7|\2"+
		"\2\u046d\u046e\7Z\2\2\u046e\u046f\7n\2\2\u046f\u0471\t\n\2\2\u0470\u046b"+
		"\3\2\2\2\u0470\u046c\3\2\2\2\u0470\u046d\3\2\2\2\u0471\u0472\3\2\2\2\u0472"+
		"\u0476\7]\2\2\u0473\u0474\5\u00b8]\2\u0474\u0475\7\4\2\2\u0475\u0477\3"+
		"\2\2\2\u0476\u0473\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\3\2\2\2\u0478"+
		"\u047b\5\u00ba^\2\u0479\u047a\7#\2\2\u047a\u047c\5\u00d0i\2\u047b\u0479"+
		"\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u0488\3\2\2\2\u047d\u047e\7\5\2\2\u047e"+
		"\u0483\5\u00be`\2\u047f\u0480\7\7\2\2\u0480\u0482\5\u00be`\2\u0481\u047f"+
		"\3\2\2\2\u0482\u0485\3\2\2\2\u0483\u0481\3\2\2\2\u0483\u0484\3\2\2\2\u0484"+
		"\u0486\3\2\2\2\u0485\u0483\3\2\2\2\u0486\u0487\7\6\2\2\u0487\u0489\3\2"+
		"\2\2\u0488\u047d\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u0493\3\2\2\2\u048a"+
		"\u048d\5J&\2\u048b\u048d\5X-\2\u048c\u048a\3\2\2\2\u048c\u048b\3\2\2\2"+
		"\u048d\u048f\3\2\2\2\u048e\u0490\5P)\2\u048f\u048e\3\2\2\2\u048f\u0490"+
		"\3\2\2\2\u0490\u0494\3\2\2\2\u0491\u0492\7:\2\2\u0492\u0494\7\u0092\2"+
		"\2\u0493\u048c\3\2\2\2\u0493\u0491\3\2\2\2\u0494\u0496\3\2\2\2\u0495\u0497"+
		"\5N(\2\u0496\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497M\3\2\2\2\u0498\u0499"+
		"\7~\2\2\u0499\u049e\5f\64\2\u049a\u049b\7\7\2\2\u049b\u049d\5f\64\2\u049c"+
		"\u049a\3\2\2\2\u049d\u04a0\3\2\2\2\u049e\u049c\3\2\2\2\u049e\u049f\3\2"+
		"\2\2\u049fO\3\2\2\2\u04a0\u049e\3\2\2\2\u04a1\u04a2\7m\2\2\u04a2\u04b1"+
		"\7\62\2\2\u04a3\u04a4\7\5\2\2\u04a4\u04a9\5\32\16\2\u04a5\u04a6\7\7\2"+
		"\2\u04a6\u04a8\5\32\16\2\u04a7\u04a5\3\2\2\2\u04a8\u04ab\3\2\2\2\u04a9"+
		"\u04a7\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ac\3\2\2\2\u04ab\u04a9\3\2"+
		"\2\2\u04ac\u04af\7\6\2\2\u04ad\u04ae\7\u0096\2\2\u04ae\u04b0\5B\"\2\u04af"+
		"\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b2\3\2\2\2\u04b1\u04a3\3\2"+
		"\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04ce\7\u00b9\2\2\u04b4"+
		"\u04cf\7\u00ba\2\2\u04b5\u04b6\7\u008f\2\2\u04b6\u04b9\7\u0085\2\2\u04b7"+
		"\u04ba\5\u00be`\2\u04b8\u04ba\5p9\2\u04b9\u04b7\3\2\2\2\u04b9\u04b8\3"+
		"\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc\7\b\2\2\u04bc\u04c7\5B\"\2\u04bd"+
		"\u04c0\7\7\2\2\u04be\u04c1\5\u00be`\2\u04bf\u04c1\5p9\2\u04c0\u04be\3"+
		"\2\2\2\u04c0\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\7\b\2\2\u04c3"+
		"\u04c4\5B\"\2\u04c4\u04c6\3\2\2\2\u04c5\u04bd\3\2\2\2\u04c6\u04c9\3\2"+
		"\2\2\u04c7\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04cc\3\2\2\2\u04c9"+
		"\u04c7\3\2\2\2\u04ca\u04cb\7\u0096\2\2\u04cb\u04cd\5B\"\2\u04cc\u04ca"+
		"\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04b4\3\2\2\2\u04ce"+
		"\u04b5\3\2\2\2\u04cfQ\3\2\2\2\u04d0\u04d4\7r\2\2\u04d1\u04d2\5\u00b8]"+
		"\2\u04d2\u04d3\7\4\2\2\u04d3\u04d5\3\2\2\2\u04d4\u04d1\3\2\2\2\u04d4\u04d5"+
		"\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04dd\5\u00ccg\2\u04d7\u04d8\7\b\2"+
		"\2\u04d8\u04de\5T+\2\u04d9\u04da\7\5\2\2\u04da\u04db\5T+\2\u04db\u04dc"+
		"\7\6\2\2\u04dc\u04de\3\2\2\2\u04dd\u04d7\3\2\2\2\u04dd\u04d9\3\2\2\2\u04dd"+
		"\u04de\3\2\2\2\u04deS\3\2\2\2\u04df\u04e3\5$\23\2\u04e0\u04e3\5\u00b4"+
		"[\2\u04e1\u04e3\7\u00be\2\2\u04e2\u04df\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2"+
		"\u04e1\3\2\2\2\u04e3U\3\2\2\2\u04e4\u04ef\7y\2\2\u04e5\u04f0\5\u00c0a"+
		"\2\u04e6\u04e7\5\u00b8]\2\u04e7\u04e8\7\4\2\2\u04e8\u04ea\3\2\2\2\u04e9"+
		"\u04e6\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04ed\3\2\2\2\u04eb\u04ee\5\u00ba"+
		"^\2\u04ec\u04ee\5\u00c4c\2\u04ed\u04eb\3\2\2\2\u04ed\u04ec\3\2\2\2\u04ee"+
		"\u04f0\3\2\2\2\u04ef\u04e5\3\2\2\2\u04ef\u04e9\3\2\2\2\u04ef\u04f0\3\2"+
		"\2\2\u04f0W\3\2\2\2\u04f1\u04f3\5\u0088E\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3"+
		"\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04fa\5\\/\2\u04f5\u04f6\5l\67\2\u04f6"+
		"\u04f7\5\\/\2\u04f7\u04f9\3\2\2\2\u04f8\u04f5\3\2\2\2\u04f9\u04fc\3\2"+
		"\2\2\u04fa\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fe\3\2\2\2\u04fc"+
		"\u04fa\3\2\2\2\u04fd\u04ff\5\u008aF\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff"+
		"\3\2\2\2\u04ff\u0501\3\2\2\2\u0500\u0502\5\u008cG\2\u0501\u0500\3\2\2"+
		"\2\u0501\u0502\3\2\2\2\u0502Y\3\2\2\2\u0503\u050b\5d\63\2\u0504\u0505"+
		"\5h\65\2\u0505\u0507\5d\63\2\u0506\u0508\5j\66\2\u0507\u0506\3\2\2\2\u0507"+
		"\u0508\3\2\2\2\u0508\u050a\3\2\2\2\u0509\u0504\3\2\2\2\u050a\u050d\3\2"+
		"\2\2\u050b\u0509\3\2\2\2\u050b\u050c\3\2\2\2\u050c[\3\2\2\2\u050d\u050b"+
		"\3\2\2\2\u050e\u0510\7\u0084\2\2\u050f\u0511\t\22\2\2\u0510\u050f\3\2"+
		"\2\2\u0510\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0517\5f\64\2\u0513"+
		"\u0514\7\7\2\2\u0514\u0516\5f\64\2\u0515\u0513\3\2\2\2\u0516\u0519\3\2"+
		"\2\2\u0517\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0526\3\2\2\2\u0519"+
		"\u0517\3\2\2\2\u051a\u0524\7M\2\2\u051b\u0520\5d\63\2\u051c\u051d\7\7"+
		"\2\2\u051d\u051f\5d\63\2\u051e\u051c\3\2\2\2\u051f\u0522\3\2\2\2\u0520"+
		"\u051e\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0525\3\2\2\2\u0522\u0520\3\2"+
		"\2\2\u0523\u0525\5Z.\2\u0524\u051b\3\2\2\2\u0524\u0523\3\2\2\2\u0525\u0527"+
		"\3\2\2\2\u0526\u051a\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u052a\3\2\2\2\u0528"+
		"\u0529\7\u0096\2\2\u0529\u052b\5B\"\2\u052a\u0528\3\2\2\2\u052a\u052b"+
		"\3\2\2\2\u052b\u053a\3\2\2\2\u052c\u052d\7P\2\2\u052d\u052e\7*\2\2\u052e"+
		"\u0533\5B\"\2\u052f\u0530\7\7\2\2\u0530\u0532\5B\"\2\u0531\u052f\3\2\2"+
		"\2\u0532\u0535\3\2\2\2\u0533\u0531\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0538"+
		"\3\2\2\2\u0535\u0533\3\2\2\2\u0536\u0537\7Q\2\2\u0537\u0539\5B\"\2\u0538"+
		"\u0536\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053b\3\2\2\2\u053a\u052c\3\2"+
		"\2\2\u053a\u053b\3\2\2\2\u053b\u054a\3\2\2\2\u053c\u053d\7\u00b0\2\2\u053d"+
		"\u053e\5\u00d4k\2\u053e\u053f\7#\2\2\u053f\u0547\5z>\2\u0540\u0541\7\7"+
		"\2\2\u0541\u0542\5\u00d4k\2\u0542\u0543\7#\2\2\u0543\u0544\5z>\2\u0544"+
		"\u0546\3\2\2\2\u0545\u0540\3\2\2\2\u0546\u0549\3\2\2\2\u0547\u0545\3\2"+
		"\2\2\u0547\u0548\3\2\2\2\u0548\u054b\3\2\2\2\u0549\u0547\3\2\2\2\u054a"+
		"\u053c\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054e\3\2\2\2\u054c\u054e\5J"+
		"&\2\u054d\u050e\3\2\2\2\u054d\u054c\3\2\2\2\u054e]\3\2\2\2\u054f\u0550"+
		"\5X-\2\u0550_\3\2\2\2\u0551\u0553\5\u0088E\2\u0552\u0551\3\2\2\2\u0552"+
		"\u0553\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0556\5\\/\2\u0555\u0557\5\u008a"+
		"F\2\u0556\u0555\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0559\3\2\2\2\u0558"+
		"\u055a\5\u008cG\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2\2\2\u055aa\3\2\2"+
		"\2\u055b\u055d\5\u0088E\2\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2\2\u055d"+
		"\u055e\3\2\2\2\u055e\u0568\5\\/\2\u055f\u0561\7\u008d\2\2\u0560\u0562"+
		"\7\37\2\2\u0561\u0560\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0566\3\2\2\2"+
		"\u0563\u0566\7\\\2\2\u0564\u0566\7F\2\2\u0565\u055f\3\2\2\2\u0565\u0563"+
		"\3\2\2\2\u0565\u0564\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0569\5\\/\2\u0568"+
		"\u0565\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u0568\3\2\2\2\u056a\u056b\3\2"+
		"\2\2\u056b\u056d\3\2\2\2\u056c\u056e\5\u008aF\2\u056d\u056c\3\2\2\2\u056d"+
		"\u056e\3\2\2\2\u056e\u0570\3\2\2\2\u056f\u0571\5\u008cG\2\u0570\u056f"+
		"\3\2\2\2\u0570\u0571\3\2\2\2\u0571c\3\2\2\2\u0572\u0573\5\u00b8]\2\u0573"+
		"\u0574\7\4\2\2\u0574\u0576\3\2\2\2\u0575\u0572\3\2\2\2\u0575\u0576\3\2"+
		"\2\2\u0576\u0577\3\2\2\2\u0577\u057c\5\u00ba^\2\u0578\u057a\7#\2\2\u0579"+
		"\u0578\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057d\5\u00d0"+
		"i\2\u057c\u0579\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u0583\3\2\2\2\u057e"+
		"\u057f\7W\2\2\u057f\u0580\7*\2\2\u0580\u0584\5\u00c4c\2\u0581\u0582\7"+
		"h\2\2\u0582\u0584\7W\2\2\u0583\u057e\3\2\2\2\u0583\u0581\3\2\2\2\u0583"+
		"\u0584\3\2\2\2\u0584\u05b3\3\2\2\2\u0585\u0586\5\u00b8]\2\u0586\u0587"+
		"\7\4\2\2\u0587\u0589\3\2\2\2\u0588\u0585\3\2\2\2\u0588\u0589\3\2\2\2\u0589"+
		"\u058a\3\2\2\2\u058a\u058b\5\u00e0q\2\u058b\u058c\7\5\2\2\u058c\u0591"+
		"\5B\"\2\u058d\u058e\7\7\2\2\u058e\u0590\5B\"\2\u058f\u058d\3\2\2\2\u0590"+
		"\u0593\3\2\2\2\u0591\u058f\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0594\3\2"+
		"\2\2\u0593\u0591\3\2\2\2\u0594\u0599\7\6\2\2\u0595\u0597\7#\2\2\u0596"+
		"\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u059a\5\u00d0"+
		"i\2\u0599\u0596\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u05b3\3\2\2\2\u059b"+
		"\u05a5\7\5\2\2\u059c\u05a1\5d\63\2\u059d\u059e\7\7\2\2\u059e\u05a0\5d"+
		"\63\2\u059f\u059d\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1\u059f\3\2\2\2\u05a1"+
		"\u05a2\3\2\2\2\u05a2\u05a6\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a4\u05a6\5Z"+
		".\2\u05a5\u059c\3\2\2\2\u05a5\u05a4\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7"+
		"\u05a8\7\6\2\2\u05a8\u05b3\3\2\2\2\u05a9\u05aa\7\5\2\2\u05aa\u05ab\5X"+
		"-\2\u05ab\u05b0\7\6\2\2\u05ac\u05ae\7#\2\2\u05ad\u05ac\3\2\2\2\u05ad\u05ae"+
		"\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b1\5\u00d0i\2\u05b0\u05ad\3\2\2"+
		"\2\u05b0\u05b1\3\2\2\2\u05b1\u05b3\3\2\2\2\u05b2\u0575\3\2\2\2\u05b2\u0588"+
		"\3\2\2\2\u05b2\u059b\3\2\2\2\u05b2\u05a9\3\2\2\2\u05b3e\3\2\2\2\u05b4"+
		"\u05c1\7\t\2\2\u05b5\u05b6\5\u00ba^\2\u05b6\u05b7\7\4\2\2\u05b7\u05b8"+
		"\7\t\2\2\u05b8\u05c1\3\2\2\2\u05b9\u05be\5B\"\2\u05ba\u05bc\7#\2\2\u05bb"+
		"\u05ba\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\5\u00b0"+
		"Y\2\u05be\u05bb\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c1\3\2\2\2\u05c0"+
		"\u05b4\3\2\2\2\u05c0\u05b5\3\2\2\2\u05c0\u05b9\3\2\2\2\u05c1g\3\2\2\2"+
		"\u05c2\u05d0\7\7\2\2\u05c3\u05c5\7f\2\2\u05c4\u05c3\3\2\2\2\u05c4\u05c5"+
		"\3\2\2\2\u05c5\u05cc\3\2\2\2\u05c6\u05c8\t\23\2\2\u05c7\u05c9\7p\2\2\u05c8"+
		"\u05c7\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cd\3\2\2\2\u05ca\u05cd\7Y"+
		"\2\2\u05cb\u05cd\7\65\2\2\u05cc\u05c6\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cc"+
		"\u05cb\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d0\7`"+
		"\2\2\u05cf\u05c2\3\2\2\2\u05cf\u05c4\3\2\2\2\u05d0i\3\2\2\2\u05d1\u05d2"+
		"\7m\2\2\u05d2\u05e0\5B\"\2\u05d3\u05d4\7\u0090\2\2\u05d4\u05d5\7\5\2\2"+
		"\u05d5\u05da\5\u00be`\2\u05d6\u05d7\7\7\2\2\u05d7\u05d9\5\u00be`\2\u05d8"+
		"\u05d6\3\2\2\2\u05d9\u05dc\3\2\2\2\u05da\u05d8\3\2\2\2\u05da\u05db\3\2"+
		"\2\2\u05db\u05dd\3\2\2\2\u05dc\u05da\3\2\2\2\u05dd\u05de\7\6\2\2\u05de"+
		"\u05e0\3\2\2\2\u05df\u05d1\3\2\2\2\u05df\u05d3\3\2\2\2\u05e0k\3\2\2\2"+
		"\u05e1\u05e3\7\u008d\2\2\u05e2\u05e4\7\37\2\2\u05e3\u05e2\3\2\2\2\u05e3"+
		"\u05e4\3\2\2\2\u05e4\u05e8\3\2\2\2\u05e5\u05e8\7\\\2\2\u05e6\u05e8\7F"+
		"\2\2\u05e7\u05e1\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7\u05e6\3\2\2\2\u05e8"+
		"m\3\2\2\2\u05e9\u05eb\5\62\32\2\u05ea\u05e9\3\2\2\2\u05ea\u05eb\3\2\2"+
		"\2\u05eb\u05ec\3\2\2\2\u05ec\u05ef\7\u008f\2\2\u05ed\u05ee\7n\2\2\u05ee"+
		"\u05f0\t\n\2\2\u05ef\u05ed\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f1\3\2"+
		"\2\2\u05f1\u05f2\5t;\2\u05f2\u05f5\7\u0085\2\2\u05f3\u05f6\5\u00be`\2"+
		"\u05f4\u05f6\5p9\2\u05f5\u05f3\3\2\2\2\u05f5\u05f4\3\2\2\2\u05f6\u05f7"+
		"\3\2\2\2\u05f7\u05f8\7\b\2\2\u05f8\u0603\5B\"\2\u05f9\u05fc\7\7\2\2\u05fa"+
		"\u05fd\5\u00be`\2\u05fb\u05fd\5p9\2\u05fc\u05fa\3\2\2\2\u05fc\u05fb\3"+
		"\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u05ff\7\b\2\2\u05ff\u0600\5B\"\2\u0600"+
		"\u0602\3\2\2\2\u0601\u05f9\3\2\2\2\u0602\u0605\3\2\2\2\u0603\u0601\3\2"+
		"\2\2\u0603\u0604\3\2\2\2\u0604\u0612\3\2\2\2\u0605\u0603\3\2\2\2\u0606"+
		"\u0610\7M\2\2\u0607\u060c\5d\63\2\u0608\u0609\7\7\2\2\u0609\u060b\5d\63"+
		"\2\u060a\u0608\3\2\2\2\u060b\u060e\3\2\2\2\u060c\u060a\3\2\2\2\u060c\u060d"+
		"\3\2\2\2\u060d\u0611\3\2\2\2\u060e\u060c\3\2\2\2\u060f\u0611\5Z.\2\u0610"+
		"\u0607\3\2\2\2\u0610\u060f\3\2\2\2\u0611\u0613\3\2\2\2\u0612\u0606\3\2"+
		"\2\2\u0612\u0613\3\2\2\2\u0613\u0616\3\2\2\2\u0614\u0615\7\u0096\2\2\u0615"+
		"\u0617\5B\"\2\u0616\u0614\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u0619\3\2"+
		"\2\2\u0618\u061a\5N(\2\u0619\u0618\3\2\2\2\u0619\u061a\3\2\2\2\u061ao"+
		"\3\2\2\2\u061b\u061c\7\5\2\2\u061c\u0621\5\u00be`\2\u061d\u061e\7\7\2"+
		"\2\u061e\u0620\5\u00be`\2\u061f\u061d\3\2\2\2\u0620\u0623\3\2\2\2\u0621"+
		"\u061f\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0624\3\2\2\2\u0623\u0621\3\2"+
		"\2\2\u0624\u0625\7\6\2\2\u0625q\3\2\2\2\u0626\u0628\5\62\32\2\u0627\u0626"+
		"\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062c\7\u008f\2"+
		"\2\u062a\u062b\7n\2\2\u062b\u062d\t\n\2\2\u062c\u062a\3\2\2\2\u062c\u062d"+
		"\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f\5t;\2\u062f\u0632\7\u0085\2\2"+
		"\u0630\u0633\5\u00be`\2\u0631\u0633\5p9\2\u0632\u0630\3\2\2\2\u0632\u0631"+
		"\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0635\7\b\2\2\u0635\u0640\5B\"\2\u0636"+
		"\u0639\7\7\2\2\u0637\u063a\5\u00be`\2\u0638\u063a\5p9\2\u0639\u0637\3"+
		"\2\2\2\u0639\u0638\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063c\7\b\2\2\u063c"+
		"\u063d\5B\"\2\u063d\u063f\3\2\2\2\u063e\u0636\3\2\2\2\u063f\u0642\3\2"+
		"\2\2\u0640\u063e\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0645\3\2\2\2\u0642"+
		"\u0640\3\2\2\2\u0643\u0644\7\u0096\2\2\u0644\u0646\5B\"\2\u0645\u0643"+
		"\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0648\3\2\2\2\u0647\u0649\5N(\2\u0648"+
		"\u0647\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064e\3\2\2\2\u064a\u064c\5\u008a"+
		"F\2\u064b\u064a\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064d\3\2\2\2\u064d"+
		"\u064f\5\u008cG\2\u064e\u064b\3\2\2\2\u064e\u064f\3\2\2\2\u064fs\3\2\2"+
		"\2\u0650\u0651\5\u00b8]\2\u0651\u0652\7\4\2\2\u0652\u0654\3\2\2\2\u0653"+
		"\u0650\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0658\5\u00ba"+
		"^\2\u0656\u0657\7#\2\2\u0657\u0659\5\u00d6l\2\u0658\u0656\3\2\2\2\u0658"+
		"\u0659\3\2\2\2\u0659\u065f\3\2\2\2\u065a\u065b\7W\2\2\u065b\u065c\7*\2"+
		"\2\u065c\u0660\5\u00c4c\2\u065d\u065e\7h\2\2\u065e\u0660\7W\2\2\u065f"+
		"\u065a\3\2\2\2\u065f\u065d\3\2\2\2\u065f\u0660\3\2\2\2\u0660u\3\2\2\2"+
		"\u0661\u0663\7\u0091\2\2\u0662\u0664\5\u00b8]\2\u0663\u0662\3\2\2\2\u0663"+
		"\u0664\3\2\2\2\u0664\u0667\3\2\2\2\u0665\u0666\7]\2\2\u0666\u0668\5\u00d8"+
		"m\2\u0667\u0665\3\2\2\2\u0667\u0668\3\2\2\2\u0668w\3\2\2\2\u0669\u066a"+
		"\7\u00b4\2\2\u066a\u066b\7\5\2\2\u066b\u066c\7\u0096\2\2\u066c\u066d\5"+
		"B\"\2\u066d\u066e\7\6\2\2\u066ey\3\2\2\2\u066f\u0671\7\5\2\2\u0670\u0672"+
		"\5\u00dan\2\u0671\u0670\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u067d\3\2\2"+
		"\2\u0673\u0674\7\u009b\2\2\u0674\u0675\7*\2\2\u0675\u067a\5B\"\2\u0676"+
		"\u0677\7\7\2\2\u0677\u0679\5B\"\2\u0678\u0676\3\2\2\2\u0679\u067c\3\2"+
		"\2\2\u067a\u0678\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067e\3\2\2\2\u067c"+
		"\u067a\3\2\2\2\u067d\u0673\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u067f\3\2"+
		"\2\2\u067f\u0680\7o\2\2\u0680\u0681\7*\2\2\u0681\u0686\5\u008eH\2\u0682"+
		"\u0683\7\7\2\2\u0683\u0685\5\u008eH\2\u0684\u0682\3\2\2\2\u0685\u0688"+
		"\3\2\2\2\u0686\u0684\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u068a\3\2\2\2\u0688"+
		"\u0686\3\2\2\2\u0689\u068b\5~@\2\u068a\u0689\3\2\2\2\u068a\u068b\3\2\2"+
		"\2\u068b\u068c\3\2\2\2\u068c\u068d\7\6\2\2\u068d{\3\2\2\2\u068e\u06b0"+
		"\7\u009a\2\2\u068f\u06b1\5\u00d4k\2\u0690\u0692\7\5\2\2\u0691\u0693\5"+
		"\u00dan\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u069e\3\2\2\2"+
		"\u0694\u0695\7\u009b\2\2\u0695\u0696\7*\2\2\u0696\u069b\5B\"\2\u0697\u0698"+
		"\7\7\2\2\u0698\u069a\5B\"\2\u0699\u0697\3\2\2\2\u069a\u069d\3\2\2\2\u069b"+
		"\u0699\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069f\3\2\2\2\u069d\u069b\3\2"+
		"\2\2\u069e\u0694\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06aa\3\2\2\2\u06a0"+
		"\u06a1\7o\2\2\u06a1\u06a2\7*\2\2\u06a2\u06a7\5\u008eH\2\u06a3\u06a4\7"+
		"\7\2\2\u06a4\u06a6\5\u008eH\2\u06a5\u06a3\3\2\2\2\u06a6\u06a9\3\2\2\2"+
		"\u06a7\u06a5\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06ab\3\2\2\2\u06a9\u06a7"+
		"\3\2\2\2\u06aa\u06a0\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ad\3\2\2\2\u06ac"+
		"\u06ae\5~@\2\u06ad\u06ac\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06af\3\2\2"+
		"\2\u06af\u06b1\7\6\2\2\u06b0\u068f\3\2\2\2\u06b0\u0690\3\2\2\2\u06b1}"+
		"\3\2\2\2\u06b2\u06bc\5\u0080A\2\u06b3\u06ba\7\u00b6\2\2\u06b4\u06b5\7"+
		"g\2\2\u06b5\u06bb\7\u00b8\2\2\u06b6\u06b7\7\u009f\2\2\u06b7\u06bb\7\u0081"+
		"\2\2\u06b8\u06bb\7P\2\2\u06b9\u06bb\7\u00b7\2\2\u06ba\u06b4\3\2\2\2\u06ba"+
		"\u06b6\3\2\2\2\u06ba\u06b8\3\2\2\2\u06ba\u06b9\3\2\2\2\u06bb\u06bd\3\2"+
		"\2\2\u06bc\u06b3\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\177\3\2\2\2\u06be\u06c5"+
		"\t\24\2\2\u06bf\u06c6\5\u0096L\2\u06c0\u06c1\7)\2\2\u06c1\u06c2\5\u0092"+
		"J\2\u06c2\u06c3\7\"\2\2\u06c3\u06c4\5\u0094K\2\u06c4\u06c6\3\2\2\2\u06c5"+
		"\u06bf\3\2\2\2\u06c5\u06c0\3\2\2\2\u06c6\u0081\3\2\2\2\u06c7\u06c8\5\u00dc"+
		"o\2\u06c8\u06d2\7\5\2\2\u06c9\u06ce\5B\"\2\u06ca\u06cb\7\7\2\2\u06cb\u06cd"+
		"\5B\"\2\u06cc\u06ca\3\2\2\2\u06cd\u06d0\3\2\2\2\u06ce\u06cc\3\2\2\2\u06ce"+
		"\u06cf\3\2\2\2\u06cf\u06d3\3\2\2\2\u06d0\u06ce\3\2\2\2\u06d1\u06d3\7\t"+
		"\2\2\u06d2\u06c9\3\2\2\2\u06d2\u06d1\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4"+
		"\u06d5\7\6\2\2\u06d5\u0083\3\2\2\2\u06d6\u06d7\5\u00dep\2\u06d7\u06e4"+
		"\7\5\2\2\u06d8\u06da\7@\2\2\u06d9\u06d8\3\2\2\2\u06d9\u06da\3\2\2\2\u06da"+
		"\u06db\3\2\2\2\u06db\u06e0\5B\"\2\u06dc\u06dd\7\7\2\2\u06dd\u06df\5B\""+
		"\2\u06de\u06dc\3\2\2\2\u06df\u06e2\3\2\2\2\u06e0\u06de\3\2\2\2\u06e0\u06e1"+
		"\3\2\2\2\u06e1\u06e5\3\2\2\2\u06e2\u06e0\3\2\2\2\u06e3\u06e5\7\t\2\2\u06e4"+
		"\u06d9\3\2\2\2\u06e4\u06e3\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e6\3\2"+
		"\2\2\u06e6\u06e8\7\6\2\2\u06e7\u06e9\5x=\2\u06e8\u06e7\3\2\2\2\u06e8\u06e9"+
		"\3\2\2\2\u06e9\u0085\3\2\2\2\u06ea\u06eb\5\u0098M\2\u06eb\u06f5\7\5\2"+
		"\2\u06ec\u06f1\5B\"\2\u06ed\u06ee\7\7\2\2\u06ee\u06f0\5B\"\2\u06ef\u06ed"+
		"\3\2\2\2\u06f0\u06f3\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2"+
		"\u06f6\3\2\2\2\u06f3\u06f1\3\2\2\2\u06f4\u06f6\7\t\2\2\u06f5\u06ec\3\2"+
		"\2\2\u06f5\u06f4\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7"+
		"\u06f9\7\6\2\2\u06f8\u06fa\5x=\2\u06f9\u06f8\3\2\2\2\u06f9\u06fa\3\2\2"+
		"\2\u06fa\u06fb\3\2\2\2\u06fb\u06fe\7\u009a\2\2\u06fc\u06ff\5z>\2\u06fd"+
		"\u06ff\5\u00d4k\2\u06fe\u06fc\3\2\2\2\u06fe\u06fd\3\2\2\2\u06ff\u0087"+
		"\3\2\2\2\u0700\u0702\7\u0097\2\2\u0701\u0703\7v\2\2\u0702\u0701\3\2\2"+
		"\2\u0702\u0703\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0709\58\35\2\u0705\u0706"+
		"\7\7\2\2\u0706\u0708\58\35\2\u0707\u0705\3\2\2\2\u0708\u070b\3\2\2\2\u0709"+
		"\u0707\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u0089\3\2\2\2\u070b\u0709\3\2"+
		"\2\2\u070c\u070d\7o\2\2\u070d\u070e\7*\2\2\u070e\u0713\5\u008eH\2\u070f"+
		"\u0710\7\7\2\2\u0710\u0712\5\u008eH\2\u0711\u070f\3\2\2\2\u0712\u0715"+
		"\3\2\2\2\u0713\u0711\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u008b\3\2\2\2\u0715"+
		"\u0713\3\2\2\2\u0716\u0717\7d\2\2\u0717\u071a\5B\"\2\u0718\u0719\t\25"+
		"\2\2\u0719\u071b\5B\"\2\u071a\u0718\3\2\2\2\u071a\u071b\3\2\2\2\u071b"+
		"\u008d\3\2\2\2\u071c\u071f\5B\"\2\u071d\u071e\7/\2\2\u071e\u0720\5\u00c0"+
		"a\2\u071f\u071d\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0722\3\2\2\2\u0721"+
		"\u0723\5\u0090I\2\u0722\u0721\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0726"+
		"\3\2\2\2\u0724\u0725\7\u00b1\2\2\u0725\u0727\t\26\2\2\u0726\u0724\3\2"+
		"\2\2\u0726\u0727\3\2\2\2\u0727\u008f\3\2\2\2\u0728\u0729\t\27\2\2\u0729"+
		"\u0091\3\2\2\2\u072a\u072b\5B\"\2\u072b\u072c\7\u009d\2\2\u072c\u0735"+
		"\3\2\2\2\u072d\u072e\5B\"\2\u072e\u072f\7\u00a0\2\2\u072f\u0735\3\2\2"+
		"\2\u0730\u0731\7\u009f\2\2\u0731\u0735\7\u0081\2\2\u0732\u0733\7\u009e"+
		"\2\2\u0733\u0735\7\u009d\2\2\u0734\u072a\3\2\2\2\u0734\u072d\3\2\2\2\u0734"+
		"\u0730\3\2\2\2\u0734\u0732\3\2\2\2\u0735\u0093\3\2\2\2\u0736\u0737\5B"+
		"\"\2\u0737\u0738\7\u009d\2\2\u0738\u0741\3\2\2\2\u0739\u073a\5B\"\2\u073a"+
		"\u073b\7\u00a0\2\2\u073b\u0741\3\2\2\2\u073c\u073d\7\u009f\2\2\u073d\u0741"+
		"\7\u0081\2\2\u073e\u073f\7\u009e\2\2\u073f\u0741\7\u00a0\2\2\u0740\u0736"+
		"\3\2\2\2\u0740\u0739\3\2\2\2\u0740\u073c\3\2\2\2\u0740\u073e\3\2\2\2\u0741"+
		"\u0095\3\2\2\2\u0742\u0743\5B\"\2\u0743\u0744\7\u009d\2\2\u0744\u074a"+
		"\3\2\2\2\u0745\u0746\7\u009e\2\2\u0746\u074a\7\u009d\2\2\u0747\u0748\7"+
		"\u009f\2\2\u0748\u074a\7\u0081\2\2\u0749\u0742\3\2\2\2\u0749\u0745\3\2"+
		"\2\2\u0749\u0747\3\2\2\2\u074a\u0097\3\2\2\2\u074b\u074c\t\30\2\2\u074c"+
		"\u074d\7\5\2\2\u074d\u074e\5B\"\2\u074e\u074f\7\6\2\2\u074f\u0750\7\u009a"+
		"\2\2\u0750\u0752\7\5\2\2\u0751\u0753\5\u009eP\2\u0752\u0751\3\2\2\2\u0752"+
		"\u0753\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0756\5\u00a2R\2\u0755\u0757"+
		"\5\u0080A\2\u0756\u0755\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u0758\3\2\2"+
		"\2\u0758\u0759\7\6\2\2\u0759\u07a1\3\2\2\2\u075a\u075b\t\31\2\2\u075b"+
		"\u075c\7\5\2\2\u075c\u075d\7\6\2\2\u075d\u075e\7\u009a\2\2\u075e\u0760"+
		"\7\5\2\2\u075f\u0761\5\u009eP\2\u0760\u075f\3\2\2\2\u0760\u0761\3\2\2"+
		"\2\u0761\u0763\3\2\2\2\u0762\u0764\5\u00a0Q\2\u0763\u0762\3\2\2\2\u0763"+
		"\u0764\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u07a1\7\6\2\2\u0766\u0767\t\32"+
		"\2\2\u0767\u0768\7\5\2\2\u0768\u0769\7\6\2\2\u0769\u076a\7\u009a\2\2\u076a"+
		"\u076c\7\5\2\2\u076b\u076d\5\u009eP\2\u076c\u076b\3\2\2\2\u076c\u076d"+
		"\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u076f\5\u00a2R\2\u076f\u0770\7\6\2"+
		"\2\u0770\u07a1\3\2\2\2\u0771\u0772\t\33\2\2\u0772\u0773\7\5\2\2\u0773"+
		"\u0775\5B\"\2\u0774\u0776\5\u009aN\2\u0775\u0774\3\2\2\2\u0775\u0776\3"+
		"\2\2\2\u0776\u0778\3\2\2\2\u0777\u0779\5\u009cO\2\u0778\u0777\3\2\2\2"+
		"\u0778\u0779\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077b\7\6\2\2\u077b\u077c"+
		"\7\u009a\2\2\u077c\u077e\7\5\2\2\u077d\u077f\5\u009eP\2\u077e\u077d\3"+
		"\2\2\2\u077e\u077f\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0781\5\u00a2R\2"+
		"\u0781\u0782\7\6\2\2\u0782\u07a1\3\2\2\2\u0783\u0784\7\u00a6\2\2\u0784"+
		"\u0785\7\5\2\2\u0785\u0786\5B\"\2\u0786\u0787\7\7\2\2\u0787\u0788\5$\23"+
		"\2\u0788\u0789\7\6\2\2\u0789\u078a\7\u009a\2\2\u078a\u078c\7\5\2\2\u078b"+
		"\u078d\5\u009eP\2\u078c\u078b\3\2\2\2\u078c\u078d\3\2\2\2\u078d\u078e"+
		"\3\2\2\2\u078e\u0790\5\u00a2R\2\u078f\u0791\5\u0080A\2\u0790\u078f\3\2"+
		"\2\2\u0790\u0791\3\2\2\2\u0791\u0792\3\2\2\2\u0792\u0793\7\6\2\2\u0793"+
		"\u07a1\3\2\2\2\u0794\u0795\7\u00a7\2\2\u0795\u0796\7\5\2\2\u0796\u0797"+
		"\5B\"\2\u0797\u0798\7\6\2\2\u0798\u0799\7\u009a\2\2\u0799\u079b\7\5\2"+
		"\2\u079a\u079c\5\u009eP\2\u079b\u079a\3\2\2\2\u079b\u079c\3\2\2\2\u079c"+
		"\u079d\3\2\2\2\u079d\u079e\5\u00a2R\2\u079e\u079f\7\6\2\2\u079f\u07a1"+
		"\3\2\2\2\u07a0\u074b\3\2\2\2\u07a0\u075a\3\2\2\2\u07a0\u0766\3\2\2\2\u07a0"+
		"\u0771\3\2\2\2\u07a0\u0783\3\2\2\2\u07a0\u0794\3\2\2\2\u07a1\u0099\3\2"+
		"\2\2\u07a2\u07a3\7\7\2\2\u07a3\u07a4\5$\23\2\u07a4\u009b\3\2\2\2\u07a5"+
		"\u07a6\7\7\2\2\u07a6\u07a7\5$\23\2\u07a7\u009d\3\2\2\2\u07a8\u07a9\7\u009b"+
		"\2\2\u07a9\u07ab\7*\2\2\u07aa\u07ac\5B\"\2\u07ab\u07aa\3\2\2\2\u07ac\u07ad"+
		"\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u009f\3\2\2\2\u07af"+
		"\u07b0\7o\2\2\u07b0\u07b2\7*\2\2\u07b1\u07b3\5B\"\2\u07b2\u07b1\3\2\2"+
		"\2\u07b3\u07b4\3\2\2\2\u07b4\u07b2\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u00a1"+
		"\3\2\2\2\u07b6\u07b7\7o\2\2\u07b7\u07b8\7*\2\2\u07b8\u07b9\5\u00a4S\2"+
		"\u07b9\u00a3\3\2\2\2\u07ba\u07bc\5B\"\2\u07bb\u07bd\5\u0090I\2\u07bc\u07bb"+
		"\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u07c5\3\2\2\2\u07be\u07bf\7\7\2\2\u07bf"+
		"\u07c1\5B\"\2\u07c0\u07c2\5\u0090I\2\u07c1\u07c0\3\2\2\2\u07c1\u07c2\3"+
		"\2\2\2\u07c2\u07c4\3\2\2\2\u07c3\u07be\3\2\2\2\u07c4\u07c7\3\2\2\2\u07c5"+
		"\u07c3\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u00a5\3\2\2\2\u07c7\u07c5\3\2"+
		"\2\2\u07c8\u07c9\5X-\2\u07c9\u00a7\3\2\2\2\u07ca\u07cb\5X-\2\u07cb\u00a9"+
		"\3\2\2\2\u07cc\u07cd\t\34\2\2\u07cd\u00ab\3\2\2\2\u07ce\u07cf\7\u00be"+
		"\2\2\u07cf\u00ad\3\2\2\2\u07d0\u07d3\5B\"\2\u07d1\u07d3\5\36\20\2\u07d2"+
		"\u07d0\3\2\2\2\u07d2\u07d1\3\2\2\2\u07d3\u00af\3\2\2\2\u07d4\u07d5\t\35"+
		"\2\2\u07d5\u00b1\3\2\2\2\u07d6\u07d7\t\36\2\2\u07d7\u00b3\3\2\2\2\u07d8"+
		"\u07d9\5\u00e2r\2\u07d9\u00b5\3\2\2\2\u07da\u07db\5\u00e2r\2\u07db\u00b7"+
		"\3\2\2\2\u07dc\u07dd\5\u00e2r\2\u07dd\u00b9\3\2\2\2\u07de\u07df\5\u00e2"+
		"r\2\u07df\u00bb\3\2\2\2\u07e0\u07e1\5\u00e2r\2\u07e1\u00bd\3\2\2\2\u07e2"+
		"\u07e3\5\u00e2r\2\u07e3\u00bf\3\2\2\2\u07e4\u07e5\5\u00e2r\2\u07e5\u00c1"+
		"\3\2\2\2\u07e6\u07e7\5\u00e2r\2\u07e7\u00c3\3\2\2\2\u07e8\u07e9\5\u00e2"+
		"r\2\u07e9\u00c5\3\2\2\2\u07ea\u07eb\5\u00e2r\2\u07eb\u00c7\3\2\2\2\u07ec"+
		"\u07ed\5\u00e2r\2\u07ed\u00c9\3\2\2\2\u07ee\u07ef\5\u00e2r\2\u07ef\u00cb"+
		"\3\2\2\2\u07f0\u07f1\5\u00e2r\2\u07f1\u00cd\3\2\2\2\u07f2\u07f3\5\u00e2"+
		"r\2\u07f3\u00cf\3\2\2\2\u07f4\u07f5\5\u00e2r\2\u07f5\u00d1\3\2\2\2\u07f6"+
		"\u07f7\5\u00e2r\2\u07f7\u00d3\3\2\2\2\u07f8\u07f9\5\u00e2r\2\u07f9\u00d5"+
		"\3\2\2\2\u07fa\u07fb\5\u00e2r\2\u07fb\u00d7\3\2\2\2\u07fc\u07fd\5\u00e2"+
		"r\2\u07fd\u00d9\3\2\2\2\u07fe\u07ff\5\u00e2r\2\u07ff\u00db\3\2\2\2\u0800"+
		"\u0801\5\u00e2r\2\u0801\u00dd\3\2\2\2\u0802\u0803\5\u00e2r\2\u0803\u00df"+
		"\3\2\2\2\u0804\u0805\5\u00e2r\2\u0805\u00e1\3\2\2\2\u0806\u080e\7\u00bb"+
		"\2\2\u0807\u080e\5\u00b2Z\2\u0808\u080e\7\u00be\2\2\u0809\u080a\7\5\2"+
		"\2\u080a\u080b\5\u00e2r\2\u080b\u080c\7\6\2\2\u080c\u080e\3\2\2\2\u080d"+
		"\u0806\3\2\2\2\u080d\u0807\3\2\2\2\u080d\u0808\3\2\2\2\u080d\u0809\3\2"+
		"\2\2\u080e\u00e3\3\2\2\2\u012b\u00e7\u00ef\u00f6\u00fb\u0101\u0107\u0109"+
		"\u0123\u012a\u0131\u0137\u013b\u0140\u0143\u014a\u014d\u0151\u0159\u015d"+
		"\u015f\u0163\u0167\u016b\u016e\u0175\u017b\u0181\u0186\u0191\u0197\u019b"+
		"\u019f\u01a2\u01a6\u01ac\u01b1\u01ba\u01c1\u01c7\u01cb\u01cf\u01d4\u01da"+
		"\u01e6\u01ea\u01ef\u01f2\u01f5\u01f8\u01fc\u01ff\u020d\u0214\u021b\u021d"+
		"\u0220\u0226\u022b\u0233\u0238\u0247\u024d\u0257\u025c\u0266\u026a\u026c"+
		"\u0270\u0275\u0277\u027f\u0285\u028a\u0291\u029c\u029f\u02a1\u02a8\u02ac"+
		"\u02b3\u02b9\u02bf\u02c5\u02ca\u02d3\u02d8\u02e3\u02e8\u02f3\u02f8\u02fc"+
		"\u030c\u0316\u031b\u0323\u032f\u0334\u033c\u0343\u0346\u0349\u0350\u0353"+
		"\u0356\u0359\u035d\u0365\u036a\u0374\u0379\u0382\u0389\u038d\u0391\u0394"+
		"\u039c\u03a9\u03ac\u03b4\u03bd\u03c1\u03c6\u03e1\u03ea\u03f6\u03fb\u0407"+
		"\u040d\u0414\u0418\u0422\u0425\u042b\u0431\u043a\u043d\u0441\u0443\u0445"+
		"\u044e\u045a\u0465\u0469\u0470\u0476\u047b\u0483\u0488\u048c\u048f\u0493"+
		"\u0496\u049e\u04a9\u04af\u04b1\u04b9\u04c0\u04c7\u04cc\u04ce\u04d4\u04dd"+
		"\u04e2\u04e9\u04ed\u04ef\u04f2\u04fa\u04fe\u0501\u0507\u050b\u0510\u0517"+
		"\u0520\u0524\u0526\u052a\u0533\u0538\u053a\u0547\u054a\u054d\u0552\u0556"+
		"\u0559\u055c\u0561\u0565\u056a\u056d\u0570\u0575\u0579\u057c\u0583\u0588"+
		"\u0591\u0596\u0599\u05a1\u05a5\u05ad\u05b0\u05b2\u05bb\u05be\u05c0\u05c4"+
		"\u05c8\u05cc\u05cf\u05da\u05df\u05e3\u05e7\u05ea\u05ef\u05f5\u05fc\u0603"+
		"\u060c\u0610\u0612\u0616\u0619\u0621\u0627\u062c\u0632\u0639\u0640\u0645"+
		"\u0648\u064b\u064e\u0653\u0658\u065f\u0663\u0667\u0671\u067a\u067d\u0686"+
		"\u068a\u0692\u069b\u069e\u06a7\u06aa\u06ad\u06b0\u06ba\u06bc\u06c5\u06ce"+
		"\u06d2\u06d9\u06e0\u06e4\u06e8\u06f1\u06f5\u06f9\u06fe\u0702\u0709\u0713"+
		"\u071a\u071f\u0722\u0726\u0734\u0740\u0749\u0752\u0756\u0760\u0763\u076c"+
		"\u0775\u0778\u077e\u078c\u0790\u079b\u07a0\u07ad\u07b4\u07bc\u07c1\u07c5"+
		"\u07d2\u080d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}