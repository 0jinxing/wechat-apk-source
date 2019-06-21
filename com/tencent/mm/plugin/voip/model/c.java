package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Timer;

public final class c
{
  private static float aQH = 0.0F;
  public AudioTrack aQf;
  Context context;
  private Timer cqh;
  private boolean cqi;
  private int eqg;
  int fZK;
  private int fZL;
  private Runnable fZM;
  private int fZO;
  int fZP;
  private boolean fZQ;
  private int iWl;
  private int nSamplerate;
  private int sNA;
  private int sNB;
  private int sNC;
  private int sND;
  private long sNE;
  private long sNF;
  private int sNG;
  private int sNH;
  private int sNI;
  private int sNJ;
  private long sNK;
  private int sNL;
  private int sNM;
  private final Object sNN;
  private int sNO;
  private int sNP;
  private int sNQ;
  private int sNR;
  public boolean sNi;
  boolean sNj;
  boolean sNk;
  k sNl;
  private int sNm;
  private byte[] sNn;
  private byte[] sNo;
  private byte[] sNp;
  private byte[] sNq;
  private byte[] sNr;
  private int sNs;
  public b sNt;
  private int sNu;
  private int sNv;
  private int sNw;
  private int sNx;
  private int sNy;
  private int sNz;

  public c()
  {
    AppMethodBeat.i(4323);
    this.sNi = false;
    this.sNj = false;
    this.sNk = true;
    this.sNl = null;
    this.fZK = 2;
    this.fZO = 0;
    this.sNm = 0;
    this.sNn = null;
    this.sNo = null;
    this.sNp = null;
    this.sNq = null;
    this.sNr = null;
    this.nSamplerate = 0;
    this.sNs = 0;
    this.fZL = 0;
    this.fZP = 20;
    this.aQf = null;
    this.sNt = null;
    this.cqh = null;
    this.cqi = false;
    this.sNu = 1;
    this.sNv = 1;
    this.sNw = 0;
    this.eqg = 3;
    this.fZQ = false;
    this.sNx = 0;
    this.sNy = 0;
    this.sNz = 0;
    this.sNA = 0;
    this.sNB = 0;
    this.sNC = 1;
    this.sND = 0;
    this.sNE = 0L;
    this.sNF = 0L;
    this.sNG = 1;
    this.sNH = 0;
    this.sNI = -1;
    this.sNJ = 0;
    this.sNK = 0L;
    this.sNL = 1;
    this.sNM = 0;
    this.sNN = new Object();
    this.sNO = 0;
    this.sNP = 0;
    this.iWl = 0;
    this.sNQ = 0;
    this.sNR = 0;
    AppMethodBeat.o(4323);
  }

  private int mk(boolean paramBoolean)
  {
    AppMethodBeat.i(4326);
    int i = 0;
    int j;
    if (q.etd.epH > 0)
    {
      i = g.KK().bE(paramBoolean);
      if ((!paramBoolean) || (q.etd.eqj < 0))
        break label118;
      j = q.etd.eqj;
      label45: i = j;
      if (1 == this.iWl)
      {
        if (q.etd.eqJ >= 0)
          j = q.etd.eqJ;
        if ((!paramBoolean) || (q.etd.eqK < 0))
          break label145;
        i = q.etd.eqK;
      }
    }
    while (true)
    {
      AppMethodBeat.o(4326);
      return i;
      if (q.etd.eqi < 0)
        break;
      i = q.etd.eqi;
      break;
      label118: j = i;
      if (paramBoolean)
        break label45;
      j = i;
      if (q.etd.eqk < 0)
        break label45;
      j = q.etd.eqk;
      break label45;
      label145: i = j;
      if (!paramBoolean)
      {
        i = j;
        if (q.etd.eqL >= 0)
          i = q.etd.eqL;
      }
    }
  }

  public final int G(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 1;
    if (true == this.sNi);
    for (paramInt1 = 0; ; paramInt1 = i)
    {
      return paramInt1;
      this.nSamplerate = paramInt1;
      this.sNs = paramInt2;
      this.fZL = paramInt3;
      this.iWl = paramInt4;
      this.fZP = (this.nSamplerate / 1000 * paramInt2 * this.fZL * 2);
      this.sNJ = (this.nSamplerate * 60 / 1000);
    }
  }

