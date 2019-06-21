package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.element.b;
import com.tencent.map.lib.element.f;
import com.tencent.map.lib.element.g;
import com.tencent.map.lib.element.h;
import com.tencent.map.lib.element.i;
import com.tencent.map.lib.element.j;
import com.tencent.map.lib.element.k;
import com.tencent.map.lib.element.l;
import com.tencent.map.lib.mapstructure.TappedElement;
import com.tencent.map.lib.util.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class gl
{
  private CopyOnWriteArrayList<j> a;
  private CopyOnWriteArrayList<j> b;
  private CopyOnWriteArrayList<j> c;
  private fn d;
  private g e;
  private List<f> f;
  private b g;
  private i h;
  private com.tencent.map.lib.listener.a i;
  private CopyOnWriteArrayList<Integer> j;

  public gl(fn paramfn)
  {
    AppMethodBeat.i(99281);
    this.d = paramfn;
    this.a = new CopyOnWriteArrayList();
    this.b = new CopyOnWriteArrayList();
    this.c = new CopyOnWriteArrayList();
    this.j = new CopyOnWriteArrayList();
    AppMethodBeat.o(99281);
  }

  private void a()
  {
    AppMethodBeat.i(99285);
    synchronized (this.a)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int k = this.c.size();
      for (int m = 0; m < k; m++)
      {
        localObject2 = (j)this.c.get(m);
        if ((localObject2 instanceof k))
        {
          localObject2 = (k)localObject2;
          int n = ((k)localObject2).c();
          for (i1 = 0; i1 < n; i1++)
          {
            j localj = ((k)localObject2).a(i1);
            if ((localj instanceof l))
            {
              int i2 = ((l)localj).f();
              if (i2 >= 0)
                localArrayList.add(Integer.valueOf(i2));
            }
          }
        }
        if ((localObject2 instanceof l))
        {
          i1 = ((l)localObject2).f();
          if (i1 >= 0)
            localArrayList.add(Integer.valueOf(i1));
        }
      }
      int i1 = localArrayList.size();
      Object localObject2 = new int[i1];
      for (m = 0; m < i1; m++)
        localObject2[m] = ((Integer)localArrayList.get(m)).intValue();
      this.d.f().a((int[])localObject2, i1);
      this.c.clear();
      AppMethodBeat.o(99285);
      return;
    }
  }

  private boolean b(float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    AppMethodBeat.i(99287);
    Object localObject = this.d.f().a(paramFloat1, paramFloat2);
    if (localObject == null)
      AppMethodBeat.o(99287);
    while (true)
    {
      return bool;
      if ((((TappedElement)localObject).type == 1) && (this.e != null))
      {
        this.e.a(new h(((TappedElement)localObject).name, d.a(((TappedElement)localObject).pixelX, ((TappedElement)localObject).pixelY)));
        AppMethodBeat.o(99287);
        bool = true;
      }
      else if ((((TappedElement)localObject).type == 6) && (this.f != null))
      {
        Iterator localIterator = this.f.iterator();
        while (localIterator.hasNext())
        {
          localObject = (f)localIterator.next();
          if (localObject != null)
            ((f)localObject).a();
        }
        AppMethodBeat.o(99287);
        bool = true;
      }
      else if ((((TappedElement)localObject).type == 7) && (this.g != null))
      {
        this.g.a(((TappedElement)localObject).itemType, ((TappedElement)localObject).nameLen);
        AppMethodBeat.o(99287);
        bool = true;
      }
      else
      {
        if (this.h != null)
          this.h.a();
        AppMethodBeat.o(99287);
      }
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
  }

  public void a(j paramj)
  {
    AppMethodBeat.i(99282);
    synchronized (this.a)
    {
      if (this.a.contains(paramj))
      {
        AppMethodBeat.o(99282);
        return;
      }
      this.a.add(paramj);
      this.d.a().z();
      AppMethodBeat.o(99282);
    }
  }

  public void a(com.tencent.map.lib.listener.a parama)
  {
    this.i = parama;
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    AppMethodBeat.i(99288);
    TappedElement localTappedElement = this.d.f().a(paramFloat1, paramFloat2);
    if (localTappedElement == null)
      AppMethodBeat.o(99288);
    while (true)
    {
      return bool;
      if (localTappedElement.type == 3)
      {
        if (this.i != null)
          this.i.a();
        bool = true;
        AppMethodBeat.o(99288);
      }
      else
      {
        AppMethodBeat.o(99288);
      }
    }
  }

  public boolean a(fw paramfw, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99286);
    synchronized (this.a)
    {
      for (int k = this.a.size() - 1; k >= 0; k--)
      {
        j localj = (j)this.a.get(k);
        if ((localj != null) && (localj.a(paramfw, paramFloat1, paramFloat2)))
        {
          bool = true;
          AppMethodBeat.o(99286);
          return bool;
        }
      }
      boolean bool = b(paramFloat1, paramFloat2);
      AppMethodBeat.o(99286);
    }
  }

  public boolean a(gj paramgj, fw paramfw)
  {
    AppMethodBeat.i(99284);
    a();
    this.b.clear();
    while (true)
    {
      synchronized (this.a)
      {
        this.b.addAll(this.a);
        Iterator localIterator = this.b.iterator();
        if (!localIterator.hasNext())
          break;
        ??? = (j)localIterator.next();
        if ((??? instanceof com.tencent.map.lib.element.a))
          ((com.tencent.map.lib.element.a)???).a(paramgj, paramfw);
      }
      ((j)???).b(paramgj, paramfw);
    }
    AppMethodBeat.o(99284);
    return true;
  }

  public void b(j paramj)
  {
    AppMethodBeat.i(99283);
    if (paramj == null)
      AppMethodBeat.o(99283);
    while (true)
    {
      return;
      synchronized (this.a)
      {
        if (this.a.remove(paramj))
          this.d.a().z();
        this.c.add(paramj);
        AppMethodBeat.o(99283);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gl
 * JD-Core Version:    0.6.2
 */