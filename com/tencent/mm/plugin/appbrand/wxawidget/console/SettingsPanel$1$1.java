package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsPanel$1$1
  implements Runnable
{
  SettingsPanel$1$1(SettingsPanel.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(11187);
    Toast.makeText(this.jql.jqk.getContext(), 2131305752, 1).show();
    if (SettingsPanel.a(this.jql.jqk) != null)
      SettingsPanel.a(this.jql.jqk).run();
    AppMethodBeat.o(11187);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.SettingsPanel.1.1
 * JD-Core Version:    0.6.2
 */