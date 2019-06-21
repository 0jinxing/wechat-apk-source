package com.tencent.mm.plugin.qmessage.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.model.u;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.p.a;

final class QConversationUI$1
  implements p.a
{
  QConversationUI$1(QConversationUI paramQConversationUI)
  {
  }

  public final void apt()
  {
    AppMethodBeat.i(24126);
    QConversationUI localQConversationUI = this.ptk;
    String str = QConversationUI.a(this.ptk).Oi();
    int i = u.nR(t.fkS);
    if (i <= 0)
      localQConversationUI.setMMTitle(str);
    while (true)
    {
      QConversationUI.a(this.ptk, QConversationUI.b(this.ptk).getCount());
      AppMethodBeat.o(24126);
      return;
      localQConversationUI.setMMTitle(str + "(" + i + ")");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.QConversationUI.1
 * JD-Core Version:    0.6.2
 */