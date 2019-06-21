package com.tencent.mm.audio.b;

import android.media.MediaRecorder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bf.d.a;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.y;

public final class b
{
  private static Object coV;
  private int coK;
  private String coL;
  private int coM;
  private final Object coN;
  private com.tencent.mm.audio.d.c coO;
  private b.a coP;
  private com.tencent.mm.bf.c coQ;
  private d.a coR;
  private long coS;
  private long coT;
  private int coU;
  private int coW;
  private boolean coX;
  public MediaRecorder coY;
  public c coZ;
  public com.tencent.mm.compatible.b.c.a cpa;
  public b.b cpb;
  private volatile boolean cpc;
  private g.a cpd;
  private int cpe;
  private int cpf;
  private c.a cpg;
  private boolean cph;
  private int mSampleRate;

  static
  {
    AppMethodBeat.i(116494);
    coV = new Object();
    AppMethodBeat.o(116494);
  }

  public b(com.tencent.mm.compatible.b.c.a parama)
  {
    AppMethodBeat.i(116481);
    this.coK = 0;
    this.coL = null;
    this.coN = new Object();
    this.coO = null;
    this.coQ = null;
    this.coR = null;
    this.coS = 0L;
    this.coT = 0L;
    this.coU = 0;
    this.mSampleRate = 8000;
    this.coW = 16000;
    this.coX = false;
    this.coZ = null;
    this.cpc = false;
    this.cpd = new g.a();
    this.cpe = 0;
    this.cpf = 0;
    this.cpg = new b.2(this);
    this.cph = false;
    ab.i("MicroMsg.MMAudioRecorder", "MMAudioRecorder recMode: ".concat(String.valueOf(parama)));
    this.cpa = parama;
    if (!g.b.ES())
    {
      ab.i("MicroMsg.MMAudioRecorder", "can't use silk encode, force to use amr mode now");
      this.cpa = com.tencent.mm.compatible.b.c.a.eoR;
    }
    if (this.cpa == com.tencent.mm.compatible.b.c.a.eoR)
    {
      this.coM = 7;
      this.coY = new MediaRecorder();
    }
    while (true)
    {
      this.cpc = false;
      AppMethodBeat.o(116481);
      return;
      EG();
      this.coM = 1;
    }
  }

  public final void ED()
  {
    AppMethodBeat.i(116485);
    if (this.cpa == com.tencent.mm.compatible.b.c.a.eoR)
    {
      if (this.coY != null)
        this.coY.setAudioEncoder(1);
      AppMethodBeat.o(116485);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(116485);
    }
  }

  public final void EE()
  {
    AppMethodBeat.i(116486);
    if (this.cpa == com.tencent.mm.compatible.b.c.a.eoR)
      if (this.coY == null)
        AppMethodBeat.o(116486);
    while (true)
    {
      return;
      this.coY.setAudioSource(1);
      AppMethodBeat.o(116486);
      continue;
      AppMethodBeat.o(116486);
    }
  }

  public final void EF()
  {
    AppMethodBeat.i(116487);
    if (this.cpa == com.tencent.mm.compatible.b.c.a.eoR)
      if (this.coY == null)
        AppMethodBeat.o(116487);
    while (true)
    {
      return;
      this.coY.setOutputFormat(3);
      AppMethodBeat.o(116487);
      continue;
      AppMethodBeat.o(116487);
    }
  }

