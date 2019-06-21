package com.tencent.mm.plugin.account.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.model.i;

final class FacebookFriendUI$8 extends i
{
  FacebookFriendUI$8(FacebookFriendUI paramFacebookFriendUI)
  {
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(124815);
    super.onError(paramInt, paramString);
    if (paramInt == 3)
      FacebookFriendUI.f(this.gBf);
    AppMethodBeat.o(124815);
  }

  public final void p(Bundle paramBundle)
  {
    AppMethodBeat.i(124814);
    super.p(paramBundle);
    AppMethodBeat.o(124814);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookFriendUI.8
 * JD-Core Version:    0.6.2
 */