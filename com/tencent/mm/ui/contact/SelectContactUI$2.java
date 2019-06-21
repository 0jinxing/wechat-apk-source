package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class SelectContactUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SelectContactUI$2(SelectContactUI paramSelectContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    boolean bool = true;
    AppMethodBeat.i(33851);
    paramMenuItem = SelectContactUI.c(this.zoP, s.hr(SelectContactUI.a(this.zoP), 8192));
    paramMenuItem.remove(r.Yz());
    int i;
    if ((s.hr(SelectContactUI.a(this.zoP), 4096)) && (paramMenuItem.size() > 1))
    {
      i = 1;
      if (i == 0)
        break label115;
      if (!SelectContactUI.d(this.zoP))
      {
        SelectContactUI.d(this.zoP, true);
        SelectContactUI.e(this.zoP);
      }
      ab.i("MicroMsg.SelectContactUI", "Create the chatroom");
      AppMethodBeat.o(33851);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label115: bool = SelectContactUI.b(this.zoP, SelectContactUI.a(this.zoP, s.hr(SelectContactUI.a(this.zoP), 8192)));
      AppMethodBeat.o(33851);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.2
 * JD-Core Version:    0.6.2
 */