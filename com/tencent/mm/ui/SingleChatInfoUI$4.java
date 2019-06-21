package com.tencent.mm.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.MMPreference;

final class SingleChatInfoUI$4
  implements Runnable
{
  SingleChatInfoUI$4(SingleChatInfoUI paramSingleChatInfoUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29869);
    View localView = ((com.tencent.mm.ui.base.preference.a)SingleChatInfoUI.b(this.yqm)).a(this.eiV, this.yqm.nDp);
    if (localView != null)
      com.tencent.mm.ui.g.a.a(this.yqm.mController.ylL, localView);
    AppMethodBeat.o(29869);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.SingleChatInfoUI.4
 * JD-Core Version:    0.6.2
 */