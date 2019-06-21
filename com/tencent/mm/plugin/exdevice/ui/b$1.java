package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements ExdeviceLikeView.a
{
  b$1(b paramb, com.tencent.mm.plugin.exdevice.f.b.a.d paramd)
  {
  }

  public final boolean bpL()
  {
    AppMethodBeat.i(20093);
    boolean bool;
    if (b.a(this.lCO) != null)
    {
      bool = b.a(this.lCO).KJ(this.lCN.field_username);
      AppMethodBeat.o(20093);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(20093);
    }
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(20092);
    ab.i("MicroMsg.ExdeviceRankAdapter", "hy: like view clicked.after statae: %d", new Object[] { Integer.valueOf(paramInt) });
    if (b.a(this.lCO) != null)
      b.a(this.lCO).cd(this.lCN.field_username, paramInt);
    AppMethodBeat.o(20092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.b.1
 * JD-Core Version:    0.6.2
 */