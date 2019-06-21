package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.plugin.appbrand.collector.c;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

final class PerformancePanel$3
  implements MMSwitchBtn.a
{
  PerformancePanel$3(PerformancePanel paramPerformancePanel, View paramView)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(11175);
    f.a("com.tencent.mm:support", new IPCBoolean(paramBoolean), PerformancePanel.d.class, null);
    c.dG(paramBoolean);
    this.hpl.setEnabled(paramBoolean);
    this.jqf.hpg.setEnabled(paramBoolean);
    this.jqf.hph.setEnabled(paramBoolean);
    this.jqf.hpi.setEnabled(paramBoolean);
    AppMethodBeat.o(11175);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.PerformancePanel.3
 * JD-Core Version:    0.6.2
 */