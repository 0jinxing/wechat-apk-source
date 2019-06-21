package com.tencent.mm.plugin.ipcall.ui;

import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.base.n.d;

final class IPCallUserProfileUI$7
  implements n.d
{
  IPCallUserProfileUI$7(IPCallUserProfileUI paramIPCallUserProfileUI, TextView paramTextView)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(22377);
    if (paramInt == 0)
    {
      h.pYm.e(12766, new Object[] { Integer.valueOf(4) });
      c.PB(this.nGs.getText().toString());
      Toast.makeText(this.nGq, 2131300746, 0).show();
    }
    AppMethodBeat.o(22377);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.7
 * JD-Core Version:    0.6.2
 */