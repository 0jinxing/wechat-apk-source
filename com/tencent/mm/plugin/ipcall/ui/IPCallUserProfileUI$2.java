package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.plugin.report.service.h;

final class IPCallUserProfileUI$2
  implements View.OnClickListener
{
  IPCallUserProfileUI$2(IPCallUserProfileUI paramIPCallUserProfileUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22372);
    h.pYm.e(12766, new Object[] { Integer.valueOf(4) });
    c.PB(IPCallUserProfileUI.f(this.nGq));
    Toast.makeText(this.nGq, 2131300746, 0).show();
    AppMethodBeat.o(22372);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.2
 * JD-Core Version:    0.6.2
 */