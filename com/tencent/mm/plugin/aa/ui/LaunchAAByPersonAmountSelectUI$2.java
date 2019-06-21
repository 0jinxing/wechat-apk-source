package com.tencent.mm.plugin.aa.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import java.util.Map;

final class LaunchAAByPersonAmountSelectUI$2
  implements MenuItem.OnMenuItemClickListener
{
  LaunchAAByPersonAmountSelectUI$2(LaunchAAByPersonAmountSelectUI paramLaunchAAByPersonAmountSelectUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(40789);
    if ((LaunchAAByPersonAmountSelectUI.c(this.gou) != null) && (LaunchAAByPersonAmountSelectUI.c(this.gou).size() > 0))
      h.a(this.gou, this.gou.getString(2131296374), null, this.gou.getString(2131296378), this.gou.getString(2131296377), false, new LaunchAAByPersonAmountSelectUI.2.1(this), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(40788);
          LaunchAAByPersonAmountSelectUI.2.this.gou.finish();
          AppMethodBeat.o(40788);
        }
      });
    while (true)
    {
      AppMethodBeat.o(40789);
      return true;
      this.gou.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI.2
 * JD-Core Version:    0.6.2
 */