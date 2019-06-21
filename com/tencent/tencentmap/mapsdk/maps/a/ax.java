package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.a;
import com.tencent.tencentmap.mapsdk.a.b;
import com.tencent.tencentmap.mapsdk.a.c;
import com.tencent.tencentmap.mapsdk.a.d;
import com.tencent.tencentmap.mapsdk.a.e;
import com.tencent.tencentmap.mapsdk.a.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Set;

public final class ax extends Observable
  implements s, w, x
{
  private static ax a = null;
  private as b;
  private au c;
  private au d;
  private boolean e;
  private boolean f;
  private Context g;
  private be h;
  private boolean i;
  private int j;
  private List<ar> k;
  private Object l;
  private g m;

  private ax(Context paramContext, be parambe, ay paramay)
  {
    AppMethodBeat.i(98531);
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = true;
    this.f = false;
    this.j = 0;
    this.k = null;
    this.l = new Object();
    this.m = null;
    if (paramContext == null)
    {
      ag.c(" the context is null! init UserActionRecord failed!", new Object[0]);
      this.g = null;
      AppMethodBeat.o(98531);
      return;
    }
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null);
    for (this.g = localContext; ; this.g = paramContext)
    {
      if (c.m() == null)
        c.a(this.g);
      if (this.k == null)
        this.k = Collections.synchronizedList(new ArrayList(5));
      this.h = parambe;
      if (parambe != null)
        parambe.a(paramay);
      paramay = t.a(this.g);
      paramay.a(this);
      paramay.a(this);
      paramay.a(this);
      paramay.a(0, parambe);
      paramay.a(1, parambe);
      this.b = new as();
      this.c = new ao(paramContext);
      this.d = new aw(paramContext);
      this.e = true;
      new d().a(this.g);
      this.m = new g();
      AppMethodBeat.o(98531);
      break;
    }
  }

  public static ax a(Context paramContext, be parambe, ay paramay)
  {
    try
    {
      AppMethodBeat.i(98526);
      if (a == null)
      {
        ag.e(" create ua instance ", new Object[0]);
        ax localax = new com/tencent/tencentmap/mapsdk/maps/a/ax;
        localax.<init>(paramContext, parambe, paramay);
        a = localax;
      }
      ag.e(" return ua instance ", new Object[0]);
      paramContext = a;
      AppMethodBeat.o(98526);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public static be a(Context paramContext, boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(98527);
      paramContext = bf.a(paramContext, paramBoolean);
      AppMethodBeat.o(98527);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
    }
    throw paramContext;
  }

  private void a(int paramInt)
  {
    try
    {
      this.j = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static boolean a(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(98528);
    ag.e(" onUA: %s,%b,%d,%d,%b,%b", new Object[] { paramString, Boolean.valueOf(paramBoolean1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean3) });
    ax localax = d();
    if ((localax != null) && (!localax.m()))
    {
      localax.k.add(new ar(paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean2));
      paramBoolean1 = true;
      AppMethodBeat.o(98528);
    }
    while (true)
    {
      return paramBoolean1;
      if (!i())
      {
        paramBoolean1 = false;
        AppMethodBeat.o(98528);
      }
      else if (localax.b.a(paramString))
      {
        ag.c("onUserAction return false, because eventName:[%s] is not allowed in server strategy!", new Object[] { paramString });
        paramBoolean1 = false;
        AppMethodBeat.o(98528);
      }
      else
      {
        au localau;
        if ((!paramBoolean1) || ((paramBoolean1) && (localax.b.b(paramString))))
          if (paramBoolean2)
            localau = localax.k();
        while (true)
          if (localau != null)
          {
            paramString = e.a(localax.g, paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean3);
            if (paramString == null)
            {
              ag.c("createdRecordBean bean is null, return false!", new Object[0]);
              paramBoolean1 = false;
              AppMethodBeat.o(98528);
              break;
              localau = localax.j();
              continue;
            }
            paramBoolean1 = localau.a(paramString);
            AppMethodBeat.o(98528);
            break;
            ag.c("onUserAction return false, because eventName:[%s] is sampled by svr rate!", new Object[] { paramString });
            paramBoolean1 = false;
            AppMethodBeat.o(98528);
            break;
          }
        paramBoolean1 = false;
        AppMethodBeat.o(98528);
      }
    }
  }

  public static boolean a(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(98529);
    ax localax = d();
    if (localax == null)
    {
      ag.c(" ua module not ready!", new Object[0]);
      AppMethodBeat.o(98529);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (!i())
      {
        AppMethodBeat.o(98529);
        paramBoolean = bool;
      }
      else
      {
        paramBoolean = localax.b(paramBoolean);
        AppMethodBeat.o(98529);
      }
    }
  }

  private void c(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(98534);
      if (paramBoolean != e())
      {
        au localau = j();
        if (localau != null)
          localau.a(paramBoolean);
        localau = k();
        if (localau != null)
          localau.a(paramBoolean);
        this.i = paramBoolean;
      }
      AppMethodBeat.o(98534);
      return;
    }
    finally
    {
    }
  }

  public static ax d()
  {
    try
    {
      ax localax = a;
      return localax;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static boolean i()
  {
    boolean bool1 = false;
    AppMethodBeat.i(98530);
    ax localax = d();
    if (localax == null)
    {
      ag.d("isModuleAble:not init ua", new Object[0]);
      AppMethodBeat.o(98530);
    }
    while (true)
    {
      return bool1;
      boolean bool2 = localax.e();
      bool1 = bool2;
      if (bool2)
      {
        bool1 = bool2;
        if (localax.l())
          bool1 = localax.m();
      }
      AppMethodBeat.o(98530);
    }
  }

  private au j()
  {
    try
    {
      au localau = this.c;
      return localau;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private au k()
  {
    try
    {
      au localau = this.d;
      return localau;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private boolean l()
  {
    try
    {
      boolean bool = this.e;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private boolean m()
  {
    try
    {
      boolean bool = this.f;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void n()
  {
    try
    {
      this.f = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void o()
  {
    try
    {
      AppMethodBeat.i(98536);
      if ((this.k == null) || (this.k.size() <= 0))
        break label101;
      Iterator localIterator = this.k.iterator();
      while (localIterator.hasNext())
      {
        ar localar = (ar)localIterator.next();
        a(localar.a, localar.b, localar.c, localar.d, localar.e, localar.f, false);
      }
    }
    finally
    {
    }
    this.k.clear();
    label101: AppMethodBeat.o(98536);
  }

  private void p()
  {
    AppMethodBeat.i(98537);
    try
    {
      if (!e())
      {
        boolean bool = this.b.f();
        if (!bool)
          AppMethodBeat.o(98537);
      }
      while (true)
      {
        return;
        Object localObject = t.a(this.g);
        if (localObject != null)
        {
          localObject = ((t)localObject).e().b(1);
          if (localObject != null)
          {
            localObject = ((v.a)localObject).b();
            if ((localObject != null) && (!"".equals(((String)localObject).trim())))
            {
              localObject = new com/tencent/tencentmap/mapsdk/maps/a/at;
              ((at)localObject).<init>(this.g);
              ((at)localObject).b();
            }
          }
        }
        AppMethodBeat.o(98537);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ag.c(" startHeart failed! " + localException.getMessage(), new Object[0]);
        AppMethodBeat.o(98537);
      }
    }
  }

  private void q()
  {
    AppMethodBeat.i(98538);
    if (this.b.i())
      if (!"".equals(a.b(this.g, "LAUEVE_DENGTA", "")))
      {
        ag.a("AppLaunchedEvent has been uploaded!", new Object[0]);
        AppMethodBeat.o(98538);
        return;
      }
    for (int n = 1; ; n = 0)
    {
      if (e.a(this.g) == null)
      {
        ag.c(" DeviceInfo == null?,return", new Object[0]);
        AppMethodBeat.o(98538);
        break;
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("A33", e.g(this.g));
      localHashMap.put("A63", "Y");
      if (a.b(this.g))
      {
        localHashMap.put("A21", "Y");
        label147: if (!t.a(this.g).g())
          break label335;
        localHashMap.put("A45", "Y");
        label173: if (!a.g(this.g))
          break label351;
        localHashMap.put("A66", "F");
        label196: localHashMap.put("A68", a.h(this.g));
        if (!a.b)
          break label367;
      }
      label335: label351: label367: for (String str = "Y"; ; str = "N")
      {
        localHashMap.put("A85", str);
        localHashMap.put("A9", e.d());
        localHashMap.put("A14", e.e());
        boolean bool = a("rqd_applaunched", true, 0L, 0L, localHashMap, true, false);
        if ((n != 0) && (bool))
          a.a(this.g, "LAUEVE_DENGTA", e.g());
        AppMethodBeat.o(98538);
        break;
        localHashMap.put("A21", "N");
        break label147;
        localHashMap.put("A45", "N");
        break label173;
        localHashMap.put("A66", "B");
        break label196;
      }
    }
  }

  public final void a()
  {
    AppMethodBeat.i(98540);
    a(h() + 1);
    AppMethodBeat.o(98540);
  }

  public final void a(v paramv)
  {
    AppMethodBeat.i(98539);
    if (paramv != null)
    {
      paramv = paramv.b(1);
      if (paramv != null)
      {
        boolean bool = paramv.a();
        if (e() != bool)
        {
          ag.f("UAR onCommonStrategyChange setUsable:%b ", new Object[] { Boolean.valueOf(bool) });
          c(bool);
        }
      }
    }
    AppMethodBeat.o(98539);
  }

  public final void a(Map<String, String> paramMap)
  {
    AppMethodBeat.i(98541);
    if ((paramMap != null) && (paramMap.size() > 0) && (this.b != null))
      this.b.a(paramMap);
    AppMethodBeat.o(98541);
  }

  public final void b()
  {
    AppMethodBeat.i(98535);
    n();
    try
    {
      Object localObject1 = t.a(this.g).e();
      if (localObject1 == null);
      while (true)
      {
        o();
        if (h() < 2)
        {
          localObject1 = bf.a(this.g);
          if ((((bf)localObject1).a()) && (((bf)localObject1).b()))
          {
            p();
            q();
            if (this.b.j())
            {
              this.m.setChanged();
              this.m.notifyObservers(this.g);
            }
          }
        }
        AppMethodBeat.o(98535);
        return;
        localObject1 = ((v)localObject1).b(1);
        Object localObject2;
        if ((localObject1 != null) && (this.b != null))
        {
          localObject2 = ((v.a)localObject1).d();
          if ((localObject2 != null) && (((Set)localObject2).size() > 0))
            this.b.a((Set)localObject2);
          localObject2 = ((v.a)localObject1).f();
          if ((localObject2 != null) && (((Set)localObject2).size() > 0))
            this.b.b((Set)localObject2);
        }
        if ((!e()) || (localObject1 == null))
          break label280;
        if (!e())
          break;
        n = e.j(this.g);
        if (n <= 0)
          break label275;
        n = 1;
        if (n != 0)
        {
          ag.e(" asyn up module %d", new Object[] { Integer.valueOf(1) });
          localObject1 = b.a();
          localObject2 = new com/tencent/tencentmap/mapsdk/maps/a/ax$1;
          ((1)localObject2).<init>(this);
          ((b)localObject1).a((Runnable)localObject2);
        }
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ag.a(localThrowable);
        ag.d(" common query end error %s", new Object[] { localThrowable.toString() });
        continue;
        int n = -1;
        continue;
        label275: n = 0;
        continue;
        label280: ag.b("event module is disable", new Object[0]);
      }
    }
  }

  public final boolean b(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(98532);
    synchronized (this.l)
    {
      int n;
      if (e())
        n = e.j(this.g);
      while (true)
        if (n > 0)
          try
          {
            if (this.h != null)
            {
              ap localap = new com/tencent/tencentmap/mapsdk/maps/a/ap;
              localap.<init>(this.g);
              localap.a(paramBoolean);
              this.h.a(localap);
            }
            AppMethodBeat.o(98532);
            paramBoolean = bool;
            return paramBoolean;
            n = -1;
          }
          catch (Throwable localThrowable)
          {
            ag.c(" up common error: %s", new Object[] { localThrowable.toString() });
            ag.a(localThrowable);
          }
      AppMethodBeat.o(98532);
      paramBoolean = false;
    }
  }

  public final void c()
  {
    AppMethodBeat.i(98533);
    Context localContext = this.g;
    ag.a(" RecordDAO.deleteRecords() start", new Object[0]);
    ag.e(" ua first clean :%d", new Object[] { Integer.valueOf(p.a(localContext, new int[] { 1 })) });
    ag.e(" ua remove strategy :%d", new Object[] { Integer.valueOf(e.i(this.g)) });
    AppMethodBeat.o(98533);
  }

  public final boolean e()
  {
    try
    {
      boolean bool = this.i;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final be f()
  {
    return this.h;
  }

  public final as g()
  {
    return this.b;
  }

  public final int h()
  {
    try
    {
      int n = this.j;
      return n;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ax
 * JD-Core Version:    0.6.2
 */