package com.tencent.mm.modelvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import junit.framework.Assert;

public final class o
{
  public static int g(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(116606);
    if (bo.isNullOrNil(paramString))
    {
      paramInt = -1;
      AppMethodBeat.o(116606);
    }
    while (true)
    {
      return paramInt;
      ab.d("MicroMsg.VoiceFile", "fileName ".concat(String.valueOf(paramString)));
      if (h(paramString, paramInt, paramBoolean))
      {
        paramInt = 0;
        AppMethodBeat.o(116606);
      }
      else if (i(paramString, paramInt, paramBoolean))
      {
        paramInt = 2;
        AppMethodBeat.o(116606);
      }
      else
      {
        paramInt = 1;
        AppMethodBeat.o(116606);
      }
    }
  }

  // ERROR //
  private static boolean h(String paramString, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 54
    //   2: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iload_2
    //   6: ifeq +73 -> 79
    //   9: ldc 24
    //   11: ldc 56
    //   13: aload_0
    //   14: invokestatic 32	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   17: invokevirtual 36	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   20: invokestatic 42	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: new 58	java/io/RandomAccessFile
    //   26: astore_3
    //   27: aload_3
    //   28: aload_0
    //   29: ldc 60
    //   31: invokespecial 63	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: aload_3
    //   35: astore_0
    //   36: bipush 6
    //   38: newarray byte
    //   40: astore 4
    //   42: aload_3
    //   43: astore_0
    //   44: aload_3
    //   45: aload 4
    //   47: iconst_0
    //   48: bipush 6
    //   50: invokevirtual 67	java/io/RandomAccessFile:read	([BII)I
    //   53: iconst_m1
    //   54: if_icmpne +59 -> 113
    //   57: aload_3
    //   58: astore_0
    //   59: ldc 24
    //   61: ldc 69
    //   63: invokestatic 72	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: aload_3
    //   67: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   70: ldc 54
    //   72: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   75: iconst_0
    //   76: istore_2
    //   77: iload_2
    //   78: ireturn
    //   79: iload_1
    //   80: ifne +267 -> 347
    //   83: aload_0
    //   84: invokestatic 81	com/tencent/mm/modelvoice/q:getFullPath	(Ljava/lang/String;)Ljava/lang/String;
    //   87: astore_0
    //   88: goto -79 -> 9
    //   91: astore_0
    //   92: ldc 24
    //   94: ldc 83
    //   96: iconst_1
    //   97: anewarray 4	java/lang/Object
    //   100: dup
    //   101: iconst_0
    //   102: aload_0
    //   103: invokestatic 87	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   106: aastore
    //   107: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: goto -40 -> 70
    //   113: aload_3
    //   114: astore_0
    //   115: new 28	java/lang/String
    //   118: astore 5
    //   120: aload_3
    //   121: astore_0
    //   122: aload 5
    //   124: aload 4
    //   126: invokespecial 93	java/lang/String:<init>	([B)V
    //   129: aload_3
    //   130: astore_0
    //   131: ldc 24
    //   133: ldc 95
    //   135: iconst_3
    //   136: anewarray 4	java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: aload 4
    //   143: invokestatic 99	com/tencent/mm/sdk/platformtools/bo:ca	([B)Ljava/lang/String;
    //   146: aastore
    //   147: dup
    //   148: iconst_1
    //   149: aload 5
    //   151: aastore
    //   152: dup
    //   153: iconst_2
    //   154: ldc 101
    //   156: aastore
    //   157: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   160: aload_3
    //   161: astore_0
    //   162: aload 5
    //   164: ldc 101
    //   166: invokevirtual 106	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   169: istore_2
    //   170: iload_2
    //   171: ifeq +39 -> 210
    //   174: aload_3
    //   175: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   178: ldc 54
    //   180: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   183: iconst_1
    //   184: istore_2
    //   185: goto -108 -> 77
    //   188: astore_0
    //   189: ldc 24
    //   191: ldc 83
    //   193: iconst_1
    //   194: anewarray 4	java/lang/Object
    //   197: dup
    //   198: iconst_0
    //   199: aload_0
    //   200: invokestatic 87	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   203: aastore
    //   204: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   207: goto -29 -> 178
    //   210: aload_3
    //   211: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   214: ldc 54
    //   216: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   219: iconst_0
    //   220: istore_2
    //   221: goto -144 -> 77
    //   224: astore_0
    //   225: ldc 24
    //   227: ldc 83
    //   229: iconst_1
    //   230: anewarray 4	java/lang/Object
    //   233: dup
    //   234: iconst_0
    //   235: aload_0
    //   236: invokestatic 87	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   239: aastore
    //   240: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   243: goto -29 -> 214
    //   246: astore 5
    //   248: aconst_null
    //   249: astore_3
    //   250: aload_3
    //   251: astore_0
    //   252: ldc 24
    //   254: aload 5
    //   256: ldc 108
    //   258: iconst_0
    //   259: anewarray 4	java/lang/Object
    //   262: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   265: aload_3
    //   266: ifnull -52 -> 214
    //   269: aload_3
    //   270: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   273: goto -59 -> 214
    //   276: astore_0
    //   277: ldc 24
    //   279: ldc 83
    //   281: iconst_1
    //   282: anewarray 4	java/lang/Object
    //   285: dup
    //   286: iconst_0
    //   287: aload_0
    //   288: invokestatic 87	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   291: aastore
    //   292: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   295: goto -81 -> 214
    //   298: astore_3
    //   299: aconst_null
    //   300: astore_0
    //   301: aload_0
    //   302: ifnull +7 -> 309
    //   305: aload_0
    //   306: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   309: ldc 54
    //   311: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   314: aload_3
    //   315: athrow
    //   316: astore_0
    //   317: ldc 24
    //   319: ldc 83
    //   321: iconst_1
    //   322: anewarray 4	java/lang/Object
    //   325: dup
    //   326: iconst_0
    //   327: aload_0
    //   328: invokestatic 87	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   331: aastore
    //   332: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   335: goto -26 -> 309
    //   338: astore_3
    //   339: goto -38 -> 301
    //   342: astore 5
    //   344: goto -94 -> 250
    //   347: aconst_null
    //   348: astore_0
    //   349: goto -340 -> 9
    //
    // Exception table:
    //   from	to	target	type
    //   66	70	91	java/io/IOException
    //   174	178	188	java/io/IOException
    //   210	214	224	java/io/IOException
    //   23	34	246	java/lang/Exception
    //   269	273	276	java/io/IOException
    //   23	34	298	finally
    //   305	309	316	java/io/IOException
    //   36	42	338	finally
    //   44	57	338	finally
    //   59	66	338	finally
    //   115	120	338	finally
    //   122	129	338	finally
    //   131	160	338	finally
    //   162	170	338	finally
    //   252	265	338	finally
    //   36	42	342	java/lang/Exception
    //   44	57	342	java/lang/Exception
    //   59	66	342	java/lang/Exception
    //   115	120	342	java/lang/Exception
    //   122	129	342	java/lang/Exception
    //   131	160	342	java/lang/Exception
    //   162	170	342	java/lang/Exception
  }

