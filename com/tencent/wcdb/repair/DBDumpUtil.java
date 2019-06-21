package com.tencent.wcdb.repair;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.io.PrintStream;
import java.util.ArrayList;

public class DBDumpUtil
{
  private static final String TAG = "WCDB.DBDumpUtil";

  public static String buildColumnsString(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(12650);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      paramArrayList = "";
      AppMethodBeat.o(12650);
    }
    while (true)
    {
      return paramArrayList;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("(");
      for (int i = 0; i < paramArrayList.size(); i++)
      {
        localStringBuilder.append((String)paramArrayList.get(i));
        if (i != paramArrayList.size() - 1)
          localStringBuilder.append(",");
      }
      localStringBuilder.append(")");
      paramArrayList = localStringBuilder.toString();
      System.out.println(paramArrayList);
      AppMethodBeat.o(12650);
    }
  }

  public static boolean doRecoveryDb(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(12648);
    boolean bool = doRecoveryDb(paramSQLiteDatabase, paramString1, paramString2, paramString3, null, null, null, true);
    AppMethodBeat.o(12648);
    return bool;
  }

  // ERROR //
  public static boolean doRecoveryDb(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, java.util.List<String> paramList1, java.util.List<String> paramList2, ExecuteSqlCallback paramExecuteSqlCallback, boolean paramBoolean)
  {
    // Byte code:
    //   0: sipush 12649
    //   3: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ifnull +10 -> 17
    //   10: aload_0
    //   11: invokevirtual 89	com/tencent/wcdb/database/SQLiteDatabase:isOpen	()Z
    //   14: ifne +22 -> 36
    //   17: ldc 11
    //   19: ldc 91
    //   21: invokestatic 97	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: iconst_0
    //   25: istore 7
    //   27: sipush 12649
    //   30: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   33: iload 7
    //   35: ireturn
    //   36: aload_1
    //   37: aload_2
    //   38: aload_3
    //   39: invokestatic 101	com/tencent/wcdb/repair/DBDumpUtil:nativeDumpDB	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    //   42: ifne +15 -> 57
    //   45: iconst_0
    //   46: istore 7
    //   48: sipush 12649
    //   51: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   54: goto -21 -> 33
    //   57: new 103	java/io/BufferedReader
    //   60: astore 8
    //   62: new 105	java/io/FileReader
    //   65: astore_2
    //   66: aload_2
    //   67: aload_3
    //   68: invokespecial 107	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   71: aload 8
    //   73: aload_2
    //   74: invokespecial 110	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   77: aload_0
    //   78: ldc 112
    //   80: invokevirtual 115	com/tencent/wcdb/database/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   83: aload_0
    //   84: invokevirtual 118	com/tencent/wcdb/database/SQLiteDatabase:beginTransaction	()V
    //   87: iconst_0
    //   88: istore 9
    //   90: iconst_0
    //   91: istore 10
    //   93: iconst_0
    //   94: istore 11
    //   96: new 120	java/util/HashMap
    //   99: astore 12
    //   101: aload 12
    //   103: invokespecial 121	java/util/HashMap:<init>	()V
    //   106: iconst_0
    //   107: istore 13
    //   109: aconst_null
    //   110: astore_2
    //   111: aload 8
    //   113: invokevirtual 124	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   116: astore 14
    //   118: aload 14
    //   120: ifnull +652 -> 772
    //   123: iload 13
    //   125: ifeq +93 -> 218
    //   128: new 37	java/lang/StringBuilder
    //   131: astore 15
    //   133: aload 15
    //   135: invokespecial 38	java/lang/StringBuilder:<init>	()V
    //   138: aload 15
    //   140: aload_2
    //   141: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: ldc 126
    //   146: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: aload 14
    //   151: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: astore 14
    //   159: aload 14
    //   161: ldc 128
    //   163: invokevirtual 132	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   166: ifeq +819 -> 985
    //   169: aload 14
    //   171: invokestatic 135	com/tencent/wcdb/repair/DBDumpUtil:nativeIsSqlComplete	(Ljava/lang/String;)Z
    //   174: istore 16
    //   176: aload 14
    //   178: astore_2
    //   179: iload 16
    //   181: ifne +127 -> 308
    //   184: aload 14
    //   186: astore_2
    //   187: goto -76 -> 111
    //   190: astore_0
    //   191: ldc 11
    //   193: ldc 137
    //   195: iconst_1
    //   196: anewarray 4	java/lang/Object
    //   199: dup
    //   200: iconst_0
    //   201: aload_3
    //   202: aastore
    //   203: invokestatic 140	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   206: iconst_0
    //   207: istore 7
    //   209: sipush 12649
    //   212: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   215: goto -182 -> 33
    //   218: aload 14
    //   220: ldc 142
    //   222: invokevirtual 145	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   225: ifne +13 -> 238
    //   228: aload 14
    //   230: ldc 147
    //   232: invokevirtual 145	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   235: ifeq -124 -> 111
    //   238: aload 14
    //   240: ldc 128
    //   242: invokevirtual 132	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   245: ifeq +11 -> 256
    //   248: aload 14
    //   250: invokestatic 135	com/tencent/wcdb/repair/DBDumpUtil:nativeIsSqlComplete	(Ljava/lang/String;)Z
    //   253: ifne +52 -> 305
    //   256: aload_2
    //   257: invokestatic 153	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   260: ifeq +12 -> 272
    //   263: aload 14
    //   265: astore_2
    //   266: iconst_1
    //   267: istore 13
    //   269: goto -158 -> 111
    //   272: new 37	java/lang/StringBuilder
    //   275: astore 15
    //   277: aload 15
    //   279: invokespecial 38	java/lang/StringBuilder:<init>	()V
    //   282: aload 15
    //   284: aload_2
    //   285: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: ldc 126
    //   290: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: aload 14
    //   295: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   301: astore_2
    //   302: goto -36 -> 266
    //   305: aload 14
    //   307: astore_2
    //   308: iconst_0
    //   309: istore 13
    //   311: aload 5
    //   313: ifnull +92 -> 405
    //   316: aload 5
    //   318: invokeinterface 156 1 0
    //   323: ifle +82 -> 405
    //   326: aload_2
    //   327: invokestatic 160	com/tencent/wcdb/repair/DBDumpUtil:getTableNameFromSql	(Ljava/lang/String;)Ljava/lang/String;
    //   330: astore 15
    //   332: aload 5
    //   334: invokeinterface 164 1 0
    //   339: astore 14
    //   341: aload 14
    //   343: invokeinterface 169 1 0
    //   348: ifeq +51 -> 399
    //   351: aload 15
    //   353: aload 14
    //   355: invokeinterface 173 1 0
    //   360: checkcast 50	java/lang/String
    //   363: invokevirtual 177	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   366: ifeq -25 -> 341
    //   369: iconst_0
    //   370: istore 13
    //   372: iload 13
    //   374: ifeq +98 -> 472
    //   377: ldc 11
    //   379: ldc 179
    //   381: iconst_1
    //   382: anewarray 4	java/lang/Object
    //   385: dup
    //   386: iconst_0
    //   387: aload 15
    //   389: aastore
    //   390: invokestatic 181	com/tencent/wcdb/support/Log:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   393: iconst_0
    //   394: istore 13
    //   396: goto -285 -> 111
    //   399: iconst_1
    //   400: istore 13
    //   402: goto -30 -> 372
    //   405: aload 4
    //   407: ifnull +572 -> 979
    //   410: aload 4
    //   412: invokeinterface 156 1 0
    //   417: ifle +562 -> 979
    //   420: aload_2
    //   421: invokestatic 160	com/tencent/wcdb/repair/DBDumpUtil:getTableNameFromSql	(Ljava/lang/String;)Ljava/lang/String;
    //   424: astore 15
    //   426: aload 4
    //   428: invokeinterface 164 1 0
    //   433: astore 14
    //   435: aload 14
    //   437: invokeinterface 169 1 0
    //   442: ifeq +531 -> 973
    //   445: aload 15
    //   447: aload 14
    //   449: invokeinterface 173 1 0
    //   454: checkcast 50	java/lang/String
    //   457: invokevirtual 177	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   460: ifeq -25 -> 435
    //   463: iconst_1
    //   464: istore 13
    //   466: ldc 32
    //   468: astore_2
    //   469: goto -97 -> 372
    //   472: iload 10
    //   474: istore 13
    //   476: aload_2
    //   477: ldc 147
    //   479: invokevirtual 145	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   482: ifeq +140 -> 622
    //   485: iload 10
    //   487: istore 13
    //   489: aload 12
    //   491: aload 15
    //   493: aload_2
    //   494: invokestatic 185	com/tencent/wcdb/repair/DBDumpUtil:getColumnNamesFromSql	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   497: invokestatic 187	com/tencent/wcdb/repair/DBDumpUtil:buildColumnsString	(Ljava/util/ArrayList;)Ljava/lang/String;
    //   500: invokevirtual 191	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   503: pop
    //   504: aload_2
    //   505: astore 14
    //   507: aconst_null
    //   508: astore_2
    //   509: aload 6
    //   511: ifnull +17 -> 528
    //   514: iload 10
    //   516: istore 13
    //   518: aload 6
    //   520: aload 14
    //   522: invokeinterface 194 2 0
    //   527: astore_2
    //   528: iload 10
    //   530: istore 13
    //   532: aload_2
    //   533: invokestatic 153	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   536: ifne +431 -> 967
    //   539: iload 10
    //   541: iconst_1
    //   542: iadd
    //   543: istore 17
    //   545: iload 17
    //   547: istore 13
    //   549: aload_0
    //   550: aload_2
    //   551: invokevirtual 115	com/tencent/wcdb/database/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   554: iload 11
    //   556: iconst_1
    //   557: iadd
    //   558: istore 18
    //   560: iload 18
    //   562: istore 13
    //   564: iload 17
    //   566: istore 10
    //   568: iload 9
    //   570: istore 11
    //   572: iload 18
    //   574: bipush 100
    //   576: if_icmplt +26 -> 602
    //   579: aload_0
    //   580: invokevirtual 197	com/tencent/wcdb/database/SQLiteDatabase:setTransactionSuccessful	()V
    //   583: aload_0
    //   584: invokevirtual 200	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
    //   587: aload_0
    //   588: invokevirtual 118	com/tencent/wcdb/database/SQLiteDatabase:beginTransaction	()V
    //   591: iconst_0
    //   592: istore 13
    //   594: iload 9
    //   596: istore 11
    //   598: iload 17
    //   600: istore 10
    //   602: iconst_0
    //   603: istore 17
    //   605: aconst_null
    //   606: astore_2
    //   607: iload 11
    //   609: istore 9
    //   611: iload 13
    //   613: istore 11
    //   615: iload 17
    //   617: istore 13
    //   619: goto -508 -> 111
    //   622: aload_2
    //   623: astore 14
    //   625: iload 10
    //   627: istore 13
    //   629: aload_2
    //   630: ldc 202
    //   632: invokevirtual 145	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   635: ifeq -128 -> 507
    //   638: iload 10
    //   640: istore 13
    //   642: aload 12
    //   644: aload 15
    //   646: invokevirtual 205	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   649: checkcast 50	java/lang/String
    //   652: astore 19
    //   654: aload_2
    //   655: astore 14
    //   657: iload 10
    //   659: istore 13
    //   661: aload 19
    //   663: invokestatic 153	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   666: ifne -159 -> 507
    //   669: iload 10
    //   671: istore 13
    //   673: new 37	java/lang/StringBuilder
    //   676: astore 14
    //   678: iload 10
    //   680: istore 13
    //   682: aload 14
    //   684: ldc 207
    //   686: invokespecial 208	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   689: iload 10
    //   691: istore 13
    //   693: aload 14
    //   695: ldc 210
    //   697: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   700: aload 15
    //   702: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   705: ldc 210
    //   707: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   710: pop
    //   711: iload 10
    //   713: istore 13
    //   715: aload 14
    //   717: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   720: astore 15
    //   722: iload 10
    //   724: istore 13
    //   726: aload 14
    //   728: aload 19
    //   730: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   733: pop
    //   734: iload 10
    //   736: istore 13
    //   738: aload_2
    //   739: aload 15
    //   741: aload 14
    //   743: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   746: invokevirtual 214	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   749: astore 14
    //   751: goto -244 -> 507
    //   754: astore_2
    //   755: iload 13
    //   757: istore 10
    //   759: iload 11
    //   761: istore 13
    //   763: iload 9
    //   765: iconst_1
    //   766: iadd
    //   767: istore 11
    //   769: goto -167 -> 602
    //   772: aload 8
    //   774: invokevirtual 217	java/io/BufferedReader:close	()V
    //   777: iload 10
    //   779: iload 9
    //   781: if_icmple +150 -> 931
    //   784: aload_0
    //   785: invokevirtual 220	com/tencent/wcdb/database/SQLiteDatabase:inTransaction	()Z
    //   788: ifeq +7 -> 795
    //   791: aload_0
    //   792: invokevirtual 197	com/tencent/wcdb/database/SQLiteDatabase:setTransactionSuccessful	()V
    //   795: aload_0
    //   796: invokevirtual 220	com/tencent/wcdb/database/SQLiteDatabase:inTransaction	()Z
    //   799: ifeq +7 -> 806
    //   802: aload_0
    //   803: invokevirtual 200	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
    //   806: iload 7
    //   808: ifeq +45 -> 853
    //   811: new 222	java/io/File
    //   814: dup
    //   815: aload_3
    //   816: invokespecial 223	java/io/File:<init>	(Ljava/lang/String;)V
    //   819: astore_0
    //   820: aload_0
    //   821: invokevirtual 226	java/io/File:exists	()Z
    //   824: ifeq +8 -> 832
    //   827: aload_0
    //   828: invokevirtual 229	java/io/File:delete	()Z
    //   831: pop
    //   832: new 222	java/io/File
    //   835: dup
    //   836: aload_1
    //   837: invokespecial 223	java/io/File:<init>	(Ljava/lang/String;)V
    //   840: astore_0
    //   841: aload_0
    //   842: invokevirtual 226	java/io/File:exists	()Z
    //   845: ifeq +8 -> 853
    //   848: aload_0
    //   849: invokevirtual 229	java/io/File:delete	()Z
    //   852: pop
    //   853: ldc 11
    //   855: ldc 231
    //   857: iconst_2
    //   858: anewarray 4	java/lang/Object
    //   861: dup
    //   862: iconst_0
    //   863: iload 10
    //   865: invokestatic 237	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   868: aastore
    //   869: dup
    //   870: iconst_1
    //   871: iload 9
    //   873: invokestatic 237	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   876: aastore
    //   877: invokestatic 181	com/tencent/wcdb/support/Log:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   880: iconst_1
    //   881: istore 7
    //   883: sipush 12649
    //   886: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   889: goto -856 -> 33
    //   892: astore_0
    //   893: ldc 11
    //   895: ldc 239
    //   897: invokestatic 97	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   900: aload 8
    //   902: invokevirtual 217	java/io/BufferedReader:close	()V
    //   905: iconst_0
    //   906: istore 7
    //   908: sipush 12649
    //   911: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   914: goto -881 -> 33
    //   917: astore_0
    //   918: aload 8
    //   920: invokevirtual 217	java/io/BufferedReader:close	()V
    //   923: sipush 12649
    //   926: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   929: aload_0
    //   930: athrow
    //   931: iconst_0
    //   932: istore 7
    //   934: sipush 12649
    //   937: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   940: goto -907 -> 33
    //   943: astore_2
    //   944: goto -167 -> 777
    //   947: astore_0
    //   948: goto -43 -> 905
    //   951: astore_1
    //   952: goto -29 -> 923
    //   955: astore_2
    //   956: iload 18
    //   958: istore 13
    //   960: iload 17
    //   962: istore 10
    //   964: goto -201 -> 763
    //   967: aload 14
    //   969: astore_2
    //   970: goto -431 -> 539
    //   973: iconst_0
    //   974: istore 13
    //   976: goto -604 -> 372
    //   979: aconst_null
    //   980: astore 15
    //   982: goto -610 -> 372
    //   985: aload 14
    //   987: astore_2
    //   988: goto -877 -> 111
    //
    // Exception table:
    //   from	to	target	type
    //   57	77	190	java/io/FileNotFoundException
    //   476	485	754	java/lang/Exception
    //   489	504	754	java/lang/Exception
    //   518	528	754	java/lang/Exception
    //   532	539	754	java/lang/Exception
    //   549	554	754	java/lang/Exception
    //   629	638	754	java/lang/Exception
    //   642	654	754	java/lang/Exception
    //   661	669	754	java/lang/Exception
    //   673	678	754	java/lang/Exception
    //   682	689	754	java/lang/Exception
    //   693	711	754	java/lang/Exception
    //   715	722	754	java/lang/Exception
    //   726	734	754	java/lang/Exception
    //   738	751	754	java/lang/Exception
    //   96	106	892	java/io/IOException
    //   111	118	892	java/io/IOException
    //   128	176	892	java/io/IOException
    //   218	238	892	java/io/IOException
    //   238	256	892	java/io/IOException
    //   256	263	892	java/io/IOException
    //   272	302	892	java/io/IOException
    //   316	341	892	java/io/IOException
    //   341	369	892	java/io/IOException
    //   377	393	892	java/io/IOException
    //   410	435	892	java/io/IOException
    //   435	463	892	java/io/IOException
    //   476	485	892	java/io/IOException
    //   489	504	892	java/io/IOException
    //   518	528	892	java/io/IOException
    //   532	539	892	java/io/IOException
    //   549	554	892	java/io/IOException
    //   579	591	892	java/io/IOException
    //   629	638	892	java/io/IOException
    //   642	654	892	java/io/IOException
    //   661	669	892	java/io/IOException
    //   673	678	892	java/io/IOException
    //   682	689	892	java/io/IOException
    //   693	711	892	java/io/IOException
    //   715	722	892	java/io/IOException
    //   726	734	892	java/io/IOException
    //   738	751	892	java/io/IOException
    //   96	106	917	finally
    //   111	118	917	finally
    //   128	176	917	finally
    //   218	238	917	finally
    //   238	256	917	finally
    //   256	263	917	finally
    //   272	302	917	finally
    //   316	341	917	finally
    //   341	369	917	finally
    //   377	393	917	finally
    //   410	435	917	finally
    //   435	463	917	finally
    //   476	485	917	finally
    //   489	504	917	finally
    //   518	528	917	finally
    //   532	539	917	finally
    //   549	554	917	finally
    //   579	591	917	finally
    //   629	638	917	finally
    //   642	654	917	finally
    //   661	669	917	finally
    //   673	678	917	finally
    //   682	689	917	finally
    //   693	711	917	finally
    //   715	722	917	finally
    //   726	734	917	finally
    //   738	751	917	finally
    //   893	900	917	finally
    //   772	777	943	java/io/IOException
    //   900	905	947	java/io/IOException
    //   918	923	951	java/io/IOException
    //   579	591	955	java/lang/Exception
  }

  public static ArrayList<String> getColumnNamesFromSql(String paramString)
  {
    AppMethodBeat.i(12653);
    ArrayList localArrayList = new ArrayList();
    paramString = paramString.substring(paramString.indexOf("(") + 1, paramString.lastIndexOf(")")).trim().split(",");
    for (int i = 0; i < paramString.length; i++)
    {
      paramString[i] = paramString[i].trim();
      int j = paramString[i].indexOf(" ");
      localArrayList.add(paramString[i].substring(0, j));
    }
    AppMethodBeat.o(12653);
    return localArrayList;
  }

  public static String getTableNameFromSql(String paramString)
  {
    AppMethodBeat.i(12651);
    String str = paramString;
    if (paramString.length() > 100)
      str = paramString.substring(0, 100);
    paramString = str.split("\\s");
    if ((paramString != null) && (paramString.length > 1))
    {
      paramString = paramString[2].replaceAll("\"", "");
      AppMethodBeat.o(12651);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(12651);
    }
  }

  private static native boolean nativeDumpDB(String paramString1, String paramString2, String paramString3);

  private static native boolean nativeIsSqlComplete(String paramString);

  // ERROR //
  public static byte[] readFromFile(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: sipush 12652
    //   5: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 222	java/io/File
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 223	java/io/File:<init>	(Ljava/lang/String;)V
    //   16: astore_2
    //   17: aload_2
    //   18: invokevirtual 226	java/io/File:exists	()Z
    //   21: ifne +29 -> 50
    //   24: ldc 11
    //   26: ldc_w 278
    //   29: iconst_1
    //   30: anewarray 4	java/lang/Object
    //   33: dup
    //   34: iconst_0
    //   35: aload_0
    //   36: aastore
    //   37: invokestatic 140	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   40: sipush 12652
    //   43: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: aload_1
    //   47: astore_0
    //   48: aload_0
    //   49: areturn
    //   50: aload_2
    //   51: invokevirtual 281	java/io/File:length	()J
    //   54: l2i
    //   55: istore_3
    //   56: new 283	java/io/FileInputStream
    //   59: astore 4
    //   61: aload 4
    //   63: aload_2
    //   64: invokespecial 286	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   67: iload_3
    //   68: newarray byte
    //   70: astore_2
    //   71: aload 4
    //   73: aload_2
    //   74: invokevirtual 290	java/io/FileInputStream:read	([B)I
    //   77: istore 5
    //   79: iload 5
    //   81: iload_3
    //   82: if_icmpeq +50 -> 132
    //   85: ldc 11
    //   87: ldc_w 292
    //   90: iconst_3
    //   91: anewarray 4	java/lang/Object
    //   94: dup
    //   95: iconst_0
    //   96: aload_0
    //   97: aastore
    //   98: dup
    //   99: iconst_1
    //   100: iload_3
    //   101: invokestatic 237	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   104: aastore
    //   105: dup
    //   106: iconst_2
    //   107: iload 5
    //   109: invokestatic 237	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   112: aastore
    //   113: invokestatic 140	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: aload 4
    //   118: invokevirtual 293	java/io/FileInputStream:close	()V
    //   121: sipush 12652
    //   124: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   127: aload_1
    //   128: astore_0
    //   129: goto -81 -> 48
    //   132: aload 4
    //   134: invokevirtual 293	java/io/FileInputStream:close	()V
    //   137: sipush 12652
    //   140: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: aload_2
    //   144: astore_0
    //   145: goto -97 -> 48
    //   148: astore_0
    //   149: aconst_null
    //   150: astore 4
    //   152: aload 4
    //   154: ifnull +8 -> 162
    //   157: aload 4
    //   159: invokevirtual 293	java/io/FileInputStream:close	()V
    //   162: ldc 11
    //   164: ldc_w 295
    //   167: invokestatic 298	com/tencent/wcdb/support/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   170: sipush 12652
    //   173: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   176: aload_1
    //   177: astore_0
    //   178: goto -130 -> 48
    //   181: astore_0
    //   182: aconst_null
    //   183: astore 4
    //   185: aload 4
    //   187: ifnull +8 -> 195
    //   190: aload 4
    //   192: invokevirtual 293	java/io/FileInputStream:close	()V
    //   195: sipush 12652
    //   198: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   201: aload_0
    //   202: athrow
    //   203: astore_0
    //   204: goto -83 -> 121
    //   207: astore_0
    //   208: goto -71 -> 137
    //   211: astore_0
    //   212: goto -50 -> 162
    //   215: astore 4
    //   217: goto -22 -> 195
    //   220: astore_0
    //   221: goto -36 -> 185
    //   224: astore_0
    //   225: goto -73 -> 152
    //
    // Exception table:
    //   from	to	target	type
    //   50	67	148	java/lang/Exception
    //   50	67	181	finally
    //   116	121	203	java/io/IOException
    //   132	137	207	java/io/IOException
    //   157	162	211	java/io/IOException
    //   190	195	215	java/io/IOException
    //   67	79	220	finally
    //   85	116	220	finally
    //   67	79	224	java/lang/Exception
    //   85	116	224	java/lang/Exception
  }

  public static abstract interface ExecuteSqlCallback
  {
    public abstract String preExecute(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.repair.DBDumpUtil
 * JD-Core Version:    0.6.2
 */