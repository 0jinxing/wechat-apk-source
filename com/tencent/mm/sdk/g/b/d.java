package com.tencent.mm.sdk.g.b;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.Printer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class d
  implements a
{
  private static final RuntimePermission xEo;
  private volatile int cml;
  private final ReentrantLock xDM;
  private final AtomicInteger xEe;
  private final BlockingQueue<Runnable> xEf;
  private final HashSet<c> xEg;
  private final HashSet<c> xEh;
  private final Condition xEi;
  private int xEj;
  private long xEk;
  private volatile int xEm;
  volatile com.tencent.mm.sdk.g.c.e xEs;
  private volatile b xEt;
  private volatile int xEu;
  private volatile boolean xEv;
  private final BlockingQueue<Runnable> xEw;
  private a xEx;

  static
  {
    AppMethodBeat.i(52663);
    xEo = new RuntimePermission("modifyThread");
    AppMethodBeat.o(52663);
  }

  public d(int paramInt1, int paramInt2, BlockingQueue<Runnable> paramBlockingQueue, com.tencent.mm.sdk.g.c.e parame, b paramb, a parama)
  {
    AppMethodBeat.i(52643);
    this.xEe = new AtomicInteger(-536870912);
    this.xEv = false;
    this.xDM = new ReentrantLock();
    this.xEi = this.xDM.newCondition();
    this.xEg = new HashSet();
    this.xEh = new HashSet();
    this.cml = paramInt1;
    this.xEu = paramInt2;
    this.xEm = paramInt1;
    this.xEf = paramBlockingQueue;
    this.xEs = parame;
    this.xEt = paramb;
    this.xEw = new LinkedBlockingDeque();
    this.xEx = parama;
    AppMethodBeat.o(52643);
  }

  private void Mg(int paramInt)
  {
    AppMethodBeat.i(52641);
    int i;
    do
      i = this.xEe.get();
    while (((paramInt == -536870912) || (!gX(i, paramInt))) && (!this.xEe.compareAndSet(i, 0x1FFFFFFF & i | paramInt)));
    AppMethodBeat.o(52641);
  }

  private void a(c paramc, boolean paramBoolean)
  {
    AppMethodBeat.i(52646);
    if ((this.xEe.get() & 0xE0000000) >= 0)
      paramBoolean = true;
    if (paramBoolean)
      dqf();
    ReentrantLock localReentrantLock = this.xDM;
    localReentrantLock.lock();
    if (paramBoolean);
    try
    {
      this.xEk += paramc.xEr;
      this.xEg.remove(paramc);
      paramc.oAl.quit();
      while (true)
      {
        paramc.release(1);
        paramc.xEq = null;
        paramc.xEz = null;
        localReentrantLock.unlock();
        dqg();
        AppMethodBeat.o(52646);
        return;
        this.xEh.add(paramc);
      }
    }
    finally
    {
      localReentrantLock.unlock();
      AppMethodBeat.o(52646);
    }
    throw paramc;
  }

  private static void a(BlockingQueue<Runnable> paramBlockingQueue)
  {
    int i = 0;
    AppMethodBeat.i(52639);
    ArrayList localArrayList = new ArrayList();
    paramBlockingQueue.drainTo(localArrayList);
    if (!paramBlockingQueue.isEmpty())
    {
      Runnable[] arrayOfRunnable = (Runnable[])paramBlockingQueue.toArray(new Runnable[0]);
      int j = arrayOfRunnable.length;
      while (i < j)
      {
        Runnable localRunnable = arrayOfRunnable[i];
        if (paramBlockingQueue.remove(localRunnable))
          localArrayList.add(localRunnable);
        i++;
      }
    }
    AppMethodBeat.o(52639);
  }

  // ERROR //
  private boolean a(Runnable paramRunnable, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: ldc 215
    //   7: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: getfield 82	com/tencent/mm/sdk/g/b/d:xEe	Ljava/util/concurrent/atomic/AtomicInteger;
    //   14: invokevirtual 129	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   17: istore 5
    //   19: iload 5
    //   21: ldc 78
    //   23: iand
    //   24: istore 6
    //   26: iload 6
    //   28: iflt +394 -> 422
    //   31: iload 6
    //   33: ifne +14 -> 47
    //   36: aload_1
    //   37: ifnonnull +10 -> 47
    //   40: aload_0
    //   41: invokespecial 218	com/tencent/mm/sdk/g/b/d:dql	()Z
    //   44: ifeq +378 -> 422
    //   47: ldc 215
    //   49: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   52: iload 4
    //   54: istore_2
    //   55: iload_2
    //   56: ireturn
    //   57: aload_0
    //   58: getfield 82	com/tencent/mm/sdk/g/b/d:xEe	Ljava/util/concurrent/atomic/AtomicInteger;
    //   61: iload 5
    //   63: iload 5
    //   65: iconst_1
    //   66: iadd
    //   67: invokevirtual 137	java/util/concurrent/atomic/AtomicInteger:compareAndSet	(II)Z
    //   70: ifne +73 -> 143
    //   73: aload_0
    //   74: getfield 82	com/tencent/mm/sdk/g/b/d:xEe	Ljava/util/concurrent/atomic/AtomicInteger;
    //   77: invokevirtual 129	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   80: istore 5
    //   82: iload 5
    //   84: ldc 78
    //   86: iand
    //   87: iload 6
    //   89: if_icmpne -79 -> 10
    //   92: iload 5
    //   94: ldc 134
    //   96: iand
    //   97: istore 7
    //   99: iload 7
    //   101: ldc 134
    //   103: if_icmpge +20 -> 123
    //   106: iload_2
    //   107: ifeq +27 -> 134
    //   110: aload_0
    //   111: getfield 104	com/tencent/mm/sdk/g/b/d:cml	I
    //   114: istore 8
    //   116: iload 7
    //   118: iload 8
    //   120: if_icmplt -63 -> 57
    //   123: ldc 215
    //   125: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   128: iload 4
    //   130: istore_2
    //   131: goto -76 -> 55
    //   134: aload_0
    //   135: getfield 108	com/tencent/mm/sdk/g/b/d:xEm	I
    //   138: istore 8
    //   140: goto -24 -> 116
    //   143: new 16	com/tencent/mm/sdk/g/b/d$c
    //   146: astore 9
    //   148: aload 9
    //   150: aload_0
    //   151: aload_1
    //   152: invokespecial 221	com/tencent/mm/sdk/g/b/d$c:<init>	(Lcom/tencent/mm/sdk/g/b/d;Ljava/lang/Runnable;)V
    //   155: aload 9
    //   157: getfield 161	com/tencent/mm/sdk/g/b/d$c:oAl	Landroid/os/HandlerThread;
    //   160: astore 10
    //   162: iload_3
    //   163: istore_2
    //   164: aload 10
    //   166: ifnull +225 -> 391
    //   169: aload_0
    //   170: getfield 89	com/tencent/mm/sdk/g/b/d:xDM	Ljava/util/concurrent/locks/ReentrantLock;
    //   173: astore 11
    //   175: aload 11
    //   177: invokevirtual 148	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   180: aload_0
    //   181: getfield 82	com/tencent/mm/sdk/g/b/d:xEe	Ljava/util/concurrent/atomic/AtomicInteger;
    //   184: invokevirtual 129	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   187: ldc 78
    //   189: iand
    //   190: istore 5
    //   192: iload 5
    //   194: iflt +12 -> 206
    //   197: iload 5
    //   199: ifne +217 -> 416
    //   202: aload_1
    //   203: ifnonnull +213 -> 416
    //   206: aload 10
    //   208: invokevirtual 226	java/lang/Thread:isAlive	()Z
    //   211: ifeq +49 -> 260
    //   214: new 228	java/lang/IllegalThreadStateException
    //   217: astore_1
    //   218: aload_1
    //   219: invokespecial 229	java/lang/IllegalThreadStateException:<init>	()V
    //   222: ldc 215
    //   224: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   227: aload_1
    //   228: athrow
    //   229: astore_1
    //   230: aload 11
    //   232: invokevirtual 182	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   235: ldc 215
    //   237: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   240: aload_1
    //   241: athrow
    //   242: astore 11
    //   244: aload 9
    //   246: astore_1
    //   247: aload_0
    //   248: aload_1
    //   249: invokespecial 232	com/tencent/mm/sdk/g/b/d:b	(Lcom/tencent/mm/sdk/g/b/d$c;)V
    //   252: ldc 215
    //   254: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   257: aload 11
    //   259: athrow
    //   260: aload_0
    //   261: aload_1
    //   262: invokestatic 236	com/tencent/mm/sdk/g/b/d:ar	(Ljava/lang/Runnable;)Ljava/lang/String;
    //   265: aload_0
    //   266: getfield 106	com/tencent/mm/sdk/g/b/d:xEu	I
    //   269: invokespecial 240	com/tencent/mm/sdk/g/b/d:el	(Ljava/lang/String;I)Z
    //   272: istore_2
    //   273: iload_2
    //   274: ifeq +25 -> 299
    //   277: aload 11
    //   279: invokevirtual 182	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   282: aload_0
    //   283: aload 9
    //   285: invokespecial 232	com/tencent/mm/sdk/g/b/d:b	(Lcom/tencent/mm/sdk/g/b/d$c;)V
    //   288: ldc 215
    //   290: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   293: iload 4
    //   295: istore_2
    //   296: goto -241 -> 55
    //   299: aload_0
    //   300: getfield 100	com/tencent/mm/sdk/g/b/d:xEg	Ljava/util/HashSet;
    //   303: aload 9
    //   305: invokevirtual 188	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   308: pop
    //   309: aload_0
    //   310: getfield 100	com/tencent/mm/sdk/g/b/d:xEg	Ljava/util/HashSet;
    //   313: invokevirtual 243	java/util/HashSet:size	()I
    //   316: istore 5
    //   318: iload 5
    //   320: aload_0
    //   321: getfield 245	com/tencent/mm/sdk/g/b/d:xEj	I
    //   324: if_icmple +9 -> 333
    //   327: aload_0
    //   328: iload 5
    //   330: putfield 245	com/tencent/mm/sdk/g/b/d:xEj	I
    //   333: iconst_1
    //   334: istore 5
    //   336: aload 11
    //   338: invokevirtual 182	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   341: iload_3
    //   342: istore_2
    //   343: iload 5
    //   345: ifeq +46 -> 391
    //   348: aload 9
    //   350: getfield 161	com/tencent/mm/sdk/g/b/d$c:oAl	Landroid/os/HandlerThread;
    //   353: invokevirtual 248	android/os/HandlerThread:start	()V
    //   356: new 250	android/os/Handler
    //   359: astore_1
    //   360: aload_1
    //   361: aload 9
    //   363: getfield 161	com/tencent/mm/sdk/g/b/d$c:oAl	Landroid/os/HandlerThread;
    //   366: invokevirtual 254	android/os/HandlerThread:getLooper	()Landroid/os/Looper;
    //   369: invokespecial 257	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   372: aload 9
    //   374: aload_1
    //   375: putfield 261	com/tencent/mm/sdk/g/b/d$c:handler	Landroid/os/Handler;
    //   378: aload 9
    //   380: getfield 261	com/tencent/mm/sdk/g/b/d$c:handler	Landroid/os/Handler;
    //   383: aload 9
    //   385: invokevirtual 265	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   388: pop
    //   389: iconst_1
    //   390: istore_2
    //   391: iload_2
    //   392: ifne +9 -> 401
    //   395: aload_0
    //   396: aload 9
    //   398: invokespecial 232	com/tencent/mm/sdk/g/b/d:b	(Lcom/tencent/mm/sdk/g/b/d$c;)V
    //   401: ldc 215
    //   403: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   406: goto -351 -> 55
    //   409: astore 11
    //   411: aconst_null
    //   412: astore_1
    //   413: goto -166 -> 247
    //   416: iconst_0
    //   417: istore 5
    //   419: goto -83 -> 336
    //   422: goto -330 -> 92
    //
    // Exception table:
    //   from	to	target	type
    //   180	192	229	finally
    //   206	229	229	finally
    //   260	273	229	finally
    //   299	333	229	finally
    //   155	162	242	finally
    //   169	180	242	finally
    //   230	242	242	finally
    //   277	282	242	finally
    //   336	341	242	finally
    //   348	389	242	finally
    //   143	155	409	finally
  }

  private void aq(Runnable paramRunnable)
  {
    AppMethodBeat.i(52655);
    this.xEt.at(paramRunnable);
    AppMethodBeat.o(52655);
  }

  private static String ar(Runnable paramRunnable)
  {
    AppMethodBeat.i(52649);
    if (paramRunnable == null)
    {
      paramRunnable = "";
      AppMethodBeat.o(52649);
      return paramRunnable;
    }
    if ((paramRunnable instanceof b));
    for (paramRunnable = ((b)paramRunnable).getKey(); ; paramRunnable = paramRunnable.getClass().getName())
    {
      AppMethodBeat.o(52649);
      break;
    }
  }

  private void b(c paramc)
  {
    AppMethodBeat.i(52659);
    ReentrantLock localReentrantLock = this.xDM;
    localReentrantLock.lock();
    if (paramc != null);
    try
    {
      paramc.oAl.quit();
      this.xEg.remove(paramc);
      dqf();
      dqg();
      return;
    }
    finally
    {
      localReentrantLock.unlock();
      AppMethodBeat.o(52659);
    }
    throw paramc;
  }

  private void dqf()
  {
    AppMethodBeat.i(52642);
    int i;
    do
      i = this.xEe.get();
    while (!this.xEe.compareAndSet(i, i - 1));
    AppMethodBeat.o(52642);
  }

  private void dqg()
  {
    AppMethodBeat.i(52651);
    while (true)
    {
      int i = this.xEe.get();
      int j;
      if (i < 0)
      {
        j = 1;
        if ((j == 0) && (!gX(i, 1073741824)) && (((0xE0000000 & i) != 0) || (dql())))
          break label60;
        AppMethodBeat.o(52651);
      }
      while (true)
      {
        label54: return;
        j = 0;
        break;
        label60: if ((0x1FFFFFFF & i) == 0)
          break label81;
        po(true);
        AppMethodBeat.o(52651);
      }
      label81: ReentrantLock localReentrantLock = this.xDM;
      localReentrantLock.lock();
      try
      {
        if (this.xEe.compareAndSet(i, 1073741824))
        {
          this.xEe.set(1610612736);
          this.xEi.signalAll();
          localReentrantLock.unlock();
          AppMethodBeat.o(52651);
          break label54;
        }
        localReentrantLock.unlock();
      }
      finally
      {
        localReentrantLock.unlock();
        AppMethodBeat.o(52651);
      }
    }
  }

  private Runnable dqh()
  {
    AppMethodBeat.i(52647);
    int i = this.xEe.get() & 0xE0000000;
    Object localObject1;
    if ((i >= 0) && ((i >= 536870912) || (dql())))
    {
      localObject1 = null;
      AppMethodBeat.o(52647);
    }
    while (true)
    {
      return localObject1;
      Object localObject2 = (Runnable)this.xEf.poll();
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = localObject2;
        if (getActiveCount() < this.xEu)
        {
          localObject1 = localObject2;
          if (!this.xEw.isEmpty())
          {
            this.xEw.size();
            localObject1 = (Runnable)this.xEw.poll();
            localObject2 = this.xEx;
            ar((Runnable)localObject1);
            ((a)localObject2).dqa();
          }
        }
      }
      AppMethodBeat.o(52647);
    }
  }

  private boolean dqi()
  {
    AppMethodBeat.i(52645);
    boolean bool;
    if ((this.xEe.get() & 0xE0000000) >= 0)
    {
      AppMethodBeat.o(52645);
      bool = false;
    }
    while (true)
    {
      return bool;
      ReentrantLock localReentrantLock = this.xDM;
      localReentrantLock.lock();
      try
      {
        Iterator localIterator = this.xEh.iterator();
        c localc;
        while (true)
          if (localIterator.hasNext())
          {
            localc = (c)localIterator.next();
            if ((!localc.xEA) && (localc.oAl.isAlive()))
            {
              localc.xEq = null;
              localc.xEz = ar(null);
              localc.handler.post(localc);
              localIterator.remove();
              localReentrantLock.unlock();
              AppMethodBeat.o(52645);
              bool = true;
              break;
            }
          }
        if (localIterator.hasNext())
        {
          localc = (c)localIterator.next();
          localc.xEq = null;
          localc.xEz = ar(null);
          localc.handler.post(localc);
          localIterator.remove();
          ab.w("HandlerThreadPool", "[notifyWorker] fallback! thread id:%s %s", new Object[] { Integer.valueOf(localc.oAl.getThreadId()), localc.xEz });
          localReentrantLock.unlock();
          AppMethodBeat.o(52645);
          bool = true;
          continue;
        }
        localReentrantLock.unlock();
        AppMethodBeat.o(52645);
        bool = false;
      }
      finally
      {
        localReentrantLock.unlock();
        AppMethodBeat.o(52645);
      }
    }
  }

  private void dqk()
  {
    AppMethodBeat.i(52640);
    SecurityManager localSecurityManager = System.getSecurityManager();
    if (localSecurityManager != null)
    {
      localSecurityManager.checkPermission(xEo);
      ReentrantLock localReentrantLock = this.xDM;
      localReentrantLock.lock();
      try
      {
        Iterator localIterator = this.xEg.iterator();
        while (localIterator.hasNext())
          localSecurityManager.checkAccess(((c)localIterator.next()).oAl);
      }
      finally
      {
        localReentrantLock.unlock();
        AppMethodBeat.o(52640);
      }
      localReentrantLock.unlock();
      AppMethodBeat.o(52640);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(52640);
    }
  }

  private boolean dql()
  {
    AppMethodBeat.i(52648);
    boolean bool;
    if ((this.xEf.isEmpty()) && (this.xEw.isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(52648);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52648);
    }
  }

  private String dqn()
  {
    AppMethodBeat.i(52661);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("print:\n-------------------------------------------------------------------------\n");
    Object localObject2 = this.xDM;
    try
    {
      ((ReentrantLock)localObject2).lock();
      Iterator localIterator = this.xEg.iterator();
      while (localIterator.hasNext())
      {
        c localc = (c)localIterator.next();
        localStringBuilder.append(String.format("worker[%s]:", new Object[] { localc.oAl.getName() }));
        for (int i = 0; i < localc.xEr; i++)
          localStringBuilder.append("*");
        localStringBuilder.append("\n");
      }
    }
    finally
    {
      ((ReentrantLock)localObject2).unlock();
      AppMethodBeat.o(52661);
    }
    ((ReentrantLock)localObject2).unlock();
    localObject2 = localObject1.toString();
    AppMethodBeat.o(52661);
    return localObject2;
  }

  private boolean el(String paramString, int paramInt)
  {
    AppMethodBeat.i(52656);
    ReentrantLock localReentrantLock = this.xDM;
    localReentrantLock.lock();
    try
    {
      Iterator localIterator = this.xEg.iterator();
      int i = 0;
      boolean bool;
      if (localIterator.hasNext())
      {
        c localc = (c)localIterator.next();
        if (localc.isLocked())
        {
          bool = paramString.equals(localc.xEz);
          if (bool)
          {
            int j = i + 1;
            i = j;
            if (j >= paramInt)
            {
              localReentrantLock.unlock();
              bool = true;
              AppMethodBeat.o(52656);
            }
          }
        }
      }
      while (true)
      {
        return bool;
        break;
        localReentrantLock.unlock();
        AppMethodBeat.o(52656);
        bool = false;
      }
    }
    finally
    {
      localReentrantLock.unlock();
      AppMethodBeat.o(52656);
    }
    throw paramString;
  }

  private static boolean gX(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= paramInt2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private int getActiveCount()
  {
    AppMethodBeat.i(52652);
    ReentrantLock localReentrantLock = this.xDM;
    localReentrantLock.lock();
    int i = 0;
    while (true)
      try
      {
        Iterator localIterator = this.xEg.iterator();
        if (localIterator.hasNext())
        {
          boolean bool = ((c)localIterator.next()).isLocked();
          if (bool)
            i++;
        }
        else
        {
          return i;
        }
      }
      finally
      {
        localReentrantLock.unlock();
        AppMethodBeat.o(52652);
      }
  }

  // ERROR //
  private void po(boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc_w 419
    //   3: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 89	com/tencent/mm/sdk/g/b/d:xDM	Ljava/util/concurrent/locks/ReentrantLock;
    //   10: astore_2
    //   11: aload_2
    //   12: invokevirtual 148	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   15: aload_0
    //   16: getfield 100	com/tencent/mm/sdk/g/b/d:xEg	Ljava/util/HashSet;
    //   19: invokevirtual 329	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   22: astore_3
    //   23: aload_3
    //   24: invokeinterface 334 1 0
    //   29: ifeq +63 -> 92
    //   32: aload_3
    //   33: invokeinterface 337 1 0
    //   38: checkcast 16	com/tencent/mm/sdk/g/b/d$c
    //   41: astore 4
    //   43: aload 4
    //   45: getfield 161	com/tencent/mm/sdk/g/b/d$c:oAl	Landroid/os/HandlerThread;
    //   48: astore 5
    //   50: aload 5
    //   52: invokevirtual 422	android/os/HandlerThread:isInterrupted	()Z
    //   55: ifne +33 -> 88
    //   58: aload 4
    //   60: invokevirtual 425	com/tencent/mm/sdk/g/b/d$c:tryLock	()Z
    //   63: istore 6
    //   65: iload 6
    //   67: ifeq +21 -> 88
    //   70: aload 5
    //   72: invokevirtual 167	android/os/HandlerThread:quit	()Z
    //   75: pop
    //   76: aload 5
    //   78: invokevirtual 428	android/os/HandlerThread:interrupt	()V
    //   81: aload 4
    //   83: iconst_1
    //   84: invokevirtual 171	com/tencent/mm/sdk/g/b/d$c:release	(I)Z
    //   87: pop
    //   88: iload_1
    //   89: ifeq -66 -> 23
    //   92: aload_2
    //   93: invokevirtual 182	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   96: ldc_w 419
    //   99: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: return
    //   103: astore 5
    //   105: ldc_w 345
    //   108: aload 5
    //   110: invokevirtual 429	java/lang/SecurityException:toString	()Ljava/lang/String;
    //   113: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   116: aload 4
    //   118: iconst_1
    //   119: invokevirtual 171	com/tencent/mm/sdk/g/b/d$c:release	(I)Z
    //   122: pop
    //   123: goto -35 -> 88
    //   126: astore 4
    //   128: aload_2
    //   129: invokevirtual 182	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   132: ldc_w 419
    //   135: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   138: aload 4
    //   140: athrow
    //   141: astore_3
    //   142: aload 4
    //   144: iconst_1
    //   145: invokevirtual 171	com/tencent/mm/sdk/g/b/d$c:release	(I)Z
    //   148: pop
    //   149: ldc_w 419
    //   152: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: aload_3
    //   156: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   70	81	103	java/lang/SecurityException
    //   15	23	126	finally
    //   23	65	126	finally
    //   81	88	126	finally
    //   116	123	126	finally
    //   142	157	126	finally
    //   70	81	141	finally
    //   105	116	141	finally
  }

  private List<Runnable> shutdownNow()
  {
    AppMethodBeat.i(52638);
    ReentrantLock localReentrantLock1 = this.xDM;
    localReentrantLock1.lock();
    try
    {
      dqk();
      Mg(536870912);
      ReentrantLock localReentrantLock2 = this.xDM;
      localReentrantLock2.lock();
      try
      {
        Iterator localIterator = this.xEg.iterator();
        while (localIterator.hasNext())
          ((c)localIterator.next()).dqo();
      }
      finally
      {
      }
    }
    finally
    {
      localReentrantLock1.unlock();
      AppMethodBeat.o(52638);
    }
    localObject1.unlock();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    a(this.xEf);
    a(this.xEw);
    localReentrantLock1.unlock();
    dqg();
    AppMethodBeat.o(52638);
    return localArrayList;
  }

  // ERROR //
  final void a(c paramc)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 453
    //   5: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: getfield 161	com/tencent/mm/sdk/g/b/d$c:oAl	Landroid/os/HandlerThread;
    //   12: astore_3
    //   13: aload_1
    //   14: getfield 175	com/tencent/mm/sdk/g/b/d$c:xEq	Ljava/lang/Runnable;
    //   17: ifnonnull +169 -> 186
    //   20: aload_0
    //   21: invokespecial 455	com/tencent/mm/sdk/g/b/d:dqh	()Ljava/lang/Runnable;
    //   24: astore 4
    //   26: aload_1
    //   27: aload 4
    //   29: invokestatic 236	com/tencent/mm/sdk/g/b/d:ar	(Ljava/lang/Runnable;)Ljava/lang/String;
    //   32: putfield 179	com/tencent/mm/sdk/g/b/d$c:xEz	Ljava/lang/String;
    //   35: aload_1
    //   36: aconst_null
    //   37: putfield 175	com/tencent/mm/sdk/g/b/d$c:xEq	Ljava/lang/Runnable;
    //   40: aload_1
    //   41: iconst_1
    //   42: invokevirtual 171	com/tencent/mm/sdk/g/b/d$c:release	(I)Z
    //   45: pop
    //   46: iconst_1
    //   47: istore 5
    //   49: iconst_0
    //   50: istore 6
    //   52: aload 4
    //   54: astore 7
    //   56: aload 4
    //   58: ifnonnull +23 -> 81
    //   61: iload 6
    //   63: ifeq +105 -> 168
    //   66: iload 5
    //   68: istore 8
    //   70: aload_0
    //   71: invokespecial 455	com/tencent/mm/sdk/g/b/d:dqh	()Ljava/lang/Runnable;
    //   74: astore 7
    //   76: aload 7
    //   78: ifnull +90 -> 168
    //   81: iload 5
    //   83: istore 8
    //   85: aload_1
    //   86: iconst_1
    //   87: invokevirtual 458	com/tencent/mm/sdk/g/b/d$c:acquire	(I)V
    //   90: iload 5
    //   92: istore 8
    //   94: aload_0
    //   95: getfield 82	com/tencent/mm/sdk/g/b/d:xEe	Ljava/util/concurrent/atomic/AtomicInteger;
    //   98: invokevirtual 129	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   101: ldc_w 312
    //   104: invokestatic 133	com/tencent/mm/sdk/g/b/d:gX	(II)Z
    //   107: ifne +33 -> 140
    //   110: iload 5
    //   112: istore 8
    //   114: invokestatic 461	java/lang/Thread:interrupted	()Z
    //   117: ifeq +78 -> 195
    //   120: iload 5
    //   122: istore 8
    //   124: aload_0
    //   125: getfield 82	com/tencent/mm/sdk/g/b/d:xEe	Ljava/util/concurrent/atomic/AtomicInteger;
    //   128: invokevirtual 129	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   131: ldc_w 312
    //   134: invokestatic 133	com/tencent/mm/sdk/g/b/d:gX	(II)Z
    //   137: ifeq +58 -> 195
    //   140: iload 5
    //   142: istore 8
    //   144: aload_3
    //   145: invokevirtual 422	android/os/HandlerThread:isInterrupted	()Z
    //   148: ifne +47 -> 195
    //   151: iload 5
    //   153: istore 8
    //   155: aload_3
    //   156: invokevirtual 167	android/os/HandlerThread:quit	()Z
    //   159: pop
    //   160: iload 5
    //   162: istore 8
    //   164: aload_3
    //   165: invokevirtual 428	android/os/HandlerThread:interrupt	()V
    //   168: iload 5
    //   170: ifeq +319 -> 489
    //   173: aload_0
    //   174: aload_1
    //   175: iconst_0
    //   176: invokespecial 463	com/tencent/mm/sdk/g/b/d:a	(Lcom/tencent/mm/sdk/g/b/d$c;Z)V
    //   179: ldc_w 453
    //   182: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: return
    //   186: aload_1
    //   187: getfield 175	com/tencent/mm/sdk/g/b/d$c:xEq	Ljava/lang/Runnable;
    //   190: astore 4
    //   192: goto -166 -> 26
    //   195: aload_1
    //   196: aload 7
    //   198: invokestatic 236	com/tencent/mm/sdk/g/b/d:ar	(Ljava/lang/Runnable;)Ljava/lang/String;
    //   201: putfield 179	com/tencent/mm/sdk/g/b/d$c:xEz	Ljava/lang/String;
    //   204: aload_0
    //   205: aload_3
    //   206: aload 7
    //   208: invokevirtual 467	com/tencent/mm/sdk/g/b/d:beforeExecute	(Ljava/lang/Thread;Ljava/lang/Runnable;)V
    //   211: aload_2
    //   212: astore 4
    //   214: aload 7
    //   216: invokeinterface 470 1 0
    //   221: aload_0
    //   222: aload 7
    //   224: aconst_null
    //   225: invokevirtual 474	com/tencent/mm/sdk/g/b/d:afterExecute	(Ljava/lang/Runnable;Ljava/lang/Throwable;)V
    //   228: aload_1
    //   229: invokevirtual 477	com/tencent/mm/sdk/g/b/d$c:dqj	()Z
    //   232: istore 6
    //   234: iload 5
    //   236: istore 9
    //   238: iload 6
    //   240: ifne +15 -> 255
    //   243: aload_1
    //   244: getfield 261	com/tencent/mm/sdk/g/b/d$c:handler	Landroid/os/Handler;
    //   247: aload_1
    //   248: invokevirtual 265	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   251: pop
    //   252: iconst_0
    //   253: istore 9
    //   255: iload 9
    //   257: istore 8
    //   259: aload_1
    //   260: aload_1
    //   261: getfield 153	com/tencent/mm/sdk/g/b/d$c:xEr	J
    //   264: lconst_1
    //   265: ladd
    //   266: putfield 153	com/tencent/mm/sdk/g/b/d$c:xEr	J
    //   269: iload 9
    //   271: istore 8
    //   273: aload_1
    //   274: iconst_1
    //   275: invokevirtual 171	com/tencent/mm/sdk/g/b/d$c:release	(I)Z
    //   278: pop
    //   279: iload 9
    //   281: istore 8
    //   283: getstatic 482	com/tencent/mm/sdk/g/d:xDB	Z
    //   286: ifeq +193 -> 479
    //   289: iload 9
    //   291: istore 8
    //   293: ldc_w 345
    //   296: aload_0
    //   297: invokespecial 484	com/tencent/mm/sdk/g/b/d:dqn	()Ljava/lang/String;
    //   300: invokestatic 486	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   303: aconst_null
    //   304: astore 4
    //   306: iload 9
    //   308: istore 5
    //   310: goto -258 -> 52
    //   313: astore_2
    //   314: aload_2
    //   315: astore 4
    //   317: ldc_w 453
    //   320: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   323: aload_2
    //   324: astore 4
    //   326: aload_2
    //   327: athrow
    //   328: astore_2
    //   329: aload_0
    //   330: aload 7
    //   332: aload 4
    //   334: invokevirtual 474	com/tencent/mm/sdk/g/b/d:afterExecute	(Ljava/lang/Runnable;Ljava/lang/Throwable;)V
    //   337: aload 4
    //   339: ifnonnull +173 -> 512
    //   342: aload_1
    //   343: invokevirtual 477	com/tencent/mm/sdk/g/b/d$c:dqj	()Z
    //   346: ifne +166 -> 512
    //   349: aload_1
    //   350: getfield 261	com/tencent/mm/sdk/g/b/d$c:handler	Landroid/os/Handler;
    //   353: aload_1
    //   354: invokevirtual 265	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   357: pop
    //   358: iconst_0
    //   359: istore 5
    //   361: ldc_w 453
    //   364: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   367: aload_2
    //   368: athrow
    //   369: astore 4
    //   371: aload_1
    //   372: aload_1
    //   373: getfield 153	com/tencent/mm/sdk/g/b/d$c:xEr	J
    //   376: lconst_1
    //   377: ladd
    //   378: putfield 153	com/tencent/mm/sdk/g/b/d$c:xEr	J
    //   381: aload_1
    //   382: iconst_1
    //   383: invokevirtual 171	com/tencent/mm/sdk/g/b/d$c:release	(I)Z
    //   386: pop
    //   387: getstatic 482	com/tencent/mm/sdk/g/d:xDB	Z
    //   390: ifeq +13 -> 403
    //   393: ldc_w 345
    //   396: aload_0
    //   397: invokespecial 484	com/tencent/mm/sdk/g/b/d:dqn	()Ljava/lang/String;
    //   400: invokestatic 486	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   403: ldc_w 453
    //   406: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   409: aload 4
    //   411: athrow
    //   412: astore 4
    //   414: iload 5
    //   416: ifeq +9 -> 425
    //   419: aload_0
    //   420: aload_1
    //   421: iconst_1
    //   422: invokespecial 463	com/tencent/mm/sdk/g/b/d:a	(Lcom/tencent/mm/sdk/g/b/d$c;Z)V
    //   425: ldc_w 453
    //   428: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   431: aload 4
    //   433: athrow
    //   434: astore_2
    //   435: aload_2
    //   436: astore 4
    //   438: ldc_w 453
    //   441: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   444: aload_2
    //   445: astore 4
    //   447: aload_2
    //   448: athrow
    //   449: astore_2
    //   450: aload_2
    //   451: astore 4
    //   453: new 450	java/lang/Error
    //   456: astore_3
    //   457: aload_2
    //   458: astore 4
    //   460: aload_3
    //   461: aload_2
    //   462: invokespecial 489	java/lang/Error:<init>	(Ljava/lang/Throwable;)V
    //   465: aload_2
    //   466: astore 4
    //   468: ldc_w 453
    //   471: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   474: aload_2
    //   475: astore 4
    //   477: aload_3
    //   478: athrow
    //   479: aconst_null
    //   480: astore 4
    //   482: iload 9
    //   484: istore 5
    //   486: goto -434 -> 52
    //   489: ldc_w 453
    //   492: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   495: goto -310 -> 185
    //   498: astore 4
    //   500: iload 8
    //   502: istore 5
    //   504: goto -90 -> 414
    //   507: astore 4
    //   509: goto -138 -> 371
    //   512: goto -151 -> 361
    //
    // Exception table:
    //   from	to	target	type
    //   214	221	313	java/lang/RuntimeException
    //   214	221	328	finally
    //   317	323	328	finally
    //   326	328	328	finally
    //   438	444	328	finally
    //   447	449	328	finally
    //   453	457	328	finally
    //   460	465	328	finally
    //   468	474	328	finally
    //   477	479	328	finally
    //   361	369	369	finally
    //   371	403	412	finally
    //   403	412	412	finally
    //   214	221	434	java/lang/Error
    //   214	221	449	java/lang/Throwable
    //   70	76	498	finally
    //   85	90	498	finally
    //   94	110	498	finally
    //   114	120	498	finally
    //   124	140	498	finally
    //   144	151	498	finally
    //   155	160	498	finally
    //   164	168	498	finally
    //   259	269	498	finally
    //   273	279	498	finally
    //   283	289	498	finally
    //   293	303	498	finally
    //   195	211	507	finally
    //   221	234	507	finally
    //   243	252	507	finally
    //   329	337	507	finally
    //   342	358	507	finally
  }

  protected void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
  {
  }

  protected void beforeExecute(Thread paramThread, Runnable paramRunnable)
  {
  }

  public final String dqm()
  {
    AppMethodBeat.i(52660);
    Object localObject1 = this.xDM;
    StringBuilder localStringBuilder = new StringBuilder();
    c localc;
    try
    {
      ((ReentrantLock)localObject1).lock();
      localIterator = this.xEh.iterator();
      localStringBuilder.append("recycleWorker:\n");
      while (localIterator.hasNext())
      {
        localc = (c)localIterator.next();
        localStringBuilder.append(localc.oAl.getThreadId()).append(" ").append(localc.xEA).append(" ").append(localc.isLocked()).append(", ");
      }
    }
    finally
    {
      ((ReentrantLock)localObject1).unlock();
      AppMethodBeat.o(52660);
    }
    localObject2.append("\nworker:\n");
    Iterator localIterator = this.xEg.iterator();
    while (localIterator.hasNext())
    {
      localc = (c)localIterator.next();
      localObject2.append(localc.oAl.getThreadId()).append(" ").append(localc.xEA).append(" ").append(localc.isLocked()).append(", ");
    }
    ((ReentrantLock)localObject1).unlock();
    localObject1 = localObject2.toString();
    AppMethodBeat.o(52660);
    return localObject1;
  }

  public void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(52653);
    if (paramRunnable == null)
    {
      paramRunnable = new NullPointerException();
      AppMethodBeat.o(52653);
      throw paramRunnable;
    }
    int i = this.xEe.get();
    int j = i & 0x1FFFFFFF;
    if (j < this.cml)
      if (a(paramRunnable, true))
        AppMethodBeat.o(52653);
    while (true)
    {
      return;
      i = this.xEe.get();
      String str = ar(paramRunnable);
      if (i < 0);
      for (int k = 1; ; k = 0)
      {
        if ((k == 0) || (!el(str, this.xEu)))
          break label138;
        this.xEw.offer(paramRunnable);
        this.xEx.Me(j);
        AppMethodBeat.o(52653);
        break;
      }
      label138: if (i < 0)
        i = 1;
      while (true)
        if ((i != 0) && (this.xEf.offer(paramRunnable)))
        {
          if (dqi())
          {
            AppMethodBeat.o(52653);
            break;
            i = 0;
            continue;
          }
          k = this.xEe.get();
          if (k < 0);
          for (i = 1; ; i = 0)
          {
            if ((i != 0) || (!remove(paramRunnable)))
              break label229;
            aq(paramRunnable);
            AppMethodBeat.o(52653);
            break;
          }
          label229: if ((k & 0x1FFFFFFF) == 0)
            a(null, false);
          AppMethodBeat.o(52653);
          break;
        }
      if (!a(paramRunnable, false))
        aq(paramRunnable);
      AppMethodBeat.o(52653);
    }
  }

  public final int getCorePoolSize()
  {
    return this.cml;
  }

  public final void p(final Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(52654);
    com.tencent.mm.sdk.g.d.xDG.p(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(52626);
        d.this.execute(paramRunnable);
        AppMethodBeat.o(52626);
      }
    }
    , paramLong);
    AppMethodBeat.o(52654);
  }

  public final boolean remove(Runnable paramRunnable)
  {
    AppMethodBeat.i(52657);
    boolean bool1 = this.xEf.remove(paramRunnable);
    boolean bool2 = this.xEw.remove(paramRunnable);
    dqg();
    if ((bool1) || (bool2))
    {
      bool1 = true;
      AppMethodBeat.o(52657);
    }
    while (true)
    {
      return bool1;
      bool1 = false;
      AppMethodBeat.o(52657);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(52636);
    shutdownNow();
    Mg(-536870912);
    AppMethodBeat.o(52636);
  }

  public final void shutdown()
  {
    AppMethodBeat.i(52637);
    ReentrantLock localReentrantLock = this.xDM;
    localReentrantLock.lock();
    try
    {
      dqk();
      Mg(0);
      po(false);
      localReentrantLock.unlock();
      dqg();
      AppMethodBeat.o(52637);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
      AppMethodBeat.o(52637);
    }
  }

  public static abstract interface a
  {
    public abstract void Me(int paramInt);

    public abstract void dqa();
  }

  public static abstract interface b
  {
    public abstract void at(Runnable paramRunnable);
  }

  final class c extends AbstractQueuedSynchronizer
    implements Printer, Runnable
  {
    Handler handler;
    final HandlerThread oAl;
    volatile boolean xEA;
    volatile Runnable xEq;
    volatile long xEr;
    volatile String xEz;

    c(Runnable arg2)
    {
      AppMethodBeat.i(52627);
      this.xEA = false;
      setState(-1);
      Runnable localRunnable;
      this.xEq = localRunnable;
      this.xEz = d.as(localRunnable);
      int i = d.Mh(d.a(d.this).get());
      this.oAl = d.this.xEs.a(this, "HandlerThreadPool#".concat(String.valueOf(i + 1)), this);
      AppMethodBeat.o(52627);
    }

    public final boolean dqj()
    {
      AppMethodBeat.i(52628);
      boolean bool;
      if (Build.VERSION.SDK_INT >= 23)
      {
        bool = this.handler.getLooper().getQueue().isIdle();
        AppMethodBeat.o(52628);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(52628);
      }
    }

    final void dqo()
    {
      AppMethodBeat.i(52635);
      HandlerThread localHandlerThread;
      if (getState() >= 0)
      {
        localHandlerThread = this.oAl;
        if ((localHandlerThread == null) || (localHandlerThread.isInterrupted()));
      }
      while (true)
      {
        try
        {
          localHandlerThread.quit();
          localHandlerThread.interrupt();
          AppMethodBeat.o(52635);
          return;
        }
        catch (SecurityException localSecurityException)
        {
        }
        AppMethodBeat.o(52635);
      }
    }

    protected final boolean isHeldExclusively()
    {
      AppMethodBeat.i(52630);
      boolean bool;
      if (getState() != 0)
      {
        bool = true;
        AppMethodBeat.o(52630);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(52630);
      }
    }

    public final boolean isLocked()
    {
      AppMethodBeat.i(52634);
      boolean bool = isHeldExclusively();
      AppMethodBeat.o(52634);
      return bool;
    }

    public final void println(String paramString)
    {
      if (!this.xEA);
      for (boolean bool = true; ; bool = false)
      {
        this.xEA = bool;
        return;
      }
    }

    public final void run()
    {
      AppMethodBeat.i(52629);
      d.this.a(this);
      AppMethodBeat.o(52629);
    }

    protected final boolean tryAcquire(int paramInt)
    {
      boolean bool = true;
      AppMethodBeat.i(52631);
      if (compareAndSetState(0, 1))
      {
        setExclusiveOwnerThread(Thread.currentThread());
        AppMethodBeat.o(52631);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(52631);
        bool = false;
      }
    }

    public final boolean tryLock()
    {
      AppMethodBeat.i(52633);
      boolean bool = tryAcquire(1);
      AppMethodBeat.o(52633);
      return bool;
    }

    protected final boolean tryRelease(int paramInt)
    {
      AppMethodBeat.i(52632);
      setExclusiveOwnerThread(null);
      setState(0);
      AppMethodBeat.o(52632);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.g.b.d
 * JD-Core Version:    0.6.2
 */