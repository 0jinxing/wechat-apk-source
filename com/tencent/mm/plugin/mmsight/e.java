package com.tencent.mm.plugin.mmsight;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.y.a;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.model.m;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import java.util.HashMap;

public class e
  implements at
{
  private m osT;
  private c osU;
  private c osV;

  public e()
  {
    AppMethodBeat.i(76431);
    this.osT = new m();
    this.osU = new e.1(this);
    this.osV = new e.2(this);
    AppMethodBeat.o(76431);
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(76432);
    o.alq().a(this.osT);
    a.xxA.b(this.osV);
    a.xxA.c(this.osU);
    AppMethodBeat.o(76432);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(76433);
    o.alq().b(this.osT);
    a.xxA.d(this.osV);
    j.owk.WY();
    a.xxA.d(this.osU);
    AppMethodBeat.o(76433);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.e
 * JD-Core Version:    0.6.2
 */