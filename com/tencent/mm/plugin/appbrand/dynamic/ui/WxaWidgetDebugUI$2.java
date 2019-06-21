package com.tencent.mm.plugin.appbrand.dynamic.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.widget.a.a;
import com.tencent.mm.plugin.appbrand.widget.l;
import com.tencent.mm.plugin.appbrand.widget.m;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

final class WxaWidgetDebugUI$2
  implements MMSwitchBtn.a
{
  WxaWidgetDebugUI$2(WxaWidgetDebugUI paramWxaWidgetDebugUI)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(11011);
    this.hpe.hpd.field_openDebug = paramBoolean;
    m localm = ((a)g.K(a.class)).auR();
    l locall = this.hpe.hpd;
    if ((locall != null) && (!bo.isNullOrNil(locall.field_appId)))
    {
      locall.field_appIdHash = locall.field_appId.hashCode();
      localm.a(locall);
    }
    AppMethodBeat.o(11011);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetDebugUI.2
 * JD-Core Version:    0.6.2
 */