package com.tencent.mm.plugin.sns.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class SightUploadUI$4
  implements MenuItem.OnMenuItemClickListener
{
  SightUploadUI$4(SightUploadUI paramSightUploadUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(38587);
    AppCompatActivity localAppCompatActivity = this.rnn.mController.ylL;
    paramMenuItem = this.rnn.getString(2131303551);
    SightUploadUI.4.1 local1 = new SightUploadUI.4.1(this);
    h.a(localAppCompatActivity, null, new String[] { paramMenuItem }, null, local1);
    AppMethodBeat.o(38587);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SightUploadUI.4
 * JD-Core Version:    0.6.2
 */