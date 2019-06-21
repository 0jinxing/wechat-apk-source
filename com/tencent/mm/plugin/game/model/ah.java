package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.LinkedList;

public final class ah
{
  // ERROR //
  private static String X(LinkedList<n.i> paramLinkedList)
  {
    // Byte code:
    //   0: ldc 9
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokestatic 21	com/tencent/mm/sdk/platformtools/bo:ek	(Ljava/util/List;)Z
    //   9: ifeq +13 -> 22
    //   12: ldc 23
    //   14: astore_0
    //   15: ldc 9
    //   17: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   20: aload_0
    //   21: areturn
    //   22: new 28	java/io/StringWriter
    //   25: dup
    //   26: invokespecial 32	java/io/StringWriter:<init>	()V
    //   29: astore_1
    //   30: invokestatic 38	org/xmlpull/v1/XmlPullParserFactory:newInstance	()Lorg/xmlpull/v1/XmlPullParserFactory;
    //   33: invokevirtual 42	org/xmlpull/v1/XmlPullParserFactory:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
    //   36: astore_2
    //   37: aload_2
    //   38: aload_1
    //   39: invokeinterface 48 2 0
    //   44: aload_0
    //   45: invokevirtual 54	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   48: astore_0
    //   49: aload_0
    //   50: invokeinterface 60 1 0
    //   55: ifeq +320 -> 375
    //   58: aload_0
    //   59: invokeinterface 64 1 0
    //   64: checkcast 66	com/tencent/mm/plugin/game/model/n$i
    //   67: astore_3
    //   68: aload_2
    //   69: aconst_null
    //   70: ldc 68
    //   72: invokeinterface 72 3 0
    //   77: pop
    //   78: aload_2
    //   79: aconst_null
    //   80: ldc 74
    //   82: aload_3
    //   83: getfield 78	com/tencent/mm/plugin/game/model/n$i:mXx	Ljava/lang/String;
    //   86: invokeinterface 82 4 0
    //   91: pop
    //   92: aload_2
    //   93: aconst_null
    //   94: ldc 84
    //   96: invokeinterface 72 3 0
    //   101: pop
    //   102: aload_2
    //   103: aload_3
    //   104: getfield 87	com/tencent/mm/plugin/game/model/n$i:userName	Ljava/lang/String;
    //   107: ldc 23
    //   109: invokestatic 91	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   112: invokeinterface 95 2 0
    //   117: pop
    //   118: aload_2
    //   119: aconst_null
    //   120: ldc 84
    //   122: invokeinterface 98 3 0
    //   127: pop
    //   128: aload_2
    //   129: aconst_null
    //   130: ldc 100
    //   132: invokeinterface 72 3 0
    //   137: pop
    //   138: aload_2
    //   139: aload_3
    //   140: getfield 103	com/tencent/mm/plugin/game/model/n$i:bCu	Ljava/lang/String;
    //   143: ldc 23
    //   145: invokestatic 91	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   148: invokeinterface 95 2 0
    //   153: pop
    //   154: aload_2
    //   155: aconst_null
    //   156: ldc 100
    //   158: invokeinterface 98 3 0
    //   163: pop
    //   164: aload_2
    //   165: aconst_null
    //   166: ldc 105
    //   168: invokeinterface 72 3 0
    //   173: pop
    //   174: aload_2
    //   175: aload_3
    //   176: getfield 108	com/tencent/mm/plugin/game/model/n$i:mXu	Ljava/lang/String;
    //   179: ldc 23
    //   181: invokestatic 91	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   184: invokeinterface 95 2 0
    //   189: pop
    //   190: aload_2
    //   191: aconst_null
    //   192: ldc 105
    //   194: invokeinterface 98 3 0
    //   199: pop
    //   200: aload_2
    //   201: aconst_null
    //   202: ldc 110
    //   204: invokeinterface 72 3 0
    //   209: pop
    //   210: aload_2
    //   211: aload_3
    //   212: getfield 113	com/tencent/mm/plugin/game/model/n$i:mXv	Ljava/lang/String;
    //   215: ldc 23
    //   217: invokestatic 91	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   220: invokeinterface 95 2 0
    //   225: pop
    //   226: aload_2
    //   227: aconst_null
    //   228: ldc 110
    //   230: invokeinterface 98 3 0
    //   235: pop
    //   236: aload_2
    //   237: aconst_null
    //   238: ldc 115
    //   240: invokeinterface 72 3 0
    //   245: pop
    //   246: aload_2
    //   247: aload_3
    //   248: getfield 118	com/tencent/mm/plugin/game/model/n$i:mXw	Ljava/lang/String;
    //   251: ldc 23
    //   253: invokestatic 91	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   256: invokeinterface 95 2 0
    //   261: pop
    //   262: aload_2
    //   263: aconst_null
    //   264: ldc 115
    //   266: invokeinterface 98 3 0
    //   271: pop
    //   272: aload_2
    //   273: aconst_null
    //   274: ldc 68
    //   276: invokeinterface 98 3 0
    //   281: pop
    //   282: goto -233 -> 49
    //   285: astore_0
    //   286: ldc 120
    //   288: aload_0
    //   289: invokevirtual 124	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   292: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   295: ldc 23
    //   297: astore_0
    //   298: ldc 9
    //   300: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   303: goto -283 -> 20
    //   306: astore 4
    //   308: aload_2
    //   309: ldc 23
    //   311: invokeinterface 95 2 0
    //   316: pop
    //   317: goto -199 -> 118
    //   320: astore 4
    //   322: aload_2
    //   323: ldc 23
    //   325: invokeinterface 95 2 0
    //   330: pop
    //   331: goto -177 -> 154
    //   334: astore 4
    //   336: aload_2
    //   337: ldc 23
    //   339: invokeinterface 95 2 0
    //   344: pop
    //   345: goto -155 -> 190
    //   348: astore 4
    //   350: aload_2
    //   351: ldc 23
    //   353: invokeinterface 95 2 0
    //   358: pop
    //   359: goto -133 -> 226
    //   362: astore_3
    //   363: aload_2
    //   364: ldc 23
    //   366: invokeinterface 95 2 0
    //   371: pop
    //   372: goto -110 -> 262
    //   375: aload_2
    //   376: invokeinterface 133 1 0
    //   381: aload_1
    //   382: invokevirtual 136	java/io/StringWriter:flush	()V
    //   385: aload_1
    //   386: invokevirtual 139	java/io/StringWriter:close	()V
    //   389: aload_1
    //   390: invokevirtual 143	java/io/StringWriter:getBuffer	()Ljava/lang/StringBuffer;
    //   393: invokevirtual 148	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   396: astore_0
    //   397: ldc 9
    //   399: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   402: goto -382 -> 20
    //
    // Exception table:
    //   from	to	target	type
    //   30	49	285	java/lang/Exception
    //   49	102	285	java/lang/Exception
    //   118	138	285	java/lang/Exception
    //   154	174	285	java/lang/Exception
    //   190	210	285	java/lang/Exception
    //   226	246	285	java/lang/Exception
    //   262	282	285	java/lang/Exception
    //   308	317	285	java/lang/Exception
    //   322	331	285	java/lang/Exception
    //   336	345	285	java/lang/Exception
    //   350	359	285	java/lang/Exception
    //   363	372	285	java/lang/Exception
    //   375	389	285	java/lang/Exception
    //   102	118	306	java/lang/Exception
    //   138	154	320	java/lang/Exception
    //   174	190	334	java/lang/Exception
    //   210	226	348	java/lang/Exception
    //   246	262	362	java/lang/Exception
  }

