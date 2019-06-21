package com.tencent.mm.plugin.appbrand.debugger;

import a.f;
import a.f.a.a;
import a.f.b.t;
import a.f.b.v;
import a.i.k;
import a.l;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.launching.b.e;
import com.tencent.mm.sdk.platformtools.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/debugger/MockScanCodeUrl;", "Lcom/tencent/mm/plugin/appbrand/debugger/DebuggerShell$DebuggerAction;", "()V", "handler", "Lcom/tencent/mm/plugin/appbrand/launching/links/DebugCmdLinkOpener;", "getHandler", "()Lcom/tencent/mm/plugin/appbrand/launching/links/DebugCmdLinkOpener;", "handler$delegate", "Lkotlin/Lazy;", "name", "", "onAction", "", "intent", "Landroid/content/Intent;", "plugin-appbrand-integration_release"})
public final class g
  implements DebuggerShell.a
{
  private final f hjk;

  static
  {
    AppMethodBeat.i(134598);
    eQB = new k[] { (k)v.a(new t(v.aN(g.class), "handler", "getHandler()Lcom/tencent/mm/plugin/appbrand/launching/links/DebugCmdLinkOpener;")) };
    AppMethodBeat.o(134598);
  }

  public g()
  {
    AppMethodBeat.i(134600);
    this.hjk = a.g.g((a)g.a.hjl);
    AppMethodBeat.o(134600);
  }

  public final void A(Intent paramIntent)
  {
    AppMethodBeat.i(134599);
    if (paramIntent != null)
    {
      paramIntent = paramIntent.getStringExtra("url");
      if (paramIntent != null)
      {
        ((e)this.hjk.getValue()).a(ah.getContext(), paramIntent, 1011, new Bundle());
        AppMethodBeat.o(134599);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134599);
    }
  }

  public final String name()
  {
    return "MockScanCodeUrl";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.g
 * JD-Core Version:    0.6.2
 */