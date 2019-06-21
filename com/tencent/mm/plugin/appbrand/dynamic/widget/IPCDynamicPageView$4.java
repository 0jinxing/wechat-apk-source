package com.tencent.mm.plugin.appbrand.dynamic.widget;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.canvas.d;
import com.tencent.mm.plugin.appbrand.dynamic.a.a;
import com.tencent.mm.plugin.appbrand.dynamic.i;
import com.tencent.mm.plugin.appbrand.dynamic.j.b;

final class IPCDynamicPageView$4
  implements Runnable
{
  IPCDynamicPageView$4(IPCDynamicPageView paramIPCDynamicPageView, Bundle paramBundle, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(11040);
    String str1 = "";
    if (this.hkY != null)
      str1 = this.hkY.getString("cache_key", "");
    u.i("MicroMsg.IPCDynamicPageView", "prepare(%s, %s)", new Object[] { this.val$id, this.val$appId });
    IPCDynamicPageView.a(this.hpw, b.Am(this.val$id));
    if (IPCDynamicPageView.g(this.hpw) == null)
      IPCDynamicPageView.a(this.hpw, new com.tencent.mm.plugin.appbrand.widget.e());
    IPCDynamicPageView.g(this.hpw).field_id = this.val$id;
    IPCDynamicPageView.g(this.hpw).field_cacheKey = str1;
    IPCDynamicPageView.g(this.hpw).field_appId = u.pr(IPCDynamicPageView.e(this.hpw));
    this.hpw.getDrawContext().eIo.j("id", this.val$id);
    com.tencent.mm.plugin.appbrand.dynamic.e.azz().b(this.val$id, this.hpw);
    if (this.hkY != null)
      this.hkY.putBundle("__env_args", IPCDynamicPageView.b(this.hpw, this.hkY));
    IPCDynamicPageView.f(this.hpw);
    String str2 = this.val$id;
    str1 = this.val$appId;
    Bundle localBundle1 = this.hkY;
    Bundle localBundle2 = new Bundle();
    localBundle2.putString("id", str2);
    localBundle2.putString("appId", str1);
    localBundle2.putBundle("extData", localBundle1);
    u.i("MicroMsg.DynamicIPCJsBridge", "before IPCInvoke_AttachTo invoke", new Object[0]);
    f.a(i.azC().zV(str2), localBundle2, a.a.class, null);
    AppMethodBeat.o(11040);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView.4
 * JD-Core Version:    0.6.2
 */