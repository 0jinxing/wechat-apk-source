package com.tencent.mm.plugin.card.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.b.k;
import com.tencent.mm.plugin.card.d.d.a;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.g;
import java.util.ArrayList;
import java.util.List;

final class CardNewMsgUI$8 extends d.a
{
  CardNewMsgUI$8(CardNewMsgUI paramCardNewMsgUI)
  {
  }

  public final void bdj()
  {
    AppMethodBeat.i(88599);
    k localk = am.bba();
    if (localk.kbM.size() != 0)
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(localk.kbM);
      for (int i = 0; i < localArrayList.size(); i++)
      {
        g localg = (g)localArrayList.get(i);
        if (localg != null)
        {
          localk.kbM.remove(localg);
          k.d(localg);
        }
      }
      localArrayList.clear();
    }
    CardNewMsgUI.g(this.kmV);
    CardNewMsgUI.a(this.kmV).a(null, null);
    AppMethodBeat.o(88599);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardNewMsgUI.8
 * JD-Core Version:    0.6.2
 */