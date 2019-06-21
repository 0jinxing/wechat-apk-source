package com.tencent.mm.plugin.appbrand.dynamic.widget;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.plugin.appbrand.dynamic.a.e;
import com.tencent.mm.plugin.appbrand.dynamic.i;

final class IPCDynamicPageView$6
  implements Runnable
{
  IPCDynamicPageView$6(IPCDynamicPageView paramIPCDynamicPageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(11042);
    IPCDynamicPageView.f(this.hpw);
    String str = IPCDynamicPageView.e(this.hpw);
    Bundle localBundle = new Bundle();
    localBundle.putString("id", str);
    f.a(i.azC().zV(str), localBundle, a.e.class, null);
    AppMethodBeat.o(11042);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView.6
 * JD-Core Version:    0.6.2
 */