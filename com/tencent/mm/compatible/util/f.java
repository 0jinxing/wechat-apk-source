package com.tencent.mm.compatible.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

public final class f
{
  public static boolean Mn()
  {
    AppMethodBeat.i(93070);
    String str = h.getExternalStorageDirectory().getAbsolutePath();
    if (e.eSl.equalsIgnoreCase(str));
    while (true)
    {
      boolean bool;
      try
      {
        if (h.getExternalStorageState().equals("mounted"))
        {
          File localFile2 = new java/io/File;
          localFile2.<init>(str);
          if (localFile2.canWrite())
          {
            bool = true;
            AppMethodBeat.o(93070);
            return bool;
          }
        }
        AppMethodBeat.o(93070);
        bool = false;
        continue;
      }
      catch (Exception localException1)
      {
        ab.w("MicroMsg.CUtil", "summer isSDCardAvail 1 e: " + localException1.getMessage() + " SDCARD_ROOT: " + e.eSl);
        AppMethodBeat.o(93070);
        bool = false;
        continue;
      }
      try
      {
        File localFile1 = new java/io/File;
        localFile1.<init>(e.eSl);
        bool = localFile1.canWrite();
        AppMethodBeat.o(93070);
      }
      catch (Exception localException2)
      {
        ab.w("MicroMsg.CUtil", "summer isSDCardAvail 1 e: " + localException2.getMessage() + " SDCARD_ROOT: " + e.eSl);
        AppMethodBeat.o(93070);
        bool = false;
      }
    }
  }

  // ERROR //
  public static boolean Mo()
  {
    // Byte code:
    //   0: ldc 86
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 88	com/tencent/mm/compatible/util/f:Mn	()Z
    //   8: ifne +12 -> 20
    //   11: iconst_0
    //   12: istore_0
    //   13: ldc 86
    //   15: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: iload_0
    //   19: ireturn
    //   20: lconst_0
    //   21: lstore_1
    //   22: lconst_0
    //   23: lstore_3
    //   24: new 90	android/os/StatFs
    //   27: astore 5
    //   29: aload 5
    //   31: getstatic 33	com/tencent/mm/compatible/util/e:eSl	Ljava/lang/String;
    //   34: invokespecial 91	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   37: lload_3
    //   38: lstore 6
    //   40: aload 5
    //   42: invokevirtual 95	android/os/StatFs:getBlockCount	()I
    //   45: i2l
    //   46: lstore 8
    //   48: lload_3
    //   49: lstore 6
    //   51: lload 8
    //   53: lstore_1
    //   54: aload 5
    //   56: invokevirtual 98	android/os/StatFs:getAvailableBlocks	()I
    //   59: i2l
    //   60: lstore_3
    //   61: lload_3
    //   62: lstore 6
    //   64: lload 8
    //   66: lstore_1
    //   67: aload 5
    //   69: invokevirtual 101	android/os/StatFs:getBlockSize	()I
    //   72: istore 10
    //   74: iload 10
    //   76: i2l
    //   77: lstore_1
    //   78: lload_3
    //   79: lstore 6
    //   81: aload 5
    //   83: ifnonnull +47 -> 130
    //   86: iconst_0
    //   87: istore_0
    //   88: ldc 86
    //   90: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   93: goto -75 -> 18
    //   96: astore 11
    //   98: aconst_null
    //   99: astore 5
    //   101: lload_3
    //   102: lstore 6
    //   104: ldc 60
    //   106: ldc 103
    //   108: iconst_1
    //   109: anewarray 4	java/lang/Object
    //   112: dup
    //   113: iconst_0
    //   114: aload 11
    //   116: aastore
    //   117: invokestatic 107	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   120: lconst_0
    //   121: lstore_3
    //   122: lload_1
    //   123: lstore 8
    //   125: lload_3
    //   126: lstore_1
    //   127: goto -46 -> 81
    //   130: lload 8
    //   132: lconst_0
    //   133: lcmp
    //   134: ifgt +13 -> 147
    //   137: iconst_0
    //   138: istore_0
    //   139: ldc 86
    //   141: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   144: goto -126 -> 18
    //   147: lload 8
    //   149: lload 6
    //   151: lsub
    //   152: lconst_0
    //   153: lcmp
    //   154: ifge +13 -> 167
    //   157: iconst_0
    //   158: istore_0
    //   159: ldc 86
    //   161: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   164: goto -146 -> 18
    //   167: lload 8
    //   169: lload 6
    //   171: lsub
    //   172: ldc2_w 108
    //   175: lmul
    //   176: lload 8
    //   178: ldiv
    //   179: l2i
    //   180: istore 10
    //   182: lload_1
    //   183: lload 6
    //   185: lmul
    //   186: lstore_3
    //   187: ldc 60
    //   189: ldc 111
    //   191: bipush 6
    //   193: anewarray 4	java/lang/Object
    //   196: dup
    //   197: iconst_0
    //   198: lload 8
    //   200: invokestatic 117	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   203: aastore
    //   204: dup
    //   205: iconst_1
    //   206: lload 6
    //   208: invokestatic 117	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   211: aastore
    //   212: dup
    //   213: iconst_2
    //   214: lload_1
    //   215: invokestatic 117	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   218: aastore
    //   219: dup
    //   220: iconst_3
    //   221: lload_1
    //   222: lload 8
    //   224: lmul
    //   225: invokestatic 117	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   228: aastore
    //   229: dup
    //   230: iconst_4
    //   231: lload_3
    //   232: invokestatic 117	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   235: aastore
    //   236: dup
    //   237: iconst_5
    //   238: iload 10
    //   240: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   243: aastore
    //   244: invokestatic 124	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   247: bipush 95
    //   249: iload 10
    //   251: if_icmple +13 -> 264
    //   254: iconst_0
    //   255: istore_0
    //   256: ldc 86
    //   258: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   261: goto -243 -> 18
    //   264: lload_3
    //   265: ldc2_w 125
    //   268: lcmp
    //   269: ifle +13 -> 282
    //   272: iconst_0
    //   273: istore_0
    //   274: ldc 86
    //   276: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   279: goto -261 -> 18
    //   282: ldc 60
    //   284: ldc 128
    //   286: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   289: iconst_1
    //   290: istore_0
    //   291: ldc 86
    //   293: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   296: goto -278 -> 18
    //   299: astore 11
    //   301: goto -197 -> 104
    //
    // Exception table:
    //   from	to	target	type
    //   24	37	96	java/lang/Exception
    //   40	48	299	java/lang/Exception
    //   54	61	299	java/lang/Exception
    //   67	74	299	java/lang/Exception
  }

