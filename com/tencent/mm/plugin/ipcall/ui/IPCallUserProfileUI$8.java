package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.applet.a;
import java.util.LinkedList;

final class IPCallUserProfileUI$8
  implements View.OnClickListener
{
  IPCallUserProfileUI$8(IPCallUserProfileUI paramIPCallUserProfileUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22380);
    h.pYm.e(12766, new Object[] { Integer.valueOf(3) });
    a locala = new a(this.nGq, new IPCallUserProfileUI.8.1(this));
    paramView = new LinkedList();
    paramView.add(Integer.valueOf(86));
    locala.vjI = new IPCallUserProfileUI.8.2(this);
    locala.b(IPCallUserProfileUI.c(this.nGq), paramView, true);
    AppMethodBeat.o(22380);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.8
 * JD-Core Version:    0.6.2
 */