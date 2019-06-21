package com.tencent.mm.plugin.scanner.util;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.licence.model.LibCardRecog;
import com.tencent.mm.sdk.platformtools.ab;

public final class k extends b
{
  private final Object lock;
  private final int nsd;
  private boolean[] qhL;
  private boolean qhM;
  private boolean qhO;
  private Bitmap qiq;
  public Bitmap qir;

  public k(b.a parama, int paramInt)
  {
    super(parama);
    AppMethodBeat.i(81457);
    this.lock = new Object();
    this.qhM = false;
    this.qhO = false;
    this.qhL = new boolean[4];
    this.nsd = paramInt;
    AppMethodBeat.o(81457);
  }

  private static void cii()
  {
    AppMethodBeat.i(81460);
    ab.i("MicroMsg.ScanLicenceDecoder", "lib release");
    try
    {
      LibCardRecog.recognizeCardRelease();
      AppMethodBeat.o(81460);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ScanLicenceDecoder", "lib release, exp = %s", new Object[] { localException });
        AppMethodBeat.o(81460);
      }
    }
  }

  // ERROR //
  public final boolean a(byte[] paramArrayOfByte, android.graphics.Point paramPoint, android.graphics.Rect paramRect)
  {
    // Byte code:
    //   0: ldc 75
    //   2: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 53
    //   7: ldc 77
    //   9: iconst_3
    //   10: anewarray 30	java/lang/Object
    //   13: dup
    //   14: iconst_0
    //   15: aload_2
    //   16: aastore
    //   17: dup
    //   18: iconst_1
    //   19: aload_3
    //   20: aastore
    //   21: dup
    //   22: iconst_2
    //   23: aload_1
    //   24: arraylength
    //   25: invokestatic 83	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   28: aastore
    //   29: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   32: aload_0
    //   33: getfield 35	com/tencent/mm/plugin/scanner/util/k:lock	Ljava/lang/Object;
    //   36: astore 4
    //   38: aload 4
    //   40: monitorenter
    //   41: aload_0
    //   42: getfield 88	com/tencent/mm/plugin/scanner/util/k:qiq	Landroid/graphics/Bitmap;
    //   45: ifnull +41 -> 86
    //   48: aload_0
    //   49: getfield 88	com/tencent/mm/plugin/scanner/util/k:qiq	Landroid/graphics/Bitmap;
    //   52: invokevirtual 94	android/graphics/Bitmap:isRecycled	()Z
    //   55: ifne +31 -> 86
    //   58: ldc 53
    //   60: ldc 96
    //   62: iconst_1
    //   63: anewarray 30	java/lang/Object
    //   66: dup
    //   67: iconst_0
    //   68: aload_0
    //   69: getfield 88	com/tencent/mm/plugin/scanner/util/k:qiq	Landroid/graphics/Bitmap;
    //   72: invokevirtual 100	java/lang/Object:toString	()Ljava/lang/String;
    //   75: aastore
    //   76: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   79: aload_0
    //   80: getfield 88	com/tencent/mm/plugin/scanner/util/k:qiq	Landroid/graphics/Bitmap;
    //   83: invokevirtual 105	android/graphics/Bitmap:recycle	()V
    //   86: ldc 53
    //   88: ldc 107
    //   90: iconst_2
    //   91: anewarray 30	java/lang/Object
    //   94: dup
    //   95: iconst_0
    //   96: aload_2
    //   97: aastore
    //   98: dup
    //   99: iconst_1
    //   100: aload_3
    //   101: aastore
    //   102: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: aload_0
    //   106: getfield 37	com/tencent/mm/plugin/scanner/util/k:qhM	Z
    //   109: ifeq +24 -> 133
    //   112: ldc 53
    //   114: ldc 109
    //   116: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   119: iconst_0
    //   120: istore 5
    //   122: aload 4
    //   124: monitorexit
    //   125: ldc 75
    //   127: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: iload 5
    //   132: ireturn
    //   133: iconst_0
    //   134: istore 6
    //   136: iload 6
    //   138: iconst_4
    //   139: if_icmpge +17 -> 156
    //   142: aload_0
    //   143: getfield 41	com/tencent/mm/plugin/scanner/util/k:qhL	[Z
    //   146: iload 6
    //   148: iconst_0
    //   149: bastore
    //   150: iinc 6 1
    //   153: goto -17 -> 136
    //   156: aload_2
    //   157: getfield 116	android/graphics/Point:x	I
    //   160: i2f
    //   161: aload_3
    //   162: invokevirtual 121	android/graphics/Rect:width	()I
    //   165: i2f
    //   166: fdiv
    //   167: aload_2
    //   168: getfield 124	android/graphics/Point:y	I
    //   171: i2f
    //   172: aload_3
    //   173: invokevirtual 127	android/graphics/Rect:height	()I
    //   176: i2f
    //   177: fdiv
    //   178: invokestatic 133	java/lang/Math:min	(FF)F
    //   181: fconst_1
    //   182: invokestatic 133	java/lang/Math:min	(FF)F
    //   185: fstore 7
    //   187: aload_3
    //   188: invokevirtual 121	android/graphics/Rect:width	()I
    //   191: istore 8
    //   193: aload_3
    //   194: invokevirtual 127	android/graphics/Rect:height	()I
    //   197: istore 9
    //   199: ldc 53
    //   201: ldc 135
    //   203: iconst_3
    //   204: anewarray 30	java/lang/Object
    //   207: dup
    //   208: iconst_0
    //   209: fload 7
    //   211: invokestatic 140	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   214: aastore
    //   215: dup
    //   216: iconst_1
    //   217: iload 8
    //   219: invokestatic 83	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   222: aastore
    //   223: dup
    //   224: iconst_2
    //   225: iload 9
    //   227: invokestatic 83	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   230: aastore
    //   231: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: aload_0
    //   235: getfield 39	com/tencent/mm/plugin/scanner/util/k:qhO	Z
    //   238: ifne +67 -> 305
    //   241: ldc 53
    //   243: ldc 142
    //   245: iconst_4
    //   246: anewarray 30	java/lang/Object
    //   249: dup
    //   250: iconst_0
    //   251: iload 8
    //   253: invokestatic 83	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   256: aastore
    //   257: dup
    //   258: iconst_1
    //   259: iload 9
    //   261: invokestatic 83	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   264: aastore
    //   265: dup
    //   266: iconst_2
    //   267: aload_3
    //   268: invokevirtual 121	android/graphics/Rect:width	()I
    //   271: invokestatic 83	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   274: aastore
    //   275: dup
    //   276: iconst_3
    //   277: aload_3
    //   278: invokevirtual 127	android/graphics/Rect:height	()I
    //   281: invokestatic 83	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   284: aastore
    //   285: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: iload 8
    //   290: iload 9
    //   292: aload_0
    //   293: getfield 43	com/tencent/mm/plugin/scanner/util/k:nsd	I
    //   296: invokestatic 146	com/tencent/mm/plugin/licence/model/LibCardRecog:recognizeCardInit	(III)I
    //   299: pop
    //   300: aload_0
    //   301: iconst_1
    //   302: putfield 39	com/tencent/mm/plugin/scanner/util/k:qhO	Z
    //   305: invokestatic 152	java/lang/System:currentTimeMillis	()J
    //   308: lstore 10
    //   310: new 154	com/tencent/mm/plugin/licence/model/CardInfo
    //   313: astore 12
    //   315: aload 12
    //   317: iload 8
    //   319: iload 9
    //   321: invokespecial 157	com/tencent/mm/plugin/licence/model/CardInfo:<init>	(II)V
    //   324: aload_3
    //   325: getfield 160	android/graphics/Rect:top	I
    //   328: istore 13
    //   330: aload_3
    //   331: getfield 163	android/graphics/Rect:left	I
    //   334: istore 6
    //   336: aload_1
    //   337: aload_2
    //   338: getfield 124	android/graphics/Point:y	I
    //   341: aload_2
    //   342: getfield 116	android/graphics/Point:x	I
    //   345: iload 6
    //   347: iload 13
    //   349: iload 9
    //   351: iload 8
    //   353: aload 12
    //   355: aload_0
    //   356: getfield 41	com/tencent/mm/plugin/scanner/util/k:qhL	[Z
    //   359: invokestatic 167	com/tencent/mm/plugin/licence/model/LibCardRecog:recognizeCardProcess	([BIIIIIILcom/tencent/mm/plugin/licence/model/CardInfo;[Z)I
    //   362: istore 6
    //   364: ldc 53
    //   366: ldc 169
    //   368: iconst_1
    //   369: anewarray 30	java/lang/Object
    //   372: dup
    //   373: iconst_0
    //   374: iload 6
    //   376: invokestatic 83	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   379: aastore
    //   380: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   383: new 171	java/lang/StringBuilder
    //   386: astore_1
    //   387: aload_1
    //   388: ldc 173
    //   390: invokespecial 176	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   393: ldc 53
    //   395: aload_1
    //   396: invokestatic 152	java/lang/System:currentTimeMillis	()J
    //   399: lload 10
    //   401: lsub
    //   402: invokevirtual 180	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   405: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   408: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   411: ldc 53
    //   413: ldc 183
    //   415: iconst_1
    //   416: anewarray 30	java/lang/Object
    //   419: dup
    //   420: iconst_0
    //   421: aload_0
    //   422: getfield 41	com/tencent/mm/plugin/scanner/util/k:qhL	[Z
    //   425: invokestatic 188	java/util/Arrays:toString	([Z)Ljava/lang/String;
    //   428: aastore
    //   429: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   432: iload 6
    //   434: ifne +90 -> 524
    //   437: iconst_0
    //   438: istore 5
    //   440: aload 4
    //   442: monitorexit
    //   443: ldc 75
    //   445: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   448: goto -318 -> 130
    //   451: astore_1
    //   452: ldc 53
    //   454: ldc 190
    //   456: iconst_1
    //   457: anewarray 30	java/lang/Object
    //   460: dup
    //   461: iconst_0
    //   462: aload_1
    //   463: aastore
    //   464: invokestatic 72	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   467: aload_0
    //   468: iconst_0
    //   469: putfield 39	com/tencent/mm/plugin/scanner/util/k:qhO	Z
    //   472: invokestatic 192	com/tencent/mm/plugin/scanner/util/k:cii	()V
    //   475: iconst_0
    //   476: istore 5
    //   478: aload 4
    //   480: monitorexit
    //   481: ldc 75
    //   483: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   486: goto -356 -> 130
    //   489: astore_1
    //   490: ldc 53
    //   492: ldc 194
    //   494: iconst_1
    //   495: anewarray 30	java/lang/Object
    //   498: dup
    //   499: iconst_0
    //   500: aload_1
    //   501: aastore
    //   502: invokestatic 72	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   505: aload_0
    //   506: iconst_0
    //   507: putfield 37	com/tencent/mm/plugin/scanner/util/k:qhM	Z
    //   510: iconst_0
    //   511: istore 5
    //   513: aload 4
    //   515: monitorexit
    //   516: ldc 75
    //   518: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   521: goto -391 -> 130
    //   524: iconst_1
    //   525: iload 6
    //   527: if_icmpeq +47 -> 574
    //   530: iconst_0
    //   531: istore 6
    //   533: iload 6
    //   535: iconst_4
    //   536: if_icmpge +17 -> 553
    //   539: aload_0
    //   540: getfield 41	com/tencent/mm/plugin/scanner/util/k:qhL	[Z
    //   543: iload 6
    //   545: iconst_0
    //   546: bastore
    //   547: iinc 6 1
    //   550: goto -17 -> 533
    //   553: ldc 53
    //   555: ldc 196
    //   557: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   560: iconst_0
    //   561: istore 5
    //   563: aload 4
    //   565: monitorexit
    //   566: ldc 75
    //   568: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   571: goto -441 -> 130
    //   574: iconst_0
    //   575: istore 6
    //   577: iload 6
    //   579: iconst_4
    //   580: if_icmpge +17 -> 597
    //   583: aload_0
    //   584: getfield 41	com/tencent/mm/plugin/scanner/util/k:qhL	[Z
    //   587: iload 6
    //   589: iconst_1
    //   590: bastore
    //   591: iinc 6 1
    //   594: goto -17 -> 577
    //   597: aload_0
    //   598: aload 12
    //   600: getfield 200	com/tencent/mm/plugin/licence/model/CardInfo:bitmapData	[B
    //   603: iconst_0
    //   604: aload 12
    //   606: getfield 203	com/tencent/mm/plugin/licence/model/CardInfo:bitmapLen	I
    //   609: invokestatic 209	android/graphics/BitmapFactory:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   612: putfield 88	com/tencent/mm/plugin/scanner/util/k:qiq	Landroid/graphics/Bitmap;
    //   615: aload_0
    //   616: aload_0
    //   617: getfield 88	com/tencent/mm/plugin/scanner/util/k:qiq	Landroid/graphics/Bitmap;
    //   620: getstatic 215	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   623: iconst_1
    //   624: invokevirtual 219	android/graphics/Bitmap:copy	(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;
    //   627: putfield 221	com/tencent/mm/plugin/scanner/util/k:qir	Landroid/graphics/Bitmap;
    //   630: aload_0
    //   631: iconst_1
    //   632: putfield 37	com/tencent/mm/plugin/scanner/util/k:qhM	Z
    //   635: iconst_1
    //   636: istore 5
    //   638: aload 4
    //   640: monitorexit
    //   641: ldc 75
    //   643: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   646: goto -516 -> 130
    //   649: astore_1
    //   650: aload 4
    //   652: monitorexit
    //   653: ldc 75
    //   655: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   658: aload_1
    //   659: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   288	305	451	java/lang/Exception
    //   336	364	489	java/lang/Exception
    //   41	86	649	finally
    //   86	119	649	finally
    //   122	125	649	finally
    //   142	150	649	finally
    //   156	288	649	finally
    //   288	305	649	finally
    //   305	336	649	finally
    //   336	364	649	finally
    //   364	432	649	finally
    //   440	443	649	finally
    //   452	475	649	finally
    //   478	481	649	finally
    //   490	510	649	finally
    //   513	516	649	finally
    //   539	547	649	finally
    //   553	560	649	finally
    //   563	566	649	finally
    //   583	591	649	finally
    //   597	635	649	finally
    //   638	641	649	finally
    //   650	653	649	finally
  }

  public final void chP()
  {
    this.qhM = false;
  }

  public final boolean[] cih()
  {
    synchronized (this.lock)
    {
      boolean[] arrayOfBoolean = this.qhL;
      return arrayOfBoolean;
    }
  }

  public final void sI()
  {
    AppMethodBeat.i(81459);
    if ((this.qiq != null) && (!this.qiq.isRecycled()))
    {
      ab.i("MicroMsg.ScanLicenceDecoder", "bitmap recycle %s", new Object[] { this.qiq.toString() });
      this.qiq.recycle();
    }
    cii();
    AppMethodBeat.o(81459);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.k
 * JD-Core Version:    0.6.2
 */