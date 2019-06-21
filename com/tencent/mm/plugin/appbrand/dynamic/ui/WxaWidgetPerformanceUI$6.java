package com.tencent.mm.plugin.appbrand.dynamic.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.plugin.appbrand.collector.c;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

final class WxaWidgetPerformanceUI$6
  implements MMSwitchBtn.a
{
  WxaWidgetPerformanceUI$6(WxaWidgetPerformanceUI paramWxaWidgetPerformanceUI)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(11021);
    f.a("com.tencent.mm:support", new IPCBoolean(paramBoolean), WxaWidgetPerformanceUI.c.class, null);
    if (paramBoolean)
    {
      c.yK("widget_launch");
      AppMethodBeat.o(11021);
    }
    while (true)
    {
      return;
      c.yL("widget_launch");
      AppMethodBeat.o(11021);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetPerformanceUI.6
 * JD-Core Version:    0.6.2
 */