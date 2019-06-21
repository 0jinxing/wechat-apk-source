package com.tencent.mm.plugin.bottle.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMSlideDelView.f;

final class BottleConversationUI$5
  implements MMSlideDelView.f
{
  BottleConversationUI$5(BottleConversationUI paramBottleConversationUI)
  {
  }

  public final void bN(Object paramObject)
  {
    AppMethodBeat.i(18560);
    if (paramObject == null)
    {
      ab.e("MicroMsg.Bottle.BottleConversationUI", "onItemDel object null");
      AppMethodBeat.o(18560);
    }
    while (true)
    {
      return;
      BottleConversationUI.a(this.jKb, paramObject.toString());
      AppMethodBeat.o(18560);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.ui.BottleConversationUI.5
 * JD-Core Version:    0.6.2
 */