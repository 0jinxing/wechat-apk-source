package com.tencent.mm.plugin.remittance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.e.c;

final class d$1
  implements e.c
{
  d$1(d paramd, e.c paramc)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(44816);
    ab.i("MicroMsg.RemindCollectionDialog", "onDialogClick() bOk:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (this.pQN != null)
      this.pQN.d(paramBoolean, paramString);
    AppMethodBeat.o(44816);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.d.1
 * JD-Core Version:    0.6.2
 */