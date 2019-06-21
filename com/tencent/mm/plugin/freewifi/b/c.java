package com.tencent.mm.plugin.freewifi.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
{
  private static final String[] mvj = { "ssid", "bssid", "rssi", "isWechatWifi", "wechatShopName", "maxApCount", "intervalSeconds" };
  private static final String[] mvk = { "errcode", "errmsg", "maxApCount", "intervalSeconds" };
  private int mvl = 200;
  private int mvm = 180;
  private long mvn = 0L;

  // ERROR //
  private void a(com.tencent.mm.g.a.fh paramfh, int paramInt, String paramString)
  {
    // Byte code:
    //   0: sipush 20677
    //   3: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 64
    //   8: ldc 66
    //   10: iconst_2
    //   11: anewarray 4	java/lang/Object
    //   14: dup
    //   15: iconst_0
    //   16: iload_2
    //   17: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   20: aastore
    //   21: dup
    //   22: iconst_1
    //   23: aload_3
    //   24: aastore
    //   25: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   28: new 79	android/database/MatrixCursor
    //   31: astore 4
    //   33: aload 4
    //   35: getstatic 40	com/tencent/mm/plugin/freewifi/b/c:mvk	[Ljava/lang/String;
    //   38: invokespecial 82	android/database/MatrixCursor:<init>	([Ljava/lang/String;)V
    //   41: aload 4
    //   43: iconst_4
    //   44: anewarray 4	java/lang/Object
    //   47: dup
    //   48: iconst_0
    //   49: iload_2
    //   50: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   53: aastore
    //   54: dup
    //   55: iconst_1
    //   56: aload_3
    //   57: aastore
    //   58: dup
    //   59: iconst_2
    //   60: aload_0
    //   61: invokevirtual 86	com/tencent/mm/plugin/freewifi/b/c:byB	()I
    //   64: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   67: aastore
    //   68: dup
    //   69: iconst_3
    //   70: aload_0
    //   71: invokevirtual 89	com/tencent/mm/plugin/freewifi/b/c:byC	()I
    //   74: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   77: aastore
    //   78: invokevirtual 93	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   81: aload_1
    //   82: getfield 99	com/tencent/mm/g/a/fh:cyX	Lcom/tencent/mm/g/a/fh$b;
    //   85: aload 4
    //   87: putfield 105	com/tencent/mm/g/a/fh$b:cyZ	Landroid/database/MatrixCursor;
    //   90: aload_1
    //   91: getfield 99	com/tencent/mm/g/a/fh:cyX	Lcom/tencent/mm/g/a/fh$b;
    //   94: iconst_1
    //   95: putfield 108	com/tencent/mm/g/a/fh$b:cyD	I
    //   98: aload_1
    //   99: getfield 112	com/tencent/mm/g/a/fh:callback	Ljava/lang/Runnable;
    //   102: ifnull +12 -> 114
    //   105: aload_1
    //   106: getfield 112	com/tencent/mm/g/a/fh:callback	Ljava/lang/Runnable;
    //   109: invokeinterface 117 1 0
    //   114: sipush 20677
    //   117: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   120: return
    //   121: astore 5
    //   123: aconst_null
    //   124: astore_3
    //   125: aload_3
    //   126: ifnull +7 -> 133
    //   129: aload_3
    //   130: invokevirtual 123	android/database/MatrixCursor:close	()V
    //   133: ldc 64
    //   135: ldc 125
    //   137: iconst_1
    //   138: anewarray 4	java/lang/Object
    //   141: dup
    //   142: iconst_0
    //   143: aload 5
    //   145: aastore
    //   146: invokestatic 128	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: aload_1
    //   150: getfield 99	com/tencent/mm/g/a/fh:cyX	Lcom/tencent/mm/g/a/fh$b;
    //   153: aconst_null
    //   154: putfield 105	com/tencent/mm/g/a/fh$b:cyZ	Landroid/database/MatrixCursor;
    //   157: aload_1
    //   158: getfield 99	com/tencent/mm/g/a/fh:cyX	Lcom/tencent/mm/g/a/fh$b;
    //   161: iconst_1
    //   162: putfield 108	com/tencent/mm/g/a/fh$b:cyD	I
    //   165: aload_1
    //   166: getfield 112	com/tencent/mm/g/a/fh:callback	Ljava/lang/Runnable;
    //   169: ifnull +12 -> 181
    //   172: aload_1
    //   173: getfield 112	com/tencent/mm/g/a/fh:callback	Ljava/lang/Runnable;
    //   176: invokeinterface 117 1 0
    //   181: sipush 20677
    //   184: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: goto -67 -> 120
    //   190: astore 5
    //   192: aload 4
    //   194: astore_3
    //   195: goto -70 -> 125
    //
    // Exception table:
    //   from	to	target	type
    //   28	41	121	java/lang/Exception
    //   41	81	190	java/lang/Exception
  }

  public static c byA()
  {
    AppMethodBeat.i(20675);
    c localc = c.a.byE();
    AppMethodBeat.o(20675);
    return localc;
  }

  private long byD()
  {
    try
    {
      long l = this.mvn;
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  public final void a(com.tencent.mm.g.a.fh paramfh)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: sipush 20676
    //   7: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: new 146	java/lang/StringBuilder
    //   13: astore_3
    //   14: aload_3
    //   15: ldc 148
    //   17: invokespecial 151	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   20: ldc 64
    //   22: aload_3
    //   23: aload_0
    //   24: invokevirtual 86	com/tencent/mm/plugin/freewifi/b/c:byB	()I
    //   27: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   30: ldc 157
    //   32: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: aload_0
    //   36: invokevirtual 89	com/tencent/mm/plugin/freewifi/b/c:byC	()I
    //   39: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   42: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: invokestatic 167	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   48: aload_1
    //   49: getfield 171	com/tencent/mm/g/a/fh:cyW	Lcom/tencent/mm/g/a/fh$a;
    //   52: getfield 176	com/tencent/mm/g/a/fh$a:cyY	[Ljava/lang/String;
    //   55: astore 4
    //   57: aload 4
    //   59: ifnull +9 -> 68
    //   62: aload 4
    //   64: arraylength
    //   65: ifne +22 -> 87
    //   68: aload_0
    //   69: aload_1
    //   70: sipush 1101
    //   73: ldc 178
    //   75: invokespecial 134	com/tencent/mm/plugin/freewifi/b/c:a	(Lcom/tencent/mm/g/a/fh;ILjava/lang/String;)V
    //   78: sipush 20676
    //   81: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   84: aload_0
    //   85: monitorexit
    //   86: return
    //   87: new 146	java/lang/StringBuilder
    //   90: astore_3
    //   91: aload_3
    //   92: invokespecial 179	java/lang/StringBuilder:<init>	()V
    //   95: iconst_0
    //   96: istore 5
    //   98: iload 5
    //   100: aload 4
    //   102: arraylength
    //   103: if_icmpge +49 -> 152
    //   106: new 146	java/lang/StringBuilder
    //   109: astore 6
    //   111: aload 6
    //   113: ldc 181
    //   115: invokespecial 151	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   118: aload_3
    //   119: aload 6
    //   121: iload 5
    //   123: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   126: ldc 183
    //   128: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: aload 4
    //   133: iload 5
    //   135: aaload
    //   136: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   142: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: iinc 5 1
    //   149: goto -51 -> 98
    //   152: new 146	java/lang/StringBuilder
    //   155: astore 6
    //   157: aload 6
    //   159: ldc 185
    //   161: invokespecial 151	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   164: ldc 64
    //   166: aload 6
    //   168: aload_3
    //   169: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   172: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   178: invokestatic 167	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   181: aload 4
    //   183: iconst_0
    //   184: aaload
    //   185: invokestatic 188	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   188: invokevirtual 191	java/lang/Integer:intValue	()I
    //   191: istore 5
    //   193: iload 5
    //   195: iconst_1
    //   196: if_icmpne +547 -> 743
    //   199: aload 4
    //   201: arraylength
    //   202: iconst_3
    //   203: if_icmpeq +70 -> 273
    //   206: new 146	java/lang/StringBuilder
    //   209: astore_3
    //   210: aload_3
    //   211: ldc 193
    //   213: invokespecial 151	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   216: aload_0
    //   217: aload_1
    //   218: sipush 1104
    //   221: aload_3
    //   222: aload 4
    //   224: arraylength
    //   225: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   228: ldc 195
    //   230: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: invokespecial 134	com/tencent/mm/plugin/freewifi/b/c:a	(Lcom/tencent/mm/g/a/fh;ILjava/lang/String;)V
    //   239: sipush 20676
    //   242: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   245: goto -161 -> 84
    //   248: astore_1
    //   249: aload_0
    //   250: monitorexit
    //   251: aload_1
    //   252: athrow
    //   253: astore_3
    //   254: aload_0
    //   255: aload_1
    //   256: sipush 1102
    //   259: ldc 197
    //   261: invokespecial 134	com/tencent/mm/plugin/freewifi/b/c:a	(Lcom/tencent/mm/g/a/fh;ILjava/lang/String;)V
    //   264: sipush 20676
    //   267: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   270: goto -186 -> 84
    //   273: aload 4
    //   275: iconst_2
    //   276: aaload
    //   277: invokestatic 188	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   280: invokevirtual 191	java/lang/Integer:intValue	()I
    //   283: istore 7
    //   285: iload 7
    //   287: iconst_1
    //   288: if_icmpeq +48 -> 336
    //   291: iload 7
    //   293: iconst_2
    //   294: if_icmpeq +42 -> 336
    //   297: aload_0
    //   298: aload_1
    //   299: sipush 1106
    //   302: ldc 199
    //   304: invokespecial 134	com/tencent/mm/plugin/freewifi/b/c:a	(Lcom/tencent/mm/g/a/fh;ILjava/lang/String;)V
    //   307: sipush 20676
    //   310: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   313: goto -229 -> 84
    //   316: astore_3
    //   317: aload_0
    //   318: aload_1
    //   319: sipush 1107
    //   322: ldc 201
    //   324: invokespecial 134	com/tencent/mm/plugin/freewifi/b/c:a	(Lcom/tencent/mm/g/a/fh;ILjava/lang/String;)V
    //   327: sipush 20676
    //   330: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   333: goto -249 -> 84
    //   336: aload_0
    //   337: invokespecial 203	com/tencent/mm/plugin/freewifi/b/c:byD	()J
    //   340: lconst_0
    //   341: lcmp
    //   342: ifeq +69 -> 411
    //   345: invokestatic 208	java/lang/System:currentTimeMillis	()J
    //   348: aload_0
    //   349: invokespecial 203	com/tencent/mm/plugin/freewifi/b/c:byD	()J
    //   352: lsub
    //   353: aload_0
    //   354: invokevirtual 89	com/tencent/mm/plugin/freewifi/b/c:byC	()I
    //   357: i2l
    //   358: lcmp
    //   359: ifge +52 -> 411
    //   362: iload 7
    //   364: iconst_2
    //   365: if_icmpne +46 -> 411
    //   368: new 146	java/lang/StringBuilder
    //   371: astore_3
    //   372: aload_3
    //   373: ldc 210
    //   375: invokespecial 151	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   378: aload_0
    //   379: aload_1
    //   380: sipush 1109
    //   383: aload_3
    //   384: aload_0
    //   385: getfield 48	com/tencent/mm/plugin/freewifi/b/c:mvm	I
    //   388: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   391: ldc 212
    //   393: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   399: invokespecial 134	com/tencent/mm/plugin/freewifi/b/c:a	(Lcom/tencent/mm/g/a/fh;ILjava/lang/String;)V
    //   402: sipush 20676
    //   405: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   408: goto -324 -> 84
    //   411: aload 4
    //   413: iconst_1
    //   414: aaload
    //   415: invokestatic 218	com/tencent/mm/plugin/freewifi/m:isEmpty	(Ljava/lang/String;)Z
    //   418: ifeq +22 -> 440
    //   421: aload_0
    //   422: aload_1
    //   423: sipush 1105
    //   426: ldc 220
    //   428: invokespecial 134	com/tencent/mm/plugin/freewifi/b/c:a	(Lcom/tencent/mm/g/a/fh;ILjava/lang/String;)V
    //   431: sipush 20676
    //   434: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   437: goto -353 -> 84
    //   440: new 222	java/util/LinkedList
    //   443: astore_3
    //   444: aload_3
    //   445: invokespecial 223	java/util/LinkedList:<init>	()V
    //   448: new 225	org/json/JSONArray
    //   451: astore 6
    //   453: aload 6
    //   455: aload 4
    //   457: iconst_1
    //   458: aaload
    //   459: invokespecial 226	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   462: aload 6
    //   464: invokevirtual 229	org/json/JSONArray:length	()I
    //   467: aload_0
    //   468: invokevirtual 86	com/tencent/mm/plugin/freewifi/b/c:byB	()I
    //   471: if_icmple +59 -> 530
    //   474: new 146	java/lang/StringBuilder
    //   477: astore_3
    //   478: aload_3
    //   479: ldc 231
    //   481: invokespecial 151	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   484: aload_0
    //   485: aload_1
    //   486: sipush 1110
    //   489: aload_3
    //   490: aload 6
    //   492: invokevirtual 229	org/json/JSONArray:length	()I
    //   495: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   498: ldc 233
    //   500: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   503: aload_0
    //   504: invokevirtual 86	com/tencent/mm/plugin/freewifi/b/c:byB	()I
    //   507: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   510: ldc 195
    //   512: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   515: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   518: invokespecial 134	com/tencent/mm/plugin/freewifi/b/c:a	(Lcom/tencent/mm/g/a/fh;ILjava/lang/String;)V
    //   521: sipush 20676
    //   524: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   527: goto -443 -> 84
    //   530: iload_2
    //   531: istore 5
    //   533: aload 6
    //   535: invokevirtual 229	org/json/JSONArray:length	()I
    //   538: ifne +59 -> 597
    //   541: new 146	java/lang/StringBuilder
    //   544: astore_3
    //   545: aload_3
    //   546: ldc 231
    //   548: invokespecial 151	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   551: aload_0
    //   552: aload_1
    //   553: sipush 1110
    //   556: aload_3
    //   557: aload 6
    //   559: invokevirtual 229	org/json/JSONArray:length	()I
    //   562: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   565: ldc 233
    //   567: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   570: aload_0
    //   571: invokevirtual 86	com/tencent/mm/plugin/freewifi/b/c:byB	()I
    //   574: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   577: ldc 195
    //   579: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   582: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   585: invokespecial 134	com/tencent/mm/plugin/freewifi/b/c:a	(Lcom/tencent/mm/g/a/fh;ILjava/lang/String;)V
    //   588: sipush 20676
    //   591: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   594: goto -510 -> 84
    //   597: iload 5
    //   599: aload 6
    //   601: invokevirtual 229	org/json/JSONArray:length	()I
    //   604: if_icmpge +95 -> 699
    //   607: aload 6
    //   609: iload 5
    //   611: invokevirtual 237	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   614: astore 8
    //   616: new 239	com/tencent/mm/protocal/protobuf/bak
    //   619: astore 4
    //   621: aload 4
    //   623: invokespecial 240	com/tencent/mm/protocal/protobuf/bak:<init>	()V
    //   626: aload 4
    //   628: aload 8
    //   630: ldc 20
    //   632: invokevirtual 246	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   635: invokestatic 249	com/tencent/mm/plugin/freewifi/m:Mv	(Ljava/lang/String;)Ljava/lang/String;
    //   638: putfield 252	com/tencent/mm/protocal/protobuf/bak:ssid	Ljava/lang/String;
    //   641: aload 4
    //   643: aload 8
    //   645: ldc 22
    //   647: invokevirtual 246	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   650: putfield 254	com/tencent/mm/protocal/protobuf/bak:bssid	Ljava/lang/String;
    //   653: aload 4
    //   655: aload 8
    //   657: ldc 24
    //   659: invokevirtual 258	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   662: putfield 261	com/tencent/mm/protocal/protobuf/bak:cyC	I
    //   665: aload_3
    //   666: aload 4
    //   668: invokevirtual 265	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   671: pop
    //   672: iinc 5 1
    //   675: goto -78 -> 597
    //   678: astore_3
    //   679: aload_0
    //   680: aload_1
    //   681: sipush 1105
    //   684: ldc_w 267
    //   687: invokespecial 134	com/tencent/mm/plugin/freewifi/b/c:a	(Lcom/tencent/mm/g/a/fh;ILjava/lang/String;)V
    //   690: sipush 20676
    //   693: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   696: goto -612 -> 84
    //   699: new 269	com/tencent/mm/plugin/freewifi/d/j
    //   702: astore 6
    //   704: aload 6
    //   706: aload_3
    //   707: iload 7
    //   709: invokespecial 272	com/tencent/mm/plugin/freewifi/d/j:<init>	(Ljava/util/LinkedList;I)V
    //   712: new 274	com/tencent/mm/plugin/freewifi/b/c$1
    //   715: astore 4
    //   717: aload 4
    //   719: aload_0
    //   720: aload_3
    //   721: iload 7
    //   723: aload_1
    //   724: invokespecial 277	com/tencent/mm/plugin/freewifi/b/c$1:<init>	(Lcom/tencent/mm/plugin/freewifi/b/c;Ljava/util/LinkedList;ILcom/tencent/mm/g/a/fh;)V
    //   727: aload 6
    //   729: aload 4
    //   731: invokevirtual 281	com/tencent/mm/plugin/freewifi/d/j:c	(Lcom/tencent/mm/ai/f;)V
    //   734: sipush 20676
    //   737: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   740: goto -656 -> 84
    //   743: aload_0
    //   744: aload_1
    //   745: sipush 1103
    //   748: ldc_w 283
    //   751: invokespecial 134	com/tencent/mm/plugin/freewifi/b/c:a	(Lcom/tencent/mm/g/a/fh;ILjava/lang/String;)V
    //   754: sipush 20676
    //   757: invokestatic 120	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   760: goto -676 -> 84
    //
    // Exception table:
    //   from	to	target	type
    //   4	57	248	finally
    //   62	68	248	finally
    //   68	84	248	finally
    //   87	95	248	finally
    //   98	146	248	finally
    //   152	181	248	finally
    //   181	193	248	finally
    //   199	245	248	finally
    //   254	270	248	finally
    //   273	285	248	finally
    //   297	307	248	finally
    //   307	313	248	finally
    //   317	333	248	finally
    //   336	362	248	finally
    //   368	408	248	finally
    //   411	437	248	finally
    //   440	448	248	finally
    //   448	521	248	finally
    //   521	527	248	finally
    //   533	588	248	finally
    //   588	594	248	finally
    //   597	672	248	finally
    //   679	696	248	finally
    //   699	740	248	finally
    //   743	760	248	finally
    //   181	193	253	java/lang/Exception
    //   273	285	316	java/lang/Exception
    //   297	307	316	java/lang/Exception
    //   448	521	678	java/lang/Exception
    //   533	588	678	java/lang/Exception
    //   597	672	678	java/lang/Exception
  }

  public final int byB()
  {
    try
    {
      AppMethodBeat.i(20678);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("getReqMaxApCount() returns ");
      ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", this.mvl);
      int i = this.mvl;
      AppMethodBeat.o(20678);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int byC()
  {
    try
    {
      int i = this.mvm;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void iM(long paramLong)
  {
    try
    {
      this.mvn = paramLong;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void vP(int paramInt)
  {
    try
    {
      AppMethodBeat.i(20679);
      ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "setReqMaxApCount() param reqMaxApCount = ".concat(String.valueOf(paramInt)));
      this.mvl = paramInt;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("setReqMaxApCount() this.reqMaxApCount = ");
      ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", this.mvl);
      AppMethodBeat.o(20679);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void vQ(int paramInt)
  {
    try
    {
      this.mvm = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.b.c
 * JD-Core Version:    0.6.2
 */