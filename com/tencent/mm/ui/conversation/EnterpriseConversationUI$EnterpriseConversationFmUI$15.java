package com.tencent.mm.ui.conversation;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.g;
import com.tencent.mm.ui.tools.k;

final class EnterpriseConversationUI$EnterpriseConversationFmUI$15
  implements MenuItem.OnMenuItemClickListener
{
  EnterpriseConversationUI$EnterpriseConversationFmUI$15(EnterpriseConversationUI.EnterpriseConversationFmUI paramEnterpriseConversationFmUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(34435);
    if (EnterpriseConversationUI.EnterpriseConversationFmUI.d(this.zut) != null)
    {
      EnterpriseConversationUI.EnterpriseConversationFmUI.d(this.zut).dismiss();
      EnterpriseConversationUI.EnterpriseConversationFmUI.a(this.zut, null);
    }
    EnterpriseConversationUI.EnterpriseConversationFmUI.a(this.zut, new k(this.zut.getContext()));
    EnterpriseConversationUI.EnterpriseConversationFmUI.d(this.zut).rBl = new n.c()
    {
      public final void a(l paramAnonymousl)
      {
        AppMethodBeat.i(34433);
        if (EnterpriseConversationUI.EnterpriseConversationFmUI.e(EnterpriseConversationUI.EnterpriseConversationFmUI.15.this.zut) == 1)
        {
          paramAnonymousl.ax(2, 2131299240, 2131230733);
          g.t(EnterpriseConversationUI.EnterpriseConversationFmUI.15.this.zut.getContext(), EnterpriseConversationUI.EnterpriseConversationFmUI.c(EnterpriseConversationUI.EnterpriseConversationFmUI.15.this.zut), 5);
        }
        paramAnonymousl.ax(3, 2131298663, 2131231770);
        paramAnonymousl.ax(4, 2131299221, 2131230732);
        paramAnonymousl.ax(5, 2131296398, 2131230759);
        AppMethodBeat.o(34433);
      }
    };
    EnterpriseConversationUI.EnterpriseConversationFmUI.d(this.zut).rBm = new EnterpriseConversationUI.EnterpriseConversationFmUI.15.2(this);
    EnterpriseConversationUI.EnterpriseConversationFmUI.d(this.zut).gP();
    g.ew(EnterpriseConversationUI.EnterpriseConversationFmUI.c(this.zut), 1);
    AppMethodBeat.o(34435);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI.15
 * JD-Core Version:    0.6.2
 */