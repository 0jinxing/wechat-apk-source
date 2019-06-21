package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsTagPartlyUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SnsTagPartlyUI$3(SnsTagPartlyUI paramSnsTagPartlyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(39378);
    paramMenuItem = SnsTagPartlyUI.a(this.rxH);
    boolean bool;
    SnsTagPartlyUI localSnsTagPartlyUI;
    if (!SnsTagPartlyUI.a(this.rxH).rxJ)
    {
      bool = true;
      paramMenuItem.rxJ = bool;
      localSnsTagPartlyUI = this.rxH;
      if (!SnsTagPartlyUI.a(this.rxH).rxJ)
        break label89;
    }
    label89: for (paramMenuItem = this.rxH.getString(2131296944); ; paramMenuItem = this.rxH.getString(2131303801))
    {
      localSnsTagPartlyUI.updateOptionMenuText(0, paramMenuItem);
      SnsTagPartlyUI.a(this.rxH).notifyDataSetChanged();
      AppMethodBeat.o(39378);
      return true;
      bool = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI.3
 * JD-Core Version:    0.6.2
 */