  public static String a(String paramString, LinkedList<n.i> paramLinkedList, HashMap<String, n.e> paramHashMap)
  {
    AppMethodBeat.i(111408);
    if ((bo.isNullOrNil(paramString)) || (bo.ek(paramLinkedList)))
      AppMethodBeat.o(111408);
    while (true)
    {
      return paramString;
      String str1 = X(paramLinkedList);
      if (bo.isNullOrNil(str1))
      {
        AppMethodBeat.o(111408);
        continue;
      }
      String str2 = a(paramLinkedList, paramHashMap);
      paramHashMap = new StringBuilder(paramString);
      try
      {
        if (paramHashMap.indexOf("<userinfo>") != -1)
        {
          int i = paramHashMap.indexOf("<userinfo>");
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("<usercount>");
          paramHashMap.insert(i, paramLinkedList.size() + 1 + "</usercount>");
        }
        if (paramHashMap.lastIndexOf("</userinfo>") != -1)
          paramHashMap.insert(paramHashMap.lastIndexOf("</userinfo>") + 11, str1);
        if ((paramHashMap.lastIndexOf("</jump>") != -1) && (!bo.isNullOrNil(str2)))
          paramHashMap.insert(paramHashMap.lastIndexOf("</jump>") + 7, str2);
        paramString = paramHashMap.toString();
        AppMethodBeat.o(111408);
      }
      catch (Exception paramLinkedList)
      {
        while (true)
        {
          ab.e("MicroMsg.GameXmlProcess", paramLinkedList.getMessage());
          ab.e("MicroMsg.GameXmlProcess", "xml is invalid : ".concat(String.valueOf(paramString)));
        }
      }
    }
  }