  // ERROR //
  public static boolean i(String paramString, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 113
    //   4: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: iload_2
    //   8: ifeq +70 -> 78
    //   11: ldc 24
    //   13: ldc 115
    //   15: aload_0
    //   16: invokestatic 32	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   19: invokevirtual 36	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   22: invokestatic 42	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: new 58	java/io/RandomAccessFile
    //   28: astore 4
    //   30: aload 4
    //   32: aload_0
    //   33: ldc 60
    //   35: invokespecial 63	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   38: bipush 9
    //   40: newarray byte
    //   42: astore_0
    //   43: aload 4
    //   45: lconst_1
    //   46: invokevirtual 119	java/io/RandomAccessFile:seek	(J)V
    //   49: aload 4
    //   51: aload_0
    //   52: iconst_0
    //   53: bipush 9
    //   55: invokevirtual 67	java/io/RandomAccessFile:read	([BII)I
    //   58: istore_1
    //   59: iload_1
    //   60: iconst_m1
    //   61: if_icmpne +81 -> 142
    //   64: aload 4
    //   66: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   69: ldc 113
    //   71: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: iconst_0
    //   75: istore_2
    //   76: iload_2
    //   77: ireturn
    //   78: iload_1
    //   79: ifne +11 -> 90
    //   82: aload_0
    //   83: invokestatic 81	com/tencent/mm/modelvoice/q:getFullPath	(Ljava/lang/String;)Ljava/lang/String;
    //   86: astore_0
    //   87: goto -76 -> 11
    //   90: iload_1
    //   91: iconst_1
    //   92: if_icmpne +279 -> 371
    //   95: ldc 24
    //   97: ldc 121
    //   99: iconst_1
    //   100: anewarray 4	java/lang/Object
    //   103: dup
    //   104: iconst_0
    //   105: aload_0
    //   106: aastore
    //   107: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: ldc 113
    //   112: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   115: iconst_0
    //   116: istore_2
    //   117: goto -41 -> 76
    //   120: astore_0
    //   121: ldc 24
    //   123: ldc 83
    //   125: iconst_1
    //   126: anewarray 4	java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: aload_0
    //   132: invokestatic 87	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   135: aastore
    //   136: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   139: goto -70 -> 69
    //   142: new 28	java/lang/String
    //   145: astore_3
    //   146: aload_3
    //   147: aload_0
    //   148: invokespecial 93	java/lang/String:<init>	([B)V
    //   151: ldc 24
    //   153: ldc 123
    //   155: iconst_3
    //   156: anewarray 4	java/lang/Object
    //   159: dup
    //   160: iconst_0
    //   161: aload_0
    //   162: invokestatic 99	com/tencent/mm/sdk/platformtools/bo:ca	([B)Ljava/lang/String;
    //   165: aastore
    //   166: dup
    //   167: iconst_1
    //   168: aload_3
    //   169: aastore
    //   170: dup
    //   171: iconst_2
    //   172: ldc 125
    //   174: aastore
    //   175: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: aload_3
    //   179: ldc 125
    //   181: invokevirtual 106	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   184: istore_2
    //   185: iload_2
    //   186: ifeq +40 -> 226
    //   189: aload 4
    //   191: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   194: ldc 113
    //   196: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   199: iconst_1
    //   200: istore_2
    //   201: goto -125 -> 76
    //   204: astore_0
    //   205: ldc 24
    //   207: ldc 83
    //   209: iconst_1
    //   210: anewarray 4	java/lang/Object
    //   213: dup
    //   214: iconst_0
    //   215: aload_0
    //   216: invokestatic 87	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   219: aastore
    //   220: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   223: goto -29 -> 194
    //   226: aload 4
    //   228: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   231: ldc 113
    //   233: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: iconst_0
    //   237: istore_2
    //   238: goto -162 -> 76
    //   241: astore_0
    //   242: ldc 24
    //   244: ldc 83
    //   246: iconst_1
    //   247: anewarray 4	java/lang/Object
    //   250: dup
    //   251: iconst_0
    //   252: aload_0
    //   253: invokestatic 87	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   256: aastore
    //   257: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   260: goto -29 -> 231
    //   263: astore_0
    //   264: aload_3
    //   265: astore_0
    //   266: ldc 24
    //   268: ldc 127
    //   270: invokestatic 42	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   273: aload_0
    //   274: ifnull -43 -> 231
    //   277: aload_0
    //   278: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   281: goto -50 -> 231
    //   284: astore_0
    //   285: ldc 24
    //   287: ldc 83
    //   289: iconst_1
    //   290: anewarray 4	java/lang/Object
    //   293: dup
    //   294: iconst_0
    //   295: aload_0
    //   296: invokestatic 87	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   299: aastore
    //   300: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   303: goto -72 -> 231
    //   306: astore_0
    //   307: aconst_null
    //   308: astore 4
    //   310: aload 4
    //   312: ifnull +8 -> 320
    //   315: aload 4
    //   317: invokevirtual 76	java/io/RandomAccessFile:close	()V
    //   320: ldc 113
    //   322: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   325: aload_0
    //   326: athrow
    //   327: astore 4
    //   329: ldc 24
    //   331: ldc 83
    //   333: iconst_1
    //   334: anewarray 4	java/lang/Object
    //   337: dup
    //   338: iconst_0
    //   339: aload 4
    //   341: invokestatic 87	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   344: aastore
    //   345: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   348: goto -28 -> 320
    //   351: astore_0
    //   352: goto -42 -> 310
    //   355: astore_3
    //   356: aload_0
    //   357: astore 4
    //   359: aload_3
    //   360: astore_0
    //   361: goto -51 -> 310
    //   364: astore_0
    //   365: aload 4
    //   367: astore_0
    //   368: goto -102 -> 266
    //   371: aconst_null
    //   372: astore_0
    //   373: goto -362 -> 11
    //
    // Exception table:
    //   from	to	target	type
    //   64	69	120	java/io/IOException
    //   189	194	204	java/io/IOException
    //   226	231	241	java/io/IOException
    //   25	38	263	java/lang/Exception
    //   277	281	284	java/io/IOException
    //   25	38	306	finally
    //   315	320	327	java/io/IOException
    //   38	59	351	finally
    //   142	185	351	finally
    //   266	273	355	finally
    //   38	59	364	java/lang/Exception
    //   142	185	364	java/lang/Exception
  }