  public final int cIn()
  {
    return this.sNM / this.fZP * this.fZL;
  }

  public final int cIo()
  {
    AppMethodBeat.i(4327);
    if (this.aQf != null)
    {
      this.aQf.release();
      this.aQf = null;
    }
    this.sNi = false;
    this.sNj = false;
    AppMethodBeat.o(4327);
    return 1;
  }

  public final int cIp()
  {
    int i = 0;
    AppMethodBeat.i(4328);
    int j;
    if (true == this.sNi)
    {
      AppMethodBeat.o(4328);
      j = 1;
    }
    while (true)
    {
      return j;
      if (this.aQf == null)
      {
        ab.e("MicroMsg.Voip.AudioPlayer", "audioTrack error: audioTrack is null!!");
        AppMethodBeat.o(4328);
        j = i;
      }
      else
      {
        this.sNi = true;
        try
        {
          this.aQf.play();
          if (this.aQf.getPlayState() != 3)
          {
            this.sNO = 4;
            ab.e("MicroMsg.Voip.AudioPlayer", "audioTrack play error: AudioTrack.PLAYSTATE_PLAYING, play do not start !");
            AppMethodBeat.o(4328);
            j = i;
          }
        }
        catch (Exception localException)
        {
          while (true)
            ab.e("MicroMsg.Voip.AudioPlayer", "audioTrack.play Exception:%s", new Object[] { localException.getMessage() });
          if (this.aQf.getState() == 0)
          {
            ab.e("MicroMsg.Voip.AudioPlayer", "audioTrack error: AudioTrack.STATE_UNINITIALIZED, no more AudioTrack resource!!");
            AppMethodBeat.o(4328);
            j = i;
          }
          else
          {
            if (this.sNk)
            {
              if ((this.cqi) || (this.cqh != null))
              {
                ab.w("MicroMsg.Voip.AudioPlayer", "Timer has been created or, timer has been started, " + this.cqi);
                j = -1;
              }
              while (true)
              {
                if (j == 0)
                  break label256;
                ab.e("MicroMsg.Voip.AudioPlayer", "InitAudioRecTimer failed, error code = -1");
                AppMethodBeat.o(4328);
                j = i;
                break;
                this.cqh = new Timer();
                if (this.cqh == null)
                  j = -1;
                else
                  j = 0;
              }
              label256: this.cqh.scheduleAtFixedRate(new c.a(this), 0L, 20L);
              this.cqi = true;
            }
            this.fZM = new c.1(this);
            d.f(this.fZM, "AudioPlayer_play");
            AppMethodBeat.o(4328);
            j = 1;
          }
        }
      }
    }
  }

  public final int cIq()
  {
    int i = 0;
    AppMethodBeat.i(4329);
    if (this.nSamplerate == 0)
    {
      ab.e("MicroMsg.Voip.AudioPlayer", "nSamplerate is no init now  ");
      AppMethodBeat.o(4329);
    }
    while (true)
    {
      return i;
      if (this.aQf == null)
      {
        ab.d("MicroMsg.Voip.AudioPlayer", "  audioTrack==null,m_iPlayBufSizeOrg:" + this.sNB + ",nSamplerate:" + this.nSamplerate);
        i = this.sNB * 1000 / this.nSamplerate;
        AppMethodBeat.o(4329);
      }
      else if ((this.sNi) && (this.aQf.getState() != 0))
      {
        try
        {
          i = this.aQf.getPlaybackHeadPosition();
          i = (this.sNx - i) * 1000 / this.nSamplerate;
          AppMethodBeat.o(4329);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.Voip.AudioPlayer", "audioTrack getPlaybackHeadPosition error:%s", new Object[] { localException.getMessage() });
          i = this.sNB * 1000 / this.nSamplerate;
          AppMethodBeat.o(4329);
        }
      }
      else
      {
        i = this.sNB * 1000 / this.nSamplerate;
        AppMethodBeat.o(4329);
      }
    }
  }

