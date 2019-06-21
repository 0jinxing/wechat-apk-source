package com.tencent.mm.vending.h;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.f.a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public class g
{
  private static Map<String, d> a;
  private static Map<Looper, d> b;
  private static boolean c;

  static
  {
    AppMethodBeat.i(126136);
    a = new ConcurrentHashMap();
    b = new HashMap();
    c = false;
    a();
    AppMethodBeat.o(126136);
  }

  static void a()
  {
    try
    {
      AppMethodBeat.i(126135);
      if (c)
        AppMethodBeat.o(126135);
      while (true)
      {
        return;
        a.i("Vending.SchedulerProvider", "SchedulerProvider provided.", new Object[0]);
        c = true;
        a("Vending.UI", d.zYp);
        a("Vending.LOGIC", d.zYq);
        a("Vending.HEAVY_WORK", d.zYr);
        AppMethodBeat.o(126135);
      }
    }
    finally
    {
    }
  }

  public static void a(String paramString, d paramd)
  {
    AppMethodBeat.i(126131);
    Assert.assertNotNull("Scheduler type is null", paramString);
    String str = paramString.toUpperCase(Locale.ENGLISH);
    if (a.containsKey(str))
      new IllegalStateException("Fatal error! Duplicate scheduler type " + paramString.toUpperCase(Locale.ENGLISH));
    a.put(str, paramd);
    if ((paramd instanceof h));
    while (true)
    {
      try
      {
        b.put(((h)paramd).b, paramd);
        return;
      }
      finally
      {
        AppMethodBeat.o(126131);
      }
      AppMethodBeat.o(126131);
    }
  }

  public static void asT(String paramString)
  {
    AppMethodBeat.i(126132);
    a.remove(paramString.toUpperCase(Locale.ENGLISH));
    AppMethodBeat.o(126132);
  }

  public static d asU(String paramString)
  {
    AppMethodBeat.i(126133);
    Assert.assertNotNull("Scheduler type is null", paramString);
    d locald = (d)a.get(paramString.toUpperCase(Locale.ENGLISH));
    Assert.assertNotNull("Scheduler type not found: " + paramString.toUpperCase(Locale.ENGLISH), locald);
    AppMethodBeat.o(126133);
    return locald;
  }

  public static d dMq()
  {
    try
    {
      AppMethodBeat.i(126134);
      Looper localLooper = Looper.myLooper();
      Object localObject1;
      if (localLooper == null)
      {
        a.w("Vending.SchedulerProvider", "This is not a handler thread! %s", new Object[] { Thread.currentThread() });
        localObject1 = new com/tencent/mm/vending/h/c;
        ((c)localObject1).<init>();
        AppMethodBeat.o(126134);
      }
      while (true)
      {
        return localObject1;
        d locald = (d)b.get(localLooper);
        localObject1 = locald;
        if (locald == null)
        {
          localObject1 = new com/tencent/mm/vending/h/h;
          ((h)localObject1).<init>(localLooper, localLooper.toString());
          b.put(localLooper, localObject1);
        }
        AppMethodBeat.o(126134);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.h.g
 * JD-Core Version:    0.6.2
 */