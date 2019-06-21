package com.tencent.mm.plugin.appbrand.dynamic.widget;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.plugin.appbrand.dynamic.a.d;
import com.tencent.mm.plugin.appbrand.dynamic.i;

final class IPCDynamicPageView$5
  implements Runnable
{
  IPCDynamicPageView$5(IPCDynamicPageView paramIPCDynamicPageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(11041);
    IPCDynamicPageView.f(this.hpw);
    String str = IPCDynamicPageView.e(this.hpw);
    Bundle localBundle = new Bundle();
    localBundle.putString("id", str);
    f.a(i.azC().zV(str), localBundle, a.d.class, null);
    AppMethodBeat.o(11041);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView.5
 * JD-Core Version:    0.6.2
 */