  // ERROR //
  public final int cIr()
  {
    // Byte code:
    //   0: sipush 4330
    //   3: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 122	com/tencent/mm/plugin/voip/model/c:cqi	Z
    //   10: ifeq +22 -> 32
    //   13: aload_0
    //   14: getfield 120	com/tencent/mm/plugin/voip/model/c:cqh	Ljava/util/Timer;
    //   17: ifnull +15 -> 32
    //   20: aload_0
    //   21: getfield 120	com/tencent/mm/plugin/voip/model/c:cqh	Ljava/util/Timer;
    //   24: invokevirtual 367	java/util/Timer:cancel	()V
    //   27: aload_0
    //   28: iconst_0
    //   29: putfield 122	com/tencent/mm/plugin/voip/model/c:cqi	Z
    //   32: aload_0
    //   33: getfield 84	com/tencent/mm/plugin/voip/model/c:sNi	Z
    //   36: ifne +11 -> 47
    //   39: sipush 4330
    //   42: invokestatic 179	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   45: iconst_1
    //   46: ireturn
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield 84	com/tencent/mm/plugin/voip/model/c:sNi	Z
    //   52: aload_0
    //   53: iconst_0
    //   54: putfield 164	com/tencent/mm/plugin/voip/model/c:sNM	I
    //   57: aload_0
    //   58: getfield 332	com/tencent/mm/plugin/voip/model/c:fZM	Ljava/lang/Runnable;
    //   61: astore_1
    //   62: aload_1
    //   63: ifnull +15 -> 78
    //   66: getstatic 371	com/tencent/mm/sdk/g/d:xDG	Lcom/tencent/mm/sdk/g/a/e;
    //   69: aload_0
    //   70: getfield 332	com/tencent/mm/plugin/voip/model/c:fZM	Ljava/lang/Runnable;
    //   73: invokeinterface 377 2 0
    //   78: aload_0
    //   79: getfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   82: ifnull +26 -> 108
    //   85: aload_0
    //   86: getfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   89: invokevirtual 380	android/media/AudioTrack:stop	()V
    //   92: aload_0
    //   93: getfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   96: invokevirtual 263	android/media/AudioTrack:release	()V
    //   99: ldc_w 268
    //   102: ldc_w 382
    //   105: invokestatic 384	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   108: sipush 4330
    //   111: invokestatic 179	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   114: goto -69 -> 45
    //   117: astore_1
    //   118: ldc_w 268
    //   121: aload_1
    //   122: ldc_w 386
    //   125: iconst_0
    //   126: anewarray 4	java/lang/Object
    //   129: invokestatic 390	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: goto -54 -> 78
    //   135: astore_1
    //   136: ldc_w 268
    //   139: aload_1
    //   140: ldc_w 386
    //   143: iconst_0
    //   144: anewarray 4	java/lang/Object
    //   147: invokestatic 390	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: goto -72 -> 78
    //   153: astore_1
    //   154: ldc_w 268
    //   157: ldc_w 392
    //   160: iconst_1
    //   161: anewarray 4	java/lang/Object
    //   164: dup
    //   165: iconst_0
    //   166: aload_1
    //   167: invokevirtual 289	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   170: aastore
    //   171: invokestatic 292	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   174: goto -66 -> 108
    //
    // Exception table:
    //   from	to	target	type
    //   66	78	117	java/util/concurrent/ExecutionException
    //   57	62	135	java/lang/InterruptedException
    //   66	78	135	java/lang/InterruptedException
    //   118	132	135	java/lang/InterruptedException
    //   78	108	153	java/lang/Exception
  }

  public final int cIs()
  {
    AppMethodBeat.i(4331);
    ab.d("MicroMsg.Voip.AudioPlayer", "AudioPlayer  mAudioPlayErrState:" + this.sNO);
    int i = this.sNO;
    AppMethodBeat.o(4331);
    return i;
  }

