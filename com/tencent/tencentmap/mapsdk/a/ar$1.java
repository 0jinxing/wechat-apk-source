package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.fx;
import com.tencent.tencentmap.mapsdk.maps.a.gk.a;
import com.tencent.tencentmap.mapsdk.maps.a.im;
import com.tencent.tencentmap.mapsdk.maps.a.iz;

class ar$1
  implements gk.a
{
  ar$1(ar paramar)
  {
  }

  public void a(fx paramfx)
  {
    AppMethodBeat.i(100582);
    if (paramfx.a != 10000)
      AppMethodBeat.o(100582);
    while (true)
    {
      return;
      if (!(paramfx instanceof im))
      {
        AppMethodBeat.o(100582);
      }
      else
      {
        paramfx = (im)paramfx;
        int i;
        int j;
        if (paramfx.j())
        {
          i = paramfx.k();
          j = paramfx.l();
          ar.a(this.a).b().c(ar.a(this.a).T / 2 - i, ar.a(this.a).U / 2 - j);
        }
        if (paramfx.e())
        {
          i = paramfx.f();
          j = paramfx.g();
          ar.a(this.a).b().c(i, j);
        }
        float f;
        if (paramfx.h())
        {
          f = paramfx.i();
          ar.a(this.a).b().b(f);
        }
        if (paramfx.m())
        {
          j = paramfx.n();
          i = paramfx.o();
          ar.a(this.a).b().a(j, i);
          if (paramfx.t())
            ar.a(this.a).c(j, i);
        }
        if (paramfx.q())
        {
          f = paramfx.p();
          ar.a(this.a).b().b(f);
        }
        if (paramfx.r())
        {
          f = paramfx.s();
          ar.a(this.a).b().a(f);
        }
        if (paramfx.j())
        {
          i = paramfx.k();
          j = paramfx.l();
          ar.a(this.a).b().c(i - ar.a(this.a).T / 2, j - ar.a(this.a).U / 2);
        }
        AppMethodBeat.o(100582);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ar.1
 * JD-Core Version:    0.6.2
 */