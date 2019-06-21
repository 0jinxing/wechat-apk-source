package com.tencent.mm.audio.mix.f;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.d.a;
import com.tencent.mm.audio.mix.d.m;
import com.tencent.mm.audio.mix.e.i;
import com.tencent.mm.g.a.u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d
{
  AudioTrack aQf;
  private int channels;
  volatile HashMap<String, com.tencent.mm.ag.b> clD;
  volatile HashMap<String, Boolean> cmD;
  private Thread cnA;
  public com.tencent.mm.audio.mix.e.c cnB;
  b cnC;
  private m cnD;
  public g cnE;
  volatile HashMap<String, Boolean> cnF;
  volatile HashMap<String, Boolean> cnG;
  volatile HashMap<String, e<Integer>> cnH;
  volatile HashMap<String, com.tencent.mm.ag.d> cnI;
  private ArrayList<String> cnJ;
  private volatile HashMap<String, Long> cnK;
  private volatile HashMap<String, Integer> cnL;
  private volatile HashMap<String, Integer> cnM;
  private volatile HashMap<String, Integer> cnN;
  private volatile HashMap<String, Integer> cnO;
  private volatile HashMap<String, Integer> cnP;
  private byte[] cnQ;
  byte[] cnR;
  private short cnS;
  int cnT;
  private Runnable cnU;
  ArrayList<String> cnV;
  public a cnp;
  private int cnt;
  public AtomicBoolean cnu;
  AtomicBoolean cnv;
  public AtomicBoolean cnw;
  public Queue<com.tencent.mm.audio.mix.a.b> cnx;
  public Object cny;
  Object cnz;
  Handler mHandler;
  private int sampleRate;

  public d()
  {
    AppMethodBeat.i(137171);
    this.channels = 2;
    this.sampleRate = 44100;
    this.cnt = 4;
    this.cnu = new AtomicBoolean(false);
    this.cnv = new AtomicBoolean(false);
    this.cnw = new AtomicBoolean(true);
    this.cnx = new ArrayDeque();
    this.cny = new Object();
    this.cnz = new Object();
    this.clD = new HashMap();
    this.cnF = new HashMap();
    this.cnG = new HashMap();
    this.cnH = new HashMap();
    this.cnI = new HashMap();
    this.cmD = new HashMap();
    this.cnJ = new ArrayList();
    this.cnK = new HashMap();
    this.cnL = new HashMap();
    this.cnM = new HashMap();
    this.cnN = new HashMap();
    this.cnO = new HashMap();
    this.cnP = new HashMap();
    this.cnQ = new byte[3536];
    this.cnR = new byte[2];
    this.cnS = ((short)0);
    this.cnT = 0;
    this.cnU = new d.1(this);
    this.cnV = new ArrayList();
    this.cnB = new com.tencent.mm.audio.mix.e.c(this);
    com.tencent.mm.audio.mix.e.c localc = this.cnB;
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixController", "onInit");
    localc.Ea();
    localc.cmx.clear();
    localc.cmq = new com.tencent.mm.audio.mix.e.d();
    localc.cmq.init();
    if (this.cnD == null)
      this.cnD = new d.3(this);
    this.mHandler = new Handler(Looper.myLooper());
    AppMethodBeat.o(137171);
  }

  private void En()
  {
    AppMethodBeat.i(137180);
    try
    {
      if (this.cnA != null)
      {
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayerImpl", "stop playback thread id:%d", new Object[] { Long.valueOf(this.cnA.getId()) });
        this.cnA = null;
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(137180);
    }
  }

  // ERROR //
  private boolean createAudioTrack()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 264
    //   5: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: ldc 217
    //   10: ldc_w 265
    //   13: invokestatic 168	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: aload_0
    //   17: getfield 80	com/tencent/mm/audio/mix/f/d:channels	I
    //   20: iconst_1
    //   21: if_icmpne +184 -> 205
    //   24: iconst_4
    //   25: istore_1
    //   26: aload_0
    //   27: getfield 83	com/tencent/mm/audio/mix/f/d:sampleRate	I
    //   30: iload_1
    //   31: iconst_2
    //   32: invokestatic 269	android/media/AudioTrack:getMinBufferSize	(III)I
    //   35: istore_2
    //   36: aload_0
    //   37: iload_2
    //   38: sipush 3536
    //   41: idiv
    //   42: putfield 85	com/tencent/mm/audio/mix/f/d:cnt	I
    //   45: ldc 217
    //   47: ldc_w 271
    //   50: iconst_3
    //   51: anewarray 4	java/lang/Object
    //   54: dup
    //   55: iconst_0
    //   56: iload_2
    //   57: invokestatic 247	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   60: aastore
    //   61: dup
    //   62: iconst_1
    //   63: aload_0
    //   64: getfield 80	com/tencent/mm/audio/mix/f/d:channels	I
    //   67: invokestatic 247	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   70: aastore
    //   71: dup
    //   72: iconst_2
    //   73: aload_0
    //   74: getfield 83	com/tencent/mm/audio/mix/f/d:sampleRate	I
    //   77: invokestatic 247	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   80: aastore
    //   81: invokestatic 234	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   84: aload_0
    //   85: getfield 254	com/tencent/mm/audio/mix/f/d:aQf	Landroid/media/AudioTrack;
    //   88: ifnonnull +33 -> 121
    //   91: ldc 217
    //   93: ldc_w 273
    //   96: invokestatic 275	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   99: new 256	android/media/AudioTrack
    //   102: astore_3
    //   103: aload_3
    //   104: iconst_3
    //   105: aload_0
    //   106: getfield 83	com/tencent/mm/audio/mix/f/d:sampleRate	I
    //   109: iload_1
    //   110: iconst_2
    //   111: iload_2
    //   112: iconst_1
    //   113: invokespecial 278	android/media/AudioTrack:<init>	(IIIIII)V
    //   116: aload_0
    //   117: aload_3
    //   118: putfield 254	com/tencent/mm/audio/mix/f/d:aQf	Landroid/media/AudioTrack;
    //   121: aload_0
    //   122: getfield 254	com/tencent/mm/audio/mix/f/d:aQf	Landroid/media/AudioTrack;
    //   125: ifnull +14 -> 139
    //   128: aload_0
    //   129: getfield 254	com/tencent/mm/audio/mix/f/d:aQf	Landroid/media/AudioTrack;
    //   132: invokevirtual 282	android/media/AudioTrack:getState	()I
    //   135: iconst_1
    //   136: if_icmpeq +114 -> 250
    //   139: ldc 217
    //   141: ldc_w 284
    //   144: invokestatic 275	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   147: aload_0
    //   148: getfield 254	com/tencent/mm/audio/mix/f/d:aQf	Landroid/media/AudioTrack;
    //   151: ifnull +40 -> 191
    //   154: ldc 217
    //   156: ldc_w 286
    //   159: iconst_1
    //   160: anewarray 4	java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: aload_0
    //   166: getfield 254	com/tencent/mm/audio/mix/f/d:aQf	Landroid/media/AudioTrack;
    //   169: invokevirtual 282	android/media/AudioTrack:getState	()I
    //   172: invokestatic 247	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   175: aastore
    //   176: invokestatic 250	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: aload_0
    //   180: getfield 254	com/tencent/mm/audio/mix/f/d:aQf	Landroid/media/AudioTrack;
    //   183: invokevirtual 289	android/media/AudioTrack:release	()V
    //   186: aload_0
    //   187: aconst_null
    //   188: putfield 254	com/tencent/mm/audio/mix/f/d:aQf	Landroid/media/AudioTrack;
    //   191: ldc_w 264
    //   194: invokestatic 210	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   197: iconst_0
    //   198: istore 4
    //   200: aload_0
    //   201: monitorexit
    //   202: iload 4
    //   204: ireturn
    //   205: bipush 12
    //   207: istore_1
    //   208: goto -182 -> 26
    //   211: astore_3
    //   212: ldc 217
    //   214: aload_3
    //   215: ldc_w 291
    //   218: iconst_0
    //   219: anewarray 4	java/lang/Object
    //   222: invokestatic 295	com/tencent/mm/audio/mix/h/b:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   225: goto -104 -> 121
    //   228: astore_3
    //   229: aload_0
    //   230: monitorexit
    //   231: aload_3
    //   232: athrow
    //   233: astore_3
    //   234: ldc 217
    //   236: aload_3
    //   237: ldc_w 297
    //   240: iconst_0
    //   241: anewarray 4	java/lang/Object
    //   244: invokestatic 295	com/tencent/mm/audio/mix/h/b:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   247: goto -56 -> 191
    //   250: ldc_w 264
    //   253: invokestatic 210	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   256: iconst_1
    //   257: istore 4
    //   259: goto -59 -> 200
    //
    // Exception table:
    //   from	to	target	type
    //   99	121	211	java/lang/IllegalArgumentException
    //   2	24	228	finally
    //   26	99	228	finally
    //   99	121	228	finally
    //   121	139	228	finally
    //   139	179	228	finally
    //   179	191	228	finally
    //   191	197	228	finally
    //   212	225	228	finally
    //   234	247	228	finally
    //   250	256	228	finally
    //   179	191	233	java/lang/Exception
  }

  public final void DL()
  {
    AppMethodBeat.i(137181);
    try
    {
      if (this.aQf != null)
        this.aQf.setStereoVolume(0.0F, 0.0F);
      AppMethodBeat.o(137181);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", localException, "setVolume", new Object[0]);
        AppMethodBeat.o(137181);
      }
    }
  }

  public final void El()
  {
    AppMethodBeat.i(137173);
    this.cnu.set(false);
    this.cnw.set(true);
    this.cnv.set(false);
    Eq();
    En();
    AppMethodBeat.o(137173);
  }

  final void Em()
  {
    AppMethodBeat.i(137179);
    try
    {
      if (this.cnA == null)
      {
        Thread localThread = new java/lang/Thread;
        localThread.<init>(this.cnU, "audio_mix_player");
        this.cnA = localThread;
        this.cnA.start();
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayerImpl", "start playback thread id:%d", new Object[] { Long.valueOf(this.cnA.getId()) });
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(137179);
    }
  }

  public final com.tencent.mm.audio.mix.a.b Eo()
  {
    AppMethodBeat.i(137182);
    synchronized (this.cny)
    {
      while (true)
        if ((this.cnx.size() == 0) || (this.cnv.get()))
        {
          boolean bool = this.cnw.get();
          if (!bool)
            try
            {
              com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayerImpl", "wait play");
              DL();
              if ((this.aQf != null) && (this.aQf.getPlayState() == 3))
                this.aQf.stop();
              this.cny.wait();
              this.cnT = 0;
            }
            catch (InterruptedException localInterruptedException)
            {
              com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", localInterruptedException, "waitPlay", new Object[0]);
            }
        }
    }
    com.tencent.mm.audio.mix.a.b localb = (com.tencent.mm.audio.mix.a.b)this.cnx.poll();
    this.cny.notifyAll();
    AppMethodBeat.o(137182);
    return localb;
  }

  public final void Ep()
  {
    AppMethodBeat.i(137183);
    this.cnx.clear();
    AppMethodBeat.o(137183);
  }

  public final void Eq()
  {
    AppMethodBeat.i(137184);
    synchronized (this.cny)
    {
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayerImpl", "sync notify");
      try
      {
        this.cny.notifyAll();
        AppMethodBeat.o(137184);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", localException, "syncNotify", new Object[0]);
      }
    }
  }

  final void Er()
  {
    try
    {
      AppMethodBeat.i(137186);
      try
      {
        if (this.aQf != null)
        {
          this.aQf.flush();
          this.aQf.stop();
          this.aQf.release();
          this.aQf = null;
        }
        AppMethodBeat.o(137186);
        return;
      }
      catch (Exception localException)
      {
        while (true)
        {
          com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", localException, "releaseAudioTrack", new Object[0]);
          AppMethodBeat.o(137186);
        }
      }
    }
    finally
    {
    }
  }

  public final int Es()
  {
    int i = 0;
    AppMethodBeat.i(137191);
    label167: 
    while (true)
      synchronized (this.cnz)
      {
        Object localObject2 = this.cnH.keySet();
        Object localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>();
        ((ArrayList)localObject3).addAll((Collection)localObject2);
        localObject3 = ((ArrayList)localObject3).iterator();
        if (((Iterator)localObject3).hasNext())
        {
          localObject2 = (String)((Iterator)localObject3).next();
          localObject2 = (e)this.cnH.get(localObject2);
          if (localObject2 != null)
          {
            if (!((e)localObject2).g(new Integer[] { Integer.valueOf(0) }))
              if (!((e)localObject2).g(new Integer[] { Integer.valueOf(1) }))
                if (!((e)localObject2).g(new Integer[] { Integer.valueOf(2) }))
                  break label167;
            i++;
          }
        }
        else
        {
          AppMethodBeat.o(137191);
          return i;
        }
      }
  }

  public final ArrayList<String> Et()
  {
    AppMethodBeat.i(137192);
    this.cnJ.clear();
    this.cnV.clear();
    synchronized (this.cnz)
    {
      Object localObject2 = this.cnH.keySet();
      this.cnV.addAll((Collection)localObject2);
      localObject2 = this.cnV.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        String str = (String)((Iterator)localObject2).next();
        e locale = (e)this.cnH.get(str);
        if (locale != null)
          if (locale.g(new Integer[] { Integer.valueOf(2) }))
            this.cnJ.add(str);
      }
    }
    ??? = this.cnJ;
    AppMethodBeat.o(137192);
    return ???;
  }

  public final void a(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(137190);
    com.tencent.mm.ag.b localb = (com.tencent.mm.ag.b)this.clD.get(paramString1);
    if (localb == null)
      AppMethodBeat.o(137190);
    while (true)
    {
      return;
      u localu = new u();
      localu.csP.ckD = paramString1;
      localu.csP.action = paramInt1;
      localu.csP.appId = localb.appId;
      localu.csP.errCode = paramInt2;
      localu.csP.aIm = paramString2;
      localu.csP.state = u.gI(paramInt1);
      if (this.cnD != null)
        this.cnD.a(localu);
      AppMethodBeat.o(137190);
    }
  }

  public final void clearCache()
  {
    AppMethodBeat.i(137172);
    this.cnB.clearCache();
    this.clD.clear();
    this.cnF.clear();
    this.cnG.clear();
    synchronized (this.cnz)
    {
      this.cnH.clear();
      this.cnI.clear();
      this.cmD.clear();
      AppMethodBeat.o(137172);
      return;
    }
  }

  public final boolean dF(String paramString)
  {
    AppMethodBeat.i(137176);
    boolean bool;
    if (this.cnH.containsKey(paramString))
    {
      e locale = (e)this.cnH.get(paramString);
      if (locale != null)
        if (locale.g(new Integer[] { Integer.valueOf(0) }))
        {
          AppMethodBeat.o(137176);
          bool = true;
        }
    }
    while (true)
    {
      return bool;
      if ((!this.cnB.dJ(paramString)) && (this.cnp.dF(paramString)))
      {
        AppMethodBeat.o(137176);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(137176);
        bool = false;
      }
    }
  }

  public final com.tencent.mm.ag.b dQ(String paramString)
  {
    AppMethodBeat.i(137174);
    if (this.clD.containsKey(paramString))
    {
      paramString = (com.tencent.mm.ag.b)this.clD.get(paramString);
      AppMethodBeat.o(137174);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(137174);
    }
  }

  public final void dV(String paramString)
  {
    AppMethodBeat.i(137175);
    this.cnB.dI(paramString);
    synchronized (this.cnz)
    {
      this.cmD.remove(paramString);
      this.cnF.remove(paramString);
      this.cnG.put(paramString, Boolean.FALSE);
      if (this.cnp.dE(paramString))
        i(3, paramString);
      AppMethodBeat.o(137175);
      return;
    }
  }

  public final void e(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(137189);
    com.tencent.mm.ag.b localb = (com.tencent.mm.ag.b)this.clD.get(paramString1);
    if (localb == null)
      AppMethodBeat.o(137189);
    while (true)
    {
      return;
      u localu = new u();
      localu.csP.ckD = paramString1;
      localu.csP.action = paramInt;
      localu.csP.appId = localb.appId;
      paramString1 = paramString2;
      if (TextUtils.isEmpty(paramString2))
        paramString1 = localb.clP;
      localu.csP.clP = paramString1;
      localu.csP.state = u.gI(paramInt);
      if (this.cnD != null)
        this.cnD.a(localu);
      AppMethodBeat.o(137189);
    }
  }

  public final int ea(String paramString)
  {
    AppMethodBeat.i(137178);
    int i;
    if (this.clD.containsKey(paramString))
    {
      paramString = ((com.tencent.mm.ag.b)this.clD.get(paramString)).filePath;
      if (TextUtils.isEmpty(paramString))
      {
        AppMethodBeat.o(137178);
        i = 0;
      }
    }
    while (true)
    {
      return i;
      paramString = com.tencent.mm.audio.mix.b.d.Dm().dv(paramString);
      if (paramString != null)
      {
        i = (int)paramString.duration;
        AppMethodBeat.o(137178);
      }
      else
      {
        AppMethodBeat.o(137178);
        i = 0;
      }
    }
  }

  public final int ef(String paramString)
  {
    AppMethodBeat.i(137177);
    int i = (int)this.cnB.dL(paramString);
    AppMethodBeat.o(137177);
    return i;
  }

  public final int eg(String paramString)
  {
    AppMethodBeat.i(137187);
    int i;
    if (!this.cnH.containsKey(paramString))
    {
      AppMethodBeat.o(137187);
      i = -1;
    }
    while (true)
    {
      return i;
      paramString = (e)this.cnH.get(paramString);
      if (paramString != null)
      {
        i = ((Integer)paramString.get()).intValue();
        AppMethodBeat.o(137187);
      }
      else
      {
        AppMethodBeat.o(137187);
        i = -1;
      }
    }
  }

  public final void i(int paramInt, String paramString)
  {
    AppMethodBeat.i(137188);
    e(paramInt, paramString, this.cnB.dP(paramString));
    AppMethodBeat.o(137188);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.f.d
 * JD-Core Version:    0.6.2
 */