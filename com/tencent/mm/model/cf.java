package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class cf
{
  public static boolean fnO = false;
  private static cf fnR = null;
  private ArrayList<String> fnP;
  private String fnQ;

  // ERROR //
  public cf(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 26	java/lang/Object:<init>	()V
    //   4: ldc 27
    //   6: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: new 35	java/util/ArrayList
    //   13: dup
    //   14: invokespecial 36	java/util/ArrayList:<init>	()V
    //   17: putfield 38	com/tencent/mm/model/cf:fnP	Ljava/util/ArrayList;
    //   20: aload_0
    //   21: ldc 40
    //   23: putfield 42	com/tencent/mm/model/cf:fnQ	Ljava/lang/String;
    //   26: new 44	java/lang/StringBuilder
    //   29: astore_3
    //   30: aload_3
    //   31: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   34: aload_0
    //   35: aload_3
    //   36: aload_1
    //   37: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: ldc 51
    //   42: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: putfield 42	com/tencent/mm/model/cf:fnQ	Ljava/lang/String;
    //   51: new 57	java/io/RandomAccessFile
    //   54: astore_3
    //   55: aload_3
    //   56: aload_0
    //   57: getfield 42	com/tencent/mm/model/cf:fnQ	Ljava/lang/String;
    //   60: ldc 59
    //   62: invokespecial 62	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   65: aload_3
    //   66: astore_1
    //   67: aload_3
    //   68: invokevirtual 66	java/io/RandomAccessFile:length	()J
    //   71: lstore 4
    //   73: aload_3
    //   74: astore_1
    //   75: ldc 68
    //   77: ldc 70
    //   79: iconst_4
    //   80: anewarray 4	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: lload 4
    //   87: invokestatic 76	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   90: aastore
    //   91: dup
    //   92: iconst_1
    //   93: iload_2
    //   94: invokestatic 81	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   97: aastore
    //   98: dup
    //   99: iconst_2
    //   100: getstatic 87	com/tencent/mm/protocal/d:vxo	I
    //   103: invokestatic 92	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   106: aastore
    //   107: dup
    //   108: iconst_3
    //   109: aload_0
    //   110: getfield 42	com/tencent/mm/model/cf:fnQ	Ljava/lang/String;
    //   113: aastore
    //   114: invokestatic 97	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   117: lload 4
    //   119: lconst_0
    //   120: lcmp
    //   121: ifle +12 -> 133
    //   124: lload 4
    //   126: ldc2_w 98
    //   129: lcmp
    //   130: ifle +284 -> 414
    //   133: aload_3
    //   134: astore_1
    //   135: aload_3
    //   136: lconst_0
    //   137: invokevirtual 103	java/io/RandomAccessFile:seek	(J)V
    //   140: iload_2
    //   141: ifne +74 -> 215
    //   144: aload_3
    //   145: astore_1
    //   146: ldc 105
    //   148: iconst_1
    //   149: anewarray 4	java/lang/Object
    //   152: dup
    //   153: iconst_0
    //   154: ldc 106
    //   156: invokestatic 92	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   159: aastore
    //   160: invokestatic 112	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   163: astore 6
    //   165: aload_3
    //   166: astore_1
    //   167: new 44	java/lang/StringBuilder
    //   170: astore 7
    //   172: aload_3
    //   173: astore_1
    //   174: aload 7
    //   176: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   179: aload_3
    //   180: astore_1
    //   181: aload_3
    //   182: aload 7
    //   184: aload 6
    //   186: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: ldc 114
    //   191: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   197: invokevirtual 118	java/lang/String:getBytes	()[B
    //   200: invokevirtual 122	java/io/RandomAccessFile:write	([B)V
    //   203: aload_3
    //   204: astore_1
    //   205: aload_0
    //   206: getfield 38	com/tencent/mm/model/cf:fnP	Ljava/util/ArrayList;
    //   209: aload 6
    //   211: invokevirtual 126	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   214: pop
    //   215: aload_3
    //   216: astore_1
    //   217: ldc 105
    //   219: iconst_1
    //   220: anewarray 4	java/lang/Object
    //   223: dup
    //   224: iconst_0
    //   225: getstatic 87	com/tencent/mm/protocal/d:vxo	I
    //   228: invokestatic 92	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   231: aastore
    //   232: invokestatic 112	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   235: astore 7
    //   237: aload_3
    //   238: astore_1
    //   239: aload_0
    //   240: getfield 38	com/tencent/mm/model/cf:fnP	Ljava/util/ArrayList;
    //   243: invokevirtual 130	java/util/ArrayList:size	()I
    //   246: ifeq +29 -> 275
    //   249: aload_3
    //   250: astore_1
    //   251: aload 7
    //   253: aload_0
    //   254: getfield 38	com/tencent/mm/model/cf:fnP	Ljava/util/ArrayList;
    //   257: aload_0
    //   258: getfield 38	com/tencent/mm/model/cf:fnP	Ljava/util/ArrayList;
    //   261: invokevirtual 130	java/util/ArrayList:size	()I
    //   264: iconst_1
    //   265: isub
    //   266: invokevirtual 134	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   269: invokevirtual 137	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   272: ifne +67 -> 339
    //   275: aload_3
    //   276: astore_1
    //   277: iconst_1
    //   278: putstatic 17	com/tencent/mm/model/cf:fnO	Z
    //   281: aload_3
    //   282: astore_1
    //   283: aload_0
    //   284: getfield 38	com/tencent/mm/model/cf:fnP	Ljava/util/ArrayList;
    //   287: aload 7
    //   289: invokevirtual 126	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   292: pop
    //   293: aload_3
    //   294: astore_1
    //   295: aload_3
    //   296: lload 4
    //   298: invokevirtual 103	java/io/RandomAccessFile:seek	(J)V
    //   301: aload_3
    //   302: astore_1
    //   303: new 44	java/lang/StringBuilder
    //   306: astore 6
    //   308: aload_3
    //   309: astore_1
    //   310: aload 6
    //   312: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   315: aload_3
    //   316: astore_1
    //   317: aload_3
    //   318: aload 6
    //   320: aload 7
    //   322: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: ldc 114
    //   327: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   333: invokevirtual 118	java/lang/String:getBytes	()[B
    //   336: invokevirtual 122	java/io/RandomAccessFile:write	([B)V
    //   339: iconst_0
    //   340: istore 8
    //   342: ldc 40
    //   344: astore 6
    //   346: aload_3
    //   347: astore_1
    //   348: iload 8
    //   350: aload_0
    //   351: getfield 38	com/tencent/mm/model/cf:fnP	Ljava/util/ArrayList;
    //   354: invokevirtual 130	java/util/ArrayList:size	()I
    //   357: if_icmpge +265 -> 622
    //   360: aload_3
    //   361: astore_1
    //   362: new 44	java/lang/StringBuilder
    //   365: astore 7
    //   367: aload_3
    //   368: astore_1
    //   369: aload 7
    //   371: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   374: aload_3
    //   375: astore_1
    //   376: aload 7
    //   378: aload 6
    //   380: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: aload_0
    //   384: getfield 38	com/tencent/mm/model/cf:fnP	Ljava/util/ArrayList;
    //   387: iload 8
    //   389: invokevirtual 134	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   392: checkcast 108	java/lang/String
    //   395: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: ldc 139
    //   400: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   403: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   406: astore 6
    //   408: iinc 8 1
    //   411: goto -65 -> 346
    //   414: aload_3
    //   415: astore_1
    //   416: aload_3
    //   417: invokevirtual 142	java/io/RandomAccessFile:getFilePointer	()J
    //   420: lload 4
    //   422: lcmp
    //   423: ifge -208 -> 215
    //   426: aload_3
    //   427: astore_1
    //   428: aload_3
    //   429: invokevirtual 145	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   432: ldc 40
    //   434: invokestatic 151	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   437: astore 6
    //   439: aload_3
    //   440: astore_1
    //   441: aload 6
    //   443: invokevirtual 153	java/lang/String:length	()I
    //   446: bipush 8
    //   448: if_icmpeq +101 -> 549
    //   451: aload_3
    //   452: astore_1
    //   453: ldc 68
    //   455: ldc 155
    //   457: iconst_2
    //   458: anewarray 4	java/lang/Object
    //   461: dup
    //   462: iconst_0
    //   463: aload 6
    //   465: invokevirtual 153	java/lang/String:length	()I
    //   468: invokestatic 92	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   471: aastore
    //   472: dup
    //   473: iconst_1
    //   474: aload_0
    //   475: getfield 42	com/tencent/mm/model/cf:fnQ	Ljava/lang/String;
    //   478: aastore
    //   479: invokestatic 158	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   482: goto -68 -> 414
    //   485: astore 6
    //   487: aload_3
    //   488: astore_1
    //   489: ldc 68
    //   491: aload 6
    //   493: ldc 160
    //   495: iconst_1
    //   496: anewarray 4	java/lang/Object
    //   499: dup
    //   500: iconst_0
    //   501: ldc 40
    //   503: aastore
    //   504: invokestatic 164	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   507: aload_3
    //   508: invokevirtual 167	java/io/RandomAccessFile:close	()V
    //   511: getstatic 19	com/tencent/mm/model/cf:fnR	Lcom/tencent/mm/model/cf;
    //   514: ifnull +29 -> 543
    //   517: getstatic 19	com/tencent/mm/model/cf:fnR	Lcom/tencent/mm/model/cf;
    //   520: aload_0
    //   521: if_acmpeq +22 -> 543
    //   524: getstatic 19	com/tencent/mm/model/cf:fnR	Lcom/tencent/mm/model/cf;
    //   527: getfield 38	com/tencent/mm/model/cf:fnP	Ljava/util/ArrayList;
    //   530: invokevirtual 130	java/util/ArrayList:size	()I
    //   533: aload_0
    //   534: getfield 38	com/tencent/mm/model/cf:fnP	Ljava/util/ArrayList;
    //   537: invokevirtual 130	java/util/ArrayList:size	()I
    //   540: if_icmplt +186 -> 726
    //   543: ldc 27
    //   545: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   548: return
    //   549: aload_3
    //   550: astore_1
    //   551: aload 6
    //   553: ldc 172
    //   555: invokevirtual 176	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   558: ifne +49 -> 607
    //   561: aload_3
    //   562: astore_1
    //   563: ldc 68
    //   565: ldc 178
    //   567: iconst_2
    //   568: anewarray 4	java/lang/Object
    //   571: dup
    //   572: iconst_0
    //   573: aload 6
    //   575: aastore
    //   576: dup
    //   577: iconst_1
    //   578: aload_0
    //   579: getfield 42	com/tencent/mm/model/cf:fnQ	Ljava/lang/String;
    //   582: aastore
    //   583: invokestatic 158	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   586: goto -172 -> 414
    //   589: astore 6
    //   591: aload_1
    //   592: astore_3
    //   593: aload 6
    //   595: astore_1
    //   596: aload_3
    //   597: invokevirtual 167	java/io/RandomAccessFile:close	()V
    //   600: ldc 27
    //   602: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   605: aload_1
    //   606: athrow
    //   607: aload_3
    //   608: astore_1
    //   609: aload_0
    //   610: getfield 38	com/tencent/mm/model/cf:fnP	Ljava/util/ArrayList;
    //   613: aload 6
    //   615: invokevirtual 126	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   618: pop
    //   619: goto -205 -> 414
    //   622: aload_3
    //   623: astore_1
    //   624: ldc 68
    //   626: ldc 180
    //   628: iconst_3
    //   629: anewarray 4	java/lang/Object
    //   632: dup
    //   633: iconst_0
    //   634: getstatic 17	com/tencent/mm/model/cf:fnO	Z
    //   637: invokestatic 81	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   640: aastore
    //   641: dup
    //   642: iconst_1
    //   643: aload 6
    //   645: aastore
    //   646: dup
    //   647: iconst_2
    //   648: aload_0
    //   649: getfield 42	com/tencent/mm/model/cf:fnQ	Ljava/lang/String;
    //   652: aastore
    //   653: invokestatic 97	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   656: aload_3
    //   657: invokevirtual 167	java/io/RandomAccessFile:close	()V
    //   660: goto -149 -> 511
    //   663: astore_1
    //   664: ldc 68
    //   666: aload_1
    //   667: ldc 182
    //   669: iconst_1
    //   670: anewarray 4	java/lang/Object
    //   673: dup
    //   674: iconst_0
    //   675: ldc 40
    //   677: aastore
    //   678: invokestatic 164	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   681: goto -170 -> 511
    //   684: astore_1
    //   685: ldc 68
    //   687: aload_1
    //   688: ldc 182
    //   690: iconst_1
    //   691: anewarray 4	java/lang/Object
    //   694: dup
    //   695: iconst_0
    //   696: ldc 40
    //   698: aastore
    //   699: invokestatic 164	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   702: goto -191 -> 511
    //   705: astore_3
    //   706: ldc 68
    //   708: aload_3
    //   709: ldc 182
    //   711: iconst_1
    //   712: anewarray 4	java/lang/Object
    //   715: dup
    //   716: iconst_0
    //   717: ldc 40
    //   719: aastore
    //   720: invokestatic 164	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   723: goto -123 -> 600
    //   726: getstatic 19	com/tencent/mm/model/cf:fnR	Lcom/tencent/mm/model/cf;
    //   729: aload_0
    //   730: getfield 38	com/tencent/mm/model/cf:fnP	Ljava/util/ArrayList;
    //   733: putfield 38	com/tencent/mm/model/cf:fnP	Ljava/util/ArrayList;
    //   736: aload_0
    //   737: getfield 42	com/tencent/mm/model/cf:fnQ	Ljava/lang/String;
    //   740: getstatic 19	com/tencent/mm/model/cf:fnR	Lcom/tencent/mm/model/cf;
    //   743: getfield 42	com/tencent/mm/model/cf:fnQ	Ljava/lang/String;
    //   746: invokestatic 188	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   749: pop2
    //   750: ldc 27
    //   752: invokestatic 170	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   755: goto -207 -> 548
    //   758: astore_1
    //   759: aconst_null
    //   760: astore_3
    //   761: goto -165 -> 596
    //   764: astore 6
    //   766: aconst_null
    //   767: astore_3
    //   768: goto -281 -> 487
    //
    // Exception table:
    //   from	to	target	type
    //   67	73	485	java/lang/Exception
    //   75	117	485	java/lang/Exception
    //   135	140	485	java/lang/Exception
    //   146	165	485	java/lang/Exception
    //   167	172	485	java/lang/Exception
    //   174	179	485	java/lang/Exception
    //   181	203	485	java/lang/Exception
    //   205	215	485	java/lang/Exception
    //   217	237	485	java/lang/Exception
    //   239	249	485	java/lang/Exception
    //   251	275	485	java/lang/Exception
    //   277	281	485	java/lang/Exception
    //   283	293	485	java/lang/Exception
    //   295	301	485	java/lang/Exception
    //   303	308	485	java/lang/Exception
    //   310	315	485	java/lang/Exception
    //   317	339	485	java/lang/Exception
    //   348	360	485	java/lang/Exception
    //   362	367	485	java/lang/Exception
    //   369	374	485	java/lang/Exception
    //   376	408	485	java/lang/Exception
    //   416	426	485	java/lang/Exception
    //   428	439	485	java/lang/Exception
    //   441	451	485	java/lang/Exception
    //   453	482	485	java/lang/Exception
    //   551	561	485	java/lang/Exception
    //   563	586	485	java/lang/Exception
    //   609	619	485	java/lang/Exception
    //   624	656	485	java/lang/Exception
    //   67	73	589	finally
    //   75	117	589	finally
    //   135	140	589	finally
    //   146	165	589	finally
    //   167	172	589	finally
    //   174	179	589	finally
    //   181	203	589	finally
    //   205	215	589	finally
    //   217	237	589	finally
    //   239	249	589	finally
    //   251	275	589	finally
    //   277	281	589	finally
    //   283	293	589	finally
    //   295	301	589	finally
    //   303	308	589	finally
    //   310	315	589	finally
    //   317	339	589	finally
    //   348	360	589	finally
    //   362	367	589	finally
    //   369	374	589	finally
    //   376	408	589	finally
    //   416	426	589	finally
    //   428	439	589	finally
    //   441	451	589	finally
    //   453	482	589	finally
    //   489	507	589	finally
    //   551	561	589	finally
    //   563	586	589	finally
    //   609	619	589	finally
    //   624	656	589	finally
    //   656	660	663	java/lang/Exception
    //   507	511	684	java/lang/Exception
    //   596	600	705	java/lang/Exception
    //   26	65	758	finally
    //   26	65	764	java/lang/Exception
  }

  public static String aaH()
  {
    AppMethodBeat.i(58147);
    String str;
    if (fnR != null)
    {
      cf localcf = fnR;
      str = "";
      int i;
      if (4 >= localcf.fnP.size())
        i = 0;
      while (i < localcf.fnP.size())
      {
        str = str + (String)localcf.fnP.get(i) + ";";
        i++;
        continue;
        i = localcf.fnP.size() - 4;
      }
      AppMethodBeat.o(58147);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(58147);
    }
  }

  public static void oO(String paramString)
  {
    AppMethodBeat.i(58146);
    fnR = new cf(paramString, true);
    AppMethodBeat.o(58146);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cf
 * JD-Core Version:    0.6.2
 */