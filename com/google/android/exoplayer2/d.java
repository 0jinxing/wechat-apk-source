package com.google.android.exoplayer2;

import android.content.Context;
import com.google.android.exoplayer2.drm.b;

public final class d
  implements u
{
  private final b<com.google.android.exoplayer2.drm.d> aMJ;
  private final int aMK;
  private final long aML;
  private final Context context;

  public d(Context paramContext)
  {
    this(paramContext, (byte)0);
  }

  private d(Context paramContext, byte paramByte)
  {
    this(paramContext, '\000');
  }

  private d(Context paramContext, char paramChar)
  {
    this(paramContext, (short)0);
  }

  private d(Context paramContext, short paramShort)
  {
    this.context = paramContext;
    this.aMJ = null;
    this.aMK = 0;
    this.aML = 5000L;
  }

  // ERROR //
  public final r[] a(android.os.Handler paramHandler, com.google.android.exoplayer2.video.e parame, com.google.android.exoplayer2.a.e parame1, com.google.android.exoplayer2.f.j.a parama, com.google.android.exoplayer2.metadata.e.a parama1)
  {
    // Byte code:
    //   0: ldc 48
    //   2: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 56	java/util/ArrayList
    //   8: dup
    //   9: invokespecial 57	java/util/ArrayList:<init>	()V
    //   12: astore 6
    //   14: aload_0
    //   15: getfield 33	com/google/android/exoplayer2/d:context	Landroid/content/Context;
    //   18: astore 7
    //   20: aload_0
    //   21: getfield 35	com/google/android/exoplayer2/d:aMJ	Lcom/google/android/exoplayer2/drm/b;
    //   24: astore 8
    //   26: aload_0
    //   27: getfield 41	com/google/android/exoplayer2/d:aML	J
    //   30: lstore 9
    //   32: aload_0
    //   33: getfield 37	com/google/android/exoplayer2/d:aMK	I
    //   36: istore 11
    //   38: aload 6
    //   40: new 59	com/google/android/exoplayer2/video/c
    //   43: dup
    //   44: aload 7
    //   46: getstatic 65	com/google/android/exoplayer2/e/c:beM	Lcom/google/android/exoplayer2/e/c;
    //   49: lload 9
    //   51: aload 8
    //   53: aload_1
    //   54: aload_2
    //   55: invokespecial 68	com/google/android/exoplayer2/video/c:<init>	(Landroid/content/Context;Lcom/google/android/exoplayer2/e/c;JLcom/google/android/exoplayer2/drm/b;Landroid/os/Handler;Lcom/google/android/exoplayer2/video/e;)V
    //   58: invokevirtual 72	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   61: pop
    //   62: iload 11
    //   64: ifeq +106 -> 170
    //   67: aload 6
    //   69: invokevirtual 76	java/util/ArrayList:size	()I
    //   72: istore 12
    //   74: iload 11
    //   76: iconst_2
    //   77: if_icmpne +532 -> 609
    //   80: iinc 12 255
    //   83: aload 6
    //   85: iload 12
    //   87: ldc 78
    //   89: invokestatic 84	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   92: iconst_5
    //   93: anewarray 80	java/lang/Class
    //   96: dup
    //   97: iconst_0
    //   98: getstatic 90	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   101: aastore
    //   102: dup
    //   103: iconst_1
    //   104: getstatic 93	java/lang/Long:TYPE	Ljava/lang/Class;
    //   107: aastore
    //   108: dup
    //   109: iconst_2
    //   110: ldc 95
    //   112: aastore
    //   113: dup
    //   114: iconst_3
    //   115: ldc 97
    //   117: aastore
    //   118: dup
    //   119: iconst_4
    //   120: getstatic 100	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   123: aastore
    //   124: invokevirtual 104	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   127: iconst_5
    //   128: anewarray 4	java/lang/Object
    //   131: dup
    //   132: iconst_0
    //   133: getstatic 108	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   136: aastore
    //   137: dup
    //   138: iconst_1
    //   139: lload 9
    //   141: invokestatic 112	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   144: aastore
    //   145: dup
    //   146: iconst_2
    //   147: aload_1
    //   148: aastore
    //   149: dup
    //   150: iconst_3
    //   151: aload_2
    //   152: aastore
    //   153: dup
    //   154: iconst_4
    //   155: bipush 50
    //   157: invokestatic 115	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   160: aastore
    //   161: invokevirtual 121	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   164: checkcast 123	com/google/android/exoplayer2/r
    //   167: invokevirtual 126	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   170: aload_0
    //   171: getfield 33	com/google/android/exoplayer2/d:context	Landroid/content/Context;
    //   174: astore 8
    //   176: aload_0
    //   177: getfield 35	com/google/android/exoplayer2/d:aMJ	Lcom/google/android/exoplayer2/drm/b;
    //   180: astore 7
    //   182: iconst_0
    //   183: anewarray 128	com/google/android/exoplayer2/a/d
    //   186: astore_2
    //   187: aload_0
    //   188: getfield 37	com/google/android/exoplayer2/d:aMK	I
    //   191: istore 13
    //   193: aload 6
    //   195: new 130	com/google/android/exoplayer2/a/i
    //   198: dup
    //   199: getstatic 65	com/google/android/exoplayer2/e/c:beM	Lcom/google/android/exoplayer2/e/c;
    //   202: aload 7
    //   204: aload_1
    //   205: aload_3
    //   206: aload 8
    //   208: invokestatic 136	com/google/android/exoplayer2/a/c:ai	(Landroid/content/Context;)Lcom/google/android/exoplayer2/a/c;
    //   211: aload_2
    //   212: invokespecial 139	com/google/android/exoplayer2/a/i:<init>	(Lcom/google/android/exoplayer2/e/c;Lcom/google/android/exoplayer2/drm/b;Landroid/os/Handler;Lcom/google/android/exoplayer2/a/e;Lcom/google/android/exoplayer2/a/c;[Lcom/google/android/exoplayer2/a/d;)V
    //   215: invokevirtual 72	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   218: pop
    //   219: iload 13
    //   221: ifeq +222 -> 443
    //   224: aload 6
    //   226: invokevirtual 76	java/util/ArrayList:size	()I
    //   229: istore 11
    //   231: iload 11
    //   233: istore 12
    //   235: iload 13
    //   237: iconst_2
    //   238: if_icmpne +9 -> 247
    //   241: iload 11
    //   243: iconst_1
    //   244: isub
    //   245: istore 12
    //   247: ldc 141
    //   249: invokestatic 84	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   252: iconst_3
    //   253: anewarray 80	java/lang/Class
    //   256: dup
    //   257: iconst_0
    //   258: ldc 95
    //   260: aastore
    //   261: dup
    //   262: iconst_1
    //   263: ldc 143
    //   265: aastore
    //   266: dup
    //   267: iconst_2
    //   268: ldc 145
    //   270: aastore
    //   271: invokevirtual 104	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   274: iconst_3
    //   275: anewarray 4	java/lang/Object
    //   278: dup
    //   279: iconst_0
    //   280: aload_1
    //   281: aastore
    //   282: dup
    //   283: iconst_1
    //   284: aload_3
    //   285: aastore
    //   286: dup
    //   287: iconst_2
    //   288: aload_2
    //   289: aastore
    //   290: invokevirtual 121	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   293: checkcast 123	com/google/android/exoplayer2/r
    //   296: astore 7
    //   298: iload 12
    //   300: iconst_1
    //   301: iadd
    //   302: istore 11
    //   304: aload 6
    //   306: iload 12
    //   308: aload 7
    //   310: invokevirtual 126	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   313: iload 11
    //   315: istore 12
    //   317: ldc 147
    //   319: invokestatic 84	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   322: iconst_3
    //   323: anewarray 80	java/lang/Class
    //   326: dup
    //   327: iconst_0
    //   328: ldc 95
    //   330: aastore
    //   331: dup
    //   332: iconst_1
    //   333: ldc 143
    //   335: aastore
    //   336: dup
    //   337: iconst_2
    //   338: ldc 145
    //   340: aastore
    //   341: invokevirtual 104	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   344: iconst_3
    //   345: anewarray 4	java/lang/Object
    //   348: dup
    //   349: iconst_0
    //   350: aload_1
    //   351: aastore
    //   352: dup
    //   353: iconst_1
    //   354: aload_3
    //   355: aastore
    //   356: dup
    //   357: iconst_2
    //   358: aload_2
    //   359: aastore
    //   360: invokevirtual 121	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   363: checkcast 123	com/google/android/exoplayer2/r
    //   366: astore 7
    //   368: iload 12
    //   370: iconst_1
    //   371: iadd
    //   372: istore 11
    //   374: aload 6
    //   376: iload 12
    //   378: aload 7
    //   380: invokevirtual 126	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   383: iload 11
    //   385: istore 12
    //   387: aload 6
    //   389: iload 12
    //   391: ldc 149
    //   393: invokestatic 84	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   396: iconst_3
    //   397: anewarray 80	java/lang/Class
    //   400: dup
    //   401: iconst_0
    //   402: ldc 95
    //   404: aastore
    //   405: dup
    //   406: iconst_1
    //   407: ldc 143
    //   409: aastore
    //   410: dup
    //   411: iconst_2
    //   412: ldc 145
    //   414: aastore
    //   415: invokevirtual 104	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   418: iconst_3
    //   419: anewarray 4	java/lang/Object
    //   422: dup
    //   423: iconst_0
    //   424: aload_1
    //   425: aastore
    //   426: dup
    //   427: iconst_1
    //   428: aload_3
    //   429: aastore
    //   430: dup
    //   431: iconst_2
    //   432: aload_2
    //   433: aastore
    //   434: invokevirtual 121	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   437: checkcast 123	com/google/android/exoplayer2/r
    //   440: invokevirtual 126	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   443: aload 6
    //   445: new 151	com/google/android/exoplayer2/f/j
    //   448: dup
    //   449: aload 4
    //   451: aload_1
    //   452: invokevirtual 155	android/os/Handler:getLooper	()Landroid/os/Looper;
    //   455: invokespecial 158	com/google/android/exoplayer2/f/j:<init>	(Lcom/google/android/exoplayer2/f/j$a;Landroid/os/Looper;)V
    //   458: invokevirtual 72	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   461: pop
    //   462: aload 6
    //   464: new 160	com/google/android/exoplayer2/metadata/e
    //   467: dup
    //   468: aload 5
    //   470: aload_1
    //   471: invokevirtual 155	android/os/Handler:getLooper	()Landroid/os/Looper;
    //   474: invokespecial 163	com/google/android/exoplayer2/metadata/e:<init>	(Lcom/google/android/exoplayer2/metadata/e$a;Landroid/os/Looper;)V
    //   477: invokevirtual 72	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   480: pop
    //   481: aload 6
    //   483: aload 6
    //   485: invokevirtual 76	java/util/ArrayList:size	()I
    //   488: anewarray 123	com/google/android/exoplayer2/r
    //   491: invokevirtual 167	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   494: checkcast 169	[Lcom/google/android/exoplayer2/r;
    //   497: astore_1
    //   498: ldc 48
    //   500: invokestatic 172	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   503: aload_1
    //   504: areturn
    //   505: astore_1
    //   506: new 174	java/lang/RuntimeException
    //   509: dup
    //   510: aload_1
    //   511: invokespecial 177	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   514: astore_1
    //   515: ldc 48
    //   517: invokestatic 172	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   520: aload_1
    //   521: athrow
    //   522: astore 7
    //   524: goto -207 -> 317
    //   527: astore_1
    //   528: new 174	java/lang/RuntimeException
    //   531: dup
    //   532: aload_1
    //   533: invokespecial 177	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   536: astore_1
    //   537: ldc 48
    //   539: invokestatic 172	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   542: aload_1
    //   543: athrow
    //   544: astore 7
    //   546: goto -159 -> 387
    //   549: astore_1
    //   550: new 174	java/lang/RuntimeException
    //   553: dup
    //   554: aload_1
    //   555: invokespecial 177	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   558: astore_1
    //   559: ldc 48
    //   561: invokestatic 172	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   564: aload_1
    //   565: athrow
    //   566: astore_1
    //   567: new 174	java/lang/RuntimeException
    //   570: dup
    //   571: aload_1
    //   572: invokespecial 177	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   575: astore_1
    //   576: ldc 48
    //   578: invokestatic 172	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   581: aload_1
    //   582: athrow
    //   583: astore_2
    //   584: goto -141 -> 443
    //   587: astore 7
    //   589: iload 11
    //   591: istore 12
    //   593: goto -47 -> 546
    //   596: astore 7
    //   598: iload 11
    //   600: istore 12
    //   602: goto -78 -> 524
    //   605: astore_2
    //   606: goto -436 -> 170
    //   609: goto -526 -> 83
    //
    // Exception table:
    //   from	to	target	type
    //   83	170	505	java/lang/Exception
    //   247	298	522	java/lang/ClassNotFoundException
    //   247	298	527	java/lang/Exception
    //   304	313	527	java/lang/Exception
    //   317	368	544	java/lang/ClassNotFoundException
    //   317	368	549	java/lang/Exception
    //   374	383	549	java/lang/Exception
    //   387	443	566	java/lang/Exception
    //   387	443	583	java/lang/ClassNotFoundException
    //   374	383	587	java/lang/ClassNotFoundException
    //   304	313	596	java/lang/ClassNotFoundException
    //   83	170	605	java/lang/ClassNotFoundException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.d
 * JD-Core Version:    0.6.2
 */