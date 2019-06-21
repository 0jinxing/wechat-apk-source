package com.tencent.mm.plugin.qmessage.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMSlideDelView.f;

final class QConversationUI$8
  implements MMSlideDelView.f
{
  QConversationUI$8(QConversationUI paramQConversationUI)
  {
  }

  public final void bN(Object paramObject)
  {
    AppMethodBeat.i(24134);
    if (paramObject == null)
    {
      ab.e("MicroMsg.QConversationUI", "onItemDel object null");
      AppMethodBeat.o(24134);
    }
    while (true)
    {
      return;
      QConversationUI.a(this.ptk, paramObject.toString());
      AppMethodBeat.o(24134);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.QConversationUI.8
 * JD-Core Version:    0.6.2
 */