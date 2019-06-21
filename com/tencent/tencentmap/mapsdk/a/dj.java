package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.element.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class dj
  implements cv
{
  private dk a = null;
  private String b = "";
  private ba c = null;

  public dj(dk paramdk, ba paramba, String paramString)
  {
    this.b = paramString;
    this.a = paramdk;
    this.c = paramba;
  }

  public final List<j> a()
  {
    AppMethodBeat.i(101053);
    List localList;
    if (this.c != null)
    {
      localList = this.c.b(this.b);
      AppMethodBeat.o(101053);
    }
    while (true)
    {
      return localList;
      localList = null;
      AppMethodBeat.o(101053);
    }
  }

  public final void a(float paramFloat)
  {
    AppMethodBeat.i(101040);
    this.c.a(this.b, paramFloat);
    this.a.a(paramFloat);
    AppMethodBeat.o(101040);
  }

  public final void a(int paramInt)
  {
    AppMethodBeat.i(101042);
    this.c.b(this.b, paramInt);
    this.a.a(paramInt);
    AppMethodBeat.o(101042);
  }

  public final void a(List<db> paramList)
  {
    AppMethodBeat.i(101038);
    if (this.c == null)
      AppMethodBeat.o(101038);
    while (true)
    {
      return;
      this.c.a(this.b, paramList);
      this.a.a(paramList);
      AppMethodBeat.o(101038);
    }
  }

  public final void a(boolean paramBoolean)
  {
    AppMethodBeat.i(101048);
    this.c.a(this.b, paramBoolean);
    this.a.a(paramBoolean);
    AppMethodBeat.o(101048);
  }

  public final boolean a(db paramdb)
  {
    AppMethodBeat.i(101052);
    List localList = d();
    int i;
    if ((localList == null) || (localList.size() < 3) || (paramdb == null))
    {
      i = 0;
      AppMethodBeat.o(101052);
    }
    while (true)
    {
      return i;
      int j = localList.size() - 1;
      i = 0;
      for (int m = 0; ; m++)
      {
        if (m >= localList.size())
          break label97;
        if (((db)localList.get(m)).equals(paramdb))
        {
          i = 1;
          AppMethodBeat.o(101052);
          break;
        }
      }
      label97: m = 0;
      if (m < localList.size())
      {
        int n;
        if ((((db)localList.get(m)).a >= paramdb.a) || (((db)localList.get(j)).a < paramdb.a))
        {
          n = i;
          if (((db)localList.get(j)).a < paramdb.a)
          {
            n = i;
            if (((db)localList.get(m)).a < paramdb.a);
          }
        }
        else if (((db)localList.get(m)).b > paramdb.b)
        {
          n = i;
          if (((db)localList.get(j)).b > paramdb.b);
        }
        else
        {
          if (((db)localList.get(m)).b + (paramdb.a - ((db)localList.get(m)).a) / (((db)localList.get(j)).a - ((db)localList.get(m)).a) * (((db)localList.get(j)).b - ((db)localList.get(m)).b) > paramdb.b)
            break label376;
        }
        label376: int k;
        for (j = 1; ; k = 0)
        {
          n = i ^ j;
          j = m;
          m++;
          i = n;
          break;
        }
      }
      AppMethodBeat.o(101052);
    }
  }

  public final void b()
  {
    AppMethodBeat.i(101037);
    if (this.c == null)
      AppMethodBeat.o(101037);
    while (true)
    {
      return;
      this.c.a(this.b);
      AppMethodBeat.o(101037);
    }
  }

  public final void b(int paramInt)
  {
    AppMethodBeat.i(101044);
    this.c.a(this.b, paramInt);
    this.a.b(paramInt);
    AppMethodBeat.o(101044);
  }

  public final String c()
  {
    return this.b;
  }

  public final void c(int paramInt)
  {
    AppMethodBeat.i(101046);
    this.c.b(this.b, paramInt);
    this.a.c(paramInt);
    AppMethodBeat.o(101046);
  }

  public final List<db> d()
  {
    AppMethodBeat.i(101039);
    List localList = this.a.a();
    AppMethodBeat.o(101039);
    return localList;
  }

  public final void d(int paramInt)
  {
    AppMethodBeat.i(101055);
    if ((paramInt < di.a) || (paramInt > di.c))
      AppMethodBeat.o(101055);
    while (true)
    {
      return;
      this.c.c(this.b, paramInt);
      this.a.d(paramInt);
      AppMethodBeat.o(101055);
    }
  }

  public final float e()
  {
    AppMethodBeat.i(101041);
    float f = this.a.b();
    AppMethodBeat.o(101041);
    return f;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(101050);
    boolean bool;
    if (!(paramObject instanceof dj))
    {
      bool = false;
      AppMethodBeat.o(101050);
    }
    while (true)
    {
      return bool;
      paramObject = (dj)paramObject;
      bool = this.b.equals(paramObject.b);
      AppMethodBeat.o(101050);
    }
  }

  public final int f()
  {
    AppMethodBeat.i(101043);
    int i = this.a.c();
    AppMethodBeat.o(101043);
    return i;
  }

  public final int g()
  {
    AppMethodBeat.i(101045);
    int i = this.a.d();
    AppMethodBeat.o(101045);
    return i;
  }

  public final float h()
  {
    AppMethodBeat.i(101047);
    float f = this.a.e();
    AppMethodBeat.o(101047);
    return f;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(101051);
    int i = this.b.hashCode();
    AppMethodBeat.o(101051);
    return i;
  }

  public final boolean i()
  {
    AppMethodBeat.i(101049);
    boolean bool = this.a.f();
    AppMethodBeat.o(101049);
    return bool;
  }

  public final int j()
  {
    AppMethodBeat.i(101054);
    int i = this.a.h();
    AppMethodBeat.o(101054);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.dj
 * JD-Core Version:    0.6.2
 */