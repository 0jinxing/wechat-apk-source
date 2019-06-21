package com.tencent.mm.plugin.card.ui.v2;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class CardNewBaseUI$d
  implements Runnable
{
  CardNewBaseUI$d(CardNewBaseUI paramCardNewBaseUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(89286);
    ab.i("MicroMsg.CardNewBaseUI", "remove location in task");
    CardNewBaseUI.a(this.kpV);
    AppMethodBeat.o(89286);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI.d
 * JD-Core Version:    0.6.2
 */