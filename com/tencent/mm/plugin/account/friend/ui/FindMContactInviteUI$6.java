package com.tencent.mm.plugin.account.friend.ui;

import android.content.res.Resources;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.friend.a.i;
import com.tencent.mm.plugin.account.friend.a.i.a;

final class FindMContactInviteUI$6
  implements i.a
{
  FindMContactInviteUI$6(FindMContactInviteUI paramFindMContactInviteUI)
  {
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(108543);
    if ((FindMContactInviteUI.d(this.gxd) != 2) && (FindMContactInviteUI.d(this.gxd) == 1))
    {
      FindMContactInviteUI.e(this.gxd).setText(this.gxd.getString(2131299838));
      if (!FindMContactInviteUI.b(this.gxd).apN())
        break label240;
      if ((FindMContactInviteUI.d(this.gxd) != 1) && (FindMContactInviteUI.e(this.gxd).getVisibility() == 0) && (FindMContactInviteUI.f(this.gxd) != null))
      {
        FindMContactInviteUI.e(this.gxd).setVisibility(8);
        FindMContactInviteUI.f(this.gxd).setVisibility(0);
      }
      label116: if ((FindMContactInviteUI.b(this.gxd).getSelectCount() <= 0) || (FindMContactInviteUI.d(this.gxd) == 1))
        break label302;
      FindMContactInviteUI.g(this.gxd).setText(this.gxd.getResources().getQuantityString(2131361798, FindMContactInviteUI.b(this.gxd).getSelectCount(), new Object[] { Integer.valueOf(FindMContactInviteUI.b(this.gxd).getSelectCount()) }));
      AppMethodBeat.o(108543);
    }
    while (true)
    {
      return;
      FindMContactInviteUI.e(this.gxd).setText(this.gxd.getString(2131299837, new Object[] { Integer.valueOf(FindMContactInviteUI.b(this.gxd).getCount()) }));
      break;
      label240: if ((FindMContactInviteUI.d(this.gxd) == 1) || (FindMContactInviteUI.e(this.gxd).getVisibility() != 8) || (FindMContactInviteUI.f(this.gxd) == null))
        break label116;
      FindMContactInviteUI.e(this.gxd).setVisibility(0);
      FindMContactInviteUI.f(this.gxd).setVisibility(8);
      break label116;
      label302: FindMContactInviteUI.g(this.gxd).setText(this.gxd.getResources().getQuantityString(2131361799, FindMContactInviteUI.b(this.gxd).getCount(), new Object[] { Integer.valueOf(FindMContactInviteUI.b(this.gxd).getCount()) }));
      AppMethodBeat.o(108543);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI.6
 * JD-Core Version:    0.6.2
 */