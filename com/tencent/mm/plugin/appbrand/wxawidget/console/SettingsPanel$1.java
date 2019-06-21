package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ce.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.d;
import com.tencent.mm.modelappbrand.e;

final class SettingsPanel$1
  implements View.OnClickListener
{
  SettingsPanel$1(SettingsPanel paramSettingsPanel)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(11188);
    ((e)g.K(e.class)).aby().restart();
    a.r(new SettingsPanel.1.1(this), 2000L);
    AppMethodBeat.o(11188);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.SettingsPanel.1
 * JD-Core Version:    0.6.2
 */