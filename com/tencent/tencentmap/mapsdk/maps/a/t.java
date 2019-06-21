package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class t
{
  private static t c = null;
  protected v a;
  protected Context b;
  private boolean d;
  private int e;
  private bd f;
  private Runnable g;
  private List<s> h;
  private SparseArray<be> i;
  private List<w> j;
  private SparseArray<x> k;
  private boolean l;
  private Runnable m;

  private t(Context paramContext)
  {
    AppMethodBeat.i(100547);
    this.a = null;
    this.b = null;
    this.d = false;
    this.e = 0;
    this.f = null;
    this.g = null;
    this.h = new ArrayList(5);
    this.i = new SparseArray(5);
    this.j = new ArrayList(5);
    this.k = new SparseArray(2);
    this.l = false;
    this.m = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(100542);
        if ((t.this.b != null) && (t.this.a != null))
          t.this.a.a(t.this.b);
        AppMethodBeat.o(100542);
      }
    };
    this.b = paramContext;
    this.a = v.a();
    b.a().a(this.m);
    this.f = new bd(paramContext);
    this.g = new u(paramContext);
    b.a().a(this.g);
    AppMethodBeat.o(100547);
  }

  public static t a(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(100545);
      if ((c == null) && (paramContext != null))
      {
        t localt = new com/tencent/tencentmap/mapsdk/maps/a/t;
        localt.<init>(paramContext);
        c = localt;
      }
      paramContext = c;
      AppMethodBeat.o(100545);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public static be c()
  {
    try
    {
      AppMethodBeat.i(100546);
      be localbe;
      if (c != null)
      {
        localbe = c.k();
        AppMethodBeat.o(100546);
      }
      while (true)
      {
        return localbe;
        localbe = null;
        AppMethodBeat.o(100546);
      }
    }
    finally
    {
    }
  }

  private be k()
  {
    try
    {
      AppMethodBeat.i(100548);
      be localbe;
      if ((this.i != null) && (this.i.size() > 0))
      {
        localbe = (be)this.i.get(0);
        AppMethodBeat.o(100548);
      }
      while (true)
      {
        return localbe;
        localbe = null;
        AppMethodBeat.o(100548);
      }
    }
    finally
    {
    }
  }

  private w[] l()
  {
    try
    {
      AppMethodBeat.i(100552);
      w[] arrayOfw;
      if ((this.j != null) && (this.j.size() > 0))
      {
        arrayOfw = (w[])this.j.toArray(new w[0]);
        AppMethodBeat.o(100552);
      }
      while (true)
      {
        return arrayOfw;
        arrayOfw = null;
        AppMethodBeat.o(100552);
      }
    }
    finally
    {
    }
  }

  private SparseArray<x> m()
  {
    try
    {
      SparseArray localSparseArray = this.k;
      return localSparseArray;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(int paramInt)
  {
    try
    {
      AppMethodBeat.i(100553);
      this.e = paramInt;
      ag.f("step:%d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(100553);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(int paramInt, be parambe)
  {
    try
    {
      AppMethodBeat.i(100549);
      if (this.i != null)
        if (parambe == null)
        {
          this.i.remove(paramInt);
          AppMethodBeat.o(100549);
        }
      while (true)
      {
        return;
        this.i.put(paramInt, parambe);
        parambe.a(f());
        AppMethodBeat.o(100549);
      }
    }
    finally
    {
    }
    throw parambe;
  }

  public final void a(int paramInt, Map<String, String> paramMap)
  {
    AppMethodBeat.i(100558);
    Object localObject = m();
    if (localObject != null)
    {
      localObject = (x)((SparseArray)localObject).get(paramInt);
      if (localObject != null)
        ((x)localObject).a(paramMap);
    }
    AppMethodBeat.o(100558);
  }

  public final void a(s params)
  {
    try
    {
      AppMethodBeat.i(100554);
      if (params == null)
        AppMethodBeat.o(100554);
      while (true)
      {
        return;
        Object localObject1;
        if (this.h == null)
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          this.h = ((List)localObject1);
        }
        if (!this.h.contains(params))
        {
          this.h.add(params);
          int n = j();
          Object localObject2;
          if (g())
          {
            ag.e("add listener should notify app first run! %s", new Object[] { params.toString() });
            localObject1 = b.a();
            localObject2 = new com/tencent/tencentmap/mapsdk/maps/a/t$2;
            ((t.2)localObject2).<init>(params);
            ((b)localObject1).a((Runnable)localObject2);
          }
          if (n >= 2)
          {
            ag.e("add listener should notify app start query! %s", new Object[] { params.toString() });
            localObject1 = b.a();
            localObject2 = new com/tencent/tencentmap/mapsdk/maps/a/t$3;
            ((t.3)localObject2).<init>(params, n);
            ((b)localObject1).a((Runnable)localObject2);
          }
        }
        AppMethodBeat.o(100554);
      }
    }
    finally
    {
    }
    throw params;
  }

  public final void a(v paramv)
  {
    AppMethodBeat.i(100557);
    w[] arrayOfw = l();
    if (arrayOfw != null)
    {
      int n = arrayOfw.length;
      int i1 = 0;
      while (true)
        if (i1 < n)
        {
          w localw = arrayOfw[i1];
          try
          {
            localw.a(paramv);
            i1++;
          }
          catch (Throwable localThrowable)
          {
            while (true)
            {
              ag.a(localThrowable);
              ag.d("com strategy changed error %s", new Object[] { localThrowable.toString() });
            }
          }
        }
    }
    AppMethodBeat.o(100557);
  }

  public final void a(w paramw)
  {
    try
    {
      AppMethodBeat.i(100555);
      if ((paramw != null) && (this.j != null) && (!this.j.contains(paramw)))
        this.j.add(paramw);
      AppMethodBeat.o(100555);
      return;
    }
    finally
    {
    }
    throw paramw;
  }

  public final void a(x paramx)
  {
    try
    {
      AppMethodBeat.i(100556);
      if ((paramx != null) && (this.k != null))
        this.k.put(1, paramx);
      AppMethodBeat.o(100556);
      return;
    }
    finally
    {
    }
    throw paramx;
  }

  public final boolean a()
  {
    try
    {
      boolean bool = this.l;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void b()
  {
    try
    {
      this.l = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final Runnable d()
  {
    try
    {
      Runnable localRunnable = this.g;
      return localRunnable;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final v e()
  {
    try
    {
      v localv = this.a;
      return localv;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final bd f()
  {
    try
    {
      bd localbd = this.f;
      return localbd;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean g()
  {
    try
    {
      boolean bool = this.d;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected final void h()
  {
    try
    {
      AppMethodBeat.i(100550);
      this.d = true;
      ag.f("isFirst }%b", new Object[] { Boolean.TRUE });
      AppMethodBeat.o(100550);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final s[] i()
  {
    try
    {
      AppMethodBeat.i(100551);
      s[] arrayOfs;
      if ((this.h != null) && (this.h.size() > 0))
      {
        arrayOfs = (s[])this.h.toArray(new s[0]);
        AppMethodBeat.o(100551);
      }
      while (true)
      {
        return arrayOfs;
        arrayOfs = null;
        AppMethodBeat.o(100551);
      }
    }
    finally
    {
    }
  }

  public final int j()
  {
    try
    {
      int n = this.e;
      return n;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.t
 * JD-Core Version:    0.6.2
 */