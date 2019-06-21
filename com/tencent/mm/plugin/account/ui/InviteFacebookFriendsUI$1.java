package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.o.b;

final class InviteFacebookFriendsUI$1
  implements o.b
{
  InviteFacebookFriendsUI$1(InviteFacebookFriendsUI paramInviteFacebookFriendsUI)
  {
  }

  public final void apo()
  {
  }

  public final void app()
  {
  }

  public final void apq()
  {
  }

  public final void apr()
  {
  }

  public final boolean vN(String paramString)
  {
    return false;
  }

  public final void vO(String paramString)
  {
    AppMethodBeat.i(124871);
    InviteFacebookFriendsUI.a(this.gBw, bo.vA(paramString));
    paramString = this.gBw;
    if (paramString.gBv != null)
    {
      InviteFacebookFriendsUI.a locala = paramString.gBv;
      locala.gtz = bo.vA(paramString.gtX.trim());
      locala.bIf();
      locala.KC();
    }
    AppMethodBeat.o(124871);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.InviteFacebookFriendsUI.1
 * JD-Core Version:    0.6.2
 */