package com.tencent.mm.plugin.appbrand.b;

import android.os.Handler;
import android.support.v4.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bj;

public final class c
{
  final i gPI;
  public final d gWy;
  public final a<c.a, c> gWz;

  public c(i parami)
  {
    AppMethodBeat.i(86833);
    this.gWz = new a();
    this.gPI = parami;
    this.gWy = new c.1(this, parami);
    AppMethodBeat.o(86833);
  }

  public final void a(c.a parama)
  {
    AppMethodBeat.i(86834);
    if ((parama == null) || (b.gWw == this.gWy.awz()))
      AppMethodBeat.o(86834);
    while (true)
    {
      return;
      synchronized (this.gWz)
      {
        this.gWz.put(parama, this);
        AppMethodBeat.o(86834);
      }
    }
  }

  public final boolean awx()
  {
    boolean bool = false;
    AppMethodBeat.i(86836);
    d locald = this.gWy;
    switch (d.7.gWN[locald.awz().ordinal()])
    {
    default:
      AppMethodBeat.o(86836);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(86836);
      continue;
      AppMethodBeat.o(86836);
      continue;
      bool = ((Boolean)new d.5(locald).b(new ak(locald.xCt.getLooper()))).booleanValue();
      AppMethodBeat.o(86836);
    }
  }

  public final void b(c.a parama)
  {
    AppMethodBeat.i(86835);
    if ((parama == null) || (b.gWw == this.gWy.awz()))
      AppMethodBeat.o(86835);
    while (true)
    {
      return;
      synchronized (this.gWz)
      {
        this.gWz.remove(parama);
        AppMethodBeat.o(86835);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.c
 * JD-Core Version:    0.6.2
 */