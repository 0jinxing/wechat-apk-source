package com.tencent.mm.plugin.fts.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.aj;
import com.tencent.mm.g.a.aj.b;

final class FTSAddFriendUI$7
  implements Runnable
{
  FTSAddFriendUI$7(FTSAddFriendUI paramFTSAddFriendUI, aj paramaj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(61731);
    FTSAddFriendUI.d(this.mIb);
    if (!this.mIe.cti.ctn)
      FTSAddFriendUI.b(this.mIb, -1);
    while (true)
    {
      FTSAddFriendUI.h(this.mIb);
      AppMethodBeat.o(61731);
      return;
      FTSAddFriendUI.b(this.mIb, 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSAddFriendUI.7
 * JD-Core Version:    0.6.2
 */