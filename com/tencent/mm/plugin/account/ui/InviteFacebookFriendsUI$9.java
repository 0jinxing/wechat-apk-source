package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;

final class InviteFacebookFriendsUI$9
  implements View.OnClickListener
{
  InviteFacebookFriendsUI$9(InviteFacebookFriendsUI paramInviteFacebookFriendsUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(124880);
    BackwardSupportUtil.c.a(InviteFacebookFriendsUI.b(this.gBw));
    AppMethodBeat.o(124880);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.InviteFacebookFriendsUI.9
 * JD-Core Version:    0.6.2
 */