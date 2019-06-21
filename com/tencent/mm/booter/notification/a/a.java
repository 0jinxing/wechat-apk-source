package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.d;

public final class a
{
  public Bitmap eek;

  // ERROR //
  public static Bitmap H(java.lang.String paramString1, java.lang.String paramString2)
  {
    // Byte code:
    //   0: sipush 16005
    //   3: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokestatic 29	com/tencent/mm/platformtools/ah:isNullOrNil	(Ljava/lang/String;)Z
    //   10: ifeq +13 -> 23
    //   13: aconst_null
    //   14: astore_0
    //   15: sipush 16005
    //   18: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aload_0
    //   22: areturn
    //   23: new 34	java/lang/StringBuilder
    //   26: dup
    //   27: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   30: aload_1
    //   31: ldc 37
    //   33: aload_0
    //   34: invokevirtual 43	java/lang/String:getBytes	()[B
    //   37: invokestatic 49	com/tencent/mm/a/g:x	([B)Ljava/lang/String;
    //   40: ldc 51
    //   42: iconst_1
    //   43: invokestatic 57	com/tencent/mm/sdk/platformtools/j:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   46: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: ldc 63
    //   51: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: astore_2
    //   58: iconst_1
    //   59: istore_3
    //   60: aconst_null
    //   61: astore 4
    //   63: aconst_null
    //   64: astore 5
    //   66: aconst_null
    //   67: astore 6
    //   69: aconst_null
    //   70: astore_1
    //   71: new 69	java/io/File
    //   74: astore_0
    //   75: aload_0
    //   76: aload_2
    //   77: invokespecial 72	java/io/File:<init>	(Ljava/lang/String;)V
    //   80: aload_0
    //   81: invokevirtual 76	java/io/File:exists	()Z
    //   84: ifne +29 -> 113
    //   87: ldc 78
    //   89: ldc 80
    //   91: iconst_1
    //   92: anewarray 4	java/lang/Object
    //   95: dup
    //   96: iconst_0
    //   97: aload_2
    //   98: aastore
    //   99: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   102: aconst_null
    //   103: astore_0
    //   104: sipush 16005
    //   107: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   110: goto -89 -> 21
    //   113: aload_0
    //   114: invokevirtual 90	java/io/File:length	()J
    //   117: l2i
    //   118: istore 7
    //   120: iload 7
    //   122: ifle +17 -> 139
    //   125: iload 7
    //   127: ldc 91
    //   129: if_icmpeq +44 -> 173
    //   132: iload 7
    //   134: ldc 92
    //   136: if_icmpeq +37 -> 173
    //   139: ldc 78
    //   141: ldc 94
    //   143: iconst_2
    //   144: anewarray 4	java/lang/Object
    //   147: dup
    //   148: iconst_0
    //   149: iload 7
    //   151: invokestatic 100	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   154: aastore
    //   155: dup
    //   156: iconst_1
    //   157: aload_2
    //   158: aastore
    //   159: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   162: aconst_null
    //   163: astore_0
    //   164: sipush 16005
    //   167: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   170: goto -149 -> 21
    //   173: new 105	java/io/FileInputStream
    //   176: dup
    //   177: aload_2
    //   178: invokespecial 106	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   181: astore_0
    //   182: aload 5
    //   184: astore_1
    //   185: aload_0
    //   186: invokevirtual 110	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   189: astore 4
    //   191: aload 4
    //   193: astore_1
    //   194: aload 4
    //   196: astore 6
    //   198: ldc 91
    //   200: invokestatic 116	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   203: astore 8
    //   205: aload 4
    //   207: astore_1
    //   208: aload 4
    //   210: astore 6
    //   212: aload 4
    //   214: aload 8
    //   216: invokevirtual 122	java/nio/channels/FileChannel:read	(Ljava/nio/ByteBuffer;)I
    //   219: pop
    //   220: aload 4
    //   222: astore_1
    //   223: aload 4
    //   225: astore 6
    //   227: aload 8
    //   229: iconst_0
    //   230: invokevirtual 126	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   233: pop
    //   234: iload 7
    //   236: ldc 92
    //   238: if_icmpne +128 -> 366
    //   241: aload 4
    //   243: astore_1
    //   244: aload 4
    //   246: astore 6
    //   248: bipush 16
    //   250: invokestatic 116	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   253: astore 5
    //   255: aload 4
    //   257: astore_1
    //   258: aload 4
    //   260: astore 6
    //   262: aload 4
    //   264: aload 5
    //   266: invokevirtual 122	java/nio/channels/FileChannel:read	(Ljava/nio/ByteBuffer;)I
    //   269: pop
    //   270: aload 4
    //   272: astore_1
    //   273: aload 4
    //   275: astore 6
    //   277: aload 5
    //   279: iconst_0
    //   280: invokevirtual 130	java/nio/ByteBuffer:getLong	(I)J
    //   283: lstore 9
    //   285: lload 9
    //   287: lconst_1
    //   288: lcmp
    //   289: ifeq +75 -> 364
    //   292: aload 4
    //   294: astore_1
    //   295: aload 4
    //   297: astore 6
    //   299: ldc 78
    //   301: ldc 132
    //   303: iconst_3
    //   304: anewarray 4	java/lang/Object
    //   307: dup
    //   308: iconst_0
    //   309: lload 9
    //   311: invokestatic 137	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   314: aastore
    //   315: dup
    //   316: iconst_1
    //   317: iload 7
    //   319: invokestatic 100	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   322: aastore
    //   323: dup
    //   324: iconst_2
    //   325: aload_2
    //   326: aastore
    //   327: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   330: aload 4
    //   332: astore_1
    //   333: aload 4
    //   335: astore 6
    //   337: aload 4
    //   339: invokevirtual 140	java/nio/channels/FileChannel:close	()V
    //   342: aload 4
    //   344: astore_1
    //   345: aload 4
    //   347: astore 6
    //   349: aload_0
    //   350: invokevirtual 141	java/io/FileInputStream:close	()V
    //   353: aconst_null
    //   354: astore_0
    //   355: sipush 16005
    //   358: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   361: goto -340 -> 21
    //   364: iconst_0
    //   365: istore_3
    //   366: aload 4
    //   368: astore_1
    //   369: aload 4
    //   371: astore 6
    //   373: ldc 78
    //   375: ldc 143
    //   377: iconst_3
    //   378: anewarray 4	java/lang/Object
    //   381: dup
    //   382: iconst_0
    //   383: iload 7
    //   385: invokestatic 100	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   388: aastore
    //   389: dup
    //   390: iconst_1
    //   391: iload_3
    //   392: invokestatic 148	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   395: aastore
    //   396: dup
    //   397: iconst_2
    //   398: aload_2
    //   399: aastore
    //   400: invokestatic 151	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   403: aload 4
    //   405: astore_1
    //   406: aload 4
    //   408: astore 6
    //   410: aload 4
    //   412: invokevirtual 140	java/nio/channels/FileChannel:close	()V
    //   415: aload_0
    //   416: astore 4
    //   418: aload_0
    //   419: astore 6
    //   421: aload_0
    //   422: invokevirtual 141	java/io/FileInputStream:close	()V
    //   425: aconst_null
    //   426: astore 5
    //   428: aconst_null
    //   429: astore_0
    //   430: aload_0
    //   431: astore 4
    //   433: aload 5
    //   435: astore 6
    //   437: bipush 96
    //   439: bipush 96
    //   441: getstatic 157	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   444: invokestatic 163	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   447: astore_1
    //   448: aload_0
    //   449: astore 4
    //   451: aload 5
    //   453: astore 6
    //   455: aload_1
    //   456: aload 8
    //   458: invokevirtual 167	android/graphics/Bitmap:copyPixelsFromBuffer	(Ljava/nio/Buffer;)V
    //   461: iload_3
    //   462: ifeq +72 -> 534
    //   465: aload_0
    //   466: astore 4
    //   468: aload 5
    //   470: astore 6
    //   472: aload_1
    //   473: bipush 9
    //   475: bipush 9
    //   477: bipush 78
    //   479: bipush 78
    //   481: invokestatic 170	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   484: astore 8
    //   486: aload_0
    //   487: astore 4
    //   489: aload 5
    //   491: astore 6
    //   493: ldc 78
    //   495: ldc 172
    //   497: iconst_1
    //   498: anewarray 4	java/lang/Object
    //   501: dup
    //   502: iconst_0
    //   503: aload_1
    //   504: invokevirtual 173	java/lang/Object:toString	()Ljava/lang/String;
    //   507: aastore
    //   508: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   511: aload_0
    //   512: astore 4
    //   514: aload 5
    //   516: astore 6
    //   518: aload_1
    //   519: invokevirtual 178	android/graphics/Bitmap:recycle	()V
    //   522: sipush 16005
    //   525: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   528: aload 8
    //   530: astore_0
    //   531: goto -510 -> 21
    //   534: sipush 16005
    //   537: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   540: aload_1
    //   541: astore_0
    //   542: goto -521 -> 21
    //   545: astore 4
    //   547: aconst_null
    //   548: astore_0
    //   549: ldc 78
    //   551: ldc 180
    //   553: iconst_2
    //   554: anewarray 4	java/lang/Object
    //   557: dup
    //   558: iconst_0
    //   559: aload 4
    //   561: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   564: aastore
    //   565: dup
    //   566: iconst_1
    //   567: aload_2
    //   568: aastore
    //   569: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   572: aload_1
    //   573: ifnull +7 -> 580
    //   576: aload_1
    //   577: invokevirtual 140	java/nio/channels/FileChannel:close	()V
    //   580: aload_0
    //   581: ifnull +7 -> 588
    //   584: aload_0
    //   585: invokevirtual 141	java/io/FileInputStream:close	()V
    //   588: aconst_null
    //   589: astore_0
    //   590: sipush 16005
    //   593: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   596: goto -575 -> 21
    //   599: astore 6
    //   601: aconst_null
    //   602: astore_0
    //   603: aload 4
    //   605: astore_1
    //   606: ldc 78
    //   608: ldc 185
    //   610: iconst_2
    //   611: anewarray 4	java/lang/Object
    //   614: dup
    //   615: iconst_0
    //   616: aload 6
    //   618: invokevirtual 186	java/lang/OutOfMemoryError:getMessage	()Ljava/lang/String;
    //   621: aastore
    //   622: dup
    //   623: iconst_1
    //   624: aload_2
    //   625: aastore
    //   626: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   629: goto -57 -> 572
    //   632: astore_0
    //   633: goto -45 -> 588
    //   636: astore 6
    //   638: goto -32 -> 606
    //   641: astore 6
    //   643: aconst_null
    //   644: astore_1
    //   645: aload 4
    //   647: astore_0
    //   648: goto -42 -> 606
    //   651: astore 4
    //   653: aload 6
    //   655: astore_1
    //   656: goto -107 -> 549
    //   659: astore 4
    //   661: aconst_null
    //   662: astore_1
    //   663: aload 6
    //   665: astore_0
    //   666: goto -117 -> 549
    //
    // Exception table:
    //   from	to	target	type
    //   71	102	545	java/lang/Exception
    //   113	120	545	java/lang/Exception
    //   139	162	545	java/lang/Exception
    //   173	182	545	java/lang/Exception
    //   71	102	599	java/lang/OutOfMemoryError
    //   113	120	599	java/lang/OutOfMemoryError
    //   139	162	599	java/lang/OutOfMemoryError
    //   173	182	599	java/lang/OutOfMemoryError
    //   576	580	632	java/lang/Exception
    //   584	588	632	java/lang/Exception
    //   185	191	636	java/lang/OutOfMemoryError
    //   198	205	636	java/lang/OutOfMemoryError
    //   212	220	636	java/lang/OutOfMemoryError
    //   227	234	636	java/lang/OutOfMemoryError
    //   248	255	636	java/lang/OutOfMemoryError
    //   262	270	636	java/lang/OutOfMemoryError
    //   277	285	636	java/lang/OutOfMemoryError
    //   299	330	636	java/lang/OutOfMemoryError
    //   337	342	636	java/lang/OutOfMemoryError
    //   349	353	636	java/lang/OutOfMemoryError
    //   373	403	636	java/lang/OutOfMemoryError
    //   410	415	636	java/lang/OutOfMemoryError
    //   421	425	641	java/lang/OutOfMemoryError
    //   437	448	641	java/lang/OutOfMemoryError
    //   455	461	641	java/lang/OutOfMemoryError
    //   472	486	641	java/lang/OutOfMemoryError
    //   493	511	641	java/lang/OutOfMemoryError
    //   518	522	641	java/lang/OutOfMemoryError
    //   185	191	651	java/lang/Exception
    //   198	205	651	java/lang/Exception
    //   212	220	651	java/lang/Exception
    //   227	234	651	java/lang/Exception
    //   248	255	651	java/lang/Exception
    //   262	270	651	java/lang/Exception
    //   277	285	651	java/lang/Exception
    //   299	330	651	java/lang/Exception
    //   337	342	651	java/lang/Exception
    //   349	353	651	java/lang/Exception
    //   373	403	651	java/lang/Exception
    //   410	415	651	java/lang/Exception
    //   421	425	659	java/lang/Exception
    //   437	448	659	java/lang/Exception
    //   455	461	659	java/lang/Exception
    //   472	486	659	java/lang/Exception
    //   493	511	659	java/lang/Exception
    //   518	522	659	java/lang/Exception
  }

  public static Bitmap a(Context paramContext, Bitmap paramBitmap)
  {
    AppMethodBeat.i(16004);
    if ((paramContext == null) || (paramBitmap == null))
    {
      paramBitmap = null;
      AppMethodBeat.o(16004);
    }
    while (true)
    {
      return paramBitmap;
      if (Build.VERSION.SDK_INT >= 11)
      {
        int i = paramContext.getResources().getDimensionPixelSize(17104902) - paramContext.getResources().getDimensionPixelSize(2131428549);
        paramBitmap = d.a(d.a(paramBitmap, i, i, false, false), false, paramContext.getResources().getDimensionPixelSize(2131428548));
        AppMethodBeat.o(16004);
      }
      else
      {
        AppMethodBeat.o(16004);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.a
 * JD-Core Version:    0.6.2
 */