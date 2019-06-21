package com.tencent.mm.plugin.scanner.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class BaseScanUI$20$1
  implements n.c
{
  BaseScanUI$20$1(BaseScanUI.20 param20)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(138476);
    if (this.qca.qbZ != null)
      paraml.hi(1, 2131302914);
    paraml.hi(0, 2131296412);
    if (i.cig())
    {
      paraml.hi(2, 2131302742);
      ab.i("MicroMsg.scanner.BaseScanUI", "show history list");
    }
    AppMethodBeat.o(138476);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.20.1
 * JD-Core Version:    0.6.2
 */