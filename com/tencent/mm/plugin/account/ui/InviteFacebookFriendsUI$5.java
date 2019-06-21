package com.tencent.mm.plugin.account.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.model.i;

final class InviteFacebookFriendsUI$5 extends i
{
  InviteFacebookFriendsUI$5(InviteFacebookFriendsUI paramInviteFacebookFriendsUI)
  {
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(124876);
    super.onError(paramInt, paramString);
    if (paramInt == 3)
      InviteFacebookFriendsUI.c(this.gBw);
    AppMethodBeat.o(124876);
  }

  public final void p(Bundle paramBundle)
  {
    AppMethodBeat.i(124875);
    super.p(paramBundle);
    AppMethodBeat.o(124875);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.InviteFacebookFriendsUI.5
 * JD-Core Version:    0.6.2
 */