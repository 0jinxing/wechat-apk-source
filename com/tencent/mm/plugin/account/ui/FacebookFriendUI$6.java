package com.tencent.mm.plugin.account.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FacebookFriendUI$6
  implements d.a
{
  FacebookFriendUI$6(FacebookFriendUI paramFacebookFriendUI)
  {
  }

  public final void mT(int paramInt)
  {
    AppMethodBeat.i(124812);
    if (paramInt > 0)
    {
      FacebookFriendUI.d(this.gBf).setVisibility(8);
      AppMethodBeat.o(124812);
    }
    while (true)
    {
      return;
      FacebookFriendUI.d(this.gBf).setVisibility(0);
      AppMethodBeat.o(124812);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookFriendUI.6
 * JD-Core Version:    0.6.2
 */