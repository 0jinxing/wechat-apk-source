package com.tencent.mm.plugin.qmessage.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;

final class QConversationUI$12
  implements View.OnClickListener
{
  QConversationUI$12(QConversationUI paramQConversationUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24138);
    BackwardSupportUtil.c.a(QConversationUI.c(this.ptk));
    AppMethodBeat.o(24138);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.QConversationUI.12
 * JD-Core Version:    0.6.2
 */