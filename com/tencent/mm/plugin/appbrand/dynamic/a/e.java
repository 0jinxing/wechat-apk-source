package com.tencent.mm.plugin.appbrand.dynamic.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.l;
import com.tencent.mm.modelappbrand.l.a;
import com.tencent.mm.plugin.appbrand.appcache.j.a;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetInitializer;
import com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetDebugUI;

public final class e
  implements l
{
  boolean hmn;

  public final boolean a(String paramString, l.a parama)
  {
    AppMethodBeat.i(10764);
    boolean bool = com.tencent.mm.plugin.appbrand.dynamic.debugger.b.c(paramString, parama);
    AppMethodBeat.o(10764);
    return bool;
  }

  public final boolean abE()
  {
    return this.hmn;
  }

  public final boolean abF()
  {
    AppMethodBeat.i(10766);
    boolean bool = com.tencent.mm.sdk.a.b.dnO();
    AppMethodBeat.o(10766);
    return bool;
  }

  public final boolean b(String paramString, l.a parama)
  {
    AppMethodBeat.i(10765);
    boolean bool = com.tencent.mm.plugin.appbrand.dynamic.debugger.b.d(paramString, parama);
    AppMethodBeat.o(10765);
    return bool;
  }

  public final void bT(Context paramContext)
  {
    AppMethodBeat.i(10762);
    com.tencent.mm.plugin.appbrand.wxawidget.console.e.dr(paramContext);
    AppMethodBeat.o(10762);
  }

  public final void cA(boolean paramBoolean)
  {
    this.hmn = paramBoolean;
  }

  public final void e(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(10761);
    Intent localIntent = new Intent(paramContext, WxaWidgetDebugUI.class);
    String str = WxaWidgetInitializer.bL(paramBundle.getString("app_id"), paramBundle.getString("msg_id"));
    localIntent.putExtras(paramBundle);
    localIntent.putExtra("id", str);
    paramContext.startActivity(localIntent);
    AppMethodBeat.o(10761);
  }

  public final boolean kR(int paramInt)
  {
    AppMethodBeat.i(10763);
    boolean bool = j.a.kR(paramInt);
    AppMethodBeat.o(10763);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.a.e
 * JD-Core Version:    0.6.2
 */