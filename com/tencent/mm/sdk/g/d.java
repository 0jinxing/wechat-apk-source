package com.tencent.mm.sdk.g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

public class d
  implements com.tencent.mm.sdk.g.a.b, com.tencent.mm.sdk.g.a.e, com.tencent.mm.sdk.g.b.d.a
{
  public static boolean xDB;
  public static boolean xDC;
  private static b<Runnable> xDF;
  public static final com.tencent.mm.sdk.g.a.e xDG;
  public static final com.tencent.mm.sdk.g.a.c xDH;
  private static f xDJ;
  public static int xDN;
  private static com.tencent.mm.sdk.g.c.b xDO;
  private static com.tencent.mm.sdk.g.c.a xDP;
  private ak xDD;
  private Map<Object, List<com.tencent.mm.sdk.g.d.a>> xDE;
  public com.tencent.mm.sdk.g.b.a xDI;
  private long xDK;
  final AtomicBoolean xDL;
  final ReentrantLock xDM;

  static
  {
    AppMethodBeat.i(52586);
    if (!d.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      xDB = false;
      xDC = false;
      xDF = new b();
      xDG = new d();
      xDH = new c(xDG);
      xDN = 7;
      AppMethodBeat.o(52586);
      return;
    }
  }

  private d()
  {
    AppMethodBeat.i(52566);
    this.xDD = new ak(Looper.getMainLooper());
    this.xDE = new HashMap();
    this.xDL = new AtomicBoolean(false);
    this.xDM = new ReentrantLock();
    this.xDI = new com.tencent.mm.sdk.g.b.e(this, this);
    d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(52536);
        a.setTag("MAIN_LOOP_TAG");
        AppMethodBeat.o(52536);
      }
    });
    AppMethodBeat.o(52566);
  }

  public static Thread a(Runnable paramRunnable, String paramString, int paramInt)
  {
    AppMethodBeat.i(52579);
    paramRunnable = dqc().newThread(paramRunnable, paramString, paramInt);
    AppMethodBeat.o(52579);
    return paramRunnable;
  }

  private static Map<String, Integer> a(Map<String, Integer> paramMap, List<e> paramList)
  {
    AppMethodBeat.i(52565);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      e locale = (e)paramList.next();
      if (paramMap.containsKey(locale.name))
      {
        int i = ((Integer)paramMap.get(locale.name)).intValue();
        paramMap.put(locale.name, Integer.valueOf(i + 1));
      }
      else
      {
        paramMap.put(locale.name, Integer.valueOf(1));
      }
    }
    AppMethodBeat.o(52565);
    return paramMap;
  }

  public static void a(f paramf)
  {
    xDJ = paramf;
  }

  private void a(Object paramObject, com.tencent.mm.sdk.g.d.a parama)
  {
    AppMethodBeat.i(52570);
    synchronized (this.xDE)
    {
      Object localObject1 = (List)this.xDE.get(paramObject);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject1 = this.xDE;
        localObject2 = new java/util/LinkedList;
        ((LinkedList)localObject2).<init>();
        ((Map)localObject1).put(paramObject, localObject2);
      }
      ((List)localObject2).add(parama);
      if (xDJ != null)
        xDJ.a(parama.dqt());
      AppMethodBeat.o(52570);
      return;
    }
  }

  private void a(Runnable paramRunnable, String paramString, com.tencent.mm.sdk.g.d.a parama)
  {
    AppMethodBeat.i(52545);
    if (c(paramRunnable, paramString))
      this.xDI.execute(parama);
    AppMethodBeat.o(52545);
  }

  private void a(final Runnable paramRunnable, final String paramString1, final String paramString2, long paramLong)
  {
    AppMethodBeat.i(52548);
    paramString1 = new com.tencent.mm.sdk.g.d.a(paramRunnable, paramString1, paramString2, paramLong, new a(paramString2, null), xDJ, b.xDW);
    a(paramRunnable, paramString1);
    b.xDW.postAtTime(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(52535);
        if (!paramString1.bYT)
        {
          ab.w("MicroMsg.ThreadPool", "may be was removed before! future:%s", new Object[] { paramString1 });
          AppMethodBeat.o(52535);
        }
        while (true)
        {
          return;
          d.a(d.this, paramRunnable, paramString2, paramString1);
          AppMethodBeat.o(52535);
        }
      }
    }
    , paramString1, SystemClock.uptimeMillis() + Math.max(0L, paramLong));
    AppMethodBeat.o(52548);
  }

  private void a(Runnable paramRunnable, String paramString1, String paramString2, com.tencent.mm.sdk.g.a.d paramd)
  {
    AppMethodBeat.i(52544);
    paramString1 = new com.tencent.mm.sdk.g.d.a(paramRunnable, paramString1, paramString2, 0L, new a(paramString2, paramd), xDJ, b.xDW);
    a(paramRunnable, paramString1);
    a(paramRunnable, paramString2, paramString1);
    AppMethodBeat.o(52544);
  }

  private List<com.tencent.mm.sdk.g.d.a> anL(String paramString)
  {
    AppMethodBeat.i(52569);
    LinkedList localLinkedList = new LinkedList();
    while (true)
    {
      Iterator localIterator1;
      synchronized (this.xDE)
      {
        localIterator1 = this.xDE.values().iterator();
        if (!localIterator1.hasNext())
          break;
        Iterator localIterator2 = ((List)localIterator1.next()).iterator();
        i = 1;
        if (!localIterator2.hasNext())
          break label142;
        com.tencent.mm.sdk.g.d.a locala = (com.tencent.mm.sdk.g.d.a)localIterator2.next();
        if ((locala.xDU == paramString) && (locala.dqs()))
        {
          localLinkedList.add(locala);
          localIterator2.remove();
        }
      }
      int i = 0;
      continue;
      label142: if (i != 0)
        localIterator1.remove();
    }
    AppMethodBeat.o(52569);
    return localLinkedList;
  }

  @Deprecated
  public static HandlerThread anM(String paramString)
  {
    AppMethodBeat.i(52581);
    dqd();
    paramString = com.tencent.mm.sdk.g.c.a.em(paramString, 0);
    AppMethodBeat.o(52581);
    return paramString;
  }

  private static boolean c(Runnable paramRunnable, String paramString)
  {
    AppMethodBeat.i(52549);
    boolean bool;
    if (TextUtils.isEmpty(paramString))
    {
      bool = true;
      AppMethodBeat.o(52549);
    }
    while (true)
    {
      return bool;
      bool = xDF.h(paramRunnable, paramString);
      AppMethodBeat.o(52549);
    }
  }

  private List<com.tencent.mm.sdk.g.d.a> cG(Object paramObject)
  {
    AppMethodBeat.i(52568);
    LinkedList localLinkedList = new LinkedList();
    synchronized (this.xDE)
    {
      paramObject = (List)this.xDE.remove(paramObject);
      if (paramObject != null)
      {
        paramObject = paramObject.iterator();
        while (paramObject.hasNext())
        {
          com.tencent.mm.sdk.g.d.a locala = (com.tencent.mm.sdk.g.d.a)paramObject.next();
          if (locala.dqs())
            localLinkedList.add(locala);
        }
      }
    }
    AppMethodBeat.o(52568);
    return localLinkedList;
  }

  private boolean cH(Object paramObject)
  {
    AppMethodBeat.i(52572);
    synchronized (this.xDE)
    {
      boolean bool = this.xDE.containsKey(paramObject);
      AppMethodBeat.o(52572);
      return bool;
    }
  }

  private static String d(Runnable paramRunnable, String paramString)
  {
    AppMethodBeat.i(52550);
    String str;
    if ((paramRunnable instanceof com.tencent.mm.sdk.g.d.b))
      str = ((com.tencent.mm.sdk.g.d.b)paramRunnable).getKey();
    while (true)
    {
      AppMethodBeat.o(52550);
      return str;
      str = paramString;
      if (TextUtils.isEmpty(paramString))
        str = paramRunnable.getClass().getName();
    }
  }

  private static com.tencent.mm.sdk.g.c.b dqc()
  {
    AppMethodBeat.i(52577);
    if (xDO == null);
    try
    {
      if (xDO == null)
      {
        localb = new com/tencent/mm/sdk/g/c/b;
        localb.<init>();
        xDO = localb;
      }
      com.tencent.mm.sdk.g.c.b localb = xDO;
      AppMethodBeat.o(52577);
      return localb;
    }
    finally
    {
      AppMethodBeat.o(52577);
    }
  }

  private static com.tencent.mm.sdk.g.c.a dqd()
  {
    AppMethodBeat.i(52580);
    if (xDP == null);
    try
    {
      if (xDP == null)
      {
        locala = new com/tencent/mm/sdk/g/c/a;
        locala.<init>();
        xDP = locala;
      }
      com.tencent.mm.sdk.g.c.a locala = xDP;
      AppMethodBeat.o(52580);
      return locala;
    }
    finally
    {
      AppMethodBeat.o(52580);
    }
  }

  @Deprecated
  public static HandlerThread ek(String paramString, int paramInt)
  {
    AppMethodBeat.i(52582);
    dqd();
    paramString = com.tencent.mm.sdk.g.c.a.em(paramString, paramInt);
    AppMethodBeat.o(52582);
    return paramString;
  }

  @Deprecated
  public static void f(Runnable paramRunnable, String paramString)
  {
    AppMethodBeat.i(52575);
    xDG.e(paramRunnable, paramString);
    AppMethodBeat.o(52575);
  }

  @Deprecated
  public static void g(Runnable paramRunnable, String paramString)
  {
    AppMethodBeat.i(52576);
    xDG.e(paramRunnable, paramString);
    AppMethodBeat.o(52576);
  }

  private com.tencent.mm.sdk.g.d.a h(Object paramObject, int paramInt)
  {
    AppMethodBeat.i(52567);
    while (true)
    {
      synchronized (this.xDE)
      {
        List localList = (List)this.xDE.get(paramObject);
        if ((localList == null) || (localList.isEmpty()))
        {
          this.xDE.remove(paramObject);
          AppMethodBeat.o(52567);
          paramObject = null;
          return paramObject;
        }
        ListIterator localListIterator = localList.listIterator();
        if (localListIterator.hasNext())
        {
          locala = (com.tencent.mm.sdk.g.d.a)localListIterator.next();
          if (locala.token != paramInt)
            continue;
          localListIterator.remove();
          if (localList.isEmpty())
            this.xDE.remove(paramObject);
          AppMethodBeat.o(52567);
          paramObject = locala;
        }
      }
      com.tencent.mm.sdk.g.d.a locala = null;
    }
  }

  public static Thread h(Runnable paramRunnable, String paramString)
  {
    AppMethodBeat.i(52578);
    paramRunnable = dqc().newThread(paramRunnable, paramString, 5);
    AppMethodBeat.o(52578);
    return paramRunnable;
  }

  private com.tencent.mm.sdk.g.d.a i(Object paramObject, int paramInt)
  {
    AppMethodBeat.i(52571);
    if (paramObject == null)
    {
      AppMethodBeat.o(52571);
      paramObject = null;
      return paramObject;
    }
    while (true)
    {
      synchronized (this.xDE)
      {
        paramObject = (List)this.xDE.get(paramObject);
        if ((paramObject == null) || (paramObject.isEmpty()))
        {
          AppMethodBeat.o(52571);
          paramObject = null;
          break;
        }
        if (paramInt < 0)
        {
          paramObject = (com.tencent.mm.sdk.g.d.a)paramObject.get(0);
          AppMethodBeat.o(52571);
          break;
        }
        Iterator localIterator = paramObject.iterator();
        if (localIterator.hasNext())
        {
          paramObject = (com.tencent.mm.sdk.g.d.a)localIterator.next();
          if (paramInt == paramObject.token)
            continue;
        }
      }
      paramObject = null;
    }
  }

  private void o(List<e> paramList1, List<e> paramList2)
  {
    AppMethodBeat.i(52564);
    while (true)
    {
      e locale;
      synchronized (this.xDE)
      {
        Iterator localIterator1 = this.xDE.values().iterator();
        if (!localIterator1.hasNext())
          break;
        Iterator localIterator2 = ((List)localIterator1.next()).iterator();
        if (!localIterator2.hasNext())
          continue;
        com.tencent.mm.sdk.g.d.a locala = (com.tencent.mm.sdk.g.d.a)localIterator2.next();
        locale = new com/tencent/mm/sdk/g/e;
        locale.<init>(locala.eOn);
        locale.xDY = locala.cmn;
        if (locala.isRunning())
        {
          locale.xDX = e.a.xEa;
          paramList2.add(locale);
        }
      }
      locale.xDX = e.a.xDZ;
      paramList1.add(locale);
    }
    AppMethodBeat.o(52564);
  }

  @Deprecated
  public static void post(Runnable paramRunnable, String paramString)
  {
    AppMethodBeat.i(52574);
    xDG.e(paramRunnable, paramString);
    AppMethodBeat.o(52574);
  }

  public final void Me(int paramInt)
  {
    AppMethodBeat.i(52560);
    this.xDM.lock();
    try
    {
      if (this.xDL.compareAndSet(false, true))
      {
        this.xDK = System.currentTimeMillis();
        if (xDJ != null)
        {
          LinkedList localLinkedList1 = new java/util/LinkedList;
          localLinkedList1.<init>();
          LinkedList localLinkedList2 = new java/util/LinkedList;
          localLinkedList2.<init>();
          o(localLinkedList1, localLinkedList2);
          xDJ.a(paramInt, localLinkedList1, localLinkedList2);
        }
      }
      return;
    }
    finally
    {
      this.xDM.unlock();
      AppMethodBeat.o(52560);
    }
  }

  public final void a(Runnable paramRunnable, String paramString, com.tencent.mm.sdk.g.a.d paramd)
  {
    AppMethodBeat.i(52543);
    if ((!$assertionsDisabled) && (paramRunnable == null))
    {
      paramRunnable = new AssertionError();
      AppMethodBeat.o(52543);
      throw paramRunnable;
    }
    a(paramRunnable, d(paramRunnable, null), paramString, paramd);
    AppMethodBeat.o(52543);
  }

  public final void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
  {
    AppMethodBeat.i(52559);
    Object localObject;
    if ((paramRunnable instanceof com.tencent.mm.sdk.g.d.a))
    {
      com.tencent.mm.sdk.g.d.a locala = (com.tencent.mm.sdk.g.d.a)paramRunnable;
      h(locala.xzE, locala.token);
      a.setTag("");
      localObject = locala.xEP;
      paramThrowable = (Throwable)localObject;
      if (xDJ != null)
      {
        xDJ.c(locala.dqt());
        paramThrowable = (Throwable)localObject;
      }
    }
    if (paramThrowable != null)
    {
      localObject = paramRunnable;
      if ((paramRunnable instanceof com.tencent.mm.sdk.g.d.a))
        localObject = ((com.tencent.mm.sdk.g.d.a)paramRunnable).xzE;
      if (xDJ != null)
        xDJ.a(localObject, paramThrowable);
    }
    AppMethodBeat.o(52559);
  }

  public final void am(Runnable paramRunnable)
  {
    AppMethodBeat.i(52551);
    com.tencent.mm.sdk.g.d.a locala = i(paramRunnable, -1);
    while (true)
    {
      if (locala != null);
      try
      {
        locala.get(5000L, TimeUnit.MILLISECONDS);
        label28: locala = i(paramRunnable, locala.token);
        continue;
        AppMethodBeat.o(52551);
        return;
      }
      catch (CancellationException localCancellationException)
      {
        break label28;
      }
    }
  }

  public final void an(Runnable paramRunnable)
  {
    AppMethodBeat.i(52552);
    com.tencent.mm.sdk.g.d.a locala = i(paramRunnable, -1);
    while (true)
    {
      if (locala != null);
      try
      {
        locala.get();
        label22: locala = i(paramRunnable, locala.token);
        continue;
        AppMethodBeat.o(52552);
        return;
      }
      catch (CancellationException localCancellationException)
      {
        break label22;
      }
    }
  }

  public final boolean ao(Runnable paramRunnable)
  {
    AppMethodBeat.i(52555);
    boolean bool;
    if (paramRunnable == null)
    {
      bool = false;
      AppMethodBeat.o(52555);
    }
    while (true)
    {
      return bool;
      bool = cH(paramRunnable);
      AppMethodBeat.o(52555);
    }
  }

  public final void ap(Runnable paramRunnable)
  {
    AppMethodBeat.i(52558);
    if ((paramRunnable instanceof com.tencent.mm.sdk.g.d.a))
    {
      paramRunnable = (com.tencent.mm.sdk.g.d.a)paramRunnable;
      a.setTag(paramRunnable.xDU);
      if (xDJ != null)
        xDJ.b(paramRunnable.dqt());
    }
    AppMethodBeat.o(52558);
  }

  public final void b(Runnable paramRunnable, String paramString)
  {
    AppMethodBeat.i(52542);
    if ((!$assertionsDisabled) && (paramRunnable == null))
    {
      paramRunnable = new AssertionError();
      AppMethodBeat.o(52542);
      throw paramRunnable;
    }
    a(paramRunnable, d(paramRunnable, null), paramString, null);
    AppMethodBeat.o(52542);
  }

  public final void b(Runnable paramRunnable, String paramString, long paramLong)
  {
    AppMethodBeat.i(52547);
    if ((!$assertionsDisabled) && (paramRunnable == null))
    {
      paramRunnable = new AssertionError();
      AppMethodBeat.o(52547);
      throw paramRunnable;
    }
    a(paramRunnable, d(paramRunnable, null), paramString, paramLong);
    AppMethodBeat.o(52547);
  }

  public final com.tencent.mm.sdk.g.b.a cin()
  {
    return this.xDI;
  }

  public final void d(Runnable paramRunnable)
  {
    AppMethodBeat.i(52556);
    this.xDD.post(paramRunnable);
    AppMethodBeat.o(52556);
  }

  public final void d(Map<String, Integer> paramMap1, Map<String, Integer> paramMap2)
  {
    AppMethodBeat.i(52563);
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    o(localLinkedList1, localLinkedList2);
    a(paramMap1, localLinkedList2);
    a(paramMap2, localLinkedList1);
    AppMethodBeat.o(52563);
  }

  public final void dqa()
  {
    AppMethodBeat.i(52561);
    this.xDM.lock();
    try
    {
      if ((this.xDL.compareAndSet(true, false)) && (xDJ != null))
        xDJ.jt(System.currentTimeMillis() - this.xDK);
      return;
    }
    finally
    {
      this.xDM.unlock();
      AppMethodBeat.o(52561);
    }
  }

  public final String dqb()
  {
    AppMethodBeat.i(52562);
    StringBuilder localStringBuilder = new StringBuilder(String.format("dumpInfo[%s]:", new Object[] { null }));
    HashMap localHashMap = new HashMap();
    while (true)
    {
      com.tencent.mm.sdk.g.d.a locala;
      synchronized (this.xDE)
      {
        Iterator localIterator1 = this.xDE.values().iterator();
        continue;
        if (!localIterator1.hasNext())
          break;
        Iterator localIterator2 = ((List)localIterator1.next()).iterator();
        if (!localIterator2.hasNext())
          continue;
        locala = (com.tencent.mm.sdk.g.d.a)localIterator2.next();
        if (!locala.isRunning())
          continue;
        if (localHashMap.containsKey(locala.eOn))
        {
          int i = ((Integer)localHashMap.get(locala.eOn)).intValue();
          localHashMap.put(locala.eOn, Integer.valueOf(i + 1));
        }
      }
      localHashMap.put(locala.eOn, Integer.valueOf(1));
    }
    localStringBuilder.append(localHashMap.toString());
    ??? = localStringBuilder.toString();
    AppMethodBeat.o(52562);
    return ???;
  }

  @Deprecated
  public final void e(Runnable paramRunnable, String paramString)
  {
    AppMethodBeat.i(52573);
    if ((!$assertionsDisabled) && (paramRunnable == null))
    {
      paramRunnable = new AssertionError();
      AppMethodBeat.o(52573);
      throw paramRunnable;
    }
    a(paramRunnable, d(paramRunnable, paramString), null, null);
    AppMethodBeat.o(52573);
  }

  public final void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(52541);
    if ((!$assertionsDisabled) && (paramRunnable == null))
    {
      paramRunnable = new AssertionError();
      AppMethodBeat.o(52541);
      throw paramRunnable;
    }
    a(paramRunnable, d(paramRunnable, null), null, null);
    AppMethodBeat.o(52541);
  }

  public final void p(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(52546);
    if ((!$assertionsDisabled) && (paramRunnable == null))
    {
      paramRunnable = new AssertionError();
      AppMethodBeat.o(52546);
      throw paramRunnable;
    }
    a(paramRunnable, d(paramRunnable, null), null, paramLong);
    AppMethodBeat.o(52546);
  }

  public final void q(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(52557);
    this.xDD.postDelayed(paramRunnable, paramLong);
    AppMethodBeat.o(52557);
  }

  public final void remove(String paramString)
  {
    AppMethodBeat.i(52554);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(52554);
    while (true)
    {
      return;
      List localList = anL(paramString);
      xDF.anK(paramString);
      for (int i = 0; i < localList.size(); i++)
      {
        paramString = (com.tencent.mm.sdk.g.d.a)localList.get(i);
        b.xDW.removeCallbacksAndMessages(paramString);
        this.xDI.remove(paramString);
        if (xDJ != null)
          xDJ.d(paramString.dqt());
      }
      AppMethodBeat.o(52554);
    }
  }

  public final boolean remove(Runnable paramRunnable)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(52553);
    if (paramRunnable == null)
      AppMethodBeat.o(52553);
    while (true)
    {
      return bool;
      List localList = cG(paramRunnable);
      xDF.remove(paramRunnable);
      if (!localList.isEmpty())
        bool = true;
      while (i < localList.size())
      {
        paramRunnable = (com.tencent.mm.sdk.g.d.a)localList.get(i);
        b.xDW.removeCallbacksAndMessages(paramRunnable);
        this.xDI.remove(paramRunnable);
        if (xDJ != null)
          xDJ.d(paramRunnable.dqt());
        i++;
        continue;
        bool = false;
      }
      AppMethodBeat.o(52553);
    }
  }

  final class a
    implements com.tencent.mm.sdk.g.a.d
  {
    com.tencent.mm.sdk.g.a.d xDT;
    String xDU;

    a(String paramd, com.tencent.mm.sdk.g.a.d arg3)
    {
      this.xDU = paramd;
      Object localObject;
      this.xDT = localObject;
    }

    public final void a(Runnable paramRunnable, int paramInt)
    {
      AppMethodBeat.i(52537);
      if (this.xDT != null)
        this.xDT.a(paramRunnable, paramInt);
      AppMethodBeat.o(52537);
    }

    public final void b(Runnable paramRunnable, int paramInt)
    {
      AppMethodBeat.i(52538);
      while (true)
      {
        try
        {
          boolean bool = TextUtils.isEmpty(this.xDU);
          if (bool)
            return;
          Object localObject1 = d.i(paramRunnable, this.xDU);
          localObject1 = d.a(d.this, localObject1, paramInt);
          if (localObject1 != null)
            d.this.xDI.execute((Runnable)localObject1);
          if (this.xDT != null)
          {
            this.xDT.b(paramRunnable, paramInt);
            AppMethodBeat.o(52538);
            continue;
          }
        }
        finally
        {
          if (this.xDT != null)
            this.xDT.b(paramRunnable, paramInt);
          AppMethodBeat.o(52538);
        }
        AppMethodBeat.o(52538);
      }
    }
  }

  static final class b
  {
    private static HandlerThread xDV;
    private static Handler xDW;

    static
    {
      AppMethodBeat.i(52540);
      xDV = com.tencent.mm.sdk.g.c.c.anN("OrderWorker");
      if (!xDV.isAlive())
        xDV.start();
      xDW = new Handler(xDV.getLooper())
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          AppMethodBeat.i(52539);
          super.handleMessage(paramAnonymousMessage);
          if ((paramAnonymousMessage.what == d.xDN) && (d.dqe() != null))
            d.dqe().e((e)paramAnonymousMessage.obj);
          AppMethodBeat.o(52539);
        }
      };
      AppMethodBeat.o(52540);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.g.d
 * JD-Core Version:    0.6.2
 */