package com.tencent.mm.plugin.account.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.ui.p.a;

final class InviteFacebookFriendsUI$3
  implements p.a
{
  InviteFacebookFriendsUI$3(InviteFacebookFriendsUI paramInviteFacebookFriendsUI, TextView paramTextView)
  {
  }

  public final void apt()
  {
    AppMethodBeat.i(124873);
    if (r.Za())
      if (InviteFacebookFriendsUI.a(this.gBw).getCount() == 0)
      {
        this.gBg.setVisibility(0);
        AppMethodBeat.o(124873);
      }
    while (true)
    {
      return;
      this.gBg.setVisibility(8);
      AppMethodBeat.o(124873);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.InviteFacebookFriendsUI.3
 * JD-Core Version:    0.6.2
 */