package com.tencent.mm.ui.bizchat;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.q;

final class BizChatroomInfoUI$4
  implements Runnable
{
  BizChatroomInfoUI$4(BizChatroomInfoUI paramBizChatroomInfoUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30200);
    View localView = ((com.tencent.mm.ui.base.preference.a)BizChatroomInfoUI.a(this.yFp)).a(this.eiV, this.yFp.nDp);
    if (localView != null)
      com.tencent.mm.ui.g.a.a(this.yFp.mController.ylL, localView);
    AppMethodBeat.o(30200);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatroomInfoUI.4
 * JD-Core Version:    0.6.2
 */