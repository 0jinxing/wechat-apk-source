package com.tencent.mm.ui.transmit;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.n;

final class SelectConversationUI$21
  implements MenuItem.OnMenuItemClickListener
{
  SelectConversationUI$21(SelectConversationUI paramSelectConversationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(35144);
    paramMenuItem = this.zKj;
    boolean bool;
    if (!SelectConversationUI.a(this.zKj))
    {
      bool = true;
      SelectConversationUI.a(paramMenuItem, bool);
      this.zKj.dHV().qE(SelectConversationUI.a(this.zKj));
      this.zKj.zna.qE(SelectConversationUI.a(this.zKj));
      SelectConversationUI.k(this.zKj);
      paramMenuItem = SelectConversationUI.m(this.zKj);
      if (SelectConversationUI.a(this.zKj))
        break label112;
    }
    label112: for (int i = SelectConversationUI.l(this.zKj); ; i = 2131302902)
    {
      paramMenuItem.setText(i);
      AppMethodBeat.o(35144);
      return true;
      bool = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.21
 * JD-Core Version:    0.6.2
 */