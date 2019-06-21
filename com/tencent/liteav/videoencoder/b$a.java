package com.tencent.liteav.videoencoder;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.TimerTask;

class b$a extends TimerTask
{
  private WeakReference<b> a;

  public b$a(b paramb)
  {
    AppMethodBeat.i(67410);
    this.a = new WeakReference(paramb);
    AppMethodBeat.o(67410);
  }

  public void run()
  {
    AppMethodBeat.i(67411);
    if (this.a == null)
      AppMethodBeat.o(67411);
    while (true)
    {
      return;
      b localb = (b)this.a.get();
      if (localb == null)
      {
        AppMethodBeat.o(67411);
      }
      else if (b.i(localb) < b.j(localb))
      {
        int[] arrayOfInt = com.tencent.liteav.basic.util.b.a();
        b.k(localb);
        b.a(localb, b.l(localb) + arrayOfInt[0] / 10);
        float f = b.m(localb);
        b.b(localb, arrayOfInt[1] / 10 + f);
        b.c(localb, b.n(localb) + (float)(localb.b() * 100L / b.c(localb).fps));
        AppMethodBeat.o(67411);
      }
      else
      {
        if ((com.tencent.liteav.basic.f.b.a().a(b.l(localb) / b.j(localb), b.m(localb) / b.j(localb), b.n(localb) / b.j(localb))) && (com.tencent.liteav.basic.f.b.a().c() != 0))
          b.o(localb);
        b.p(localb);
        AppMethodBeat.o(67411);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.videoencoder.b.a
 * JD-Core Version:    0.6.2
 */