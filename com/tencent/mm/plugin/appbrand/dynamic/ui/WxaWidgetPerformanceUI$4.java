package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.plugin.appbrand.collector.c;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

final class WxaWidgetPerformanceUI$4
  implements MMSwitchBtn.a
{
  WxaWidgetPerformanceUI$4(WxaWidgetPerformanceUI paramWxaWidgetPerformanceUI, View paramView)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(11019);
    f.a("com.tencent.mm:support", new IPCBoolean(paramBoolean), WxaWidgetPerformanceUI.d.class, null);
    c.dG(paramBoolean);
    this.hpl.setEnabled(paramBoolean);
    this.hpj.hpg.setEnabled(paramBoolean);
    this.hpj.hph.setEnabled(paramBoolean);
    this.hpj.hpi.setEnabled(paramBoolean);
    AppMethodBeat.o(11019);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetPerformanceUI.4
 * JD-Core Version:    0.6.2
 */