  // ERROR //
  private static String a(LinkedList<n.i> paramLinkedList, HashMap<String, n.e> paramHashMap)
  {
    // Byte code:
    //   0: ldc 215
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokestatic 21	com/tencent/mm/sdk/platformtools/bo:ek	(Ljava/util/List;)Z
    //   9: ifne +10 -> 19
    //   12: aload_1
    //   13: invokevirtual 220	java/util/HashMap:isEmpty	()Z
    //   16: ifeq +13 -> 29
    //   19: ldc 23
    //   21: astore_0
    //   22: ldc 215
    //   24: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   27: aload_0
    //   28: areturn
    //   29: new 28	java/io/StringWriter
    //   32: dup
    //   33: invokespecial 32	java/io/StringWriter:<init>	()V
    //   36: astore_2
    //   37: invokestatic 38	org/xmlpull/v1/XmlPullParserFactory:newInstance	()Lorg/xmlpull/v1/XmlPullParserFactory;
    //   40: invokevirtual 42	org/xmlpull/v1/XmlPullParserFactory:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
    //   43: astore_3
    //   44: aload_3
    //   45: aload_2
    //   46: invokeinterface 48 2 0
    //   51: aload_0
    //   52: invokevirtual 54	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   55: astore_0
    //   56: aload_0
    //   57: invokeinterface 60 1 0
    //   62: ifeq +192 -> 254
    //   65: aload_0
    //   66: invokeinterface 64 1 0
    //   71: checkcast 66	com/tencent/mm/plugin/game/model/n$i
    //   74: astore 4
    //   76: aload_1
    //   77: aload 4
    //   79: getfield 78	com/tencent/mm/plugin/game/model/n$i:mXx	Ljava/lang/String;
    //   82: invokevirtual 224	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   85: checkcast 226	com/tencent/mm/plugin/game/model/n$e
    //   88: astore 5
    //   90: aload 5
    //   92: ifnull -36 -> 56
    //   95: aload_3
    //   96: aconst_null
    //   97: ldc 228
    //   99: invokeinterface 72 3 0
    //   104: pop
    //   105: aload_3
    //   106: aconst_null
    //   107: ldc 230
    //   109: aload 4
    //   111: getfield 78	com/tencent/mm/plugin/game/model/n$i:mXx	Ljava/lang/String;
    //   114: invokeinterface 82 4 0
    //   119: pop
    //   120: aload_3
    //   121: aconst_null
    //   122: ldc 232
    //   124: invokeinterface 72 3 0
    //   129: pop
    //   130: aload_3
    //   131: aload 5
    //   133: getfield 236	com/tencent/mm/plugin/game/model/n$e:mXo	I
    //   136: invokestatic 239	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   139: invokeinterface 95 2 0
    //   144: pop
    //   145: aload_3
    //   146: aconst_null
    //   147: ldc 232
    //   149: invokeinterface 98 3 0
    //   154: pop
    //   155: aload_3
    //   156: aconst_null
    //   157: ldc 241
    //   159: invokeinterface 72 3 0
    //   164: pop
    //   165: aload_3
    //   166: aload 5
    //   168: getfield 244	com/tencent/mm/plugin/game/model/n$e:lAF	Ljava/lang/String;
    //   171: ldc 23
    //   173: invokestatic 91	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   176: invokeinterface 95 2 0
    //   181: pop
    //   182: aload_3
    //   183: aconst_null
    //   184: ldc 241
    //   186: invokeinterface 98 3 0
    //   191: pop
    //   192: aload_3
    //   193: aconst_null
    //   194: ldc 228
    //   196: invokeinterface 98 3 0
    //   201: pop
    //   202: goto -146 -> 56
    //   205: astore_0
    //   206: ldc 120
    //   208: aload_0
    //   209: invokevirtual 124	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   212: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   215: ldc 23
    //   217: astore_0
    //   218: ldc 215
    //   220: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   223: goto -196 -> 27
    //   226: astore 4
    //   228: aload_3
    //   229: ldc 23
    //   231: invokeinterface 95 2 0
    //   236: pop
    //   237: goto -92 -> 145
    //   240: astore 5
    //   242: aload_3
    //   243: ldc 23
    //   245: invokeinterface 95 2 0
    //   250: pop
    //   251: goto -69 -> 182
    //   254: aload_3
    //   255: invokeinterface 133 1 0
    //   260: aload_2
    //   261: invokevirtual 136	java/io/StringWriter:flush	()V
    //   264: aload_2
    //   265: invokevirtual 139	java/io/StringWriter:close	()V
    //   268: aload_2
    //   269: invokevirtual 143	java/io/StringWriter:getBuffer	()Ljava/lang/StringBuffer;
    //   272: invokevirtual 148	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   275: astore_0
    //   276: ldc 215
    //   278: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   281: goto -254 -> 27
    //
    // Exception table:
    //   from	to	target	type
    //   37	56	205	java/lang/Exception
    //   56	90	205	java/lang/Exception
    //   95	130	205	java/lang/Exception
    //   145	165	205	java/lang/Exception
    //   182	202	205	java/lang/Exception
    //   228	237	205	java/lang/Exception
    //   242	251	205	java/lang/Exception
    //   254	268	205	java/lang/Exception
    //   130	145	226	java/lang/Exception
    //   165	182	240	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.ah
 * JD-Core Version:    0.6.2
 */