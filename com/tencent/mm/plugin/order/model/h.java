package com.tencent.mm.plugin.order.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;

public final class h extends m
{
  public MallOrderDetailObject pcS;
  private int pcT;

  public h(String paramString)
  {
    this(paramString, null, -1);
  }

  public h(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, -1);
  }

  public h(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(43781);
    this.pcS = null;
    this.pcT = -1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString1);
    if (!bo.isNullOrNil(paramString2))
      localHashMap.put("bill_id", paramString2);
    if (this.pcT >= 0)
      this.pcT = paramInt;
    M(localHashMap);
    AppMethodBeat.o(43781);
  }

  // ERROR //
  public final void a(int paramInt, String paramString, org.json.JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc 62
    //   2: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_3
    //   6: ifnull +382 -> 388
    //   9: aload_0
    //   10: new 64	com/tencent/mm/plugin/order/model/MallOrderDetailObject
    //   13: dup
    //   14: invokespecial 65	com/tencent/mm/plugin/order/model/MallOrderDetailObject:<init>	()V
    //   17: putfield 27	com/tencent/mm/plugin/order/model/h:pcS	Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject;
    //   20: aload_0
    //   21: getfield 27	com/tencent/mm/plugin/order/model/h:pcS	Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject;
    //   24: astore 4
    //   26: aload_3
    //   27: ifnull +361 -> 388
    //   30: aload 4
    //   32: aload_3
    //   33: invokestatic 71	com/tencent/mm/plugin/order/model/MallTransactionObject:ae	(Lorg/json/JSONObject;)Lcom/tencent/mm/plugin/order/model/MallTransactionObject;
    //   36: putfield 75	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbI	Lcom/tencent/mm/plugin/order/model/MallTransactionObject;
    //   39: aload_3
    //   40: ldc 77
    //   42: invokevirtual 83	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   45: astore 5
    //   47: aload 5
    //   49: ifnull +377 -> 426
    //   52: new 85	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b
    //   55: astore_2
    //   56: aload_2
    //   57: invokespecial 86	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b:<init>	()V
    //   60: aload_2
    //   61: aload 5
    //   63: ldc 88
    //   65: invokevirtual 92	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   68: putfield 96	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b:pbR	Ljava/lang/String;
    //   71: aload_2
    //   72: aload 5
    //   74: ldc 98
    //   76: invokevirtual 102	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   79: putfield 105	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b:oyB	I
    //   82: aload_2
    //   83: aload 5
    //   85: ldc 107
    //   87: invokevirtual 92	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   90: putfield 110	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b:thumbUrl	Ljava/lang/String;
    //   93: aload_2
    //   94: aload 5
    //   96: ldc 112
    //   98: invokevirtual 92	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   101: putfield 115	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b:mZj	Ljava/lang/String;
    //   104: aload_2
    //   105: aload 5
    //   107: ldc 117
    //   109: invokevirtual 92	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   112: putfield 120	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b:pbS	Ljava/lang/String;
    //   115: aload 4
    //   117: aload_2
    //   118: putfield 124	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbJ	Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$b;
    //   121: aload 4
    //   123: aload_3
    //   124: invokestatic 128	com/tencent/mm/plugin/order/model/MallOrderDetailObject:ac	(Lorg/json/JSONObject;)Ljava/util/ArrayList;
    //   127: putfield 132	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbK	Ljava/util/ArrayList;
    //   130: aload_3
    //   131: ldc 134
    //   133: invokevirtual 138	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   136: astore 5
    //   138: aload 5
    //   140: ifnull +11 -> 151
    //   143: aload 5
    //   145: invokevirtual 144	org/json/JSONArray:length	()I
    //   148: ifne +347 -> 495
    //   151: aconst_null
    //   152: astore_2
    //   153: aload 4
    //   155: aload_2
    //   156: putfield 148	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbL	Ljava/util/List;
    //   159: aload 4
    //   161: getfield 148	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbL	Ljava/util/List;
    //   164: astore 5
    //   166: aload_3
    //   167: ldc 150
    //   169: invokevirtual 153	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   172: astore 6
    //   174: aload 6
    //   176: ifnull +90 -> 266
    //   179: aload 5
    //   181: astore_2
    //   182: aload 5
    //   184: ifnonnull +11 -> 195
    //   187: new 155	java/util/ArrayList
    //   190: astore_2
    //   191: aload_2
    //   192: invokespecial 156	java/util/ArrayList:<init>	()V
    //   195: new 158	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a
    //   198: astore 5
    //   200: aload 5
    //   202: invokespecial 159	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:<init>	()V
    //   205: aload 6
    //   207: ldc 161
    //   209: invokevirtual 164	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   212: ifeq +471 -> 683
    //   215: aload 5
    //   217: aload 6
    //   219: ldc 161
    //   221: invokevirtual 92	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   224: putfield 166	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:value	Ljava/lang/String;
    //   227: aload 5
    //   229: iconst_2
    //   230: putfield 169	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:type	I
    //   233: aload 6
    //   235: ldc 171
    //   237: iconst_0
    //   238: invokevirtual 174	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   241: istore_1
    //   242: iload_1
    //   243: iflt +23 -> 266
    //   246: iload_1
    //   247: aload 6
    //   249: invokevirtual 175	org/json/JSONObject:length	()I
    //   252: iconst_1
    //   253: iadd
    //   254: if_icmpgt +12 -> 266
    //   257: aload_2
    //   258: iload_1
    //   259: aload 5
    //   261: invokeinterface 181 3 0
    //   266: aload 4
    //   268: aload_3
    //   269: ldc 183
    //   271: invokevirtual 92	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   274: putfield 186	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbO	Ljava/lang/String;
    //   277: aload 4
    //   279: aload_3
    //   280: ldc 188
    //   282: invokevirtual 92	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   285: putfield 191	com/tencent/mm/plugin/order/model/MallOrderDetailObject:lCb	Ljava/lang/String;
    //   288: aload 4
    //   290: aload_3
    //   291: ldc 193
    //   293: invokevirtual 102	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   296: putfield 196	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbQ	I
    //   299: aload 4
    //   301: getfield 124	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbJ	Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$b;
    //   304: ifnull +24 -> 328
    //   307: aload 4
    //   309: getfield 196	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbQ	I
    //   312: ifgt +16 -> 328
    //   315: aload 4
    //   317: aload 4
    //   319: getfield 124	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbJ	Lcom/tencent/mm/plugin/order/model/MallOrderDetailObject$b;
    //   322: getfield 105	com/tencent/mm/plugin/order/model/MallOrderDetailObject$b:oyB	I
    //   325: putfield 196	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbQ	I
    //   328: aload 4
    //   330: getfield 75	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbI	Lcom/tencent/mm/plugin/order/model/MallTransactionObject;
    //   333: ifnull +55 -> 388
    //   336: aload 4
    //   338: aload 4
    //   340: getfield 75	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbI	Lcom/tencent/mm/plugin/order/model/MallTransactionObject;
    //   343: getfield 199	com/tencent/mm/plugin/order/model/MallTransactionObject:pbP	Ljava/lang/String;
    //   346: putfield 200	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbP	Ljava/lang/String;
    //   349: aload 4
    //   351: aload 4
    //   353: getfield 75	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbI	Lcom/tencent/mm/plugin/order/model/MallTransactionObject;
    //   356: getfield 203	com/tencent/mm/plugin/order/model/MallTransactionObject:pcm	Ljava/lang/String;
    //   359: putfield 206	com/tencent/mm/plugin/order/model/MallOrderDetailObject:cBb	Ljava/lang/String;
    //   362: aload 4
    //   364: aload 4
    //   366: getfield 75	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbI	Lcom/tencent/mm/plugin/order/model/MallTransactionObject;
    //   369: getfield 209	com/tencent/mm/plugin/order/model/MallTransactionObject:pbN	I
    //   372: putfield 210	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbN	I
    //   375: aload 4
    //   377: aload 4
    //   379: getfield 75	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbI	Lcom/tencent/mm/plugin/order/model/MallTransactionObject;
    //   382: getfield 213	com/tencent/mm/plugin/order/model/MallTransactionObject:pbM	Ljava/util/List;
    //   385: putfield 214	com/tencent/mm/plugin/order/model/MallOrderDetailObject:pbM	Ljava/util/List;
    //   388: ldc 62
    //   390: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   393: return
    //   394: astore_2
    //   395: ldc 216
    //   397: aload_2
    //   398: ldc 218
    //   400: iconst_0
    //   401: anewarray 220	java/lang/Object
    //   404: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   407: goto -368 -> 39
    //   410: astore_2
    //   411: ldc 216
    //   413: aload_2
    //   414: ldc 218
    //   416: iconst_0
    //   417: anewarray 220	java/lang/Object
    //   420: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   423: goto -384 -> 39
    //   426: aconst_null
    //   427: astore_2
    //   428: goto -313 -> 115
    //   431: astore_2
    //   432: ldc 216
    //   434: aload_2
    //   435: ldc 218
    //   437: iconst_0
    //   438: anewarray 220	java/lang/Object
    //   441: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   444: goto -323 -> 121
    //   447: astore_2
    //   448: ldc 216
    //   450: aload_2
    //   451: ldc 218
    //   453: iconst_0
    //   454: anewarray 220	java/lang/Object
    //   457: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   460: goto -339 -> 121
    //   463: astore_2
    //   464: ldc 216
    //   466: aload_2
    //   467: ldc 218
    //   469: iconst_0
    //   470: anewarray 220	java/lang/Object
    //   473: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   476: goto -346 -> 130
    //   479: astore_2
    //   480: ldc 216
    //   482: aload_2
    //   483: ldc 218
    //   485: iconst_0
    //   486: anewarray 220	java/lang/Object
    //   489: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   492: goto -362 -> 130
    //   495: new 155	java/util/ArrayList
    //   498: astore_2
    //   499: aload_2
    //   500: invokespecial 156	java/util/ArrayList:<init>	()V
    //   503: iconst_0
    //   504: istore_1
    //   505: iconst_0
    //   506: istore 7
    //   508: iload_1
    //   509: aload 5
    //   511: invokevirtual 144	org/json/JSONArray:length	()I
    //   514: if_icmpge +166 -> 680
    //   517: aload 5
    //   519: iload_1
    //   520: invokevirtual 229	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   523: astore 6
    //   525: new 158	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a
    //   528: astore 8
    //   530: aload 8
    //   532: invokespecial 159	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:<init>	()V
    //   535: aload 6
    //   537: ldc 231
    //   539: invokevirtual 102	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   542: ifne +49 -> 591
    //   545: iconst_0
    //   546: istore 9
    //   548: aload 8
    //   550: iload 9
    //   552: putfield 235	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:kch	Z
    //   555: aload 8
    //   557: aload 6
    //   559: ldc 237
    //   561: invokevirtual 92	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   564: putfield 239	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:name	Ljava/lang/String;
    //   567: aload 8
    //   569: getfield 239	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:name	Ljava/lang/String;
    //   572: invokestatic 245	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   575: ifeq +22 -> 597
    //   578: aload 8
    //   580: getfield 235	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:kch	Z
    //   583: istore 7
    //   585: iinc 1 1
    //   588: goto -80 -> 508
    //   591: iconst_1
    //   592: istore 9
    //   594: goto -46 -> 548
    //   597: iload 7
    //   599: ifeq +10 -> 609
    //   602: aload 8
    //   604: iload 7
    //   606: putfield 235	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:kch	Z
    //   609: aload 8
    //   611: getfield 235	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:kch	Z
    //   614: istore 7
    //   616: aload 8
    //   618: aload 6
    //   620: ldc 161
    //   622: invokevirtual 92	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   625: putfield 166	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:value	Ljava/lang/String;
    //   628: aload 8
    //   630: aload 6
    //   632: ldc 112
    //   634: invokevirtual 92	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   637: putfield 248	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:jumpUrl	Ljava/lang/String;
    //   640: aload 8
    //   642: aload 6
    //   644: ldc 250
    //   646: invokevirtual 102	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   649: putfield 253	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:jumpType	I
    //   652: aload_2
    //   653: aload 8
    //   655: invokeinterface 256 2 0
    //   660: pop
    //   661: goto -76 -> 585
    //   664: astore_2
    //   665: ldc 216
    //   667: aload_2
    //   668: ldc 218
    //   670: iconst_0
    //   671: anewarray 220	java/lang/Object
    //   674: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   677: goto -411 -> 266
    //   680: goto -527 -> 153
    //   683: aload 5
    //   685: iconst_1
    //   686: putfield 169	com/tencent/mm/plugin/order/model/MallOrderDetailObject$a:type	I
    //   689: goto -456 -> 233
    //   692: astore_2
    //   693: ldc 216
    //   695: aload_2
    //   696: ldc 218
    //   698: iconst_0
    //   699: anewarray 220	java/lang/Object
    //   702: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   705: goto -439 -> 266
    //
    // Exception table:
    //   from	to	target	type
    //   30	39	394	org/json/JSONException
    //   30	39	410	java/lang/Exception
    //   39	47	431	org/json/JSONException
    //   52	115	431	org/json/JSONException
    //   115	121	431	org/json/JSONException
    //   39	47	447	java/lang/Exception
    //   52	115	447	java/lang/Exception
    //   115	121	447	java/lang/Exception
    //   121	130	463	org/json/JSONException
    //   121	130	479	java/lang/Exception
    //   130	138	664	org/json/JSONException
    //   143	151	664	org/json/JSONException
    //   153	174	664	org/json/JSONException
    //   187	195	664	org/json/JSONException
    //   195	233	664	org/json/JSONException
    //   233	242	664	org/json/JSONException
    //   246	266	664	org/json/JSONException
    //   495	503	664	org/json/JSONException
    //   508	545	664	org/json/JSONException
    //   548	585	664	org/json/JSONException
    //   602	609	664	org/json/JSONException
    //   609	661	664	org/json/JSONException
    //   683	689	664	org/json/JSONException
    //   130	138	692	java/lang/Exception
    //   143	151	692	java/lang/Exception
    //   153	174	692	java/lang/Exception
    //   187	195	692	java/lang/Exception
    //   195	233	692	java/lang/Exception
    //   233	242	692	java/lang/Exception
    //   246	266	692	java/lang/Exception
    //   495	503	692	java/lang/Exception
    //   508	545	692	java/lang/Exception
    //   548	585	692	java/lang/Exception
    //   602	609	692	java/lang/Exception
    //   609	661	692	java/lang/Exception
    //   683	689	692	java/lang/Exception
  }

  public final int bgI()
  {
    return 108;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.model.h
 * JD-Core Version:    0.6.2
 */