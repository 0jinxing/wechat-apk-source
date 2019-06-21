package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.PointF;
import com.tencent.map.lib.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class gq
  implements gf
{
  private ArrayList<gf> a;

  public gq()
  {
    AppMethodBeat.i(99425);
    this.a = new ArrayList();
    AppMethodBeat.o(99425);
  }

  public void a()
  {
    AppMethodBeat.i(99430);
    for (int i = this.a.size() - 1; i >= 0; i--)
      ((gf)this.a.get(i)).a();
    AppMethodBeat.o(99430);
  }

  public void a(gf paramgf)
  {
    try
    {
      AppMethodBeat.i(99426);
      if ((paramgf != null) && (!this.a.contains(paramgf)))
        this.a.add(paramgf);
      AppMethodBeat.o(99426);
      return;
    }
    finally
    {
    }
    throw paramgf;
  }

  public boolean a(float paramFloat)
  {
    try
    {
      AppMethodBeat.i(99439);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).a(paramFloat))
        {
          bool = true;
          AppMethodBeat.o(99439);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99439);
      }
    }
    finally
    {
    }
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(99428);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).a(paramFloat1, paramFloat2))
        {
          bool = true;
          AppMethodBeat.o(99428);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99428);
      }
    }
    finally
    {
    }
  }

  public boolean a(PointF paramPointF1, PointF paramPointF2, double paramDouble1, double paramDouble2)
  {
    try
    {
      AppMethodBeat.i(99442);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).a(paramPointF1, paramPointF2, paramDouble1, paramDouble2))
        {
          bool = true;
          AppMethodBeat.o(99442);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99442);
      }
    }
    finally
    {
    }
    throw paramPointF1;
  }

  public boolean a(PointF paramPointF1, PointF paramPointF2, float paramFloat)
  {
    try
    {
      AppMethodBeat.i(99441);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).a(paramPointF1, paramPointF2, paramFloat))
        {
          bool = true;
          AppMethodBeat.o(99441);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99441);
      }
    }
    finally
    {
    }
    throw paramPointF1;
  }

  public void b(gf paramgf)
  {
    try
    {
      AppMethodBeat.i(99427);
      this.a.remove(paramgf);
      AppMethodBeat.o(99427);
      return;
    }
    finally
    {
      paramgf = finally;
    }
    throw paramgf;
  }

  public boolean b()
  {
    try
    {
      AppMethodBeat.i(99437);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).b())
        {
          bool = true;
          AppMethodBeat.o(99437);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99437);
      }
    }
    finally
    {
    }
  }

  public boolean b(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(99429);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).b(paramFloat1, paramFloat2))
        {
          bool = true;
          AppMethodBeat.o(99429);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        d.a("notify onSingleTap");
        for (i = this.a.size() - 1; i >= 0; i--)
          ((gf)this.a.get(i)).a();
        bool = false;
        AppMethodBeat.o(99429);
      }
    }
    finally
    {
    }
  }

  public boolean c()
  {
    try
    {
      AppMethodBeat.i(99438);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).c())
        {
          bool = true;
          AppMethodBeat.o(99438);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99438);
      }
    }
    finally
    {
    }
  }

  public boolean c(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(99431);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).c(paramFloat1, paramFloat2))
        {
          bool = true;
          AppMethodBeat.o(99431);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99431);
      }
    }
    finally
    {
    }
  }

  public boolean d()
  {
    try
    {
      AppMethodBeat.i(99440);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).d())
        {
          bool = true;
          AppMethodBeat.o(99440);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99440);
      }
    }
    finally
    {
    }
  }

  public boolean d(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(99432);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).d(paramFloat1, paramFloat2))
        {
          bool = true;
          AppMethodBeat.o(99432);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99432);
      }
    }
    finally
    {
    }
  }

  public boolean e(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(99433);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).e(paramFloat1, paramFloat2))
        {
          bool = true;
          AppMethodBeat.o(99433);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99433);
      }
    }
    finally
    {
    }
  }

  public boolean f(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(99434);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).f(paramFloat1, paramFloat2))
        {
          bool = true;
          AppMethodBeat.o(99434);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99434);
      }
    }
    finally
    {
    }
  }

  public boolean g(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(99435);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).g(paramFloat1, paramFloat2))
        {
          bool = true;
          AppMethodBeat.o(99435);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99435);
      }
    }
    finally
    {
    }
  }

  public boolean h(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(99436);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).h(paramFloat1, paramFloat2))
        {
          bool = true;
          AppMethodBeat.o(99436);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99436);
      }
    }
    finally
    {
    }
  }

  public boolean i(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(99443);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).i(paramFloat1, paramFloat2))
        {
          bool = true;
          AppMethodBeat.o(99443);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99443);
      }
    }
    finally
    {
    }
  }

  public boolean j(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(99444);
      int i = this.a.size() - 1;
      boolean bool;
      if (i >= 0)
        if (((gf)this.a.get(i)).j(paramFloat1, paramFloat2))
        {
          bool = true;
          AppMethodBeat.o(99444);
        }
      while (true)
      {
        return bool;
        i--;
        break;
        bool = false;
        AppMethodBeat.o(99444);
      }
    }
    finally
    {
    }
  }

  public boolean k(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99445);
    int i = this.a.size() - 1;
    boolean bool;
    if (i >= 0)
      if (((gf)this.a.get(i)).k(paramFloat1, paramFloat2))
      {
        bool = true;
        AppMethodBeat.o(99445);
      }
    while (true)
    {
      return bool;
      i--;
      break;
      bool = false;
      AppMethodBeat.o(99445);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gq
 * JD-Core Version:    0.6.2
 */