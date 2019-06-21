package com.tencent.mm.plugin.secinforeport;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class c$a
{
  private static final Map<Integer, Long> qjl;

  static
  {
    AppMethodBeat.i(57493);
    qjl = new HashMap();
    AppMethodBeat.o(57493);
  }

  static boolean Y(int paramInt, long paramLong)
  {
    try
    {
      AppMethodBeat.i(57492);
      boolean bool;
      if (paramLong < 0L)
      {
        ab.w("MicroMsg.SecInfoReporterImpl", "bad interval: %s", new Object[] { Long.valueOf(paramLong) });
        AppMethodBeat.o(57492);
        bool = false;
      }
      while (true)
      {
        return bool;
        if (!qjl.containsKey(Integer.valueOf(paramInt)))
          sg();
        Long localLong = (Long)qjl.get(Integer.valueOf(paramInt));
        long l = System.currentTimeMillis();
        if ((localLong == null) || (l < localLong.longValue()))
        {
          qjl.put(Integer.valueOf(paramInt), Long.valueOf(0L));
          save();
          AppMethodBeat.o(57492);
          bool = false;
        }
        else if (l - localLong.longValue() > paramLong)
        {
          qjl.put(Integer.valueOf(paramInt), Long.valueOf(l));
          save();
          AppMethodBeat.o(57492);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(57492);
          bool = false;
        }
      }
    }
    finally
    {
    }
  }

  // ERROR //
  private static void save()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 86
    //   5: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 88	java/io/File
    //   11: astore_0
    //   12: aload_0
    //   13: invokestatic 94	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   16: getfield 100	com/tencent/mm/kernel/e:cachePath	Ljava/lang/String;
    //   19: getstatic 106	com/tencent/mm/plugin/normsg/a/b:oTO	Lcom/tencent/mm/plugin/normsg/a/b;
    //   22: ldc 108
    //   24: invokevirtual 112	com/tencent/mm/plugin/normsg/a/b:TQ	(Ljava/lang/String;)Ljava/lang/String;
    //   27: invokespecial 115	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: aload_0
    //   31: invokevirtual 119	java/io/File:exists	()Z
    //   34: ifne +11 -> 45
    //   37: aload_0
    //   38: invokevirtual 123	java/io/File:getParentFile	()Ljava/io/File;
    //   41: invokevirtual 126	java/io/File:mkdirs	()Z
    //   44: pop
    //   45: aconst_null
    //   46: astore_1
    //   47: new 128	java/io/DataOutputStream
    //   50: astore_2
    //   51: new 130	java/io/FileOutputStream
    //   54: astore_3
    //   55: aload_3
    //   56: aload_0
    //   57: invokespecial 133	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   60: aload_2
    //   61: aload_3
    //   62: invokespecial 136	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   65: aload_2
    //   66: sipush -774
    //   69: invokevirtual 139	java/io/DataOutputStream:writeShort	(I)V
    //   72: aload_2
    //   73: iconst_1
    //   74: invokevirtual 139	java/io/DataOutputStream:writeShort	(I)V
    //   77: aload_2
    //   78: getstatic 26	com/tencent/mm/plugin/secinforeport/c$a:qjl	Ljava/util/Map;
    //   81: invokeinterface 143 1 0
    //   86: invokevirtual 146	java/io/DataOutputStream:writeInt	(I)V
    //   89: getstatic 26	com/tencent/mm/plugin/secinforeport/c$a:qjl	Ljava/util/Map;
    //   92: invokeinterface 150 1 0
    //   97: invokeinterface 156 1 0
    //   102: astore_1
    //   103: aload_1
    //   104: invokeinterface 161 1 0
    //   109: ifeq +75 -> 184
    //   112: aload_1
    //   113: invokeinterface 165 1 0
    //   118: checkcast 167	java/util/Map$Entry
    //   121: astore_0
    //   122: aload_2
    //   123: aload_0
    //   124: invokeinterface 170 1 0
    //   129: checkcast 51	java/lang/Integer
    //   132: invokevirtual 173	java/lang/Integer:intValue	()I
    //   135: invokevirtual 146	java/io/DataOutputStream:writeInt	(I)V
    //   138: aload_2
    //   139: aload_0
    //   140: invokeinterface 176 1 0
    //   145: checkcast 39	java/lang/Long
    //   148: invokevirtual 76	java/lang/Long:longValue	()J
    //   151: invokevirtual 180	java/io/DataOutputStream:writeLong	(J)V
    //   154: goto -51 -> 103
    //   157: astore_1
    //   158: aload_2
    //   159: astore_1
    //   160: ldc 35
    //   162: ldc 182
    //   164: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   167: aload_1
    //   168: ifnull +77 -> 245
    //   171: aload_1
    //   172: invokevirtual 188	java/io/DataOutputStream:close	()V
    //   175: ldc 86
    //   177: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   180: ldc 2
    //   182: monitorexit
    //   183: return
    //   184: ldc 35
    //   186: ldc 190
    //   188: invokestatic 192	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   191: aload_2
    //   192: invokevirtual 188	java/io/DataOutputStream:close	()V
    //   195: ldc 86
    //   197: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   200: goto -20 -> 180
    //   203: astore_1
    //   204: ldc 2
    //   206: monitorexit
    //   207: aload_1
    //   208: athrow
    //   209: astore_1
    //   210: ldc 86
    //   212: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   215: goto -35 -> 180
    //   218: astore_1
    //   219: ldc 86
    //   221: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   224: goto -44 -> 180
    //   227: astore_1
    //   228: aconst_null
    //   229: astore_2
    //   230: aload_2
    //   231: ifnull +7 -> 238
    //   234: aload_2
    //   235: invokevirtual 188	java/io/DataOutputStream:close	()V
    //   238: ldc 86
    //   240: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   243: aload_1
    //   244: athrow
    //   245: ldc 86
    //   247: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   250: goto -70 -> 180
    //   253: astore_2
    //   254: goto -16 -> 238
    //   257: astore_1
    //   258: goto -28 -> 230
    //   261: astore_0
    //   262: aload_1
    //   263: astore_2
    //   264: aload_0
    //   265: astore_1
    //   266: goto -36 -> 230
    //   269: astore_2
    //   270: goto -110 -> 160
    //
    // Exception table:
    //   from	to	target	type
    //   65	103	157	java/lang/Exception
    //   103	154	157	java/lang/Exception
    //   184	191	157	java/lang/Exception
    //   3	45	203	finally
    //   171	175	203	finally
    //   175	180	203	finally
    //   191	195	203	finally
    //   195	200	203	finally
    //   210	215	203	finally
    //   219	224	203	finally
    //   234	238	203	finally
    //   238	245	203	finally
    //   245	250	203	finally
    //   191	195	209	java/lang/Exception
    //   171	175	218	java/lang/Exception
    //   47	65	227	finally
    //   234	238	253	java/lang/Exception
    //   65	103	257	finally
    //   103	154	257	finally
    //   184	191	257	finally
    //   160	167	261	finally
    //   47	65	269	java/lang/Exception
  }

  // ERROR //
  private static void sg()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: ldc 2
    //   4: monitorenter
    //   5: ldc 193
    //   7: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: new 88	java/io/File
    //   13: astore_1
    //   14: aload_1
    //   15: invokestatic 94	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   18: getfield 100	com/tencent/mm/kernel/e:cachePath	Ljava/lang/String;
    //   21: getstatic 106	com/tencent/mm/plugin/normsg/a/b:oTO	Lcom/tencent/mm/plugin/normsg/a/b;
    //   24: ldc 108
    //   26: invokevirtual 112	com/tencent/mm/plugin/normsg/a/b:TQ	(Ljava/lang/String;)Ljava/lang/String;
    //   29: invokespecial 115	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   32: new 195	java/io/DataInputStream
    //   35: astore_2
    //   36: new 197	java/io/FileInputStream
    //   39: astore_3
    //   40: aload_3
    //   41: aload_1
    //   42: invokespecial 198	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   45: aload_2
    //   46: aload_3
    //   47: invokespecial 201	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   50: aload_2
    //   51: astore_1
    //   52: aload_2
    //   53: invokevirtual 205	java/io/DataInputStream:readShort	()S
    //   56: sipush -774
    //   59: if_icmpeq +63 -> 122
    //   62: aload_2
    //   63: astore_1
    //   64: new 207	java/lang/IllegalStateException
    //   67: astore_3
    //   68: aload_2
    //   69: astore_1
    //   70: aload_3
    //   71: ldc 209
    //   73: invokespecial 212	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   76: aload_2
    //   77: astore_1
    //   78: ldc 193
    //   80: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: aload_2
    //   84: astore_1
    //   85: aload_3
    //   86: athrow
    //   87: astore_3
    //   88: aload_2
    //   89: astore_1
    //   90: ldc 35
    //   92: ldc 214
    //   94: iconst_1
    //   95: anewarray 4	java/lang/Object
    //   98: dup
    //   99: iconst_0
    //   100: aload_3
    //   101: aastore
    //   102: invokestatic 216	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: aload_2
    //   106: ifnull +175 -> 281
    //   109: aload_2
    //   110: invokevirtual 217	java/io/DataInputStream:close	()V
    //   113: ldc 193
    //   115: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: ldc 2
    //   120: monitorexit
    //   121: return
    //   122: aload_2
    //   123: astore_1
    //   124: aload_2
    //   125: invokevirtual 205	java/io/DataInputStream:readShort	()S
    //   128: pop
    //   129: aload_2
    //   130: astore_1
    //   131: aload_2
    //   132: invokevirtual 220	java/io/DataInputStream:readInt	()I
    //   135: istore 4
    //   137: iload 4
    //   139: ifge +54 -> 193
    //   142: aload_2
    //   143: astore_1
    //   144: new 207	java/lang/IllegalStateException
    //   147: astore_3
    //   148: aload_2
    //   149: astore_1
    //   150: aload_3
    //   151: ldc 222
    //   153: invokespecial 212	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   156: aload_2
    //   157: astore_1
    //   158: ldc 193
    //   160: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   163: aload_2
    //   164: astore_1
    //   165: aload_3
    //   166: athrow
    //   167: astore_3
    //   168: aload_1
    //   169: astore_2
    //   170: aload_3
    //   171: astore_1
    //   172: aload_2
    //   173: ifnull +7 -> 180
    //   176: aload_2
    //   177: invokevirtual 217	java/io/DataInputStream:close	()V
    //   180: ldc 193
    //   182: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: aload_1
    //   186: athrow
    //   187: astore_1
    //   188: ldc 2
    //   190: monitorexit
    //   191: aload_1
    //   192: athrow
    //   193: iload_0
    //   194: iload 4
    //   196: if_icmpge +46 -> 242
    //   199: aload_2
    //   200: astore_1
    //   201: aload_2
    //   202: invokevirtual 220	java/io/DataInputStream:readInt	()I
    //   205: istore 5
    //   207: aload_2
    //   208: astore_1
    //   209: aload_2
    //   210: invokevirtual 225	java/io/DataInputStream:readLong	()J
    //   213: lstore 6
    //   215: aload_2
    //   216: astore_1
    //   217: getstatic 26	com/tencent/mm/plugin/secinforeport/c$a:qjl	Ljava/util/Map;
    //   220: iload 5
    //   222: invokestatic 54	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   225: lload 6
    //   227: invokestatic 43	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   230: invokeinterface 80 3 0
    //   235: pop
    //   236: iinc 0 1
    //   239: goto -46 -> 193
    //   242: aload_2
    //   243: astore_1
    //   244: ldc 35
    //   246: ldc 227
    //   248: invokestatic 192	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   251: aload_2
    //   252: invokevirtual 217	java/io/DataInputStream:close	()V
    //   255: ldc 193
    //   257: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   260: goto -142 -> 118
    //   263: astore_1
    //   264: ldc 193
    //   266: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   269: goto -151 -> 118
    //   272: astore_1
    //   273: ldc 193
    //   275: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   278: goto -160 -> 118
    //   281: ldc 193
    //   283: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   286: goto -168 -> 118
    //   289: astore_2
    //   290: goto -110 -> 180
    //   293: astore_1
    //   294: aconst_null
    //   295: astore_2
    //   296: goto -124 -> 172
    //   299: astore_3
    //   300: aconst_null
    //   301: astore_2
    //   302: goto -214 -> 88
    //
    // Exception table:
    //   from	to	target	type
    //   52	62	87	java/lang/Exception
    //   64	68	87	java/lang/Exception
    //   70	76	87	java/lang/Exception
    //   78	83	87	java/lang/Exception
    //   85	87	87	java/lang/Exception
    //   124	129	87	java/lang/Exception
    //   131	137	87	java/lang/Exception
    //   144	148	87	java/lang/Exception
    //   150	156	87	java/lang/Exception
    //   158	163	87	java/lang/Exception
    //   165	167	87	java/lang/Exception
    //   201	207	87	java/lang/Exception
    //   209	215	87	java/lang/Exception
    //   217	236	87	java/lang/Exception
    //   244	251	87	java/lang/Exception
    //   52	62	167	finally
    //   64	68	167	finally
    //   70	76	167	finally
    //   78	83	167	finally
    //   85	87	167	finally
    //   90	105	167	finally
    //   124	129	167	finally
    //   131	137	167	finally
    //   144	148	167	finally
    //   150	156	167	finally
    //   158	163	167	finally
    //   165	167	167	finally
    //   201	207	167	finally
    //   209	215	167	finally
    //   217	236	167	finally
    //   244	251	167	finally
    //   5	32	187	finally
    //   109	113	187	finally
    //   113	118	187	finally
    //   176	180	187	finally
    //   180	187	187	finally
    //   251	255	187	finally
    //   255	260	187	finally
    //   264	269	187	finally
    //   273	278	187	finally
    //   281	286	187	finally
    //   251	255	263	java/lang/Exception
    //   109	113	272	java/lang/Exception
    //   176	180	289	java/lang/Exception
    //   32	50	293	finally
    //   32	50	299	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.secinforeport.c.a
 * JD-Core Version:    0.6.2
 */