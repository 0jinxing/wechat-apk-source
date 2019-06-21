package com.tencent.mm.plugin.qmessage.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.c;

final class QConversationUI$6
  implements MMSlideDelView.c
{
  QConversationUI$6(QConversationUI paramQConversationUI)
  {
  }

  public final int cZ(View paramView)
  {
    AppMethodBeat.i(24132);
    int i = QConversationUI.c(this.ptk).getPositionForView(paramView);
    AppMethodBeat.o(24132);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.QConversationUI.6
 * JD-Core Version:    0.6.2
 */