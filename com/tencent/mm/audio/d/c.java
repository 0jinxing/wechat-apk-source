package com.tencent.mm.audio.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.g.a;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.modelvoice.MediaRecorder;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class c
  implements a
{
  private static a.a crz;
  public BlockingQueue<g.a> crn;
  public boolean cro;
  private String crp;
  private int crq;
  private byte[] crr;
  private int crs;
  private Object crt;
  public c.a cru;
  private boolean crv;
  private OutputStream crw;
  private int crx;
  private boolean cry;
  private int mSampleRate;

  static
  {
    AppMethodBeat.i(55773);
    crz = new a.a();
    AppMethodBeat.o(55773);
  }

  public c(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55766);
    this.crn = new ArrayBlockingQueue(1024);
    this.cro = false;
    this.crq = 0;
    this.crr = null;
    this.mSampleRate = 16000;
    this.crs = 16000;
    this.crt = new Object();
    this.cru = null;
    this.crv = false;
    this.cry = false;
    this.mSampleRate = paramInt1;
    this.crs = paramInt2;
    AppMethodBeat.o(55766);
  }

  private void Fh()
  {
    AppMethodBeat.i(55769);
    synchronized (this.crt)
    {
      MediaRecorder.SilkEncUnInit();
      ab.i("MicroMsg.SilkWriter", "finish Thread file:" + this.crp);
      if (this.crw == null);
    }
    try
    {
      this.crw.close();
      this.crw = null;
      AppMethodBeat.o(55769);
      return;
      localObject2 = finally;
      AppMethodBeat.o(55769);
      throw localObject2;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.SilkWriter", "close silk file:" + this.crp + "msg:" + localException.getMessage());
    }
  }

  // ERROR //
  public final void Fe()
  {
    // Byte code:
    //   0: ldc 144
    //   2: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 91
    //   7: ldc 146
    //   9: invokestatic 113	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 63	com/tencent/mm/audio/d/c:cro	Z
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_0
    //   22: getfield 75	com/tencent/mm/audio/d/c:cru	Lcom/tencent/mm/audio/d/c$a;
    //   25: ifnull +15 -> 40
    //   28: getstatic 152	com/tencent/mm/sdk/g/d:xDG	Lcom/tencent/mm/sdk/g/a/e;
    //   31: aload_0
    //   32: getfield 75	com/tencent/mm/audio/d/c:cru	Lcom/tencent/mm/audio/d/c$a;
    //   35: invokeinterface 158 2 0
    //   40: aload_0
    //   41: invokespecial 160	com/tencent/mm/audio/d/c:Fh	()V
    //   44: ldc 144
    //   46: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   49: return
    //   50: astore_1
    //   51: aload_0
    //   52: monitorexit
    //   53: ldc 144
    //   55: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: aload_1
    //   59: athrow
    //   60: astore_1
    //   61: ldc 91
    //   63: ldc 162
    //   65: iconst_1
    //   66: anewarray 4	java/lang/Object
    //   69: dup
    //   70: iconst_0
    //   71: aload_1
    //   72: invokestatic 168	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   75: aastore
    //   76: invokestatic 171	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   79: goto -39 -> 40
    //   82: astore_1
    //   83: ldc 91
    //   85: ldc 162
    //   87: iconst_1
    //   88: anewarray 4	java/lang/Object
    //   91: dup
    //   92: iconst_0
    //   93: aload_1
    //   94: invokestatic 168	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   97: aastore
    //   98: invokestatic 171	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: goto -61 -> 40
    //
    // Exception table:
    //   from	to	target	type
    //   14	21	50	finally
    //   51	53	50	finally
    //   28	40	60	java/lang/InterruptedException
    //   28	40	82	java/util/concurrent/ExecutionException
  }

  public final boolean Ff()
  {
    boolean bool = false;
    AppMethodBeat.i(55770);
    ab.i("MicroMsg.SilkWriter", "resetWriter");
    while (true)
    {
      synchronized (this.crt)
      {
        MediaRecorder.SilkEncUnInit();
        int i = MediaRecorder.SilkEncInit(this.mSampleRate, this.crs, this.crx);
        if (i != 0)
        {
          ab.e("MicroMsg.SilkWriter", "resetWriter SilkEncoderInit Error:%d", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(55770);
          return bool;
        }
      }
      AppMethodBeat.o(55770);
      bool = true;
    }
  }

  public final int a(g.a parama)
  {
    AppMethodBeat.i(55771);
    int i = a(parama, 0, false);
    AppMethodBeat.o(55771);
    return i;
  }

  // ERROR //
  public final int a(g.a parama, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 198
    //   2: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 200	com/tencent/mm/compatible/util/g$a
    //   8: dup
    //   9: invokespecial 201	com/tencent/mm/compatible/util/g$a:<init>	()V
    //   12: astore 4
    //   14: aload_0
    //   15: getfield 69	com/tencent/mm/audio/d/c:mSampleRate	I
    //   18: bipush 20
    //   20: imul
    //   21: iconst_2
    //   22: imul
    //   23: sipush 1000
    //   26: idiv
    //   27: i2s
    //   28: istore 5
    //   30: aload_0
    //   31: getfield 65	com/tencent/mm/audio/d/c:crq	I
    //   34: aload_1
    //   35: getfield 206	com/tencent/mm/audio/b/g$a:cqs	I
    //   38: iadd
    //   39: istore 6
    //   41: iconst_0
    //   42: istore 7
    //   44: iload 5
    //   46: newarray byte
    //   48: astore 8
    //   50: aload_0
    //   51: getfield 79	com/tencent/mm/audio/d/c:cry	Z
    //   54: ifeq +486 -> 540
    //   57: bipush 6
    //   59: istore 9
    //   61: iload 9
    //   63: iload 5
    //   65: imul
    //   66: newarray byte
    //   68: astore 10
    //   70: ldc 208
    //   72: invokestatic 214	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   75: checkcast 208	com/tencent/mm/plugin/zero/b/a
    //   78: invokeinterface 218 1 0
    //   83: ldc 220
    //   85: invokevirtual 226	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   88: astore 11
    //   90: aload 11
    //   92: invokestatic 230	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   95: ifne +1058 -> 1153
    //   98: aload 11
    //   100: iconst_1
    //   101: invokestatic 234	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   104: iconst_1
    //   105: if_icmpne +441 -> 546
    //   108: iconst_1
    //   109: istore 12
    //   111: iload_3
    //   112: ifeq +6 -> 118
    //   115: iconst_0
    //   116: istore 12
    //   118: ldc 91
    //   120: ldc 236
    //   122: iconst_1
    //   123: anewarray 4	java/lang/Object
    //   126: dup
    //   127: iconst_0
    //   128: iload 12
    //   130: invokestatic 241	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   133: aastore
    //   134: invokestatic 244	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: iconst_0
    //   138: istore 9
    //   140: iload 6
    //   142: iload 5
    //   144: if_icmplt +761 -> 905
    //   147: aload_0
    //   148: getfield 65	com/tencent/mm/audio/d/c:crq	I
    //   151: ifle +454 -> 605
    //   154: aload_0
    //   155: getfield 67	com/tencent/mm/audio/d/c:crr	[B
    //   158: iconst_0
    //   159: aload 8
    //   161: iconst_0
    //   162: aload_0
    //   163: getfield 65	com/tencent/mm/audio/d/c:crq	I
    //   166: invokestatic 250	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   169: aload_1
    //   170: getfield 253	com/tencent/mm/audio/b/g$a:buf	[B
    //   173: astore 11
    //   175: aload_0
    //   176: getfield 65	com/tencent/mm/audio/d/c:crq	I
    //   179: istore 13
    //   181: aload 11
    //   183: iconst_0
    //   184: aload 8
    //   186: iload 13
    //   188: iload 5
    //   190: iload 13
    //   192: isub
    //   193: invokestatic 250	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   196: iload 7
    //   198: iload 5
    //   200: aload_0
    //   201: getfield 65	com/tencent/mm/audio/d/c:crq	I
    //   204: isub
    //   205: iadd
    //   206: istore 7
    //   208: aload_0
    //   209: iconst_0
    //   210: putfield 65	com/tencent/mm/audio/d/c:crq	I
    //   213: iload 6
    //   215: iload 5
    //   217: isub
    //   218: istore 6
    //   220: iconst_1
    //   221: newarray short
    //   223: astore 11
    //   225: aload_0
    //   226: getfield 73	com/tencent/mm/audio/d/c:crt	Ljava/lang/Object;
    //   229: astore 14
    //   231: aload 14
    //   233: monitorenter
    //   234: aload_0
    //   235: getfield 79	com/tencent/mm/audio/d/c:cry	Z
    //   238: ifeq +33 -> 271
    //   241: iload 6
    //   243: iload 5
    //   245: if_icmpge +430 -> 675
    //   248: aload_1
    //   249: getfield 256	com/tencent/mm/audio/b/g$a:cqt	Z
    //   252: ifeq +423 -> 675
    //   255: sipush 201
    //   258: iconst_1
    //   259: invokestatic 260	com/tencent/mm/modelvoice/MediaRecorder:SetVoiceSilkControl	(II)I
    //   262: pop
    //   263: ldc 91
    //   265: ldc_w 262
    //   268: invokestatic 113	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   271: aload 8
    //   273: iload 5
    //   275: aload 10
    //   277: aload 11
    //   279: iload 12
    //   281: invokestatic 266	com/tencent/mm/modelvoice/MediaRecorder:SilkDoEnc	([BS[B[SZ)I
    //   284: istore 15
    //   286: aload 14
    //   288: monitorexit
    //   289: iconst_0
    //   290: istore 16
    //   292: iload 16
    //   294: istore 13
    //   296: iload_3
    //   297: ifeq +160 -> 457
    //   300: iload 16
    //   302: istore 13
    //   304: aload 11
    //   306: iconst_0
    //   307: saload
    //   308: bipush 10
    //   310: if_icmplt +147 -> 457
    //   313: iload 16
    //   315: istore 13
    //   317: aload 10
    //   319: iconst_0
    //   320: baload
    //   321: iconst_2
    //   322: if_icmpne +135 -> 457
    //   325: iload 16
    //   327: istore 13
    //   329: aload 10
    //   331: iconst_1
    //   332: baload
    //   333: bipush 35
    //   335: if_icmpne +122 -> 457
    //   338: iload 16
    //   340: istore 13
    //   342: aload 10
    //   344: iconst_2
    //   345: baload
    //   346: bipush 33
    //   348: if_icmpne +109 -> 457
    //   351: iload 16
    //   353: istore 13
    //   355: aload 10
    //   357: iconst_3
    //   358: baload
    //   359: bipush 83
    //   361: if_icmpne +96 -> 457
    //   364: iload 16
    //   366: istore 13
    //   368: aload 10
    //   370: iconst_4
    //   371: baload
    //   372: bipush 73
    //   374: if_icmpne +83 -> 457
    //   377: iload 16
    //   379: istore 13
    //   381: aload 10
    //   383: iconst_5
    //   384: baload
    //   385: bipush 76
    //   387: if_icmpne +70 -> 457
    //   390: iload 16
    //   392: istore 13
    //   394: aload 10
    //   396: bipush 6
    //   398: baload
    //   399: bipush 75
    //   401: if_icmpne +56 -> 457
    //   404: iload 16
    //   406: istore 13
    //   408: aload 10
    //   410: bipush 7
    //   412: baload
    //   413: bipush 95
    //   415: if_icmpne +42 -> 457
    //   418: iload 16
    //   420: istore 13
    //   422: aload 10
    //   424: bipush 8
    //   426: baload
    //   427: bipush 86
    //   429: if_icmpne +28 -> 457
    //   432: iload 16
    //   434: istore 13
    //   436: aload 10
    //   438: bipush 9
    //   440: baload
    //   441: bipush 51
    //   443: if_icmpne +14 -> 457
    //   446: ldc 91
    //   448: ldc_w 268
    //   451: invokestatic 113	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   454: iconst_1
    //   455: istore 13
    //   457: iload 15
    //   459: ifeq +238 -> 697
    //   462: aload_0
    //   463: iconst_0
    //   464: putfield 65	com/tencent/mm/audio/d/c:crq	I
    //   467: ldc 91
    //   469: ldc_w 270
    //   472: iconst_1
    //   473: anewarray 4	java/lang/Object
    //   476: dup
    //   477: iconst_0
    //   478: iload 15
    //   480: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   483: aastore
    //   484: invokestatic 171	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   487: aload_0
    //   488: getfield 77	com/tencent/mm/audio/d/c:crv	Z
    //   491: ifne +40 -> 531
    //   494: getstatic 276	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   497: ldc2_w 277
    //   500: ldc2_w 279
    //   503: lconst_1
    //   504: invokevirtual 284	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   507: aload_0
    //   508: iconst_1
    //   509: putfield 77	com/tencent/mm/audio/d/c:crv	Z
    //   512: getstatic 289	com/tencent/mm/protocal/d:vxr	Z
    //   515: ifeq +16 -> 531
    //   518: getstatic 276	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   521: ldc_w 291
    //   524: ldc_w 293
    //   527: aconst_null
    //   528: invokevirtual 297	com/tencent/mm/plugin/report/service/h:g	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    //   531: iconst_m1
    //   532: istore_2
    //   533: ldc 198
    //   535: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   538: iload_2
    //   539: ireturn
    //   540: iconst_1
    //   541: istore 9
    //   543: goto -482 -> 61
    //   546: iconst_0
    //   547: istore 12
    //   549: goto -438 -> 111
    //   552: astore_1
    //   553: ldc 91
    //   555: ldc_w 299
    //   558: iconst_3
    //   559: anewarray 4	java/lang/Object
    //   562: dup
    //   563: iconst_0
    //   564: aload_0
    //   565: getfield 65	com/tencent/mm/audio/d/c:crq	I
    //   568: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   571: aastore
    //   572: dup
    //   573: iconst_1
    //   574: iload 5
    //   576: aload_0
    //   577: getfield 65	com/tencent/mm/audio/d/c:crq	I
    //   580: isub
    //   581: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   584: aastore
    //   585: dup
    //   586: iconst_2
    //   587: aload_1
    //   588: invokevirtual 127	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   591: aastore
    //   592: invokestatic 171	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   595: iconst_m1
    //   596: istore_2
    //   597: ldc 198
    //   599: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   602: goto -64 -> 538
    //   605: aload_1
    //   606: getfield 253	com/tencent/mm/audio/b/g$a:buf	[B
    //   609: iload 7
    //   611: aload 8
    //   613: iconst_0
    //   614: iload 5
    //   616: invokestatic 250	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   619: iload 7
    //   621: iload 5
    //   623: iadd
    //   624: istore 7
    //   626: goto -413 -> 213
    //   629: astore_1
    //   630: ldc 91
    //   632: ldc_w 301
    //   635: iconst_3
    //   636: anewarray 4	java/lang/Object
    //   639: dup
    //   640: iconst_0
    //   641: iload 7
    //   643: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   646: aastore
    //   647: dup
    //   648: iconst_1
    //   649: iload 5
    //   651: invokestatic 306	java/lang/Short:valueOf	(S)Ljava/lang/Short;
    //   654: aastore
    //   655: dup
    //   656: iconst_2
    //   657: aload_1
    //   658: invokevirtual 127	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   661: aastore
    //   662: invokestatic 171	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   665: iconst_m1
    //   666: istore_2
    //   667: ldc 198
    //   669: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   672: goto -134 -> 538
    //   675: sipush 201
    //   678: iconst_0
    //   679: invokestatic 260	com/tencent/mm/modelvoice/MediaRecorder:SetVoiceSilkControl	(II)I
    //   682: pop
    //   683: goto -412 -> 271
    //   686: astore_1
    //   687: aload 14
    //   689: monitorexit
    //   690: ldc 198
    //   692: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   695: aload_1
    //   696: athrow
    //   697: ldc 91
    //   699: ldc_w 308
    //   702: iconst_4
    //   703: anewarray 4	java/lang/Object
    //   706: dup
    //   707: iconst_0
    //   708: aload 11
    //   710: iconst_0
    //   711: saload
    //   712: invokestatic 306	java/lang/Short:valueOf	(S)Ljava/lang/Short;
    //   715: aastore
    //   716: dup
    //   717: iconst_1
    //   718: iload 5
    //   720: invokestatic 306	java/lang/Short:valueOf	(S)Ljava/lang/Short;
    //   723: aastore
    //   724: dup
    //   725: iconst_2
    //   726: aload_1
    //   727: getfield 256	com/tencent/mm/audio/b/g$a:cqt	Z
    //   730: invokestatic 241	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   733: aastore
    //   734: dup
    //   735: iconst_3
    //   736: aload_1
    //   737: getfield 206	com/tencent/mm/audio/b/g$a:cqs	I
    //   740: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   743: aastore
    //   744: invokestatic 311	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   747: iload 9
    //   749: istore 16
    //   751: aload 11
    //   753: iconst_0
    //   754: saload
    //   755: aload 10
    //   757: arraylength
    //   758: if_icmpge +110 -> 868
    //   761: iload 9
    //   763: istore 16
    //   765: aload 11
    //   767: iconst_0
    //   768: saload
    //   769: ifle +99 -> 868
    //   772: iload 9
    //   774: istore 16
    //   776: aload_0
    //   777: getfield 115	com/tencent/mm/audio/d/c:crw	Ljava/io/OutputStream;
    //   780: ifnull +88 -> 868
    //   783: iload_3
    //   784: ifeq +57 -> 841
    //   787: iload 13
    //   789: ifeq +52 -> 841
    //   792: ldc 91
    //   794: ldc_w 313
    //   797: invokestatic 113	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   800: aload 10
    //   802: iconst_1
    //   803: aload 10
    //   805: arraylength
    //   806: invokestatic 319	java/util/Arrays:copyOfRange	([BII)[B
    //   809: astore 14
    //   811: aload_0
    //   812: getfield 115	com/tencent/mm/audio/d/c:crw	Ljava/io/OutputStream;
    //   815: aload 14
    //   817: iconst_0
    //   818: aload 11
    //   820: iconst_0
    //   821: saload
    //   822: iconst_1
    //   823: isub
    //   824: invokevirtual 323	java/io/OutputStream:write	([BII)V
    //   827: iload 9
    //   829: aload 11
    //   831: iconst_0
    //   832: saload
    //   833: iconst_1
    //   834: isub
    //   835: iadd
    //   836: istore 9
    //   838: goto -698 -> 140
    //   841: aload_0
    //   842: getfield 115	com/tencent/mm/audio/d/c:crw	Ljava/io/OutputStream;
    //   845: aload 10
    //   847: iconst_0
    //   848: aload 11
    //   850: iconst_0
    //   851: saload
    //   852: invokevirtual 323	java/io/OutputStream:write	([BII)V
    //   855: aload 11
    //   857: iconst_0
    //   858: saload
    //   859: istore 13
    //   861: iload 9
    //   863: iload 13
    //   865: iadd
    //   866: istore 16
    //   868: iload 16
    //   870: istore 9
    //   872: goto -732 -> 140
    //   875: astore_1
    //   876: ldc 91
    //   878: ldc_w 325
    //   881: iconst_1
    //   882: anewarray 4	java/lang/Object
    //   885: dup
    //   886: iconst_0
    //   887: aload_0
    //   888: getfield 100	com/tencent/mm/audio/d/c:crp	Ljava/lang/String;
    //   891: aastore
    //   892: invokestatic 171	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   895: iconst_m1
    //   896: istore_2
    //   897: ldc 198
    //   899: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   902: goto -364 -> 538
    //   905: aload_0
    //   906: getfield 115	com/tencent/mm/audio/d/c:crw	Ljava/io/OutputStream;
    //   909: invokevirtual 328	java/io/OutputStream:flush	()V
    //   912: aload_1
    //   913: getfield 253	com/tencent/mm/audio/b/g$a:buf	[B
    //   916: iload 7
    //   918: aload_0
    //   919: getfield 67	com/tencent/mm/audio/d/c:crr	[B
    //   922: aload_0
    //   923: getfield 65	com/tencent/mm/audio/d/c:crq	I
    //   926: iload 6
    //   928: invokestatic 250	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   931: aload_0
    //   932: aload_0
    //   933: getfield 65	com/tencent/mm/audio/d/c:crq	I
    //   936: iload 6
    //   938: iadd
    //   939: putfield 65	com/tencent/mm/audio/d/c:crq	I
    //   942: aload 4
    //   944: invokevirtual 332	com/tencent/mm/compatible/util/g$a:Mr	()J
    //   947: lstore 17
    //   949: iload_2
    //   950: iconst_1
    //   951: if_icmpne +42 -> 993
    //   954: getstatic 48	com/tencent/mm/audio/d/c:crz	Lcom/tencent/mm/audio/d/a$a;
    //   957: astore_1
    //   958: aload_1
    //   959: aload_1
    //   960: getfield 336	com/tencent/mm/audio/d/a$a:crk	J
    //   963: aload_1
    //   964: getfield 339	com/tencent/mm/audio/d/a$a:count	I
    //   967: i2l
    //   968: lmul
    //   969: lload 17
    //   971: ladd
    //   972: aload_1
    //   973: getfield 339	com/tencent/mm/audio/d/a$a:count	I
    //   976: iconst_1
    //   977: iadd
    //   978: i2l
    //   979: ldiv
    //   980: putfield 336	com/tencent/mm/audio/d/a$a:crk	J
    //   983: aload_1
    //   984: aload_1
    //   985: getfield 339	com/tencent/mm/audio/d/a$a:count	I
    //   988: iconst_1
    //   989: iadd
    //   990: putfield 339	com/tencent/mm/audio/d/a$a:count	I
    //   993: ldc 91
    //   995: new 93	java/lang/StringBuilder
    //   998: dup
    //   999: ldc_w 341
    //   1002: invokespecial 98	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1005: lload 17
    //   1007: invokevirtual 344	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1010: ldc_w 346
    //   1013: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1016: iload_2
    //   1017: invokevirtual 349	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1020: ldc_w 351
    //   1023: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1026: getstatic 48	com/tencent/mm/audio/d/c:crz	Lcom/tencent/mm/audio/d/a$a;
    //   1029: getfield 336	com/tencent/mm/audio/d/a$a:crk	J
    //   1032: invokevirtual 344	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1035: ldc_w 353
    //   1038: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1041: getstatic 48	com/tencent/mm/audio/d/c:crz	Lcom/tencent/mm/audio/d/a$a;
    //   1044: getfield 339	com/tencent/mm/audio/d/a$a:count	I
    //   1047: invokevirtual 349	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1050: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1053: invokestatic 355	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1056: ldc 198
    //   1058: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1061: iload 9
    //   1063: istore_2
    //   1064: goto -526 -> 538
    //   1067: astore_1
    //   1068: ldc 91
    //   1070: ldc_w 357
    //   1073: iconst_1
    //   1074: anewarray 4	java/lang/Object
    //   1077: dup
    //   1078: iconst_0
    //   1079: aload_0
    //   1080: getfield 100	com/tencent/mm/audio/d/c:crp	Ljava/lang/String;
    //   1083: aastore
    //   1084: invokestatic 171	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1087: iconst_m1
    //   1088: istore_2
    //   1089: ldc 198
    //   1091: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1094: goto -556 -> 538
    //   1097: astore_1
    //   1098: ldc 91
    //   1100: ldc_w 359
    //   1103: iconst_4
    //   1104: anewarray 4	java/lang/Object
    //   1107: dup
    //   1108: iconst_0
    //   1109: iload 7
    //   1111: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1114: aastore
    //   1115: dup
    //   1116: iconst_1
    //   1117: aload_0
    //   1118: getfield 65	com/tencent/mm/audio/d/c:crq	I
    //   1121: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1124: aastore
    //   1125: dup
    //   1126: iconst_2
    //   1127: iload 6
    //   1129: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1132: aastore
    //   1133: dup
    //   1134: iconst_3
    //   1135: aload_1
    //   1136: invokevirtual 127	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1139: aastore
    //   1140: invokestatic 171	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1143: iconst_m1
    //   1144: istore_2
    //   1145: ldc 198
    //   1147: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1150: goto -612 -> 538
    //   1153: iconst_1
    //   1154: istore 12
    //   1156: goto -1045 -> 111
    //
    // Exception table:
    //   from	to	target	type
    //   154	196	552	java/lang/Exception
    //   605	619	629	java/lang/Exception
    //   234	241	686	finally
    //   248	271	686	finally
    //   271	289	686	finally
    //   675	683	686	finally
    //   687	690	686	finally
    //   751	761	875	java/io/IOException
    //   776	783	875	java/io/IOException
    //   792	827	875	java/io/IOException
    //   841	855	875	java/io/IOException
    //   905	912	1067	java/io/IOException
    //   912	942	1097	java/lang/Exception
  }

  public final boolean eo(String paramString)
  {
    AppMethodBeat.i(55767);
    ab.i("MicroMsg.SilkWriter", "initWriter path: ".concat(String.valueOf(paramString)));
    boolean bool;
    if (paramString == null)
    {
      ab.e("MicroMsg.SilkWriter", "path is null");
      AppMethodBeat.o(55767);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject1 = null;
      try
      {
        localObject2 = e.L(paramString, false);
        label52: if (localObject2 == null)
          break label436;
      }
      catch (Exception localException)
      {
        try
        {
          Object localObject2;
          this.crp = paramString;
          this.crw = ((OutputStream)localObject2);
          this.crv = false;
          i = m.Lw();
          if ((i & 0x400) != 0);
          for (this.crx = 4; ; this.crx = 2)
          {
            i = MediaRecorder.SilkEncInit(this.mSampleRate, this.crs, this.crx);
            if (i == 0)
              break label302;
            ab.e("MicroMsg.SilkWriter", "initWriter SilkEncoderInit Error:%d", new Object[] { Integer.valueOf(i) });
            AppMethodBeat.o(55767);
            bool = false;
            break;
            localException = localException;
            ab.printErrStackTrace("MicroMsg.SilkWriter", localException, "initWriter openWrite failed: %s", new Object[] { localException.getMessage() });
            h.pYm.k(357L, 55L, 1L);
            localObject2 = localObject1;
            if (!com.tencent.mm.protocal.d.vxr)
              break label52;
            localObject2 = new HashMap();
            ((HashMap)localObject2).put("stack", localException.getMessage());
            h.pYm.g("Record", "Write failed", (Map)localObject2);
            localObject2 = localObject1;
            break label52;
            if ((i & 0x200) == 0)
              break label282;
          }
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.SilkWriter", "initWriter FileOutputStream error:%s", new Object[] { paramString.getMessage() });
          AppMethodBeat.o(55767);
          bool = false;
        }
        continue;
        label282: ab.e("TAG", "initWriter cpuType error! silk don't support arm_v5!!!!");
        AppMethodBeat.o(55767);
        bool = false;
      }
      continue;
      label302: this.crr = new byte[this.mSampleRate * 20 * 2 / 1000];
      int i = -1;
      paramString = com.tencent.mm.model.c.c.abi().ll("100279");
      if (paramString.isValid())
        i = bo.getInt((String)paramString.dru().get("isVoiceMsgOptOpen"), 0);
      if (1 == i)
        this.cry = true;
      if (i == 0)
        this.cry = false;
      if (this.cry)
      {
        MediaRecorder.SetVoiceSilkControl(200, 1);
        ab.i("MicroMsg.SilkWriter", "Voice Message Compression Optimization is Open !");
      }
      while (true)
      {
        AppMethodBeat.o(55767);
        bool = true;
        break;
        MediaRecorder.SetVoiceSilkControl(200, 0);
        ab.i("MicroMsg.SilkWriter", "Voice Message Compression Optimization is Close !");
      }
      label436: AppMethodBeat.o(55767);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.d.c
 * JD-Core Version:    0.6.2
 */