  public static int uK(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(116605);
    if (bo.isNullOrNil(paramString))
    {
      i = -1;
      AppMethodBeat.o(116605);
    }
    while (true)
    {
      return i;
      ab.d("MicroMsg.VoiceFile", "fileName ".concat(String.valueOf(paramString)));
      if (h(paramString, 0, false))
      {
        AppMethodBeat.o(116605);
      }
      else if (i(paramString, 0, false))
      {
        i = 2;
        AppMethodBeat.o(116605);
      }
      else
      {
        i = 1;
        AppMethodBeat.o(116605);
      }
    }
  }

  private static int uL(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(116610);
    boolean bool;
    int j;
    if (paramString.length() >= 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      paramString = new File(paramString);
      if (paramString.exists())
        break label50;
      AppMethodBeat.o(116610);
      j = i;
    }
    while (true)
    {
      return j;
      bool = false;
      break;
      label50: j = (int)paramString.length() - 6;
      if (j <= 0)
      {
        AppMethodBeat.o(116610);
        j = i;
      }
      else
      {
        AppMethodBeat.o(116610);
      }
    }
  }

  public static int uj(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    int i = 0;
    AppMethodBeat.i(116609);
    switch (uK(paramString))
    {
    default:
      i = uL(q.getFullPath(paramString));
      AppMethodBeat.o(116609);
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return i;
      i = uL(q.getFullPath(paramString));
      AppMethodBeat.o(116609);
      continue;
      paramString = q.getFullPath(paramString);
      if (paramString.length() >= 0);
      while (true)
      {
        Assert.assertTrue(bool2);
        paramString = new File(paramString);
        if (paramString.exists())
          break label116;
        AppMethodBeat.o(116609);
        break;
        bool2 = false;
      }
      label116: int j = (int)paramString.length();
      if (j <= 0)
      {
        AppMethodBeat.o(116609);
      }
      else
      {
        AppMethodBeat.o(116609);
        i = j;
        continue;
        paramString = q.getFullPath(paramString);
        if (paramString.length() >= 0);
        for (bool2 = bool1; ; bool2 = false)
        {
          Assert.assertTrue(bool2);
          paramString = new File(paramString);
          if (paramString.exists())
            break label194;
          AppMethodBeat.o(116609);
          break;
        }
        label194: j = (int)paramString.length();
        if (j <= 0)
        {
          AppMethodBeat.o(116609);
        }
        else
        {
          AppMethodBeat.o(116609);
          i = j;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.o
 * JD-Core Version:    0.6.2
 */