  // ERROR //
  public static boolean eW(long paramLong)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 133
    //   4: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 88	com/tencent/mm/compatible/util/f:Mn	()Z
    //   10: ifne +17 -> 27
    //   13: ldc 60
    //   15: ldc 135
    //   17: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   20: ldc 133
    //   22: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: iload_2
    //   26: ireturn
    //   27: new 90	android/os/StatFs
    //   30: astore_3
    //   31: aload_3
    //   32: getstatic 33	com/tencent/mm/compatible/util/e:eSl	Ljava/lang/String;
    //   35: invokespecial 91	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   38: aload_3
    //   39: invokevirtual 95	android/os/StatFs:getBlockCount	()I
    //   42: istore 4
    //   44: iload 4
    //   46: i2l
    //   47: lstore 5
    //   49: aload_3
    //   50: invokevirtual 98	android/os/StatFs:getAvailableBlocks	()I
    //   53: istore 4
    //   55: iload 4
    //   57: i2l
    //   58: lstore 7
    //   60: aload_3
    //   61: ifnonnull +40 -> 101
    //   64: ldc 133
    //   66: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: goto -44 -> 25
    //   72: astore 9
    //   74: aconst_null
    //   75: astore_3
    //   76: lconst_0
    //   77: lstore 5
    //   79: ldc 60
    //   81: ldc 137
    //   83: iconst_1
    //   84: anewarray 4	java/lang/Object
    //   87: dup
    //   88: iconst_0
    //   89: aload 9
    //   91: aastore
    //   92: invokestatic 107	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: lconst_0
    //   96: lstore 7
    //   98: goto -38 -> 60
    //   101: lload 5
    //   103: lconst_0
    //   104: lcmp
    //   105: ifgt +11 -> 116
    //   108: ldc 133
    //   110: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: goto -88 -> 25
    //   116: lload 5
    //   118: lload 7
    //   120: lsub
    //   121: lconst_0
    //   122: lcmp
    //   123: ifge +11 -> 134
    //   126: ldc 133
    //   128: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   131: goto -106 -> 25
    //   134: aload_3
    //   135: invokevirtual 101	android/os/StatFs:getBlockSize	()I
    //   138: i2l
    //   139: lstore 5
    //   141: aload_3
    //   142: invokevirtual 140	android/os/StatFs:getFreeBlocks	()I
    //   145: i2l
    //   146: lload 5
    //   148: lmul
    //   149: lload_0
    //   150: lcmp
    //   151: ifge +37 -> 188
    //   154: ldc 60
    //   156: new 62	java/lang/StringBuilder
    //   159: dup
    //   160: ldc 142
    //   162: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   165: lload_0
    //   166: invokevirtual 145	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   169: ldc 147
    //   171: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   177: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   180: ldc 133
    //   182: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: goto -160 -> 25
    //   188: ldc 133
    //   190: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   193: iconst_1
    //   194: istore_2
    //   195: goto -170 -> 25
    //   198: astore 9
    //   200: lconst_0
    //   201: lstore 5
    //   203: goto -124 -> 79
    //   206: astore 9
    //   208: goto -129 -> 79
    //
    // Exception table:
    //   from	to	target	type
    //   27	38	72	java/lang/Exception
    //   38	44	198	java/lang/Exception
    //   49	55	206	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.f
 * JD-Core Version:    0.6.2
 */