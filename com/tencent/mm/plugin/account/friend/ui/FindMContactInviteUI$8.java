package com.tencent.mm.plugin.account.friend.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.friend.a.i;

final class FindMContactInviteUI$8
  implements View.OnClickListener
{
  FindMContactInviteUI$8(FindMContactInviteUI paramFindMContactInviteUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(108545);
    FindMContactInviteUI.e(this.gxd).setVisibility(0);
    FindMContactInviteUI.f(this.gxd).setVisibility(8);
    FindMContactInviteUI.b(this.gxd).dl(false);
    FindMContactInviteUI.b(this.gxd).notifyDataSetChanged();
    AppMethodBeat.o(108545);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI.8
 * JD-Core Version:    0.6.2
 */