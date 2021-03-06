// $ANTLR 3.5.2 druidG.g 2015-01-18 18:15:12

	package com.yahoo.sql4d.converter;

	import org.antlr.runtime.*;
	import java.util.ArrayList;
	import java.util.Arrays;
	import com.yahoo.sql4d.*;
	import com.yahoo.sql4d.beans.*;
	import com.yahoo.sql4d.insert.*;
	import com.yahoo.sql4d.delete.*;
	import com.yahoo.sql4d.drop.*;
	import com.yahoo.sql4d.insert.nodes.*;
	import com.yahoo.sql4d.query.*;
	import com.yahoo.sql4d.query.nodes.*;
	import com.yahoo.sql4d.query.groupby.*;
	import com.yahoo.sql4d.query.timeseries.*;
	import com.yahoo.sql4d.query.select.*;
	import com.yahoo.sql4d.query.search.*;
	import com.yahoo.sql4d.query.topn.*;
	import com.yahoo.sql4d.query.timeboundary.*;
	import com.yahoo.sql4d.query.*;
	import static com.yahoo.sql4d.utils.Utils.*;
	import static com.yahoo.sql4d.utils.DruidUtils.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/**
 * Copyright 2014 Yahoo! Inc. Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License. 
 * See accompanying LICENSE file.
 */
