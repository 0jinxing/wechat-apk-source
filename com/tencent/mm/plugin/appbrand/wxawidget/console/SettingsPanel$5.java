package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsPanel$5
  implements View.OnClickListener
{
  SettingsPanel$5(SettingsPanel paramSettingsPanel)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(11194);
    if (SettingsPanel.d(this.jqk) != null)
      SettingsPanel.d(this.jqk).onClick(paramView);
    AppMethodBeat.o(11194);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.SettingsPanel.5
 * JD-Core Version:    0.6.2
 */