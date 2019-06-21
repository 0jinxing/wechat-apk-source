package com.tencent.mm.plugin.account.friend.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.i;

final class FindMContactInviteUI$7
  implements View.OnClickListener
{
  FindMContactInviteUI$7(FindMContactInviteUI paramFindMContactInviteUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(108544);
    paramView = new StringBuilder();
    g.RN();
    paramView = paramView.append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.gxd.getClass().getName()).append(",R300_400_AddAllButton,");
    g.RN();
    com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R300_300_AddAllButton") + ",3");
    if (FindMContactInviteUI.d(this.gxd) == 2)
    {
      FindMContactInviteUI.b(this.gxd).dl(true);
      FindMContactInviteUI.b(this.gxd).notifyDataSetChanged();
      FindMContactInviteUI.e(this.gxd).setVisibility(8);
      if (FindMContactInviteUI.f(this.gxd) == null)
        break label244;
      FindMContactInviteUI.f(this.gxd).setVisibility(0);
      AppMethodBeat.o(108544);
    }
    while (true)
    {
      return;
      if (FindMContactInviteUI.d(this.gxd) == 1)
      {
        FindMContactInviteUI.b(this.gxd).dl(true);
        FindMContactInviteUI.b(this.gxd).notifyDataSetChanged();
        FindMContactInviteUI.h(this.gxd);
        AppMethodBeat.o(108544);
      }
      else
      {
        FindMContactInviteUI.b(this.gxd).dl(true);
        FindMContactInviteUI.b(this.gxd).notifyDataSetChanged();
        FindMContactInviteUI.e(this.gxd).setVisibility(8);
        if (FindMContactInviteUI.f(this.gxd) != null)
          FindMContactInviteUI.f(this.gxd).setVisibility(0);
        label244: AppMethodBeat.o(108544);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI.7
 * JD-Core Version:    0.6.2
 */