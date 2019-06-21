package com.tencent.mm.plugin.account.friend.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al.a;

final class FindMContactAddUI$6
  implements al.a
{
  FindMContactAddUI$6(FindMContactAddUI paramFindMContactAddUI)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(108518);
    try
    {
      FindMContactAddUI.a(this.gxb, com.tencent.mm.pluginsdk.a.cJ(this.gxb));
      FindMContactAddUI.c(this.gxb).gsD = FindMContactAddUI.d(this.gxb);
      FindMContactAddUI.c(this.gxb).r(((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getFriendData());
      AppMethodBeat.o(108518);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.FindMContactAddUI", localException, "", new Object[0]);
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(108517);
    if (FindMContactAddUI.a(this.gxb) != null)
    {
      FindMContactAddUI.a(this.gxb).dismiss();
      FindMContactAddUI.b(this.gxb);
    }
    FindMContactAddUI.c(this.gxb).notifyDataSetChanged();
    AppMethodBeat.o(108517);
    return false;
  }

  public final String toString()
  {
    AppMethodBeat.i(108519);
    String str = super.toString() + "|listMFriendData";
    AppMethodBeat.o(108519);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI.6
 * JD-Core Version:    0.6.2
 */