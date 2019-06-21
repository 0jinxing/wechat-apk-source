package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.element.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.id;
import java.util.List;

public final class cq
  implements cv
{
  private cr a = null;
  private String b = "";
  private bp c = null;

  public cq(cr paramcr, bp parambp, String paramString)
  {
    this.b = paramString;
    this.a = paramcr;
    this.c = parambp;
  }

  public final List<j> a()
  {
    AppMethodBeat.i(100972);
    List localList;
    if (this.c != null)
    {
      localList = this.c.b(this.b);
      AppMethodBeat.o(100972);
    }
    while (true)
    {
      return localList;
      localList = null;
      AppMethodBeat.o(100972);
    }
  }

  public final void a(double paramDouble)
  {
    AppMethodBeat.i(100959);
    if (paramDouble < 0.0D)
      AppMethodBeat.o(100959);
    while (true)
    {
      return;
      if (this.c == null)
      {
        AppMethodBeat.o(100959);
      }
      else
      {
        this.c.a(this.b, paramDouble);
        this.a.a(paramDouble);
        AppMethodBeat.o(100959);
      }
    }
  }

  public final void a(float paramFloat)
  {
    AppMethodBeat.i(100961);
    if (paramFloat < 0.0F)
      AppMethodBeat.o(100961);
    while (true)
    {
      return;
      this.c.a(this.b, paramFloat);
      this.a.a(paramFloat);
      AppMethodBeat.o(100961);
    }
  }

  public final void a(int paramInt)
  {
    AppMethodBeat.i(100963);
    this.c.b(this.b, paramInt);
    this.a.a(paramInt);
    AppMethodBeat.o(100963);
  }

  public final void a(boolean paramBoolean)
  {
    AppMethodBeat.i(100969);
    this.c.a(this.b, paramBoolean);
    this.a.a(paramBoolean);
    AppMethodBeat.o(100969);
  }

  public final boolean a(db paramdb)
  {
    AppMethodBeat.i(100955);
    boolean bool;
    if (id.a(d(), paramdb) < e())
    {
      bool = true;
      AppMethodBeat.o(100955);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100955);
    }
  }

  public final void b()
  {
    AppMethodBeat.i(100956);
    if (this.c == null)
      AppMethodBeat.o(100956);
    while (true)
    {
      return;
      this.c.a(this.b);
      AppMethodBeat.o(100956);
    }
  }

  public final void b(int paramInt)
  {
    AppMethodBeat.i(100965);
    this.c.a(this.b, paramInt);
    this.a.b(paramInt);
    AppMethodBeat.o(100965);
  }

  public final void b(db paramdb)
  {
    AppMethodBeat.i(100957);
    if (this.c == null)
      AppMethodBeat.o(100957);
    while (true)
    {
      return;
      this.c.a(this.b, paramdb);
      this.a.a(paramdb);
      AppMethodBeat.o(100957);
    }
  }

  public final String c()
  {
    return this.b;
  }

  public final void c(int paramInt)
  {
    AppMethodBeat.i(100967);
    this.c.b(this.b, paramInt);
    this.a.c(paramInt);
    AppMethodBeat.o(100967);
  }

  public final db d()
  {
    AppMethodBeat.i(100958);
    db localdb = new db(this.a.a().a, this.a.a().b);
    AppMethodBeat.o(100958);
    return localdb;
  }

  public final void d(int paramInt)
  {
    AppMethodBeat.i(100974);
    if ((paramInt < di.a) || (paramInt > di.c))
      AppMethodBeat.o(100974);
    while (true)
    {
      return;
      this.c.c(this.b, paramInt);
      this.a.d(paramInt);
      AppMethodBeat.o(100974);
    }
  }

  public final double e()
  {
    AppMethodBeat.i(100960);
    double d = this.a.b();
    AppMethodBeat.o(100960);
    return d;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(100971);
    boolean bool;
    if (!(paramObject instanceof cq))
    {
      bool = false;
      AppMethodBeat.o(100971);
    }
    while (true)
    {
      return bool;
      paramObject = (cq)paramObject;
      bool = this.b.equals(paramObject.b);
      AppMethodBeat.o(100971);
    }
  }

  public final float f()
  {
    AppMethodBeat.i(100962);
    float f = this.a.c();
    AppMethodBeat.o(100962);
    return f;
  }

  public final int g()
  {
    AppMethodBeat.i(100964);
    int i = this.a.d();
    AppMethodBeat.o(100964);
    return i;
  }

  public final int h()
  {
    AppMethodBeat.i(100966);
    int i = this.a.e();
    AppMethodBeat.o(100966);
    return i;
  }

  public final int hashCode()
  {
    return 0;
  }

  public final float i()
  {
    AppMethodBeat.i(100968);
    float f = this.a.f();
    AppMethodBeat.o(100968);
    return f;
  }

  public final boolean j()
  {
    AppMethodBeat.i(100970);
    boolean bool = this.a.g();
    AppMethodBeat.o(100970);
    return bool;
  }

  public final int k()
  {
    AppMethodBeat.i(100973);
    int i = this.a.h();
    AppMethodBeat.o(100973);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.cq
 * JD-Core Version:    0.6.2
 */