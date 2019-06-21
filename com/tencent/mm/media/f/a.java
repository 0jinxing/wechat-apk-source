package com.tencent.mm.media.f;

import a.f.a.m;
import a.f.b.j;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.a.d;
import com.tencent.mm.audio.mix.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/mix/AudioMixCodec;", "", "sampleRate", "", "channels", "mixBackground", "", "mixMusic", "frameMix", "Lkotlin/Function0;", "", "frameMixEnd", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "data", "", "pts", "(IIZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "TAG", "", "backgroundFrameCount", "backgroundPcmDataList", "", "Lcom/tencent/mm/audio/mix/buffer/PcmDataTrack;", "kotlin.jvm.PlatformType", "", "bitDepth", "flushAllData", "flushLock", "Ljava/lang/Object;", "frameLength", "index", "isBackgroundEnd", "isMixing", "isMixingFinish", "isMusicEnd", "mAudioSyncMixController", "Lcom/tencent/mm/audio/mix/mix/AudioSyncMixController;", "mMixRunnable", "Ljava/lang/Runnable;", "mPts", "mixLock", "musicFrameCount", "musicPcmDataList", "pcmDataList", "getAudioData", "input", "pcmData", "audioId", "channelCount", "inputEnd", "runMix", "startMix", "stopMix", "zipPcmDataTrack", "buffer", "Companion", "plugin-mediaeditor_release"})
public final class a
{
  public static final a.a eWE;
  public final String TAG;
  private int channels;
  private final int cku;
  private final boolean eWA;
  private final boolean eWB;
  private a.f.a.a<y> eWC;
  public m<? super byte[], ? super Long, y> eWD;
  public final e eWk;
  private final int eWl;
  public long eWm;
  private List<d> eWn;
  private List<d> eWo;
  public final List<d> eWp;
  public volatile boolean eWq;
  public volatile boolean eWr;
  public volatile boolean eWs;
  public final Object eWt;
  public final Object eWu;
  private int eWv;
  private int eWw;
  private boolean eWx;
  private boolean eWy;
  private final Runnable eWz;
  private int index;
  private int sampleRate;

  static
  {
    AppMethodBeat.i(12987);
    eWE = new a.a((byte)0);
    AppMethodBeat.o(12987);
  }