  public final int cIt()
  {
    AppMethodBeat.i(4332);
    int i;
    if (this.aQf != null)
    {
      i = this.aQf.getStreamType();
      AppMethodBeat.o(4332);
    }
    while (true)
    {
      return i;
      i = mk(true);
      AppMethodBeat.o(4332);
    }
  }

  public final boolean mj(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(4325);
    ab.d("MicroMsg.Voip.AudioPlayer", "AudioPlayer enter to switchSpeakerPhone...");
    int i = mk(paramBoolean);
    if (g.KK().KP())
      i = 0;
    ab.d("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone:speakerOn:" + paramBoolean + ":streamtype:" + i);
    if ((this.aQf != null) && (i == this.aQf.getStreamType()))
    {
      ab.d("MicroMsg.Voip.AudioPlayer", "switchSpeakerPhone:stream type do not need to  change");
      AppMethodBeat.o(4325);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      cIr();
      this.fZQ = true;
      if (this.sNs == 2);
      for (this.fZK = 3; ; this.fZK = 2)
      {
        this.fZO = AudioTrack.getMinBufferSize(this.nSamplerate, this.fZK, 2);
        if ((this.fZO != -2) && (this.fZO != -1))
          break label184;
        this.fZQ = false;
        AppMethodBeat.o(4325);
        paramBoolean = bool;
        break;
      }
      label184: this.sNx = 0;
      this.sNA = 0;
      this.sNC = 1;
      this.sND = 0;
      this.sNE = 0L;
      this.sNF = 0L;
      this.sNG = 1;
      this.sNI = -1;
      this.sNJ = 0;
      this.sNB = this.fZO;
      this.sNH = (this.sNB * this.sNG);
      this.fZO *= this.sNL;
      float f = this.sNB / 16.0F;
      ab.d("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone:playBufSize:" + this.fZO + "  MinBufSizeInMs:" + f);
      if (this.aQf != null);
      try
      {
        this.aQf.stop();
        this.aQf.release();
        this.aQf = null;
        ab.i("MicroMsg.Voip.AudioPlayer", "AudioPlayer dkbt switchSpeakerPhone mode:%d issp:%b m:%d size %d,nSamplerate:%d", new Object[] { Integer.valueOf(g.KK().eoY.getMode()), Boolean.valueOf(g.KK().eoY.isSpeakerphoneOn()), Integer.valueOf(i), Integer.valueOf(this.fZO), Integer.valueOf(this.nSamplerate) });
        this.aQf = new e(i, this.nSamplerate, this.fZK, this.fZO);
        if ((this.aQf != null) && (this.aQf.getState() == 0))
        {
          ab.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone STATE_UNINITIALIZED call AudioTrack.release() and return");
          this.aQf.release();
          this.aQf = null;
          AppMethodBeat.o(4325);
          paramBoolean = bool;
        }
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone audioTrack.stop Exception:%s", new Object[] { localException.getMessage() });
        ab.d("MicroMsg.Voip.AudioPlayer", "AudioPlayer leave  switchSpeakerPhone...");
        if (this.aQf != null)
        {
          this.fZQ = false;
          cIp();
          AppMethodBeat.o(4325);
          paramBoolean = true;
        }
        else
        {
          this.fZQ = false;
          AppMethodBeat.o(4325);
          paramBoolean = bool;
        }
      }
    }
  }

