package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.wenote.model.a.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public class h
{
  private static volatile h uPE = null;
  private q uPF = null;

  // ERROR //
  private static byte[] b(q paramq)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: sipush 26784
    //   7: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: ifnonnull +13 -> 24
    //   14: sipush 26784
    //   17: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   20: aload_2
    //   21: astore_0
    //   22: aload_0
    //   23: areturn
    //   24: new 33	java/io/ByteArrayOutputStream
    //   27: astore_2
    //   28: aload_2
    //   29: invokespecial 34	java/io/ByteArrayOutputStream:<init>	()V
    //   32: new 36	java/io/ObjectOutputStream
    //   35: astore_3
    //   36: aload_3
    //   37: aload_2
    //   38: invokespecial 39	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   41: aload_3
    //   42: astore 4
    //   44: aload_2
    //   45: astore 5
    //   47: aload_3
    //   48: aload_0
    //   49: invokevirtual 43	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   52: aload_3
    //   53: astore 4
    //   55: aload_2
    //   56: astore 5
    //   58: aload_3
    //   59: invokevirtual 46	java/io/ObjectOutputStream:flush	()V
    //   62: aload_3
    //   63: astore 4
    //   65: aload_2
    //   66: astore 5
    //   68: aload_2
    //   69: invokevirtual 50	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   72: astore_0
    //   73: aload_3
    //   74: invokevirtual 53	java/io/ObjectOutputStream:close	()V
    //   77: aload_2
    //   78: invokevirtual 54	java/io/ByteArrayOutputStream:close	()V
    //   81: sipush 26784
    //   84: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: goto -65 -> 22
    //   90: astore_2
    //   91: ldc 56
    //   93: ldc 58
    //   95: iconst_1
    //   96: anewarray 4	java/lang/Object
    //   99: dup
    //   100: iconst_0
    //   101: aload_2
    //   102: aastore
    //   103: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   106: goto -25 -> 81
    //   109: astore 6
    //   111: aconst_null
    //   112: astore_0
    //   113: aconst_null
    //   114: astore_2
    //   115: aload_0
    //   116: astore 4
    //   118: aload_2
    //   119: astore 5
    //   121: ldc 56
    //   123: ldc 66
    //   125: iconst_1
    //   126: anewarray 4	java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: aload 6
    //   133: aastore
    //   134: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: aload_0
    //   138: ifnull +7 -> 145
    //   141: aload_0
    //   142: invokevirtual 53	java/io/ObjectOutputStream:close	()V
    //   145: aload_1
    //   146: astore_0
    //   147: aload_2
    //   148: ifnull -67 -> 81
    //   151: aload_2
    //   152: invokevirtual 54	java/io/ByteArrayOutputStream:close	()V
    //   155: aload_1
    //   156: astore_0
    //   157: goto -76 -> 81
    //   160: astore_0
    //   161: ldc 56
    //   163: ldc 58
    //   165: iconst_1
    //   166: anewarray 4	java/lang/Object
    //   169: dup
    //   170: iconst_0
    //   171: aload_0
    //   172: aastore
    //   173: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   176: aload_1
    //   177: astore_0
    //   178: goto -97 -> 81
    //   181: astore_0
    //   182: aconst_null
    //   183: astore 4
    //   185: aconst_null
    //   186: astore_2
    //   187: aload 4
    //   189: ifnull +8 -> 197
    //   192: aload 4
    //   194: invokevirtual 53	java/io/ObjectOutputStream:close	()V
    //   197: aload_2
    //   198: ifnull +7 -> 205
    //   201: aload_2
    //   202: invokevirtual 54	java/io/ByteArrayOutputStream:close	()V
    //   205: sipush 26784
    //   208: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   211: aload_0
    //   212: athrow
    //   213: astore_2
    //   214: ldc 56
    //   216: ldc 58
    //   218: iconst_1
    //   219: anewarray 4	java/lang/Object
    //   222: dup
    //   223: iconst_0
    //   224: aload_2
    //   225: aastore
    //   226: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   229: goto -24 -> 205
    //   232: astore_0
    //   233: aconst_null
    //   234: astore 4
    //   236: goto -49 -> 187
    //   239: astore_0
    //   240: aload 5
    //   242: astore_2
    //   243: goto -56 -> 187
    //   246: astore 6
    //   248: aconst_null
    //   249: astore_0
    //   250: goto -135 -> 115
    //   253: astore 6
    //   255: aload_3
    //   256: astore_0
    //   257: goto -142 -> 115
    //
    // Exception table:
    //   from	to	target	type
    //   73	81	90	java/lang/Exception
    //   24	32	109	java/lang/Exception
    //   141	145	160	java/lang/Exception
    //   151	155	160	java/lang/Exception
    //   24	32	181	finally
    //   192	197	213	java/lang/Exception
    //   201	205	213	java/lang/Exception
    //   32	41	232	finally
    //   47	52	239	finally
    //   58	62	239	finally
    //   68	73	239	finally
    //   121	137	239	finally
    //   32	41	246	java/lang/Exception
    //   47	52	253	java/lang/Exception
    //   58	62	253	java/lang/Exception
    //   68	73	253	java/lang/Exception
  }

  // ERROR //
  private static q bF(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: sipush 26783
    //   3: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ifnull +8 -> 15
    //   10: aload_0
    //   11: arraylength
    //   12: ifgt +13 -> 25
    //   15: sipush 26783
    //   18: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aconst_null
    //   22: astore_0
    //   23: aload_0
    //   24: areturn
    //   25: new 70	java/io/ByteArrayInputStream
    //   28: astore_1
    //   29: aload_1
    //   30: aload_0
    //   31: invokespecial 73	java/io/ByteArrayInputStream:<init>	([B)V
    //   34: new 75	java/io/ObjectInputStream
    //   37: astore_0
    //   38: aload_0
    //   39: aload_1
    //   40: invokespecial 78	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   43: aload_0
    //   44: astore_2
    //   45: aload_1
    //   46: astore_3
    //   47: aload_0
    //   48: invokevirtual 82	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   51: checkcast 84	com/tencent/mm/plugin/wenote/model/a/q
    //   54: astore 4
    //   56: aload_0
    //   57: invokevirtual 85	java/io/ObjectInputStream:close	()V
    //   60: aload_1
    //   61: invokevirtual 86	java/io/ByteArrayInputStream:close	()V
    //   64: aload 4
    //   66: astore_0
    //   67: sipush 26783
    //   70: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: goto -50 -> 23
    //   76: astore_0
    //   77: ldc 56
    //   79: ldc 88
    //   81: iconst_1
    //   82: anewarray 4	java/lang/Object
    //   85: dup
    //   86: iconst_0
    //   87: aload_0
    //   88: aastore
    //   89: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: aload 4
    //   94: astore_0
    //   95: goto -28 -> 67
    //   98: astore 4
    //   100: aconst_null
    //   101: astore_0
    //   102: aconst_null
    //   103: astore_1
    //   104: aload_0
    //   105: astore_2
    //   106: aload_1
    //   107: astore_3
    //   108: ldc 56
    //   110: ldc 90
    //   112: iconst_1
    //   113: anewarray 4	java/lang/Object
    //   116: dup
    //   117: iconst_0
    //   118: aload 4
    //   120: aastore
    //   121: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: aload_0
    //   125: ifnull +7 -> 132
    //   128: aload_0
    //   129: invokevirtual 85	java/io/ObjectInputStream:close	()V
    //   132: aload_1
    //   133: ifnull +7 -> 140
    //   136: aload_1
    //   137: invokevirtual 86	java/io/ByteArrayInputStream:close	()V
    //   140: aconst_null
    //   141: astore_0
    //   142: goto -75 -> 67
    //   145: astore_0
    //   146: ldc 56
    //   148: ldc 88
    //   150: iconst_1
    //   151: anewarray 4	java/lang/Object
    //   154: dup
    //   155: iconst_0
    //   156: aload_0
    //   157: aastore
    //   158: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: aconst_null
    //   162: astore_0
    //   163: goto -96 -> 67
    //   166: astore_0
    //   167: aconst_null
    //   168: astore_2
    //   169: aconst_null
    //   170: astore_1
    //   171: aload_2
    //   172: ifnull +7 -> 179
    //   175: aload_2
    //   176: invokevirtual 85	java/io/ObjectInputStream:close	()V
    //   179: aload_1
    //   180: ifnull +7 -> 187
    //   183: aload_1
    //   184: invokevirtual 86	java/io/ByteArrayInputStream:close	()V
    //   187: sipush 26783
    //   190: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   193: aload_0
    //   194: athrow
    //   195: astore_1
    //   196: ldc 56
    //   198: ldc 88
    //   200: iconst_1
    //   201: anewarray 4	java/lang/Object
    //   204: dup
    //   205: iconst_0
    //   206: aload_1
    //   207: aastore
    //   208: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   211: goto -24 -> 187
    //   214: astore_0
    //   215: aconst_null
    //   216: astore_2
    //   217: goto -46 -> 171
    //   220: astore_0
    //   221: aload_3
    //   222: astore_1
    //   223: goto -52 -> 171
    //   226: astore 4
    //   228: aconst_null
    //   229: astore_0
    //   230: goto -126 -> 104
    //   233: astore 4
    //   235: goto -131 -> 104
    //
    // Exception table:
    //   from	to	target	type
    //   56	64	76	java/lang/Exception
    //   25	34	98	java/lang/Exception
    //   128	132	145	java/lang/Exception
    //   136	140	145	java/lang/Exception
    //   25	34	166	finally
    //   175	179	195	java/lang/Exception
    //   183	187	195	java/lang/Exception
    //   34	43	214	finally
    //   47	56	220	finally
    //   108	124	220	finally
    //   34	43	226	java/lang/Exception
    //   47	56	233	java/lang/Exception
  }

  public static h deH()
  {
    AppMethodBeat.i(26780);
    if (uPE == null);
    try
    {
      if (uPE == null)
      {
        localh = new com/tencent/mm/plugin/wenote/model/nativenote/manager/h;
        localh.<init>();
        uPE = localh;
      }
      h localh = uPE;
      AppMethodBeat.o(26780);
      return localh;
    }
    finally
    {
      AppMethodBeat.o(26780);
    }
  }

  public final void a(q paramq)
  {
    AppMethodBeat.i(26782);
    this.uPF = paramq;
    byte[] arrayOfByte = b(this.uPF);
    String str = "";
    paramq = str;
    if (arrayOfByte != null)
    {
      paramq = str;
      if (arrayOfByte.length > 0)
        paramq = bo.cd(arrayOfByte);
    }
    if (this.uPF != null);
    for (str = this.uPF.ddR(); ; str = "null")
    {
      ab.i("WNNoteKeepTopManager", "setCurrentTopItem item: %s", new Object[] { str });
      ab.i("WNNoteKeepTopManager", "setCurrentTopItem itemStr: %s", new Object[] { paramq });
      aw.ZK();
      c.Ry().set(ac.a.xRQ, bo.nullAsNil(paramq));
      AppMethodBeat.o(26782);
      return;
    }
  }

  public final q deI()
  {
    AppMethodBeat.i(26781);
    if (this.uPF != null)
    {
      localObject = this.uPF;
      AppMethodBeat.o(26781);
    }
    while (true)
    {
      return localObject;
      aw.ZK();
      localObject = (String)c.Ry().get(ac.a.xRQ, "");
      ab.d("WNNoteKeepTopManager", "getCurrentTopItem itemStr: %s", new Object[] { localObject });
      if (bo.isNullOrNil((String)localObject))
      {
        AppMethodBeat.o(26781);
        localObject = null;
      }
      else
      {
        localObject = bo.anf((String)localObject);
        if (localObject.length > 0)
          break;
        AppMethodBeat.o(26781);
        localObject = null;
      }
    }
    this.uPF = bF((byte[])localObject);
    if (this.uPF != null);
    for (Object localObject = this.uPF.ddR(); ; localObject = "null")
    {
      ab.d("WNNoteKeepTopManager", "getCurrentTopItem item: %s", new Object[] { localObject });
      localObject = this.uPF;
      AppMethodBeat.o(26781);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.h
 * JD-Core Version:    0.6.2
 */