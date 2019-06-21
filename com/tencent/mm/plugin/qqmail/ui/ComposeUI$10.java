package com.tencent.mm.plugin.qqmail.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class ComposeUI$10
  implements MenuItem.OnMenuItemClickListener
{
  ComposeUI$10(ComposeUI paramComposeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(68179);
    if (((ComposeUI.a(this.pwY, false)) && (ComposeUI.a(this.pwY) == 5)) || (ComposeUI.a(this.pwY) == 6))
      h.d(this.pwY.mController.ylL, this.pwY.getString(2131301983), "", this.pwY.getString(2131301985), this.pwY.getString(2131296868), new ComposeUI.10.1(this), null);
    while (true)
    {
      AppMethodBeat.o(68179);
      return true;
      this.pwY.setResult(0);
      this.pwY.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.10
 * JD-Core Version:    0.6.2
 */