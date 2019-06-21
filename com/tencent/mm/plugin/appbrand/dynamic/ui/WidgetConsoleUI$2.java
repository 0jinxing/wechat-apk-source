package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class WidgetConsoleUI$2
  implements Runnable
{
  WidgetConsoleUI$2(WidgetConsoleUI paramWidgetConsoleUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(11003);
    this.hpa.setMMTitle(String.format("%s%s", new Object[] { this.hpa.getString(2131306075), this.hpb }));
    Toast.makeText(this.hpa.mController.ylL, String.format("%s%s", new Object[] { this.hpa.id, this.hpb }), 1).show();
    AppMethodBeat.o(11003);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WidgetConsoleUI.2
 * JD-Core Version:    0.6.2
 */