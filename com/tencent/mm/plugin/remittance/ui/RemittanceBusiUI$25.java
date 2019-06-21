package com.tencent.mm.plugin.remittance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class RemittanceBusiUI$25
  implements ao.b.a
{
  RemittanceBusiUI$25(RemittanceBusiUI paramRemittanceBusiUI)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(44919);
    ab.i("MicroMsg.RemittanceBusiUI", "getContact %s", new Object[] { Boolean.valueOf(paramBoolean) });
    RemittanceBusiUI.j(this.pUd);
    AppMethodBeat.o(44919);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.25
 * JD-Core Version:    0.6.2
 */