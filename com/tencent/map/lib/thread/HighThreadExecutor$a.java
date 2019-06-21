package com.tencent.map.lib.thread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class HighThreadExecutor$a<E> extends AbstractQueue<E>
  implements Serializable, BlockingQueue<E>
{
  transient a<E>.b<E> a;
  private int c;
  private final AtomicInteger d;
  private final ReentrantLock e;
  private final Condition f;
  private final ReentrantLock g;
  private final Condition h;

  public HighThreadExecutor$a(HighThreadExecutor paramHighThreadExecutor, int paramInt)
  {
    AppMethodBeat.i(98182);
    this.d = new AtomicInteger();
    this.e = new ReentrantLock();
    this.f = this.e.newCondition();
    this.g = new ReentrantLock();
    this.h = this.g.newCondition();
    this.c = paramInt;
    this.a = new b(null);
    AppMethodBeat.o(98182);
  }

  private void a(a<E>.b<E> parama)
  {
    parama.b = this.a.b;
    this.a.b = parama;
  }

  private E b()
  {
    b localb = this.a.b;
    Object localObject;
    if (localb != null)
    {
      this.a.b = localb.b;
      localb.b = null;
      localObject = localb.a;
      localb.a = null;
    }
    while (true)
    {
      return localObject;
      localObject = null;
    }
  }

  private void c()
  {
    AppMethodBeat.i(98195);
    this.g.lock();
    this.e.lock();
    AppMethodBeat.o(98195);
  }

  private void d()
  {
    AppMethodBeat.i(98198);
    ReentrantLock localReentrantLock = this.g;
    localReentrantLock.lock();
    try
    {
      this.h.signal();
      return;
    }
    finally
    {
      localReentrantLock.unlock();
      AppMethodBeat.o(98198);
    }
  }

  private void e()
  {
    AppMethodBeat.i(98199);
    ReentrantLock localReentrantLock = this.e;
    localReentrantLock.lock();
    try
    {
      this.f.signal();
      return;
    }
    finally
    {
      localReentrantLock.unlock();
      AppMethodBeat.o(98199);
    }
  }

  void a()
  {
    AppMethodBeat.i(98196);
    this.e.unlock();
    this.g.unlock();
    AppMethodBeat.o(98196);
  }

  void a(a<E>.b<E> parama1, a<E>.b<E> parama2)
  {
    AppMethodBeat.i(98197);
    parama1.a = null;
    parama2.b = parama1.b;
    if (this.d.getAndDecrement() == this.c)
      this.h.signal();
    AppMethodBeat.o(98197);
  }

  public int drainTo(Collection<? super E> paramCollection)
  {
    AppMethodBeat.i(98185);
    int i = drainTo(paramCollection, 2147483647);
    AppMethodBeat.o(98185);
    return i;
  }

  // ERROR //
  public int drainTo(Collection<? super E> paramCollection, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_1
    //   3: istore 4
    //   5: iconst_0
    //   6: istore 5
    //   8: iconst_0
    //   9: istore 6
    //   11: iconst_0
    //   12: istore 7
    //   14: ldc 120
    //   16: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   19: aload_1
    //   20: ifnonnull +18 -> 38
    //   23: new 122	java/lang/NullPointerException
    //   26: dup
    //   27: invokespecial 123	java/lang/NullPointerException:<init>	()V
    //   30: astore_1
    //   31: ldc 120
    //   33: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: aload_1
    //   37: athrow
    //   38: aload_1
    //   39: aload_0
    //   40: if_acmpne +18 -> 58
    //   43: new 125	java/lang/IllegalArgumentException
    //   46: dup
    //   47: invokespecial 126	java/lang/IllegalArgumentException:<init>	()V
    //   50: astore_1
    //   51: ldc 120
    //   53: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: aload_1
    //   57: athrow
    //   58: iload_2
    //   59: ifgt +13 -> 72
    //   62: ldc 120
    //   64: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   67: iload 7
    //   69: istore_2
    //   70: iload_2
    //   71: ireturn
    //   72: aload_0
    //   73: getfield 54	com/tencent/map/lib/thread/HighThreadExecutor$a:e	Ljava/util/concurrent/locks/ReentrantLock;
    //   76: astore 8
    //   78: aload 8
    //   80: invokevirtual 93	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   83: iload 6
    //   85: istore 7
    //   87: iload_2
    //   88: aload_0
    //   89: getfield 49	com/tencent/map/lib/thread/HighThreadExecutor$a:d	Ljava/util/concurrent/atomic/AtomicInteger;
    //   92: invokevirtual 129	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   95: invokestatic 135	java/lang/Math:min	(II)I
    //   98: istore 9
    //   100: iload 6
    //   102: istore 7
    //   104: aload_0
    //   105: getfield 71	com/tencent/map/lib/thread/HighThreadExecutor$a:a	Lcom/tencent/map/lib/thread/HighThreadExecutor$a$b;
    //   108: astore 10
    //   110: iconst_0
    //   111: istore 11
    //   113: iload 11
    //   115: iload 9
    //   117: if_icmpge +45 -> 162
    //   120: aload 10
    //   122: getfield 78	com/tencent/map/lib/thread/HighThreadExecutor$a$b:b	Lcom/tencent/map/lib/thread/HighThreadExecutor$a$b;
    //   125: astore 12
    //   127: aload_1
    //   128: aload 12
    //   130: getfield 88	com/tencent/map/lib/thread/HighThreadExecutor$a$b:a	Ljava/lang/Object;
    //   133: invokeinterface 141 2 0
    //   138: pop
    //   139: aload 12
    //   141: aconst_null
    //   142: putfield 88	com/tencent/map/lib/thread/HighThreadExecutor$a$b:a	Ljava/lang/Object;
    //   145: aload 10
    //   147: aload 10
    //   149: putfield 78	com/tencent/map/lib/thread/HighThreadExecutor$a$b:b	Lcom/tencent/map/lib/thread/HighThreadExecutor$a$b;
    //   152: iinc 11 1
    //   155: aload 12
    //   157: astore 10
    //   159: goto -46 -> 113
    //   162: iload 11
    //   164: ifle +158 -> 322
    //   167: iload 6
    //   169: istore 7
    //   171: aload_0
    //   172: aload 10
    //   174: putfield 71	com/tencent/map/lib/thread/HighThreadExecutor$a:a	Lcom/tencent/map/lib/thread/HighThreadExecutor$a$b;
    //   177: iload 6
    //   179: istore 7
    //   181: aload_0
    //   182: getfield 49	com/tencent/map/lib/thread/HighThreadExecutor$a:d	Ljava/util/concurrent/atomic/AtomicInteger;
    //   185: iload 11
    //   187: ineg
    //   188: invokevirtual 145	java/util/concurrent/atomic/AtomicInteger:getAndAdd	(I)I
    //   191: istore_2
    //   192: iload 6
    //   194: istore 7
    //   196: aload_0
    //   197: getfield 66	com/tencent/map/lib/thread/HighThreadExecutor$a:c	I
    //   200: istore 11
    //   202: iload_2
    //   203: iload 11
    //   205: if_icmpne +30 -> 235
    //   208: iload 4
    //   210: istore_2
    //   211: aload 8
    //   213: invokevirtual 102	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   216: iload_2
    //   217: ifeq +7 -> 224
    //   220: aload_0
    //   221: invokespecial 147	com/tencent/map/lib/thread/HighThreadExecutor$a:d	()V
    //   224: ldc 120
    //   226: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   229: iload 9
    //   231: istore_2
    //   232: goto -162 -> 70
    //   235: iconst_0
    //   236: istore_2
    //   237: goto -26 -> 211
    //   240: astore_1
    //   241: iload 5
    //   243: istore_2
    //   244: iload 11
    //   246: ifle +36 -> 282
    //   249: iload 6
    //   251: istore 7
    //   253: aload_0
    //   254: aload 10
    //   256: putfield 71	com/tencent/map/lib/thread/HighThreadExecutor$a:a	Lcom/tencent/map/lib/thread/HighThreadExecutor$a$b;
    //   259: iload 6
    //   261: istore 7
    //   263: aload_0
    //   264: getfield 49	com/tencent/map/lib/thread/HighThreadExecutor$a:d	Ljava/util/concurrent/atomic/AtomicInteger;
    //   267: iload 11
    //   269: ineg
    //   270: invokevirtual 145	java/util/concurrent/atomic/AtomicInteger:getAndAdd	(I)I
    //   273: aload_0
    //   274: getfield 66	com/tencent/map/lib/thread/HighThreadExecutor$a:c	I
    //   277: if_icmpne +40 -> 317
    //   280: iload_3
    //   281: istore_2
    //   282: iload_2
    //   283: istore 7
    //   285: ldc 120
    //   287: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   290: iload_2
    //   291: istore 7
    //   293: aload_1
    //   294: athrow
    //   295: astore_1
    //   296: aload 8
    //   298: invokevirtual 102	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   301: iload 7
    //   303: ifeq +7 -> 310
    //   306: aload_0
    //   307: invokespecial 147	com/tencent/map/lib/thread/HighThreadExecutor$a:d	()V
    //   310: ldc 120
    //   312: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   315: aload_1
    //   316: athrow
    //   317: iconst_0
    //   318: istore_2
    //   319: goto -37 -> 282
    //   322: iconst_0
    //   323: istore_2
    //   324: goto -113 -> 211
    //
    // Exception table:
    //   from	to	target	type
    //   120	152	240	finally
    //   87	100	295	finally
    //   104	110	295	finally
    //   171	177	295	finally
    //   181	192	295	finally
    //   196	202	295	finally
    //   253	259	295	finally
    //   263	280	295	finally
    //   285	290	295	finally
    //   293	295	295	finally
  }

  public Iterator<E> iterator()
  {
    AppMethodBeat.i(98183);
    HighThreadExecutor.a.a locala = new HighThreadExecutor.a.a(this);
    AppMethodBeat.o(98183);
    return locala;
  }

  public boolean offer(E paramE)
  {
    AppMethodBeat.i(98187);
    if (paramE == null)
    {
      paramE = new NullPointerException();
      AppMethodBeat.o(98187);
      throw paramE;
    }
    AtomicInteger localAtomicInteger = this.d;
    if (localAtomicInteger.get() == this.c)
      AppMethodBeat.o(98187);
    for (boolean bool = false; ; bool = false)
    {
      while (true)
      {
        return bool;
        int i = -1;
        b localb = new b(paramE);
        paramE = this.g;
        paramE.lock();
        try
        {
          if (localAtomicInteger.get() < this.c)
          {
            a(localb);
            int j = localAtomicInteger.getAndIncrement();
            i = j;
            if (j + 1 < this.c)
            {
              this.h.signal();
              i = j;
            }
          }
          paramE.unlock();
          if (i == 0)
            e();
          if (i >= 0)
          {
            bool = true;
            AppMethodBeat.o(98187);
          }
        }
        finally
        {
          paramE.unlock();
          AppMethodBeat.o(98187);
        }
      }
      AppMethodBeat.o(98187);
    }
  }

  public boolean offer(E paramE, long paramLong, TimeUnit paramTimeUnit)
  {
    AppMethodBeat.i(98188);
    if (paramE == null)
    {
      paramE = new NullPointerException();
      AppMethodBeat.o(98188);
      throw paramE;
    }
    paramLong = paramTimeUnit.toNanos(paramLong);
    paramTimeUnit = this.g;
    AtomicInteger localAtomicInteger = this.d;
    paramTimeUnit.lockInterruptibly();
    try
    {
      int i = localAtomicInteger.get();
      int j = this.c;
      boolean bool;
      if (i == j)
        if (paramLong <= 0L)
        {
          paramTimeUnit.unlock();
          bool = false;
          AppMethodBeat.o(98188);
        }
      while (true)
      {
        return bool;
        paramLong = this.h.awaitNanos(paramLong);
        break;
        b localb = new com/tencent/map/lib/thread/HighThreadExecutor$a$b;
        localb.<init>(this, paramE);
        a(localb);
        i = localAtomicInteger.getAndIncrement();
        if (i + 1 < this.c)
          this.h.signal();
        paramTimeUnit.unlock();
        if (i == 0)
          e();
        bool = true;
        AppMethodBeat.o(98188);
      }
    }
    finally
    {
      paramTimeUnit.unlock();
      AppMethodBeat.o(98188);
    }
    throw paramE;
  }

  public E peek()
  {
    Object localObject1 = null;
    AppMethodBeat.i(98193);
    if (this.d.get() == 0)
      AppMethodBeat.o(98193);
    while (true)
    {
      return localObject1;
      ReentrantLock localReentrantLock = this.e;
      localReentrantLock.lock();
      try
      {
        b localb = this.a.b;
        if (localb == null)
        {
          localReentrantLock.unlock();
          AppMethodBeat.o(98193);
          continue;
        }
        localObject1 = localb.a;
        localReentrantLock.unlock();
        AppMethodBeat.o(98193);
      }
      finally
      {
        localReentrantLock.unlock();
        AppMethodBeat.o(98193);
      }
    }
  }

  public E poll()
  {
    Object localObject1 = null;
    Object localObject3 = null;
    AppMethodBeat.i(98194);
    AtomicInteger localAtomicInteger = this.d;
    if (localAtomicInteger.get() == 0)
    {
      AppMethodBeat.o(98194);
      localObject1 = localObject3;
    }
    while (true)
    {
      return localObject1;
      int i = -1;
      ReentrantLock localReentrantLock = this.e;
      localReentrantLock.lock();
      try
      {
        if (localAtomicInteger.get() > 0)
        {
          localObject3 = b();
          int j = localAtomicInteger.getAndDecrement();
          i = j;
          localObject1 = localObject3;
          if (j > 1)
          {
            this.f.signal();
            localObject1 = localObject3;
            i = j;
          }
        }
        localReentrantLock.unlock();
        if (i == this.c)
          d();
        AppMethodBeat.o(98194);
      }
      finally
      {
        localReentrantLock.unlock();
        AppMethodBeat.o(98194);
      }
    }
  }

  public E poll(long paramLong, TimeUnit paramTimeUnit)
  {
    AppMethodBeat.i(98189);
    paramLong = paramTimeUnit.toNanos(paramLong);
    AtomicInteger localAtomicInteger = this.d;
    ReentrantLock localReentrantLock = this.e;
    localReentrantLock.lockInterruptibly();
    try
    {
      int i = localAtomicInteger.get();
      if (i == 0)
        if (paramLong <= 0L)
        {
          localReentrantLock.unlock();
          paramTimeUnit = null;
          AppMethodBeat.o(98189);
        }
      while (true)
      {
        return paramTimeUnit;
        paramLong = this.f.awaitNanos(paramLong);
        break;
        paramTimeUnit = b();
        i = localAtomicInteger.getAndDecrement();
        if (i > 1)
          this.f.signal();
        localReentrantLock.unlock();
        if (i == this.c)
          d();
        AppMethodBeat.o(98189);
      }
    }
    finally
    {
      localReentrantLock.unlock();
      AppMethodBeat.o(98189);
    }
    throw paramTimeUnit;
  }

  public void put(E paramE)
  {
    AppMethodBeat.i(98190);
    if (paramE == null)
    {
      paramE = new NullPointerException();
      AppMethodBeat.o(98190);
      throw paramE;
    }
    b localb1 = new b(paramE);
    paramE = this.g;
    AtomicInteger localAtomicInteger = this.d;
    paramE.lockInterruptibly();
    try
    {
      while (localAtomicInteger.get() == this.c)
        this.h.await();
    }
    finally
    {
      paramE.unlock();
      AppMethodBeat.o(98190);
    }
    a(localb2);
    int i = localAtomicInteger.getAndIncrement();
    if (i + 1 < this.c)
      this.h.signal();
    paramE.unlock();
    if (i == 0)
      e();
    AppMethodBeat.o(98190);
  }

  public int remainingCapacity()
  {
    AppMethodBeat.i(98191);
    int i = this.c;
    int j = this.d.get();
    AppMethodBeat.o(98191);
    return i - j;
  }

  public int size()
  {
    AppMethodBeat.i(98184);
    int i = this.d.get();
    AppMethodBeat.o(98184);
    return i;
  }

  public E take()
  {
    AppMethodBeat.i(98192);
    AtomicInteger localAtomicInteger = this.d;
    ReentrantLock localReentrantLock = this.e;
    localReentrantLock.lockInterruptibly();
    try
    {
      while (localAtomicInteger.get() == 0)
        this.f.await();
    }
    finally
    {
      localReentrantLock.unlock();
      AppMethodBeat.o(98192);
    }
    Object localObject2 = b();
    int i = localObject1.getAndDecrement();
    if (i > 1)
      this.f.signal();
    localReentrantLock.unlock();
    if (i == this.c)
      d();
    AppMethodBeat.o(98192);
    return localObject2;
  }

  class b<E>
  {
    E a;
    HighThreadExecutor.a<E>.b<E> b;

    b()
    {
      Object localObject;
      this.a = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.thread.HighThreadExecutor.a
 * JD-Core Version:    0.6.2
 */