  public final void EG()
  {
    AppMethodBeat.i(116489);
    this.coR = d.a.ajX();
    if (this.coR != null)
      this.coX = this.coR.ajW();
    Object localObject2;
    if (this.cpa == com.tencent.mm.compatible.b.c.a.eoS)
    {
      ??? = ((a)g.K(a.class)).Nu().getValue("VoiceSamplingRate");
      this.mSampleRate = bo.getInt((String)???, 16000);
      localObject2 = ((a)g.K(a.class)).Nu().getValue("VoiceRate");
      this.coW = bo.getInt((String)localObject2, 16000);
      ab.i("MicroMsg.MMAudioRecorder", "initMediaRecorder dynamicSample: %s sampleRate: %d dynamicEncoding: %s audioEncoding: %d", new Object[] { ???, Integer.valueOf(this.mSampleRate), localObject2, Integer.valueOf(this.coW) });
    }
    while (true)
    {
      this.coK = 0;
      this.coL = null;
      synchronized (this.coN)
      {
        this.coQ = null;
        this.coO = null;
        this.coU = 0;
      }
      try
      {
        synchronized (coV)
        {
          localObject2 = new com/tencent/mm/audio/b/c;
          ((c)localObject2).<init>(this.mSampleRate, 1, 0);
          this.coZ = ((c)localObject2);
          this.coZ.bq(true);
          this.coZ.gG(120);
          this.coZ.cpM = this.cpg;
          this.cpb = b.b.cpk;
          AppMethodBeat.o(116489);
          return;
          if (this.coX);
          for (this.mSampleRate = 16000; ; this.mSampleRate = 8000)
          {
            g.RQ();
            int i = bo.a((Integer)g.RP().eJH.get(27), 0);
            ab.i("MicroMsg.MMAudioRecorder", "sampleRate: " + this.mSampleRate + " notSupp16K: " + i);
            if (i != 1)
              break;
            this.mSampleRate = 8000;
            break;
          }
          localObject3 = finally;
          AppMethodBeat.o(116489);
          throw localObject3;
        }
      }
      catch (Exception localException)
      {
        if (localException.getMessage() == null)
          break label392;
      }
    }
    ab.e("MicroMsg.MMAudioRecorder", localException.getMessage());
    while (true)
    {
      this.cpb = b.b.cpn;
      AppMethodBeat.o(116489);
      break;
      label392: ab.e("MicroMsg.MMAudioRecorder", "Unknown error occured while initializing recording");
    }
  }

