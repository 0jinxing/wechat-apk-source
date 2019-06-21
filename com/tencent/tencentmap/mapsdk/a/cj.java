package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Color;
import android.location.Location;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class cj extends bv
{
  private at a;
  private bp b;
  private br c;
  private af.a d;
  private af e;
  private boolean f;
  private de g;
  private cq h;
  private aj.n i;
  private dh j;
  private int k;
  private Location l;

  public cj(at paramat, bp parambp, br parambr)
  {
    AppMethodBeat.i(100941);
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = false;
    this.g = null;
    this.h = null;
    this.i = null;
    this.j = new dh();
    this.k = Color.argb(102, 0, 163, 255);
    this.l = null;
    this.a = paramat;
    this.b = parambp;
    this.c = parambr;
    this.d = f();
    AppMethodBeat.o(100941);
  }

  private af.a f()
  {
    AppMethodBeat.i(100945);
    cj.1 local1 = new cj.1(this);
    AppMethodBeat.o(100945);
    return local1;
  }

  void a()
  {
    AppMethodBeat.i(100943);
    if (this.f == true)
      AppMethodBeat.o(100943);
    while (true)
    {
      return;
      this.f = true;
      if (this.d == null)
        this.d = f();
      if (this.g != null)
        this.g.b(true);
      if (this.h != null)
        this.h.a(true);
      if (this.e != null)
        this.e.a(this.d);
      AppMethodBeat.o(100943);
    }
  }

  void b()
  {
    AppMethodBeat.i(100944);
    if (this.g != null)
    {
      this.g.b(false);
      this.g.b();
      this.g = null;
    }
    if (this.h != null)
    {
      this.h.a(false);
      this.h.b();
      this.h = null;
    }
    if (!this.f)
      AppMethodBeat.o(100944);
    while (true)
    {
      return;
      this.f = false;
      this.d = null;
      if (this.e != null)
        this.e.a();
      AppMethodBeat.o(100944);
    }
  }

  boolean c()
  {
    return this.f;
  }

  Location d()
  {
    AppMethodBeat.i(100946);
    Location localLocation;
    if (this.l == null)
    {
      localLocation = null;
      AppMethodBeat.o(100946);
    }
    while (true)
    {
      return localLocation;
      localLocation = new Location(this.l);
      AppMethodBeat.o(100946);
    }
  }

  public void e()
  {
    AppMethodBeat.i(100942);
    b();
    this.a = null;
    this.b = null;
    this.c = null;
    AppMethodBeat.o(100942);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.cj
 * JD-Core Version:    0.6.2
 */