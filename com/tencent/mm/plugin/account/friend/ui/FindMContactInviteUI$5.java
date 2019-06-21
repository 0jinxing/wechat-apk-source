package com.tencent.mm.plugin.account.friend.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al.a;

final class FindMContactInviteUI$5
  implements al.a
{
  FindMContactInviteUI$5(FindMContactInviteUI paramFindMContactInviteUI)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(108541);
    try
    {
      FindMContactInviteUI.a(this.gxd, com.tencent.mm.pluginsdk.a.cJ(this.gxd));
      FindMContactInviteUI.b(this.gxd).gsD = FindMContactInviteUI.c(this.gxd);
      FindMContactInviteUI.b(this.gxd).r(((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getFriendData());
      AppMethodBeat.o(108541);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.FindMContactInviteUI", localException, "", new Object[0]);
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(108540);
    if (FindMContactInviteUI.a(this.gxd) != null)
    {
      FindMContactInviteUI.a(this.gxd).dismiss();
      FindMContactInviteUI.a(this.gxd, null);
    }
    FindMContactInviteUI.b(this.gxd).notifyDataSetChanged();
    AppMethodBeat.o(108540);
    return false;
  }

  public final String toString()
  {
    AppMethodBeat.i(108542);
    String str = super.toString() + "|listMFriendData";
    AppMethodBeat.o(108542);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI.5
 * JD-Core Version:    0.6.2
 */