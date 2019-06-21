package com.tencent.mm.ui.conversation;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class BaseConversationUI$2
  implements View.OnClickListener
{
  BaseConversationUI$2(BaseConversationUI paramBaseConversationUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34046);
    if (BaseConversationUI.access$800(this.zqF))
      AppMethodBeat.o(34046);
    while (true)
    {
      return;
      al.af(this.zqF.startChattingRunnable);
      this.zqF.finish();
      AppMethodBeat.o(34046);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.2
 * JD-Core Version:    0.6.2
 */