  // ERROR //
  public final boolean EH()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: ldc_w 343
    //   5: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 135	com/tencent/mm/audio/b/b:cpa	Lcom/tencent/mm/compatible/b/c$a;
    //   12: getstatic 148	com/tencent/mm/compatible/b/c$a:eoR	Lcom/tencent/mm/compatible/b/c$a;
    //   15: if_acmpne +56 -> 71
    //   18: ldc 116
    //   20: ldc_w 345
    //   23: iconst_1
    //   24: anewarray 4	java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_0
    //   30: getfield 155	com/tencent/mm/audio/b/b:coY	Landroid/media/MediaRecorder;
    //   33: aastore
    //   34: invokestatic 268	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   37: aload_0
    //   38: getfield 155	com/tencent/mm/audio/b/b:coY	Landroid/media/MediaRecorder;
    //   41: ifnull +22 -> 63
    //   44: aload_0
    //   45: getfield 155	com/tencent/mm/audio/b/b:coY	Landroid/media/MediaRecorder;
    //   48: invokevirtual 348	android/media/MediaRecorder:stop	()V
    //   51: aload_0
    //   52: getfield 155	com/tencent/mm/audio/b/b:coY	Landroid/media/MediaRecorder;
    //   55: invokevirtual 351	android/media/MediaRecorder:release	()V
    //   58: aload_0
    //   59: aconst_null
    //   60: putfield 155	com/tencent/mm/audio/b/b:coY	Landroid/media/MediaRecorder;
    //   63: ldc_w 343
    //   66: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: iload_1
    //   70: ireturn
    //   71: new 98	com/tencent/mm/compatible/util/g$a
    //   74: dup
    //   75: invokespecial 99	com/tencent/mm/compatible/util/g$a:<init>	()V
    //   78: astore_2
    //   79: ldc 116
    //   81: new 311	java/lang/StringBuilder
    //   84: dup
    //   85: ldc_w 353
    //   88: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   91: aload_0
    //   92: getfield 168	com/tencent/mm/audio/b/b:cpb	Lcom/tencent/mm/audio/b/b$b;
    //   95: invokevirtual 356	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   98: invokevirtual 329	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   104: aload_0
    //   105: getfield 168	com/tencent/mm/audio/b/b:cpb	Lcom/tencent/mm/audio/b/b$b;
    //   108: getstatic 286	com/tencent/mm/audio/b/b$b:cpk	Lcom/tencent/mm/audio/b/b$b;
    //   111: if_acmpne +43 -> 154
    //   114: getstatic 362	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   117: ldc2_w 363
    //   120: ldc2_w 365
    //   123: lconst_1
    //   124: iconst_1
    //   125: invokevirtual 369	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   128: aload_0
    //   129: getfield 114	com/tencent/mm/audio/b/b:cph	Z
    //   132: ifne +17 -> 149
    //   135: getstatic 362	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   138: ldc2_w 363
    //   141: ldc2_w 370
    //   144: lconst_1
    //   145: iconst_1
    //   146: invokevirtual 369	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   149: aload_0
    //   150: iconst_1
    //   151: putfield 114	com/tencent/mm/audio/b/b:cph	Z
    //   154: aload_0
    //   155: getfield 168	com/tencent/mm/audio/b/b:cpb	Lcom/tencent/mm/audio/b/b$b;
    //   158: getstatic 374	com/tencent/mm/audio/b/b$b:cpm	Lcom/tencent/mm/audio/b/b$b;
    //   161: if_acmpeq +27 -> 188
    //   164: ldc 116
    //   166: ldc_w 376
    //   169: invokestatic 334	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   172: aload_0
    //   173: getstatic 337	com/tencent/mm/audio/b/b$b:cpn	Lcom/tencent/mm/audio/b/b$b;
    //   176: putfield 168	com/tencent/mm/audio/b/b:cpb	Lcom/tencent/mm/audio/b/b$b;
    //   179: ldc_w 343
    //   182: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: goto -116 -> 69
    //   188: getstatic 62	com/tencent/mm/audio/b/b:coV	Ljava/lang/Object;
    //   191: astore_3
    //   192: aload_3
    //   193: monitorenter
    //   194: aload_0
    //   195: getfield 94	com/tencent/mm/audio/b/b:coZ	Lcom/tencent/mm/audio/b/c;
    //   198: ifnull +421 -> 619
    //   201: aload_0
    //   202: iconst_1
    //   203: putfield 96	com/tencent/mm/audio/b/b:cpc	Z
    //   206: aload_3
    //   207: monitorexit
    //   208: aload_2
    //   209: invokevirtual 380	com/tencent/mm/compatible/util/g$a:Mr	()J
    //   212: lstore 4
    //   214: aload_0
    //   215: getstatic 383	com/tencent/mm/audio/b/b$b:cpo	Lcom/tencent/mm/audio/b/b$b;
    //   218: putfield 168	com/tencent/mm/audio/b/b:cpb	Lcom/tencent/mm/audio/b/b$b;
    //   221: aload_2
    //   222: invokevirtual 380	com/tencent/mm/compatible/util/g$a:Mr	()J
    //   225: lstore 6
    //   227: aload_0
    //   228: getfield 96	com/tencent/mm/audio/b/b:cpc	Z
    //   231: ifeq +151 -> 382
    //   234: ldc 116
    //   236: ldc_w 385
    //   239: iconst_1
    //   240: anewarray 4	java/lang/Object
    //   243: dup
    //   244: iconst_0
    //   245: aload_0
    //   246: getfield 96	com/tencent/mm/audio/b/b:cpc	Z
    //   249: invokestatic 390	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   252: aastore
    //   253: invokestatic 268	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   256: iconst_0
    //   257: istore 8
    //   259: iload 8
    //   261: istore 9
    //   263: aload_0
    //   264: getfield 96	com/tencent/mm/audio/b/b:cpc	Z
    //   267: ifeq +85 -> 352
    //   270: iload 8
    //   272: iconst_1
    //   273: iadd
    //   274: istore 9
    //   276: ldc2_w 391
    //   279: invokestatic 398	java/lang/Thread:sleep	(J)V
    //   282: iload 9
    //   284: istore 8
    //   286: iload 9
    //   288: bipush 25
    //   290: if_icmplt -31 -> 259
    //   293: getstatic 62	com/tencent/mm/audio/b/b:coV	Ljava/lang/Object;
    //   296: astore_3
    //   297: aload_3
    //   298: monitorenter
    //   299: ldc 116
    //   301: ldc_w 400
    //   304: iconst_1
    //   305: anewarray 4	java/lang/Object
    //   308: dup
    //   309: iconst_0
    //   310: aload_0
    //   311: getfield 94	com/tencent/mm/audio/b/b:coZ	Lcom/tencent/mm/audio/b/c;
    //   314: aastore
    //   315: invokestatic 268	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   318: aload_0
    //   319: getfield 94	com/tencent/mm/audio/b/b:coZ	Lcom/tencent/mm/audio/b/c;
    //   322: astore 10
    //   324: aload 10
    //   326: ifnull +24 -> 350
    //   329: aload_0
    //   330: getfield 94	com/tencent/mm/audio/b/b:coZ	Lcom/tencent/mm/audio/b/c;
    //   333: invokevirtual 403	com/tencent/mm/audio/b/c:EB	()Z
    //   336: pop
    //   337: aload_0
    //   338: getfield 94	com/tencent/mm/audio/b/b:coZ	Lcom/tencent/mm/audio/b/c;
    //   341: aconst_null
    //   342: putfield 283	com/tencent/mm/audio/b/c:cpM	Lcom/tencent/mm/audio/b/c$a;
    //   345: aload_0
    //   346: aconst_null
    //   347: putfield 94	com/tencent/mm/audio/b/b:coZ	Lcom/tencent/mm/audio/b/c;
    //   350: aload_3
    //   351: monitorexit
    //   352: ldc 116
    //   354: ldc_w 405
    //   357: iconst_2
    //   358: anewarray 4	java/lang/Object
    //   361: dup
    //   362: iconst_0
    //   363: aload_0
    //   364: getfield 96	com/tencent/mm/audio/b/b:cpc	Z
    //   367: invokestatic 390	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   370: aastore
    //   371: dup
    //   372: iconst_1
    //   373: iload 9
    //   375: invokestatic 265	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   378: aastore
    //   379: invokestatic 268	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   382: aload_0
    //   383: getfield 74	com/tencent/mm/audio/b/b:coN	Ljava/lang/Object;
    //   386: astore_3
    //   387: aload_3
    //   388: monitorenter
    //   389: aload_0
    //   390: getfield 76	com/tencent/mm/audio/b/b:coO	Lcom/tencent/mm/audio/d/c;
    //   393: ifnull +10 -> 403
    //   396: aload_0
    //   397: getfield 76	com/tencent/mm/audio/b/b:coO	Lcom/tencent/mm/audio/d/c;
    //   400: invokevirtual 410	com/tencent/mm/audio/d/c:Fe	()V
    //   403: aload_0
    //   404: getfield 78	com/tencent/mm/audio/b/b:coQ	Lcom/tencent/mm/bf/c;
    //   407: ifnull +51 -> 458
    //   410: aload_0
    //   411: getfield 78	com/tencent/mm/audio/b/b:coQ	Lcom/tencent/mm/bf/c;
    //   414: astore 11
    //   416: ldc_w 412
    //   419: ldc_w 414
    //   422: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   425: new 416	com/tencent/mm/sdk/platformtools/ak
    //   428: astore 12
    //   430: aload 12
    //   432: invokestatic 422	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   435: invokespecial 425	com/tencent/mm/sdk/platformtools/ak:<init>	(Landroid/os/Looper;)V
    //   438: new 427	com/tencent/mm/bf/c$1
    //   441: astore 10
    //   443: aload 10
    //   445: aload 11
    //   447: invokespecial 430	com/tencent/mm/bf/c$1:<init>	(Lcom/tencent/mm/bf/c;)V
    //   450: aload 12
    //   452: aload 10
    //   454: invokevirtual 434	com/tencent/mm/sdk/platformtools/ak:post	(Ljava/lang/Runnable;)Z
    //   457: pop
    //   458: aload_3
    //   459: monitorexit
    //   460: aload_0
    //   461: getfield 84	com/tencent/mm/audio/b/b:coT	J
    //   464: invokestatic 438	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   467: lstore 13
    //   469: ldc 116
    //   471: new 311	java/lang/StringBuilder
    //   474: dup
    //   475: ldc_w 440
    //   478: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   481: lload 13
    //   483: invokevirtual 443	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   486: ldc_w 445
    //   489: invokevirtual 325	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   492: aload_0
    //   493: getfield 84	com/tencent/mm/audio/b/b:coT	J
    //   496: invokevirtual 443	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   499: ldc_w 447
    //   502: invokevirtual 325	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   505: aload_0
    //   506: getfield 86	com/tencent/mm/audio/b/b:coU	I
    //   509: invokevirtual 320	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   512: invokevirtual 329	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   515: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   518: lload 13
    //   520: ldc2_w 448
    //   523: lcmp
    //   524: ifle +37 -> 561
    //   527: aload_0
    //   528: getfield 86	com/tencent/mm/audio/b/b:coU	I
    //   531: ifne +30 -> 561
    //   534: invokestatic 290	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   537: pop
    //   538: invokestatic 294	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   541: getfield 300	com/tencent/mm/kernel/e:eJH	Lcom/tencent/mm/storage/y;
    //   544: bipush 27
    //   546: iconst_1
    //   547: invokestatic 265	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   550: invokevirtual 453	com/tencent/mm/storage/y:set	(ILjava/lang/Object;)V
    //   553: ldc 116
    //   555: ldc_w 455
    //   558: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   561: ldc 116
    //   563: new 311	java/lang/StringBuilder
    //   566: dup
    //   567: ldc_w 457
    //   570: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   573: lload 4
    //   575: invokevirtual 443	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   578: ldc_w 459
    //   581: invokevirtual 325	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   584: lload 6
    //   586: invokevirtual 443	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   589: ldc_w 461
    //   592: invokevirtual 325	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   595: aload_2
    //   596: invokevirtual 380	com/tencent/mm/compatible/util/g$a:Mr	()J
    //   599: invokevirtual 443	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   602: invokevirtual 329	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   605: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   608: ldc_w 343
    //   611: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   614: iconst_0
    //   615: istore_1
    //   616: goto -547 -> 69
    //   619: aload_0
    //   620: iconst_0
    //   621: putfield 96	com/tencent/mm/audio/b/b:cpc	Z
    //   624: goto -418 -> 206
    //   627: astore_2
    //   628: aload_3
    //   629: monitorexit
    //   630: ldc_w 343
    //   633: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   636: aload_2
    //   637: athrow
    //   638: astore_3
    //   639: ldc 116
    //   641: aload_3
    //   642: ldc_w 463
    //   645: iconst_0
    //   646: anewarray 4	java/lang/Object
    //   649: invokestatic 467	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   652: goto -370 -> 282
    //   655: astore 10
    //   657: ldc 116
    //   659: aload 10
    //   661: ldc_w 463
    //   664: iconst_0
    //   665: anewarray 4	java/lang/Object
    //   668: invokestatic 467	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   671: goto -321 -> 350
    //   674: astore_2
    //   675: aload_3
    //   676: monitorexit
    //   677: ldc_w 343
    //   680: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   683: aload_2
    //   684: athrow
    //   685: astore_2
    //   686: aload_3
    //   687: monitorexit
    //   688: ldc_w 343
    //   691: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   694: aload_2
    //   695: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   194	206	627	finally
    //   206	208	627	finally
    //   619	624	627	finally
    //   628	630	627	finally
    //   276	282	638	java/lang/InterruptedException
    //   329	350	655	java/lang/Exception
    //   299	324	674	finally
    //   329	350	674	finally
    //   350	352	674	finally
    //   657	671	674	finally
    //   675	677	674	finally
    //   389	403	685	finally
    //   403	458	685	finally
    //   458	460	685	finally
    //   686	688	685	finally
  }

  public final void a(b.a parama)
  {
    AppMethodBeat.i(116482);
    if (this.cpa == com.tencent.mm.compatible.b.c.a.eoR)
      if (this.coY == null)
        AppMethodBeat.o(116482);
    while (true)
    {
      return;
      this.coP = parama;
      this.coY.setOnErrorListener(new b.1(this));
      AppMethodBeat.o(116482);
      continue;
      if (this.cpb == b.b.cpk)
      {
        this.coP = parama;
        AppMethodBeat.o(116482);
      }
      else
      {
        ab.e("MicroMsg.MMAudioRecorder", "setOnErrorListener on wrong state");
        AppMethodBeat.o(116482);
      }
    }
  }

  public final int getMaxAmplitude()
  {
    int i = 0;
    AppMethodBeat.i(116488);
    if (this.cpa == com.tencent.mm.compatible.b.c.a.eoR)
      if (this.coY == null)
        AppMethodBeat.o(116488);
    while (true)
    {
      return i;
      i = this.coY.getMaxAmplitude();
      AppMethodBeat.o(116488);
      continue;
      if (this.cpb == b.b.cpm)
      {
        i = this.coK;
        this.coK = 0;
        AppMethodBeat.o(116488);
      }
      else
      {
        AppMethodBeat.o(116488);
      }
    }
  }

  public final void prepare()
  {
    AppMethodBeat.i(116491);
    if (this.cpa == com.tencent.mm.compatible.b.c.a.eoR)
    {
      if (this.coY != null)
        this.coY.prepare();
      AppMethodBeat.o(116491);
    }
    while (true)
    {
      return;
      if ((this.cpb != b.b.cpk) || (this.coL == null))
      {
        this.cpb = b.b.cpn;
        release();
        AppMethodBeat.o(116491);
      }
      else
      {
        this.cpb = b.b.cpl;
        AppMethodBeat.o(116491);
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(116492);
    if (this.cpa == com.tencent.mm.compatible.b.c.a.eoR)
    {
      if (this.coY != null)
        this.coY.release();
      AppMethodBeat.o(116492);
    }
    while (true)
    {
      return;
      if (this.cpb == b.b.cpm)
        EH();
      synchronized (coV)
      {
        if (this.coZ != null)
        {
          this.coZ.EB();
          this.coZ.cpM = null;
          this.coZ = null;
        }
        AppMethodBeat.o(116492);
        continue;
        ??? = b.b.cpl;
      }
    }
  }

  public final void setMaxDuration(int paramInt)
  {
    AppMethodBeat.i(116484);
    if (this.cpa == com.tencent.mm.compatible.b.c.a.eoR)
    {
      if (this.coY != null)
        this.coY.setMaxDuration(paramInt);
      AppMethodBeat.o(116484);
    }
    while (true)
    {
      return;
      this.coS = paramInt;
      AppMethodBeat.o(116484);
    }
  }

  public final void setOutputFile(String paramString)
  {
    AppMethodBeat.i(116483);
    if (this.cpa == com.tencent.mm.compatible.b.c.a.eoR)
      if (this.coY == null)
        AppMethodBeat.o(116483);
    while (true)
    {
      return;
      this.coY.setOutputFile(paramString);
      this.coL = paramString;
      AppMethodBeat.o(116483);
      continue;
      if (this.cpb == b.b.cpk)
      {
        this.coL = paramString;
        AppMethodBeat.o(116483);
      }
      else
      {
        ab.e("MicroMsg.MMAudioRecorder", "set output path on wrong state");
        this.cpb = b.b.cpn;
        AppMethodBeat.o(116483);
      }
    }
  }

  public final void start()
  {
    AppMethodBeat.i(116490);
    if (this.cpa == com.tencent.mm.compatible.b.c.a.eoR)
    {
      if (this.coY != null)
        this.coY.start();
      AppMethodBeat.o(116490);
      return;
    }
    ab.i("MicroMsg.MMAudioRecorder", "Start record now state: " + this.cpb + " recMode: " + this.cpa);
    if (this.cpb == b.b.cpl)
    {
      this.coT = System.currentTimeMillis();
      this.coU = 0;
    }
    for (this.cpb = b.b.cpm; ; this.cpb = b.b.cpn)
    {
      synchronized (coV)
      {
        this.coZ.EL();
        this.cpc = false;
        AppMethodBeat.o(116490);
      }
      g.RQ();
      g.RP().eJH.set(27, Integer.valueOf(1));
      ab.e("MicroMsg.MMAudioRecorder", "start() called on illegal state");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.b
 * JD-Core Version:    0.6.2
 */