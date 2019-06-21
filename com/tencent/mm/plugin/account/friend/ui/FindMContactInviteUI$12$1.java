package com.tencent.mm.plugin.account.friend.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class FindMContactInviteUI$12$1
  implements f
{
  FindMContactInviteUI$12$1(FindMContactInviteUI.12 param12)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(108549);
    if (FindMContactInviteUI.a(this.gxe.gxd) != null)
    {
      FindMContactInviteUI.a(this.gxe.gxd).dismiss();
      FindMContactInviteUI.a(this.gxe.gxd, null);
    }
    if (FindMContactInviteUI.k(this.gxe.gxd) != null)
    {
      g.Rg().b(432, FindMContactInviteUI.k(this.gxe.gxd));
      FindMContactInviteUI.a(this.gxe.gxd, null);
    }
    FindMContactInviteUI.l(this.gxe.gxd);
    AppMethodBeat.o(108549);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI.12.1
 * JD-Core Version:    0.6.2
 */