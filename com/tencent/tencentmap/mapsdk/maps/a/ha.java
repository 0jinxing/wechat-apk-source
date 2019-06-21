package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class ha
  implements fv
{
  private gm a = null;
  private gz b = null;
  private hf c = null;

  public ha(gm paramgm, hf paramhf)
  {
    this.a = paramgm;
    this.c = paramhf;
  }

  public void a()
  {
    AppMethodBeat.i(99518);
    if (this.b != null);
    while (true)
    {
      synchronized (this.b)
      {
        this.b.notify();
        AppMethodBeat.o(99518);
        return;
      }
      AppMethodBeat.o(99518);
    }
  }

  public void b()
  {
    AppMethodBeat.i(99514);
    if (this.a == null)
      AppMethodBeat.o(99514);
    while (true)
    {
      return;
      this.a.a().a(this);
      if (this.b == null)
        this.b = new gz(this.a, this.c);
      try
      {
        this.b.start();
        AppMethodBeat.o(99514);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(99514);
      }
    }
  }

  public void c()
  {
    AppMethodBeat.i(99515);
    if (this.b != null)
      this.b.a();
    AppMethodBeat.o(99515);
  }

  public void d()
  {
    AppMethodBeat.i(99516);
    if (this.b != null)
    {
      this.b.b();
      a();
    }
    AppMethodBeat.o(99516);
  }

  public void e()
  {
    AppMethodBeat.i(99517);
    if (this.a == null)
      AppMethodBeat.o(99517);
    while (true)
    {
      return;
      this.a.a().b(this);
      if (this.b != null)
      {
        this.b.c();
        this.b = null;
      }
      AppMethodBeat.o(99517);
    }
  }

  public void f()
  {
    AppMethodBeat.i(99519);
    e();
    AppMethodBeat.o(99519);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ha
 * JD-Core Version:    0.6.2
 */