  // ERROR //
  public final int x(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: sipush 4324
    //   3: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc_w 268
    //   9: ldc_w 472
    //   12: invokestatic 354	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: aload_0
    //   16: aload_1
    //   17: putfield 474	com/tencent/mm/plugin/voip/model/c:context	Landroid/content/Context;
    //   20: aload_0
    //   21: getfield 110	com/tencent/mm/plugin/voip/model/c:sNs	I
    //   24: iconst_2
    //   25: if_icmpne +56 -> 81
    //   28: aload_0
    //   29: iconst_3
    //   30: putfield 92	com/tencent/mm/plugin/voip/model/c:fZK	I
    //   33: aload_0
    //   34: aload_0
    //   35: getfield 108	com/tencent/mm/plugin/voip/model/c:nSamplerate	I
    //   38: aload_0
    //   39: getfield 92	com/tencent/mm/plugin/voip/model/c:fZK	I
    //   42: iconst_2
    //   43: invokestatic 421	android/media/AudioTrack:getMinBufferSize	(III)I
    //   46: putfield 94	com/tencent/mm/plugin/voip/model/c:fZO	I
    //   49: aload_0
    //   50: getfield 94	com/tencent/mm/plugin/voip/model/c:fZO	I
    //   53: bipush 254
    //   55: if_icmpeq +11 -> 66
    //   58: aload_0
    //   59: getfield 94	com/tencent/mm/plugin/voip/model/c:fZO	I
    //   62: iconst_m1
    //   63: if_icmpne +26 -> 89
    //   66: aload_0
    //   67: iconst_1
    //   68: putfield 168	com/tencent/mm/plugin/voip/model/c:sNO	I
    //   71: sipush 4324
    //   74: invokestatic 179	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   77: iconst_m1
    //   78: istore_3
    //   79: iload_3
    //   80: ireturn
    //   81: aload_0
    //   82: iconst_2
    //   83: putfield 92	com/tencent/mm/plugin/voip/model/c:fZK	I
    //   86: goto -53 -> 33
    //   89: aload_0
    //   90: aload_0
    //   91: getfield 94	com/tencent/mm/plugin/voip/model/c:fZO	I
    //   94: putfield 142	com/tencent/mm/plugin/voip/model/c:sNB	I
    //   97: aload_0
    //   98: aload_0
    //   99: getfield 142	com/tencent/mm/plugin/voip/model/c:sNB	I
    //   102: aload_0
    //   103: getfield 152	com/tencent/mm/plugin/voip/model/c:sNG	I
    //   106: imul
    //   107: putfield 154	com/tencent/mm/plugin/voip/model/c:sNH	I
    //   110: aload_0
    //   111: aload_0
    //   112: getfield 94	com/tencent/mm/plugin/voip/model/c:fZO	I
    //   115: aload_0
    //   116: getfield 162	com/tencent/mm/plugin/voip/model/c:sNL	I
    //   119: imul
    //   120: putfield 94	com/tencent/mm/plugin/voip/model/c:fZO	I
    //   123: aload_0
    //   124: getfield 142	com/tencent/mm/plugin/voip/model/c:sNB	I
    //   127: iconst_1
    //   128: ishr
    //   129: i2f
    //   130: aload_0
    //   131: getfield 108	com/tencent/mm/plugin/voip/model/c:nSamplerate	I
    //   134: i2f
    //   135: fdiv
    //   136: fstore 4
    //   138: invokestatic 479	com/tencent/mm/compatible/e/m:Lw	()I
    //   141: istore_3
    //   142: getstatic 207	com/tencent/mm/compatible/e/q:etd	Lcom/tencent/mm/compatible/e/b;
    //   145: getfield 482	com/tencent/mm/compatible/e/b:eqz	I
    //   148: istore 5
    //   150: iload_3
    //   151: sipush 1024
    //   154: iand
    //   155: ifeq +267 -> 422
    //   158: iload 5
    //   160: istore_3
    //   161: iload 5
    //   163: ifgt +5 -> 168
    //   166: iconst_0
    //   167: istore_3
    //   168: ldc_w 268
    //   171: ldc_w 484
    //   174: iload_3
    //   175: invokestatic 489	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   178: invokevirtual 493	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   181: invokestatic 384	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   184: ldc_w 494
    //   187: fload 4
    //   189: fmul
    //   190: ldc_w 495
    //   193: fcmpg
    //   194: iflt +10 -> 204
    //   197: aload_0
    //   198: getfield 172	com/tencent/mm/plugin/voip/model/c:iWl	I
    //   201: ifeq +5 -> 206
    //   204: iconst_0
    //   205: istore_3
    //   206: iload_3
    //   207: ifne +220 -> 427
    //   210: iconst_0
    //   211: istore 6
    //   213: aload_0
    //   214: iload 6
    //   216: putfield 88	com/tencent/mm/plugin/voip/model/c:sNk	Z
    //   219: ldc_w 268
    //   222: new 299	java/lang/StringBuilder
    //   225: dup
    //   226: ldc_w 497
    //   229: invokespecial 304	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   232: aload_0
    //   233: getfield 94	com/tencent/mm/plugin/voip/model/c:fZO	I
    //   236: invokevirtual 347	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   239: ldc_w 426
    //   242: invokevirtual 352	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: fload 4
    //   247: invokevirtual 429	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   250: ldc_w 499
    //   253: invokevirtual 352	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: aload_0
    //   257: getfield 88	com/tencent/mm/plugin/voip/model/c:sNk	Z
    //   260: invokevirtual 308	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   263: invokevirtual 311	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   266: invokestatic 354	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   269: aload_0
    //   270: iload_2
    //   271: invokespecial 401	com/tencent/mm/plugin/voip/model/c:mk	(Z)I
    //   274: istore_3
    //   275: aload_0
    //   276: getfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   279: astore_1
    //   280: aload_1
    //   281: ifnull +10 -> 291
    //   284: aload_0
    //   285: getfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   288: invokevirtual 263	android/media/AudioTrack:release	()V
    //   291: new 458	com/tencent/mm/compatible/b/e
    //   294: astore_1
    //   295: aload_1
    //   296: iload_3
    //   297: aload_0
    //   298: getfield 108	com/tencent/mm/plugin/voip/model/c:nSamplerate	I
    //   301: aload_0
    //   302: getfield 92	com/tencent/mm/plugin/voip/model/c:fZK	I
    //   305: aload_0
    //   306: getfield 94	com/tencent/mm/plugin/voip/model/c:fZO	I
    //   309: invokespecial 461	com/tencent/mm/compatible/b/e:<init>	(IIII)V
    //   312: aload_0
    //   313: aload_1
    //   314: putfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   317: aload_0
    //   318: getfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   321: ifnull +13 -> 334
    //   324: aload_0
    //   325: getfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   328: invokevirtual 295	android/media/AudioTrack:getState	()I
    //   331: ifne +59 -> 390
    //   334: aload_0
    //   335: iconst_2
    //   336: putfield 168	com/tencent/mm/plugin/voip/model/c:sNO	I
    //   339: ldc_w 268
    //   342: ldc_w 501
    //   345: invokestatic 275	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   348: aload_0
    //   349: getfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   352: ifnull +10 -> 362
    //   355: aload_0
    //   356: getfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   359: invokevirtual 263	android/media/AudioTrack:release	()V
    //   362: iload_3
    //   363: ifne +97 -> 460
    //   366: aload_0
    //   367: new 458	com/tencent/mm/compatible/b/e
    //   370: dup
    //   371: iconst_3
    //   372: aload_0
    //   373: getfield 108	com/tencent/mm/plugin/voip/model/c:nSamplerate	I
    //   376: aload_0
    //   377: getfield 92	com/tencent/mm/plugin/voip/model/c:fZK	I
    //   380: aload_0
    //   381: getfield 94	com/tencent/mm/plugin/voip/model/c:fZO	I
    //   384: invokespecial 461	com/tencent/mm/compatible/b/e:<init>	(IIII)V
    //   387: putfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   390: aload_0
    //   391: getfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   394: ifnonnull +93 -> 487
    //   397: aload_0
    //   398: iconst_3
    //   399: putfield 168	com/tencent/mm/plugin/voip/model/c:sNO	I
    //   402: ldc_w 268
    //   405: ldc_w 503
    //   408: invokestatic 275	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   411: sipush 4324
    //   414: invokestatic 179	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   417: iconst_m1
    //   418: istore_3
    //   419: goto -340 -> 79
    //   422: iconst_0
    //   423: istore_3
    //   424: goto -240 -> 184
    //   427: iconst_1
    //   428: istore 6
    //   430: goto -217 -> 213
    //   433: astore_1
    //   434: ldc_w 268
    //   437: ldc_w 505
    //   440: iconst_1
    //   441: anewarray 4	java/lang/Object
    //   444: dup
    //   445: iconst_0
    //   446: aload_1
    //   447: aastore
    //   448: invokestatic 507	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   451: aload_0
    //   452: bipush 6
    //   454: putfield 168	com/tencent/mm/plugin/voip/model/c:sNO	I
    //   457: goto -140 -> 317
    //   460: aload_0
    //   461: new 458	com/tencent/mm/compatible/b/e
    //   464: dup
    //   465: iconst_0
    //   466: aload_0
    //   467: getfield 108	com/tencent/mm/plugin/voip/model/c:nSamplerate	I
    //   470: aload_0
    //   471: getfield 92	com/tencent/mm/plugin/voip/model/c:fZK	I
    //   474: aload_0
    //   475: getfield 94	com/tencent/mm/plugin/voip/model/c:fZO	I
    //   478: invokespecial 461	com/tencent/mm/compatible/b/e:<init>	(IIII)V
    //   481: putfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   484: goto -94 -> 390
    //   487: aload_0
    //   488: getfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   491: invokevirtual 295	android/media/AudioTrack:getState	()I
    //   494: ifne +40 -> 534
    //   497: aload_0
    //   498: iconst_3
    //   499: putfield 168	com/tencent/mm/plugin/voip/model/c:sNO	I
    //   502: ldc_w 268
    //   505: ldc_w 509
    //   508: invokestatic 275	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   511: aload_0
    //   512: getfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   515: invokevirtual 263	android/media/AudioTrack:release	()V
    //   518: aload_0
    //   519: aconst_null
    //   520: putfield 116	com/tencent/mm/plugin/voip/model/c:aQf	Landroid/media/AudioTrack;
    //   523: sipush 4324
    //   526: invokestatic 179	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   529: iconst_m1
    //   530: istore_3
    //   531: goto -452 -> 79
    //   534: aload_0
    //   535: aload_0
    //   536: getfield 94	com/tencent/mm/plugin/voip/model/c:fZO	I
    //   539: newarray byte
    //   541: putfield 98	com/tencent/mm/plugin/voip/model/c:sNn	[B
    //   544: aload_0
    //   545: getfield 98	com/tencent/mm/plugin/voip/model/c:sNn	[B
    //   548: ifnonnull +23 -> 571
    //   551: ldc_w 268
    //   554: ldc_w 511
    //   557: invokestatic 275	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   560: sipush 4324
    //   563: invokestatic 179	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   566: iconst_m1
    //   567: istore_3
    //   568: goto -489 -> 79
    //   571: aload_0
    //   572: aload_0
    //   573: getfield 114	com/tencent/mm/plugin/voip/model/c:fZP	I
    //   576: newarray byte
    //   578: putfield 104	com/tencent/mm/plugin/voip/model/c:sNq	[B
    //   581: aload_0
    //   582: getfield 104	com/tencent/mm/plugin/voip/model/c:sNq	[B
    //   585: ifnonnull +23 -> 608
    //   588: ldc_w 268
    //   591: ldc_w 513
    //   594: invokestatic 275	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   597: sipush 4324
    //   600: invokestatic 179	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   603: iconst_m1
    //   604: istore_3
    //   605: goto -526 -> 79
    //   608: aload_0
    //   609: getfield 88	com/tencent/mm/plugin/voip/model/c:sNk	Z
    //   612: ifeq +122 -> 734
    //   615: aload_0
    //   616: aload_0
    //   617: getfield 94	com/tencent/mm/plugin/voip/model/c:fZO	I
    //   620: putfield 96	com/tencent/mm/plugin/voip/model/c:sNm	I
    //   623: aload_0
    //   624: aload_0
    //   625: getfield 96	com/tencent/mm/plugin/voip/model/c:sNm	I
    //   628: newarray byte
    //   630: putfield 100	com/tencent/mm/plugin/voip/model/c:sNo	[B
    //   633: aload_0
    //   634: getfield 100	com/tencent/mm/plugin/voip/model/c:sNo	[B
    //   637: ifnonnull +23 -> 660
    //   640: ldc_w 268
    //   643: ldc_w 515
    //   646: invokestatic 275	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   649: sipush 4324
    //   652: invokestatic 179	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   655: iconst_m1
    //   656: istore_3
    //   657: goto -578 -> 79
    //   660: aload_0
    //   661: aload_0
    //   662: getfield 96	com/tencent/mm/plugin/voip/model/c:sNm	I
    //   665: newarray byte
    //   667: putfield 102	com/tencent/mm/plugin/voip/model/c:sNp	[B
    //   670: aload_0
    //   671: getfield 102	com/tencent/mm/plugin/voip/model/c:sNp	[B
    //   674: ifnonnull +23 -> 697
    //   677: ldc_w 268
    //   680: ldc_w 517
    //   683: invokestatic 275	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   686: sipush 4324
    //   689: invokestatic 179	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   692: iconst_m1
    //   693: istore_3
    //   694: goto -615 -> 79
    //   697: aload_0
    //   698: aload_0
    //   699: getfield 114	com/tencent/mm/plugin/voip/model/c:fZP	I
    //   702: newarray byte
    //   704: putfield 106	com/tencent/mm/plugin/voip/model/c:sNr	[B
    //   707: aload_0
    //   708: getfield 106	com/tencent/mm/plugin/voip/model/c:sNr	[B
    //   711: ifnonnull +23 -> 734
    //   714: ldc_w 268
    //   717: ldc_w 519
    //   720: invokestatic 275	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   723: sipush 4324
    //   726: invokestatic 179	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   729: iconst_m1
    //   730: istore_3
    //   731: goto -652 -> 79
    //   734: aload_0
    //   735: iconst_0
    //   736: putfield 84	com/tencent/mm/plugin/voip/model/c:sNi	Z
    //   739: aload_0
    //   740: iconst_0
    //   741: putfield 86	com/tencent/mm/plugin/voip/model/c:sNj	Z
    //   744: ldc_w 268
    //   747: ldc_w 521
    //   750: iconst_5
    //   751: anewarray 4	java/lang/Object
    //   754: dup
    //   755: iconst_0
    //   756: invokestatic 218	com/tencent/mm/compatible/b/g:KK	()Lcom/tencent/mm/compatible/b/g;
    //   759: getfield 435	com/tencent/mm/compatible/b/g:eoY	Landroid/media/AudioManager;
    //   762: invokevirtual 440	android/media/AudioManager:getMode	()I
    //   765: invokestatic 446	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   768: aastore
    //   769: dup
    //   770: iconst_1
    //   771: invokestatic 218	com/tencent/mm/compatible/b/g:KK	()Lcom/tencent/mm/compatible/b/g;
    //   774: getfield 435	com/tencent/mm/compatible/b/g:eoY	Landroid/media/AudioManager;
    //   777: invokevirtual 449	android/media/AudioManager:isSpeakerphoneOn	()Z
    //   780: invokestatic 454	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   783: aastore
    //   784: dup
    //   785: iconst_2
    //   786: iload_3
    //   787: invokestatic 446	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   790: aastore
    //   791: dup
    //   792: iconst_3
    //   793: aload_0
    //   794: getfield 94	com/tencent/mm/plugin/voip/model/c:fZO	I
    //   797: invokestatic 446	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   800: aastore
    //   801: dup
    //   802: iconst_4
    //   803: aload_0
    //   804: getfield 108	com/tencent/mm/plugin/voip/model/c:nSamplerate	I
    //   807: invokestatic 446	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   810: aastore
    //   811: invokestatic 456	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   814: aload_0
    //   815: getfield 94	com/tencent/mm/plugin/voip/model/c:fZO	I
    //   818: sipush 1000
    //   821: imul
    //   822: aload_0
    //   823: getfield 108	com/tencent/mm/plugin/voip/model/c:nSamplerate	I
    //   826: iconst_2
    //   827: imul
    //   828: idiv
    //   829: istore_3
    //   830: sipush 4324
    //   833: invokestatic 179	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   836: goto -757 -> 79
    //   839: astore_1
    //   840: goto -549 -> 291
    //
    // Exception table:
    //   from	to	target	type
    //   275	280	433	java/lang/Exception
    //   291	317	433	java/lang/Exception
    //   284	291	839	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.c
 * JD-Core Version:    0.6.2
 */