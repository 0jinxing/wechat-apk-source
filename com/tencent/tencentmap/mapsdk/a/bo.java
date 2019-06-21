package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.k;
import com.tencent.map.lib.element.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.fw;
import com.tencent.tencentmap.mapsdk.maps.a.gj;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class bo extends k
{
  private static int c = 0;
  private CopyOnWriteArrayList<bo.a> a;
  private Context b;

  private GeoPoint a(db paramdb)
  {
    AppMethodBeat.i(100856);
    if (paramdb == null)
    {
      paramdb = null;
      AppMethodBeat.o(100856);
    }
    while (true)
    {
      return paramdb;
      paramdb = new GeoPoint((int)(paramdb.a * 1000000.0D), (int)(paramdb.b * 1000000.0D));
      AppMethodBeat.o(100856);
    }
  }

  private boolean a(fw paramfw, l paraml1, l paraml2)
  {
    AppMethodBeat.i(100855);
    paraml1 = paraml1.a(paramfw);
    paramfw = paraml2.a(paramfw);
    boolean bool;
    if ((paraml1 == null) || (paramfw == null))
    {
      bool = false;
      AppMethodBeat.o(100855);
    }
    while (true)
    {
      return bool;
      bool = Rect.intersects(paraml1, paramfw);
      AppMethodBeat.o(100855);
    }
  }

  private bo.b b(int paramInt)
  {
    bo.b localb;
    switch (paramInt)
    {
    default:
      localb = bo.b.d;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return localb;
      localb = bo.b.a;
      continue;
      localb = bo.b.b;
      continue;
      localb = bo.b.c;
    }
  }

  private void b(fw paramfw)
  {
    AppMethodBeat.i(100854);
    if ((this.a == null) || (this.a.isEmpty()))
      AppMethodBeat.o(100854);
    while (true)
    {
      return;
      int i = this.a.size();
      int j = bo.b.d.ordinal();
      bo.b[] arrayOfb = new bo.b[i];
      for (int k = 0; k < i; k++)
        arrayOfb[k] = bo.b.a;
      for (k = 0; k < i; k++)
      {
        bo.a locala1 = (bo.a)this.a.get(k);
        l locall1 = locala1.c();
        locala1.a(paramfw, arrayOfb[k]);
        for (int m = k + 1; m < i; m++)
        {
          bo.a locala2 = (bo.a)this.a.get(m);
          l locall2 = locala2.c();
          locala2.a(paramfw, arrayOfb[m]);
          bo.b localb;
          if (locala1.b() <= locala2.b())
            for (n = arrayOfb[m].ordinal(); n <= j; n++)
            {
              localb = b(n);
              locala2.a(paramfw, localb);
              arrayOfb[m] = localb;
              if (!a(paramfw, locall1, locall2))
                break;
            }
          for (int n = arrayOfb[k].ordinal() - 1; n < j; n++)
          {
            localb = b(n);
            locala2.a(paramfw, localb);
            arrayOfb[k] = localb;
            if (!a(paramfw, locall1, locall2))
              break;
          }
        }
      }
      AppMethodBeat.o(100854);
    }
  }

  public boolean a(fw paramfw, float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(100853);
      int i = c();
      int j = 0;
      boolean bool;
      if (j < i)
      {
        l locall = (l)a(j);
        if (locall.a(paramfw, paramFloat1, paramFloat2))
        {
          if ((j < i - 1) && (b(locall)))
            a(locall);
          bool = true;
          AppMethodBeat.o(100853);
        }
      }
      while (true)
      {
        return bool;
        j++;
        break;
        AppMethodBeat.o(100853);
        bool = false;
      }
    }
    finally
    {
    }
    throw paramfw;
  }

  public void b(gj paramgj, fw paramfw)
  {
    try
    {
      AppMethodBeat.i(100852);
      b(paramfw);
      super.b(paramgj, paramfw);
      AppMethodBeat.o(100852);
      return;
    }
    finally
    {
      paramgj = finally;
    }
    throw paramgj;
  }

  public void e()
  {
    try
    {
      AppMethodBeat.i(100850);
      this.a.clear();
      d();
      AppMethodBeat.o(100850);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void f()
  {
    try
    {
      AppMethodBeat.i(100851);
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        bo.a locala = (bo.a)localIterator.next();
        if ((locala != null) && (locala.a()))
        {
          this.a.remove(locala);
          b(locala.c());
        }
      }
    }
    finally
    {
    }
    AppMethodBeat.o(100851);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.bo
 * JD-Core Version:    0.6.2
 */