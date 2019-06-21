package com.tencent.mm.a;

import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class e
{
  // ERROR //
  public static int a(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_1
    //   3: ifnull +16 -> 19
    //   6: aload_1
    //   7: arraylength
    //   8: ifeq +11 -> 19
    //   11: aload_1
    //   12: arraylength
    //   13: iload_2
    //   14: iconst_0
    //   15: iadd
    //   16: if_icmpge +8 -> 24
    //   19: bipush 254
    //   21: istore_2
    //   22: iload_2
    //   23: ireturn
    //   24: new 12	java/io/FileOutputStream
    //   27: astore 4
    //   29: aload 4
    //   31: aload_0
    //   32: iconst_1
    //   33: invokespecial 16	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   36: aload 4
    //   38: astore 5
    //   40: aload 4
    //   42: aload_1
    //   43: iconst_0
    //   44: iload_2
    //   45: invokevirtual 20	java/io/FileOutputStream:write	([BII)V
    //   48: aload 4
    //   50: invokevirtual 24	java/io/FileOutputStream:close	()V
    //   53: iload_3
    //   54: istore_2
    //   55: goto -33 -> 22
    //   58: astore 5
    //   60: ldc 26
    //   62: aload 5
    //   64: ldc 28
    //   66: iconst_0
    //   67: anewarray 4	java/lang/Object
    //   70: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: ldc 26
    //   75: ldc 36
    //   77: bipush 6
    //   79: anewarray 4	java/lang/Object
    //   82: dup
    //   83: iconst_0
    //   84: aload 5
    //   86: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   89: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   92: aastore
    //   93: dup
    //   94: iconst_1
    //   95: aload 5
    //   97: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   100: aastore
    //   101: dup
    //   102: iconst_2
    //   103: aload_0
    //   104: aastore
    //   105: dup
    //   106: iconst_3
    //   107: aload_1
    //   108: arraylength
    //   109: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   112: aastore
    //   113: dup
    //   114: iconst_4
    //   115: iconst_0
    //   116: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   119: aastore
    //   120: dup
    //   121: iconst_5
    //   122: iload_2
    //   123: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   126: aastore
    //   127: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: iload_3
    //   131: istore_2
    //   132: goto -110 -> 22
    //   135: astore 6
    //   137: aconst_null
    //   138: astore 4
    //   140: aload 4
    //   142: astore 5
    //   144: ldc 26
    //   146: aload 6
    //   148: ldc 28
    //   150: iconst_0
    //   151: anewarray 4	java/lang/Object
    //   154: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: aload 4
    //   159: astore 5
    //   161: ldc 26
    //   163: ldc 61
    //   165: bipush 6
    //   167: anewarray 4	java/lang/Object
    //   170: dup
    //   171: iconst_0
    //   172: aload 6
    //   174: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   177: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   180: aastore
    //   181: dup
    //   182: iconst_1
    //   183: aload 6
    //   185: invokevirtual 62	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   188: aastore
    //   189: dup
    //   190: iconst_2
    //   191: aload_0
    //   192: aastore
    //   193: dup
    //   194: iconst_3
    //   195: aload_1
    //   196: arraylength
    //   197: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   200: aastore
    //   201: dup
    //   202: iconst_4
    //   203: iconst_0
    //   204: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   207: aastore
    //   208: dup
    //   209: iconst_5
    //   210: iload_2
    //   211: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   214: aastore
    //   215: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: aload 4
    //   220: ifnull +8 -> 228
    //   223: aload 4
    //   225: invokevirtual 24	java/io/FileOutputStream:close	()V
    //   228: iconst_m1
    //   229: istore_2
    //   230: goto -208 -> 22
    //   233: astore 5
    //   235: ldc 26
    //   237: aload 5
    //   239: ldc 28
    //   241: iconst_0
    //   242: anewarray 4	java/lang/Object
    //   245: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   248: ldc 26
    //   250: ldc 36
    //   252: bipush 6
    //   254: anewarray 4	java/lang/Object
    //   257: dup
    //   258: iconst_0
    //   259: aload 5
    //   261: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   264: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   267: aastore
    //   268: dup
    //   269: iconst_1
    //   270: aload 5
    //   272: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   275: aastore
    //   276: dup
    //   277: iconst_2
    //   278: aload_0
    //   279: aastore
    //   280: dup
    //   281: iconst_3
    //   282: aload_1
    //   283: arraylength
    //   284: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   287: aastore
    //   288: dup
    //   289: iconst_4
    //   290: iconst_0
    //   291: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   294: aastore
    //   295: dup
    //   296: iconst_5
    //   297: iload_2
    //   298: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   301: aastore
    //   302: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   305: goto -77 -> 228
    //   308: astore 4
    //   310: aconst_null
    //   311: astore 5
    //   313: aload 5
    //   315: ifnull +8 -> 323
    //   318: aload 5
    //   320: invokevirtual 24	java/io/FileOutputStream:close	()V
    //   323: aload 4
    //   325: athrow
    //   326: astore 5
    //   328: ldc 26
    //   330: aload 5
    //   332: ldc 28
    //   334: iconst_0
    //   335: anewarray 4	java/lang/Object
    //   338: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   341: ldc 26
    //   343: ldc 36
    //   345: bipush 6
    //   347: anewarray 4	java/lang/Object
    //   350: dup
    //   351: iconst_0
    //   352: aload 5
    //   354: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   357: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   360: aastore
    //   361: dup
    //   362: iconst_1
    //   363: aload 5
    //   365: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   368: aastore
    //   369: dup
    //   370: iconst_2
    //   371: aload_0
    //   372: aastore
    //   373: dup
    //   374: iconst_3
    //   375: aload_1
    //   376: arraylength
    //   377: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   380: aastore
    //   381: dup
    //   382: iconst_4
    //   383: iconst_0
    //   384: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   387: aastore
    //   388: dup
    //   389: iconst_5
    //   390: iload_2
    //   391: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   394: aastore
    //   395: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   398: goto -75 -> 323
    //   401: astore 4
    //   403: goto -90 -> 313
    //   406: astore 6
    //   408: goto -268 -> 140
    //
    // Exception table:
    //   from	to	target	type
    //   48	53	58	java/io/IOException
    //   24	36	135	java/lang/Exception
    //   223	228	233	java/io/IOException
    //   24	36	308	finally
    //   318	323	326	java/io/IOException
    //   40	48	401	finally
    //   144	157	401	finally
    //   161	218	401	finally
    //   40	48	406	java/lang/Exception
  }

  // ERROR //
  public static int b(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_2
    //   3: ifnonnull +8 -> 11
    //   6: bipush 254
    //   8: istore_3
    //   9: iload_3
    //   10: ireturn
    //   11: aconst_null
    //   12: astore 4
    //   14: aconst_null
    //   15: astore 5
    //   17: aload 4
    //   19: astore 6
    //   21: new 67	java/io/File
    //   24: astore 7
    //   26: aload 4
    //   28: astore 6
    //   30: aload 7
    //   32: aload_0
    //   33: invokespecial 70	java/io/File:<init>	(Ljava/lang/String;)V
    //   36: aload 4
    //   38: astore 6
    //   40: aload 7
    //   42: invokevirtual 74	java/io/File:exists	()Z
    //   45: ifne +13 -> 58
    //   48: aload 4
    //   50: astore 6
    //   52: aload 7
    //   54: invokevirtual 77	java/io/File:mkdirs	()Z
    //   57: pop
    //   58: aload 4
    //   60: astore 6
    //   62: new 79	java/lang/StringBuilder
    //   65: astore 7
    //   67: aload 4
    //   69: astore 6
    //   71: aload 7
    //   73: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   76: aload 4
    //   78: astore 6
    //   80: aload 7
    //   82: aload_0
    //   83: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: aload_1
    //   87: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: astore 7
    //   95: aload 4
    //   97: astore 6
    //   99: new 67	java/io/File
    //   102: astore 8
    //   104: aload 4
    //   106: astore 6
    //   108: aload 8
    //   110: aload 7
    //   112: invokespecial 70	java/io/File:<init>	(Ljava/lang/String;)V
    //   115: aload 4
    //   117: astore 6
    //   119: aload 8
    //   121: invokevirtual 74	java/io/File:exists	()Z
    //   124: ifne +13 -> 137
    //   127: aload 4
    //   129: astore 6
    //   131: aload 8
    //   133: invokevirtual 91	java/io/File:createNewFile	()Z
    //   136: pop
    //   137: aload 4
    //   139: astore 6
    //   141: new 93	java/io/BufferedOutputStream
    //   144: astore 7
    //   146: aload 4
    //   148: astore 6
    //   150: new 12	java/io/FileOutputStream
    //   153: astore 9
    //   155: aload 4
    //   157: astore 6
    //   159: aload 9
    //   161: aload 8
    //   163: iconst_1
    //   164: invokespecial 96	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   167: aload 4
    //   169: astore 6
    //   171: aload 7
    //   173: aload 9
    //   175: invokespecial 99	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   178: aload 7
    //   180: aload_2
    //   181: invokevirtual 102	java/io/BufferedOutputStream:write	([B)V
    //   184: aload 7
    //   186: invokevirtual 105	java/io/BufferedOutputStream:flush	()V
    //   189: aload 7
    //   191: invokevirtual 106	java/io/BufferedOutputStream:close	()V
    //   194: goto -185 -> 9
    //   197: astore 6
    //   199: ldc 26
    //   201: aload 6
    //   203: ldc 28
    //   205: iconst_0
    //   206: anewarray 4	java/lang/Object
    //   209: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   212: ldc 26
    //   214: ldc 108
    //   216: iconst_5
    //   217: anewarray 4	java/lang/Object
    //   220: dup
    //   221: iconst_0
    //   222: aload 6
    //   224: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   227: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   230: aastore
    //   231: dup
    //   232: iconst_1
    //   233: aload 6
    //   235: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   238: aastore
    //   239: dup
    //   240: iconst_2
    //   241: aload_0
    //   242: aastore
    //   243: dup
    //   244: iconst_3
    //   245: aload_1
    //   246: aastore
    //   247: dup
    //   248: iconst_4
    //   249: aload_2
    //   250: arraylength
    //   251: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   254: aastore
    //   255: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   258: goto -249 -> 9
    //   261: astore 4
    //   263: aload 5
    //   265: astore 7
    //   267: aload 7
    //   269: astore 6
    //   271: ldc 26
    //   273: aload 4
    //   275: ldc 28
    //   277: iconst_0
    //   278: anewarray 4	java/lang/Object
    //   281: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   284: aload 7
    //   286: astore 6
    //   288: ldc 26
    //   290: ldc 110
    //   292: iconst_5
    //   293: anewarray 4	java/lang/Object
    //   296: dup
    //   297: iconst_0
    //   298: aload 4
    //   300: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   303: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   306: aastore
    //   307: dup
    //   308: iconst_1
    //   309: aload 4
    //   311: invokevirtual 62	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   314: aastore
    //   315: dup
    //   316: iconst_2
    //   317: aload_0
    //   318: aastore
    //   319: dup
    //   320: iconst_3
    //   321: aload_1
    //   322: aastore
    //   323: dup
    //   324: iconst_4
    //   325: aload_2
    //   326: arraylength
    //   327: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   330: aastore
    //   331: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   334: aload 7
    //   336: ifnull +8 -> 344
    //   339: aload 7
    //   341: invokevirtual 106	java/io/BufferedOutputStream:close	()V
    //   344: iconst_m1
    //   345: istore_3
    //   346: goto -337 -> 9
    //   349: astore 6
    //   351: ldc 26
    //   353: aload 6
    //   355: ldc 28
    //   357: iconst_0
    //   358: anewarray 4	java/lang/Object
    //   361: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   364: ldc 26
    //   366: ldc 108
    //   368: iconst_5
    //   369: anewarray 4	java/lang/Object
    //   372: dup
    //   373: iconst_0
    //   374: aload 6
    //   376: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   379: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   382: aastore
    //   383: dup
    //   384: iconst_1
    //   385: aload 6
    //   387: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   390: aastore
    //   391: dup
    //   392: iconst_2
    //   393: aload_0
    //   394: aastore
    //   395: dup
    //   396: iconst_3
    //   397: aload_1
    //   398: aastore
    //   399: dup
    //   400: iconst_4
    //   401: aload_2
    //   402: arraylength
    //   403: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   406: aastore
    //   407: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   410: goto -66 -> 344
    //   413: astore 4
    //   415: aload 6
    //   417: astore 7
    //   419: aload 4
    //   421: astore 6
    //   423: aload 7
    //   425: ifnull +8 -> 433
    //   428: aload 7
    //   430: invokevirtual 106	java/io/BufferedOutputStream:close	()V
    //   433: aload 6
    //   435: athrow
    //   436: astore 7
    //   438: ldc 26
    //   440: aload 7
    //   442: ldc 28
    //   444: iconst_0
    //   445: anewarray 4	java/lang/Object
    //   448: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   451: ldc 26
    //   453: ldc 108
    //   455: iconst_5
    //   456: anewarray 4	java/lang/Object
    //   459: dup
    //   460: iconst_0
    //   461: aload 7
    //   463: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   466: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   469: aastore
    //   470: dup
    //   471: iconst_1
    //   472: aload 7
    //   474: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   477: aastore
    //   478: dup
    //   479: iconst_2
    //   480: aload_0
    //   481: aastore
    //   482: dup
    //   483: iconst_3
    //   484: aload_1
    //   485: aastore
    //   486: dup
    //   487: iconst_4
    //   488: aload_2
    //   489: arraylength
    //   490: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   493: aastore
    //   494: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   497: goto -64 -> 433
    //   500: astore 6
    //   502: goto -79 -> 423
    //   505: astore 4
    //   507: goto -240 -> 267
    //
    // Exception table:
    //   from	to	target	type
    //   189	194	197	java/io/IOException
    //   21	26	261	java/lang/Exception
    //   30	36	261	java/lang/Exception
    //   40	48	261	java/lang/Exception
    //   52	58	261	java/lang/Exception
    //   62	67	261	java/lang/Exception
    //   71	76	261	java/lang/Exception
    //   80	95	261	java/lang/Exception
    //   99	104	261	java/lang/Exception
    //   108	115	261	java/lang/Exception
    //   119	127	261	java/lang/Exception
    //   131	137	261	java/lang/Exception
    //   141	146	261	java/lang/Exception
    //   150	155	261	java/lang/Exception
    //   159	167	261	java/lang/Exception
    //   171	178	261	java/lang/Exception
    //   339	344	349	java/io/IOException
    //   21	26	413	finally
    //   30	36	413	finally
    //   40	48	413	finally
    //   52	58	413	finally
    //   62	67	413	finally
    //   71	76	413	finally
    //   80	95	413	finally
    //   99	104	413	finally
    //   108	115	413	finally
    //   119	127	413	finally
    //   131	137	413	finally
    //   141	146	413	finally
    //   150	155	413	finally
    //   159	167	413	finally
    //   171	178	413	finally
    //   271	284	413	finally
    //   288	334	413	finally
    //   428	433	436	java/io/IOException
    //   178	189	500	finally
    //   178	189	505	java/lang/Exception
  }

  // ERROR //
  public static int b(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_1
    //   3: ifnonnull +8 -> 11
    //   6: bipush 254
    //   8: istore_2
    //   9: iload_2
    //   10: ireturn
    //   11: aload_1
    //   12: arraylength
    //   13: iload_2
    //   14: iconst_0
    //   15: iadd
    //   16: if_icmpge +9 -> 25
    //   19: bipush 253
    //   21: istore_2
    //   22: goto -13 -> 9
    //   25: new 12	java/io/FileOutputStream
    //   28: astore 4
    //   30: aload 4
    //   32: aload_0
    //   33: iconst_0
    //   34: invokespecial 16	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   37: aload 4
    //   39: astore 5
    //   41: aload 4
    //   43: aload_1
    //   44: iconst_0
    //   45: iload_2
    //   46: invokevirtual 20	java/io/FileOutputStream:write	([BII)V
    //   49: aload 4
    //   51: invokevirtual 24	java/io/FileOutputStream:close	()V
    //   54: iload_3
    //   55: istore_2
    //   56: goto -47 -> 9
    //   59: astore 5
    //   61: ldc 26
    //   63: aload 5
    //   65: ldc 28
    //   67: iconst_0
    //   68: anewarray 4	java/lang/Object
    //   71: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   74: ldc 26
    //   76: ldc 112
    //   78: bipush 6
    //   80: anewarray 4	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: aload 5
    //   87: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   90: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   93: aastore
    //   94: dup
    //   95: iconst_1
    //   96: aload 5
    //   98: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   101: aastore
    //   102: dup
    //   103: iconst_2
    //   104: aload_0
    //   105: aastore
    //   106: dup
    //   107: iconst_3
    //   108: aload_1
    //   109: arraylength
    //   110: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   113: aastore
    //   114: dup
    //   115: iconst_4
    //   116: iconst_0
    //   117: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   120: aastore
    //   121: dup
    //   122: iconst_5
    //   123: iload_2
    //   124: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   127: aastore
    //   128: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: iload_3
    //   132: istore_2
    //   133: goto -124 -> 9
    //   136: astore 6
    //   138: aconst_null
    //   139: astore 4
    //   141: aload 4
    //   143: astore 5
    //   145: ldc 26
    //   147: aload 6
    //   149: ldc 28
    //   151: iconst_0
    //   152: anewarray 4	java/lang/Object
    //   155: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   158: aload 4
    //   160: astore 5
    //   162: ldc 26
    //   164: ldc 114
    //   166: bipush 6
    //   168: anewarray 4	java/lang/Object
    //   171: dup
    //   172: iconst_0
    //   173: aload 6
    //   175: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   178: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   181: aastore
    //   182: dup
    //   183: iconst_1
    //   184: aload 6
    //   186: invokevirtual 62	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   189: aastore
    //   190: dup
    //   191: iconst_2
    //   192: aload_0
    //   193: aastore
    //   194: dup
    //   195: iconst_3
    //   196: aload_1
    //   197: arraylength
    //   198: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   201: aastore
    //   202: dup
    //   203: iconst_4
    //   204: iconst_0
    //   205: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   208: aastore
    //   209: dup
    //   210: iconst_5
    //   211: iload_2
    //   212: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   215: aastore
    //   216: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   219: aload 4
    //   221: ifnull +8 -> 229
    //   224: aload 4
    //   226: invokevirtual 24	java/io/FileOutputStream:close	()V
    //   229: iconst_m1
    //   230: istore_2
    //   231: goto -222 -> 9
    //   234: astore 5
    //   236: ldc 26
    //   238: aload 5
    //   240: ldc 28
    //   242: iconst_0
    //   243: anewarray 4	java/lang/Object
    //   246: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   249: ldc 26
    //   251: ldc 112
    //   253: bipush 6
    //   255: anewarray 4	java/lang/Object
    //   258: dup
    //   259: iconst_0
    //   260: aload 5
    //   262: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   265: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   268: aastore
    //   269: dup
    //   270: iconst_1
    //   271: aload 5
    //   273: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   276: aastore
    //   277: dup
    //   278: iconst_2
    //   279: aload_0
    //   280: aastore
    //   281: dup
    //   282: iconst_3
    //   283: aload_1
    //   284: arraylength
    //   285: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   288: aastore
    //   289: dup
    //   290: iconst_4
    //   291: iconst_0
    //   292: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   295: aastore
    //   296: dup
    //   297: iconst_5
    //   298: iload_2
    //   299: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   302: aastore
    //   303: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   306: goto -77 -> 229
    //   309: astore 4
    //   311: aconst_null
    //   312: astore 5
    //   314: aload 5
    //   316: ifnull +8 -> 324
    //   319: aload 5
    //   321: invokevirtual 24	java/io/FileOutputStream:close	()V
    //   324: aload 4
    //   326: athrow
    //   327: astore 5
    //   329: ldc 26
    //   331: aload 5
    //   333: ldc 28
    //   335: iconst_0
    //   336: anewarray 4	java/lang/Object
    //   339: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   342: ldc 26
    //   344: ldc 112
    //   346: bipush 6
    //   348: anewarray 4	java/lang/Object
    //   351: dup
    //   352: iconst_0
    //   353: aload 5
    //   355: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   358: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   361: aastore
    //   362: dup
    //   363: iconst_1
    //   364: aload 5
    //   366: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   369: aastore
    //   370: dup
    //   371: iconst_2
    //   372: aload_0
    //   373: aastore
    //   374: dup
    //   375: iconst_3
    //   376: aload_1
    //   377: arraylength
    //   378: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   381: aastore
    //   382: dup
    //   383: iconst_4
    //   384: iconst_0
    //   385: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   388: aastore
    //   389: dup
    //   390: iconst_5
    //   391: iload_2
    //   392: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   395: aastore
    //   396: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   399: goto -75 -> 324
    //   402: astore 4
    //   404: goto -90 -> 314
    //   407: astore 6
    //   409: goto -268 -> 141
    //
    // Exception table:
    //   from	to	target	type
    //   49	54	59	java/io/IOException
    //   25	37	136	java/lang/Exception
    //   224	229	234	java/io/IOException
    //   25	37	309	finally
    //   319	324	327	java/io/IOException
    //   41	49	402	finally
    //   145	158	402	finally
    //   162	219	402	finally
    //   41	49	407	java/lang/Exception
  }

  public static void closeOutputStream(OutputStream paramOutputStream)
  {
    if (paramOutputStream != null);
    try
    {
      paramOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FileOperation", localIOException, "", new Object[0]);
        ab.w("MicroMsg.FileOperation", "file op closeOutputStream e type:%s, e msg:%s, stream:%s", new Object[] { localIOException.getClass().getSimpleName(), localIOException.getMessage(), paramOutputStream });
      }
    }
  }

  public static long copyStream(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    long l1 = 0L;
    long l2;
    if (paramInputStream == null)
      l2 = l1;
    while (true)
    {
      return l2;
      try
      {
        byte[] arrayOfByte = new byte[4096];
        int i;
        for (l2 = 0L; ; l2 += i)
        {
          i = paramInputStream.read(arrayOfByte);
          if (i == -1)
            break;
          paramOutputStream.write(arrayOfByte, 0, i);
        }
      }
      catch (Exception paramInputStream)
      {
        ab.w("MicroMsg.FileOperation", "copyStream error: %s", new Object[] { paramInputStream.getMessage() });
        l2 = l1;
      }
    }
  }

  public static int cs(String paramString)
  {
    int i = 0;
    if (paramString == null);
    while (true)
    {
      return i;
      paramString = new File(paramString);
      if (paramString.exists())
        i = (int)paramString.length();
    }
  }

  public static final boolean ct(String paramString)
  {
    boolean bool = false;
    if (paramString == null);
    while (true)
    {
      return bool;
      if (new File(paramString).exists())
        bool = true;
    }
  }

  public static boolean cu(String paramString)
  {
    return t(new File(paramString));
  }

  public static final String cv(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      paramString = "";
    while (true)
    {
      return paramString;
      paramString = new File(paramString).getName();
      int i = paramString.lastIndexOf('.');
      if ((i <= 0) || (i == paramString.length() - 1))
        paramString = "";
      else
        paramString = paramString.substring(i + 1);
    }
  }

  public static final boolean cw(String paramString)
  {
    boolean bool1 = false;
    boolean bool2;
    if (bo.isNullOrNil(paramString))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      Object localObject = new File(paramString);
      if ((((File)localObject).exists()) && (((File)localObject).isDirectory()))
      {
        bool2 = true;
      }
      else
      {
        String[] arrayOfString = paramString.split("/");
        bool2 = bool1;
        if (arrayOfString != null)
        {
          bool2 = bool1;
          if (arrayOfString.length >= 2)
          {
            localObject = "/";
            int i = 0;
            while (true)
            {
              if (i >= arrayOfString.length)
                break label204;
              paramString = (String)localObject;
              if (!bo.isNullOrNil(arrayOfString[i]))
              {
                localObject = (String)localObject + "/" + arrayOfString[i];
                File localFile = new File((String)localObject);
                if (localFile.isFile())
                {
                  bool2 = bool1;
                  if (!localFile.renameTo(new File((String)localObject + "_mmbak")))
                    break;
                }
                paramString = (String)localObject;
                if (!localFile.exists())
                {
                  bool2 = bool1;
                  if (!localFile.mkdir())
                    break;
                  paramString = (String)localObject;
                }
              }
              i++;
              localObject = paramString;
            }
            label204: bool2 = true;
          }
        }
      }
    }
  }

  public static void cx(String paramString)
  {
    File localFile = new File(paramString).getParentFile();
    if ((!localFile.exists()) && ((!localFile.mkdirs()) || (!localFile.isDirectory())))
      ab.e("MicroMsg.FileOperation", "mkParentDir mkdir error. %s", new Object[] { paramString });
  }

  // ERROR //
  public static String cy(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 67	java/io/File
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 70	java/io/File:<init>	(Ljava/lang/String;)V
    //   10: invokevirtual 74	java/io/File:exists	()Z
    //   13: ifne +7 -> 20
    //   16: aload_1
    //   17: astore_0
    //   18: aload_0
    //   19: areturn
    //   20: new 201	java/lang/StringBuffer
    //   23: dup
    //   24: invokespecial 202	java/lang/StringBuffer:<init>	()V
    //   27: astore_2
    //   28: new 204	java/io/BufferedReader
    //   31: astore_1
    //   32: new 206	java/io/FileReader
    //   35: astore_3
    //   36: aload_3
    //   37: aload_0
    //   38: invokespecial 207	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   41: aload_1
    //   42: aload_3
    //   43: invokespecial 210	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   46: aload_1
    //   47: astore_0
    //   48: sipush 1024
    //   51: newarray char
    //   53: astore_3
    //   54: aload_1
    //   55: astore_0
    //   56: aload_1
    //   57: aload_3
    //   58: invokevirtual 213	java/io/BufferedReader:read	([C)I
    //   61: istore 4
    //   63: iload 4
    //   65: iconst_m1
    //   66: if_icmpeq +38 -> 104
    //   69: aload_1
    //   70: astore_0
    //   71: aload_2
    //   72: aload_3
    //   73: iconst_0
    //   74: iload 4
    //   76: invokestatic 216	java/lang/String:valueOf	([CII)Ljava/lang/String;
    //   79: invokevirtual 219	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   82: pop
    //   83: goto -29 -> 54
    //   86: astore_2
    //   87: aload_1
    //   88: astore_0
    //   89: aload_2
    //   90: astore_1
    //   91: aload_1
    //   92: athrow
    //   93: astore_1
    //   94: aload_0
    //   95: ifnull +7 -> 102
    //   98: aload_0
    //   99: invokevirtual 220	java/io/BufferedReader:close	()V
    //   102: aload_1
    //   103: athrow
    //   104: aload_1
    //   105: invokevirtual 220	java/io/BufferedReader:close	()V
    //   108: aload_2
    //   109: invokevirtual 221	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   112: astore_0
    //   113: goto -95 -> 18
    //   116: astore_0
    //   117: aload_0
    //   118: athrow
    //   119: astore_0
    //   120: aload_0
    //   121: athrow
    //   122: astore_1
    //   123: aconst_null
    //   124: astore_0
    //   125: goto -31 -> 94
    //   128: astore_1
    //   129: aconst_null
    //   130: astore_0
    //   131: goto -40 -> 91
    //
    // Exception table:
    //   from	to	target	type
    //   48	54	86	java/io/IOException
    //   56	63	86	java/io/IOException
    //   71	83	86	java/io/IOException
    //   48	54	93	finally
    //   56	63	93	finally
    //   71	83	93	finally
    //   91	93	93	finally
    //   104	108	116	java/lang/Exception
    //   98	102	119	java/lang/Exception
    //   28	46	122	finally
    //   28	46	128	java/io/IOException
  }

  // ERROR //
  public static final boolean d(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: istore_3
    //   4: aload_0
    //   5: invokevirtual 74	java/io/File:exists	()Z
    //   8: ifeq +85 -> 93
    //   11: aload_0
    //   12: invokevirtual 171	java/io/File:isDirectory	()Z
    //   15: ifeq +80 -> 95
    //   18: aload_1
    //   19: invokevirtual 74	java/io/File:exists	()Z
    //   22: ifne +8 -> 30
    //   25: aload_1
    //   26: invokevirtual 188	java/io/File:mkdir	()Z
    //   29: pop
    //   30: aload_0
    //   31: invokevirtual 227	java/io/File:listFiles	()[Ljava/io/File;
    //   34: astore 4
    //   36: iconst_0
    //   37: istore 5
    //   39: iconst_0
    //   40: istore_3
    //   41: iload 5
    //   43: aload 4
    //   45: arraylength
    //   46: if_icmpge +47 -> 93
    //   49: aload 4
    //   51: iload 5
    //   53: aaload
    //   54: astore 6
    //   56: aload 6
    //   58: new 67	java/io/File
    //   61: dup
    //   62: aload_1
    //   63: invokevirtual 230	java/io/File:getPath	()Ljava/lang/String;
    //   66: aload 6
    //   68: invokevirtual 154	java/io/File:getName	()Ljava/lang/String;
    //   71: invokespecial 233	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   74: invokestatic 235	com/tencent/mm/a/e:d	(Ljava/io/File;Ljava/io/File;)Z
    //   77: istore_3
    //   78: iload_3
    //   79: ifeq +8 -> 87
    //   82: aload_0
    //   83: invokevirtual 238	java/io/File:delete	()Z
    //   86: pop
    //   87: iinc 5 1
    //   90: goto -49 -> 41
    //   93: iload_3
    //   94: ireturn
    //   95: new 240	java/io/FileInputStream
    //   98: astore 6
    //   100: aload 6
    //   102: aload_0
    //   103: invokespecial 243	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   106: new 12	java/io/FileOutputStream
    //   109: astore 4
    //   111: aload 4
    //   113: aload_1
    //   114: invokespecial 244	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   117: aload 4
    //   119: astore 7
    //   121: aload 6
    //   123: astore 8
    //   125: ldc 245
    //   127: newarray byte
    //   129: astore 9
    //   131: aload 4
    //   133: astore 7
    //   135: aload 6
    //   137: astore 8
    //   139: aload 6
    //   141: aload 9
    //   143: invokevirtual 128	java/io/InputStream:read	([B)I
    //   146: istore 5
    //   148: iload 5
    //   150: iconst_m1
    //   151: if_icmpeq +178 -> 329
    //   154: aload 4
    //   156: astore 7
    //   158: aload 6
    //   160: astore 8
    //   162: aload 4
    //   164: aload 9
    //   166: iconst_0
    //   167: iload 5
    //   169: invokevirtual 129	java/io/OutputStream:write	([BII)V
    //   172: goto -41 -> 131
    //   175: astore 9
    //   177: aload 4
    //   179: astore 7
    //   181: aload 6
    //   183: astore 8
    //   185: ldc 26
    //   187: aload 9
    //   189: ldc 28
    //   191: iconst_0
    //   192: anewarray 4	java/lang/Object
    //   195: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   198: aload 4
    //   200: astore 7
    //   202: aload 6
    //   204: astore 8
    //   206: ldc 26
    //   208: ldc 247
    //   210: iconst_4
    //   211: anewarray 4	java/lang/Object
    //   214: dup
    //   215: iconst_0
    //   216: aload 9
    //   218: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   221: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   224: aastore
    //   225: dup
    //   226: iconst_1
    //   227: aload 9
    //   229: invokevirtual 62	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   232: aastore
    //   233: dup
    //   234: iconst_2
    //   235: aload_0
    //   236: aastore
    //   237: dup
    //   238: iconst_3
    //   239: aload_1
    //   240: aastore
    //   241: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   244: aload 6
    //   246: ifnull +8 -> 254
    //   249: aload 6
    //   251: invokevirtual 248	java/io/InputStream:close	()V
    //   254: iload_2
    //   255: istore_3
    //   256: aload 4
    //   258: ifnull -165 -> 93
    //   261: aload 4
    //   263: invokevirtual 118	java/io/OutputStream:close	()V
    //   266: iload_2
    //   267: istore_3
    //   268: goto -175 -> 93
    //   271: astore 4
    //   273: ldc 26
    //   275: aload 4
    //   277: ldc 28
    //   279: iconst_0
    //   280: anewarray 4	java/lang/Object
    //   283: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   286: ldc 26
    //   288: ldc 250
    //   290: iconst_4
    //   291: anewarray 4	java/lang/Object
    //   294: dup
    //   295: iconst_0
    //   296: aload 4
    //   298: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   301: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   304: aastore
    //   305: dup
    //   306: iconst_1
    //   307: aload 4
    //   309: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   312: aastore
    //   313: dup
    //   314: iconst_2
    //   315: aload_0
    //   316: aastore
    //   317: dup
    //   318: iconst_3
    //   319: aload_1
    //   320: aastore
    //   321: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   324: iload_2
    //   325: istore_3
    //   326: goto -233 -> 93
    //   329: aload 4
    //   331: astore 7
    //   333: aload 6
    //   335: astore 8
    //   337: aload 4
    //   339: invokevirtual 251	java/io/OutputStream:flush	()V
    //   342: aload 4
    //   344: astore 7
    //   346: aload 6
    //   348: astore 8
    //   350: aload_0
    //   351: invokevirtual 238	java/io/File:delete	()Z
    //   354: pop
    //   355: aload 6
    //   357: invokevirtual 248	java/io/InputStream:close	()V
    //   360: aload 4
    //   362: invokevirtual 118	java/io/OutputStream:close	()V
    //   365: iconst_1
    //   366: istore_3
    //   367: goto -274 -> 93
    //   370: astore 6
    //   372: ldc 26
    //   374: aload 6
    //   376: ldc 28
    //   378: iconst_0
    //   379: anewarray 4	java/lang/Object
    //   382: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   385: ldc 26
    //   387: ldc 253
    //   389: iconst_4
    //   390: anewarray 4	java/lang/Object
    //   393: dup
    //   394: iconst_0
    //   395: aload 6
    //   397: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   400: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   403: aastore
    //   404: dup
    //   405: iconst_1
    //   406: aload 6
    //   408: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   411: aastore
    //   412: dup
    //   413: iconst_2
    //   414: aload_0
    //   415: aastore
    //   416: dup
    //   417: iconst_3
    //   418: aload_1
    //   419: aastore
    //   420: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   423: goto -63 -> 360
    //   426: astore 4
    //   428: ldc 26
    //   430: aload 4
    //   432: ldc 28
    //   434: iconst_0
    //   435: anewarray 4	java/lang/Object
    //   438: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   441: ldc 26
    //   443: ldc 250
    //   445: iconst_4
    //   446: anewarray 4	java/lang/Object
    //   449: dup
    //   450: iconst_0
    //   451: aload 4
    //   453: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   456: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   459: aastore
    //   460: dup
    //   461: iconst_1
    //   462: aload 4
    //   464: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   467: aastore
    //   468: dup
    //   469: iconst_2
    //   470: aload_0
    //   471: aastore
    //   472: dup
    //   473: iconst_3
    //   474: aload_1
    //   475: aastore
    //   476: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   479: goto -114 -> 365
    //   482: astore 6
    //   484: ldc 26
    //   486: aload 6
    //   488: ldc 28
    //   490: iconst_0
    //   491: anewarray 4	java/lang/Object
    //   494: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   497: ldc 26
    //   499: ldc 253
    //   501: iconst_4
    //   502: anewarray 4	java/lang/Object
    //   505: dup
    //   506: iconst_0
    //   507: aload 6
    //   509: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   512: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   515: aastore
    //   516: dup
    //   517: iconst_1
    //   518: aload 6
    //   520: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   523: aastore
    //   524: dup
    //   525: iconst_2
    //   526: aload_0
    //   527: aastore
    //   528: dup
    //   529: iconst_3
    //   530: aload_1
    //   531: aastore
    //   532: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   535: goto -281 -> 254
    //   538: astore 4
    //   540: aconst_null
    //   541: astore 7
    //   543: aconst_null
    //   544: astore 6
    //   546: aload 6
    //   548: ifnull +8 -> 556
    //   551: aload 6
    //   553: invokevirtual 248	java/io/InputStream:close	()V
    //   556: aload 7
    //   558: ifnull +8 -> 566
    //   561: aload 7
    //   563: invokevirtual 118	java/io/OutputStream:close	()V
    //   566: aload 4
    //   568: athrow
    //   569: astore 6
    //   571: ldc 26
    //   573: aload 6
    //   575: ldc 28
    //   577: iconst_0
    //   578: anewarray 4	java/lang/Object
    //   581: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   584: ldc 26
    //   586: ldc 253
    //   588: iconst_4
    //   589: anewarray 4	java/lang/Object
    //   592: dup
    //   593: iconst_0
    //   594: aload 6
    //   596: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   599: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   602: aastore
    //   603: dup
    //   604: iconst_1
    //   605: aload 6
    //   607: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   610: aastore
    //   611: dup
    //   612: iconst_2
    //   613: aload_0
    //   614: aastore
    //   615: dup
    //   616: iconst_3
    //   617: aload_1
    //   618: aastore
    //   619: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   622: goto -66 -> 556
    //   625: astore 6
    //   627: ldc 26
    //   629: aload 6
    //   631: ldc 28
    //   633: iconst_0
    //   634: anewarray 4	java/lang/Object
    //   637: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   640: ldc 26
    //   642: ldc 250
    //   644: iconst_4
    //   645: anewarray 4	java/lang/Object
    //   648: dup
    //   649: iconst_0
    //   650: aload 6
    //   652: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   655: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   658: aastore
    //   659: dup
    //   660: iconst_1
    //   661: aload 6
    //   663: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   666: aastore
    //   667: dup
    //   668: iconst_2
    //   669: aload_0
    //   670: aastore
    //   671: dup
    //   672: iconst_3
    //   673: aload_1
    //   674: aastore
    //   675: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   678: goto -112 -> 566
    //   681: astore 4
    //   683: aconst_null
    //   684: astore 7
    //   686: goto -140 -> 546
    //   689: astore 4
    //   691: aload 8
    //   693: astore 6
    //   695: goto -149 -> 546
    //   698: astore 9
    //   700: aconst_null
    //   701: astore 4
    //   703: aconst_null
    //   704: astore 6
    //   706: goto -529 -> 177
    //   709: astore 9
    //   711: aconst_null
    //   712: astore 4
    //   714: goto -537 -> 177
    //
    // Exception table:
    //   from	to	target	type
    //   125	131	175	java/lang/Exception
    //   139	148	175	java/lang/Exception
    //   162	172	175	java/lang/Exception
    //   337	342	175	java/lang/Exception
    //   350	355	175	java/lang/Exception
    //   261	266	271	java/io/IOException
    //   355	360	370	java/io/IOException
    //   360	365	426	java/io/IOException
    //   249	254	482	java/io/IOException
    //   95	106	538	finally
    //   551	556	569	java/io/IOException
    //   561	566	625	java/io/IOException
    //   106	117	681	finally
    //   125	131	689	finally
    //   139	148	689	finally
    //   162	172	689	finally
    //   185	198	689	finally
    //   206	244	689	finally
    //   337	342	689	finally
    //   350	355	689	finally
    //   95	106	698	java/lang/Exception
    //   106	117	709	java/lang/Exception
  }

  public static boolean deleteFile(String paramString)
  {
    boolean bool = true;
    if (paramString == null);
    while (true)
    {
      return bool;
      paramString = new File(paramString);
      if (paramString.exists())
        bool = paramString.delete();
    }
  }

  // ERROR //
  public static int e(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_1
    //   3: ifnull +8 -> 11
    //   6: aload_1
    //   7: arraylength
    //   8: ifne +8 -> 16
    //   11: bipush 254
    //   13: istore_2
    //   14: iload_2
    //   15: ireturn
    //   16: new 12	java/io/FileOutputStream
    //   19: astore_3
    //   20: aload_3
    //   21: aload_0
    //   22: iconst_1
    //   23: invokespecial 16	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   26: aload_3
    //   27: astore 4
    //   29: aload_3
    //   30: aload_1
    //   31: iconst_0
    //   32: aload_1
    //   33: arraylength
    //   34: invokevirtual 20	java/io/FileOutputStream:write	([BII)V
    //   37: aload_3
    //   38: invokevirtual 24	java/io/FileOutputStream:close	()V
    //   41: goto -27 -> 14
    //   44: astore 4
    //   46: ldc 26
    //   48: aload 4
    //   50: ldc 28
    //   52: iconst_0
    //   53: anewarray 4	java/lang/Object
    //   56: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   59: ldc 26
    //   61: ldc_w 257
    //   64: iconst_4
    //   65: anewarray 4	java/lang/Object
    //   68: dup
    //   69: iconst_0
    //   70: aload 4
    //   72: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   75: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   78: aastore
    //   79: dup
    //   80: iconst_1
    //   81: aload 4
    //   83: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   86: aastore
    //   87: dup
    //   88: iconst_2
    //   89: aload_0
    //   90: aastore
    //   91: dup
    //   92: iconst_3
    //   93: aload_1
    //   94: arraylength
    //   95: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   98: aastore
    //   99: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   102: goto -88 -> 14
    //   105: astore 5
    //   107: aconst_null
    //   108: astore_3
    //   109: aload_3
    //   110: astore 4
    //   112: ldc 26
    //   114: aload 5
    //   116: ldc 28
    //   118: iconst_0
    //   119: anewarray 4	java/lang/Object
    //   122: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   125: aload_3
    //   126: astore 4
    //   128: ldc 26
    //   130: ldc_w 259
    //   133: iconst_4
    //   134: anewarray 4	java/lang/Object
    //   137: dup
    //   138: iconst_0
    //   139: aload 5
    //   141: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   144: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   147: aastore
    //   148: dup
    //   149: iconst_1
    //   150: aload 5
    //   152: invokevirtual 62	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   155: aastore
    //   156: dup
    //   157: iconst_2
    //   158: aload_0
    //   159: aastore
    //   160: dup
    //   161: iconst_3
    //   162: aload_1
    //   163: arraylength
    //   164: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   167: aastore
    //   168: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   171: aload_3
    //   172: ifnull +7 -> 179
    //   175: aload_3
    //   176: invokevirtual 24	java/io/FileOutputStream:close	()V
    //   179: iconst_m1
    //   180: istore_2
    //   181: goto -167 -> 14
    //   184: astore 4
    //   186: ldc 26
    //   188: aload 4
    //   190: ldc 28
    //   192: iconst_0
    //   193: anewarray 4	java/lang/Object
    //   196: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   199: ldc 26
    //   201: ldc_w 257
    //   204: iconst_4
    //   205: anewarray 4	java/lang/Object
    //   208: dup
    //   209: iconst_0
    //   210: aload 4
    //   212: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   215: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   218: aastore
    //   219: dup
    //   220: iconst_1
    //   221: aload 4
    //   223: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   226: aastore
    //   227: dup
    //   228: iconst_2
    //   229: aload_0
    //   230: aastore
    //   231: dup
    //   232: iconst_3
    //   233: aload_1
    //   234: arraylength
    //   235: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   238: aastore
    //   239: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   242: goto -63 -> 179
    //   245: astore_3
    //   246: aconst_null
    //   247: astore 4
    //   249: aload 4
    //   251: ifnull +8 -> 259
    //   254: aload 4
    //   256: invokevirtual 24	java/io/FileOutputStream:close	()V
    //   259: aload_3
    //   260: athrow
    //   261: astore 4
    //   263: ldc 26
    //   265: aload 4
    //   267: ldc 28
    //   269: iconst_0
    //   270: anewarray 4	java/lang/Object
    //   273: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   276: ldc 26
    //   278: ldc_w 257
    //   281: iconst_4
    //   282: anewarray 4	java/lang/Object
    //   285: dup
    //   286: iconst_0
    //   287: aload 4
    //   289: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   292: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   295: aastore
    //   296: dup
    //   297: iconst_1
    //   298: aload 4
    //   300: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   303: aastore
    //   304: dup
    //   305: iconst_2
    //   306: aload_0
    //   307: aastore
    //   308: dup
    //   309: iconst_3
    //   310: aload_1
    //   311: arraylength
    //   312: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   315: aastore
    //   316: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   319: goto -60 -> 259
    //   322: astore_3
    //   323: goto -74 -> 249
    //   326: astore 5
    //   328: goto -219 -> 109
    //
    // Exception table:
    //   from	to	target	type
    //   37	41	44	java/io/IOException
    //   16	26	105	java/lang/Exception
    //   175	179	184	java/io/IOException
    //   16	26	245	finally
    //   254	259	261	java/io/IOException
    //   29	37	322	finally
    //   112	125	322	finally
    //   128	171	322	finally
    //   29	37	326	java/lang/Exception
  }

  // ERROR //
  public static byte[] e(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +7 -> 8
    //   4: aconst_null
    //   5: astore_3
    //   6: aload_3
    //   7: areturn
    //   8: new 67	java/io/File
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 70	java/io/File:<init>	(Ljava/lang/String;)V
    //   16: astore_3
    //   17: aload_3
    //   18: invokevirtual 74	java/io/File:exists	()Z
    //   21: ifne +8 -> 29
    //   24: aconst_null
    //   25: astore_3
    //   26: goto -20 -> 6
    //   29: iload_2
    //   30: istore 4
    //   32: iload_2
    //   33: iconst_m1
    //   34: if_icmpne +10 -> 44
    //   37: aload_3
    //   38: invokevirtual 137	java/io/File:length	()J
    //   41: l2i
    //   42: istore 4
    //   44: iload_1
    //   45: ifge +8 -> 53
    //   48: aconst_null
    //   49: astore_3
    //   50: goto -44 -> 6
    //   53: iload 4
    //   55: ifgt +8 -> 63
    //   58: aconst_null
    //   59: astore_3
    //   60: goto -54 -> 6
    //   63: iload_1
    //   64: iload 4
    //   66: iadd
    //   67: aload_3
    //   68: invokevirtual 137	java/io/File:length	()J
    //   71: l2i
    //   72: if_icmple +8 -> 80
    //   75: aconst_null
    //   76: astore_3
    //   77: goto -71 -> 6
    //   80: new 262	java/io/RandomAccessFile
    //   83: astore 5
    //   85: aload 5
    //   87: aload_0
    //   88: ldc_w 264
    //   91: invokespecial 265	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   94: aload 5
    //   96: astore_3
    //   97: iload 4
    //   99: newarray byte
    //   101: astore 6
    //   103: iload_1
    //   104: i2l
    //   105: lstore 7
    //   107: aload 5
    //   109: astore_3
    //   110: aload 5
    //   112: lload 7
    //   114: invokevirtual 269	java/io/RandomAccessFile:seek	(J)V
    //   117: aload 5
    //   119: astore_3
    //   120: aload 5
    //   122: aload 6
    //   124: invokevirtual 272	java/io/RandomAccessFile:readFully	([B)V
    //   127: aload 5
    //   129: invokevirtual 273	java/io/RandomAccessFile:close	()V
    //   132: aload 6
    //   134: astore_3
    //   135: goto -129 -> 6
    //   138: astore_3
    //   139: ldc 26
    //   141: aload_3
    //   142: ldc 28
    //   144: iconst_0
    //   145: anewarray 4	java/lang/Object
    //   148: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   151: ldc 26
    //   153: ldc_w 275
    //   156: iconst_5
    //   157: anewarray 4	java/lang/Object
    //   160: dup
    //   161: iconst_0
    //   162: aload_3
    //   163: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   166: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   169: aastore
    //   170: dup
    //   171: iconst_1
    //   172: aload_3
    //   173: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   176: aastore
    //   177: dup
    //   178: iconst_2
    //   179: aload_0
    //   180: aastore
    //   181: dup
    //   182: iconst_3
    //   183: iload_1
    //   184: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   187: aastore
    //   188: dup
    //   189: iconst_4
    //   190: iload 4
    //   192: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   195: aastore
    //   196: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   199: aload 6
    //   201: astore_3
    //   202: goto -196 -> 6
    //   205: astore 9
    //   207: aconst_null
    //   208: astore 5
    //   210: aconst_null
    //   211: astore 6
    //   213: aload 5
    //   215: astore_3
    //   216: ldc 26
    //   218: aload 9
    //   220: ldc 28
    //   222: iconst_0
    //   223: anewarray 4	java/lang/Object
    //   226: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   229: aload 5
    //   231: astore_3
    //   232: ldc 26
    //   234: ldc_w 277
    //   237: iconst_5
    //   238: anewarray 4	java/lang/Object
    //   241: dup
    //   242: iconst_0
    //   243: aload 9
    //   245: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   248: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   251: aastore
    //   252: dup
    //   253: iconst_1
    //   254: aload 9
    //   256: invokevirtual 62	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   259: aastore
    //   260: dup
    //   261: iconst_2
    //   262: aload_0
    //   263: aastore
    //   264: dup
    //   265: iconst_3
    //   266: iload_1
    //   267: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   270: aastore
    //   271: dup
    //   272: iconst_4
    //   273: iload 4
    //   275: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   278: aastore
    //   279: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   282: aload 6
    //   284: astore_3
    //   285: aload 5
    //   287: ifnull -281 -> 6
    //   290: aload 5
    //   292: invokevirtual 273	java/io/RandomAccessFile:close	()V
    //   295: aload 6
    //   297: astore_3
    //   298: goto -292 -> 6
    //   301: astore_3
    //   302: ldc 26
    //   304: aload_3
    //   305: ldc 28
    //   307: iconst_0
    //   308: anewarray 4	java/lang/Object
    //   311: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   314: ldc 26
    //   316: ldc_w 275
    //   319: iconst_5
    //   320: anewarray 4	java/lang/Object
    //   323: dup
    //   324: iconst_0
    //   325: aload_3
    //   326: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   329: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   332: aastore
    //   333: dup
    //   334: iconst_1
    //   335: aload_3
    //   336: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   339: aastore
    //   340: dup
    //   341: iconst_2
    //   342: aload_0
    //   343: aastore
    //   344: dup
    //   345: iconst_3
    //   346: iload_1
    //   347: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   350: aastore
    //   351: dup
    //   352: iconst_4
    //   353: iload 4
    //   355: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   358: aastore
    //   359: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   362: aload 6
    //   364: astore_3
    //   365: goto -359 -> 6
    //   368: astore 6
    //   370: aconst_null
    //   371: astore_3
    //   372: aload_3
    //   373: ifnull +7 -> 380
    //   376: aload_3
    //   377: invokevirtual 273	java/io/RandomAccessFile:close	()V
    //   380: aload 6
    //   382: athrow
    //   383: astore_3
    //   384: ldc 26
    //   386: aload_3
    //   387: ldc 28
    //   389: iconst_0
    //   390: anewarray 4	java/lang/Object
    //   393: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   396: ldc 26
    //   398: ldc_w 275
    //   401: iconst_5
    //   402: anewarray 4	java/lang/Object
    //   405: dup
    //   406: iconst_0
    //   407: aload_3
    //   408: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   411: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   414: aastore
    //   415: dup
    //   416: iconst_1
    //   417: aload_3
    //   418: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   421: aastore
    //   422: dup
    //   423: iconst_2
    //   424: aload_0
    //   425: aastore
    //   426: dup
    //   427: iconst_3
    //   428: iload_1
    //   429: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   432: aastore
    //   433: dup
    //   434: iconst_4
    //   435: iload 4
    //   437: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   440: aastore
    //   441: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   444: goto -64 -> 380
    //   447: astore 6
    //   449: goto -77 -> 372
    //   452: astore 9
    //   454: aconst_null
    //   455: astore 6
    //   457: goto -244 -> 213
    //   460: astore 9
    //   462: goto -249 -> 213
    //
    // Exception table:
    //   from	to	target	type
    //   127	132	138	java/io/IOException
    //   80	94	205	java/lang/Exception
    //   290	295	301	java/io/IOException
    //   80	94	368	finally
    //   376	380	383	java/io/IOException
    //   97	103	447	finally
    //   110	117	447	finally
    //   120	127	447	finally
    //   216	229	447	finally
    //   232	282	447	finally
    //   97	103	452	java/lang/Exception
    //   110	117	460	java/lang/Exception
    //   120	127	460	java/lang/Exception
  }

  public static void f(String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      File localFile = new File(str);
      if ((!localFile.exists()) && ((!localFile.mkdirs()) || (!localFile.isDirectory())))
        ab.e("MicroMsg.FileOperation", "batchMkDirs mkdir error. %s", new Object[] { str });
    }
  }

  // ERROR //
  public static byte[] f(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +7 -> 8
    //   4: aconst_null
    //   5: astore_0
    //   6: aload_0
    //   7: areturn
    //   8: new 67	java/io/File
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 70	java/io/File:<init>	(Ljava/lang/String;)V
    //   16: astore_3
    //   17: aload_3
    //   18: invokevirtual 74	java/io/File:exists	()Z
    //   21: ifne +8 -> 29
    //   24: aconst_null
    //   25: astore_0
    //   26: goto -20 -> 6
    //   29: iload_2
    //   30: iconst_m1
    //   31: if_icmpne +446 -> 477
    //   34: aload_3
    //   35: invokevirtual 137	java/io/File:length	()J
    //   38: l2i
    //   39: istore_2
    //   40: iload_1
    //   41: ifge +8 -> 49
    //   44: aconst_null
    //   45: astore_0
    //   46: goto -40 -> 6
    //   49: iload_2
    //   50: ifgt +8 -> 58
    //   53: aconst_null
    //   54: astore_0
    //   55: goto -49 -> 6
    //   58: iload_2
    //   59: istore 4
    //   61: iload_1
    //   62: iload_2
    //   63: iadd
    //   64: aload_3
    //   65: invokevirtual 137	java/io/File:length	()J
    //   68: l2i
    //   69: if_icmple +12 -> 81
    //   72: aload_3
    //   73: invokevirtual 137	java/io/File:length	()J
    //   76: l2i
    //   77: iload_1
    //   78: isub
    //   79: istore 4
    //   81: new 262	java/io/RandomAccessFile
    //   84: astore 5
    //   86: aload 5
    //   88: aload_0
    //   89: ldc_w 264
    //   92: invokespecial 265	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   95: aload 5
    //   97: astore 6
    //   99: iload 4
    //   101: newarray byte
    //   103: astore_3
    //   104: iload_1
    //   105: i2l
    //   106: lstore 7
    //   108: aload 5
    //   110: astore 6
    //   112: aload 5
    //   114: lload 7
    //   116: invokevirtual 269	java/io/RandomAccessFile:seek	(J)V
    //   119: aload 5
    //   121: astore 6
    //   123: aload 5
    //   125: aload_3
    //   126: invokevirtual 272	java/io/RandomAccessFile:readFully	([B)V
    //   129: aload 5
    //   131: invokevirtual 273	java/io/RandomAccessFile:close	()V
    //   134: aload_3
    //   135: astore_0
    //   136: goto -130 -> 6
    //   139: astore 6
    //   141: ldc 26
    //   143: aload 6
    //   145: ldc 28
    //   147: iconst_0
    //   148: anewarray 4	java/lang/Object
    //   151: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   154: ldc 26
    //   156: ldc_w 283
    //   159: iconst_5
    //   160: anewarray 4	java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: aload 6
    //   167: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   170: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   173: aastore
    //   174: dup
    //   175: iconst_1
    //   176: aload 6
    //   178: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   181: aastore
    //   182: dup
    //   183: iconst_2
    //   184: aload_0
    //   185: aastore
    //   186: dup
    //   187: iconst_3
    //   188: iload_1
    //   189: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   192: aastore
    //   193: dup
    //   194: iconst_4
    //   195: iload 4
    //   197: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   200: aastore
    //   201: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   204: aload_3
    //   205: astore_0
    //   206: goto -200 -> 6
    //   209: astore 9
    //   211: aconst_null
    //   212: astore 5
    //   214: aconst_null
    //   215: astore_3
    //   216: aload 5
    //   218: astore 6
    //   220: ldc 26
    //   222: aload 9
    //   224: ldc 28
    //   226: iconst_0
    //   227: anewarray 4	java/lang/Object
    //   230: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   233: aload 5
    //   235: astore 6
    //   237: ldc 26
    //   239: ldc_w 285
    //   242: iconst_5
    //   243: anewarray 4	java/lang/Object
    //   246: dup
    //   247: iconst_0
    //   248: aload 9
    //   250: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   253: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   256: aastore
    //   257: dup
    //   258: iconst_1
    //   259: aload 9
    //   261: invokevirtual 62	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   264: aastore
    //   265: dup
    //   266: iconst_2
    //   267: aload_0
    //   268: aastore
    //   269: dup
    //   270: iconst_3
    //   271: iload_1
    //   272: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   275: aastore
    //   276: dup
    //   277: iconst_4
    //   278: iload 4
    //   280: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   283: aastore
    //   284: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   287: aload 5
    //   289: ifnull +183 -> 472
    //   292: aload 5
    //   294: invokevirtual 273	java/io/RandomAccessFile:close	()V
    //   297: aload_3
    //   298: astore_0
    //   299: goto -293 -> 6
    //   302: astore 6
    //   304: ldc 26
    //   306: aload 6
    //   308: ldc 28
    //   310: iconst_0
    //   311: anewarray 4	java/lang/Object
    //   314: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   317: ldc 26
    //   319: ldc_w 283
    //   322: iconst_5
    //   323: anewarray 4	java/lang/Object
    //   326: dup
    //   327: iconst_0
    //   328: aload 6
    //   330: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   333: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   336: aastore
    //   337: dup
    //   338: iconst_1
    //   339: aload 6
    //   341: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   344: aastore
    //   345: dup
    //   346: iconst_2
    //   347: aload_0
    //   348: aastore
    //   349: dup
    //   350: iconst_3
    //   351: iload_1
    //   352: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   355: aastore
    //   356: dup
    //   357: iconst_4
    //   358: iload 4
    //   360: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   363: aastore
    //   364: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   367: aload_3
    //   368: astore_0
    //   369: goto -363 -> 6
    //   372: astore_3
    //   373: aconst_null
    //   374: astore 6
    //   376: aload 6
    //   378: ifnull +8 -> 386
    //   381: aload 6
    //   383: invokevirtual 273	java/io/RandomAccessFile:close	()V
    //   386: aload_3
    //   387: athrow
    //   388: astore 6
    //   390: ldc 26
    //   392: aload 6
    //   394: ldc 28
    //   396: iconst_0
    //   397: anewarray 4	java/lang/Object
    //   400: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   403: ldc 26
    //   405: ldc_w 283
    //   408: iconst_5
    //   409: anewarray 4	java/lang/Object
    //   412: dup
    //   413: iconst_0
    //   414: aload 6
    //   416: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   419: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   422: aastore
    //   423: dup
    //   424: iconst_1
    //   425: aload 6
    //   427: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   430: aastore
    //   431: dup
    //   432: iconst_2
    //   433: aload_0
    //   434: aastore
    //   435: dup
    //   436: iconst_3
    //   437: iload_1
    //   438: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   441: aastore
    //   442: dup
    //   443: iconst_4
    //   444: iload 4
    //   446: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   449: aastore
    //   450: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   453: goto -67 -> 386
    //   456: astore_3
    //   457: goto -81 -> 376
    //   460: astore 9
    //   462: aconst_null
    //   463: astore_3
    //   464: goto -248 -> 216
    //   467: astore 9
    //   469: goto -253 -> 216
    //   472: aload_3
    //   473: astore_0
    //   474: goto -468 -> 6
    //   477: goto -437 -> 40
    //
    // Exception table:
    //   from	to	target	type
    //   129	134	139	java/io/IOException
    //   81	95	209	java/lang/Exception
    //   292	297	302	java/io/IOException
    //   81	95	372	finally
    //   381	386	388	java/io/IOException
    //   99	104	456	finally
    //   112	119	456	finally
    //   123	129	456	finally
    //   220	233	456	finally
    //   237	287	456	finally
    //   99	104	460	java/lang/Exception
    //   112	119	467	java/lang/Exception
    //   123	129	467	java/lang/Exception
  }

  public static final boolean h(String paramString1, String paramString2, String paramString3)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramString1 != null)
    {
      bool2 = bool1;
      if (paramString2 != null)
      {
        if (paramString3 != null)
          break label26;
        bool2 = bool1;
      }
    }
    while (true)
    {
      return bool2;
      label26: paramString2 = new File(paramString1 + paramString2);
      paramString1 = new File(paramString1 + paramString3);
      bool2 = bool1;
      if (paramString2.exists())
        bool2 = paramString2.renameTo(paramString1);
    }
  }

  public static void p(InputStream paramInputStream)
  {
    if (paramInputStream != null);
    try
    {
      paramInputStream.close();
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FileOperation", localException, "", new Object[0]);
        ab.w("MicroMsg.FileOperation", "file op closeInputStream e type:%s, e msg:%s, stream:%s", new Object[] { localException.getClass().getSimpleName(), localException.getMessage(), paramInputStream });
      }
    }
  }

  public static byte[] q(InputStream paramInputStream)
  {
    if (paramInputStream == null)
      paramInputStream = null;
    while (true)
    {
      return paramInputStream;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte[1024];
      int i = 0;
      try
      {
        while (true)
        {
          int j = paramInputStream.read(arrayOfByte, 0, 1024);
          i = j;
          label38: if (i <= 0)
            break;
          localByteArrayOutputStream.write(arrayOfByte, 0, i);
        }
        paramInputStream = localByteArrayOutputStream.toByteArray();
      }
      catch (IOException localIOException)
      {
        break label38;
      }
    }
  }

  public static final boolean t(File paramFile)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramFile != null)
    {
      if (!paramFile.exists())
        bool2 = bool1;
    }
    else
      return bool2;
    if (paramFile.isFile())
      paramFile.delete();
    while (true)
    {
      paramFile.delete();
      bool2 = true;
      break;
      if (paramFile.isDirectory())
      {
        File[] arrayOfFile = paramFile.listFiles();
        if (arrayOfFile != null)
          while (i < arrayOfFile.length)
          {
            t(arrayOfFile[i]);
            i++;
          }
      }
    }
  }

  public static final boolean u(File paramFile)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramFile != null)
    {
      if (paramFile.exists())
        break label21;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label21: bool2 = bool1;
      if (paramFile.isDirectory())
      {
        paramFile = paramFile.listFiles();
        bool2 = bool1;
        if (paramFile != null)
        {
          while (i < paramFile.length)
          {
            paramFile[i].delete();
            i++;
          }
          bool2 = true;
        }
      }
    }
  }

  // ERROR //
  public static long y(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 240	java/io/FileInputStream
    //   3: astore_2
    //   4: aload_2
    //   5: aload_0
    //   6: invokespecial 308	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   9: aload_2
    //   10: invokevirtual 312	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   13: astore_2
    //   14: new 12	java/io/FileOutputStream
    //   17: astore_3
    //   18: aload_3
    //   19: aload_1
    //   20: invokespecial 313	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   23: aload_3
    //   24: invokevirtual 314	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   27: astore_3
    //   28: aload_3
    //   29: aload_2
    //   30: lconst_0
    //   31: aload_2
    //   32: invokevirtual 319	java/nio/channels/FileChannel:size	()J
    //   35: invokevirtual 323	java/nio/channels/FileChannel:transferFrom	(Ljava/nio/channels/ReadableByteChannel;JJ)J
    //   38: pop2
    //   39: aload_2
    //   40: invokevirtual 319	java/nio/channels/FileChannel:size	()J
    //   43: lstore 4
    //   45: aload_2
    //   46: ifnull +7 -> 53
    //   49: aload_2
    //   50: invokevirtual 324	java/nio/channels/FileChannel:close	()V
    //   53: aload_3
    //   54: ifnull +7 -> 61
    //   57: aload_3
    //   58: invokevirtual 324	java/nio/channels/FileChannel:close	()V
    //   61: lload 4
    //   63: lreturn
    //   64: astore 6
    //   66: aconst_null
    //   67: astore_2
    //   68: aconst_null
    //   69: astore_3
    //   70: ldc 26
    //   72: aload 6
    //   74: ldc 28
    //   76: iconst_0
    //   77: anewarray 4	java/lang/Object
    //   80: invokestatic 34	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: ldc 26
    //   85: ldc_w 326
    //   88: iconst_4
    //   89: anewarray 4	java/lang/Object
    //   92: dup
    //   93: iconst_0
    //   94: aload 6
    //   96: invokevirtual 40	java/lang/Object:getClass	()Ljava/lang/Class;
    //   99: invokevirtual 46	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   102: aastore
    //   103: dup
    //   104: iconst_1
    //   105: aload 6
    //   107: invokevirtual 62	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   110: aastore
    //   111: dup
    //   112: iconst_2
    //   113: aload_0
    //   114: aastore
    //   115: dup
    //   116: iconst_3
    //   117: aload_1
    //   118: aastore
    //   119: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   122: aload_3
    //   123: ifnull +7 -> 130
    //   126: aload_3
    //   127: invokevirtual 324	java/nio/channels/FileChannel:close	()V
    //   130: aload_2
    //   131: ifnull +7 -> 138
    //   134: aload_2
    //   135: invokevirtual 324	java/nio/channels/FileChannel:close	()V
    //   138: ldc2_w 327
    //   141: lstore 4
    //   143: goto -82 -> 61
    //   146: astore_0
    //   147: aconst_null
    //   148: astore_2
    //   149: aconst_null
    //   150: astore_3
    //   151: aload_3
    //   152: ifnull +7 -> 159
    //   155: aload_3
    //   156: invokevirtual 324	java/nio/channels/FileChannel:close	()V
    //   159: aload_2
    //   160: ifnull +7 -> 167
    //   163: aload_2
    //   164: invokevirtual 324	java/nio/channels/FileChannel:close	()V
    //   167: aload_0
    //   168: athrow
    //   169: astore_0
    //   170: goto -117 -> 53
    //   173: astore_0
    //   174: goto -113 -> 61
    //   177: astore_0
    //   178: goto -48 -> 130
    //   181: astore_0
    //   182: goto -44 -> 138
    //   185: astore_1
    //   186: goto -27 -> 159
    //   189: astore_1
    //   190: goto -23 -> 167
    //   193: astore_0
    //   194: aconst_null
    //   195: astore_1
    //   196: aload_2
    //   197: astore_3
    //   198: aload_1
    //   199: astore_2
    //   200: goto -49 -> 151
    //   203: astore_0
    //   204: aload_3
    //   205: astore_1
    //   206: aload_2
    //   207: astore_3
    //   208: aload_1
    //   209: astore_2
    //   210: goto -59 -> 151
    //   213: astore_0
    //   214: goto -63 -> 151
    //   217: astore 6
    //   219: aconst_null
    //   220: astore 7
    //   222: aload_2
    //   223: astore_3
    //   224: aload 7
    //   226: astore_2
    //   227: goto -157 -> 70
    //   230: astore 6
    //   232: aload_3
    //   233: astore 7
    //   235: aload_2
    //   236: astore_3
    //   237: aload 7
    //   239: astore_2
    //   240: goto -170 -> 70
    //
    // Exception table:
    //   from	to	target	type
    //   0	14	64	java/lang/Exception
    //   0	14	146	finally
    //   49	53	169	java/io/IOException
    //   57	61	173	java/io/IOException
    //   126	130	177	java/io/IOException
    //   134	138	181	java/io/IOException
    //   155	159	185	java/io/IOException
    //   163	167	189	java/io/IOException
    //   14	28	193	finally
    //   28	45	203	finally
    //   70	122	213	finally
    //   14	28	217	java/lang/Exception
    //   28	45	230	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.e
 * JD-Core Version:    0.6.2
 */