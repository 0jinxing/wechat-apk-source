package com.tencent.mm.sdk.g.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c
  implements a
{
  private static final c.b xEn;
  private static final RuntimePermission xEo;
  private volatile int cml;
  private String name;
  private final ReentrantLock xDM;
  private final AtomicInteger xEe;
  private final BlockingQueue<Runnable> xEf;
  private final HashSet<c.c> xEg;
  private final HashSet<c.c> xEh;
  private final Condition xEi;
  private int xEj;
  private long xEk;
  private volatile c.b xEl;
  private volatile int xEm;

  static
  {
    AppMethodBeat.i(52625);
    xEn = new c.a();
    xEo = new RuntimePermission("modifyThread");
    AppMethodBeat.o(52625);
  }

  public c(String paramString, int paramInt1, int paramInt2, BlockingQueue<Runnable> paramBlockingQueue)
  {
    AppMethodBeat.i(52615);
    this.xEe = new AtomicInteger(-536870912);
    this.xDM = new ReentrantLock();
    this.xEg = new HashSet();
    this.xEh = new HashSet();
    this.xEi = this.xDM.newCondition();
    if ((paramInt1 < 0) || (paramInt2 <= 0) || (paramInt2 < paramInt1))
    {
      paramString = new IllegalArgumentException();
      AppMethodBeat.o(52615);
      throw paramString;
    }
    if ((paramBlockingQueue == null) || (paramString == null))
    {
      paramString = new NullPointerException();
      AppMethodBeat.o(52615);
      throw paramString;
    }
    this.cml = paramInt1;
    this.name = paramString;
    this.xEm = paramInt2;
    this.xEf = paramBlockingQueue;
    this.xEl = new c.a();
    AppMethodBeat.o(52615);
  }

  public c(String paramString, BlockingQueue<Runnable> paramBlockingQueue)
  {
    AppMethodBeat.i(52614);
    this.xEe = new AtomicInteger(-536870912);
    this.xDM = new ReentrantLock();
    this.xEg = new HashSet();
    this.xEh = new HashSet();
    this.xEi = this.xDM.newCondition();
    if ((paramBlockingQueue == null) || (paramString == null))
    {
      paramString = new NullPointerException();
      AppMethodBeat.o(52614);
      throw paramString;
    }
    this.name = paramString;
    this.cml = 6;
    this.xEm = 6;
    this.xEf = paramBlockingQueue;
    this.xEl = new c.a();
    AppMethodBeat.o(52614);
  }

  private boolean Mf(int paramInt)
  {
    AppMethodBeat.i(52603);
    boolean bool = this.xEe.compareAndSet(paramInt, paramInt - 1);
    AppMethodBeat.o(52603);
    return bool;
  }

  private void Mg(int paramInt)
  {
    AppMethodBeat.i(52605);
    int i;
    do
      i = this.xEe.get();
    while (((paramInt == -536870912) || (!gX(i, paramInt))) && (!this.xEe.compareAndSet(i, 0x1FFFFFFF & i | paramInt)));
    AppMethodBeat.o(52605);
  }

  private void a(c.c paramc)
  {
    AppMethodBeat.i(52609);
    ReentrantLock localReentrantLock = this.xDM;
    localReentrantLock.lock();
    if (paramc != null);
    try
    {
      this.xEg.remove(paramc);
      dqf();
      dqg();
      return;
    }
    finally
    {
      localReentrantLock.unlock();
      AppMethodBeat.o(52609);
    }
    throw paramc;
  }

  private void a(c.c paramc, boolean paramBoolean)
  {
    AppMethodBeat.i(52610);
    ReentrantLock localReentrantLock = this.xDM;
    if (((this.xEe.get() & 0x1FFFFFFF) > this.cml) || (paramBoolean))
    {
      dqf();
      localReentrantLock.lock();
    }
    while (true)
    {
      try
      {
        this.xEk += paramc.xEr;
        paramc.xEr = 0L;
        this.xEg.remove(paramc);
        localReentrantLock.unlock();
        dqg();
        AppMethodBeat.o(52610);
        return;
      }
      finally
      {
        localReentrantLock.unlock();
        AppMethodBeat.o(52610);
      }
      localReentrantLock.lock();
      try
      {
        this.xEk += paramc.xEr;
        paramc.xEr = 0L;
        paramc.release(1);
        this.xEh.add(paramc);
        localReentrantLock.unlock();
      }
      finally
      {
        localReentrantLock.unlock();
        AppMethodBeat.o(52610);
      }
    }
  }

  private boolean a(Runnable paramRunnable, boolean paramBoolean)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(52608);
    int i;
    int j;
    label62: 
    do
    {
      i = this.xEe.get();
      j = i & 0xE0000000;
      if ((j < 0) || ((j == 0) && (paramRunnable == null) && (!this.xEf.isEmpty())))
        break label326;
      AppMethodBeat.o(52608);
      paramBoolean = bool2;
      return paramBoolean;
      if (this.xEe.compareAndSet(i, i + 1))
        break;
      i = this.xEe.get();
    }
    while ((i & 0xE0000000) != j);
    label139: label146: label326: 
    while (true)
      while (true)
      {
        int k = i & 0x1FFFFFFF;
        if (k < 536870911)
          if (!paramBoolean)
            break label139;
        for (int m = this.cml; ; m = this.xEm)
        {
          if (k < m)
            break label146;
          AppMethodBeat.o(52608);
          paramBoolean = bool2;
          break;
        }
        break label62;
        try
        {
          while (true)
          {
            localc = new com/tencent/mm/sdk/g/b/c$c;
            localc.<init>(this, paramRunnable);
            try
            {
              while (true)
              {
                ReentrantLock localReentrantLock = this.xDM;
                localReentrantLock.lock();
                try
                {
                  i = this.xEe.get() & 0xE0000000;
                  if ((i < 0) || ((i == 0) && (paramRunnable == null)))
                  {
                    this.xEg.add(localc);
                    i = this.xEg.size();
                    if (i > this.xEj)
                      this.xEj = i;
                    m = 1;
                    localReentrantLock.unlock();
                    paramBoolean = bool1;
                    if (m != 0)
                    {
                      localc.id = i;
                      d.xDG.execute(localc);
                      paramBoolean = true;
                    }
                    if (!paramBoolean)
                      a(localc);
                    AppMethodBeat.o(52608);
                    break;
                  }
                }
                finally
                {
                  localReentrantLock.unlock();
                  AppMethodBeat.o(52608);
                }
              }
            }
            finally
            {
              a(localc);
              AppMethodBeat.o(52608);
            }
          }
        }
        finally
        {
          while (true)
            c.c localc = null;
          i = 0;
          m = 0;
        }
      }
  }

  private void aq(Runnable paramRunnable)
  {
    AppMethodBeat.i(52607);
    this.xEl.a(paramRunnable, this);
    AppMethodBeat.o(52607);
  }

  private void dqf()
  {
    AppMethodBeat.i(52604);
    while (!Mf(this.xEe.get()));
    AppMethodBeat.o(52604);
  }

  private void dqg()
  {
    AppMethodBeat.i(52606);
    while (true)
    {
      int i = this.xEe.get();
      int j;
      if (i < 0)
      {
        j = 1;
        if ((j == 0) && (!gX(i, 1073741824)) && (((0xE0000000 & i) != 0) || (this.xEf.isEmpty())))
          break label62;
        AppMethodBeat.o(52606);
      }
      while (true)
      {
        label56: return;
        j = 0;
        break;
        label62: if ((0x1FFFFFFF & i) == 0)
          break label77;
        AppMethodBeat.o(52606);
      }
      label77: ReentrantLock localReentrantLock = this.xDM;
      localReentrantLock.lock();
      try
      {
        if (this.xEe.compareAndSet(i, 1073741824))
        {
          this.xEe.set(1610612736);
          this.xEi.signalAll();
          localReentrantLock.unlock();
          AppMethodBeat.o(52606);
          break label56;
        }
        localReentrantLock.unlock();
      }
      finally
      {
        localReentrantLock.unlock();
        AppMethodBeat.o(52606);
      }
    }
  }

  private Runnable dqh()
  {
    Runnable localRunnable = null;
    AppMethodBeat.i(52611);
    int i = this.xEe.get();
    int j = 0xE0000000 & i;
    if ((j >= 0) && ((j >= 536870912) || (this.xEf.isEmpty())))
    {
      dqf();
      AppMethodBeat.o(52611);
    }
    while (true)
    {
      return localRunnable;
      j = 0x1FFFFFFF & i;
      if ((j > this.xEm) && ((j > 1) || (this.xEf.isEmpty())) && (Mf(i)))
      {
        AppMethodBeat.o(52611);
      }
      else
      {
        localRunnable = (Runnable)this.xEf.poll();
        AppMethodBeat.o(52611);
      }
    }
  }

  private boolean dqi()
  {
    boolean bool = false;
    AppMethodBeat.i(52613);
    if ((this.xEe.get() & 0xE0000000) >= 0)
      AppMethodBeat.o(52613);
    while (true)
    {
      return bool;
      ReentrantLock localReentrantLock = this.xDM;
      localReentrantLock.lock();
      try
      {
        Iterator localIterator = this.xEh.iterator();
        if (localIterator.hasNext())
        {
          c.c localc = (c.c)localIterator.next();
          localc.xEq = null;
          d.xDG.execute(localc);
          localIterator.remove();
          localReentrantLock.unlock();
          bool = true;
          AppMethodBeat.o(52613);
          continue;
        }
        localReentrantLock.unlock();
        AppMethodBeat.o(52613);
      }
      finally
      {
        localReentrantLock.unlock();
        AppMethodBeat.o(52613);
      }
    }
  }

  private static boolean gX(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= paramInt2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private List<Runnable> shutdownNow()
  {
    int i = 0;
    AppMethodBeat.i(52618);
    ReentrantLock localReentrantLock1 = this.xDM;
    localReentrantLock1.lock();
    try
    {
      Mg(536870912);
      ReentrantLock localReentrantLock2 = this.xDM;
      localReentrantLock2.lock();
      try
      {
        Iterator localIterator = this.xEg.iterator();
        while (localIterator.hasNext())
          localIterator.next();
      }
      finally
      {
      }
    }
    finally
    {
      localReentrantLock1.unlock();
      AppMethodBeat.o(52618);
    }
    localObject1.unlock();
    BlockingQueue localBlockingQueue = this.xEf;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localBlockingQueue.drainTo(localArrayList);
    if (!localBlockingQueue.isEmpty())
    {
      Runnable[] arrayOfRunnable = (Runnable[])localBlockingQueue.toArray(new Runnable[0]);
      int j = arrayOfRunnable.length;
      while (i < j)
      {
        Runnable localRunnable = arrayOfRunnable[i];
        if (localBlockingQueue.remove(localRunnable))
          localArrayList.add(localRunnable);
        i++;
      }
    }
    localReentrantLock1.unlock();
    dqg();
    AppMethodBeat.o(52618);
    return localArrayList;
  }

  // ERROR //
  final void b(c.c paramc)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 275
    //   5: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: invokestatic 281	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   11: astore_3
    //   12: aload_1
    //   13: getfield 244	com/tencent/mm/sdk/g/b/c$c:xEq	Ljava/lang/Runnable;
    //   16: ifnonnull +225 -> 241
    //   19: aload_0
    //   20: invokespecial 283	com/tencent/mm/sdk/g/b/c:dqh	()Ljava/lang/Runnable;
    //   23: astore 4
    //   25: aload_1
    //   26: aconst_null
    //   27: putfield 244	com/tencent/mm/sdk/g/b/c$c:xEq	Ljava/lang/Runnable;
    //   30: aload_1
    //   31: iconst_1
    //   32: invokevirtual 161	com/tencent/mm/sdk/g/b/c$c:release	(I)Z
    //   35: pop
    //   36: iconst_1
    //   37: istore 5
    //   39: iconst_0
    //   40: istore 6
    //   42: aload 4
    //   44: astore 7
    //   46: aload 4
    //   48: ifnonnull +23 -> 71
    //   51: iload 6
    //   53: ifeq +371 -> 424
    //   56: iload 5
    //   58: istore 8
    //   60: aload_0
    //   61: invokespecial 283	com/tencent/mm/sdk/g/b/c:dqh	()Ljava/lang/Runnable;
    //   64: astore 7
    //   66: aload 7
    //   68: ifnull +356 -> 424
    //   71: iload 5
    //   73: istore 8
    //   75: aload_1
    //   76: iconst_1
    //   77: invokevirtual 286	com/tencent/mm/sdk/g/b/c$c:acquire	(I)V
    //   80: iload 5
    //   82: istore 8
    //   84: aload_0
    //   85: getfield 75	com/tencent/mm/sdk/g/b/c:xEe	Ljava/util/concurrent/atomic/AtomicInteger;
    //   88: invokevirtual 127	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   91: ldc 220
    //   93: invokestatic 130	com/tencent/mm/sdk/g/b/c:gX	(II)Z
    //   96: ifne +32 -> 128
    //   99: iload 5
    //   101: istore 8
    //   103: invokestatic 289	java/lang/Thread:interrupted	()Z
    //   106: ifeq +37 -> 143
    //   109: iload 5
    //   111: istore 8
    //   113: aload_0
    //   114: getfield 75	com/tencent/mm/sdk/g/b/c:xEe	Ljava/util/concurrent/atomic/AtomicInteger;
    //   117: invokevirtual 127	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   120: ldc 220
    //   122: invokestatic 130	com/tencent/mm/sdk/g/b/c:gX	(II)Z
    //   125: ifeq +18 -> 143
    //   128: iload 5
    //   130: istore 8
    //   132: aload_3
    //   133: invokevirtual 292	java/lang/Thread:isInterrupted	()Z
    //   136: istore 6
    //   138: iload 6
    //   140: ifeq +284 -> 424
    //   143: aload_0
    //   144: aload_3
    //   145: aload 7
    //   147: invokevirtual 296	com/tencent/mm/sdk/g/b/c:beforeExecute	(Ljava/lang/Thread;Ljava/lang/Runnable;)V
    //   150: aload_2
    //   151: astore 4
    //   153: aload 7
    //   155: invokeinterface 299 1 0
    //   160: invokestatic 302	com/tencent/mm/sdk/g/b/c$c:dqj	()Z
    //   163: istore 6
    //   165: iload 5
    //   167: istore 9
    //   169: iload 6
    //   171: ifne +36 -> 207
    //   174: aload_0
    //   175: invokespecial 283	com/tencent/mm/sdk/g/b/c:dqh	()Ljava/lang/Runnable;
    //   178: astore 4
    //   180: aload_1
    //   181: aload 4
    //   183: putfield 244	com/tencent/mm/sdk/g/b/c$c:xEq	Ljava/lang/Runnable;
    //   186: iload 5
    //   188: istore 9
    //   190: aload 4
    //   192: ifnull +15 -> 207
    //   195: getstatic 189	com/tencent/mm/sdk/g/d:xDG	Lcom/tencent/mm/sdk/g/a/e;
    //   198: aload_1
    //   199: invokeinterface 195 2 0
    //   204: iconst_0
    //   205: istore 9
    //   207: iload 9
    //   209: istore 8
    //   211: aload_1
    //   212: aload_1
    //   213: getfield 158	com/tencent/mm/sdk/g/b/c$c:xEr	J
    //   216: lconst_1
    //   217: ladd
    //   218: putfield 158	com/tencent/mm/sdk/g/b/c$c:xEr	J
    //   221: iload 9
    //   223: istore 8
    //   225: aload_1
    //   226: iconst_1
    //   227: invokevirtual 161	com/tencent/mm/sdk/g/b/c$c:release	(I)Z
    //   230: pop
    //   231: aconst_null
    //   232: astore 4
    //   234: iload 9
    //   236: istore 5
    //   238: goto -196 -> 42
    //   241: aload_1
    //   242: getfield 244	com/tencent/mm/sdk/g/b/c$c:xEq	Ljava/lang/Runnable;
    //   245: astore 4
    //   247: goto -222 -> 25
    //   250: astore 7
    //   252: aload 7
    //   254: astore 4
    //   256: ldc_w 275
    //   259: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   262: aload 7
    //   264: astore 4
    //   266: aload 7
    //   268: athrow
    //   269: astore 7
    //   271: aload 4
    //   273: ifnonnull +192 -> 465
    //   276: invokestatic 302	com/tencent/mm/sdk/g/b/c$c:dqj	()Z
    //   279: ifne +186 -> 465
    //   282: aload_0
    //   283: invokespecial 283	com/tencent/mm/sdk/g/b/c:dqh	()Ljava/lang/Runnable;
    //   286: astore 4
    //   288: aload_1
    //   289: aload 4
    //   291: putfield 244	com/tencent/mm/sdk/g/b/c$c:xEq	Ljava/lang/Runnable;
    //   294: aload 4
    //   296: ifnull +169 -> 465
    //   299: getstatic 189	com/tencent/mm/sdk/g/d:xDG	Lcom/tencent/mm/sdk/g/a/e;
    //   302: aload_1
    //   303: invokeinterface 195 2 0
    //   308: iconst_0
    //   309: istore 5
    //   311: ldc_w 275
    //   314: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   317: aload 7
    //   319: athrow
    //   320: astore 4
    //   322: aload_1
    //   323: aload_1
    //   324: getfield 158	com/tencent/mm/sdk/g/b/c$c:xEr	J
    //   327: lconst_1
    //   328: ladd
    //   329: putfield 158	com/tencent/mm/sdk/g/b/c$c:xEr	J
    //   332: aload_1
    //   333: iconst_1
    //   334: invokevirtual 161	com/tencent/mm/sdk/g/b/c$c:release	(I)Z
    //   337: pop
    //   338: ldc_w 275
    //   341: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   344: aload 4
    //   346: athrow
    //   347: astore 4
    //   349: iload 5
    //   351: ifeq +9 -> 360
    //   354: aload_0
    //   355: aload_1
    //   356: iconst_1
    //   357: invokespecial 304	com/tencent/mm/sdk/g/b/c:a	(Lcom/tencent/mm/sdk/g/b/c$c;Z)V
    //   360: ldc_w 275
    //   363: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   366: aload 4
    //   368: athrow
    //   369: astore 7
    //   371: aload 7
    //   373: astore 4
    //   375: ldc_w 275
    //   378: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   381: aload 7
    //   383: astore 4
    //   385: aload 7
    //   387: athrow
    //   388: astore 7
    //   390: aload 7
    //   392: astore 4
    //   394: new 272	java/lang/Error
    //   397: astore_2
    //   398: aload 7
    //   400: astore 4
    //   402: aload_2
    //   403: aload 7
    //   405: invokespecial 307	java/lang/Error:<init>	(Ljava/lang/Throwable;)V
    //   408: aload 7
    //   410: astore 4
    //   412: ldc_w 275
    //   415: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   418: aload 7
    //   420: astore 4
    //   422: aload_2
    //   423: athrow
    //   424: iload 5
    //   426: ifeq +16 -> 442
    //   429: aload_0
    //   430: aload_1
    //   431: iconst_0
    //   432: invokespecial 304	com/tencent/mm/sdk/g/b/c:a	(Lcom/tencent/mm/sdk/g/b/c$c;Z)V
    //   435: ldc_w 275
    //   438: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   441: return
    //   442: ldc_w 275
    //   445: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   448: goto -7 -> 441
    //   451: astore 4
    //   453: iload 8
    //   455: istore 5
    //   457: goto -108 -> 349
    //   460: astore 4
    //   462: goto -140 -> 322
    //   465: goto -154 -> 311
    //
    // Exception table:
    //   from	to	target	type
    //   153	160	250	java/lang/RuntimeException
    //   153	160	269	finally
    //   256	262	269	finally
    //   266	269	269	finally
    //   375	381	269	finally
    //   385	388	269	finally
    //   394	398	269	finally
    //   402	408	269	finally
    //   412	418	269	finally
    //   422	424	269	finally
    //   311	320	320	finally
    //   322	347	347	finally
    //   153	160	369	java/lang/Error
    //   153	160	388	java/lang/Throwable
    //   60	66	451	finally
    //   75	80	451	finally
    //   84	99	451	finally
    //   103	109	451	finally
    //   113	128	451	finally
    //   132	138	451	finally
    //   211	221	451	finally
    //   225	231	451	finally
    //   143	150	460	finally
    //   160	165	460	finally
    //   174	186	460	finally
    //   195	204	460	finally
    //   276	294	460	finally
    //   299	308	460	finally
  }

  protected void beforeExecute(Thread paramThread, Runnable paramRunnable)
  {
  }

  public void execute(Runnable paramRunnable)
  {
    int i = 1;
    AppMethodBeat.i(52616);
    if (paramRunnable == null)
    {
      paramRunnable = new NullPointerException();
      AppMethodBeat.o(52616);
      throw paramRunnable;
    }
    int j = this.xEe.get();
    int k = j;
    if ((j & 0x1FFFFFFF) < this.cml)
      if (a(paramRunnable, true))
        AppMethodBeat.o(52616);
    while (true)
    {
      return;
      k = this.xEe.get();
      if (k < 0)
        k = 1;
      while (true)
        if ((k != 0) && (this.xEf.offer(paramRunnable)))
        {
          if (dqi())
          {
            AppMethodBeat.o(52616);
            break;
            k = 0;
            continue;
          }
          j = this.xEe.get();
          if (j < 0);
          for (k = i; ; k = 0)
          {
            if ((k != 0) || (!remove(paramRunnable)))
              break label171;
            aq(paramRunnable);
            AppMethodBeat.o(52616);
            break;
          }
          label171: if ((j & 0x1FFFFFFF) == 0)
            a(null, false);
          AppMethodBeat.o(52616);
          break;
        }
      if (!a(paramRunnable, false))
        aq(paramRunnable);
      AppMethodBeat.o(52616);
    }
  }

  protected void finalize()
  {
    AppMethodBeat.i(52622);
    shutdown();
    AppMethodBeat.o(52622);
  }

  public final int getCorePoolSize()
  {
    return this.cml;
  }

  public boolean isShutdown()
  {
    boolean bool = true;
    AppMethodBeat.i(52619);
    int i;
    if (this.xEe.get() < 0)
    {
      i = 1;
      if (i != 0)
        break label37;
      AppMethodBeat.o(52619);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label37: AppMethodBeat.o(52619);
      bool = false;
    }
  }

  public final void p(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(52621);
    d.xDG.p(new c.1(this, paramRunnable), paramLong);
    AppMethodBeat.o(52621);
  }

  public final boolean remove(Runnable paramRunnable)
  {
    AppMethodBeat.i(52623);
    boolean bool = this.xEf.remove(paramRunnable);
    dqg();
    AppMethodBeat.o(52623);
    return bool;
  }

  public final void reset()
  {
    AppMethodBeat.i(52620);
    shutdownNow();
    Mg(-536870912);
    AppMethodBeat.o(52620);
  }

  public final void shutdown()
  {
    AppMethodBeat.i(52617);
    ReentrantLock localReentrantLock = this.xDM;
    localReentrantLock.lock();
    try
    {
      Mg(0);
      localReentrantLock.unlock();
      dqg();
      AppMethodBeat.o(52617);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
      AppMethodBeat.o(52617);
    }
  }

  public String toString()
  {
    AppMethodBeat.i(52624);
    Object localObject1 = this.xDM;
    ((ReentrantLock)localObject1).lock();
    label256: 
    while (true)
    {
      int k;
      try
      {
        long l = this.xEk;
        int i = this.xEg.size();
        Iterator localIterator = this.xEg.iterator();
        int j = 0;
        if (localIterator.hasNext())
        {
          c.c localc = (c.c)localIterator.next();
          l += localc.xEr;
          boolean bool = localc.isLocked();
          if (!bool)
            break label256;
          j++;
          continue;
        }
        ((ReentrantLock)localObject1).unlock();
        k = this.xEe.get();
        if (k < 0)
        {
          m = 1;
          if (m == 0)
            break label232;
          localObject1 = "Running";
          localObject1 = super.toString() + "[" + (String)localObject1 + ", pool size = " + i + ", active threads = " + j + ", queued tasks = " + this.xEf.size() + ", completed tasks = " + l + "]";
          AppMethodBeat.o(52624);
          return localObject1;
        }
      }
      finally
      {
        ((ReentrantLock)localObject1).unlock();
        AppMethodBeat.o(52624);
      }
      int m = 0;
      continue;
      label232: if (gX(k, 1610612736))
        localObject1 = "Terminated";
      else
        localObject1 = "Shutting down";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.g.b.c
 * JD-Core Version:    0.6.2
 */