@SuppressWarnings("all")
public class druidGParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARITH_OPER", "AS", "ASC", 
		"AUTO_ISO", "BETWEEN", "BREAK", "BY", "COMPARE_OPER", "CONTAINS", "COUNT", 
		"DATE", "DATE_HOUR", "DATE_HOUR_MIN", "DATE_HOUR_MIN_SEC", "DATE_HOUR_MIN_SEC_SUB", 
		"DATE_HOUR_MIN_SEC_SUB_TZ", "DATE_HOUR_MIN_SEC_SUB_UTC_TZ", "DATE_YEAR_MONTH_ONLY", 
		"DATE_YEAR_ONLY", "DELETE", "DELIMITER", "DESC", "DOUBLE_SUM", "DROP", 
		"DURATION", "EQUALS", "ESC_SEQ", "FIELD_ACCESS", "FLOAT", "FROM", "GROUP", 
		"HAVING", "HEX_DIGIT", "HINT", "ID", "INCLUDE", "INSERT", "INSERT_HADOOP", 
		"INSERT_REALTIME", "INTO", "ISO", "JAVASCRIPT", "JOIN", "KAFKA", "LCURLY", 
		"LEFT_JOIN", "LIKE", "LIMIT", "LONG", "LONG_SUM", "LPARAN", "LSQUARE", 
		"MAX", "MAX_WINDOW", "MIN", "NEWLINE", "NOT", "NUM", "OCTAL_ESC", "ON", 
		"OPT_AMPERSAND", "OPT_SEMI_COLON", "OR", "ORDER", "PARTITION", "PERIOD", 
		"RCURLY", "RIGHT_JOIN", "ROLLUP", "RPARAN", "RSQUARE", "SELECT", "SINGLE_QUOTE_STRING", 
		"SORT", "STRING", "TABLE", "THEN", "UNICODE_ESC", "UNIQUE", "VALUES", 
		"WHERE", "WHICH", "WS", "'(*)'", "'*'", "','", "'interval'"
	};
	public static final int EOF=-1;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int AND=4;
	public static final int ARITH_OPER=5;
	public static final int AS=6;
	public static final int ASC=7;
	public static final int AUTO_ISO=8;
	public static final int BETWEEN=9;
	public static final int BREAK=10;
	public static final int BY=11;
	public static final int COMPARE_OPER=12;
	public static final int CONTAINS=13;
	public static final int COUNT=14;
	public static final int DATE=15;
	public static final int DATE_HOUR=16;
	public static final int DATE_HOUR_MIN=17;
	public static final int DATE_HOUR_MIN_SEC=18;
	public static final int DATE_HOUR_MIN_SEC_SUB=19;
	public static final int DATE_HOUR_MIN_SEC_SUB_TZ=20;
	public static final int DATE_HOUR_MIN_SEC_SUB_UTC_TZ=21;
	public static final int DATE_YEAR_MONTH_ONLY=22;
	public static final int DATE_YEAR_ONLY=23;
	public static final int DELETE=24;
	public static final int DELIMITER=25;
	public static final int DESC=26;
	public static final int DOUBLE_SUM=27;
	public static final int DROP=28;
	public static final int DURATION=29;
	public static final int EQUALS=30;
	public static final int ESC_SEQ=31;
	public static final int FIELD_ACCESS=32;
	public static final int FLOAT=33;
	public static final int FROM=34;
	public static final int GROUP=35;
	public static final int HAVING=36;
	public static final int HEX_DIGIT=37;
	public static final int HINT=38;
	public static final int ID=39;
	public static final int INCLUDE=40;
	public static final int INSERT=41;
	public static final int INSERT_HADOOP=42;
	public static final int INSERT_REALTIME=43;
	public static final int INTO=44;
	public static final int ISO=45;
	public static final int JAVASCRIPT=46;
	public static final int JOIN=47;
	public static final int KAFKA=48;
	public static final int LCURLY=49;
	public static final int LEFT_JOIN=50;
	public static final int LIKE=51;
	public static final int LIMIT=52;
	public static final int LONG=53;
	public static final int LONG_SUM=54;
	public static final int LPARAN=55;
	public static final int LSQUARE=56;
	public static final int MAX=57;
	public static final int MAX_WINDOW=58;
	public static final int MIN=59;
	public static final int NEWLINE=60;
	public static final int NOT=61;
	public static final int NUM=62;
	public static final int OCTAL_ESC=63;
	public static final int ON=64;
	public static final int OPT_AMPERSAND=65;
	public static final int OPT_SEMI_COLON=66;
	public static final int OR=67;
	public static final int ORDER=68;
	public static final int PARTITION=69;
	public static final int PERIOD=70;
	public static final int RCURLY=71;
	public static final int RIGHT_JOIN=72;
	public static final int ROLLUP=73;
	public static final int RPARAN=74;
	public static final int RSQUARE=75;
	public static final int SELECT=76;
	public static final int SINGLE_QUOTE_STRING=77;
	public static final int SORT=78;
	public static final int STRING=79;
	public static final int TABLE=80;
	public static final int THEN=81;
	public static final int UNICODE_ESC=82;
	public static final int UNIQUE=83;
	public static final int VALUES=84;
	public static final int WHERE=85;
	public static final int WHICH=86;
	public static final int WS=87;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public druidGParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public druidGParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return druidGParser.tokenNames; }
	@Override public String getGrammarFileName() { return "druidG.g"; }



	// $ANTLR start "program"
	// druidG.g:43:1: program returns [Program program] : ( (s1= grandQuery ) | (s2= grandInsert ) | (s3= grandDelete ) | (s4= grandDrop ) );
	public final Program program() throws RecognitionException {
		Program program = null;


		QueryProgram s1 =null;
		InsertProgram s2 =null;
		DeleteProgram s3 =null;
		DropProgram s4 =null;

		 program = null; 
		try {
			// druidG.g:45:2: ( (s1= grandQuery ) | (s2= grandInsert ) | (s3= grandDelete ) | (s4= grandDrop ) )
			int alt1=4;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				alt1=1;
				}
				break;
			case INSERT:
			case INSERT_HADOOP:
			case INSERT_REALTIME:
				{
				alt1=2;
				}
				break;
			case DELETE:
				{
				alt1=3;
				}
				break;
			case DROP:
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// druidG.g:45:4: (s1= grandQuery )
					{
					// druidG.g:45:4: (s1= grandQuery )
					// druidG.g:45:5: s1= grandQuery
					{
					pushFollow(FOLLOW_grandQuery_in_program49);
					s1=grandQuery();
					state._fsp--;

					}

					 program = s1; 
					}
					break;
				case 2 :
					// druidG.g:46:4: (s2= grandInsert )
					{
					// druidG.g:46:4: (s2= grandInsert )
					// druidG.g:46:5: s2= grandInsert
					{
					pushFollow(FOLLOW_grandInsert_in_program61);
					s2=grandInsert();
					state._fsp--;

					}

					 program = s2; 
					}
					break;
				case 3 :
					// druidG.g:47:4: (s3= grandDelete )
					{
					// druidG.g:47:4: (s3= grandDelete )
					// druidG.g:47:5: s3= grandDelete
					{
					pushFollow(FOLLOW_grandDelete_in_program73);
					s3=grandDelete();
					state._fsp--;

					}

					 program = s3; 
					}
					break;
				case 4 :
					// druidG.g:48:4: (s4= grandDrop )
					{
					// druidG.g:48:4: (s4= grandDrop )
					// druidG.g:48:5: s4= grandDrop
					{
					pushFollow(FOLLOW_grandDrop_in_program85);
					s4=grandDrop();
					state._fsp--;

					}

					 program = s4; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return program;
	}
	// $ANTLR end "program"



	// $ANTLR start "grandDelete"
	// druidG.g:51:1: grandDelete returns [DeleteProgram program] : (s1= deleteStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) ;
	public final DeleteProgram grandDelete() throws RecognitionException {
		DeleteProgram program = null;


		DeleteMeta s1 =null;

		 program = null; 
		try {
			// druidG.g:53:2: ( (s1= deleteStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) )
			// druidG.g:53:4: (s1= deleteStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
			{
			// druidG.g:53:4: (s1= deleteStmnt )
			// druidG.g:53:5: s1= deleteStmnt
			{
			pushFollow(FOLLOW_deleteStmnt_in_grandDelete113);
			s1=deleteStmnt();
			state._fsp--;

			}

			 program = new DeleteProgram();program.addStmnt(s1); 
			// druidG.g:54:4: ( WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// druidG.g:54:4: WS
					{
					match(input,WS,FOLLOW_WS_in_grandDelete122); 
					}
					break;

			}

			// druidG.g:54:8: ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
			int alt5=2;
			switch ( input.LA(1) ) {
			case OPT_SEMI_COLON:
				{
				alt5=1;
				}
				break;
			case EOF:
				{
				alt5=1;
				}
				break;
			case OPT_AMPERSAND:
				{
				alt5=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// druidG.g:54:9: ( OPT_SEMI_COLON )?
					{
					// druidG.g:54:9: ( OPT_SEMI_COLON )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==OPT_SEMI_COLON) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// druidG.g:54:9: OPT_SEMI_COLON
							{
							match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_grandDelete126); 
							}
							break;

					}

					}
					break;
				case 2 :
					// druidG.g:54:27: ( OPT_AMPERSAND )?
					{
					// druidG.g:54:27: ( OPT_AMPERSAND )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==OPT_AMPERSAND) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// druidG.g:54:28: OPT_AMPERSAND
							{
							match(input,OPT_AMPERSAND,FOLLOW_OPT_AMPERSAND_in_grandDelete132); 
							program.waitForCompletion = false;
							}
							break;

					}

					}
					break;

			}


			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return program;
	}
	// $ANTLR end "grandDelete"



	// $ANTLR start "grandDrop"
	// druidG.g:57:1: grandDrop returns [DropProgram program] : (s1= dropStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) ;
	public final DropProgram grandDrop() throws RecognitionException {
		DropProgram program = null;


		DropMeta s1 =null;

		 program = null; 
		try {
			// druidG.g:59:2: ( (s1= dropStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) )
			// druidG.g:59:4: (s1= dropStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
			{
			// druidG.g:59:4: (s1= dropStmnt )
			// druidG.g:59:5: s1= dropStmnt
			{
			pushFollow(FOLLOW_dropStmnt_in_grandDrop164);
			s1=dropStmnt();
			state._fsp--;

			}

			 program = new DropProgram();program.addStmnt(s1); 
			// druidG.g:60:4: ( WS )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==WS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// druidG.g:60:4: WS
					{
					match(input,WS,FOLLOW_WS_in_grandDrop173); 
					}
					break;

			}

			// druidG.g:60:8: ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
			int alt9=2;
			switch ( input.LA(1) ) {
			case OPT_SEMI_COLON:
				{
				alt9=1;
				}
				break;
			case EOF:
				{
				alt9=1;
				}
				break;
			case OPT_AMPERSAND:
				{
				alt9=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// druidG.g:60:9: ( OPT_SEMI_COLON )?
					{
					// druidG.g:60:9: ( OPT_SEMI_COLON )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==OPT_SEMI_COLON) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// druidG.g:60:9: OPT_SEMI_COLON
							{
							match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_grandDrop177); 
							}
							break;

					}

					}
					break;
				case 2 :
					// druidG.g:60:27: ( OPT_AMPERSAND )?
					{
					// druidG.g:60:27: ( OPT_AMPERSAND )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==OPT_AMPERSAND) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// druidG.g:60:28: OPT_AMPERSAND
							{
							match(input,OPT_AMPERSAND,FOLLOW_OPT_AMPERSAND_in_grandDrop183); 
							program.waitForCompletion = false;
							}
							break;

					}

					}
					break;

			}


			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return program;
	}
	// $ANTLR end "grandDrop"



	// $ANTLR start "grandInsert"
	// druidG.g:63:1: grandInsert returns [InsertProgram program] : ( (s1= insertStmnt ) | (s2= insertHStmnt ) | (s3= insertRTStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) );
	public final InsertProgram grandInsert() throws RecognitionException {
		InsertProgram program = null;


		BasicInsertMeta s1 =null;
		BatchInsertMeta s2 =null;
		RTInsertMeta s3 =null;

		 program = null; 
		try {
			// druidG.g:65:2: ( (s1= insertStmnt ) | (s2= insertHStmnt ) | (s3= insertRTStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) )
			int alt14=3;
			switch ( input.LA(1) ) {
			case INSERT:
				{
				alt14=1;
				}
				break;
			case INSERT_HADOOP:
				{
				alt14=2;
				}
				break;
			case INSERT_REALTIME:
				{
				alt14=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// druidG.g:65:4: (s1= insertStmnt )
					{
					// druidG.g:65:4: (s1= insertStmnt )
					// druidG.g:65:5: s1= insertStmnt
					{
					pushFollow(FOLLOW_insertStmnt_in_grandInsert214);
					s1=insertStmnt();
					state._fsp--;

					}

					 program = InsertProgram.getInsertInstance();program.addStmnt(s1); 
					}
					break;
				case 2 :
					// druidG.g:66:4: (s2= insertHStmnt )
					{
					// druidG.g:66:4: (s2= insertHStmnt )
					// druidG.g:66:5: s2= insertHStmnt
					{
					pushFollow(FOLLOW_insertHStmnt_in_grandInsert226);
					s2=insertHStmnt();
					state._fsp--;

					}

					 program = InsertProgram.getInsertHadoopInstance();program.addStmnt(s2); 
					}
					break;
				case 3 :
					// druidG.g:67:4: (s3= insertRTStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
					{
					// druidG.g:67:4: (s3= insertRTStmnt )
					// druidG.g:67:5: s3= insertRTStmnt
					{
					pushFollow(FOLLOW_insertRTStmnt_in_grandInsert238);
					s3=insertRTStmnt();
					state._fsp--;

					}

					 program = InsertProgram.getInsertRTInstance();program.addStmnt(s3); 
					// druidG.g:68:4: ( WS )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==WS) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// druidG.g:68:4: WS
							{
							match(input,WS,FOLLOW_WS_in_grandInsert247); 
							}
							break;

					}

					// druidG.g:68:8: ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
					int alt13=2;
					switch ( input.LA(1) ) {
					case OPT_SEMI_COLON:
						{
						alt13=1;
						}
						break;
					case EOF:
						{
						alt13=1;
						}
						break;
					case OPT_AMPERSAND:
						{
						alt13=2;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// druidG.g:68:9: ( OPT_SEMI_COLON )?
							{
							// druidG.g:68:9: ( OPT_SEMI_COLON )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==OPT_SEMI_COLON) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// druidG.g:68:9: OPT_SEMI_COLON
									{
									match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_grandInsert251); 
									}
									break;

							}

							}
							break;
						case 2 :
							// druidG.g:68:27: ( OPT_AMPERSAND )?
							{
							// druidG.g:68:27: ( OPT_AMPERSAND )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==OPT_AMPERSAND) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// druidG.g:68:28: OPT_AMPERSAND
									{
									match(input,OPT_AMPERSAND,FOLLOW_OPT_AMPERSAND_in_grandInsert257); 
									program.waitForCompletion = false;
									}
									break;

							}

							}
							break;

					}


					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return program;
	}
	// $ANTLR end "grandInsert"



	// $ANTLR start "deleteStmnt"
	// druidG.g:71:1: deleteStmnt returns [DeleteMeta dMeta] : DELETE WS FROM WS (id= ID WS ) WHERE WS i= intervalClause ;
	public final DeleteMeta deleteStmnt() throws RecognitionException {
		DeleteMeta dMeta = null;


		Token id=null;
		List<Interval> i =null;

		 dMeta = new DeleteMeta();      
		try {
			// druidG.g:73:2: ( DELETE WS FROM WS (id= ID WS ) WHERE WS i= intervalClause )
			// druidG.g:73:3: DELETE WS FROM WS (id= ID WS ) WHERE WS i= intervalClause
			{
			match(input,DELETE,FOLLOW_DELETE_in_deleteStmnt283); 
			match(input,WS,FOLLOW_WS_in_deleteStmnt285); 
			match(input,FROM,FOLLOW_FROM_in_deleteStmnt287); 
			match(input,WS,FOLLOW_WS_in_deleteStmnt289); 
			// druidG.g:73:21: (id= ID WS )
			// druidG.g:73:22: id= ID WS
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_deleteStmnt294); 
			dMeta.dataSource = (id!=null?id.getText():null); 
			match(input,WS,FOLLOW_WS_in_deleteStmnt298); 
			}

			match(input,WHERE,FOLLOW_WHERE_in_deleteStmnt303); 
			match(input,WS,FOLLOW_WS_in_deleteStmnt305); 
			pushFollow(FOLLOW_intervalClause_in_deleteStmnt309);
			i=intervalClause();
			state._fsp--;

			 // We set this later after granularitySpec object is fully formed.
				  if (i!= null && !i.isEmpty()) {
				     dMeta.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
				  }
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dMeta;
	}
	// $ANTLR end "deleteStmnt"



	// $ANTLR start "dropStmnt"
	// druidG.g:82:1: dropStmnt returns [DropMeta dMeta] : DROP WS TABLE WS (id= ID ) ;
	public final DropMeta dropStmnt() throws RecognitionException {
		DropMeta dMeta = null;


		Token id=null;

		 dMeta = new DropMeta();      
		try {
			// druidG.g:84:2: ( DROP WS TABLE WS (id= ID ) )
			// druidG.g:84:3: DROP WS TABLE WS (id= ID )
			{
			match(input,DROP,FOLLOW_DROP_in_dropStmnt337); 
			match(input,WS,FOLLOW_WS_in_dropStmnt339); 
			match(input,TABLE,FOLLOW_TABLE_in_dropStmnt341); 
			match(input,WS,FOLLOW_WS_in_dropStmnt343); 
			// druidG.g:84:20: (id= ID )
			// druidG.g:84:21: id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_dropStmnt348); 
			dMeta.dataSource = (id!=null?id.getText():null); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dMeta;
	}
	// $ANTLR end "dropStmnt"



	// $ANTLR start "insertStmnt"
	// druidG.g:87:1: insertStmnt returns [BasicInsertMeta iMeta] : ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) ) ( WHERE WS i= intervalClause WS )? ( BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ;
	public final BasicInsertMeta insertStmnt() throws RecognitionException {
		BasicInsertMeta iMeta = null;


		Token id=null;
		Token paths=null;
		Token gran=null;
		Token delim=null;
		Token listDelim=null;
		Object a =null;
		List<Interval> i =null;

		 iMeta = new BasicInsertMeta();      
		try {
			// druidG.g:89:2: ( ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) ) ( WHERE WS i= intervalClause WS )? ( BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? )
			// druidG.g:89:3: ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) ) ( WHERE WS i= intervalClause WS )? ( BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )?
			{
			// druidG.g:89:3: ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? )
			// druidG.g:89:4: INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )?
			{
			match(input,INSERT,FOLLOW_INSERT_in_insertStmnt375); 
			match(input,WS,FOLLOW_WS_in_insertStmnt377); 
			match(input,INTO,FOLLOW_INTO_in_insertStmnt379); 
			match(input,WS,FOLLOW_WS_in_insertStmnt381); 
			// druidG.g:89:22: (id= ID )
			// druidG.g:89:23: id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_insertStmnt386); 
			iMeta.dataSource = (id!=null?id.getText():null); 
			}

			// druidG.g:89:62: ( WS )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==WS) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// druidG.g:89:62: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt391); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_insertStmnt394); 
			// druidG.g:89:73: ( WS )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==WS) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// druidG.g:89:73: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt396); 
					}
					break;

			}

			pushFollow(FOLLOW_selectItems_in_insertStmnt399);
			selectItems(iMeta);
			state._fsp--;

			// druidG.g:89:96: ( ( WS )? ',' ( WS )? selectItems[iMeta] )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==WS) ) {
					int LA19_1 = input.LA(2);
					if ( (LA19_1==90) ) {
						alt19=1;
					}

				}
				else if ( (LA19_0==90) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// druidG.g:89:97: ( WS )? ',' ( WS )? selectItems[iMeta]
					{
					// druidG.g:89:97: ( WS )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==WS) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// druidG.g:89:97: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt403); 
							}
							break;

					}

					match(input,90,FOLLOW_90_in_insertStmnt406); 
					// druidG.g:89:105: ( WS )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==WS) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// druidG.g:89:105: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt408); 
							}
							break;

					}

					pushFollow(FOLLOW_selectItems_in_insertStmnt411);
					selectItems(iMeta);
					state._fsp--;

					}
					break;

				default :
					break loop19;
				}
			}

			// druidG.g:89:130: ( WS )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==WS) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// druidG.g:89:130: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt416); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_insertStmnt419); 
			// druidG.g:89:141: ( WS )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==WS) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// druidG.g:89:141: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt421); 
					}
					break;

			}

			}

			// druidG.g:90:3: ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==VALUES) ) {
				alt29=1;
			}
			else if ( (LA29_0==FROM) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// druidG.g:91:5: ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? )
					{
					// druidG.g:91:5: ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? )
					// druidG.g:91:6: VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )?
					{
					match(input,VALUES,FOLLOW_VALUES_in_insertStmnt434); 
					// druidG.g:91:13: ( WS )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==WS) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// druidG.g:91:13: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt436); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertStmnt439); 
					// druidG.g:91:24: ( WS )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==WS) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// druidG.g:91:24: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt441); 
							}
							break;

					}

					// druidG.g:91:28: (a= anyValue )
					// druidG.g:91:29: a= anyValue
					{
					pushFollow(FOLLOW_anyValue_in_insertStmnt447);
					a=anyValue();
					state._fsp--;

					iMeta.values.add(a);
					}

					// druidG.g:91:65: ( ( WS )? ',' ( WS )? a= anyValue )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==WS) ) {
							int LA26_1 = input.LA(2);
							if ( (LA26_1==90) ) {
								alt26=1;
							}

						}
						else if ( (LA26_0==90) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// druidG.g:91:66: ( WS )? ',' ( WS )? a= anyValue
							{
							// druidG.g:91:66: ( WS )?
							int alt24=2;
							int LA24_0 = input.LA(1);
							if ( (LA24_0==WS) ) {
								alt24=1;
							}
							switch (alt24) {
								case 1 :
									// druidG.g:91:66: WS
									{
									match(input,WS,FOLLOW_WS_in_insertStmnt454); 
									}
									break;

							}

							match(input,90,FOLLOW_90_in_insertStmnt457); 
							// druidG.g:91:74: ( WS )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==WS) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// druidG.g:91:74: WS
									{
									match(input,WS,FOLLOW_WS_in_insertStmnt459); 
									}
									break;

							}

							pushFollow(FOLLOW_anyValue_in_insertStmnt464);
							a=anyValue();
							state._fsp--;

							iMeta.values.add(a);
							}
							break;

						default :
							break loop26;
						}
					}

					// druidG.g:91:114: ( WS )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==WS) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// druidG.g:91:114: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt470); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertStmnt473); 
					// druidG.g:91:125: ( WS )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==WS) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// druidG.g:91:125: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt475); 
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// druidG.g:93:5: ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS )
					{
					// druidG.g:93:5: ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS )
					// druidG.g:93:6: FROM WS (paths= SINGLE_QUOTE_STRING ) WS
					{
					match(input,FROM,FOLLOW_FROM_in_insertStmnt492); 
					match(input,WS,FOLLOW_WS_in_insertStmnt494); 
					// druidG.g:93:14: (paths= SINGLE_QUOTE_STRING )
					// druidG.g:93:15: paths= SINGLE_QUOTE_STRING
					{
					paths=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt499); 
					iMeta.dataPath = unquote((paths!=null?paths.getText():null));
					}

					match(input,WS,FOLLOW_WS_in_insertStmnt504); 
					}

					}
					break;

			}

			// druidG.g:95:3: ( WHERE WS i= intervalClause WS )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==WHERE) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// druidG.g:95:4: WHERE WS i= intervalClause WS
					{
					match(input,WHERE,FOLLOW_WHERE_in_insertStmnt514); 
					match(input,WS,FOLLOW_WS_in_insertStmnt516); 
					pushFollow(FOLLOW_intervalClause_in_insertStmnt520);
					i=intervalClause();
					state._fsp--;

					match(input,WS,FOLLOW_WS_in_insertStmnt522); 
					}
					break;

			}

			// druidG.g:96:4: ( BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==BREAK) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// druidG.g:96:5: BREAK WS BY WS gran= SINGLE_QUOTE_STRING
					{
					match(input,BREAK,FOLLOW_BREAK_in_insertStmnt530); 
					match(input,WS,FOLLOW_WS_in_insertStmnt532); 
					match(input,BY,FOLLOW_BY_in_insertStmnt534); 
					match(input,WS,FOLLOW_WS_in_insertStmnt536); 
					gran=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt540); 
					 iMeta.granularitySpec = new GranularitySpec(unquote((gran!=null?gran.getText():null)));
					}
					break;

			}

			 // We set this later after granularitySpec object is fully formed.
				  if (i!= null && !i.isEmpty()) {
				     iMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
				  }
				
			// druidG.g:102:2: ( DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==DELIMITER) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// druidG.g:102:3: DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )?
					{
					match(input,DELIMITER,FOLLOW_DELIMITER_in_insertStmnt554); 
					// druidG.g:102:13: ( WS )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==WS) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// druidG.g:102:13: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt556); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertStmnt559); 
					// druidG.g:102:24: ( WS )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==WS) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// druidG.g:102:24: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt561); 
							}
							break;

					}

					delim=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt566); 
					iMeta.delimiter=unicode(unquote((delim!=null?delim.getText():null)));
					// druidG.g:102:102: ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==WS) ) {
						int LA36_1 = input.LA(2);
						if ( (LA36_1==90) ) {
							alt36=1;
						}
					}
					else if ( (LA36_0==90) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// druidG.g:102:103: ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING
							{
							// druidG.g:102:103: ( WS )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==WS) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// druidG.g:102:103: WS
									{
									match(input,WS,FOLLOW_WS_in_insertStmnt570); 
									}
									break;

							}

							match(input,90,FOLLOW_90_in_insertStmnt573); 
							// druidG.g:102:111: ( WS )?
							int alt35=2;
							int LA35_0 = input.LA(1);
							if ( (LA35_0==WS) ) {
								alt35=1;
							}
							switch (alt35) {
								case 1 :
									// druidG.g:102:111: WS
									{
									match(input,WS,FOLLOW_WS_in_insertStmnt575); 
									}
									break;

							}

							listDelim=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt580); 
							iMeta.listDelimiter=unicode(unquote((listDelim!=null?listDelim.getText():null)));
							}
							break;

					}

					// druidG.g:102:204: ( WS )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==WS) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// druidG.g:102:204: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt586); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertStmnt589); 
					// druidG.g:102:215: ( WS )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==WS) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// druidG.g:102:215: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt591); 
							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return iMeta;
	}
	// $ANTLR end "insertStmnt"



	// $ANTLR start "insertHStmnt"
	// druidG.g:105:1: insertHStmnt returns [BatchInsertMeta bMeta] : ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? ) FROM WS (paths= SINGLE_QUOTE_STRING ) WS ( WHERE WS i= intervalClause WS )? ( BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ( PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )? ( ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )? ;
	public final BatchInsertMeta insertHStmnt() throws RecognitionException {
		BatchInsertMeta bMeta = null;


		Token id=null;
		Token paths=null;
		Token gran=null;
		Token delim=null;
		Token listDelim=null;
		Token type=null;
		Token size=null;
		Token boundary=null;
		List<Interval> i =null;

		 bMeta = new BatchInsertMeta();      
		try {
			// druidG.g:107:2: ( ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? ) FROM WS (paths= SINGLE_QUOTE_STRING ) WS ( WHERE WS i= intervalClause WS )? ( BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ( PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )? ( ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )? )
			// druidG.g:107:3: ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? ) FROM WS (paths= SINGLE_QUOTE_STRING ) WS ( WHERE WS i= intervalClause WS )? ( BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ( PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )? ( ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )?
			{
			// druidG.g:107:3: ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? )
			// druidG.g:107:4: INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )?
			{
			match(input,INSERT_HADOOP,FOLLOW_INSERT_HADOOP_in_insertHStmnt615); 
			match(input,WS,FOLLOW_WS_in_insertHStmnt617); 
			match(input,INTO,FOLLOW_INTO_in_insertHStmnt619); 
			match(input,WS,FOLLOW_WS_in_insertHStmnt621); 
			// druidG.g:107:29: (id= ID )
			// druidG.g:107:30: id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_insertHStmnt626); 
			bMeta.dataSource = (id!=null?id.getText():null); 
			}

			// druidG.g:107:69: ( WS )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==WS) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// druidG.g:107:69: WS
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt631); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_insertHStmnt634); 
			// druidG.g:107:80: ( WS )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==WS) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// druidG.g:107:80: WS
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt636); 
					}
					break;

			}

			pushFollow(FOLLOW_selectItems_in_insertHStmnt639);
			selectItems(bMeta);
			state._fsp--;

			// druidG.g:107:103: ( ( WS )? ',' ( WS )? selectItems[bMeta] )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==WS) ) {
					int LA44_1 = input.LA(2);
					if ( (LA44_1==90) ) {
						alt44=1;
					}

				}
				else if ( (LA44_0==90) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// druidG.g:107:104: ( WS )? ',' ( WS )? selectItems[bMeta]
					{
					// druidG.g:107:104: ( WS )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==WS) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// druidG.g:107:104: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt643); 
							}
							break;

					}

					match(input,90,FOLLOW_90_in_insertHStmnt646); 
					// druidG.g:107:112: ( WS )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==WS) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// druidG.g:107:112: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt648); 
							}
							break;

					}

					pushFollow(FOLLOW_selectItems_in_insertHStmnt651);
					selectItems(bMeta);
					state._fsp--;

					}
					break;

				default :
					break loop44;
				}
			}

			// druidG.g:107:137: ( WS )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==WS) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// druidG.g:107:137: WS
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt656); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_insertHStmnt659); 
			// druidG.g:107:148: ( WS )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==WS) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// druidG.g:107:148: WS
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt661); 
					}
					break;

			}

			}


				  bMeta.rollupSpec.aggs=bMeta.aggregations;
				  List<String> dims = getDimensions(bMeta.fetchDimensions);
				  bMeta.dataSpec.dimensions=dims.subList(1, dims.size());
				  bMeta.dataSpec.columns=getColumns(bMeta.fetchDimensions, bMeta.aggregations);
				
			match(input,FROM,FOLLOW_FROM_in_insertHStmnt671); 
			match(input,WS,FOLLOW_WS_in_insertHStmnt673); 
			// druidG.g:114:11: (paths= SINGLE_QUOTE_STRING )
			// druidG.g:114:12: paths= SINGLE_QUOTE_STRING
			{
			paths=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt678); 
			bMeta.pathSpec.setPath(unquote((paths!=null?paths.getText():null)));bMeta.dataSpec.inferFormat(unquote((paths!=null?paths.getText():null)));
			}

			match(input,WS,FOLLOW_WS_in_insertHStmnt683); 
			// druidG.g:115:3: ( WHERE WS i= intervalClause WS )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==WHERE) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// druidG.g:115:4: WHERE WS i= intervalClause WS
					{
					match(input,WHERE,FOLLOW_WHERE_in_insertHStmnt688); 
					match(input,WS,FOLLOW_WS_in_insertHStmnt690); 
					pushFollow(FOLLOW_intervalClause_in_insertHStmnt694);
					i=intervalClause();
					state._fsp--;

					match(input,WS,FOLLOW_WS_in_insertHStmnt696); 
					}
					break;

			}

			// druidG.g:116:4: ( BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==BREAK) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// druidG.g:116:5: BREAK WS BY WS gran= SINGLE_QUOTE_STRING
					{
					match(input,BREAK,FOLLOW_BREAK_in_insertHStmnt704); 
					match(input,WS,FOLLOW_WS_in_insertHStmnt706); 
					match(input,BY,FOLLOW_BY_in_insertHStmnt708); 
					match(input,WS,FOLLOW_WS_in_insertHStmnt710); 
					gran=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt714); 
					 bMeta.granularitySpec = new GranularitySpec(unquote((gran!=null?gran.getText():null)));
					}
					break;

			}

			 // We set this later after granularitySpec object is fully formed.
				  if (i!= null && !i.isEmpty()) {
				     bMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
				  }
				
			// druidG.g:122:3: ( DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==DELIMITER) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// druidG.g:122:4: DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )?
					{
					match(input,DELIMITER,FOLLOW_DELIMITER_in_insertHStmnt729); 
					// druidG.g:122:14: ( WS )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==WS) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// druidG.g:122:14: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt731); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertHStmnt734); 
					// druidG.g:122:25: ( WS )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==WS) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// druidG.g:122:25: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt736); 
							}
							break;

					}

					delim=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt741); 
					bMeta.dataSpec.delimiter=unicode(unquote((delim!=null?delim.getText():null)));
					// druidG.g:122:112: ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==WS) ) {
						int LA53_1 = input.LA(2);
						if ( (LA53_1==90) ) {
							alt53=1;
						}
					}
					else if ( (LA53_0==90) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// druidG.g:122:113: ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING
							{
							// druidG.g:122:113: ( WS )?
							int alt51=2;
							int LA51_0 = input.LA(1);
							if ( (LA51_0==WS) ) {
								alt51=1;
							}
							switch (alt51) {
								case 1 :
									// druidG.g:122:113: WS
									{
									match(input,WS,FOLLOW_WS_in_insertHStmnt745); 
									}
									break;

							}

							match(input,90,FOLLOW_90_in_insertHStmnt748); 
							// druidG.g:122:121: ( WS )?
							int alt52=2;
							int LA52_0 = input.LA(1);
							if ( (LA52_0==WS) ) {
								alt52=1;
							}
							switch (alt52) {
								case 1 :
									// druidG.g:122:121: WS
									{
									match(input,WS,FOLLOW_WS_in_insertHStmnt750); 
									}
									break;

							}

							listDelim=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt755); 
							bMeta.dataSpec.listDelimiter=unicode(unquote((listDelim!=null?listDelim.getText():null)));
							}
							break;

					}

					// druidG.g:122:223: ( WS )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==WS) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// druidG.g:122:223: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt761); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertHStmnt764); 
					// druidG.g:122:234: ( WS )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==WS) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// druidG.g:122:234: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt766); 
							}
							break;

					}

					}
					break;

			}

			// druidG.g:123:3: ( PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==PARTITION) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// druidG.g:123:4: PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )?
					{
					match(input,PARTITION,FOLLOW_PARTITION_in_insertHStmnt775); 
					// druidG.g:123:14: ( WS )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==WS) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// druidG.g:123:14: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt777); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertHStmnt780); 
					// druidG.g:123:25: ( WS )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==WS) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// druidG.g:123:25: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt782); 
							}
							break;

					}

					type=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt787); 
					// druidG.g:123:54: ( WS )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==WS) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// druidG.g:123:54: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt789); 
							}
							break;

					}

					match(input,90,FOLLOW_90_in_insertHStmnt792); 
					// druidG.g:123:62: ( WS )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==WS) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// druidG.g:123:62: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt794); 
							}
							break;

					}

					size=(Token)match(input,LONG,FOLLOW_LONG_in_insertHStmnt799); 
					bMeta.partitionsSpec.type=unquote((type!=null?type.getText():null));bMeta.partitionsSpec.targetPartitionSize=Long.valueOf((size!=null?size.getText():null)); 
					// druidG.g:123:192: ( WS )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==WS) ) {
						alt61=1;
					}
					switch (alt61) {
						case 1 :
							// druidG.g:123:192: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt803); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertHStmnt806); 
					// druidG.g:123:203: ( WS )?
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0==WS) ) {
						alt62=1;
					}
					switch (alt62) {
						case 1 :
							// druidG.g:123:203: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt808); 
							}
							break;

					}

					}
					break;

			}

			// druidG.g:124:3: ( ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==ROLLUP) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// druidG.g:124:4: ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )?
					{
					match(input,ROLLUP,FOLLOW_ROLLUP_in_insertHStmnt816); 
					// druidG.g:124:11: ( WS )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==WS) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// druidG.g:124:11: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt818); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertHStmnt821); 
					// druidG.g:124:22: ( WS )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==WS) ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// druidG.g:124:22: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt823); 
							}
							break;

					}

					gran=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt828); 
					// druidG.g:124:51: ( WS )?
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==WS) ) {
						alt66=1;
					}
					switch (alt66) {
						case 1 :
							// druidG.g:124:51: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt830); 
							}
							break;

					}

					match(input,90,FOLLOW_90_in_insertHStmnt833); 
					// druidG.g:124:59: ( WS )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==WS) ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// druidG.g:124:59: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt835); 
							}
							break;

					}

					boundary=(Token)match(input,LONG,FOLLOW_LONG_in_insertHStmnt840); 
					bMeta.rollupSpec.rollupGranularity=unquote((gran!=null?gran.getText():null));bMeta.rollupSpec.rowFlushBoundary=Long.valueOf((boundary!=null?boundary.getText():null)); 
					// druidG.g:124:199: ( WS )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==WS) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// druidG.g:124:199: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt844); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertHStmnt847); 
					// druidG.g:124:210: ( WS )?
					int alt69=2;
					int LA69_0 = input.LA(1);
					if ( (LA69_0==WS) ) {
						alt69=1;
					}
					switch (alt69) {
						case 1 :
							// druidG.g:124:210: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt849); 
							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return bMeta;
	}
	// $ANTLR end "insertHStmnt"



	// $ANTLR start "insertRTStmnt"
	// druidG.g:127:1: insertRTStmnt returns [RTInsertMeta iMeta] : ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ;
	public final RTInsertMeta insertRTStmnt() throws RecognitionException {
		RTInsertMeta iMeta = null;


		Token id=null;
		Token gran=null;
		Object a =null;
		List<Interval> i =null;

		 iMeta = new RTInsertMeta();      
		try {
			// druidG.g:129:2: ( ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? )
			// druidG.g:129:3: ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
			{
			// druidG.g:129:3: ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? )
			// druidG.g:129:4: INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )?
			{
			match(input,INSERT_REALTIME,FOLLOW_INSERT_REALTIME_in_insertRTStmnt872); 
			match(input,WS,FOLLOW_WS_in_insertRTStmnt874); 
			match(input,INTO,FOLLOW_INTO_in_insertRTStmnt876); 
			match(input,WS,FOLLOW_WS_in_insertRTStmnt878); 
			// druidG.g:129:31: (id= ID )
			// druidG.g:129:32: id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_insertRTStmnt883); 
			iMeta.dataSource = (id!=null?id.getText():null); 
			}

			// druidG.g:129:71: ( WS )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==WS) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// druidG.g:129:71: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt888); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_insertRTStmnt891); 
			// druidG.g:129:82: ( WS )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==WS) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// druidG.g:129:82: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt893); 
					}
					break;

			}

			pushFollow(FOLLOW_selectItems_in_insertRTStmnt896);
			selectItems(iMeta);
			state._fsp--;

			// druidG.g:129:105: ( ( WS )? ',' ( WS )? selectItems[iMeta] )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==WS) ) {
					int LA75_1 = input.LA(2);
					if ( (LA75_1==90) ) {
						alt75=1;
					}

				}
				else if ( (LA75_0==90) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// druidG.g:129:106: ( WS )? ',' ( WS )? selectItems[iMeta]
					{
					// druidG.g:129:106: ( WS )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==WS) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// druidG.g:129:106: WS
							{
							match(input,WS,FOLLOW_WS_in_insertRTStmnt900); 
							}
							break;

					}

					match(input,90,FOLLOW_90_in_insertRTStmnt903); 
					// druidG.g:129:114: ( WS )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==WS) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// druidG.g:129:114: WS
							{
							match(input,WS,FOLLOW_WS_in_insertRTStmnt905); 
							}
							break;

					}

					pushFollow(FOLLOW_selectItems_in_insertRTStmnt908);
					selectItems(iMeta);
					state._fsp--;

					}
					break;

				default :
					break loop75;
				}
			}

			// druidG.g:129:139: ( WS )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==WS) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// druidG.g:129:139: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt913); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_insertRTStmnt916); 
			// druidG.g:129:150: ( WS )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==WS) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// druidG.g:129:150: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt918); 
					}
					break;

			}

			}

			match(input,VALUES,FOLLOW_VALUES_in_insertRTStmnt924); 
			// druidG.g:130:10: ( WS )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==WS) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// druidG.g:130:10: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt926); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_insertRTStmnt929); 
			// druidG.g:130:21: ( WS )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==WS) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// druidG.g:130:21: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt931); 
					}
					break;

			}

			// druidG.g:130:25: (a= anyValue )
			// druidG.g:130:26: a= anyValue
			{
			pushFollow(FOLLOW_anyValue_in_insertRTStmnt937);
			a=anyValue();
			state._fsp--;

			iMeta.values.add(a);
			}

			// druidG.g:130:62: ( ( WS )? ',' ( WS )? a= anyValue )*
			loop82:
			while (true) {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( (LA82_0==WS) ) {
					int LA82_1 = input.LA(2);
					if ( (LA82_1==90) ) {
						alt82=1;
					}

				}
				else if ( (LA82_0==90) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// druidG.g:130:63: ( WS )? ',' ( WS )? a= anyValue
					{
					// druidG.g:130:63: ( WS )?
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==WS) ) {
						alt80=1;
					}
					switch (alt80) {
						case 1 :
							// druidG.g:130:63: WS
							{
							match(input,WS,FOLLOW_WS_in_insertRTStmnt944); 
							}
							break;

					}

					match(input,90,FOLLOW_90_in_insertRTStmnt947); 
					// druidG.g:130:71: ( WS )?
					int alt81=2;
					int LA81_0 = input.LA(1);
					if ( (LA81_0==WS) ) {
						alt81=1;
					}
					switch (alt81) {
						case 1 :
							// druidG.g:130:71: WS
							{
							match(input,WS,FOLLOW_WS_in_insertRTStmnt949); 
							}
							break;

					}

					pushFollow(FOLLOW_anyValue_in_insertRTStmnt954);
					a=anyValue();
					state._fsp--;

					iMeta.values.add(a);
					}
					break;

				default :
					break loop82;
				}
			}

			// druidG.g:130:111: ( WS )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==WS) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// druidG.g:130:111: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt960); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_insertRTStmnt963); 
			// druidG.g:130:122: ( WS )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==WS) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// druidG.g:130:122: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt965); 
					}
					break;

			}

			// druidG.g:131:3: ( WHERE WS i= intervalClause )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==WHERE) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// druidG.g:131:4: WHERE WS i= intervalClause
					{
					match(input,WHERE,FOLLOW_WHERE_in_insertRTStmnt971); 
					match(input,WS,FOLLOW_WS_in_insertRTStmnt973); 
					pushFollow(FOLLOW_intervalClause_in_insertRTStmnt977);
					i=intervalClause();
					state._fsp--;

					}
					break;

			}

			// druidG.g:132:4: ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==WS) ) {
				int LA86_1 = input.LA(2);
				if ( (LA86_1==BREAK) ) {
					alt86=1;
				}
			}
			switch (alt86) {
				case 1 :
					// druidG.g:132:5: WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt985); 
					match(input,BREAK,FOLLOW_BREAK_in_insertRTStmnt987); 
					match(input,WS,FOLLOW_WS_in_insertRTStmnt989); 
					match(input,BY,FOLLOW_BY_in_insertRTStmnt991); 
					match(input,WS,FOLLOW_WS_in_insertRTStmnt993); 
					gran=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertRTStmnt997); 
					 iMeta.granularitySpec = new GranularitySpec(unquote((gran!=null?gran.getText():null)));
					}
					break;

			}

			 // We set this later after granularitySpec object is fully formed.
				  if (i!= null && !i.isEmpty()) {
				     iMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
				  }
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return iMeta;
	}
	// $ANTLR end "insertRTStmnt"



	// $ANTLR start "grandQuery"
	// druidG.g:140:1: grandQuery returns [QueryProgram program] : (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )? ;
	public final QueryProgram grandQuery() throws RecognitionException {
		QueryProgram program = null;


		Token j=null;
		Token a=null;
		QueryMeta s1 =null;
		QueryMeta s2 =null;

		 program = null; 
		try {
			// druidG.g:142:2: ( (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )? )
			// druidG.g:142:4: (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )?
			{
			// druidG.g:142:4: (s1= queryStmnt )
			// druidG.g:142:5: s1= queryStmnt
			{
			pushFollow(FOLLOW_queryStmnt_in_grandQuery1031);
			s1=queryStmnt();
			state._fsp--;

			}

			 program = new QueryProgram();program.addStmnt(s1); 
			// druidG.g:143:4: ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==WS) ) {
				int LA97_1 = input.LA(2);
				if ( (LA97_1==JOIN||LA97_1==LEFT_JOIN||LA97_1==RIGHT_JOIN) ) {
					alt97=1;
				}
			}
			switch (alt97) {
				case 1 :
					// druidG.g:143:5: WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN
					{
					match(input,WS,FOLLOW_WS_in_grandQuery1041); 
					j=input.LT(1);
					if ( input.LA(1)==JOIN||input.LA(1)==LEFT_JOIN||input.LA(1)==RIGHT_JOIN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					program.addJoinType((j!=null?j.getText():null).toUpperCase());
					// druidG.g:145:5: ( WS )?
					int alt87=2;
					int LA87_0 = input.LA(1);
					if ( (LA87_0==WS) ) {
						alt87=1;
					}
					switch (alt87) {
						case 1 :
							// druidG.g:145:5: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1066); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_grandQuery1069); 
					// druidG.g:145:16: ( WS )?
					int alt88=2;
					int LA88_0 = input.LA(1);
					if ( (LA88_0==WS) ) {
						alt88=1;
					}
					switch (alt88) {
						case 1 :
							// druidG.g:145:16: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1071); 
							}
							break;

					}

					// druidG.g:145:20: (s2= queryStmnt )
					// druidG.g:145:21: s2= queryStmnt
					{
					pushFollow(FOLLOW_queryStmnt_in_grandQuery1077);
					s2=queryStmnt();
					state._fsp--;

					}

					program.addStmnt(s2);
					// druidG.g:145:60: ( WS )?
					int alt89=2;
					int LA89_0 = input.LA(1);
					if ( (LA89_0==WS) ) {
						alt89=1;
					}
					switch (alt89) {
						case 1 :
							// druidG.g:145:60: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1082); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_grandQuery1085); 
					// druidG.g:145:71: ( WS )?
					int alt90=2;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==WS) ) {
						alt90=1;
					}
					switch (alt90) {
						case 1 :
							// druidG.g:145:71: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1087); 
							}
							break;

					}

					match(input,ON,FOLLOW_ON_in_grandQuery1090); 
					// druidG.g:146:5: ( WS )?
					int alt91=2;
					int LA91_0 = input.LA(1);
					if ( (LA91_0==WS) ) {
						alt91=1;
					}
					switch (alt91) {
						case 1 :
							// druidG.g:146:5: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1097); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_grandQuery1100); 
					// druidG.g:146:16: ( WS )?
					int alt92=2;
					int LA92_0 = input.LA(1);
					if ( (LA92_0==WS) ) {
						alt92=1;
					}
					switch (alt92) {
						case 1 :
							// druidG.g:146:16: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1102); 
							}
							break;

					}

					// druidG.g:146:20: (a= ID )
					// druidG.g:146:21: a= ID
					{
					a=(Token)match(input,ID,FOLLOW_ID_in_grandQuery1108); 
					 program.addJoinHook((a!=null?a.getText():null)); 
					}

					// druidG.g:146:60: ( ( WS )? ',' ( WS )? a= ID )*
					loop95:
					while (true) {
						int alt95=2;
						int LA95_0 = input.LA(1);
						if ( (LA95_0==WS) ) {
							int LA95_1 = input.LA(2);
							if ( (LA95_1==90) ) {
								alt95=1;
							}

						}
						else if ( (LA95_0==90) ) {
							alt95=1;
						}

						switch (alt95) {
						case 1 :
							// druidG.g:146:61: ( WS )? ',' ( WS )? a= ID
							{
							// druidG.g:146:61: ( WS )?
							int alt93=2;
							int LA93_0 = input.LA(1);
							if ( (LA93_0==WS) ) {
								alt93=1;
							}
							switch (alt93) {
								case 1 :
									// druidG.g:146:61: WS
									{
									match(input,WS,FOLLOW_WS_in_grandQuery1113); 
									}
									break;

							}

							match(input,90,FOLLOW_90_in_grandQuery1116); 
							// druidG.g:146:69: ( WS )?
							int alt94=2;
							int LA94_0 = input.LA(1);
							if ( (LA94_0==WS) ) {
								alt94=1;
							}
							switch (alt94) {
								case 1 :
									// druidG.g:146:69: WS
									{
									match(input,WS,FOLLOW_WS_in_grandQuery1118); 
									}
									break;

							}

							a=(Token)match(input,ID,FOLLOW_ID_in_grandQuery1123); 
							 program.addJoinHook((a!=null?a.getText():null)); 
							}
							break;

						default :
							break loop95;
						}
					}

					// druidG.g:146:114: ( WS )?
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==WS) ) {
						alt96=1;
					}
					switch (alt96) {
						case 1 :
							// druidG.g:146:114: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1129); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_grandQuery1132); 
					}
					break;

			}

			// druidG.g:148:4: ( WS )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==WS) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// druidG.g:148:4: WS
					{
					match(input,WS,FOLLOW_WS_in_grandQuery1151); 
					}
					break;

			}

			// druidG.g:148:8: ( OPT_SEMI_COLON )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==OPT_SEMI_COLON) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// druidG.g:148:8: OPT_SEMI_COLON
					{
					match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_grandQuery1154); 
					}
					break;

			}


			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return program;
	}
	// $ANTLR end "grandQuery"



	// $ANTLR start "queryStmnt"
	// druidG.g:151:1: queryStmnt returns [QueryMeta qMeta] : SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )? ;
	public final QueryMeta queryStmnt() throws RecognitionException {
		QueryMeta qMeta = null;


		Token id=null;
		Token dir=null;
		Token l=null;
		Token s1=null;
		Token s2=null;
		Token s=null;
		Pair<Granularity, List<Pair<Integer, Integer>>> gran =null;
		Having h =null;
		PostAggItem p =null;

		 qMeta = GroupByQueryMeta.promote(new QueryMeta());
			((BaseAggQueryMeta)qMeta).aggregations = new ArrayList<>();
			qMeta.intervals = new ArrayList<>();
		      
		try {
			// druidG.g:156:2: ( SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )? )
			// druidG.g:156:4: SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )?
			{
			match(input,SELECT,FOLLOW_SELECT_in_queryStmnt1177); 
			// druidG.g:157:7: ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )?
			int alt103=3;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==WS) ) {
				int LA103_1 = input.LA(2);
				if ( (LA103_1==89) ) {
					alt103=2;
				}
				else if ( (LA103_1==COUNT||LA103_1==DOUBLE_SUM||LA103_1==ID||LA103_1==JAVASCRIPT||LA103_1==LONG_SUM||LA103_1==MAX||LA103_1==MIN||LA103_1==UNIQUE) ) {
					alt103=1;
				}
			}
			switch (alt103) {
				case 1 :
					// druidG.g:158:8: ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
					{
					// druidG.g:158:8: ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
					// druidG.g:159:9: WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt1205); 
					pushFollow(FOLLOW_selectItems_in_queryStmnt1207);
					selectItems(qMeta);
					state._fsp--;

					// druidG.g:159:31: ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
					loop102:
					while (true) {
						int alt102=2;
						int LA102_0 = input.LA(1);
						if ( (LA102_0==WS) ) {
							int LA102_1 = input.LA(2);
							if ( (LA102_1==90) ) {
								alt102=1;
							}

						}
						else if ( (LA102_0==90) ) {
							alt102=1;
						}

						switch (alt102) {
						case 1 :
							// druidG.g:159:32: ( WS )? ',' ( WS )? selectItems[qMeta]
							{
							// druidG.g:159:32: ( WS )?
							int alt100=2;
							int LA100_0 = input.LA(1);
							if ( (LA100_0==WS) ) {
								alt100=1;
							}
							switch (alt100) {
								case 1 :
									// druidG.g:159:32: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1211); 
									}
									break;

							}

							match(input,90,FOLLOW_90_in_queryStmnt1214); 
							// druidG.g:159:40: ( WS )?
							int alt101=2;
							int LA101_0 = input.LA(1);
							if ( (LA101_0==WS) ) {
								alt101=1;
							}
							switch (alt101) {
								case 1 :
									// druidG.g:159:40: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1216); 
									}
									break;

							}

							pushFollow(FOLLOW_selectItems_in_queryStmnt1219);
							selectItems(qMeta);
							state._fsp--;

							}
							break;

						default :
							break loop102;
						}
					}

					}

					}
					break;
				case 2 :
					// druidG.g:162:8: ( WS '*' )
					{
					// druidG.g:162:8: ( WS '*' )
					// druidG.g:162:9: WS '*'
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt1250); 
					match(input,89,FOLLOW_89_in_queryStmnt1252); 
					}

					}
					break;

			}

			match(input,WS,FOLLOW_WS_in_queryStmnt1267); 
			match(input,FROM,FOLLOW_FROM_in_queryStmnt1269); 
			match(input,WS,FOLLOW_WS_in_queryStmnt1271); 
			id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt1275); 
			 
				  	qMeta.dataSource = (id!=null?id.getText():null); 
			  	  	if (((BaseAggQueryMeta)qMeta).aggregations.isEmpty()) {
				  		qMeta = SelectQueryMeta.promote(qMeta);
				  	}
				    
			// druidG.g:171:2: ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==WS) ) {
				int LA128_1 = input.LA(2);
				if ( (LA128_1==WHERE) ) {
					alt128=1;
				}
			}
			switch (alt128) {
				case 1 :
					// druidG.g:172:4: WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt1291); 
					match(input,WHERE,FOLLOW_WHERE_in_queryStmnt1293); 
					match(input,WS,FOLLOW_WS_in_queryStmnt1295); 
					pushFollow(FOLLOW_whereClause_in_queryStmnt1297);
					whereClause(qMeta);
					state._fsp--;

					// druidG.g:173:4: ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? )
					// druidG.g:174:5: ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )?
					{
					// druidG.g:174:5: ( WS BREAK WS BY WS gran= granularityClause )?
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==WS) ) {
						int LA104_1 = input.LA(2);
						if ( (LA104_1==BREAK) ) {
							alt104=1;
						}
					}
					switch (alt104) {
						case 1 :
							// druidG.g:174:6: WS BREAK WS BY WS gran= granularityClause
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1315); 
							match(input,BREAK,FOLLOW_BREAK_in_queryStmnt1317); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1319); 
							match(input,BY,FOLLOW_BY_in_queryStmnt1321); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1323); 
							pushFollow(FOLLOW_granularityClause_in_queryStmnt1327);
							gran=granularityClause();
							state._fsp--;


									      qMeta.granularity = gran.a;
									      if (gran.b != null) {
									        qMeta.microIntervals.addAll(gran.b);
									      }
									    
							}
							break;

					}

					// druidG.g:181:5: ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )?
					int alt109=2;
					int LA109_0 = input.LA(1);
					if ( (LA109_0==WS) ) {
						int LA109_1 = input.LA(2);
						if ( (LA109_1==GROUP) ) {
							alt109=1;
						}
					}
					switch (alt109) {
						case 1 :
							// druidG.g:181:6: WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )?
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1344); 
							match(input,GROUP,FOLLOW_GROUP_in_queryStmnt1346); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1348); 
							match(input,BY,FOLLOW_BY_in_queryStmnt1350); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1352); 

									       qMeta = GroupByQueryMeta.promote(qMeta);
									       if (((GroupByQueryMeta)qMeta).fetchDimensions == null) {
									          System.err.println("No dimensions !! ");
									       }
									      
							// druidG.g:188:10: (id= ID ( ( WS )? ',' ( WS )? id= ID )* )
							// druidG.g:188:11: id= ID ( ( WS )? ',' ( WS )? id= ID )*
							{
							id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt1378); 

									              if (!((GroupByQueryMeta)qMeta).checkDimOrAlias((id!=null?id.getText():null))) {
									                 System.err.println("Dimension/Alias " + (id!=null?id.getText():null) + " not valid..");
									              }   
									           
							// druidG.g:194:14: ( ( WS )? ',' ( WS )? id= ID )*
							loop107:
							while (true) {
								int alt107=2;
								int LA107_0 = input.LA(1);
								if ( (LA107_0==WS) ) {
									int LA107_1 = input.LA(2);
									if ( (LA107_1==90) ) {
										alt107=1;
									}

								}
								else if ( (LA107_0==90) ) {
									alt107=1;
								}

								switch (alt107) {
								case 1 :
									// druidG.g:194:15: ( WS )? ',' ( WS )? id= ID
									{
									// druidG.g:194:15: ( WS )?
									int alt105=2;
									int LA105_0 = input.LA(1);
									if ( (LA105_0==WS) ) {
										alt105=1;
									}
									switch (alt105) {
										case 1 :
											// druidG.g:194:15: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt1410); 
											}
											break;

									}

									match(input,90,FOLLOW_90_in_queryStmnt1413); 
									// druidG.g:194:23: ( WS )?
									int alt106=2;
									int LA106_0 = input.LA(1);
									if ( (LA106_0==WS) ) {
										alt106=1;
									}
									switch (alt106) {
										case 1 :
											// druidG.g:194:23: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt1415); 
											}
											break;

									}

									id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt1420); 

												              if (!((GroupByQueryMeta)qMeta).checkDimOrAlias((id!=null?id.getText():null))) {
												                 System.err.println("Dimension/Alias " + (id!=null?id.getText():null) + " not valid..");
												              }   
											           	
									}
									break;

								default :
									break loop107;
								}
							}

							}

							// druidG.g:202:10: ( WS HAVING WS h= havingClause )?
							int alt108=2;
							int LA108_0 = input.LA(1);
							if ( (LA108_0==WS) ) {
								int LA108_1 = input.LA(2);
								if ( (LA108_1==HAVING) ) {
									alt108=1;
								}
							}
							switch (alt108) {
								case 1 :
									// druidG.g:202:11: WS HAVING WS h= havingClause
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1477); 
									match(input,HAVING,FOLLOW_HAVING_in_queryStmnt1479); 
									match(input,WS,FOLLOW_WS_in_queryStmnt1481); 
									pushFollow(FOLLOW_havingClause_in_queryStmnt1485);
									h=havingClause();
									state._fsp--;

									((GroupByQueryMeta)qMeta).having = h;
									}
									break;

							}

							}
							break;

					}

					qMeta = QueryUtils.checkAndPromoteToTimeSeries(qMeta);
					// druidG.g:206:5: ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )?
					int alt111=2;
					int LA111_0 = input.LA(1);
					if ( (LA111_0==WS) ) {
						int LA111_1 = input.LA(2);
						if ( (LA111_1==ORDER) ) {
							alt111=1;
						}
					}
					switch (alt111) {
						case 1 :
							// druidG.g:206:6: WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )?
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1529); 
							match(input,ORDER,FOLLOW_ORDER_in_queryStmnt1531); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1533); 
							match(input,BY,FOLLOW_BY_in_queryStmnt1535); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1537); 
							// druidG.g:206:24: (id= ID )
							// druidG.g:206:25: id= ID
							{
							id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt1542); 
							}

								
									  	if (((PlainDimQueryMeta)qMeta).fetchDimensions.size() != 1) {
										   ((GroupByQueryMeta)qMeta).limitSpec = new LimitSpec();
										   
									  	} else {// If fetchDimensions = 1 then TopN is more optimal.
									           qMeta = TopNQueryMeta.promote(qMeta);
								        	   ((TopNQueryMeta)qMeta).metric = (id!=null?id.getText():null);
									      	}
									      
							// druidG.g:217:9: ( WS dir= ( ASC | DESC ) )?
							int alt110=2;
							int LA110_0 = input.LA(1);
							if ( (LA110_0==WS) ) {
								int LA110_1 = input.LA(2);
								if ( (LA110_1==ASC||LA110_1==DESC) ) {
									alt110=1;
								}
							}
							switch (alt110) {
								case 1 :
									// druidG.g:217:10: WS dir= ( ASC | DESC )
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1575); 
									dir=input.LT(1);
									if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
										input.consume();
										state.errorRecovery=false;
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									 
											        if (qMeta instanceof GroupByQueryMeta && ((GroupByQueryMeta)qMeta).limitSpec != null) {
												    if (dir != null && (dir!=null?dir.getText():null) != null) {
												        ((GroupByQueryMeta)qMeta).limitSpec.addColumn((id!=null?id.getText():null), (dir!=null?dir.getText():null));
												    } else {
												    	((GroupByQueryMeta)qMeta).limitSpec.addColumn((id!=null?id.getText():null), "ASC");
												    }
											      	}
											      
									}
									break;

							}


										    // At this point if the qMeta is not TopN and is still GroupBy then do the following(default is ascending sort).
										    if (qMeta instanceof GroupByQueryMeta && ((GroupByQueryMeta)qMeta).limitSpec != null) {
										       if (!((GroupByQueryMeta)qMeta).limitSpec.columns.containsKey((id!=null?id.getText():null))) {
										       	   ((GroupByQueryMeta)qMeta).limitSpec.addColumn((id!=null?id.getText():null), "ASC");
										       }
										       
										    }

										
							}
							break;

					}

					// druidG.g:238:5: ( WS LIMIT WS (l= LONG ) )?
					int alt112=2;
					int LA112_0 = input.LA(1);
					if ( (LA112_0==WS) ) {
						int LA112_1 = input.LA(2);
						if ( (LA112_1==LIMIT) ) {
							alt112=1;
						}
					}
					switch (alt112) {
						case 1 :
							// druidG.g:239:6: WS LIMIT WS (l= LONG )
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1629); 
							match(input,LIMIT,FOLLOW_LIMIT_in_queryStmnt1631); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1633); 
							// druidG.g:239:18: (l= LONG )
							// druidG.g:239:19: l= LONG
							{
							l=(Token)match(input,LONG,FOLLOW_LONG_in_queryStmnt1638); 
							}

								
									  	if (qMeta instanceof SelectQueryMeta) {
										    ((SelectQueryMeta)qMeta).pagingSpec.threshold = Integer.valueOf((l!=null?l.getText():null));	      	
									      	} else if (qMeta instanceof TopNQueryMeta) {
									      	    ((TopNQueryMeta)qMeta).threshold = Integer.valueOf((l!=null?l.getText():null));
									      	} else if (((PlainDimQueryMeta)qMeta).fetchDimensions.size() != 1) {
									      	    if (((GroupByQueryMeta)qMeta).limitSpec != null) {
									      	        ((GroupByQueryMeta)qMeta).limitSpec.limit = Long.valueOf((l!=null?l.getText():null));
									      	    }
									      	}
									      
							}
							break;

					}

					// druidG.g:253:7: ( WS THEN WS p= postAggItem )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==WS) ) {
						int LA113_1 = input.LA(2);
						if ( (LA113_1==THEN) ) {
							alt113=1;
						}
					}
					switch (alt113) {
						case 1 :
							// druidG.g:253:8: WS THEN WS p= postAggItem
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1676); 
							match(input,THEN,FOLLOW_THEN_in_queryStmnt1678); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1680); 
							pushFollow(FOLLOW_postAggItem_in_queryStmnt1684);
							p=postAggItem();
							state._fsp--;

							QueryUtils.setPostAggregation(qMeta, p);
							}
							break;

					}

					}

					// druidG.g:255:4: ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )?
					int alt123=2;
					int LA123_0 = input.LA(1);
					if ( (LA123_0==WS) ) {
						int LA123_1 = input.LA(2);
						if ( (LA123_1==WHICH) ) {
							alt123=1;
						}
					}
					switch (alt123) {
						case 1 :
							// druidG.g:255:5: WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1699); 
							match(input,WHICH,FOLLOW_WHICH_in_queryStmnt1701); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1703); 
							match(input,CONTAINS,FOLLOW_CONTAINS_in_queryStmnt1705); 
							qMeta = SearchQueryMeta.promote(qMeta);
							// druidG.g:255:68: ( WS )?
							int alt114=2;
							int LA114_0 = input.LA(1);
							if ( (LA114_0==WS) ) {
								alt114=1;
							}
							switch (alt114) {
								case 1 :
									// druidG.g:255:68: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1709); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_queryStmnt1712); 
							// druidG.g:255:79: ( WS )?
							int alt115=2;
							int LA115_0 = input.LA(1);
							if ( (LA115_0==WS) ) {
								alt115=1;
							}
							switch (alt115) {
								case 1 :
									// druidG.g:255:79: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1714); 
									}
									break;

							}

							// druidG.g:255:83: (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* )
							// druidG.g:255:84: s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
							{
							s1=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1720); 
							((SearchQueryMeta)qMeta).type = "insensitive_contains";((SearchQueryMeta)qMeta).addValue((s1!=null?s1.getText():null));
							// druidG.g:255:208: ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
							loop118:
							while (true) {
								int alt118=2;
								int LA118_0 = input.LA(1);
								if ( (LA118_0==WS) ) {
									int LA118_1 = input.LA(2);
									if ( (LA118_1==90) ) {
										alt118=1;
									}

								}
								else if ( (LA118_0==90) ) {
									alt118=1;
								}

								switch (alt118) {
								case 1 :
									// druidG.g:255:209: ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING
									{
									// druidG.g:255:209: ( WS )?
									int alt116=2;
									int LA116_0 = input.LA(1);
									if ( (LA116_0==WS) ) {
										alt116=1;
									}
									switch (alt116) {
										case 1 :
											// druidG.g:255:209: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt1724); 
											}
											break;

									}

									match(input,90,FOLLOW_90_in_queryStmnt1727); 
									// druidG.g:255:217: ( WS )?
									int alt117=2;
									int LA117_0 = input.LA(1);
									if ( (LA117_0==WS) ) {
										alt117=1;
									}
									switch (alt117) {
										case 1 :
											// druidG.g:255:217: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt1729); 
											}
											break;

									}

									s2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1734); 
									((SearchQueryMeta)qMeta).type = "fragment";((SearchQueryMeta)qMeta).addValue((s2!=null?s2.getText():null));
									}
									break;

								default :
									break loop118;
								}
							}

							}

							// druidG.g:255:337: ( WS )?
							int alt119=2;
							int LA119_0 = input.LA(1);
							if ( (LA119_0==WS) ) {
								alt119=1;
							}
							switch (alt119) {
								case 1 :
									// druidG.g:255:337: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1741); 
									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_queryStmnt1744); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1750); 
							match(input,SORT,FOLLOW_SORT_in_queryStmnt1752); 
							// druidG.g:256:13: ( WS )?
							int alt120=2;
							int LA120_0 = input.LA(1);
							if ( (LA120_0==WS) ) {
								alt120=1;
							}
							switch (alt120) {
								case 1 :
									// druidG.g:256:13: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1754); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_queryStmnt1757); 
							// druidG.g:256:24: ( WS )?
							int alt121=2;
							int LA121_0 = input.LA(1);
							if ( (LA121_0==WS) ) {
								alt121=1;
							}
							switch (alt121) {
								case 1 :
									// druidG.g:256:24: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1759); 
									}
									break;

							}

							// druidG.g:256:28: (s= SINGLE_QUOTE_STRING )
							// druidG.g:256:29: s= SINGLE_QUOTE_STRING
							{
							s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1765); 
							}

							((SearchQueryMeta)qMeta).setSort((s!=null?s.getText():null));
							// druidG.g:256:97: ( WS )?
							int alt122=2;
							int LA122_0 = input.LA(1);
							if ( (LA122_0==WS) ) {
								alt122=1;
							}
							switch (alt122) {
								case 1 :
									// druidG.g:256:97: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1770); 
									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_queryStmnt1773); 
							}
							break;

					}

					// druidG.g:258:4: ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
					int alt127=2;
					int LA127_0 = input.LA(1);
					if ( (LA127_0==WS) ) {
						int LA127_1 = input.LA(2);
						if ( (LA127_1==HINT) ) {
							alt127=1;
						}
					}
					switch (alt127) {
						case 1 :
							// druidG.g:258:5: WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1785); 
							match(input,HINT,FOLLOW_HINT_in_queryStmnt1787); 
							// druidG.g:258:13: ( WS )?
							int alt124=2;
							int LA124_0 = input.LA(1);
							if ( (LA124_0==WS) ) {
								alt124=1;
							}
							switch (alt124) {
								case 1 :
									// druidG.g:258:13: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1789); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_queryStmnt1792); 
							// druidG.g:258:24: ( WS )?
							int alt125=2;
							int LA125_0 = input.LA(1);
							if ( (LA125_0==WS) ) {
								alt125=1;
							}
							switch (alt125) {
								case 1 :
									// druidG.g:258:24: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1794); 
									}
									break;

							}

							s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1799); 
							qMeta = HintProcessor.process(qMeta, (s!=null?s.getText():null));
							// druidG.g:258:99: ( WS )?
							int alt126=2;
							int LA126_0 = input.LA(1);
							if ( (LA126_0==WS) ) {
								alt126=1;
							}
							switch (alt126) {
								case 1 :
									// druidG.g:258:99: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1803); 
									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_queryStmnt1806); 
							}
							break;

					}

					}
					break;

			}


				  	if (qMeta.intervals == null || qMeta.intervals.isEmpty()) {
				  		qMeta = TimeBoundaryQueryMeta.promote(qMeta);
				  	}
				  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return qMeta;
	}
	// $ANTLR end "queryStmnt"



	// $ANTLR start "anyValue"
	// druidG.g:268:1: anyValue returns [Object obj] : (a= SINGLE_QUOTE_STRING |b= ( LONG | FLOAT ) );
	public final Object anyValue() throws RecognitionException {
		Object obj = null;


		Token a=null;
		Token b=null;

		try {
			// druidG.g:269:2: (a= SINGLE_QUOTE_STRING |b= ( LONG | FLOAT ) )
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==SINGLE_QUOTE_STRING) ) {
				alt129=1;
			}
			else if ( (LA129_0==FLOAT||LA129_0==LONG) ) {
				alt129=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 129, 0, input);
				throw nvae;
			}

			switch (alt129) {
				case 1 :
					// druidG.g:269:3: a= SINGLE_QUOTE_STRING
					{
					a=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_anyValue1840); 
					obj = unquote((a!=null?a.getText():null));
					}
					break;
				case 2 :
					// druidG.g:269:53: b= ( LONG | FLOAT )
					{
					b=input.LT(1);
					if ( input.LA(1)==FLOAT||input.LA(1)==LONG ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					obj = (b!=null?b.getText():null);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return obj;
	}
	// $ANTLR end "anyValue"



	// $ANTLR start "selectItems"
	// druidG.g:272:1: selectItems[BaseStatementMeta meta] : (ai= aggItem |sd= simpleDim );
	public final void selectItems(BaseStatementMeta meta) throws RecognitionException {
		AggItem ai =null;
		Pair<String, String> sd =null;

		try {
			// druidG.g:273:2: (ai= aggItem |sd= simpleDim )
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==COUNT||LA130_0==DOUBLE_SUM||LA130_0==JAVASCRIPT||LA130_0==LONG_SUM||LA130_0==MAX||LA130_0==MIN||LA130_0==UNIQUE) ) {
				alt130=1;
			}
			else if ( (LA130_0==ID) ) {
				alt130=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 130, 0, input);
				throw nvae;
			}

			switch (alt130) {
				case 1 :
					// druidG.g:273:5: ai= aggItem
					{
					pushFollow(FOLLOW_aggItem_in_selectItems1871);
					ai=aggItem();
					state._fsp--;

					 
						      if (meta instanceof QueryMeta) {
						        ((BaseAggQueryMeta)meta).aggregations.add(ai);
						      } else if (meta instanceof InsertMeta) {
					 	        ((InsertMeta)meta).aggregations.add(ai);
						      }
						   
					}
					break;
				case 2 :
					// druidG.g:280:5: sd= simpleDim
					{
					pushFollow(FOLLOW_simpleDim_in_selectItems1881);
					sd=simpleDim();
					state._fsp--;

					 
						      if (meta instanceof QueryMeta) {
						         ((PlainDimQueryMeta)meta).fetchDimensions.put(sd.a, sd.b);
						      } else if (meta instanceof InsertMeta) {
					 	         ((InsertMeta)meta).fetchDimensions.put(sd.a, sd.b);
						      }
						   
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "selectItems"



	// $ANTLR start "simpleDim"
	// druidG.g:289:1: simpleDim returns [Pair<String, String> dims] : (a= ID ( WS AS WS b= ID )? ) ;
	public final Pair<String, String> simpleDim() throws RecognitionException {
		Pair<String, String> dims = null;


		Token a=null;
		Token b=null;

		try {
			// druidG.g:290:2: ( (a= ID ( WS AS WS b= ID )? ) )
			// druidG.g:290:4: (a= ID ( WS AS WS b= ID )? )
			{
			// druidG.g:290:4: (a= ID ( WS AS WS b= ID )? )
			// druidG.g:290:5: a= ID ( WS AS WS b= ID )?
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_simpleDim1901); 
			// druidG.g:290:10: ( WS AS WS b= ID )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==WS) ) {
				int LA131_1 = input.LA(2);
				if ( (LA131_1==AS) ) {
					alt131=1;
				}
			}
			switch (alt131) {
				case 1 :
					// druidG.g:290:11: WS AS WS b= ID
					{
					match(input,WS,FOLLOW_WS_in_simpleDim1904); 
					match(input,AS,FOLLOW_AS_in_simpleDim1906); 
					match(input,WS,FOLLOW_WS_in_simpleDim1908); 
					b=(Token)match(input,ID,FOLLOW_ID_in_simpleDim1912); 
					}
					break;

			}


				     dims = (b != null)? new Pair<String, String>((a!=null?a.getText():null), (b!=null?b.getText():null)): new Pair<String, String>((a!=null?a.getText():null), null);
				   
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dims;
	}
	// $ANTLR end "simpleDim"



	// $ANTLR start "whereClause"
	// druidG.g:297:1: whereClause[QueryMeta qMeta] : intls= intervalClause ( WS AND WS f= grandFilter )? ;
	public final void whereClause(QueryMeta qMeta) throws RecognitionException {
		List<Interval> intls =null;
		Filter f =null;

		try {
			// druidG.g:298:2: (intls= intervalClause ( WS AND WS f= grandFilter )? )
			// druidG.g:298:3: intls= intervalClause ( WS AND WS f= grandFilter )?
			{
			pushFollow(FOLLOW_intervalClause_in_whereClause1935);
			intls=intervalClause();
			state._fsp--;

			qMeta.intervals.addAll(intls);
			// druidG.g:298:57: ( WS AND WS f= grandFilter )?
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==WS) ) {
				int LA132_1 = input.LA(2);
				if ( (LA132_1==AND) ) {
					alt132=1;
				}
			}
			switch (alt132) {
				case 1 :
					// druidG.g:298:58: WS AND WS f= grandFilter
					{
					match(input,WS,FOLLOW_WS_in_whereClause1940); 
					match(input,AND,FOLLOW_AND_in_whereClause1942); 
					match(input,WS,FOLLOW_WS_in_whereClause1944); 
					pushFollow(FOLLOW_grandFilter_in_whereClause1948);
					f=grandFilter();
					state._fsp--;

					qMeta.filter = f;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "whereClause"



	// $ANTLR start "intervalClause"
	// druidG.g:302:1: intervalClause returns [List<Interval> intervals] : 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) ;
	public final List<Interval> intervalClause() throws RecognitionException {
		List<Interval> intervals = null;


		Token st2=null;
		Token et2=null;
		ParserRuleReturnScope st =null;
		ParserRuleReturnScope et =null;
		Pair<String, String> p1 =null;
		Pair<String, String> p2 =null;

		 intervals = new ArrayList<>();
		try {
			// druidG.g:304:2: ( 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) )
			// druidG.g:304:4: 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
			{
			match(input,91,FOLLOW_91_in_intervalClause1974); 
			match(input,WS,FOLLOW_WS_in_intervalClause1976); 
			match(input,BETWEEN,FOLLOW_BETWEEN_in_intervalClause1978); 
			match(input,WS,FOLLOW_WS_in_intervalClause1980); 
			// druidG.g:305:2: ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( ((LA140_0 >= DATE && LA140_0 <= DATE_YEAR_ONLY)||LA140_0==SINGLE_QUOTE_STRING) ) {
				alt140=1;
			}
			else if ( (LA140_0==LPARAN) ) {
				alt140=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 140, 0, input);
				throw nvae;
			}

			switch (alt140) {
				case 1 :
					// druidG.g:306:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
					{
					// druidG.g:306:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
					// druidG.g:307:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
					{
					// druidG.g:307:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
					// druidG.g:307:7: (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING )
					{
					// druidG.g:307:7: (st= isoTime |st2= SINGLE_QUOTE_STRING )
					int alt133=2;
					int LA133_0 = input.LA(1);
					if ( ((LA133_0 >= DATE && LA133_0 <= DATE_YEAR_ONLY)) ) {
						alt133=1;
					}
					else if ( (LA133_0==SINGLE_QUOTE_STRING) ) {
						alt133=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 133, 0, input);
						throw nvae;
					}

					switch (alt133) {
						case 1 :
							// druidG.g:307:8: st= isoTime
							{
							pushFollow(FOLLOW_isoTime_in_intervalClause2000);
							st=isoTime();
							state._fsp--;

							}
							break;
						case 2 :
							// druidG.g:307:22: st2= SINGLE_QUOTE_STRING
							{
							st2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause2007); 
							}
							break;

					}

					match(input,WS,FOLLOW_WS_in_intervalClause2011); 
					match(input,AND,FOLLOW_AND_in_intervalClause2013); 
					match(input,WS,FOLLOW_WS_in_intervalClause2015); 
					// druidG.g:307:58: (et= isoTime |et2= SINGLE_QUOTE_STRING )
					int alt134=2;
					int LA134_0 = input.LA(1);
					if ( ((LA134_0 >= DATE && LA134_0 <= DATE_YEAR_ONLY)) ) {
						alt134=1;
					}
					else if ( (LA134_0==SINGLE_QUOTE_STRING) ) {
						alt134=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 134, 0, input);
						throw nvae;
					}

					switch (alt134) {
						case 1 :
							// druidG.g:307:59: et= isoTime
							{
							pushFollow(FOLLOW_isoTime_in_intervalClause2020);
							et=isoTime();
							state._fsp--;

							}
							break;
						case 2 :
							// druidG.g:307:73: et2= SINGLE_QUOTE_STRING
							{
							et2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause2027); 
							}
							break;

					}

					}

					  if (st2 != null) {
								if (et2 != null) {
									intervals.add(new Interval((st2!=null?st2.getText():null), (et2!=null?et2.getText():null)));
								} else {
									intervals.add(new Interval((st2!=null?st2.getText():null), (et!=null?input.toString(et.start,et.stop):null)));
								}
							   } else {
								if (et2 != null) {
									intervals.add(new Interval((st!=null?input.toString(st.start,st.stop):null), (et2!=null?et2.getText():null)));
								} else {
									intervals.add(new Interval((st!=null?input.toString(st.start,st.stop):null), (et!=null?input.toString(et.start,et.stop):null)));
								}
							   }
							
					}

					}
					break;
				case 2 :
					// druidG.g:324:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
					{
					// druidG.g:324:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
					// druidG.g:324:5: LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_intervalClause2053); 
					// druidG.g:324:12: ( WS )?
					int alt135=2;
					int LA135_0 = input.LA(1);
					if ( (LA135_0==WS) ) {
						alt135=1;
					}
					switch (alt135) {
						case 1 :
							// druidG.g:324:12: WS
							{
							match(input,WS,FOLLOW_WS_in_intervalClause2055); 
							}
							break;

					}

					pushFollow(FOLLOW_pairString_in_intervalClause2060);
					p1=pairString();
					state._fsp--;

					intervals.add(new Interval(p1.a, p1.b));
					// druidG.g:325:7: ( ( WS )? ',' ( WS )? p2= pairString )*
					loop138:
					while (true) {
						int alt138=2;
						int LA138_0 = input.LA(1);
						if ( (LA138_0==WS) ) {
							int LA138_1 = input.LA(2);
							if ( (LA138_1==90) ) {
								alt138=1;
							}

						}
						else if ( (LA138_0==90) ) {
							alt138=1;
						}

						switch (alt138) {
						case 1 :
							// druidG.g:325:8: ( WS )? ',' ( WS )? p2= pairString
							{
							// druidG.g:325:8: ( WS )?
							int alt136=2;
							int LA136_0 = input.LA(1);
							if ( (LA136_0==WS) ) {
								alt136=1;
							}
							switch (alt136) {
								case 1 :
									// druidG.g:325:8: WS
									{
									match(input,WS,FOLLOW_WS_in_intervalClause2072); 
									}
									break;

							}

							match(input,90,FOLLOW_90_in_intervalClause2075); 
							// druidG.g:325:16: ( WS )?
							int alt137=2;
							int LA137_0 = input.LA(1);
							if ( (LA137_0==WS) ) {
								alt137=1;
							}
							switch (alt137) {
								case 1 :
									// druidG.g:325:16: WS
									{
									match(input,WS,FOLLOW_WS_in_intervalClause2077); 
									}
									break;

							}

							pushFollow(FOLLOW_pairString_in_intervalClause2082);
							p2=pairString();
							state._fsp--;

							intervals.add(new Interval(p2.a, p2.b));
							}
							break;

						default :
							break loop138;
						}
					}

					// druidG.g:325:79: ( WS )?
					int alt139=2;
					int LA139_0 = input.LA(1);
					if ( (LA139_0==WS) ) {
						alt139=1;
					}
					switch (alt139) {
						case 1 :
							// druidG.g:325:79: WS
							{
							match(input,WS,FOLLOW_WS_in_intervalClause2088); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_intervalClause2091); 
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return intervals;
	}
	// $ANTLR end "intervalClause"



	// $ANTLR start "getEquals"
	// druidG.g:330:1: getEquals returns [EqualsToHolder holder] : (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) ;
	public final EqualsToHolder getEquals() throws RecognitionException {
		EqualsToHolder holder = null;


		Token a=null;
		Token b=null;

		try {
			// druidG.g:331:2: ( (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) )
			// druidG.g:331:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
			{
			// druidG.g:331:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
			// druidG.g:331:5: a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG )
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_getEquals2114); 
			// druidG.g:331:10: ( WS )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==WS) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// druidG.g:331:10: WS
					{
					match(input,WS,FOLLOW_WS_in_getEquals2116); 
					}
					break;

			}

			match(input,EQUALS,FOLLOW_EQUALS_in_getEquals2119); 
			// druidG.g:331:21: ( WS )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==WS) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// druidG.g:331:21: WS
					{
					match(input,WS,FOLLOW_WS_in_getEquals2121); 
					}
					break;

			}

			b=input.LT(1);
			if ( input.LA(1)==FLOAT||input.LA(1)==LONG||input.LA(1)==SINGLE_QUOTE_STRING ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			holder = new EqualsToHolder((a!=null?a.getText():null), (b!=null?b.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return holder;
	}
	// $ANTLR end "getEquals"



	// $ANTLR start "granularityClause"
	// druidG.g:336:1: granularityClause returns [Pair<Granularity, List<Pair<Integer, Integer>>> clause] : ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) ) );
	public final Pair<Granularity, List<Pair<Integer, Integer>>> granularityClause() throws RecognitionException {
		Pair<Granularity, List<Pair<Integer, Integer>>> clause = null;


		Token s=null;
		Token dur=null;
		Token orig=null;
		Token per=null;
		Token tz=null;
		List<Pair<Integer, Integer>> inc =null;

		Granularity granularity = new Granularity("all");clause = new Pair<>(granularity, null);
		try {
			// druidG.g:338:2: ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) ) )
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==SINGLE_QUOTE_STRING) ) {
				alt165=1;
			}
			else if ( (LA165_0==DURATION||LA165_0==PERIOD) ) {
				alt165=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 165, 0, input);
				throw nvae;
			}

			switch (alt165) {
				case 1 :
					// druidG.g:338:3: ( (s= SINGLE_QUOTE_STRING ) )
					{
					// druidG.g:338:3: ( (s= SINGLE_QUOTE_STRING ) )
					// druidG.g:338:4: (s= SINGLE_QUOTE_STRING )
					{
					// druidG.g:338:4: (s= SINGLE_QUOTE_STRING )
					// druidG.g:338:5: s= SINGLE_QUOTE_STRING
					{
					s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2166); 
					}

					granularity = new Granularity((s!=null?s.getText():null));clause = new Pair<>(granularity, null);
					}

					}
					break;
				case 2 :
					// druidG.g:340:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) )
					{
					// druidG.g:340:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) )
					int alt164=2;
					int LA164_0 = input.LA(1);
					if ( (LA164_0==DURATION) ) {
						alt164=1;
					}
					else if ( (LA164_0==PERIOD) ) {
						alt164=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 164, 0, input);
						throw nvae;
					}

					switch (alt164) {
						case 1 :
							// druidG.g:341:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							{
							// druidG.g:341:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							// druidG.g:341:7: DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN
							{
							match(input,DURATION,FOLLOW_DURATION_in_granularityClause2190); 
							// druidG.g:341:16: ( WS )?
							int alt143=2;
							int LA143_0 = input.LA(1);
							if ( (LA143_0==WS) ) {
								alt143=1;
							}
							switch (alt143) {
								case 1 :
									// druidG.g:341:16: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2192); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_granularityClause2195); 
							// druidG.g:341:27: ( WS )?
							int alt144=2;
							int LA144_0 = input.LA(1);
							if ( (LA144_0==WS) ) {
								alt144=1;
							}
							switch (alt144) {
								case 1 :
									// druidG.g:341:27: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2197); 
									}
									break;

							}

							dur=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2202); 
							granularity.setDuration((dur!=null?dur.getText():null));
							// druidG.g:341:93: ( WS )?
							int alt145=2;
							int LA145_0 = input.LA(1);
							if ( (LA145_0==WS) ) {
								alt145=1;
							}
							switch (alt145) {
								case 1 :
									// druidG.g:341:93: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2206); 
									}
									break;

							}

							// druidG.g:341:97: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
							int alt147=2;
							int LA147_0 = input.LA(1);
							if ( (LA147_0==90) ) {
								int LA147_1 = input.LA(2);
								if ( (LA147_1==WS) ) {
									int LA147_4 = input.LA(3);
									if ( (LA147_4==SINGLE_QUOTE_STRING) ) {
										alt147=1;
									}
								}
								else if ( (LA147_1==SINGLE_QUOTE_STRING) ) {
									alt147=1;
								}
							}
							switch (alt147) {
								case 1 :
									// druidG.g:341:98: ',' ( WS )? orig= SINGLE_QUOTE_STRING
									{
									match(input,90,FOLLOW_90_in_granularityClause2210); 
									// druidG.g:341:102: ( WS )?
									int alt146=2;
									int LA146_0 = input.LA(1);
									if ( (LA146_0==WS) ) {
										alt146=1;
									}
									switch (alt146) {
										case 1 :
											// druidG.g:341:102: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2212); 
											}
											break;

									}

									orig=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2217); 
									granularity.setOrigin((orig!=null?orig.getText():null));
									}
									break;

							}

							clause = new Pair<>(granularity, null);
							// druidG.g:341:211: ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )?
							int alt151=2;
							int LA151_0 = input.LA(1);
							if ( (LA151_0==WS||LA151_0==90) ) {
								alt151=1;
							}
							switch (alt151) {
								case 1 :
									// druidG.g:341:212: ( WS )? ',' ( WS )? inc= granularityInclude ( WS )?
									{
									// druidG.g:341:212: ( WS )?
									int alt148=2;
									int LA148_0 = input.LA(1);
									if ( (LA148_0==WS) ) {
										alt148=1;
									}
									switch (alt148) {
										case 1 :
											// druidG.g:341:212: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2225); 
											}
											break;

									}

									match(input,90,FOLLOW_90_in_granularityClause2228); 
									// druidG.g:341:220: ( WS )?
									int alt149=2;
									int LA149_0 = input.LA(1);
									if ( (LA149_0==WS) ) {
										int LA149_1 = input.LA(2);
										if ( (LA149_1==WS) ) {
											alt149=1;
										}
									}
									switch (alt149) {
										case 1 :
											// druidG.g:341:220: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2230); 
											}
											break;

									}

									pushFollow(FOLLOW_granularityInclude_in_granularityClause2235);
									inc=granularityInclude();
									state._fsp--;

									clause = new Pair<>(granularity, inc);
									// druidG.g:341:288: ( WS )?
									int alt150=2;
									int LA150_0 = input.LA(1);
									if ( (LA150_0==WS) ) {
										alt150=1;
									}
									switch (alt150) {
										case 1 :
											// druidG.g:341:288: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2239); 
											}
											break;

									}

									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_granularityClause2244); 
							}

							}
							break;
						case 2 :
							// druidG.g:343:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							{
							// druidG.g:343:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							// druidG.g:343:7: PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN
							{
							match(input,PERIOD,FOLLOW_PERIOD_in_granularityClause2263); 
							// druidG.g:343:14: ( WS )?
							int alt152=2;
							int LA152_0 = input.LA(1);
							if ( (LA152_0==WS) ) {
								alt152=1;
							}
							switch (alt152) {
								case 1 :
									// druidG.g:343:14: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2265); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_granularityClause2268); 
							// druidG.g:343:25: ( WS )?
							int alt153=2;
							int LA153_0 = input.LA(1);
							if ( (LA153_0==WS) ) {
								alt153=1;
							}
							switch (alt153) {
								case 1 :
									// druidG.g:343:25: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2270); 
									}
									break;

							}

							per=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2275); 
							granularity.setPeriod((per!=null?per.getText():null));
							// druidG.g:343:89: ( WS )?
							int alt154=2;
							int LA154_0 = input.LA(1);
							if ( (LA154_0==WS) ) {
								alt154=1;
							}
							switch (alt154) {
								case 1 :
									// druidG.g:343:89: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2279); 
									}
									break;

							}

							// druidG.g:343:93: ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )?
							int alt156=2;
							int LA156_0 = input.LA(1);
							if ( (LA156_0==90) ) {
								int LA156_1 = input.LA(2);
								if ( (LA156_1==WS) ) {
									int LA156_4 = input.LA(3);
									if ( (LA156_4==SINGLE_QUOTE_STRING) ) {
										alt156=1;
									}
								}
								else if ( (LA156_1==SINGLE_QUOTE_STRING) ) {
									alt156=1;
								}
							}
							switch (alt156) {
								case 1 :
									// druidG.g:343:94: ',' ( WS )? tz= SINGLE_QUOTE_STRING
									{
									match(input,90,FOLLOW_90_in_granularityClause2283); 
									// druidG.g:343:98: ( WS )?
									int alt155=2;
									int LA155_0 = input.LA(1);
									if ( (LA155_0==WS) ) {
										alt155=1;
									}
									switch (alt155) {
										case 1 :
											// druidG.g:343:98: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2285); 
											}
											break;

									}

									tz=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2290); 
									granularity.setTimeZone((tz!=null?tz.getText():null));
									}
									break;

							}

							// druidG.g:343:164: ( WS )?
							int alt157=2;
							int LA157_0 = input.LA(1);
							if ( (LA157_0==WS) ) {
								alt157=1;
							}
							switch (alt157) {
								case 1 :
									// druidG.g:343:164: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2296); 
									}
									break;

							}

							// druidG.g:343:168: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
							int alt159=2;
							int LA159_0 = input.LA(1);
							if ( (LA159_0==90) ) {
								int LA159_1 = input.LA(2);
								if ( (LA159_1==WS) ) {
									int LA159_4 = input.LA(3);
									if ( (LA159_4==SINGLE_QUOTE_STRING) ) {
										alt159=1;
									}
								}
								else if ( (LA159_1==SINGLE_QUOTE_STRING) ) {
									alt159=1;
								}
							}
							switch (alt159) {
								case 1 :
									// druidG.g:343:169: ',' ( WS )? orig= SINGLE_QUOTE_STRING
									{
									match(input,90,FOLLOW_90_in_granularityClause2300); 
									// druidG.g:343:173: ( WS )?
									int alt158=2;
									int LA158_0 = input.LA(1);
									if ( (LA158_0==WS) ) {
										alt158=1;
									}
									switch (alt158) {
										case 1 :
											// druidG.g:343:173: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2302); 
											}
											break;

									}

									orig=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2307); 
									granularity.setOrigin((orig!=null?orig.getText():null));
									}
									break;

							}

							clause = new Pair<>(granularity, null);
							// druidG.g:343:283: ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )?
							int alt163=2;
							int LA163_0 = input.LA(1);
							if ( (LA163_0==WS||LA163_0==90) ) {
								alt163=1;
							}
							switch (alt163) {
								case 1 :
									// druidG.g:343:284: ( WS )? ',' ( WS )? inc= granularityInclude ( WS )?
									{
									// druidG.g:343:284: ( WS )?
									int alt160=2;
									int LA160_0 = input.LA(1);
									if ( (LA160_0==WS) ) {
										alt160=1;
									}
									switch (alt160) {
										case 1 :
											// druidG.g:343:284: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2316); 
											}
											break;

									}

									match(input,90,FOLLOW_90_in_granularityClause2319); 
									// druidG.g:343:292: ( WS )?
									int alt161=2;
									int LA161_0 = input.LA(1);
									if ( (LA161_0==WS) ) {
										int LA161_1 = input.LA(2);
										if ( (LA161_1==WS) ) {
											alt161=1;
										}
									}
									switch (alt161) {
										case 1 :
											// druidG.g:343:292: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2321); 
											}
											break;

									}

									pushFollow(FOLLOW_granularityInclude_in_granularityClause2326);
									inc=granularityInclude();
									state._fsp--;

									clause = new Pair<>(granularity, inc);
									// druidG.g:343:360: ( WS )?
									int alt162=2;
									int LA162_0 = input.LA(1);
									if ( (LA162_0==WS) ) {
										alt162=1;
									}
									switch (alt162) {
										case 1 :
											// druidG.g:343:360: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2330); 
											}
											break;

									}

									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_granularityClause2335); 
							}

							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return clause;
	}
	// $ANTLR end "granularityClause"



	// $ANTLR start "granularityInclude"
	// druidG.g:347:1: granularityInclude returns [List<Pair<Integer, Integer>> microIntervals] : ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) ;
	public final List<Pair<Integer, Integer>> granularityInclude() throws RecognitionException {
		List<Pair<Integer, Integer>> microIntervals = null;


		Pair<Integer, Integer> p1 =null;
		Pair<Integer, Integer> p2 =null;

		microIntervals = new ArrayList<>();
		try {
			// druidG.g:349:2: ( ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) )
			// druidG.g:350:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
			{
			// druidG.g:350:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
			// druidG.g:350:4: WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN
			{
			match(input,WS,FOLLOW_WS_in_granularityInclude2363); 
			match(input,INCLUDE,FOLLOW_INCLUDE_in_granularityInclude2365); 
			// druidG.g:350:15: ( WS )?
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==WS) ) {
				alt166=1;
			}
			switch (alt166) {
				case 1 :
					// druidG.g:350:15: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude2367); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_granularityInclude2370); 
			// druidG.g:350:26: ( WS )?
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==WS) ) {
				alt167=1;
			}
			switch (alt167) {
				case 1 :
					// druidG.g:350:26: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude2372); 
					}
					break;

			}

			// druidG.g:350:30: (p1= pairNums ( ',' p2= pairNums )* )
			// druidG.g:350:31: p1= pairNums ( ',' p2= pairNums )*
			{
			pushFollow(FOLLOW_pairNums_in_granularityInclude2378);
			p1=pairNums();
			state._fsp--;

			microIntervals.add(p1);
			// druidG.g:350:69: ( ',' p2= pairNums )*
			loop168:
			while (true) {
				int alt168=2;
				int LA168_0 = input.LA(1);
				if ( (LA168_0==90) ) {
					alt168=1;
				}

				switch (alt168) {
				case 1 :
					// druidG.g:350:70: ',' p2= pairNums
					{
					match(input,90,FOLLOW_90_in_granularityInclude2383); 
					pushFollow(FOLLOW_pairNums_in_granularityInclude2387);
					p2=pairNums();
					state._fsp--;

					microIntervals.add(p2);
					}
					break;

				default :
					break loop168;
				}
			}

			}

			// druidG.g:350:115: ( WS )?
			int alt169=2;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==WS) ) {
				alt169=1;
			}
			switch (alt169) {
				case 1 :
					// druidG.g:350:115: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude2394); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_granularityInclude2397); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return microIntervals;
	}
	// $ANTLR end "granularityInclude"



	// $ANTLR start "pairNums"
	// druidG.g:353:1: pairNums returns [Pair<Integer, Integer> pair] : ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) ;
	public final Pair<Integer, Integer> pairNums() throws RecognitionException {
		Pair<Integer, Integer> pair = null;


		Token i=null;
		Token j=null;

		try {
			// druidG.g:354:2: ( ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) )
			// druidG.g:354:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
			{
			// druidG.g:354:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
			// druidG.g:354:5: LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE
			{
			match(input,LSQUARE,FOLLOW_LSQUARE_in_pairNums2416); 
			// druidG.g:354:13: ( WS )?
			int alt170=2;
			int LA170_0 = input.LA(1);
			if ( (LA170_0==WS) ) {
				alt170=1;
			}
			switch (alt170) {
				case 1 :
					// druidG.g:354:13: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums2418); 
					}
					break;

			}

			i=(Token)match(input,LONG,FOLLOW_LONG_in_pairNums2423); 
			// druidG.g:354:25: ( WS )?
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==WS) ) {
				alt171=1;
			}
			switch (alt171) {
				case 1 :
					// druidG.g:354:25: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums2426); 
					}
					break;

			}

			match(input,90,FOLLOW_90_in_pairNums2429); 
			// druidG.g:354:33: ( WS )?
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==WS) ) {
				alt172=1;
			}
			switch (alt172) {
				case 1 :
					// druidG.g:354:33: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums2431); 
					}
					break;

			}

			j=(Token)match(input,LONG,FOLLOW_LONG_in_pairNums2436); 
			// druidG.g:354:44: ( WS )?
			int alt173=2;
			int LA173_0 = input.LA(1);
			if ( (LA173_0==WS) ) {
				alt173=1;
			}
			switch (alt173) {
				case 1 :
					// druidG.g:354:44: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums2438); 
					}
					break;

			}

			match(input,RSQUARE,FOLLOW_RSQUARE_in_pairNums2441); 
			}

			 pair = new Pair<>(Integer.parseInt((i!=null?i.getText():null)), Integer.parseInt((j!=null?j.getText():null)));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pair;
	}
	// $ANTLR end "pairNums"



	// $ANTLR start "pairString"
	// druidG.g:357:1: pairString returns [Pair<String, String> pair] : ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) ;
	public final Pair<String, String> pairString() throws RecognitionException {
		Pair<String, String> pair = null;


		Token i=null;
		Token j=null;

		try {
			// druidG.g:358:2: ( ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) )
			// druidG.g:358:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
			{
			// druidG.g:358:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
			// druidG.g:358:5: LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE
			{
			match(input,LSQUARE,FOLLOW_LSQUARE_in_pairString2461); 
			// druidG.g:358:13: ( WS )?
			int alt174=2;
			int LA174_0 = input.LA(1);
			if ( (LA174_0==WS) ) {
				alt174=1;
			}
			switch (alt174) {
				case 1 :
					// druidG.g:358:13: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString2463); 
					}
					break;

			}

			i=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_pairString2468); 
			// druidG.g:358:40: ( WS )?
			int alt175=2;
			int LA175_0 = input.LA(1);
			if ( (LA175_0==WS) ) {
				alt175=1;
			}
			switch (alt175) {
				case 1 :
					// druidG.g:358:40: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString2471); 
					}
					break;

			}

			match(input,90,FOLLOW_90_in_pairString2474); 
			// druidG.g:358:48: ( WS )?
			int alt176=2;
			int LA176_0 = input.LA(1);
			if ( (LA176_0==WS) ) {
				alt176=1;
			}
			switch (alt176) {
				case 1 :
					// druidG.g:358:48: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString2476); 
					}
					break;

			}

			j=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_pairString2481); 
			// druidG.g:358:74: ( WS )?
			int alt177=2;
			int LA177_0 = input.LA(1);
			if ( (LA177_0==WS) ) {
				alt177=1;
			}
			switch (alt177) {
				case 1 :
					// druidG.g:358:74: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString2483); 
					}
					break;

			}

			match(input,RSQUARE,FOLLOW_RSQUARE_in_pairString2486); 
			}

			 pair = new Pair<>(((i!=null?i.getText():null)).replaceAll("'", ""), ((j!=null?j.getText():null)).replaceAll("'", ""));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pair;
	}
	// $ANTLR end "pairString"



	// $ANTLR start "havingClause"
	// druidG.g:365:1: havingClause returns [Having having] : h= complexHaving ;
	public final Having havingClause() throws RecognitionException {
		Having having = null;


		Having h =null;

		try {
			// druidG.g:366:2: (h= complexHaving )
			// druidG.g:366:4: h= complexHaving
			{
			pushFollow(FOLLOW_complexHaving_in_havingClause2511);
			h=complexHaving();
			state._fsp--;

			having = h;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return having;
	}
	// $ANTLR end "havingClause"



	// $ANTLR start "simpleHaving"
	// druidG.g:369:1: simpleHaving returns [Having having] : ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) );
	public final Having simpleHaving() throws RecognitionException {
		Having having = null;


		Token a=null;
		Token t=null;
		Token v=null;
		Token n=null;
		EqualsToHolder e =null;

		try {
			// druidG.g:370:2: ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) )
			int alt182=3;
			int LA182_0 = input.LA(1);
			if ( (LA182_0==ID) ) {
				switch ( input.LA(2) ) {
				case WS:
					{
					int LA182_3 = input.LA(3);
					if ( (LA182_3==COMPARE_OPER) ) {
						alt182=1;
					}
					else if ( (LA182_3==EQUALS) ) {
						alt182=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 182, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case COMPARE_OPER:
					{
					alt182=1;
					}
					break;
				case EQUALS:
					{
					alt182=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 182, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA182_0==NOT) ) {
				alt182=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 182, 0, input);
				throw nvae;
			}

			switch (alt182) {
				case 1 :
					// druidG.g:370:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					{
					// druidG.g:370:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					// druidG.g:370:5: a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
					{
					a=(Token)match(input,ID,FOLLOW_ID_in_simpleHaving2532); 
					// druidG.g:370:10: ( WS )?
					int alt178=2;
					int LA178_0 = input.LA(1);
					if ( (LA178_0==WS) ) {
						alt178=1;
					}
					switch (alt178) {
						case 1 :
							// druidG.g:370:10: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving2534); 
							}
							break;

					}

					t=(Token)match(input,COMPARE_OPER,FOLLOW_COMPARE_OPER_in_simpleHaving2539); 
					// druidG.g:370:29: ( WS )?
					int alt179=2;
					int LA179_0 = input.LA(1);
					if ( (LA179_0==WS) ) {
						alt179=1;
					}
					switch (alt179) {
						case 1 :
							// druidG.g:370:29: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving2541); 
							}
							break;

					}

					v=input.LT(1);
					if ( input.LA(1)==FLOAT||input.LA(1)==LONG ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}

					having = new Having((t!=null?t.getText():null), (a!=null?a.getText():null), (v!=null?v.getText():null));
					}
					break;
				case 2 :
					// druidG.g:371:4: (e= getEquals )
					{
					// druidG.g:371:4: (e= getEquals )
					// druidG.g:371:5: e= getEquals
					{
					pushFollow(FOLLOW_getEquals_in_simpleHaving2563);
					e=getEquals();
					state._fsp--;

					}

					having = new Having("=", e.name, e.value);
					}
					break;
				case 3 :
					// druidG.g:372:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					{
					// druidG.g:372:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					// druidG.g:372:5: n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
					{
					n=(Token)match(input,NOT,FOLLOW_NOT_in_simpleHaving2574); 
					match(input,WS,FOLLOW_WS_in_simpleHaving2576); 
					a=(Token)match(input,ID,FOLLOW_ID_in_simpleHaving2580); 
					// druidG.g:372:19: ( WS )?
					int alt180=2;
					int LA180_0 = input.LA(1);
					if ( (LA180_0==WS) ) {
						alt180=1;
					}
					switch (alt180) {
						case 1 :
							// druidG.g:372:19: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving2582); 
							}
							break;

					}

					t=(Token)match(input,COMPARE_OPER,FOLLOW_COMPARE_OPER_in_simpleHaving2587); 
					// druidG.g:372:38: ( WS )?
					int alt181=2;
					int LA181_0 = input.LA(1);
					if ( (LA181_0==WS) ) {
						alt181=1;
					}
					switch (alt181) {
						case 1 :
							// druidG.g:372:38: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving2589); 
							}
							break;

					}

					v=input.LT(1);
					if ( input.LA(1)==FLOAT||input.LA(1)==LONG ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}

					having = new Having((n!=null?n.getText():null).toLowerCase()); having.havingSpecs = Arrays.asList(new Having((t!=null?t.getText():null), (a!=null?a.getText():null), (v!=null?v.getText():null)));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return having;
	}
	// $ANTLR end "simpleHaving"



	// $ANTLR start "complexHaving"
	// druidG.g:375:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );
	public final Having complexHaving() throws RecognitionException {
		Having having = null;


		Token o=null;
		Having s =null;
		Having a =null;
		Having b =null;

		try {
			// druidG.g:376:2: ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) )
			int alt183=2;
			alt183 = dfa183.predict(input);
			switch (alt183) {
				case 1 :
					// druidG.g:376:4: (s= simpleHaving )
					{
					// druidG.g:376:4: (s= simpleHaving )
					// druidG.g:376:5: s= simpleHaving
					{
					pushFollow(FOLLOW_simpleHaving_in_complexHaving2622);
					s=simpleHaving();
					state._fsp--;

					}

					having = s;
					}
					break;
				case 2 :
					// druidG.g:377:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
					{
					// druidG.g:377:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
					// druidG.g:377:5: a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving
					{
					pushFollow(FOLLOW_simpleHaving_in_complexHaving2633);
					a=simpleHaving();
					state._fsp--;

					match(input,WS,FOLLOW_WS_in_complexHaving2635); 
					o=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,WS,FOLLOW_WS_in_complexHaving2645); 
					pushFollow(FOLLOW_complexHaving_in_complexHaving2649);
					b=complexHaving();
					state._fsp--;

					}

					having = new Having((o!=null?o.getText():null).toLowerCase()); having.havingSpecs = Arrays.asList(a,b);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return having;
	}
	// $ANTLR end "complexHaving"



	// $ANTLR start "selectorFilter"
	// druidG.g:385:1: selectorFilter returns [Filter filter] : e= getEquals ;
	public final Filter selectorFilter() throws RecognitionException {
		Filter filter = null;


		EqualsToHolder e =null;

		filter = new Filter("selector");
		try {
			// druidG.g:387:2: (e= getEquals )
			// druidG.g:387:4: e= getEquals
			{
			pushFollow(FOLLOW_getEquals_in_selectorFilter2686);
			e=getEquals();
			state._fsp--;

			filter.dimension = e.name;
					 filter.value = unquote(e.value);
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "selectorFilter"



	// $ANTLR start "regexFilter"
	// druidG.g:393:1: regexFilter returns [Filter filter] : (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) ;
	public final Filter regexFilter() throws RecognitionException {
		Filter filter = null;


		Token a=null;
		Token b=null;

		filter = new Filter("regex");
		try {
			// druidG.g:395:2: ( (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) )
			// druidG.g:395:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
			{
			// druidG.g:395:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
			// druidG.g:395:5: a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING )
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_regexFilter2715); 
			match(input,WS,FOLLOW_WS_in_regexFilter2717); 
			match(input,LIKE,FOLLOW_LIKE_in_regexFilter2719); 
			match(input,WS,FOLLOW_WS_in_regexFilter2721); 
			// druidG.g:395:24: ( SINGLE_QUOTE_STRING )
			// druidG.g:395:25: SINGLE_QUOTE_STRING
			{
			b=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter2727); 
			}

			}

			filter.dimension = (a!=null?a.getText():null);
					 filter.pattern = unquote((b!=null?b.getText():null));
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "regexFilter"



	// $ANTLR start "simpleFilter"
	// druidG.g:401:1: simpleFilter returns [Filter filter] : ( (a= selectorFilter |a= regexFilter ) | ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN ) );
	public final Filter simpleFilter() throws RecognitionException {
		Filter filter = null;


		Filter a =null;

		try {
			// druidG.g:402:2: ( (a= selectorFilter |a= regexFilter ) | ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN ) )
			int alt188=2;
			int LA188_0 = input.LA(1);
			if ( (LA188_0==ID) ) {
				alt188=1;
			}
			else if ( (LA188_0==LPARAN) ) {
				alt188=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 188, 0, input);
				throw nvae;
			}

			switch (alt188) {
				case 1 :
					// druidG.g:402:4: (a= selectorFilter |a= regexFilter )
					{
					// druidG.g:402:4: (a= selectorFilter |a= regexFilter )
					int alt184=2;
					int LA184_0 = input.LA(1);
					if ( (LA184_0==ID) ) {
						int LA184_1 = input.LA(2);
						if ( (LA184_1==WS) ) {
							int LA184_2 = input.LA(3);
							if ( (LA184_2==LIKE) ) {
								alt184=2;
							}
							else if ( (LA184_2==EQUALS) ) {
								alt184=1;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 184, 2, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA184_1==EQUALS) ) {
							alt184=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 184, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 184, 0, input);
						throw nvae;
					}

					switch (alt184) {
						case 1 :
							// druidG.g:402:5: a= selectorFilter
							{
							pushFollow(FOLLOW_selectorFilter_in_simpleFilter2752);
							a=selectorFilter();
							state._fsp--;

							}
							break;
						case 2 :
							// druidG.g:402:24: a= regexFilter
							{
							pushFollow(FOLLOW_regexFilter_in_simpleFilter2758);
							a=regexFilter();
							state._fsp--;

							}
							break;

					}

					filter = a;
					}
					break;
				case 2 :
					// druidG.g:403:5: ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN )
					{
					// druidG.g:403:5: ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN )
					// druidG.g:403:6: LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_simpleFilter2768); 
					// druidG.g:403:13: ( WS )?
					int alt185=2;
					int LA185_0 = input.LA(1);
					if ( (LA185_0==WS) ) {
						alt185=1;
					}
					switch (alt185) {
						case 1 :
							// druidG.g:403:13: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleFilter2770); 
							}
							break;

					}

					// druidG.g:403:17: (a= selectorFilter |a= regexFilter )
					int alt186=2;
					int LA186_0 = input.LA(1);
					if ( (LA186_0==ID) ) {
						int LA186_1 = input.LA(2);
						if ( (LA186_1==WS) ) {
							int LA186_2 = input.LA(3);
							if ( (LA186_2==LIKE) ) {
								alt186=2;
							}
							else if ( (LA186_2==EQUALS) ) {
								alt186=1;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 186, 2, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA186_1==EQUALS) ) {
							alt186=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 186, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 186, 0, input);
						throw nvae;
					}

					switch (alt186) {
						case 1 :
							// druidG.g:403:18: a= selectorFilter
							{
							pushFollow(FOLLOW_selectorFilter_in_simpleFilter2776);
							a=selectorFilter();
							state._fsp--;

							}
							break;
						case 2 :
							// druidG.g:403:37: a= regexFilter
							{
							pushFollow(FOLLOW_regexFilter_in_simpleFilter2782);
							a=regexFilter();
							state._fsp--;

							}
							break;

					}

					// druidG.g:403:52: ( WS )?
					int alt187=2;
					int LA187_0 = input.LA(1);
					if ( (LA187_0==WS) ) {
						alt187=1;
					}
					switch (alt187) {
						case 1 :
							// druidG.g:403:52: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleFilter2785); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_simpleFilter2788); 
					}

					filter = a;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "simpleFilter"



	// $ANTLR start "simpleLogicalFilter"
	// druidG.g:406:1: simpleLogicalFilter returns [Filter filter] : ( ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) | ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN ) );
	public final Filter simpleLogicalFilter() throws RecognitionException {
		Filter filter = null;


		Token o=null;
		Filter a =null;
		Filter b =null;
		Filter s =null;

		try {
			// druidG.g:407:2: ( ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) | ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN ) )
			int alt192=2;
			int LA192_0 = input.LA(1);
			if ( (LA192_0==ID||LA192_0==NOT) ) {
				alt192=1;
			}
			else if ( (LA192_0==LPARAN) ) {
				switch ( input.LA(2) ) {
				case WS:
					{
					int LA192_4 = input.LA(3);
					if ( (LA192_4==ID) ) {
						int LA192_8 = input.LA(4);
						if ( (LA192_8==WS) ) {
							int LA192_13 = input.LA(5);
							if ( (LA192_13==LIKE) ) {
								int LA192_19 = input.LA(6);
								if ( (LA192_19==WS) ) {
									alt192=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 192, 19, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA192_13==EQUALS) ) {
								int LA192_20 = input.LA(6);
								if ( (LA192_20==WS) ) {
									alt192=1;
								}
								else if ( (LA192_20==FLOAT||LA192_20==LONG||LA192_20==SINGLE_QUOTE_STRING) ) {
									alt192=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 192, 20, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 192, 13, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA192_8==EQUALS) ) {
							int LA192_14 = input.LA(5);
							if ( (LA192_14==WS) ) {
								int LA192_21 = input.LA(6);
								if ( (LA192_21==FLOAT||LA192_21==LONG||LA192_21==SINGLE_QUOTE_STRING) ) {
									alt192=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 192, 21, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA192_14==FLOAT||LA192_14==LONG||LA192_14==SINGLE_QUOTE_STRING) ) {
								int LA192_22 = input.LA(6);
								if ( (LA192_22==WS) ) {
									alt192=1;
								}
								else if ( (LA192_22==RPARAN) ) {
									alt192=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 192, 22, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 192, 14, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 192, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA192_4==LPARAN||LA192_4==NOT) ) {
						alt192=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 192, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case ID:
					{
					int LA192_5 = input.LA(3);
					if ( (LA192_5==WS) ) {
						int LA192_11 = input.LA(4);
						if ( (LA192_11==LIKE) ) {
							int LA192_15 = input.LA(5);
							if ( (LA192_15==WS) ) {
								int LA192_23 = input.LA(6);
								if ( (LA192_23==SINGLE_QUOTE_STRING) ) {
									alt192=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 192, 23, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 192, 15, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA192_11==EQUALS) ) {
							int LA192_16 = input.LA(5);
							if ( (LA192_16==WS) ) {
								int LA192_24 = input.LA(6);
								if ( (LA192_24==FLOAT||LA192_24==LONG||LA192_24==SINGLE_QUOTE_STRING) ) {
									alt192=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 192, 24, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA192_16==FLOAT||LA192_16==LONG||LA192_16==SINGLE_QUOTE_STRING) ) {
								int LA192_25 = input.LA(6);
								if ( (LA192_25==WS) ) {
									alt192=1;
								}
								else if ( (LA192_25==RPARAN) ) {
									alt192=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 192, 25, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 192, 16, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 192, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA192_5==EQUALS) ) {
						int LA192_12 = input.LA(4);
						if ( (LA192_12==WS) ) {
							int LA192_17 = input.LA(5);
							if ( (LA192_17==FLOAT||LA192_17==LONG||LA192_17==SINGLE_QUOTE_STRING) ) {
								int LA192_26 = input.LA(6);
								if ( (LA192_26==WS) ) {
									alt192=1;
								}
								else if ( (LA192_26==RPARAN) ) {
									alt192=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 192, 26, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 192, 17, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA192_12==FLOAT||LA192_12==LONG||LA192_12==SINGLE_QUOTE_STRING) ) {
							int LA192_18 = input.LA(5);
							if ( (LA192_18==WS) ) {
								int LA192_27 = input.LA(6);
								if ( (LA192_27==AND||LA192_27==OR) ) {
									alt192=2;
								}
								else if ( (LA192_27==RPARAN) ) {
									alt192=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 192, 27, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA192_18==RPARAN) ) {
								alt192=1;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 192, 18, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 192, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 192, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case LPARAN:
				case NOT:
					{
					alt192=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 192, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 192, 0, input);
				throw nvae;
			}

			switch (alt192) {
				case 1 :
					// druidG.g:407:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
					{
					// druidG.g:407:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
					int alt189=2;
					int LA189_0 = input.LA(1);
					if ( (LA189_0==ID||LA189_0==LPARAN) ) {
						alt189=1;
					}
					else if ( (LA189_0==NOT) ) {
						alt189=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 189, 0, input);
						throw nvae;
					}

					switch (alt189) {
						case 1 :
							// druidG.g:407:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
							{
							// druidG.g:407:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
							// druidG.g:407:5: a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter
							{
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2809);
							a=simpleFilter();
							state._fsp--;

							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2811); 
							o=input.LT(1);
							if ( input.LA(1)==AND||input.LA(1)==OR ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2821); 
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2825);
							b=simpleFilter();
							state._fsp--;

							}

							}
							break;
						case 2 :
							// druidG.g:407:55: (o= NOT WS b= simpleFilter )
							{
							// druidG.g:407:55: (o= NOT WS b= simpleFilter )
							// druidG.g:407:56: o= NOT WS b= simpleFilter
							{
							o=(Token)match(input,NOT,FOLLOW_NOT_in_simpleLogicalFilter2833); 
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2835); 
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2839);
							b=simpleFilter();
							state._fsp--;

							}

							}
							break;

					}

					filter = new Filter((o!=null?o.getText():null).toLowerCase());
							 filter.fields = new ArrayList<>();
							 if (a != null) {
							    filter.fields.add(a);
							 }
							 filter.fields.add(b);
							
					}
					break;
				case 2 :
					// druidG.g:415:4: ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN )
					{
					// druidG.g:415:4: ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN )
					// druidG.g:415:5: LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_simpleLogicalFilter2852); 
					// druidG.g:415:12: ( WS )?
					int alt190=2;
					int LA190_0 = input.LA(1);
					if ( (LA190_0==WS) ) {
						alt190=1;
					}
					switch (alt190) {
						case 1 :
							// druidG.g:415:12: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2854); 
							}
							break;

					}

					pushFollow(FOLLOW_simpleLogicalFilter_in_simpleLogicalFilter2859);
					s=simpleLogicalFilter();
					state._fsp--;

					// druidG.g:415:38: ( WS )?
					int alt191=2;
					int LA191_0 = input.LA(1);
					if ( (LA191_0==WS) ) {
						alt191=1;
					}
					switch (alt191) {
						case 1 :
							// druidG.g:415:38: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2861); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_simpleLogicalFilter2864); 
					}

					filter = s;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "simpleLogicalFilter"



	// $ANTLR start "grandFilter"
	// druidG.g:420:1: grandFilter returns [Filter filter] : (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )? ;
	public final Filter grandFilter() throws RecognitionException {
		Filter filter = null;


		Token o=null;
		Filter a =null;
		Filter b =null;

		try {
			// druidG.g:421:2: ( (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )? )
			// druidG.g:421:4: (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )?
			{
			// druidG.g:421:4: (a= simpleFilter |a= simpleLogicalFilter )
			int alt193=2;
			alt193 = dfa193.predict(input);
			switch (alt193) {
				case 1 :
					// druidG.g:421:5: a= simpleFilter
					{
					pushFollow(FOLLOW_simpleFilter_in_grandFilter2888);
					a=simpleFilter();
					state._fsp--;

					}
					break;
				case 2 :
					// druidG.g:421:22: a= simpleLogicalFilter
					{
					pushFollow(FOLLOW_simpleLogicalFilter_in_grandFilter2894);
					a=simpleLogicalFilter();
					state._fsp--;

					}
					break;

			}

			filter = a;
			// druidG.g:421:60: ( WS o= ( AND | OR ) WS b= grandFilter )?
			int alt194=2;
			int LA194_0 = input.LA(1);
			if ( (LA194_0==WS) ) {
				int LA194_1 = input.LA(2);
				if ( (LA194_1==AND||LA194_1==OR) ) {
					alt194=1;
				}
			}
			switch (alt194) {
				case 1 :
					// druidG.g:421:61: WS o= ( AND | OR ) WS b= grandFilter
					{
					match(input,WS,FOLLOW_WS_in_grandFilter2901); 
					o=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,WS,FOLLOW_WS_in_grandFilter2911); 
					pushFollow(FOLLOW_grandFilter_in_grandFilter2915);
					b=grandFilter();
					state._fsp--;

					filter = new Filter((o!=null?o.getText():null).toLowerCase());
							 filter.fields = new ArrayList<>();
							 filter.fields.add(a);
							 filter.fields.add(b);
							
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "grandFilter"



	// $ANTLR start "aggItem"
	// druidG.g:432:1: aggItem returns [AggItem aggItem] : aggCallSite[aggItem] ( WS AS WS x= ID )? ;
	public final AggItem aggItem() throws RecognitionException {
		AggItem aggItem = null;


		Token x=null;

		  aggItem = new AggItem(); 
		try {
			// druidG.g:434:2: ( aggCallSite[aggItem] ( WS AS WS x= ID )? )
			// druidG.g:434:4: aggCallSite[aggItem] ( WS AS WS x= ID )?
			{
			pushFollow(FOLLOW_aggCallSite_in_aggItem2952);
			aggCallSite(aggItem);
			state._fsp--;

			// druidG.g:434:25: ( WS AS WS x= ID )?
			int alt195=2;
			int LA195_0 = input.LA(1);
			if ( (LA195_0==WS) ) {
				int LA195_1 = input.LA(2);
				if ( (LA195_1==AS) ) {
					alt195=1;
				}
			}
			switch (alt195) {
				case 1 :
					// druidG.g:434:26: WS AS WS x= ID
					{
					match(input,WS,FOLLOW_WS_in_aggItem2956); 
					match(input,AS,FOLLOW_AS_in_aggItem2958); 
					match(input,WS,FOLLOW_WS_in_aggItem2960); 
					x=(Token)match(input,ID,FOLLOW_ID_in_aggItem2964); 
					aggItem.setAsName((x!=null?x.getText():null));
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return aggItem;
	}
	// $ANTLR end "aggItem"



	// $ANTLR start "aggCallSite"
	// druidG.g:436:1: aggCallSite[AggItem aggItem] : (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN ) | COUNT ( '(*)' ) );
	public final void aggCallSite(AggItem aggItem) throws RecognitionException {
		Token x=null;
		Token y=null;
		String p =null;

		try {
			// druidG.g:437:2: (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN ) | COUNT ( '(*)' ) )
			int alt202=2;
			int LA202_0 = input.LA(1);
			if ( (LA202_0==DOUBLE_SUM||LA202_0==JAVASCRIPT||LA202_0==LONG_SUM||LA202_0==MAX||LA202_0==MIN||LA202_0==UNIQUE) ) {
				alt202=1;
			}
			else if ( (LA202_0==COUNT) ) {
				alt202=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 202, 0, input);
				throw nvae;
			}

			switch (alt202) {
				case 1 :
					// druidG.g:437:4: p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN )
					{
					pushFollow(FOLLOW_aggFunc_in_aggCallSite2983);
					p=aggFunc();
					state._fsp--;

					aggItem.setAggType(p);
					// druidG.g:437:39: ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN )
					// druidG.g:437:40: ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN
					{
					// druidG.g:437:40: ( WS )?
					int alt196=2;
					int LA196_0 = input.LA(1);
					if ( (LA196_0==WS) ) {
						alt196=1;
					}
					switch (alt196) {
						case 1 :
							// druidG.g:437:40: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite2988); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_aggCallSite2991); 
					// druidG.g:437:51: ( WS )?
					int alt197=2;
					int LA197_0 = input.LA(1);
					if ( (LA197_0==WS) ) {
						alt197=1;
					}
					switch (alt197) {
						case 1 :
							// druidG.g:437:51: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite2993); 
							}
							break;

					}

					// druidG.g:437:55: (x= ID )
					// druidG.g:437:57: x= ID
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_aggCallSite3000); 
					aggItem.setFieldName((x!=null?x.getText():null));
					}

					// druidG.g:437:96: ( ( WS )? ',' ( WS )? y= ID )*
					loop200:
					while (true) {
						int alt200=2;
						int LA200_0 = input.LA(1);
						if ( (LA200_0==WS) ) {
							int LA200_1 = input.LA(2);
							if ( (LA200_1==90) ) {
								alt200=1;
							}

						}
						else if ( (LA200_0==90) ) {
							alt200=1;
						}

						switch (alt200) {
						case 1 :
							// druidG.g:437:97: ( WS )? ',' ( WS )? y= ID
							{
							// druidG.g:437:97: ( WS )?
							int alt198=2;
							int LA198_0 = input.LA(1);
							if ( (LA198_0==WS) ) {
								alt198=1;
							}
							switch (alt198) {
								case 1 :
									// druidG.g:437:97: WS
									{
									match(input,WS,FOLLOW_WS_in_aggCallSite3006); 
									}
									break;

							}

							match(input,90,FOLLOW_90_in_aggCallSite3009); 
							// druidG.g:437:105: ( WS )?
							int alt199=2;
							int LA199_0 = input.LA(1);
							if ( (LA199_0==WS) ) {
								alt199=1;
							}
							switch (alt199) {
								case 1 :
									// druidG.g:437:105: WS
									{
									match(input,WS,FOLLOW_WS_in_aggCallSite3011); 
									}
									break;

							}

							y=(Token)match(input,ID,FOLLOW_ID_in_aggCallSite3016); 

								    if (aggItem.fieldNames == null || aggItem.fieldNames.isEmpty()) {
								       aggItem.fieldNames = new ArrayList<>();
								       aggItem.fieldNames.add(aggItem.fieldName);
								       aggItem.fieldName = null;
								    }
								    aggItem.fieldNames.add((y!=null?y.getText():null));
								
							}
							break;

						default :
							break loop200;
						}
					}

					// druidG.g:444:6: ( WS )?
					int alt201=2;
					int LA201_0 = input.LA(1);
					if ( (LA201_0==WS) ) {
						alt201=1;
					}
					switch (alt201) {
						case 1 :
							// druidG.g:444:6: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite3022); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_aggCallSite3025); 
					}

					}
					break;
				case 2 :
					// druidG.g:445:4: COUNT ( '(*)' )
					{
					match(input,COUNT,FOLLOW_COUNT_in_aggCallSite3032); 
					aggItem.setAggType("count");
					// druidG.g:445:41: ( '(*)' )
					// druidG.g:445:42: '(*)'
					{
					match(input,88,FOLLOW_88_in_aggCallSite3037); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "aggCallSite"



	// $ANTLR start "aggFunc"
	// druidG.g:448:1: aggFunc returns [String name] : ( LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | JAVASCRIPT );
	public final String aggFunc() throws RecognitionException {
		String name = null;


		try {
			// druidG.g:449:2: ( LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | JAVASCRIPT )
			int alt203=6;
			switch ( input.LA(1) ) {
			case LONG_SUM:
				{
				alt203=1;
				}
				break;
			case DOUBLE_SUM:
				{
				alt203=2;
				}
				break;
			case UNIQUE:
				{
				alt203=3;
				}
				break;
			case MIN:
				{
				alt203=4;
				}
				break;
			case MAX:
				{
				alt203=5;
				}
				break;
			case JAVASCRIPT:
				{
				alt203=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 203, 0, input);
				throw nvae;
			}
			switch (alt203) {
				case 1 :
					// druidG.g:449:4: LONG_SUM
					{
					match(input,LONG_SUM,FOLLOW_LONG_SUM_in_aggFunc3055); 
					name = "longSum";
					}
					break;
				case 2 :
					// druidG.g:450:4: DOUBLE_SUM
					{
					match(input,DOUBLE_SUM,FOLLOW_DOUBLE_SUM_in_aggFunc3062); 
					name = "doubleSum";
					}
					break;
				case 3 :
					// druidG.g:451:4: UNIQUE
					{
					match(input,UNIQUE,FOLLOW_UNIQUE_in_aggFunc3069); 
					name = "hyperUnique";
					}
					break;
				case 4 :
					// druidG.g:452:4: MIN
					{
					match(input,MIN,FOLLOW_MIN_in_aggFunc3076); 
					name = "min";
					}
					break;
				case 5 :
					// druidG.g:453:4: MAX
					{
					match(input,MAX,FOLLOW_MAX_in_aggFunc3083); 
					name = "max";
					}
					break;
				case 6 :
					// druidG.g:454:4: JAVASCRIPT
					{
					match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_aggFunc3090); 
					name = "javascript";
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "aggFunc"



	// $ANTLR start "postAggItem"
	// druidG.g:460:1: postAggItem returns [PostAggItem postAggItem] : ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) );
	public final PostAggItem postAggItem() throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem a =null;
		PostAggItem b =null;

		  postAggItem = new PostAggItem("arithmetic"); 
		try {
			// druidG.g:462:2: ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) )
			int alt213=2;
			int LA213_0 = input.LA(1);
			if ( (LA213_0==FLOAT||LA213_0==ID||LA213_0==JAVASCRIPT||LA213_0==LONG||LA213_0==UNIQUE) ) {
				alt213=1;
			}
			else if ( (LA213_0==LPARAN) ) {
				alt213=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 213, 0, input);
				throw nvae;
			}

			switch (alt213) {
				case 1 :
					// druidG.g:462:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					{
					// druidG.g:462:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					// druidG.g:462:5: a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					{
					pushFollow(FOLLOW_simpleArith_in_postAggItem3118);
					a=simpleArith();
					state._fsp--;

					// druidG.g:462:20: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					int alt206=2;
					int LA206_0 = input.LA(1);
					if ( (LA206_0==WS) ) {
						int LA206_1 = input.LA(2);
						if ( (LA206_1==ARITH_OPER) ) {
							alt206=1;
						}
					}
					else if ( (LA206_0==ARITH_OPER) ) {
						alt206=1;
					}
					switch (alt206) {
						case 1 :
							// druidG.g:462:21: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
							{
							// druidG.g:462:21: ( WS )?
							int alt204=2;
							int LA204_0 = input.LA(1);
							if ( (LA204_0==WS) ) {
								alt204=1;
							}
							switch (alt204) {
								case 1 :
									// druidG.g:462:21: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem3122); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggArithOper_in_postAggItem3125);
							postAggArithOper(postAggItem);
							state._fsp--;

							// druidG.g:462:55: ( WS )?
							int alt205=2;
							int LA205_0 = input.LA(1);
							if ( (LA205_0==WS) ) {
								alt205=1;
							}
							switch (alt205) {
								case 1 :
									// druidG.g:462:55: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem3128); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggItem_in_postAggItem3133);
							b=postAggItem();
							state._fsp--;

							}
							break;

					}

					}

					 if (b == null) {
						       postAggItem = a;
					             } else {
					             	postAggItem.fields = Arrays.asList(a, b);
					             }
					           
					}
					break;
				case 2 :
					// druidG.g:469:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					{
					// druidG.g:469:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					// druidG.g:469:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					{
					// druidG.g:469:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN )
					// druidG.g:469:6: LPARAN ( WS )? a= postAggItem ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_postAggItem3151); 
					// druidG.g:469:13: ( WS )?
					int alt207=2;
					int LA207_0 = input.LA(1);
					if ( (LA207_0==WS) ) {
						alt207=1;
					}
					switch (alt207) {
						case 1 :
							// druidG.g:469:13: WS
							{
							match(input,WS,FOLLOW_WS_in_postAggItem3153); 
							}
							break;

					}

					pushFollow(FOLLOW_postAggItem_in_postAggItem3158);
					a=postAggItem();
					state._fsp--;

					// druidG.g:469:31: ( WS )?
					int alt208=2;
					int LA208_0 = input.LA(1);
					if ( (LA208_0==WS) ) {
						alt208=1;
					}
					switch (alt208) {
						case 1 :
							// druidG.g:469:31: WS
							{
							match(input,WS,FOLLOW_WS_in_postAggItem3160); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_postAggItem3163); 
					}

					// druidG.g:469:43: ( postAggLabel[postAggItem] )?
					int alt209=2;
					int LA209_0 = input.LA(1);
					if ( (LA209_0==AS) ) {
						alt209=1;
					}
					switch (alt209) {
						case 1 :
							// druidG.g:469:44: postAggLabel[postAggItem]
							{
							pushFollow(FOLLOW_postAggLabel_in_postAggItem3167);
							postAggLabel(postAggItem);
							state._fsp--;

							}
							break;

					}

					// druidG.g:469:72: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					int alt212=2;
					int LA212_0 = input.LA(1);
					if ( (LA212_0==WS) ) {
						int LA212_1 = input.LA(2);
						if ( (LA212_1==ARITH_OPER) ) {
							alt212=1;
						}
					}
					else if ( (LA212_0==ARITH_OPER) ) {
						alt212=1;
					}
					switch (alt212) {
						case 1 :
							// druidG.g:469:73: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
							{
							// druidG.g:469:73: ( WS )?
							int alt210=2;
							int LA210_0 = input.LA(1);
							if ( (LA210_0==WS) ) {
								alt210=1;
							}
							switch (alt210) {
								case 1 :
									// druidG.g:469:73: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem3173); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggArithOper_in_postAggItem3176);
							postAggArithOper(postAggItem);
							state._fsp--;

							// druidG.g:469:107: ( WS )?
							int alt211=2;
							int LA211_0 = input.LA(1);
							if ( (LA211_0==WS) ) {
								alt211=1;
							}
							switch (alt211) {
								case 1 :
									// druidG.g:469:107: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem3179); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggItem_in_postAggItem3184);
							b=postAggItem();
							state._fsp--;

							}
							break;

					}

					}

					 if (b == null) {
						       postAggItem = a;
					             } else {
					             	postAggItem.fields = Arrays.asList(a, b);
					             }
					           
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "postAggItem"



	// $ANTLR start "simpleArith"
	// druidG.g:480:1: simpleArith returns [PostAggItem postAggItem] : (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? ;
	public final PostAggItem simpleArith() throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem a =null;
		PostAggItem b =null;

		  postAggItem = new PostAggItem("arithmetic"); 
		try {
			// druidG.g:482:2: ( (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? )
			// druidG.g:482:4: (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
			{
			// druidG.g:482:4: (a= simplePostAggAccess )
			// druidG.g:482:5: a= simplePostAggAccess
			{
			pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith3220);
			a=simplePostAggAccess();
			state._fsp--;

			postAggItem=a;
			}

			// druidG.g:482:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
			int alt216=2;
			alt216 = dfa216.predict(input);
			switch (alt216) {
				case 1 :
					// druidG.g:482:46: ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess
					{
					// druidG.g:482:46: ( WS )?
					int alt214=2;
					int LA214_0 = input.LA(1);
					if ( (LA214_0==WS) ) {
						alt214=1;
					}
					switch (alt214) {
						case 1 :
							// druidG.g:482:46: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleArith3226); 
							}
							break;

					}

					pushFollow(FOLLOW_postAggArithOper_in_simpleArith3229);
					postAggArithOper(postAggItem);
					state._fsp--;

					// druidG.g:482:80: ( WS )?
					int alt215=2;
					int LA215_0 = input.LA(1);
					if ( (LA215_0==WS) ) {
						alt215=1;
					}
					switch (alt215) {
						case 1 :
							// druidG.g:482:80: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleArith3232); 
							}
							break;

					}

					pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith3237);
					b=simplePostAggAccess();
					state._fsp--;


						    postAggItem = new PostAggItem("arithmetic"); 
						    if (postAggItem.fields == null) {
						       postAggItem.fields = new ArrayList<>();
						    }
					            postAggItem.fields.add(a);
						    postAggItem.fields.add(b);
						   
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "simpleArith"



	// $ANTLR start "simplePostAggAccess"
	// druidG.g:494:1: simplePostAggAccess returns [PostAggItem postAggItem] : (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef );
	public final PostAggItem simplePostAggAccess() throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem c =null;
		PostAggItem f =null;
		PostAggItem h =null;
		PostAggItem js =null;

		try {
			// druidG.g:495:2: (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef )
			int alt217=4;
			switch ( input.LA(1) ) {
			case FLOAT:
			case LONG:
				{
				alt217=1;
				}
				break;
			case ID:
				{
				alt217=2;
				}
				break;
			case UNIQUE:
				{
				alt217=3;
				}
				break;
			case JAVASCRIPT:
				{
				alt217=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 217, 0, input);
				throw nvae;
			}
			switch (alt217) {
				case 1 :
					// druidG.g:495:4: c= constantAccess
					{
					pushFollow(FOLLOW_constantAccess_in_simplePostAggAccess3266);
					c=constantAccess();
					state._fsp--;

					postAggItem = c;
					}
					break;
				case 2 :
					// druidG.g:496:4: f= fieldAccess
					{
					pushFollow(FOLLOW_fieldAccess_in_simplePostAggAccess3283);
					f=fieldAccess();
					state._fsp--;

					postAggItem = f;
					}
					break;
				case 3 :
					// druidG.g:497:4: h= hyperUniqueCardinality
					{
					pushFollow(FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess3296);
					h=hyperUniqueCardinality();
					state._fsp--;

					postAggItem = h;
					}
					break;
				case 4 :
					// druidG.g:498:4: js= postAggJavascriptDef
					{
					pushFollow(FOLLOW_postAggJavascriptDef_in_simplePostAggAccess3305);
					js=postAggJavascriptDef();
					state._fsp--;

					postAggItem = js;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "simplePostAggAccess"



	// $ANTLR start "constantAccess"
	// druidG.g:503:1: constantAccess returns [PostAggItem postAggItem] : ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) ;
	public final PostAggItem constantAccess() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("constant"); 
		try {
			// druidG.g:505:2: ( ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) )
			// druidG.g:505:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
			{
			// druidG.g:505:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
			// druidG.g:505:5: (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )?
			{
			// druidG.g:505:5: (a= FLOAT |a= LONG )
			int alt218=2;
			int LA218_0 = input.LA(1);
			if ( (LA218_0==FLOAT) ) {
				alt218=1;
			}
			else if ( (LA218_0==LONG) ) {
				alt218=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 218, 0, input);
				throw nvae;
			}

			switch (alt218) {
				case 1 :
					// druidG.g:505:6: a= FLOAT
					{
					a=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constantAccess3335); 
					}
					break;
				case 2 :
					// druidG.g:505:16: a= LONG
					{
					a=(Token)match(input,LONG,FOLLOW_LONG_in_constantAccess3341); 
					}
					break;

			}

			postAggItem.constantValue = Double.valueOf((a!=null?a.getText():null));
			// druidG.g:507:5: ( WS postAggLabel[postAggItem] )?
			int alt219=2;
			int LA219_0 = input.LA(1);
			if ( (LA219_0==WS) ) {
				int LA219_1 = input.LA(2);
				if ( (LA219_1==AS) ) {
					alt219=1;
				}
			}
			switch (alt219) {
				case 1 :
					// druidG.g:507:6: WS postAggLabel[postAggItem]
					{
					match(input,WS,FOLLOW_WS_in_constantAccess3354); 
					pushFollow(FOLLOW_postAggLabel_in_constantAccess3356);
					postAggLabel(postAggItem);
					state._fsp--;

					}
					break;

			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "constantAccess"



	// $ANTLR start "fieldAccess"
	// druidG.g:510:1: fieldAccess returns [PostAggItem postAggItem] : (a= ID ( WS postAggLabel[postAggItem] )? ) ;
	public final PostAggItem fieldAccess() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("fieldAccess"); 
		try {
			// druidG.g:512:2: ( (a= ID ( WS postAggLabel[postAggItem] )? ) )
			// druidG.g:512:4: (a= ID ( WS postAggLabel[postAggItem] )? )
			{
			// druidG.g:512:4: (a= ID ( WS postAggLabel[postAggItem] )? )
			// druidG.g:512:5: a= ID ( WS postAggLabel[postAggItem] )?
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_fieldAccess3384); 
			// druidG.g:512:10: ( WS postAggLabel[postAggItem] )?
			int alt220=2;
			int LA220_0 = input.LA(1);
			if ( (LA220_0==WS) ) {
				int LA220_1 = input.LA(2);
				if ( (LA220_1==AS) ) {
					alt220=1;
				}
			}
			switch (alt220) {
				case 1 :
					// druidG.g:512:11: WS postAggLabel[postAggItem]
					{
					match(input,WS,FOLLOW_WS_in_fieldAccess3387); 
					pushFollow(FOLLOW_postAggLabel_in_fieldAccess3389);
					postAggLabel(postAggItem);
					state._fsp--;

					}
					break;

			}

			}

			postAggItem.fieldName = (a!=null?a.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "fieldAccess"



	// $ANTLR start "hyperUniqueCardinality"
	// druidG.g:515:1: hyperUniqueCardinality returns [PostAggItem postAggItem] : ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) ;
	public final PostAggItem hyperUniqueCardinality() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("hyperUniqueCardinality"); 
		try {
			// druidG.g:517:2: ( ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) )
			// druidG.g:517:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
			{
			// druidG.g:517:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
			// druidG.g:517:5: UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN
			{
			match(input,UNIQUE,FOLLOW_UNIQUE_in_hyperUniqueCardinality3418); 
			// druidG.g:517:12: ( WS )?
			int alt221=2;
			int LA221_0 = input.LA(1);
			if ( (LA221_0==WS) ) {
				alt221=1;
			}
			switch (alt221) {
				case 1 :
					// druidG.g:517:12: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality3420); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_hyperUniqueCardinality3423); 
			// druidG.g:517:23: ( WS )?
			int alt222=2;
			int LA222_0 = input.LA(1);
			if ( (LA222_0==WS) ) {
				alt222=1;
			}
			switch (alt222) {
				case 1 :
					// druidG.g:517:23: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality3425); 
					}
					break;

			}

			a=(Token)match(input,ID,FOLLOW_ID_in_hyperUniqueCardinality3430); 
			// druidG.g:517:32: ( WS )?
			int alt223=2;
			int LA223_0 = input.LA(1);
			if ( (LA223_0==WS) ) {
				alt223=1;
			}
			switch (alt223) {
				case 1 :
					// druidG.g:517:32: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality3432); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_hyperUniqueCardinality3435); 
			postAggItem.fieldName = (a!=null?a.getText():null);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "hyperUniqueCardinality"



	// $ANTLR start "postAggJavascriptDef"
	// druidG.g:522:1: postAggJavascriptDef returns [PostAggItem postAggItem] : JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING ;
	public final PostAggItem postAggJavascriptDef() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token str=null;

		  postAggItem = new PostAggItem("javascript"); 
		try {
			// druidG.g:524:2: ( JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING )
			// druidG.g:524:4: JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING
			{
			match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_postAggJavascriptDef3461); 
			// druidG.g:524:15: ( WS )?
			int alt224=2;
			int LA224_0 = input.LA(1);
			if ( (LA224_0==WS) ) {
				alt224=1;
			}
			switch (alt224) {
				case 1 :
					// druidG.g:524:15: WS
					{
					match(input,WS,FOLLOW_WS_in_postAggJavascriptDef3463); 
					}
					break;

			}

			str=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef3468); 
			postAggItem.parseToJs((str!=null?str.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "postAggJavascriptDef"



	// $ANTLR start "postAggLabel"
	// druidG.g:527:1: postAggLabel[PostAggItem postAggItem] : ( AS WS id= ID ) ;
	public final void postAggLabel(PostAggItem postAggItem) throws RecognitionException {
		Token id=null;

		try {
			// druidG.g:528:2: ( ( AS WS id= ID ) )
			// druidG.g:528:4: ( AS WS id= ID )
			{
			// druidG.g:528:4: ( AS WS id= ID )
			// druidG.g:528:5: AS WS id= ID
			{
			match(input,AS,FOLLOW_AS_in_postAggLabel3484); 
			match(input,WS,FOLLOW_WS_in_postAggLabel3486); 
			id=(Token)match(input,ID,FOLLOW_ID_in_postAggLabel3490); 
			}

			postAggItem.name = (id!=null?id.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "postAggLabel"



	// $ANTLR start "postAggArithOper"
	// druidG.g:531:1: postAggArithOper[PostAggItem postAggItem] : arith= ARITH_OPER ;
	public final void postAggArithOper(PostAggItem postAggItem) throws RecognitionException {
		Token arith=null;

		try {
			// druidG.g:532:2: (arith= ARITH_OPER )
			// druidG.g:532:3: arith= ARITH_OPER
			{
			arith=(Token)match(input,ARITH_OPER,FOLLOW_ARITH_OPER_in_postAggArithOper3506); 
			postAggItem.fn = (arith!=null?arith.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "postAggArithOper"


	public static class isoTime_return extends ParserRuleReturnScope {
		public String date;
	};


	// $ANTLR start "isoTime"
	// druidG.g:537:1: isoTime returns [String date] : (d= DATE_YEAR_ONLY |d= DATE_YEAR_MONTH_ONLY |d= DATE |d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ );
	public final druidGParser.isoTime_return isoTime() throws RecognitionException {
		druidGParser.isoTime_return retval = new druidGParser.isoTime_return();
		retval.start = input.LT(1);

		Token d=null;

		try {
			// druidG.g:538:2: (d= DATE_YEAR_ONLY |d= DATE_YEAR_MONTH_ONLY |d= DATE |d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ )
			int alt225=9;
			switch ( input.LA(1) ) {
			case DATE_YEAR_ONLY:
				{
				alt225=1;
				}
				break;
			case DATE_YEAR_MONTH_ONLY:
				{
				alt225=2;
				}
				break;
			case DATE:
				{
				alt225=3;
				}
				break;
			case DATE_HOUR:
				{
				alt225=4;
				}
				break;
			case DATE_HOUR_MIN:
				{
				alt225=5;
				}
				break;
			case DATE_HOUR_MIN_SEC:
				{
				alt225=6;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB:
				{
				alt225=7;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB_TZ:
				{
				alt225=8;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB_UTC_TZ:
				{
				alt225=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 225, 0, input);
				throw nvae;
			}
			switch (alt225) {
				case 1 :
					// druidG.g:538:3: d= DATE_YEAR_ONLY
					{
					d=(Token)match(input,DATE_YEAR_ONLY,FOLLOW_DATE_YEAR_ONLY_in_isoTime3525); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 2 :
					// druidG.g:539:3: d= DATE_YEAR_MONTH_ONLY
					{
					d=(Token)match(input,DATE_YEAR_MONTH_ONLY,FOLLOW_DATE_YEAR_MONTH_ONLY_in_isoTime3533); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 3 :
					// druidG.g:540:3: d= DATE
					{
					d=(Token)match(input,DATE,FOLLOW_DATE_in_isoTime3541); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 4 :
					// druidG.g:541:3: d= DATE_HOUR
					{
					d=(Token)match(input,DATE_HOUR,FOLLOW_DATE_HOUR_in_isoTime3549); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 5 :
					// druidG.g:542:3: d= DATE_HOUR_MIN
					{
					d=(Token)match(input,DATE_HOUR_MIN,FOLLOW_DATE_HOUR_MIN_in_isoTime3557); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 6 :
					// druidG.g:543:3: d= DATE_HOUR_MIN_SEC
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC,FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime3565); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 7 :
					// druidG.g:544:3: d= DATE_HOUR_MIN_SEC_SUB
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB,FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime3573); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 8 :
					// druidG.g:545:3: d= DATE_HOUR_MIN_SEC_SUB_TZ
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB_TZ,FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime3581); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 9 :
					// druidG.g:546:3: d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB_UTC_TZ,FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime3589); 
					retval.date = (d!=null?d.getText():null);
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "isoTime"

	// Delegated rules


	protected DFA183 dfa183 = new DFA183(this);
	protected DFA193 dfa193 = new DFA193(this);
	protected DFA216 dfa216 = new DFA216(this);
	static final String DFA183_eotS =
		"\176\uffff";
	static final String DFA183_eofS =
		"\12\uffff\1\24\1\uffff\1\24\2\uffff\1\24\1\uffff\3\24\3\uffff\2\24\5\uffff"+
		"\2\24\3\uffff\2\24\3\uffff\1\24\15\uffff\1\24\17\uffff\1\24\67\uffff";
	static final String DFA183_minS =
		"\1\47\1\14\1\127\1\14\2\41\1\47\3\41\1\102\1\41\1\102\1\14\1\41\1\102"+
		"\1\41\2\102\1\4\3\uffff\1\102\1\4\3\uffff\1\14\1\41\1\102\1\4\3\uffff"+
		"\1\102\1\4\3\uffff\1\4\15\uffff\1\4\15\uffff\2\41\1\102\67\uffff";
	static final String DFA183_maxS =
		"\1\75\2\127\1\36\2\127\1\47\2\127\1\65\1\127\1\115\2\127\1\65\1\127\1"+
		"\115\2\127\1\126\3\uffff\1\127\1\126\3\uffff\1\14\2\127\1\126\3\uffff"+
		"\1\127\1\126\3\uffff\1\126\15\uffff\1\126\15\uffff\1\127\1\65\1\127\67"+
		"\uffff";
	static final String DFA183_acceptS =
		"\24\uffff\1\1\35\uffff\1\2\24\uffff\1\1\15\uffff\1\1\41\uffff\4\1\3\uffff";
	static final String DFA183_specialS =
		"\176\uffff}>";
	static final String[] DFA183_transitionS = {
			"\1\1\25\uffff\1\2",
			"\1\4\21\uffff\1\5\70\uffff\1\3",
			"\1\6",
			"\1\7\21\uffff\1\10",
			"\1\12\23\uffff\1\12\41\uffff\1\11",
			"\1\14\23\uffff\1\14\27\uffff\1\14\11\uffff\1\13",
			"\1\15",
			"\1\17\23\uffff\1\17\41\uffff\1\16",
			"\1\21\23\uffff\1\21\27\uffff\1\21\11\uffff\1\20",
			"\1\22\23\uffff\1\22",
			"\1\24\7\uffff\1\24\14\uffff\1\23",
			"\1\27\23\uffff\1\27\27\uffff\1\27",
			"\1\24\7\uffff\1\24\14\uffff\1\30",
			"\1\35\112\uffff\1\34",
			"\1\36\23\uffff\1\36",
			"\1\24\7\uffff\1\24\14\uffff\1\37",
			"\1\43\23\uffff\1\43\27\uffff\1\43",
			"\1\24\7\uffff\1\24\14\uffff\1\44",
			"\1\24\7\uffff\1\24\14\uffff\1\50",
			"\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"+
			"\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
			"",
			"",
			"",
			"\1\24\7\uffff\1\24\14\uffff\1\66",
			"\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"+
			"\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
			"",
			"",
			"",
			"\1\104",
			"\1\106\23\uffff\1\106\41\uffff\1\105",
			"\1\24\7\uffff\1\24\14\uffff\1\107",
			"\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"+
			"\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
			"",
			"",
			"",
			"\1\24\7\uffff\1\24\14\uffff\1\125",
			"\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"+
			"\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
			"",
			"",
			"",
			"\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"+
			"\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"+
			"\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\170\23\uffff\1\170\41\uffff\1\167",
			"\1\171\23\uffff\1\171",
			"\1\24\7\uffff\1\24\14\uffff\1\172",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA183_eot = DFA.unpackEncodedString(DFA183_eotS);
	static final short[] DFA183_eof = DFA.unpackEncodedString(DFA183_eofS);
	static final char[] DFA183_min = DFA.unpackEncodedStringToUnsignedChars(DFA183_minS);
	static final char[] DFA183_max = DFA.unpackEncodedStringToUnsignedChars(DFA183_maxS);
	static final short[] DFA183_accept = DFA.unpackEncodedString(DFA183_acceptS);
	static final short[] DFA183_special = DFA.unpackEncodedString(DFA183_specialS);
	static final short[][] DFA183_transition;

	static {
		int numStates = DFA183_transitionS.length;
		DFA183_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA183_transition[i] = DFA.unpackEncodedString(DFA183_transitionS[i]);
		}
	}

	protected class DFA183 extends DFA {

		public DFA183(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 183;
			this.eot = DFA183_eot;
			this.eof = DFA183_eof;
			this.min = DFA183_min;
			this.max = DFA183_max;
			this.accept = DFA183_accept;
			this.special = DFA183_special;
			this.transition = DFA183_transition;
		}
		@Override
		public String getDescription() {
			return "375:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );";
		}
	}

	static final String DFA193_eotS =
		"\164\uffff";
	static final String DFA193_eofS =
		"\15\uffff\1\30\7\uffff\3\30\11\uffff\3\30\3\uffff\1\30\30\uffff\1\30\63"+
		"\uffff";
	static final String DFA193_minS =
		"\1\47\1\36\1\47\1\uffff\1\36\1\41\1\47\1\36\2\uffff\1\127\2\41\1\102\1"+
		"\36\2\uffff\1\36\1\41\1\115\1\41\2\102\1\4\3\uffff\1\36\1\41\1\127\2\41"+
		"\1\112\2\102\1\4\3\uffff\1\4\3\uffff\1\127\13\uffff\1\127\2\41\1\112\1"+
		"\115\1\41\2\112\1\4\1\102\63\uffff";
	static final String DFA193_maxS =
		"\1\75\2\127\1\uffff\1\63\1\127\1\75\1\127\2\uffff\2\127\1\115\2\127\2"+
		"\uffff\1\63\1\127\2\115\2\127\1\126\3\uffff\1\63\3\127\1\115\3\127\1\126"+
		"\3\uffff\1\126\3\uffff\1\127\13\uffff\2\127\1\115\1\127\2\115\2\127\1"+
		"\112\1\127\63\uffff";
	static final String DFA193_acceptS =
		"\3\uffff\1\2\24\uffff\1\1\50\uffff\1\1\3\uffff\1\1\3\uffff\1\1\13\uffff"+
		"\1\1\13\uffff\15\1\1\uffff\2\1\3\uffff";
	static final String DFA193_specialS =
		"\164\uffff}>";
	static final String[] DFA193_transitionS = {
			"\1\1\17\uffff\1\2\5\uffff\1\3",
			"\1\5\70\uffff\1\4",
			"\1\7\17\uffff\1\3\5\uffff\1\3\31\uffff\1\6",
			"",
			"\1\13\24\uffff\1\12",
			"\1\15\23\uffff\1\15\27\uffff\1\15\11\uffff\1\14",
			"\1\16\17\uffff\1\3\5\uffff\1\3",
			"\1\22\70\uffff\1\21",
			"",
			"",
			"\1\23",
			"\1\25\23\uffff\1\25\27\uffff\1\25\11\uffff\1\24",
			"\1\26\23\uffff\1\26\27\uffff\1\26",
			"\1\30\7\uffff\1\30\14\uffff\1\27",
			"\1\34\70\uffff\1\33",
			"",
			"",
			"\1\36\24\uffff\1\35",
			"\1\40\23\uffff\1\40\27\uffff\1\40\11\uffff\1\37",
			"\1\41",
			"\1\42\23\uffff\1\42\27\uffff\1\42",
			"\1\30\7\uffff\1\30\14\uffff\1\43",
			"\1\30\7\uffff\1\30\14\uffff\1\47",
			"\1\53\5\uffff\1\30\30\uffff\1\30\2\uffff\1\30\10\uffff\1\30\2\uffff"+
			"\1\30\1\uffff\1\30\15\uffff\1\30\1\53\1\30\3\uffff\1\30\1\uffff\1\30"+
			"\6\uffff\1\30\4\uffff\1\30",
			"",
			"",
			"",
			"\1\70\24\uffff\1\67",
			"\1\72\23\uffff\1\72\27\uffff\1\72\11\uffff\1\71",
			"\1\73",
			"\1\75\23\uffff\1\75\27\uffff\1\75\11\uffff\1\74",
			"\1\76\23\uffff\1\76\27\uffff\1\76",
			"\1\100\14\uffff\1\77",
			"\1\30\7\uffff\1\30\14\uffff\1\101",
			"\1\30\7\uffff\1\30\14\uffff\1\105",
			"\1\111\5\uffff\1\30\30\uffff\1\30\2\uffff\1\30\10\uffff\1\30\2\uffff"+
			"\1\30\1\uffff\1\30\15\uffff\1\30\1\111\1\30\3\uffff\1\30\1\uffff\1\30"+
			"\6\uffff\1\30\4\uffff\1\30",
			"",
			"",
			"",
			"\1\125\5\uffff\1\30\30\uffff\1\30\2\uffff\1\30\10\uffff\1\30\2\uffff"+
			"\1\30\1\uffff\1\30\15\uffff\1\30\1\125\1\30\3\uffff\1\30\1\uffff\1\30"+
			"\6\uffff\1\30\4\uffff\1\30",
			"",
			"",
			"",
			"\1\141",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\142",
			"\1\144\23\uffff\1\144\27\uffff\1\144\11\uffff\1\143",
			"\1\145\23\uffff\1\145\27\uffff\1\145",
			"\1\147\14\uffff\1\146",
			"\1\150",
			"\1\151\23\uffff\1\151\27\uffff\1\151",
			"\1\153\14\uffff\1\152",
			"\1\155\14\uffff\1\154",
			"\1\3\76\uffff\1\3\6\uffff\1\157",
			"\1\30\7\uffff\1\30\14\uffff\1\160",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA193_eot = DFA.unpackEncodedString(DFA193_eotS);
	static final short[] DFA193_eof = DFA.unpackEncodedString(DFA193_eofS);
	static final char[] DFA193_min = DFA.unpackEncodedStringToUnsignedChars(DFA193_minS);
	static final char[] DFA193_max = DFA.unpackEncodedStringToUnsignedChars(DFA193_maxS);
	static final short[] DFA193_accept = DFA.unpackEncodedString(DFA193_acceptS);
	static final short[] DFA193_special = DFA.unpackEncodedString(DFA193_specialS);
	static final short[][] DFA193_transition;

	static {
		int numStates = DFA193_transitionS.length;
		DFA193_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA193_transition[i] = DFA.unpackEncodedString(DFA193_transitionS[i]);
		}
	}

	protected class DFA193 extends DFA {

		public DFA193(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 193;
			this.eot = DFA193_eot;
			this.eof = DFA193_eof;
			this.min = DFA193_min;
			this.max = DFA193_max;
			this.accept = DFA193_accept;
			this.special = DFA193_special;
			this.transition = DFA193_transition;
		}
		@Override
		public String getDescription() {
			return "421:4: (a= simpleFilter |a= simpleLogicalFilter )";
		}
	}

	static final String DFA216_eotS =
		"\134\uffff";
	static final String DFA216_eofS =
		"\2\3\132\uffff";
	static final String DFA216_minS =
		"\2\5\1\41\6\uffff\1\41\3\uffff\1\41\3\uffff\1\67\1\115\1\uffff\1\41\3"+
		"\uffff\1\67\1\115\4\uffff\1\67\1\115\1\uffff\1\67\1\47\1\115\4\uffff\1"+
		"\67\1\115\1\uffff\1\67\1\47\1\115\1\uffff\1\67\1\47\1\115\1\uffff\2\47"+
		"\1\112\1\uffff\1\67\1\47\1\115\1\uffff\2\47\1\112\1\uffff\2\47\1\112\1"+
		"\uffff\1\47\3\112\25\uffff";
	static final String DFA216_maxS =
		"\1\127\1\126\1\127\6\uffff\1\127\3\uffff\1\123\3\uffff\2\127\1\uffff\1"+
		"\123\3\uffff\2\127\4\uffff\2\127\1\uffff\1\67\1\127\1\115\4\uffff\2\127"+
		"\1\uffff\1\67\1\127\1\115\1\uffff\1\67\1\127\1\115\1\uffff\1\127\1\47"+
		"\1\127\1\uffff\1\67\1\127\1\115\1\uffff\1\127\1\47\1\127\1\uffff\1\127"+
		"\1\47\1\127\1\uffff\1\47\2\127\1\112\25\uffff";
	static final String DFA216_acceptS =
		"\3\uffff\1\2\12\uffff\3\1\4\uffff\3\1\3\uffff\3\1\6\uffff\4\1\6\uffff"+
		"\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\4\uffff"+
		"\25\1";
	static final String DFA216_specialS =
		"\134\uffff}>";
	static final String[] DFA216_transitionS = {
			"\1\2\74\uffff\1\3\7\uffff\1\3\14\uffff\1\1",
			"\1\11\40\uffff\1\3\10\uffff\1\3\2\uffff\1\3\17\uffff\1\3\5\uffff\1\3"+
			"\1\uffff\1\3\13\uffff\1\3",
			"\1\16\5\uffff\1\20\6\uffff\1\22\6\uffff\1\17\1\uffff\1\3\33\uffff\1"+
			"\21\3\uffff\1\15",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\25\5\uffff\1\27\6\uffff\1\31\6\uffff\1\26\1\uffff\1\3\33\uffff\1"+
			"\30\3\uffff\1\24",
			"",
			"",
			"",
			"\1\33\5\uffff\1\35\6\uffff\1\37\6\uffff\1\34\1\uffff\1\3\33\uffff\1"+
			"\36",
			"",
			"",
			"",
			"\1\42\37\uffff\1\41",
			"\1\44\11\uffff\1\43",
			"",
			"\1\45\5\uffff\1\47\6\uffff\1\51\6\uffff\1\46\1\uffff\1\3\33\uffff\1"+
			"\50",
			"",
			"",
			"",
			"\1\54\37\uffff\1\53",
			"\1\56\11\uffff\1\55",
			"",
			"",
			"",
			"",
			"\1\60\37\uffff\1\57",
			"\1\62\11\uffff\1\61",
			"",
			"\1\63",
			"\1\65\57\uffff\1\64",
			"\1\66",
			"",
			"",
			"",
			"",
			"\1\70\37\uffff\1\67",
			"\1\72\11\uffff\1\71",
			"",
			"\1\73",
			"\1\75\57\uffff\1\74",
			"\1\76",
			"",
			"\1\77",
			"\1\101\57\uffff\1\100",
			"\1\102",
			"",
			"\1\104\57\uffff\1\103",
			"\1\105",
			"\1\107\14\uffff\1\106",
			"",
			"\1\110",
			"\1\112\57\uffff\1\111",
			"\1\113",
			"",
			"\1\115\57\uffff\1\114",
			"\1\116",
			"\1\120\14\uffff\1\117",
			"",
			"\1\122\57\uffff\1\121",
			"\1\123",
			"\1\125\14\uffff\1\124",
			"",
			"\1\126",
			"\1\130\14\uffff\1\127",
			"\1\132\14\uffff\1\131",
			"\1\133",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA216_eot = DFA.unpackEncodedString(DFA216_eotS);
	static final short[] DFA216_eof = DFA.unpackEncodedString(DFA216_eofS);
	static final char[] DFA216_min = DFA.unpackEncodedStringToUnsignedChars(DFA216_minS);
	static final char[] DFA216_max = DFA.unpackEncodedStringToUnsignedChars(DFA216_maxS);
	static final short[] DFA216_accept = DFA.unpackEncodedString(DFA216_acceptS);
	static final short[] DFA216_special = DFA.unpackEncodedString(DFA216_specialS);
	static final short[][] DFA216_transition;

	static {
		int numStates = DFA216_transitionS.length;
		DFA216_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA216_transition[i] = DFA.unpackEncodedString(DFA216_transitionS[i]);
		}
	}

	protected class DFA216 extends DFA {

		public DFA216(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 216;
			this.eot = DFA216_eot;
			this.eof = DFA216_eof;
			this.min = DFA216_min;
			this.max = DFA216_max;
			this.accept = DFA216_accept;
			this.special = DFA216_special;
			this.transition = DFA216_transition;
		}
		@Override
		public String getDescription() {
			return "482:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?";
		}
	}

	public static final BitSet FOLLOW_grandQuery_in_program49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grandInsert_in_program61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grandDelete_in_program73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grandDrop_in_program85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStmnt_in_grandDelete113 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800006L});
	public static final BitSet FOLLOW_WS_in_grandDelete122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandDelete126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPT_AMPERSAND_in_grandDelete132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropStmnt_in_grandDrop164 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800006L});
	public static final BitSet FOLLOW_WS_in_grandDrop173 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandDrop177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPT_AMPERSAND_in_grandDrop183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStmnt_in_grandInsert214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertHStmnt_in_grandInsert226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertRTStmnt_in_grandInsert238 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800006L});
	public static final BitSet FOLLOW_WS_in_grandInsert247 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandInsert251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPT_AMPERSAND_in_grandInsert257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DELETE_in_deleteStmnt283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_deleteStmnt285 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_FROM_in_deleteStmnt287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_deleteStmnt289 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_deleteStmnt294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_deleteStmnt298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WHERE_in_deleteStmnt303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_deleteStmnt305 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_intervalClause_in_deleteStmnt309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_dropStmnt337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_dropStmnt339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_TABLE_in_dropStmnt341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_dropStmnt343 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_dropStmnt348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_insertStmnt375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt377 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_INTO_in_insertStmnt379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt381 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_insertStmnt386 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt391 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertStmnt394 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000880000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt396 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000080000L});
	public static final BitSet FOLLOW_selectItems_in_insertStmnt399 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_insertStmnt403 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_insertStmnt406 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000880000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt408 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000080000L});
	public static final BitSet FOLLOW_selectItems_in_insertStmnt411 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_insertStmnt416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_insertStmnt419 = new BitSet(new long[]{0x0000000400000000L,0x0000000000900000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt421 = new BitSet(new long[]{0x0000000400000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_VALUES_in_insertStmnt434 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt436 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertStmnt439 = new BitSet(new long[]{0x0020000200000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt441 = new BitSet(new long[]{0x0020000200000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_anyValue_in_insertStmnt447 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_insertStmnt454 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_insertStmnt457 = new BitSet(new long[]{0x0020000200000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt459 = new BitSet(new long[]{0x0020000200000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_anyValue_in_insertStmnt464 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_insertStmnt470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_insertStmnt473 = new BitSet(new long[]{0x0000000002000402L,0x0000000000A00000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt475 = new BitSet(new long[]{0x0000000002000402L,0x0000000000200000L});
	public static final BitSet FOLLOW_FROM_in_insertStmnt492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt504 = new BitSet(new long[]{0x0000000002000402L,0x0000000000200000L});
	public static final BitSet FOLLOW_WHERE_in_insertStmnt514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt516 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_intervalClause_in_insertStmnt520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt522 = new BitSet(new long[]{0x0000000002000402L});
	public static final BitSet FOLLOW_BREAK_in_insertStmnt530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt532 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_insertStmnt534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt540 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_DELIMITER_in_insertStmnt554 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt556 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertStmnt559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt566 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_insertStmnt570 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_insertStmnt573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_WS_in_insertStmnt586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_insertStmnt589 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_HADOOP_in_insertHStmnt615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt617 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_INTO_in_insertHStmnt619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt621 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_insertHStmnt626 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt631 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertHStmnt634 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000880000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt636 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000080000L});
	public static final BitSet FOLLOW_selectItems_in_insertHStmnt639 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt643 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_insertHStmnt646 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000880000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt648 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000080000L});
	public static final BitSet FOLLOW_selectItems_in_insertHStmnt651 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_insertHStmnt659 = new BitSet(new long[]{0x0000000400000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt661 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_FROM_in_insertHStmnt671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt683 = new BitSet(new long[]{0x0000000002000402L,0x0000000000200220L});
	public static final BitSet FOLLOW_WHERE_in_insertHStmnt688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt690 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_intervalClause_in_insertHStmnt694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt696 = new BitSet(new long[]{0x0000000002000402L,0x0000000000000220L});
	public static final BitSet FOLLOW_BREAK_in_insertHStmnt704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt706 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_insertHStmnt708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt714 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000220L});
	public static final BitSet FOLLOW_DELIMITER_in_insertHStmnt729 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt731 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertHStmnt734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt741 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt745 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_insertHStmnt748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_insertHStmnt764 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800220L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt766 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000220L});
	public static final BitSet FOLLOW_PARTITION_in_insertHStmnt775 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt777 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertHStmnt780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt787 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt789 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_insertHStmnt792 = new BitSet(new long[]{0x0020000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt794 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LONG_in_insertHStmnt799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_insertHStmnt806 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800200L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt808 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_ROLLUP_in_insertHStmnt816 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt818 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertHStmnt821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt828 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt830 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_insertHStmnt833 = new BitSet(new long[]{0x0020000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt835 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LONG_in_insertHStmnt840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_insertHStmnt847 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_REALTIME_in_insertRTStmnt872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt874 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_INTO_in_insertRTStmnt876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt878 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_insertRTStmnt883 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt888 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertRTStmnt891 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000880000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt893 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000080000L});
	public static final BitSet FOLLOW_selectItems_in_insertRTStmnt896 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt900 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_insertRTStmnt903 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000880000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt905 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000080000L});
	public static final BitSet FOLLOW_selectItems_in_insertRTStmnt908 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_insertRTStmnt916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000900000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_VALUES_in_insertRTStmnt924 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt926 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertRTStmnt929 = new BitSet(new long[]{0x0020000200000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt931 = new BitSet(new long[]{0x0020000200000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_anyValue_in_insertRTStmnt937 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt944 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_insertRTStmnt947 = new BitSet(new long[]{0x0020000200000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt949 = new BitSet(new long[]{0x0020000200000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_anyValue_in_insertRTStmnt954 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_insertRTStmnt963 = new BitSet(new long[]{0x0000000000000002L,0x0000000000A00000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt965 = new BitSet(new long[]{0x0000000000000002L,0x0000000000A00000L});
	public static final BitSet FOLLOW_WHERE_in_insertRTStmnt971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt973 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_intervalClause_in_insertRTStmnt977 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt985 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BREAK_in_insertRTStmnt987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt989 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_insertRTStmnt991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertRTStmnt997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_queryStmnt_in_grandQuery1031 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800004L});
	public static final BitSet FOLLOW_WS_in_grandQuery1041 = new BitSet(new long[]{0x0004800000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_set_in_grandQuery1045 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1066 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_grandQuery1069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000801000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_queryStmnt_in_grandQuery1077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_WS_in_grandQuery1082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_grandQuery1085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800001L});
	public static final BitSet FOLLOW_WS_in_grandQuery1087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ON_in_grandQuery1090 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1097 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_grandQuery1100 = new BitSet(new long[]{0x0000008000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1102 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_grandQuery1108 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_grandQuery1113 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_grandQuery1116 = new BitSet(new long[]{0x0000008000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1118 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_grandQuery1123 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_grandQuery1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_grandQuery1132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800004L});
	public static final BitSet FOLLOW_WS_in_grandQuery1151 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandQuery1154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_queryStmnt1177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1205 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000080000L});
	public static final BitSet FOLLOW_selectItems_in_queryStmnt1207 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1211 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_queryStmnt1214 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000880000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1216 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000080000L});
	public static final BitSet FOLLOW_selectItems_in_queryStmnt1219 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1250 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_queryStmnt1252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1267 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_FROM_in_queryStmnt1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1271 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt1275 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WHERE_in_queryStmnt1293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1295 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_whereClause_in_queryStmnt1297 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1315 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BREAK_in_queryStmnt1317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1319 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_queryStmnt1321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1323 = new BitSet(new long[]{0x0000000020000000L,0x0000000000002040L});
	public static final BitSet FOLLOW_granularityClause_in_queryStmnt1327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1344 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_GROUP_in_queryStmnt1346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1348 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_queryStmnt1350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1352 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt1378 = new BitSet(new long[]{0x0000000000000002L,0x0000000004800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1410 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_queryStmnt1413 = new BitSet(new long[]{0x0000008000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1415 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt1420 = new BitSet(new long[]{0x0000000000000002L,0x0000000004800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1477 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_HAVING_in_queryStmnt1479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1481 = new BitSet(new long[]{0x2000008000000000L});
	public static final BitSet FOLLOW_havingClause_in_queryStmnt1485 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_ORDER_in_queryStmnt1531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1533 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_queryStmnt1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1537 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt1542 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1575 = new BitSet(new long[]{0x0000000004000080L});
	public static final BitSet FOLLOW_set_in_queryStmnt1579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1629 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_LIMIT_in_queryStmnt1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1633 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LONG_in_queryStmnt1638 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_THEN_in_queryStmnt1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1680 = new BitSet(new long[]{0x00A0408200000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_postAggItem_in_queryStmnt1684 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_WHICH_in_queryStmnt1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1703 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CONTAINS_in_queryStmnt1705 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1709 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_queryStmnt1712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1720 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1724 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_queryStmnt1727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1734 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_queryStmnt1744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SORT_in_queryStmnt1752 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1754 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_queryStmnt1757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_queryStmnt1773 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1785 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_HINT_in_queryStmnt1787 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1789 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_queryStmnt1792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_queryStmnt1806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_anyValue1840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_anyValue1848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggItem_in_selectItems1871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDim_in_selectItems1881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_simpleDim1901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_simpleDim1904 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AS_in_simpleDim1906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_simpleDim1908 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_simpleDim1912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_intervalClause_in_whereClause1935 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_whereClause1940 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_whereClause1942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_whereClause1944 = new BitSet(new long[]{0x2080008000000000L});
	public static final BitSet FOLLOW_grandFilter_in_whereClause1948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_intervalClause1974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_intervalClause1976 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BETWEEN_in_intervalClause1978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_intervalClause1980 = new BitSet(new long[]{0x0080000000FF8000L,0x0000000000002000L});
	public static final BitSet FOLLOW_isoTime_in_intervalClause2000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause2007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2011 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_intervalClause2013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2015 = new BitSet(new long[]{0x0000000000FF8000L,0x0000000000002000L});
	public static final BitSet FOLLOW_isoTime_in_intervalClause2020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause2027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_intervalClause2053 = new BitSet(new long[]{0x0100000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2055 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_pairString_in_intervalClause2060 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_intervalClause2072 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_intervalClause2075 = new BitSet(new long[]{0x0100000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2077 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_pairString_in_intervalClause2082 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_intervalClause2088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_intervalClause2091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_getEquals2114 = new BitSet(new long[]{0x0000000040000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_getEquals2116 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_EQUALS_in_getEquals2119 = new BitSet(new long[]{0x0020000200000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_getEquals2121 = new BitSet(new long[]{0x0020000200000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_set_in_getEquals2127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DURATION_in_granularityClause2190 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2192 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityClause2195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2202 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_granularityClause2206 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_90_in_granularityClause2210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2217 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_granularityClause2225 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_granularityClause2228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_granularityInclude_in_granularityClause2235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_WS_in_granularityClause2239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_granularityClause2244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_granularityClause2263 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2265 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityClause2268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_granularityClause2279 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_90_in_granularityClause2283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2290 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_granularityClause2296 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_90_in_granularityClause2300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2307 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_granularityClause2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_granularityClause2319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_granularityInclude_in_granularityClause2326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_WS_in_granularityClause2330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_granularityClause2335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_granularityInclude2363 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_INCLUDE_in_granularityInclude2365 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_granularityInclude2367 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityInclude2370 = new BitSet(new long[]{0x0100000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_granularityInclude2372 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_pairNums_in_granularityInclude2378 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_90_in_granularityInclude2383 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_pairNums_in_granularityInclude2387 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_granularityInclude2394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_granularityInclude2397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSQUARE_in_pairNums2416 = new BitSet(new long[]{0x0020000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_pairNums2418 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LONG_in_pairNums2423 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800000L});
	public static final BitSet FOLLOW_WS_in_pairNums2426 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_pairNums2429 = new BitSet(new long[]{0x0020000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_pairNums2431 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LONG_in_pairNums2436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800800L});
	public static final BitSet FOLLOW_WS_in_pairNums2438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RSQUARE_in_pairNums2441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSQUARE_in_pairString2461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_pairString2463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString2468 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800000L});
	public static final BitSet FOLLOW_WS_in_pairString2471 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_pairString2474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_pairString2476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString2481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800800L});
	public static final BitSet FOLLOW_WS_in_pairString2483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RSQUARE_in_pairString2486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_complexHaving_in_havingClause2511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_simpleHaving2532 = new BitSet(new long[]{0x0000000000001000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2534 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving2539 = new BitSet(new long[]{0x0020000200000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2541 = new BitSet(new long[]{0x0020000200000000L});
	public static final BitSet FOLLOW_set_in_simpleHaving2546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getEquals_in_simpleHaving2563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_simpleHaving2574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2576 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_simpleHaving2580 = new BitSet(new long[]{0x0000000000001000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2582 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving2587 = new BitSet(new long[]{0x0020000200000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2589 = new BitSet(new long[]{0x0020000200000000L});
	public static final BitSet FOLLOW_set_in_simpleHaving2594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleHaving_in_complexHaving2622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleHaving_in_complexHaving2633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_complexHaving2635 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_complexHaving2639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_complexHaving2645 = new BitSet(new long[]{0x2000008000000000L});
	public static final BitSet FOLLOW_complexHaving_in_complexHaving2649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getEquals_in_selectorFilter2686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_regexFilter2715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_regexFilter2717 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_LIKE_in_regexFilter2719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_regexFilter2721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter2727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectorFilter_in_simpleFilter2752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_regexFilter_in_simpleFilter2758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_simpleFilter2768 = new BitSet(new long[]{0x0000008000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_simpleFilter2770 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_selectorFilter_in_simpleFilter2776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_regexFilter_in_simpleFilter2782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_WS_in_simpleFilter2785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_simpleFilter2788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2811 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_simpleLogicalFilter2815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2821 = new BitSet(new long[]{0x0080008000000000L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_simpleLogicalFilter2833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2835 = new BitSet(new long[]{0x0080008000000000L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_simpleLogicalFilter2852 = new BitSet(new long[]{0x2080008000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2854 = new BitSet(new long[]{0x2080008000000000L});
	public static final BitSet FOLLOW_simpleLogicalFilter_in_simpleLogicalFilter2859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_simpleLogicalFilter2864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleFilter_in_grandFilter2888 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_simpleLogicalFilter_in_grandFilter2894 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_grandFilter2901 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_grandFilter2905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_grandFilter2911 = new BitSet(new long[]{0x2080008000000000L});
	public static final BitSet FOLLOW_grandFilter_in_grandFilter2915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggCallSite_in_aggItem2952 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_aggItem2956 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AS_in_aggItem2958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_aggItem2960 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_aggItem2964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggFunc_in_aggCallSite2983 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_aggCallSite2988 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_aggCallSite2991 = new BitSet(new long[]{0x0000008000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_aggCallSite2993 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_aggCallSite3000 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_aggCallSite3006 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_aggCallSite3009 = new BitSet(new long[]{0x0000008000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_aggCallSite3011 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_aggCallSite3016 = new BitSet(new long[]{0x0000000000000000L,0x0000000004800400L});
	public static final BitSet FOLLOW_WS_in_aggCallSite3022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_aggCallSite3025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_aggCallSite3032 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_aggCallSite3037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_SUM_in_aggFunc3055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_SUM_in_aggFunc3062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIQUE_in_aggFunc3069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MIN_in_aggFunc3076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAX_in_aggFunc3083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_aggFunc3090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleArith_in_postAggItem3118 = new BitSet(new long[]{0x0000000000000022L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3122 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_postAggItem3125 = new BitSet(new long[]{0x00A0408200000000L,0x0000000000880000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3128 = new BitSet(new long[]{0x00A0408200000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem3133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_postAggItem3151 = new BitSet(new long[]{0x00A0408200000000L,0x0000000000880000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3153 = new BitSet(new long[]{0x00A0408200000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem3158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_WS_in_postAggItem3160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_postAggItem3163 = new BitSet(new long[]{0x0000000000000062L,0x0000000000800000L});
	public static final BitSet FOLLOW_postAggLabel_in_postAggItem3167 = new BitSet(new long[]{0x0000000000000022L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3173 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_postAggItem3176 = new BitSet(new long[]{0x00A0408200000000L,0x0000000000880000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3179 = new BitSet(new long[]{0x00A0408200000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem3184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith3220 = new BitSet(new long[]{0x0000000000000022L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_simpleArith3226 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_simpleArith3229 = new BitSet(new long[]{0x0020408200000000L,0x0000000000880000L});
	public static final BitSet FOLLOW_WS_in_simpleArith3232 = new BitSet(new long[]{0x0020408200000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith3237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantAccess_in_simplePostAggAccess3266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldAccess_in_simplePostAggAccess3283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess3296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postAggJavascriptDef_in_simplePostAggAccess3305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constantAccess3335 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_LONG_in_constantAccess3341 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_constantAccess3354 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_postAggLabel_in_constantAccess3356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fieldAccess3384 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_fieldAccess3387 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_postAggLabel_in_fieldAccess3389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIQUE_in_hyperUniqueCardinality3418 = new BitSet(new long[]{0x0080000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality3420 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_hyperUniqueCardinality3423 = new BitSet(new long[]{0x0000008000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality3425 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_hyperUniqueCardinality3430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality3432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPARAN_in_hyperUniqueCardinality3435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_postAggJavascriptDef3461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
	public static final BitSet FOLLOW_WS_in_postAggJavascriptDef3463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef3468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_postAggLabel3484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WS_in_postAggLabel3486 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_postAggLabel3490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARITH_OPER_in_postAggArithOper3506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_YEAR_ONLY_in_isoTime3525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_YEAR_MONTH_ONLY_in_isoTime3533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_isoTime3541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_in_isoTime3549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_in_isoTime3557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime3565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime3573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime3581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime3589 = new BitSet(new long[]{0x0000000000000002L});
}
