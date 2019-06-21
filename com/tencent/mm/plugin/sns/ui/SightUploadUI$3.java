package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qt;
import com.tencent.mm.sdk.b.a;

final class SightUploadUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SightUploadUI$3(SightUploadUI paramSightUploadUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(38585);
    paramMenuItem = new qt();
    paramMenuItem.cMT.type = 0;
    paramMenuItem.cMT.cMV = false;
    a.xxA.m(paramMenuItem);
    this.rnn.aqX();
    this.rnn.finish();
    AppMethodBeat.o(38585);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SightUploadUI.3
 * JD-Core Version:    0.6.2
 */