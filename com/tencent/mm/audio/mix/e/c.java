package com.tencent.mm.audio.mix.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c
{
  protected Object ckQ;
  volatile LinkedList<String> ckw;
  protected AtomicBoolean clS;
  protected AtomicBoolean clT;
  private Object cmA;
  private List<com.tencent.mm.audio.mix.a.d> cmB;
  private volatile HashMap<String, Boolean> cmC;
  private volatile HashMap<String, Boolean> cmD;
  private volatile HashMap<String, Integer> cmE;
  private volatile HashMap<String, Long> cmF;
  public long cmG;
  private boolean cmH;
  int cmI;
  long cmJ;
  private long cmK;
  private long cmL;
  private Runnable cmM;
  public i cmq;
  com.tencent.mm.audio.mix.f.d cmr;
  protected AtomicBoolean cms;
  protected volatile HashMap<String, Boolean> cmt;
  private Thread cmu;
  private volatile LinkedList<String> cmv;
  private volatile HashMap<String, Object> cmw;
  public volatile HashMap<String, List<com.tencent.mm.audio.mix.a.d>> cmx;
  private volatile HashMap<String, Boolean> cmy;
  public volatile HashMap<String, WeakReference<com.tencent.mm.audio.mix.d.c>> cmz;

  public c(com.tencent.mm.audio.mix.f.d paramd)
  {
    AppMethodBeat.i(137088);
    this.clT = new AtomicBoolean(false);
    this.clS = new AtomicBoolean(false);
    this.cms = new AtomicBoolean(false);
    this.cmt = new HashMap();
    this.ckQ = new Object();
    this.cmv = new LinkedList();
    this.cmw = new HashMap();
    this.cmx = new HashMap();
    this.cmy = new HashMap();
    this.cmz = new HashMap();
    this.cmA = new Object();
    this.cmB = new ArrayList();
    this.cmC = new HashMap();
    this.cmD = new HashMap();
    this.cmE = new HashMap();
    this.cmF = new HashMap();
    this.ckw = new LinkedList();
    this.cmG = 0L;
    this.cmH = false;
    this.cmI = 0;
    this.cmJ = 0L;
    this.cmK = 0L;
    this.cmL = 0L;
    this.cmM = new c.1(this);
    this.cmr = paramd;
    AppMethodBeat.o(137088);
  }

  private void DU()
  {
    AppMethodBeat.i(137092);
    synchronized (this.ckQ)
    {
      try
      {
        this.ckQ.notify();
        AppMethodBeat.o(137092);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioMixController", localException, "notifyMix", new Object[0]);
      }
    }
  }

  private void DW()
  {
    AppMethodBeat.i(137094);
    try
    {
      this.cmA.notifyAll();
      AppMethodBeat.o(137094);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioMixController", localException, "notifySyncPcmData", new Object[0]);
        AppMethodBeat.o(137094);
      }
    }
  }

  private void DZ()
  {
    AppMethodBeat.i(137111);
    for (int i = 0; i < this.cmv.size(); i++)
      ((List)this.cmx.get(this.cmv.get(i))).clear();
    AppMethodBeat.o(137111);
  }

  static void H(List<com.tencent.mm.audio.mix.a.d> paramList)
  {
    AppMethodBeat.i(137114);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      com.tencent.mm.audio.mix.a.d locald = (com.tencent.mm.audio.mix.a.d)paramList.next();
      if ((locald != null) && (locald.ckH))
        com.tencent.mm.audio.mix.b.b.Di().b(locald);
    }
    AppMethodBeat.o(137114);
  }

  private boolean dN(String paramString)
  {
    AppMethodBeat.i(137105);
    synchronized (this.cmA)
    {
      if ((this.cmC.containsKey(paramString)) && (((Boolean)this.cmC.get(paramString)).booleanValue()))
      {
        bool = true;
        AppMethodBeat.o(137105);
        return bool;
      }
      boolean bool = false;
      AppMethodBeat.o(137105);
    }
  }

  private void dO(String paramString)
  {
    AppMethodBeat.i(137106);
    this.cmr.i(5, paramString);
    dK(paramString);
    AppMethodBeat.o(137106);
  }

  public final boolean DB()
  {
    AppMethodBeat.i(138669);
    boolean bool = this.clT.get();
    AppMethodBeat.o(138669);
    return bool;
  }

  public final void DR()
  {
    AppMethodBeat.i(137089);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixController", "prepareMix");
    this.clT.set(false);
    this.clS.set(false);
    Ea();
    DU();
    AppMethodBeat.o(137089);
  }

  public final void DS()
  {
    AppMethodBeat.i(137090);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixController", "pauseMix");
    this.clS.set(true);
    if (this.cmI > 0)
    {
      this.cmG = (this.cmJ / this.cmI);
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixController", "mixAverageTime:%d", new Object[] { Long.valueOf(this.cmG) });
    }
    this.cmK = 0L;
    this.cmI = 0;
    this.cmJ = 0L;
    this.cmL = 0L;
    AppMethodBeat.o(137090);
  }

  public final void DT()
  {
    AppMethodBeat.i(137091);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixController", "stopMix");
    this.clT.set(true);
    this.clS.set(false);
    DU();
    synchronized (this.cmA)
    {
      DW();
      DZ();
      Eb();
      AppMethodBeat.o(137091);
      return;
    }
  }

  public final void DV()
  {
    AppMethodBeat.i(137093);
    synchronized (this.ckQ)
    {
      while (true)
        if (!this.clT.get())
        {
          boolean bool = this.clS.get();
          if (bool)
            try
            {
              com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixController", "waitMix");
              this.ckQ.wait();
            }
            catch (Exception localException)
            {
              com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioMixController", localException, "waitMix", new Object[0]);
            }
        }
    }
    AppMethodBeat.o(137093);
  }

  public final boolean DX()
  {
    AppMethodBeat.i(137098);
    boolean bool = this.cms.get();
    AppMethodBeat.o(137098);
    return bool;
  }

  protected final List<com.tencent.mm.audio.mix.a.d> DY()
  {
    AppMethodBeat.i(137109);
    ArrayList localArrayList = new ArrayList();
    int i;
    synchronized (this.cmA)
    {
      localArrayList.addAll(this.cmv);
      i = 0;
      if (i >= localArrayList.size())
        break label388;
      ??? = (String)localArrayList.get(i);
    }
    while (true)
    {
      synchronized (this.cmA)
      {
        if ((this.cmy.containsKey(???)) && (((Boolean)this.cmy.get(???)).booleanValue()))
        {
          i++;
          break;
          localObject1 = finally;
          AppMethodBeat.o(137109);
          throw localObject1;
        }
        ??? = (List)this.cmx.get(???);
        if ((??? == null) || (((List)???).size() == 0))
        {
          if (!dN((String)???))
            continue;
          l((String)???, false);
          dO((String)???);
        }
      }
      if (this.cmz.containsKey(???))
      {
        localObject8 = (WeakReference)this.cmz.get(???);
        if ((localObject8 != null) && (((WeakReference)localObject8).get() != null))
        {
          localObject8 = (com.tencent.mm.audio.mix.d.c)((WeakReference)localObject8).get();
          if (localObject8 != null)
            ((com.tencent.mm.audio.mix.d.c)localObject8).gx(((List)???).size());
        }
      }
      Object localObject8 = this.cmw.get(???);
      if (localObject8 != null)
      {
        int j;
        try
        {
          j = ((List)???).size();
          if (j <= 0)
            continue;
        }
        finally
        {
          AppMethodBeat.o(137109);
        }
        ??? = (com.tencent.mm.audio.mix.a.d)((List)???).remove(j - 1);
        if ((this.cmE.containsKey(???)) && (((Integer)this.cmE.get(???)).intValue() > ((com.tencent.mm.audio.mix.a.d)???).ckG));
        this.cmF.put(???, Long.valueOf(((com.tencent.mm.audio.mix.a.d)???).ckG));
        this.cmB.add(???);
        this.ckw.add(???);
      }
    }
    label388: synchronized (this.cmA)
    {
      if (this.cmB.size() == 0)
      {
        boolean bool = this.clT.get();
        if (bool);
      }
      try
      {
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixController", "wait read data");
        this.cmA.wait();
        ??? = this.cmB;
        AppMethodBeat.o(137109);
        return ???;
      }
      catch (Exception localException)
      {
        while (true)
          com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioMixController", localException, "readMixDataFromPcmTrack", new Object[0]);
      }
    }
  }

  public final void Ea()
  {
    AppMethodBeat.i(137112);
    if (this.cmu == null)
    {
      this.cmu = new Thread(this.cmM, "audio_mix_controller");
      this.cmu.start();
    }
    AppMethodBeat.o(137112);
  }

  public final void Eb()
  {
    if (this.cmu != null)
      this.cmu = null;
  }

  // ERROR //
  public final int a(String paramString, com.tencent.mm.audio.mix.a.d arg2, com.tencent.mm.audio.mix.d.c paramc)
  {
    // Byte code:
    //   0: ldc_w 358
    //   3: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_2
    //   7: ifnull +17 -> 24
    //   10: aload_1
    //   11: invokestatic 364	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   14: ifne +10 -> 24
    //   17: aload_2
    //   18: getfield 368	com/tencent/mm/audio/mix/a/d:ckv	[B
    //   21: ifnonnull +23 -> 44
    //   24: ldc 145
    //   26: ldc_w 370
    //   29: invokestatic 373	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   32: ldc_w 358
    //   35: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   38: iconst_0
    //   39: istore 4
    //   41: iload 4
    //   43: ireturn
    //   44: aconst_null
    //   45: astore 5
    //   47: aconst_null
    //   48: astore 6
    //   50: aload_0
    //   51: getfield 90	com/tencent/mm/audio/mix/e/c:cmx	Ljava/util/HashMap;
    //   54: aload_1
    //   55: invokevirtual 219	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   58: ifne +112 -> 170
    //   61: ldc 145
    //   63: ldc_w 375
    //   66: iconst_1
    //   67: anewarray 4	java/lang/Object
    //   70: dup
    //   71: iconst_0
    //   72: aload_1
    //   73: aastore
    //   74: invokestatic 377	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   77: aload_0
    //   78: getfield 96	com/tencent/mm/audio/mix/e/c:cmA	Ljava/lang/Object;
    //   81: astore 7
    //   83: aload 7
    //   85: monitorenter
    //   86: aload_0
    //   87: getfield 90	com/tencent/mm/audio/mix/e/c:cmx	Ljava/util/HashMap;
    //   90: astore 5
    //   92: new 98	java/util/ArrayList
    //   95: astore 8
    //   97: aload 8
    //   99: invokespecial 99	java/util/ArrayList:<init>	()V
    //   102: aload 5
    //   104: aload_1
    //   105: aload 8
    //   107: invokevirtual 333	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   110: pop
    //   111: aload_0
    //   112: getfield 86	com/tencent/mm/audio/mix/e/c:cmv	Ljava/util/LinkedList;
    //   115: aload_1
    //   116: invokevirtual 380	java/util/LinkedList:contains	(Ljava/lang/Object;)Z
    //   119: ifne +12 -> 131
    //   122: aload_0
    //   123: getfield 86	com/tencent/mm/audio/mix/e/c:cmv	Ljava/util/LinkedList;
    //   126: aload_1
    //   127: invokevirtual 337	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   130: pop
    //   131: aload 6
    //   133: astore 5
    //   135: aload_0
    //   136: getfield 88	com/tencent/mm/audio/mix/e/c:cmw	Ljava/util/HashMap;
    //   139: aload_1
    //   140: invokevirtual 219	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   143: ifne +24 -> 167
    //   146: new 4	java/lang/Object
    //   149: astore 5
    //   151: aload 5
    //   153: invokespecial 56	java/lang/Object:<init>	()V
    //   156: aload_0
    //   157: getfield 88	com/tencent/mm/audio/mix/e/c:cmw	Ljava/util/HashMap;
    //   160: aload_1
    //   161: aload 5
    //   163: invokevirtual 333	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   166: pop
    //   167: aload 7
    //   169: monitorexit
    //   170: aload 5
    //   172: astore 6
    //   174: aload 5
    //   176: ifnonnull +58 -> 234
    //   179: aload_0
    //   180: getfield 88	com/tencent/mm/audio/mix/e/c:cmw	Ljava/util/HashMap;
    //   183: aload_1
    //   184: invokevirtual 219	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   187: ifne +160 -> 347
    //   190: aload_0
    //   191: getfield 96	com/tencent/mm/audio/mix/e/c:cmA	Ljava/lang/Object;
    //   194: astore 5
    //   196: aload 5
    //   198: monitorenter
    //   199: aload_0
    //   200: getfield 88	com/tencent/mm/audio/mix/e/c:cmw	Ljava/util/HashMap;
    //   203: aload_1
    //   204: invokevirtual 219	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   207: ifne +115 -> 322
    //   210: new 4	java/lang/Object
    //   213: astore 6
    //   215: aload 6
    //   217: invokespecial 56	java/lang/Object:<init>	()V
    //   220: aload_0
    //   221: getfield 88	com/tencent/mm/audio/mix/e/c:cmw	Ljava/util/HashMap;
    //   224: aload_1
    //   225: aload 6
    //   227: invokevirtual 333	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   230: pop
    //   231: aload 5
    //   233: monitorexit
    //   234: aload 6
    //   236: ifnonnull +208 -> 444
    //   239: new 4	java/lang/Object
    //   242: dup
    //   243: invokespecial 56	java/lang/Object:<init>	()V
    //   246: astore 6
    //   248: aload_0
    //   249: getfield 94	com/tencent/mm/audio/mix/e/c:cmz	Ljava/util/HashMap;
    //   252: aload_1
    //   253: invokevirtual 219	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   256: ifne +20 -> 276
    //   259: aload_0
    //   260: getfield 94	com/tencent/mm/audio/mix/e/c:cmz	Ljava/util/HashMap;
    //   263: aload_1
    //   264: new 311	java/lang/ref/WeakReference
    //   267: dup
    //   268: aload_3
    //   269: invokespecial 383	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   272: invokevirtual 333	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   275: pop
    //   276: aload_0
    //   277: getfield 90	com/tencent/mm/audio/mix/e/c:cmx	Ljava/util/HashMap;
    //   280: aload_1
    //   281: invokevirtual 173	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   284: checkcast 175	java/util/List
    //   287: astore_1
    //   288: aload 6
    //   290: monitorenter
    //   291: aload_1
    //   292: ifnonnull +68 -> 360
    //   295: aload 6
    //   297: monitorexit
    //   298: ldc_w 358
    //   301: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   304: iconst_0
    //   305: istore 4
    //   307: goto -266 -> 41
    //   310: astore_1
    //   311: aload 7
    //   313: monitorexit
    //   314: ldc_w 358
    //   317: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   320: aload_1
    //   321: athrow
    //   322: aload_0
    //   323: getfield 88	com/tencent/mm/audio/mix/e/c:cmw	Ljava/util/HashMap;
    //   326: aload_1
    //   327: invokevirtual 173	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   330: astore 6
    //   332: goto -101 -> 231
    //   335: astore_1
    //   336: aload 5
    //   338: monitorexit
    //   339: ldc_w 358
    //   342: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   345: aload_1
    //   346: athrow
    //   347: aload_0
    //   348: getfield 88	com/tencent/mm/audio/mix/e/c:cmw	Ljava/util/HashMap;
    //   351: aload_1
    //   352: invokevirtual 173	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   355: astore 6
    //   357: goto -123 -> 234
    //   360: aload_1
    //   361: iconst_0
    //   362: aload_2
    //   363: invokeinterface 386 3 0
    //   368: aload 6
    //   370: monitorexit
    //   371: aload_0
    //   372: getfield 96	com/tencent/mm/audio/mix/e/c:cmA	Ljava/lang/Object;
    //   375: astore_2
    //   376: aload_2
    //   377: monitorenter
    //   378: aload_0
    //   379: getfield 96	com/tencent/mm/audio/mix/e/c:cmA	Ljava/lang/Object;
    //   382: invokevirtual 158	java/lang/Object:notifyAll	()V
    //   385: aload_2
    //   386: monitorexit
    //   387: aload_1
    //   388: invokeinterface 301 1 0
    //   393: istore 4
    //   395: ldc_w 358
    //   398: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   401: goto -360 -> 41
    //   404: astore_1
    //   405: aload 6
    //   407: monitorexit
    //   408: ldc_w 358
    //   411: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   414: aload_1
    //   415: athrow
    //   416: astore_3
    //   417: ldc 145
    //   419: aload_3
    //   420: ldc_w 388
    //   423: iconst_0
    //   424: anewarray 4	java/lang/Object
    //   427: invokestatic 153	com/tencent/mm/audio/mix/h/b:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   430: goto -45 -> 385
    //   433: astore_1
    //   434: aload_2
    //   435: monitorexit
    //   436: ldc_w 358
    //   439: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   442: aload_1
    //   443: athrow
    //   444: goto -196 -> 248
    //
    // Exception table:
    //   from	to	target	type
    //   86	131	310	finally
    //   135	167	310	finally
    //   167	170	310	finally
    //   311	314	310	finally
    //   199	231	335	finally
    //   231	234	335	finally
    //   322	332	335	finally
    //   336	339	335	finally
    //   295	298	404	finally
    //   360	371	404	finally
    //   405	408	404	finally
    //   378	385	416	java/lang/Exception
    //   378	385	433	finally
    //   385	387	433	finally
    //   417	430	433	finally
    //   434	436	433	finally
  }

  public final void clearCache()
  {
    AppMethodBeat.i(137110);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixController", "clearCache");
    synchronized (this.cmA)
    {
      DZ();
      this.cmw.clear();
      AppMethodBeat.o(137110);
      return;
    }
  }

  public final void dG(String paramString)
  {
    AppMethodBeat.i(137095);
    if (this.cmG > 0L)
      this.cmG = 0L;
    while (true)
    {
      synchronized (this.cmA)
      {
        this.cms.set(false);
        this.cmt.put(paramString, Boolean.FALSE);
        if (!this.cmv.contains(paramString))
        {
          this.cmv.add(paramString);
          Object localObject2 = this.cmx;
          Object localObject3 = new java/util/ArrayList;
          ((ArrayList)localObject3).<init>();
          ((HashMap)localObject2).put(paramString, localObject3);
          localObject3 = this.cmw;
          localObject2 = new java/lang/Object;
          localObject2.<init>();
          ((HashMap)localObject3).put(paramString, localObject2);
          this.cmC.put(paramString, Boolean.FALSE);
          this.cmy.put(paramString, Boolean.FALSE);
          this.cmD.put(paramString, Boolean.FALSE);
          if (this.clS.get())
          {
            this.clS.set(false);
            DU();
            DW();
            AppMethodBeat.o(137095);
          }
        }
        else
        {
          com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioMixController", "The audio of the Id is mixing");
        }
      }
      this.cmB.size();
    }
  }

  public final void dH(String paramString)
  {
    AppMethodBeat.i(137096);
    synchronized (this.cmA)
    {
      if (this.cmy.containsKey(paramString))
      {
        this.cmy.put(paramString, Boolean.TRUE);
        AppMethodBeat.o(137096);
        return;
      }
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioMixController", "The audio of the id is remove");
    }
  }

  public final void dI(String paramString)
  {
    AppMethodBeat.i(137097);
    this.cmt.put(paramString, Boolean.TRUE);
    dK(paramString);
    if (this.cmv.isEmpty())
    {
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixController", "stopMix isMute");
      this.cms.set(true);
      this.cmr.DL();
      AppMethodBeat.o(137097);
    }
    while (true)
    {
      return;
      this.cms.set(false);
      AppMethodBeat.o(137097);
    }
  }

  public final boolean dJ(String paramString)
  {
    AppMethodBeat.i(137099);
    synchronized (this.cmA)
    {
      if (this.cmy.containsKey(paramString))
      {
        bool = ((Boolean)this.cmy.get(paramString)).booleanValue();
        AppMethodBeat.o(137099);
        return bool;
      }
      boolean bool = false;
      AppMethodBeat.o(137099);
    }
  }

  public final void dK(String paramString)
  {
    AppMethodBeat.i(137100);
    while (true)
    {
      List localList;
      synchronized (this.cmA)
      {
        if (!this.cmv.contains(paramString))
          break label189;
        this.cmv.remove(paramString);
        Object localObject2 = this.cmw.get(paramString);
        localList = (List)this.cmx.remove(paramString);
        if (localObject2 != null)
          try
          {
            H(localList);
            localList.clear();
            this.cmw.remove(paramString);
            this.cmy.remove(paramString);
            this.cmC.remove(paramString);
            this.cmD.remove(paramString);
            if (this.clS.get())
              DW();
            this.cmE.remove(paramString);
            this.cmF.remove(paramString);
            return;
          }
          finally
          {
            AppMethodBeat.o(137100);
          }
      }
      H(localList);
      localList.clear();
      continue;
      label189: com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioMixController", "The audio of the id is remove");
    }
  }

  public final long dL(String paramString)
  {
    AppMethodBeat.i(137102);
    synchronized (this.cmA)
    {
      if (this.cmF.containsKey(paramString))
      {
        l = ((Long)this.cmF.get(paramString)).longValue();
        AppMethodBeat.o(137102);
        return l;
      }
      long l = 0L;
      AppMethodBeat.o(137102);
    }
  }

  public final boolean dM(String paramString)
  {
    AppMethodBeat.i(137103);
    boolean bool;
    if (!this.cmv.contains(paramString))
    {
      AppMethodBeat.o(137103);
      bool = true;
    }
    while (true)
    {
      return bool;
      paramString = (List)this.cmx.get(paramString);
      if ((paramString == null) || (paramString.size() == 0))
      {
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixController", "queue size is 0");
        AppMethodBeat.o(137103);
        bool = true;
      }
      else
      {
        bool = false;
        AppMethodBeat.o(137103);
      }
    }
  }

  public final String dP(String paramString)
  {
    AppMethodBeat.i(137113);
    paramString = (WeakReference)this.cmz.get(paramString);
    if ((paramString != null) && (paramString.get() != null))
    {
      paramString = (com.tencent.mm.audio.mix.d.c)paramString.get();
      if (paramString != null)
      {
        paramString = paramString.clP;
        AppMethodBeat.o(137113);
      }
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(137113);
    }
  }

  public final void l(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(137104);
    synchronized (this.cmA)
    {
      this.cmC.put(paramString, Boolean.valueOf(paramBoolean));
      AppMethodBeat.o(137104);
      return;
    }
  }

  // ERROR //
  public final boolean w(String paramString, int paramInt)
  {
    // Byte code:
    //   0: ldc_w 452
    //   3: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 86	com/tencent/mm/audio/mix/e/c:cmv	Ljava/util/LinkedList;
    //   10: aload_1
    //   11: invokevirtual 380	java/util/LinkedList:contains	(Ljava/lang/Object;)Z
    //   14: ifne +13 -> 27
    //   17: iconst_0
    //   18: istore_3
    //   19: ldc_w 452
    //   22: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: iload_3
    //   26: ireturn
    //   27: iload_2
    //   28: ifge +23 -> 51
    //   31: aload_0
    //   32: getfield 107	com/tencent/mm/audio/mix/e/c:cmE	Ljava/util/HashMap;
    //   35: aload_1
    //   36: invokevirtual 423	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   39: pop
    //   40: iconst_0
    //   41: istore_3
    //   42: ldc_w 452
    //   45: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: goto -23 -> 25
    //   51: invokestatic 457	java/lang/System:currentTimeMillis	()J
    //   54: lstore 4
    //   56: iload_2
    //   57: ifne +60 -> 117
    //   60: aload_0
    //   61: getfield 107	com/tencent/mm/audio/mix/e/c:cmE	Ljava/util/HashMap;
    //   64: aload_1
    //   65: invokevirtual 423	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   68: pop
    //   69: aload_0
    //   70: getfield 90	com/tencent/mm/audio/mix/e/c:cmx	Ljava/util/HashMap;
    //   73: aload_1
    //   74: invokevirtual 173	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   77: checkcast 175	java/util/List
    //   80: astore 6
    //   82: aload 6
    //   84: ifnull +13 -> 97
    //   87: aload 6
    //   89: invokeinterface 301 1 0
    //   94: ifne +39 -> 133
    //   97: aload_0
    //   98: getfield 107	com/tencent/mm/audio/mix/e/c:cmE	Ljava/util/HashMap;
    //   101: aload_1
    //   102: invokevirtual 423	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   105: pop
    //   106: iconst_0
    //   107: istore_3
    //   108: ldc_w 452
    //   111: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   114: goto -89 -> 25
    //   117: aload_0
    //   118: getfield 107	com/tencent/mm/audio/mix/e/c:cmE	Ljava/util/HashMap;
    //   121: aload_1
    //   122: iload_2
    //   123: invokestatic 460	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   126: invokevirtual 333	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   129: pop
    //   130: goto -61 -> 69
    //   133: aload_0
    //   134: getfield 132	com/tencent/mm/audio/mix/e/c:cmr	Lcom/tencent/mm/audio/mix/f/d;
    //   137: aload_1
    //   138: invokevirtual 464	com/tencent/mm/audio/mix/f/d:dQ	(Ljava/lang/String;)Lcom/tencent/mm/ag/b;
    //   141: astore 7
    //   143: aload 7
    //   145: ifnonnull +23 -> 168
    //   148: aload_0
    //   149: getfield 107	com/tencent/mm/audio/mix/e/c:cmE	Ljava/util/HashMap;
    //   152: aload_1
    //   153: invokevirtual 423	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   156: pop
    //   157: iconst_0
    //   158: istore_3
    //   159: ldc_w 452
    //   162: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   165: goto -140 -> 25
    //   168: ldc 145
    //   170: ldc_w 466
    //   173: invokestatic 246	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   176: aload_0
    //   177: aload_1
    //   178: invokevirtual 468	com/tencent/mm/audio/mix/e/c:dJ	(Ljava/lang/String;)Z
    //   181: istore_3
    //   182: iload_3
    //   183: ifne +8 -> 191
    //   186: aload_0
    //   187: aload_1
    //   188: invokevirtual 470	com/tencent/mm/audio/mix/e/c:dH	(Ljava/lang/String;)V
    //   191: aload 6
    //   193: invokeinterface 301 1 0
    //   198: istore 8
    //   200: invokestatic 476	com/tencent/mm/audio/mix/b/d:Dm	()Lcom/tencent/mm/audio/mix/b/d;
    //   203: aload 7
    //   205: getfield 481	com/tencent/mm/ag/b:filePath	Ljava/lang/String;
    //   208: invokevirtual 485	com/tencent/mm/audio/mix/b/d:dv	(Ljava/lang/String;)Lcom/tencent/mm/audio/mix/a/c;
    //   211: astore 9
    //   213: aload 9
    //   215: invokevirtual 488	com/tencent/mm/audio/mix/a/c:size	()I
    //   218: istore 10
    //   220: iload_2
    //   221: bipush 20
    //   223: idiv
    //   224: istore 11
    //   226: aload_0
    //   227: aload_1
    //   228: invokevirtual 490	com/tencent/mm/audio/mix/e/c:dL	(Ljava/lang/String;)J
    //   231: ldc2_w 491
    //   234: ldiv
    //   235: l2i
    //   236: istore_2
    //   237: aload_0
    //   238: getfield 88	com/tencent/mm/audio/mix/e/c:cmw	Ljava/util/HashMap;
    //   241: aload_1
    //   242: invokevirtual 173	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   245: astore 7
    //   247: aload 7
    //   249: ifnonnull +23 -> 272
    //   252: aload_0
    //   253: getfield 107	com/tencent/mm/audio/mix/e/c:cmE	Ljava/util/HashMap;
    //   256: aload_1
    //   257: invokevirtual 423	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   260: pop
    //   261: iconst_0
    //   262: istore_3
    //   263: ldc_w 452
    //   266: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   269: goto -244 -> 25
    //   272: iload 11
    //   274: iload_2
    //   275: if_icmple +170 -> 445
    //   278: iload 11
    //   280: iload 10
    //   282: if_icmpgt +163 -> 445
    //   285: ldc 145
    //   287: ldc_w 494
    //   290: invokestatic 373	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   293: iload 11
    //   295: iload_2
    //   296: isub
    //   297: istore 11
    //   299: aload 7
    //   301: monitorenter
    //   302: iconst_0
    //   303: istore_2
    //   304: iload_2
    //   305: iload 11
    //   307: if_icmpge +33 -> 340
    //   310: iload 11
    //   312: iload 8
    //   314: if_icmpgt +26 -> 340
    //   317: aload 6
    //   319: aload 6
    //   321: invokeinterface 301 1 0
    //   326: iconst_1
    //   327: isub
    //   328: invokeinterface 321 2 0
    //   333: pop
    //   334: iinc 2 1
    //   337: goto -33 -> 304
    //   340: aload 7
    //   342: monitorexit
    //   343: iload_3
    //   344: ifne +54 -> 398
    //   347: aload_0
    //   348: getfield 96	com/tencent/mm/audio/mix/e/c:cmA	Ljava/lang/Object;
    //   351: astore 7
    //   353: aload 7
    //   355: monitorenter
    //   356: aload_0
    //   357: getfield 92	com/tencent/mm/audio/mix/e/c:cmy	Ljava/util/HashMap;
    //   360: aload_1
    //   361: invokevirtual 219	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   364: ifeq +163 -> 527
    //   367: aload_0
    //   368: getfield 92	com/tencent/mm/audio/mix/e/c:cmy	Ljava/util/HashMap;
    //   371: aload_1
    //   372: getstatic 398	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   375: invokevirtual 333	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   378: pop
    //   379: aload 7
    //   381: monitorexit
    //   382: aload_0
    //   383: getfield 96	com/tencent/mm/audio/mix/e/c:cmA	Ljava/lang/Object;
    //   386: astore 7
    //   388: aload 7
    //   390: monitorenter
    //   391: aload_0
    //   392: invokespecial 275	com/tencent/mm/audio/mix/e/c:DW	()V
    //   395: aload 7
    //   397: monitorexit
    //   398: ldc 145
    //   400: ldc_w 496
    //   403: iconst_1
    //   404: anewarray 4	java/lang/Object
    //   407: dup
    //   408: iconst_0
    //   409: invokestatic 457	java/lang/System:currentTimeMillis	()J
    //   412: lload 4
    //   414: lsub
    //   415: invokestatic 266	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   418: aastore
    //   419: invokestatic 269	com/tencent/mm/audio/mix/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   422: iconst_1
    //   423: istore_3
    //   424: ldc_w 452
    //   427: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   430: goto -405 -> 25
    //   433: astore_1
    //   434: aload 7
    //   436: monitorexit
    //   437: ldc_w 452
    //   440: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   443: aload_1
    //   444: athrow
    //   445: iload 11
    //   447: iload_2
    //   448: if_icmpge -105 -> 343
    //   451: iload_2
    //   452: iload 10
    //   454: if_icmpgt -111 -> 343
    //   457: ldc 145
    //   459: ldc_w 498
    //   462: invokestatic 373	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   465: aload 7
    //   467: monitorenter
    //   468: iload_2
    //   469: iload 11
    //   471: if_icmple +38 -> 509
    //   474: aload 9
    //   476: iload_2
    //   477: invokevirtual 502	com/tencent/mm/audio/mix/a/c:gv	(I)Lcom/tencent/mm/audio/mix/a/d;
    //   480: astore 12
    //   482: aload 12
    //   484: ifnull +19 -> 503
    //   487: aload 6
    //   489: aload 6
    //   491: invokeinterface 301 1 0
    //   496: aload 12
    //   498: invokeinterface 386 3 0
    //   503: iinc 2 255
    //   506: goto -38 -> 468
    //   509: aload 7
    //   511: monitorexit
    //   512: goto -169 -> 343
    //   515: astore_1
    //   516: aload 7
    //   518: monitorexit
    //   519: ldc_w 452
    //   522: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   525: aload_1
    //   526: athrow
    //   527: ldc 145
    //   529: ldc_w 407
    //   532: invokestatic 373	com/tencent/mm/audio/mix/h/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   535: goto -156 -> 379
    //   538: astore_1
    //   539: aload 7
    //   541: monitorexit
    //   542: ldc_w 452
    //   545: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   548: aload_1
    //   549: athrow
    //   550: astore_1
    //   551: aload 7
    //   553: monitorexit
    //   554: ldc_w 452
    //   557: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   560: aload_1
    //   561: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   317	334	433	finally
    //   340	343	433	finally
    //   434	437	433	finally
    //   474	482	515	finally
    //   487	503	515	finally
    //   509	512	515	finally
    //   516	519	515	finally
    //   356	379	538	finally
    //   379	382	538	finally
    //   527	535	538	finally
    //   539	542	538	finally
    //   391	398	550	finally
    //   551	554	550	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.e.c
 * JD-Core Version:    0.6.2
 */