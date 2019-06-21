package com.tencent.mm.plugin.gallery.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashSet;

public final class l
{
  public int hOZ;
  HashSet<i.a> mOq;
  public HashSet<i.c> mOr;
  public HashSet<i.b> mOs;
  public i mOt;
  public int mOu;

  public l()
  {
    AppMethodBeat.i(21323);
    this.hOZ = 3;
    this.mOu = 1;
    this.mOq = new HashSet();
    this.mOr = new HashSet();
    this.mOs = new HashSet();
    AppMethodBeat.o(21323);
  }

  private void bCt()
  {
    AppMethodBeat.i(21325);
    ab.i("MicroMsg.MediaQueryService", "initQueryType: %d", new Object[] { Integer.valueOf(this.mOu) });
    switch (this.mOu)
    {
    default:
      this.mOt = new a();
      AppMethodBeat.o(21325);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      this.mOt = new j();
      AppMethodBeat.o(21325);
      continue;
      this.mOt = new n();
      AppMethodBeat.o(21325);
      continue;
      this.mOt = new a();
      AppMethodBeat.o(21325);
    }
  }

  public final void a(i.a parama)
  {
    AppMethodBeat.i(21326);
    this.mOq.add(parama);
    AppMethodBeat.o(21326);
  }

  public final void b(i.a parama)
  {
    AppMethodBeat.i(21327);
    this.mOq.remove(parama);
    AppMethodBeat.o(21327);
  }

  public final void bCu()
  {
    AppMethodBeat.i(21328);
    if (this.mOt == null)
    {
      ab.f("MicroMsg.MediaQueryService", "media query not init, init again");
      bCt();
    }
    e.bCa().W(new l.1(this));
    AppMethodBeat.o(21328);
  }

  public final void g(String paramString, int paramInt, long paramLong)
  {
    AppMethodBeat.i(21329);
    if (this.mOt == null)
    {
      ab.f("MicroMsg.MediaQueryService", "media query not init, init again");
      bCt();
    }
    e.bCa().bCn().removeCallbacksAndMessages(null);
    this.mOt.bBT();
    g localg = e.bCa();
    paramString = new l.2(this, paramString, paramInt, paramLong);
    localg.bCn().post(paramString);
    AppMethodBeat.o(21329);
  }

  public final void wq(int paramInt)
  {
    AppMethodBeat.i(21324);
    this.mOu = paramInt;
    bCt();
    AppMethodBeat.o(21324);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.l
 * JD-Core Version:    0.6.2
 */