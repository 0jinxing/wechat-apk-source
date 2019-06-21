package com.tencent.mm.plugin.account.friend.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class FindMContactInviteUI$12
  implements DialogInterface.OnClickListener
{
  FindMContactInviteUI$12(FindMContactInviteUI paramFindMContactInviteUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(108550);
    if (FindMContactInviteUI.j(this.gxd) == 1)
    {
      paramDialogInterface = new StringBuilder();
      g.RN();
      paramDialogInterface = paramDialogInterface.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_500_QQ,");
      g.RN();
      com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R300_500_QQ") + ",3");
    }
    while (true)
    {
      g.Rg().a(432, FindMContactInviteUI.a(this.gxd, new FindMContactInviteUI.12.1(this)));
      FindMContactInviteUI localFindMContactInviteUI = this.gxd;
      paramDialogInterface = this.gxd.mController.ylL;
      this.gxd.getString(2131297061);
      FindMContactInviteUI.a(localFindMContactInviteUI, h.b(paramDialogInterface, this.gxd.getString(2131299840), true, new FindMContactInviteUI.12.2(this)));
      FindMContactInviteUI.b(this.gxd).wc(FindMContactInviteUI.m(this.gxd));
      AppMethodBeat.o(108550);
      return;
      paramDialogInterface = new StringBuilder();
      g.RN();
      paramDialogInterface = paramDialogInterface.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_500_phone,");
      g.RN();
      com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R300_500_phone") + ",3");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI.12
 * JD-Core Version:    0.6.2
 */