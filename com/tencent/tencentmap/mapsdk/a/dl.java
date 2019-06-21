package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.element.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class dl
  implements cv
{
  private dm a = null;
  private String b = "";
  private bc c = null;

  public dl(dm paramdm, bc parambc, String paramString)
  {
    this.b = paramString;
    this.a = paramdm;
    this.c = parambc;
  }

  public final List<j> a()
  {
    AppMethodBeat.i(101076);
    List localList = this.c.b(this.b);
    AppMethodBeat.o(101076);
    return localList;
  }

  public final void a(float paramFloat)
  {
    AppMethodBeat.i(101062);
    float f = paramFloat;
    if (paramFloat < 0.0F)
      f = 1.0F;
    this.c.a(this.b, f);
    this.a.a(f);
    AppMethodBeat.o(101062);
  }

  public final void a(int paramInt)
  {
    AppMethodBeat.i(101064);
    this.c.a(this.b, paramInt);
    this.a.a(paramInt);
    AppMethodBeat.o(101064);
  }

  public final void a(int paramInt, db paramdb)
  {
    AppMethodBeat.i(101072);
    this.c.a(this.b, paramInt, paramdb);
    AppMethodBeat.o(101072);
  }

  public final void a(cm paramcm)
  {
    AppMethodBeat.i(101065);
    this.c.a(this.b, paramcm);
    AppMethodBeat.o(101065);
  }

  public final void a(List<db> paramList)
  {
    AppMethodBeat.i(101060);
    this.c.a(this.b, paramList);
    this.a.a(paramList);
    AppMethodBeat.o(101060);
  }

  public final void a(boolean paramBoolean)
  {
    AppMethodBeat.i(101069);
    this.c.a(this.b, paramBoolean);
    this.a.a(paramBoolean);
    AppMethodBeat.o(101069);
  }

  public final void b()
  {
    AppMethodBeat.i(101059);
    if (this.c == null)
      AppMethodBeat.o(101059);
    while (true)
    {
      return;
      this.c.a(this.b);
      AppMethodBeat.o(101059);
    }
  }

  public final void b(int paramInt)
  {
    AppMethodBeat.i(101067);
    this.c.b(this.b, Math.max(0, paramInt));
    this.a.d(Math.max(0, paramInt));
    AppMethodBeat.o(101067);
  }

  public final void b(boolean paramBoolean)
  {
    AppMethodBeat.i(101073);
    this.c.b(this.b, paramBoolean);
    AppMethodBeat.o(101073);
  }

  public final String c()
  {
    return this.b;
  }

  public final void c(int paramInt)
  {
    AppMethodBeat.i(101079);
    if ((paramInt < di.a) || (paramInt > di.c))
      AppMethodBeat.o(101079);
    while (true)
    {
      return;
      this.c.b(this.b, paramInt);
      this.a.f(paramInt);
      AppMethodBeat.o(101079);
    }
  }

  public final List<db> d()
  {
    AppMethodBeat.i(101061);
    List localList = this.a.e();
    AppMethodBeat.o(101061);
    return localList;
  }

  public final float e()
  {
    AppMethodBeat.i(101063);
    float f = this.a.f();
    AppMethodBeat.o(101063);
    return f;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(101074);
    boolean bool;
    if (!(paramObject instanceof dl))
    {
      bool = false;
      AppMethodBeat.o(101074);
    }
    while (true)
    {
      return bool;
      paramObject = (dl)paramObject;
      bool = this.b.equals(paramObject.b);
      AppMethodBeat.o(101074);
    }
  }

  public final int f()
  {
    AppMethodBeat.i(101066);
    int i = this.a.g();
    AppMethodBeat.o(101066);
    return i;
  }

  public final int g()
  {
    AppMethodBeat.i(101068);
    int i = this.a.i();
    AppMethodBeat.o(101068);
    return i;
  }

  public final boolean h()
  {
    AppMethodBeat.i(101070);
    boolean bool = this.a.k();
    AppMethodBeat.o(101070);
    return bool;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(101075);
    int i = this.b.hashCode();
    AppMethodBeat.o(101075);
    return i;
  }

  public final List<Integer> i()
  {
    AppMethodBeat.i(101071);
    List localList = this.a.x();
    AppMethodBeat.o(101071);
    return localList;
  }

  public final boolean j()
  {
    AppMethodBeat.i(101077);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.w();
      AppMethodBeat.o(101077);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101077);
    }
  }

  public final int k()
  {
    AppMethodBeat.i(101078);
    int i = this.a.t();
    AppMethodBeat.o(101078);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.dl
 * JD-Core Version:    0.6.2
 */