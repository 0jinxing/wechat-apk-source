package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

final class SelectLabelContactUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SelectLabelContactUI$1(SelectLabelContactUI paramSelectLabelContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(33906);
    paramMenuItem = new ArrayList(SelectLabelContactUI.a(this.zpd));
    ab.i("MicroMsg.SelectLabelContactUI", "SelectUser: %s", new Object[] { paramMenuItem.toString() });
    SelectLabelContactUI.a(this.zpd, bo.c(paramMenuItem, ","));
    AppMethodBeat.o(33906);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectLabelContactUI.1
 * JD-Core Version:    0.6.2
 */