  public a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, a.f.a.a<y> parama, m<? super byte[], ? super Long, y> paramm)
  {
    AppMethodBeat.i(12986);
    this.sampleRate = paramInt1;
    this.channels = paramInt2;
    this.eWA = paramBoolean1;
    this.eWB = paramBoolean2;
    this.eWC = parama;
    this.eWD = paramm;
    this.eWk = new e();
    this.cku = 2;
    this.eWl = 2048;
    this.eWn = Collections.synchronizedList((List)new ArrayList());
    this.eWo = Collections.synchronizedList((List)new ArrayList());
    this.eWp = Collections.synchronizedList((List)new ArrayList());
    this.TAG = "MicroMsg.AudioMixCodec";
    this.eWt = new Object();
    this.eWu = new Object();
    ab.i(this.TAG, "init AudioMixCodec, sampleRate:" + this.sampleRate + ", channels:" + this.channels + ", mixBackground:" + this.eWA + ", mixMusic:" + this.eWB);
    this.eWk.r(this.sampleRate, this.channels, this.cku, this.eWl);
    this.eWz = ((Runnable)new a.b(this));
    AppMethodBeat.o(12986);
  }

  // ERROR //
  public final boolean a(byte[] paramArrayOfByte, String paramString, long paramLong, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: sipush 12985
    //   3: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: ldc_w 357
    //   10: invokestatic 125	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   13: aload_2
    //   14: ldc_w 358
    //   17: invokestatic 125	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_0
    //   21: getfield 172	com/tencent/mm/media/f/a:eWt	Ljava/lang/Object;
    //   24: astore 7
    //   26: aload 7
    //   28: monitorenter
    //   29: aload_0
    //   30: getfield 170	com/tencent/mm/media/f/a:TAG	Ljava/lang/String;
    //   33: astore 8
    //   35: new 176	java/lang/StringBuilder
    //   38: astore 9
    //   40: aload 9
    //   42: ldc_w 360
    //   45: invokespecial 181	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   48: aload 8
    //   50: aload 9
    //   52: aload_1
    //   53: arraylength
    //   54: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   57: ldc_w 362
    //   60: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: aload_2
    //   64: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: ldc_w 364
    //   70: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: iload 5
    //   75: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   78: ldc_w 366
    //   81: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: iload 6
    //   86: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   89: ldc_w 368
    //   92: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: lload_3
    //   96: invokevirtual 331	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   99: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokestatic 206	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: new 260	com/tencent/mm/audio/mix/a/d
    //   108: astore 8
    //   110: aload 8
    //   112: invokespecial 369	com/tencent/mm/audio/mix/a/d:<init>	()V
    //   115: aload 8
    //   117: aload_2
    //   118: putfield 316	com/tencent/mm/audio/mix/a/d:ckD	Ljava/lang/String;
    //   121: aload 8
    //   123: aload_1
    //   124: putfield 373	com/tencent/mm/audio/mix/a/d:ckv	[B
    //   127: aload 8
    //   129: iload 5
    //   131: putfield 374	com/tencent/mm/audio/mix/a/d:sampleRate	I
    //   134: aload 8
    //   136: iload 6
    //   138: putfield 375	com/tencent/mm/audio/mix/a/d:channels	I
    //   141: aload 8
    //   143: lload_3
    //   144: putfield 324	com/tencent/mm/audio/mix/a/d:ckG	J
    //   147: aload_2
    //   148: invokevirtual 380	java/lang/String:hashCode	()I
    //   151: lookupswitch	default:+25->176, -1332194002:+244->395, 104263205:+99->250
    //   177: getfield 136	com/tencent/mm/media/f/a:eWB	Z
    //   180: ifeq +319 -> 499
    //   183: aload_0
    //   184: getfield 134	com/tencent/mm/media/f/a:eWA	Z
    //   187: ifeq +312 -> 499
    //   190: aload_0
    //   191: getfield 164	com/tencent/mm/media/f/a:eWo	Ljava/util/List;
    //   194: invokeinterface 252 1 0
    //   199: ifle +36 -> 235
    //   202: aload_0
    //   203: getfield 162	com/tencent/mm/media/f/a:eWn	Ljava/util/List;
    //   206: invokeinterface 252 1 0
    //   211: istore 5
    //   213: iload 5
    //   215: ifle +20 -> 235
    //   218: aload_0
    //   219: getfield 170	com/tencent/mm/media/f/a:TAG	Ljava/lang/String;
    //   222: ldc_w 382
    //   225: invokestatic 206	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   228: aload_0
    //   229: getfield 172	com/tencent/mm/media/f/a:eWt	Ljava/lang/Object;
    //   232: invokevirtual 385	java/lang/Object:notifyAll	()V
    //   235: getstatic 277	a/y:AUy	La/y;
    //   238: astore_1
    //   239: aload 7
    //   241: monitorexit
    //   242: sipush 12985
    //   245: invokestatic 116	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   248: iconst_1
    //   249: ireturn
    //   250: aload_2
    //   251: ldc_w 318
    //   254: invokevirtual 388	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   257: ifeq -81 -> 176
    //   260: aload_0
    //   261: getfield 170	com/tencent/mm/media/f/a:TAG	Ljava/lang/String;
    //   264: astore_1
    //   265: new 176	java/lang/StringBuilder
    //   268: astore_2
    //   269: aload_2
    //   270: ldc_w 390
    //   273: invokespecial 181	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   276: aload_1
    //   277: aload_2
    //   278: aload_0
    //   279: getfield 164	com/tencent/mm/media/f/a:eWo	Ljava/util/List;
    //   282: invokeinterface 252 1 0
    //   287: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   290: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   293: invokestatic 206	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   296: aload_0
    //   297: getfield 164	com/tencent/mm/media/f/a:eWo	Ljava/util/List;
    //   300: aload 8
    //   302: invokeinterface 264 2 0
    //   307: pop
    //   308: aload_0
    //   309: getfield 170	com/tencent/mm/media/f/a:TAG	Ljava/lang/String;
    //   312: astore_1
    //   313: new 176	java/lang/StringBuilder
    //   316: astore_2
    //   317: aload_2
    //   318: ldc_w 392
    //   321: invokespecial 181	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   324: aload_0
    //   325: getfield 394	com/tencent/mm/media/f/a:eWw	I
    //   328: istore 5
    //   330: aload_0
    //   331: iload 5
    //   333: iconst_1
    //   334: iadd
    //   335: putfield 394	com/tencent/mm/media/f/a:eWw	I
    //   338: aload_1
    //   339: aload_2
    //   340: iload 5
    //   342: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   345: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   348: invokestatic 206	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   351: goto -175 -> 176
    //   354: astore_1
    //   355: aload_0
    //   356: getfield 170	com/tencent/mm/media/f/a:TAG	Ljava/lang/String;
    //   359: aload_1
    //   360: checkcast 396	java/lang/Throwable
    //   363: ldc_w 397
    //   366: iconst_0
    //   367: anewarray 4	java/lang/Object
    //   370: invokestatic 401	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   373: getstatic 407	com/tencent/mm/media/i/c:faj	Lcom/tencent/mm/media/i/c;
    //   376: astore_1
    //   377: invokestatic 410	com/tencent/mm/media/i/c:VQ	()V
    //   380: goto -145 -> 235
    //   383: astore_1
    //   384: aload 7
    //   386: monitorexit
    //   387: sipush 12985
    //   390: invokestatic 116	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   393: aload_1
    //   394: athrow
    //   395: aload_2
    //   396: ldc_w 412
    //   399: invokevirtual 388	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   402: ifeq -226 -> 176
    //   405: aload_0
    //   406: getfield 170	com/tencent/mm/media/f/a:TAG	Ljava/lang/String;
    //   409: astore_1
    //   410: new 176	java/lang/StringBuilder
    //   413: astore_2
    //   414: aload_2
    //   415: ldc_w 414
    //   418: invokespecial 181	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   421: aload_1
    //   422: aload_2
    //   423: aload_0
    //   424: getfield 162	com/tencent/mm/media/f/a:eWn	Ljava/util/List;
    //   427: invokeinterface 252 1 0
    //   432: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   435: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   438: invokestatic 206	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   441: aload_0
    //   442: getfield 162	com/tencent/mm/media/f/a:eWn	Ljava/util/List;
    //   445: aload 8
    //   447: invokeinterface 264 2 0
    //   452: pop
    //   453: aload_0
    //   454: getfield 170	com/tencent/mm/media/f/a:TAG	Ljava/lang/String;
    //   457: astore_2
    //   458: new 176	java/lang/StringBuilder
    //   461: astore_1
    //   462: aload_1
    //   463: ldc_w 416
    //   466: invokespecial 181	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   469: aload_0
    //   470: getfield 418	com/tencent/mm/media/f/a:eWv	I
    //   473: istore 5
    //   475: aload_0
    //   476: iload 5
    //   478: iconst_1
    //   479: iadd
    //   480: putfield 418	com/tencent/mm/media/f/a:eWv	I
    //   483: aload_2
    //   484: aload_1
    //   485: iload 5
    //   487: invokevirtual 185	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   490: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   493: invokestatic 206	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   496: goto -320 -> 176
    //   499: aload_0
    //   500: getfield 136	com/tencent/mm/media/f/a:eWB	Z
    //   503: ifne +10 -> 513
    //   506: aload_0
    //   507: getfield 134	com/tencent/mm/media/f/a:eWA	Z
    //   510: ifeq -275 -> 235
    //   513: aload_0
    //   514: getfield 164	com/tencent/mm/media/f/a:eWo	Ljava/util/List;
    //   517: invokeinterface 252 1 0
    //   522: ifgt +19 -> 541
    //   525: aload_0
    //   526: getfield 162	com/tencent/mm/media/f/a:eWn	Ljava/util/List;
    //   529: invokeinterface 252 1 0
    //   534: istore 5
    //   536: iload 5
    //   538: ifle -303 -> 235
    //   541: aload_0
    //   542: getfield 170	com/tencent/mm/media/f/a:TAG	Ljava/lang/String;
    //   545: ldc_w 382
    //   548: invokestatic 206	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   551: aload_0
    //   552: getfield 172	com/tencent/mm/media/f/a:eWt	Ljava/lang/Object;
    //   555: invokevirtual 385	java/lang/Object:notifyAll	()V
    //   558: goto -323 -> 235
    //   561: astore_1
    //   562: goto -327 -> 235
    //   565: astore_1
    //   566: goto -331 -> 235
    //
    // Exception table:
    //   from	to	target	type
    //   29	176	354	java/lang/Exception
    //   176	213	354	java/lang/Exception
    //   250	351	354	java/lang/Exception
    //   395	496	354	java/lang/Exception
    //   499	513	354	java/lang/Exception
    //   513	536	354	java/lang/Exception
    //   29	176	383	finally
    //   176	213	383	finally
    //   218	235	383	finally
    //   235	239	383	finally
    //   250	351	383	finally
    //   355	380	383	finally
    //   395	496	383	finally
    //   499	513	383	finally
    //   513	536	383	finally
    //   541	558	383	finally
    //   541	558	561	java/lang/Exception
    //   218	235	565	java/lang/Exception
  }

  public final void lV(String paramString)
  {
    int i = 1;
    AppMethodBeat.i(12984);
    j.p(paramString, "audioId");
    while (true)
    {
      boolean bool;
      int j;
      synchronized (this.eWt)
      {
        String str = this.TAG;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("inputEnd, audioId:");
        ab.i(str, paramString + ", mixBackground:" + this.eWA + ", mixMusic:" + this.eWB);
        if (j.j(paramString, "background"))
          this.eWx = true;
        if (j.j(paramString, "music"))
          this.eWy = true;
        if ((this.eWA) && (this.eWB))
          if (this.eWy)
          {
            bool = this.eWx;
            if (bool)
            {
              j = i;
              if (j == 0);
            }
          }
      }
      try
      {
        this.eWs = true;
        ab.i(this.TAG, "notify mix");
        this.eWt.notifyAll();
        label171: paramString = y.AUy;
        AppMethodBeat.o(12984);
        return;
        j = 0;
        continue;
        if (this.eWA)
        {
          j = i;
          if (this.eWx)
            continue;
        }
        if (this.eWB)
        {
          bool = this.eWy;
          j = i;
          if (bool)
            continue;
        }
        j = 0;
        continue;
        paramString = finally;
        AppMethodBeat.o(12984);
        throw paramString;
      }
      catch (Exception paramString)
      {
        break label171;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.f.a
 * JD-Core Version:    0.6.2
 */