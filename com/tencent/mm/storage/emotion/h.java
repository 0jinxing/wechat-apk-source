package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class h extends j<g>
  implements g.a
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(62855);
    fnj = new String[] { j.a(g.ccO, "EmotionDesignerInfo") };
    AppMethodBeat.o(62855);
  }

  public h(e parame)
  {
    super(parame, g.ccO, "EmotionDesignerInfo", null);
    this.bSd = parame;
  }

  public final int a(com.tencent.mm.cd.g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  // ERROR //
  public final com.tencent.mm.protocal.protobuf.aic aqn(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 55
    //   4: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_1
    //   8: invokestatic 61	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   11: ifeq +19 -> 30
    //   14: ldc 63
    //   16: ldc 65
    //   18: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: ldc 55
    //   23: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   26: aload_2
    //   27: astore_1
    //   28: aload_1
    //   29: areturn
    //   30: new 73	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   37: aload_1
    //   38: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: getstatic 83	com/tencent/mm/storage/emotion/h$a:yaZ	Lcom/tencent/mm/storage/emotion/h$a;
    //   44: getfield 87	com/tencent/mm/storage/emotion/h$a:value	I
    //   47: invokevirtual 90	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   50: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   53: astore_1
    //   54: aload_0
    //   55: getfield 49	com/tencent/mm/storage/emotion/h:bSd	Lcom/tencent/mm/sdk/e/e;
    //   58: ldc 32
    //   60: iconst_1
    //   61: anewarray 24	java/lang/String
    //   64: dup
    //   65: iconst_0
    //   66: ldc 96
    //   68: aastore
    //   69: ldc 98
    //   71: iconst_1
    //   72: anewarray 24	java/lang/String
    //   75: dup
    //   76: iconst_0
    //   77: aload_1
    //   78: aastore
    //   79: aconst_null
    //   80: aconst_null
    //   81: aconst_null
    //   82: iconst_2
    //   83: invokeinterface 103 9 0
    //   88: astore_2
    //   89: aload_2
    //   90: ifnull +137 -> 227
    //   93: aload_2
    //   94: astore_1
    //   95: aload_2
    //   96: invokeinterface 109 1 0
    //   101: ifeq +126 -> 227
    //   104: aload_2
    //   105: astore_1
    //   106: new 111	com/tencent/mm/protocal/protobuf/aic
    //   109: astore_3
    //   110: aload_2
    //   111: astore_1
    //   112: aload_3
    //   113: invokespecial 112	com/tencent/mm/protocal/protobuf/aic:<init>	()V
    //   116: aload_2
    //   117: astore_1
    //   118: aload_3
    //   119: aload_2
    //   120: iconst_0
    //   121: invokeinterface 116 2 0
    //   126: invokevirtual 120	com/tencent/mm/protocal/protobuf/aic:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   129: pop
    //   130: aload_3
    //   131: astore_1
    //   132: aload_2
    //   133: ifnull +11 -> 144
    //   136: aload_2
    //   137: invokeinterface 123 1 0
    //   142: aload_3
    //   143: astore_1
    //   144: ldc 55
    //   146: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: goto -121 -> 28
    //   152: astore_3
    //   153: aconst_null
    //   154: astore_2
    //   155: aload_2
    //   156: astore_1
    //   157: ldc 63
    //   159: ldc 125
    //   161: iconst_1
    //   162: anewarray 127	java/lang/Object
    //   165: dup
    //   166: iconst_0
    //   167: aload_3
    //   168: invokestatic 131	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   171: aastore
    //   172: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   175: aload_2
    //   176: ifnull +46 -> 222
    //   179: aload_2
    //   180: invokeinterface 123 1 0
    //   185: aconst_null
    //   186: astore_1
    //   187: goto -43 -> 144
    //   190: astore_1
    //   191: aconst_null
    //   192: astore_2
    //   193: aload_1
    //   194: astore_3
    //   195: aload_2
    //   196: ifnull +9 -> 205
    //   199: aload_2
    //   200: invokeinterface 123 1 0
    //   205: ldc 55
    //   207: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   210: aload_3
    //   211: athrow
    //   212: astore_3
    //   213: aload_1
    //   214: astore_2
    //   215: goto -20 -> 195
    //   218: astore_3
    //   219: goto -64 -> 155
    //   222: aconst_null
    //   223: astore_1
    //   224: goto -80 -> 144
    //   227: aconst_null
    //   228: astore_3
    //   229: goto -99 -> 130
    //
    // Exception table:
    //   from	to	target	type
    //   54	89	152	java/lang/Exception
    //   54	89	190	finally
    //   95	104	212	finally
    //   106	110	212	finally
    //   112	116	212	finally
    //   118	130	212	finally
    //   157	175	212	finally
    //   95	104	218	java/lang/Exception
    //   106	110	218	java/lang/Exception
    //   112	116	218	java/lang/Exception
    //   118	130	218	java/lang/Exception
  }

  // ERROR //
  public final com.tencent.mm.protocal.protobuf.aia aqo(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 140
    //   4: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_1
    //   8: invokestatic 61	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   11: ifeq +19 -> 30
    //   14: ldc 63
    //   16: ldc 142
    //   18: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: ldc 140
    //   23: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   26: aload_2
    //   27: astore_1
    //   28: aload_1
    //   29: areturn
    //   30: new 73	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   37: aload_1
    //   38: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: getstatic 145	com/tencent/mm/storage/emotion/h$a:ybb	Lcom/tencent/mm/storage/emotion/h$a;
    //   44: getfield 87	com/tencent/mm/storage/emotion/h$a:value	I
    //   47: invokevirtual 90	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   50: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   53: astore_1
    //   54: aload_0
    //   55: getfield 49	com/tencent/mm/storage/emotion/h:bSd	Lcom/tencent/mm/sdk/e/e;
    //   58: ldc 32
    //   60: iconst_1
    //   61: anewarray 24	java/lang/String
    //   64: dup
    //   65: iconst_0
    //   66: ldc 96
    //   68: aastore
    //   69: ldc 98
    //   71: iconst_1
    //   72: anewarray 24	java/lang/String
    //   75: dup
    //   76: iconst_0
    //   77: aload_1
    //   78: aastore
    //   79: aconst_null
    //   80: aconst_null
    //   81: aconst_null
    //   82: iconst_2
    //   83: invokeinterface 103 9 0
    //   88: astore_2
    //   89: aload_2
    //   90: ifnull +133 -> 223
    //   93: aload_2
    //   94: astore_1
    //   95: aload_2
    //   96: invokeinterface 109 1 0
    //   101: ifeq +122 -> 223
    //   104: aload_2
    //   105: astore_1
    //   106: new 147	com/tencent/mm/protocal/protobuf/aia
    //   109: astore_3
    //   110: aload_2
    //   111: astore_1
    //   112: aload_3
    //   113: invokespecial 148	com/tencent/mm/protocal/protobuf/aia:<init>	()V
    //   116: aload_2
    //   117: astore_1
    //   118: aload_3
    //   119: aload_2
    //   120: iconst_0
    //   121: invokeinterface 116 2 0
    //   126: invokevirtual 149	com/tencent/mm/protocal/protobuf/aia:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   129: pop
    //   130: aload_3
    //   131: astore_1
    //   132: aload_2
    //   133: ifnull +11 -> 144
    //   136: aload_2
    //   137: invokeinterface 123 1 0
    //   142: aload_3
    //   143: astore_1
    //   144: ldc 140
    //   146: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: goto -121 -> 28
    //   152: astore_3
    //   153: aconst_null
    //   154: astore_2
    //   155: aload_2
    //   156: astore_1
    //   157: ldc 63
    //   159: ldc 125
    //   161: iconst_1
    //   162: anewarray 127	java/lang/Object
    //   165: dup
    //   166: iconst_0
    //   167: aload_3
    //   168: invokestatic 131	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   171: aastore
    //   172: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   175: aload_2
    //   176: ifnull +42 -> 218
    //   179: aload_2
    //   180: invokeinterface 123 1 0
    //   185: aconst_null
    //   186: astore_1
    //   187: goto -43 -> 144
    //   190: astore_2
    //   191: aconst_null
    //   192: astore_1
    //   193: aload_1
    //   194: ifnull +9 -> 203
    //   197: aload_1
    //   198: invokeinterface 123 1 0
    //   203: ldc 140
    //   205: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   208: aload_2
    //   209: athrow
    //   210: astore_2
    //   211: goto -18 -> 193
    //   214: astore_3
    //   215: goto -60 -> 155
    //   218: aconst_null
    //   219: astore_1
    //   220: goto -76 -> 144
    //   223: aconst_null
    //   224: astore_3
    //   225: goto -95 -> 130
    //
    // Exception table:
    //   from	to	target	type
    //   54	89	152	java/io/IOException
    //   54	89	190	finally
    //   95	104	210	finally
    //   106	110	210	finally
    //   112	116	210	finally
    //   118	130	210	finally
    //   157	175	210	finally
    //   95	104	214	java/io/IOException
    //   106	110	214	java/io/IOException
    //   112	116	214	java/io/IOException
    //   118	130	214	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.h
 * JD-Core Version:    0.6.2
 */