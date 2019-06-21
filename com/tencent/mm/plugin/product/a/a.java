package com.tencent.mm.plugin.product.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.plugin.product.b.d;
import java.util.HashMap;

public class a
  implements at
{
  private c pgK;
  private d pgL;
  private com.tencent.mm.plugin.product.b.a pgM;

  public a()
  {
    AppMethodBeat.i(43940);
    this.pgK = null;
    this.pgL = null;
    this.pgM = new com.tencent.mm.plugin.product.b.a();
    AppMethodBeat.o(43940);
  }

  public static a bZC()
  {
    AppMethodBeat.i(43941);
    a locala = (a)q.Y(a.class);
    AppMethodBeat.o(43941);
    return locala;
  }

  public static c bZD()
  {
    AppMethodBeat.i(43944);
    g.RN().QU();
    if (bZC().pgK == null)
      bZC().pgK = new c();
    c localc = bZC().pgK;
    AppMethodBeat.o(43944);
    return localc;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final d bZE()
  {
    AppMethodBeat.i(43945);
    g.RN().QU();
    if (this.pgL == null)
      this.pgL = new d();
    d locald = this.pgL;
    AppMethodBeat.o(43945);
    return locald;
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(43942);
    this.pgK = null;
    com.tencent.mm.sdk.b.a.xxA.c(this.pgM);
    AppMethodBeat.o(43942);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(43943);
    com.tencent.mm.sdk.b.a.xxA.d(this.pgM);
    AppMethodBeat.o(43943);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.a.a
 * JD-Core Version:    0.6.2
 */