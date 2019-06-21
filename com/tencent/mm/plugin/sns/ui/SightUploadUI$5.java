package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.b;
import com.tencent.mm.ui.tools.b.c;

final class SightUploadUI$5
  implements MenuItem.OnMenuItemClickListener
{
  SightUploadUI$5(SightUploadUI paramSightUploadUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(38590);
    if (this.rnn.isFinishing())
      AppMethodBeat.o(38590);
    while (true)
    {
      return false;
      SightUploadUI.a(this.rnn, SightUploadUI.a(this.rnn).getText().toString());
      int i = SightUploadUI.a(this.rnn).getPasterLen();
      paramMenuItem = c.d(SightUploadUI.a(this.rnn)).PM(b.MW());
      paramMenuItem.zIx = true;
      paramMenuItem.a(new SightUploadUI.5.1(this, i));
      AppMethodBeat.o(38590);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SightUploadUI.5
 * JD-Core Version:    0.6.2
 */