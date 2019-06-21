package com.tencent.mm.plugin.account.bind.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MobileFriendUI$15
  implements b.a
{
  MobileFriendUI$15(MobileFriendUI paramMobileFriendUI)
  {
  }

  public final void mT(int paramInt)
  {
    AppMethodBeat.i(13733);
    if (paramInt > 0)
    {
      MobileFriendUI.g(this.gtZ).setVisibility(8);
      AppMethodBeat.o(13733);
    }
    while (true)
    {
      return;
      MobileFriendUI.g(this.gtZ).setVisibility(0);
      AppMethodBeat.o(13733);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.15
 * JD-Core Version:    0.6.2
 */