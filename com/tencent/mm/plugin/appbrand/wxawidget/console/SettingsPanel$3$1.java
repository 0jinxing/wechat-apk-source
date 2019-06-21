package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.picker.b;
import com.tencent.mm.ui.widget.picker.b.a;

final class SettingsPanel$3$1
  implements b.a
{
  SettingsPanel$3$1(SettingsPanel.3 param3, b paramb)
  {
  }

  public final void d(boolean paramBoolean, Object paramObject)
  {
    AppMethodBeat.i(11190);
    this.jqm.hide();
    if (paramBoolean)
      SettingsPanel.b(this.jqn.jqk).setText((CharSequence)paramObject);
    SettingsPanel.a(this.jqn.jqk, this.jqm.dLl());
    AppMethodBeat.o(11190);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.SettingsPanel.3.1
 * JD-Core Version:    0.6.2
 */