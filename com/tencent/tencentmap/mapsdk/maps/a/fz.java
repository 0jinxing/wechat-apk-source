package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class fz
  implements gt, gu
{
  private ArrayList<fx> a;
  private ArrayList<fx> b;
  private ArrayList<fx> c;
  private LinkedList<Object> d;
  private fz.b e;
  private int f;
  private fz.a g;
  private long h;
  private boolean i;
  private fv j;

  public fz(fz.a parama)
  {
    AppMethodBeat.i(98953);
    this.a = new ArrayList();
    this.b = new ArrayList();
    this.c = new ArrayList();
    this.f = 60;
    this.g = parama;
    this.d = new LinkedList();
    fj.a(h());
    AppMethodBeat.o(98953);
  }

  public void a()
  {
    AppMethodBeat.i(98954);
    if (this.e != null)
      this.e.destroy();
    this.e = new fz.b(this, null);
    this.e.start();
    AppMethodBeat.o(98954);
  }

  public void a(int paramInt)
  {
    if (paramInt <= 0);
    while (true)
    {
      return;
      this.f = paramInt;
    }
  }

  public void a(fv paramfv)
  {
    this.j = paramfv;
  }

  public void a(fx paramfx)
  {
    AppMethodBeat.i(98958);
    synchronized (this.a)
    {
      if (this.a.size() > 200)
        this.a.clear();
      this.a.add(paramfx);
      i();
      AppMethodBeat.o(98958);
      return;
    }
  }

  public void a(gs paramgs)
  {
    AppMethodBeat.i(98962);
    this.i = true;
    this.h = System.currentTimeMillis();
    AppMethodBeat.o(98962);
  }

  public void b()
  {
    AppMethodBeat.i(98955);
    if (this.e != null)
      this.e.destroy();
    AppMethodBeat.o(98955);
  }

  public void c()
  {
    AppMethodBeat.i(98956);
    if (this.e != null)
      this.e.a();
    j();
    AppMethodBeat.o(98956);
  }

  public void d()
  {
    AppMethodBeat.i(98957);
    if (this.e != null)
      this.e.b();
    AppMethodBeat.o(98957);
  }

  public void e()
  {
    this.f = 60;
  }

  public int f()
  {
    return this.f;
  }

  public void g()
  {
    if (this.e == null);
  }

  public long h()
  {
    long l1 = 1000L / this.f;
    long l2 = l1;
    if (l1 == 0L)
      l2 = 1L;
    return l2;
  }

  public void i()
  {
    AppMethodBeat.i(98959);
    synchronized (this.d)
    {
      this.d.add(fx.h);
      AppMethodBeat.o(98959);
      return;
    }
  }

  public void j()
  {
    AppMethodBeat.i(98960);
    int k;
    while (true)
    {
      synchronized (this.a)
      {
        this.c.clear();
        this.b.clear();
        Iterator localIterator = this.a.iterator();
        k = 0;
        if (!localIterator.hasNext())
          break;
        fx localfx = (fx)localIterator.next();
        if (localfx.e)
        {
          k = 1;
          this.b.add(localfx);
        }
      }
      this.c.add(localObject1);
    }
    this.a.clear();
    Object localObject2;
    if (k != 0)
    {
      localObject2 = this.a;
      this.a = this.b;
      this.b = ((ArrayList)localObject2);
    }
    if (this.c.size() > 0)
    {
      localObject2 = this.c.iterator();
      while (((Iterator)localObject2).hasNext())
        ((fx)((Iterator)localObject2).next()).b();
    }
    AppMethodBeat.o(98960);
  }

  public boolean k()
  {
    AppMethodBeat.i(98961);
    while (true)
    {
      synchronized (this.a)
      {
        if (this.a.isEmpty())
        {
          AppMethodBeat.o(98961);
          bool = false;
          return bool;
        }
        ??? = (fx)this.a.get(0);
        if ((??? != null) && (((fx)???).a(this.g)))
        {
          ((fx)???).c();
          synchronized (this.a)
          {
            this.a.remove(???);
          }
        }
      }
      synchronized (this.a)
      {
        bool = this.a.isEmpty();
        if (!bool)
        {
          bool = true;
          AppMethodBeat.o(98961);
          continue;
          localObject3 = finally;
          AppMethodBeat.o(98961);
          throw localObject3;
          localObject4 = finally;
          AppMethodBeat.o(98961);
          throw localObject4;
        }
      }
      AppMethodBeat.o(98961);
      boolean bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fz
 * JD-Core Version:    0.6.2
 */