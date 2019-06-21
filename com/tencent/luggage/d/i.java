package com.tencent.luggage.d;

import android.os.Handler;
import android.os.Looper;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class i
{
  public ConcurrentHashMap<i.f, Boolean> bPw;
  private Handler mMainHandler;

  public i()
  {
    AppMethodBeat.i(90809);
    this.bPw = new ConcurrentHashMap();
    this.mMainHandler = new Handler(Looper.getMainLooper());
    AppMethodBeat.o(90809);
  }

  private static boolean xl()
  {
    AppMethodBeat.i(90810);
    boolean bool;
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      bool = true;
      AppMethodBeat.o(90810);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90810);
    }
  }

  final boolean D(Class<? extends i.f> paramClass)
  {
    AppMethodBeat.i(90812);
    boolean bool;
    if (!xl())
    {
      d.e("LuggagePageEventBus", "notifyListener on non-UI thread");
      AppMethodBeat.o(90812);
      bool = false;
    }
    while (true)
    {
      return bool;
      Iterator localIterator = this.bPw.keySet().iterator();
      while (true)
        if (localIterator.hasNext())
        {
          i.f localf = (i.f)localIterator.next();
          if (paramClass.isInstance(localf))
          {
            bool = localf.xm();
            if (((Boolean)this.bPw.get(localf)).booleanValue())
              this.bPw.remove(localf);
            if (bool)
            {
              bool = true;
              AppMethodBeat.o(90812);
              break;
            }
          }
        }
      AppMethodBeat.o(90812);
      bool = false;
    }
  }

  public final void a(i.f paramf)
  {
    AppMethodBeat.i(90811);
    this.bPw.put(paramf, Boolean.TRUE);
    AppMethodBeat.o(90811);
  }

  public static abstract class a extends i.f
  {
    public a()
    {
      super();
    }

    public abstract boolean wY();

    public final boolean xm()
    {
      return wY();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.i
 * JD-Core Version:    0.6.2
 */