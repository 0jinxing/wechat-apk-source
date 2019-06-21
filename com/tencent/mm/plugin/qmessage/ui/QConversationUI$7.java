package com.tencent.mm.plugin.qmessage.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.g;

final class QConversationUI$7
  implements MMSlideDelView.g
{
  QConversationUI$7(QConversationUI paramQConversationUI)
  {
  }

  public final void q(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(24133);
    QConversationUI.c(this.ptk).performItemClick(paramView, paramInt1, paramInt2);
    AppMethodBeat.o(24133);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.QConversationUI.7
 * JD-Core Version:    0.6.2
 */