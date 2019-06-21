package com.tencent.mm.sdk;

import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.a.c;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.am.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class b extends am
{
  public String xxq;
  HashMap<a, LinkedList<Runnable>> xxr;

  public b(Handler.Callback paramCallback, am.a parama)
  {
    super(paramCallback, parama);
    AppMethodBeat.i(51945);
    this.xxq = null;
    this.xxr = new HashMap();
    AppMethodBeat.o(51945);
  }

  public b(Looper paramLooper, Handler.Callback paramCallback, am.a parama)
  {
    super(paramLooper, paramCallback, parama);
    AppMethodBeat.i(51946);
    this.xxq = null;
    this.xxr = new HashMap();
    AppMethodBeat.o(51946);
  }

  public b(Looper paramLooper, am.a parama)
  {
    super(paramLooper, parama);
    AppMethodBeat.i(51944);
    this.xxq = null;
    this.xxr = new HashMap();
    AppMethodBeat.o(51944);
  }

  public b(am.a parama)
  {
    super(parama);
    AppMethodBeat.i(51943);
    this.xxq = null;
    this.xxr = new HashMap();
    AppMethodBeat.o(51943);
  }

  public b(String paramString, Handler.Callback paramCallback, am.a parama)
  {
    super(Looper.getMainLooper(), paramCallback, parama);
    AppMethodBeat.i(51942);
    this.xxq = null;
    this.xxr = new HashMap();
    this.xxq = paramString;
    AppMethodBeat.o(51942);
  }

  private List<Runnable> a(Runnable paramRunnable, Object paramObject)
  {
    AppMethodBeat.i(51948);
    LinkedList localLinkedList = new LinkedList();
    synchronized (this.xxr)
    {
      Iterator localIterator = this.xxr.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        a locala = (a)localEntry.getKey();
        if (((paramRunnable == null) || (locala.callback == paramRunnable)) && ((paramObject == null) || (paramObject == locala.xxu)))
        {
          localLinkedList.addAll((Collection)localEntry.getValue());
          localIterator.remove();
        }
      }
    }
    AppMethodBeat.o(51948);
    return localLinkedList;
  }

  private List<Runnable> n(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(51949);
    LinkedList localLinkedList = new LinkedList();
    synchronized (this.xxr)
    {
      Iterator localIterator = this.xxr.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        a locala = (a)localEntry.getKey();
        if ((locala.what == paramInt) && ((paramObject == null) || (paramObject == locala.xxu)))
        {
          localLinkedList.addAll((Collection)localEntry.getValue());
          localIterator.remove();
        }
      }
    }
    AppMethodBeat.o(51949);
    return localLinkedList;
  }

  private boolean o(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(51950);
    synchronized (this.xxr)
    {
      Iterator localIterator = this.xxr.keySet().iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if ((locala.what == paramInt) && (locala.xxu == paramObject))
        {
          bool = true;
          AppMethodBeat.o(51950);
          return bool;
        }
      }
      boolean bool = false;
      AppMethodBeat.o(51950);
    }
  }

  public final void LT(int paramInt)
  {
    AppMethodBeat.i(51954);
    if (dnJ())
    {
      List localList = n(paramInt, null);
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        Runnable localRunnable = (Runnable)localIterator.next();
        d.xDH.al(localRunnable);
      }
      localList.clear();
      AppMethodBeat.o(51954);
    }
    while (true)
    {
      return;
      super.removeMessages(paramInt);
      AppMethodBeat.o(51954);
    }
  }

  public final boolean LU(int paramInt)
  {
    AppMethodBeat.i(51957);
    boolean bool;
    if (dnJ())
    {
      bool = o(paramInt, null);
      AppMethodBeat.o(51957);
    }
    while (true)
    {
      return bool;
      bool = super.hasMessages(paramInt);
      AppMethodBeat.o(51957);
    }
  }

  public final void a(Printer paramPrinter, String paramString)
  {
    AppMethodBeat.i(51960);
    if (dnJ())
    {
      paramPrinter.println(paramString + "use ThreadPool");
      AppMethodBeat.o(51960);
    }
    while (true)
    {
      return;
      super.dump(paramPrinter, paramString);
      AppMethodBeat.o(51960);
    }
  }

  public final void ad(Runnable paramRunnable)
  {
    AppMethodBeat.i(51952);
    if (dnJ())
    {
      paramRunnable = a(paramRunnable, null);
      Iterator localIterator = paramRunnable.iterator();
      while (localIterator.hasNext())
      {
        Runnable localRunnable = (Runnable)localIterator.next();
        d.xDH.al(localRunnable);
      }
      paramRunnable.clear();
      AppMethodBeat.o(51952);
    }
    while (true)
    {
      return;
      super.removeCallbacks(paramRunnable);
      AppMethodBeat.o(51952);
    }
  }

  public final void b(Runnable paramRunnable, Object paramObject)
  {
    AppMethodBeat.i(51953);
    if (dnJ())
    {
      List localList = a(paramRunnable, paramObject);
      paramObject = localList.iterator();
      while (paramObject.hasNext())
      {
        paramRunnable = (Runnable)paramObject.next();
        d.xDH.al(paramRunnable);
      }
      localList.clear();
      AppMethodBeat.o(51953);
    }
    while (true)
    {
      return;
      super.removeCallbacks(paramRunnable, paramObject);
      AppMethodBeat.o(51953);
    }
  }

  public final void cz(Object paramObject)
  {
    AppMethodBeat.i(51956);
    if (dnJ())
    {
      d.xDG.remove(this.xxq);
      List localList = a(null, paramObject);
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        paramObject = (Runnable)localIterator.next();
        d.xDH.al(paramObject);
      }
      localList.clear();
      AppMethodBeat.o(51956);
    }
    while (true)
    {
      return;
      super.removeCallbacksAndMessages(paramObject);
      AppMethodBeat.o(51956);
    }
  }

  public final boolean dnJ()
  {
    AppMethodBeat.i(51951);
    boolean bool;
    if (!TextUtils.isEmpty(this.xxq))
    {
      bool = true;
      AppMethodBeat.o(51951);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(51951);
    }
  }

  public final Looper dnK()
  {
    AppMethodBeat.i(51959);
    Looper localLooper;
    if (dnJ())
    {
      localLooper = null;
      AppMethodBeat.o(51959);
    }
    while (true)
    {
      return localLooper;
      localLooper = super.getLooper();
      AppMethodBeat.o(51959);
    }
  }

  public final void p(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(51955);
    if (dnJ())
    {
      List localList = n(paramInt, paramObject);
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        paramObject = (Runnable)localIterator.next();
        d.xDH.al(paramObject);
      }
      localList.clear();
      AppMethodBeat.o(51955);
    }
    while (true)
    {
      return;
      super.removeMessages(paramInt, paramObject);
      AppMethodBeat.o(51955);
    }
  }

  public final boolean q(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(51958);
    boolean bool;
    if (dnJ())
    {
      bool = o(paramInt, paramObject);
      AppMethodBeat.o(51958);
    }
    while (true)
    {
      return bool;
      bool = super.hasMessages(paramInt, paramObject);
      AppMethodBeat.o(51958);
    }
  }

  public final boolean sendMessageAtTime(final Message paramMessage, long paramLong)
  {
    AppMethodBeat.i(51947);
    Runnable local1;
    if (dnJ())
      local1 = new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(51939);
          b.this.dispatchMessage(paramMessage);
          b.a(b.this, paramMessage, this);
          AppMethodBeat.o(51939);
        }
      };
    while (true)
    {
      synchronized (this.xxr)
      {
        a locala = new com/tencent/mm/sdk/b$a;
        locala.<init>(this, paramMessage.what, paramMessage.obj, paramMessage.getCallback());
        if (!this.xxr.containsKey(locala))
        {
          HashMap localHashMap2 = this.xxr;
          paramMessage = new java/util/LinkedList;
          paramMessage.<init>();
          localHashMap2.put(locala, paramMessage);
          paramMessage.add(local1);
          d.xDH.a(local1, this.xxq, paramLong - SystemClock.uptimeMillis());
          bool = true;
          AppMethodBeat.o(51947);
          return bool;
        }
        paramMessage = (LinkedList)this.xxr.get(locala);
      }
      boolean bool = super.sendMessageAtTime(paramMessage, paramLong);
      AppMethodBeat.o(51947);
    }
  }

  final class a
  {
    Runnable callback;
    int what;
    Object xxu;

    public a(int paramObject, Object paramRunnable, Runnable arg4)
    {
      this.what = paramObject;
      this.xxu = paramRunnable;
      Object localObject;
      this.callback = localObject;
    }

    public final boolean equals(Object paramObject)
    {
      boolean bool1 = false;
      boolean bool2 = bool1;
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        bool2 = bool1;
        if (paramObject.what == this.what)
        {
          bool2 = bool1;
          if (paramObject.callback == this.callback)
          {
            bool2 = bool1;
            if (paramObject.xxu == this.xxu)
              bool2 = true;
          }
        }
      }
      return bool2;
    }

    public final int hashCode()
    {
      int i = 0;
      AppMethodBeat.i(51940);
      if (this.xxu != null);
      for (int j = this.xxu.hashCode(); ; j = 0)
      {
        if (this.callback != null)
          i = this.callback.hashCode();
        int k = this.what;
        AppMethodBeat.o(51940);
        return j + i + k;
      }
    }

    public final String toString()
    {
      AppMethodBeat.i(51941);
      String str = "WrapMessage{token=" + this.xxu + ", what=" + this.what + ", callback=" + this.callback + '}';
      AppMethodBeat.o(51941);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.b
 * JD-Core Version:    0.6.2
 */