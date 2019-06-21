package com.tencent.mm.plugin.appbrand.s.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.f.a;

public enum a
  implements e, f.a
{
  public static final c iRV;
  private final e iRW;

  static
  {
    AppMethodBeat.i(126652);
    iRU = new a("INST");
    iRX = new a[] { iRU };
    iRV = new c();
    AppMethodBeat.o(126652);
  }

  private a()
  {
    AppMethodBeat.i(126646);
    this.iRW = new b();
    AppMethodBeat.o(126646);
  }

  public final void aNZ()
  {
    AppMethodBeat.i(126651);
    release();
    AppMethodBeat.o(126651);
  }

  public final c aOb()
  {
    AppMethodBeat.i(126649);
    c localc = this.iRW.aOb();
    AppMethodBeat.o(126649);
    return localc;
  }

  public final void da(Context paramContext)
  {
    AppMethodBeat.i(126650);
    init(paramContext);
    AppMethodBeat.o(126650);
  }

  public final void init(Context paramContext)
  {
    AppMethodBeat.i(126647);
    this.iRW.init(paramContext);
    AppMethodBeat.o(126647);
  }

  public final void release()
  {
    AppMethodBeat.i(126648);
    this.iRW.release();
    AppMethodBeat.o(126648);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.a.a
 * JD-Core Version:    0.6.2
 */