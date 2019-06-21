package com.tencent.mm.plugin.appbrand.dynamic.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.b;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

final class WxaWidgetSettingsUI$3
  implements MMSwitchBtn.a
{
  WxaWidgetSettingsUI$3(WxaWidgetSettingsUI paramWxaWidgetSettingsUI)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(11032);
    DebuggerInfo localDebuggerInfo1 = b.Ad(this.hpm.appId);
    DebuggerInfo localDebuggerInfo2 = localDebuggerInfo1;
    if (localDebuggerInfo1 == null)
    {
      localDebuggerInfo2 = new DebuggerInfo();
      b.a(this.hpm.appId, localDebuggerInfo2);
    }
    localDebuggerInfo2.hmD = paramBoolean;
    AppMethodBeat.o(11032);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetSettingsUI.3
 * JD-Core Version:    0.6.2
 */