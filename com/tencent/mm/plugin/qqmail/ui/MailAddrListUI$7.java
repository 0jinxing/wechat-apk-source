package com.tencent.mm.plugin.qqmail.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class MailAddrListUI$7
  implements MenuItem.OnMenuItemClickListener
{
  MailAddrListUI$7(MailAddrListUI paramMailAddrListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(68317);
    MailAddrListUI.a locala = MailAddrListUI.e(this.pyp);
    paramMenuItem = new ArrayList();
    Iterator localIterator = locala.pys.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramMenuItem.add(locala.pys.get(str));
    }
    ComposeUI.cH(paramMenuItem);
    this.pyp.setResult(-1);
    this.pyp.finish();
    AppMethodBeat.o(68317);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrListUI.7
 * JD-Core Version:    0.6.2
 */