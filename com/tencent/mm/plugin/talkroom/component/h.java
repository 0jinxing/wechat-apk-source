package com.tencent.mm.plugin.talkroom.component;

import android.media.AudioTrack;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.plugin.talkroom.model.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class h extends e.a
  implements Runnable
{
  private static final int sxv = a.sxv;
  private AudioTrack aQf;
  private int bufferSize;
  private boolean cAY;
  private boolean chf;
  private boolean fZQ;
  private boolean gbH;
  private ak handler;
  private final Object lock;
  private int nKD;
  private int sxA;
  private long sxB;
  private v2engine sxg;
  private short sxh;
  private short sxi;
  private int sxw;
  private final c sxx;
  private boolean sxy;
  private long sxz;

  public h(v2engine paramv2engine, c paramc)
  {
    AppMethodBeat.i(25737);
    this.sxw = sxv;
    this.bufferSize = (sxv / 1000 * 20 * 2);
    this.handler = new ak(Looper.getMainLooper());
    this.lock = new Object();
    this.chf = false;
    this.fZQ = false;
    this.cAY = true;
    this.sxy = false;
    this.sxz = 0L;
    this.gbH = true;
    this.nKD = 0;
    this.sxB = 0L;
    this.sxg = paramv2engine;
    this.sxx = paramc;
    this.fZQ = true;
    if ((this.aQf != null) && (this.aQf.getState() == 1))
      this.aQf.stop();
    if (this.aQf != null);
    try
    {
      this.aQf.release();
      label152: v2engine.ZL().f(true, false, false);
      int i = v2engine.ZL().bE(true);
      int j = AudioTrack.getMinBufferSize(this.sxw, 2, 2);
      if ((j == -2) || (j == -1))
        AppMethodBeat.o(25737);
      while (true)
      {
        return;
        this.aQf = new e(i, this.sxw, 2, j * 8);
        this.fZQ = false;
        AppMethodBeat.o(25737);
      }
    }
    catch (Exception paramv2engine)
    {
      break label152;
    }
  }

  public final int cEe()
  {
    int i = 0;
    if (this.sxi < this.sxh)
      this.sxi = ((short)this.sxh);
    if (this.sxi == 0);
    while (true)
    {
      return i;
      i = (short)(this.sxh * 100 / this.sxi);
      this.sxh = ((short)0);
    }
  }

  public final void cEf()
  {
    AppMethodBeat.i(25739);
    if ((this.aQf != null) && (this.aQf.getState() == 1))
      this.aQf.play();
    synchronized (this.lock)
    {
      this.cAY = false;
      this.lock.notify();
      this.sxi = ((short)0);
      this.sxh = ((short)0);
      AppMethodBeat.o(25739);
      return;
    }
  }

  public final void cpN()
  {
    AppMethodBeat.i(25738);
    this.cAY = true;
    if ((this.aQf != null) && (this.aQf.getState() == 1))
      this.aQf.pause();
    AppMethodBeat.o(25738);
  }

  public final void release()
  {
    AppMethodBeat.i(25740);
    ab.i("MicroMsg.TalkRoomPlayer", "release");
    this.chf = true;
    if ((this.aQf != null) && (this.aQf.getState() == 1))
      this.aQf.stop();
    if (this.aQf != null)
      this.aQf.release();
    synchronized (this.lock)
    {
      this.cAY = false;
      this.lock.notify();
      AppMethodBeat.o(25740);
      return;
    }
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 25741
    //   3: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 78	com/tencent/mm/plugin/talkroom/component/h:chf	Z
    //   10: ifeq +10 -> 20
    //   13: sipush 25741
    //   16: invokestatic 133	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: return
    //   20: aload_0
    //   21: getfield 80	com/tencent/mm/plugin/talkroom/component/h:fZQ	Z
    //   24: ifeq +28 -> 52
    //   27: ldc2_w 169
    //   30: invokestatic 176	java/lang/Thread:sleep	(J)V
    //   33: goto -27 -> 6
    //   36: astore_1
    //   37: ldc 159
    //   39: aload_1
    //   40: ldc 178
    //   42: iconst_0
    //   43: anewarray 73	java/lang/Object
    //   46: invokestatic 182	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   49: goto -43 -> 6
    //   52: aload_0
    //   53: getfield 76	com/tencent/mm/plugin/talkroom/component/h:lock	Ljava/lang/Object;
    //   56: astore_1
    //   57: aload_1
    //   58: monitorenter
    //   59: aload_0
    //   60: getfield 82	com/tencent/mm/plugin/talkroom/component/h:cAY	Z
    //   63: istore_2
    //   64: iload_2
    //   65: ifeq +10 -> 75
    //   68: aload_0
    //   69: getfield 76	com/tencent/mm/plugin/talkroom/component/h:lock	Ljava/lang/Object;
    //   72: invokevirtual 185	java/lang/Object:wait	()V
    //   75: aload_1
    //   76: monitorexit
    //   77: aload_0
    //   78: getfield 92	com/tencent/mm/plugin/talkroom/component/h:sxB	J
    //   81: lstore_3
    //   82: aload_0
    //   83: invokestatic 191	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   86: putfield 92	com/tencent/mm/plugin/talkroom/component/h:sxB	J
    //   89: aload_0
    //   90: getfield 92	com/tencent/mm/plugin/talkroom/component/h:sxB	J
    //   93: lload_3
    //   94: lsub
    //   95: lstore_3
    //   96: lload_3
    //   97: ldc2_w 192
    //   100: lcmp
    //   101: ifge +29 -> 130
    //   104: lload_3
    //   105: lconst_0
    //   106: lcmp
    //   107: ifle +23 -> 130
    //   110: aload_0
    //   111: getfield 76	com/tencent/mm/plugin/talkroom/component/h:lock	Ljava/lang/Object;
    //   114: astore 5
    //   116: aload 5
    //   118: monitorenter
    //   119: aload_0
    //   120: getfield 76	com/tencent/mm/plugin/talkroom/component/h:lock	Ljava/lang/Object;
    //   123: lload_3
    //   124: invokevirtual 195	java/lang/Object:wait	(J)V
    //   127: aload 5
    //   129: monitorexit
    //   130: new 197	com/tencent/mm/pointers/PByteArray
    //   133: astore 6
    //   135: aload 6
    //   137: invokespecial 198	com/tencent/mm/pointers/PByteArray:<init>	()V
    //   140: new 200	com/tencent/mm/pointers/PInt
    //   143: astore 5
    //   145: aload 5
    //   147: invokespecial 201	com/tencent/mm/pointers/PInt:<init>	()V
    //   150: new 200	com/tencent/mm/pointers/PInt
    //   153: astore_1
    //   154: aload_1
    //   155: invokespecial 201	com/tencent/mm/pointers/PInt:<init>	()V
    //   158: aload_0
    //   159: getfield 94	com/tencent/mm/plugin/talkroom/component/h:sxg	Lcom/tencent/mm/plugin/talkroom/component/v2engine;
    //   162: invokevirtual 204	com/tencent/mm/plugin/talkroom/component/v2engine:IsSilenceFrame	()I
    //   165: istore 7
    //   167: iload 7
    //   169: ifne +451 -> 620
    //   172: aload_0
    //   173: getfield 94	com/tencent/mm/plugin/talkroom/component/h:sxg	Lcom/tencent/mm/plugin/talkroom/component/v2engine;
    //   176: aload 6
    //   178: aload_0
    //   179: getfield 58	com/tencent/mm/plugin/talkroom/component/h:bufferSize	I
    //   182: aload 5
    //   184: aload_1
    //   185: invokevirtual 208	com/tencent/mm/plugin/talkroom/component/v2engine:GetAudioData	(Lcom/tencent/mm/pointers/PByteArray;ILcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)I
    //   188: istore 8
    //   190: iload 8
    //   192: ifge +148 -> 340
    //   195: aload_0
    //   196: aload_0
    //   197: getfield 90	com/tencent/mm/plugin/talkroom/component/h:nKD	I
    //   200: iconst_1
    //   201: iadd
    //   202: putfield 90	com/tencent/mm/plugin/talkroom/component/h:nKD	I
    //   205: ldc 159
    //   207: ldc 210
    //   209: iconst_2
    //   210: anewarray 73	java/lang/Object
    //   213: dup
    //   214: iconst_0
    //   215: iload 8
    //   217: invokestatic 216	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   220: aastore
    //   221: dup
    //   222: iconst_1
    //   223: aload_0
    //   224: getfield 90	com/tencent/mm/plugin/talkroom/component/h:nKD	I
    //   227: invokestatic 216	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   230: aastore
    //   231: invokestatic 220	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: aload_0
    //   235: getfield 90	com/tencent/mm/plugin/talkroom/component/h:nKD	I
    //   238: bipush 100
    //   240: if_icmplt -234 -> 6
    //   243: aload_0
    //   244: iconst_0
    //   245: putfield 90	com/tencent/mm/plugin/talkroom/component/h:nKD	I
    //   248: aload_0
    //   249: iconst_1
    //   250: putfield 82	com/tencent/mm/plugin/talkroom/component/h:cAY	Z
    //   253: goto -247 -> 6
    //   256: astore_1
    //   257: ldc 159
    //   259: aload_1
    //   260: ldc 178
    //   262: iconst_0
    //   263: anewarray 73	java/lang/Object
    //   266: invokestatic 182	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   269: ldc 159
    //   271: aload_1
    //   272: invokevirtual 224	java/lang/Exception:toString	()Ljava/lang/String;
    //   275: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   278: goto -272 -> 6
    //   281: astore 5
    //   283: ldc 159
    //   285: aload 5
    //   287: ldc 178
    //   289: iconst_0
    //   290: anewarray 73	java/lang/Object
    //   293: invokestatic 182	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   296: goto -221 -> 75
    //   299: astore 5
    //   301: aload_1
    //   302: monitorexit
    //   303: sipush 25741
    //   306: invokestatic 133	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   309: aload 5
    //   311: athrow
    //   312: astore_1
    //   313: aload 5
    //   315: monitorexit
    //   316: sipush 25741
    //   319: invokestatic 133	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   322: aload_1
    //   323: athrow
    //   324: astore_1
    //   325: ldc 159
    //   327: aload_1
    //   328: ldc 178
    //   330: iconst_0
    //   331: anewarray 73	java/lang/Object
    //   334: invokestatic 182	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   337: goto -207 -> 130
    //   340: iload 7
    //   342: ifne +235 -> 577
    //   345: aload_0
    //   346: getfield 98	com/tencent/mm/plugin/talkroom/component/h:aQf	Landroid/media/AudioTrack;
    //   349: invokevirtual 229	android/media/AudioTrack:getPlayState	()I
    //   352: iconst_3
    //   353: if_icmpeq +10 -> 363
    //   356: aload_0
    //   357: getfield 98	com/tencent/mm/plugin/talkroom/component/h:aQf	Landroid/media/AudioTrack;
    //   360: invokevirtual 150	android/media/AudioTrack:play	()V
    //   363: aload 6
    //   365: getfield 233	com/tencent/mm/pointers/PByteArray:value	[B
    //   368: astore 9
    //   370: aload 6
    //   372: getfield 233	com/tencent/mm/pointers/PByteArray:value	[B
    //   375: arraylength
    //   376: istore 10
    //   378: iconst_0
    //   379: istore 8
    //   381: iload 8
    //   383: iload 10
    //   385: iconst_2
    //   386: idiv
    //   387: if_icmpge +52 -> 439
    //   390: aload 9
    //   392: iload 8
    //   394: iconst_2
    //   395: imul
    //   396: baload
    //   397: sipush 255
    //   400: iand
    //   401: aload 9
    //   403: iload 8
    //   405: iconst_2
    //   406: imul
    //   407: iconst_1
    //   408: iadd
    //   409: baload
    //   410: bipush 8
    //   412: ishl
    //   413: ior
    //   414: i2s
    //   415: istore 11
    //   417: iload 11
    //   419: aload_0
    //   420: getfield 146	com/tencent/mm/plugin/talkroom/component/h:sxh	S
    //   423: if_icmple +10 -> 433
    //   426: aload_0
    //   427: iload 11
    //   429: i2s
    //   430: putfield 146	com/tencent/mm/plugin/talkroom/component/h:sxh	S
    //   433: iinc 8 1
    //   436: goto -55 -> 381
    //   439: aload_0
    //   440: getfield 98	com/tencent/mm/plugin/talkroom/component/h:aQf	Landroid/media/AudioTrack;
    //   443: aload 6
    //   445: getfield 233	com/tencent/mm/pointers/PByteArray:value	[B
    //   448: iconst_0
    //   449: aload 6
    //   451: getfield 233	com/tencent/mm/pointers/PByteArray:value	[B
    //   454: arraylength
    //   455: invokevirtual 237	android/media/AudioTrack:write	([BII)I
    //   458: pop
    //   459: iload 7
    //   461: ifne +133 -> 594
    //   464: aload_0
    //   465: invokestatic 191	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   468: putfield 86	com/tencent/mm/plugin/talkroom/component/h:sxz	J
    //   471: iconst_0
    //   472: istore_2
    //   473: aload_0
    //   474: getfield 88	com/tencent/mm/plugin/talkroom/component/h:gbH	Z
    //   477: ifne +14 -> 491
    //   480: aload_0
    //   481: getfield 239	com/tencent/mm/plugin/talkroom/component/h:sxA	I
    //   484: aload_1
    //   485: getfield 241	com/tencent/mm/pointers/PInt:value	I
    //   488: if_icmpeq +15 -> 503
    //   491: iload_2
    //   492: ifne +11 -> 503
    //   495: aload 5
    //   497: getfield 241	com/tencent/mm/pointers/PInt:value	I
    //   500: ifne +14 -> 514
    //   503: aload_0
    //   504: getfield 88	com/tencent/mm/plugin/talkroom/component/h:gbH	Z
    //   507: ifne -501 -> 6
    //   510: iload_2
    //   511: ifeq -505 -> 6
    //   514: aload_0
    //   515: getfield 84	com/tencent/mm/plugin/talkroom/component/h:sxy	Z
    //   518: ifne -512 -> 6
    //   521: iload_2
    //   522: ifne +18 -> 540
    //   525: aload_1
    //   526: getfield 241	com/tencent/mm/pointers/PInt:value	I
    //   529: ifeq +11 -> 540
    //   532: aload_0
    //   533: aload_1
    //   534: getfield 241	com/tencent/mm/pointers/PInt:value	I
    //   537: putfield 239	com/tencent/mm/plugin/talkroom/component/h:sxA	I
    //   540: aload_0
    //   541: getfield 71	com/tencent/mm/plugin/talkroom/component/h:handler	Lcom/tencent/mm/sdk/platformtools/ak;
    //   544: astore 6
    //   546: new 243	com/tencent/mm/plugin/talkroom/component/h$1
    //   549: astore 9
    //   551: aload 9
    //   553: aload_0
    //   554: aload 5
    //   556: aload_1
    //   557: iload_2
    //   558: invokespecial 246	com/tencent/mm/plugin/talkroom/component/h$1:<init>	(Lcom/tencent/mm/plugin/talkroom/component/h;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Z)V
    //   561: aload 6
    //   563: aload 9
    //   565: invokevirtual 250	com/tencent/mm/sdk/platformtools/ak:postAtFrontOfQueueV2	(Ljava/lang/Runnable;)Z
    //   568: pop
    //   569: aload_0
    //   570: iload_2
    //   571: putfield 88	com/tencent/mm/plugin/talkroom/component/h:gbH	Z
    //   574: goto -568 -> 6
    //   577: aload_0
    //   578: getfield 88	com/tencent/mm/plugin/talkroom/component/h:gbH	Z
    //   581: ifeq -122 -> 459
    //   584: aload_0
    //   585: getfield 98	com/tencent/mm/plugin/talkroom/component/h:aQf	Landroid/media/AudioTrack;
    //   588: invokevirtual 157	android/media/AudioTrack:pause	()V
    //   591: goto -132 -> 459
    //   594: aload_0
    //   595: getfield 86	com/tencent/mm/plugin/talkroom/component/h:sxz	J
    //   598: invokestatic 254	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   601: lstore_3
    //   602: lload_3
    //   603: ldc2_w 255
    //   606: lcmp
    //   607: ifge +8 -> 615
    //   610: iconst_0
    //   611: istore_2
    //   612: goto -139 -> 473
    //   615: iconst_1
    //   616: istore_2
    //   617: goto -144 -> 473
    //   620: iconst_0
    //   621: istore 8
    //   623: goto -433 -> 190
    //
    // Exception table:
    //   from	to	target	type
    //   27	33	36	java/lang/InterruptedException
    //   130	167	256	java/lang/Exception
    //   172	190	256	java/lang/Exception
    //   195	253	256	java/lang/Exception
    //   345	363	256	java/lang/Exception
    //   363	378	256	java/lang/Exception
    //   381	390	256	java/lang/Exception
    //   417	433	256	java/lang/Exception
    //   439	459	256	java/lang/Exception
    //   464	471	256	java/lang/Exception
    //   473	491	256	java/lang/Exception
    //   495	503	256	java/lang/Exception
    //   503	510	256	java/lang/Exception
    //   514	521	256	java/lang/Exception
    //   525	540	256	java/lang/Exception
    //   540	574	256	java/lang/Exception
    //   577	591	256	java/lang/Exception
    //   594	602	256	java/lang/Exception
    //   68	75	281	java/lang/InterruptedException
    //   59	64	299	finally
    //   68	75	299	finally
    //   75	77	299	finally
    //   283	296	299	finally
    //   301	303	299	finally
    //   119	130	312	finally
    //   313	316	312	finally
    //   110	119	324	java/lang/InterruptedException
    //   316	324	324	java/lang/InterruptedException
  }

  public final void start()
  {
    AppMethodBeat.i(25742);
    d.h(this, "TalkRoomPlayer_start").start();
    AppMethodBeat.o(25742);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.component.h
 * JD-Core Version:    0.6.2
 */