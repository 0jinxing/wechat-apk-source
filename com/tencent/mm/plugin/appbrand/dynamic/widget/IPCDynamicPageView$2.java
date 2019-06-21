package com.tencent.mm.plugin.appbrand.dynamic.widget;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.h.b;
import com.tencent.mm.plugin.appbrand.dynamic.a.2;
import com.tencent.mm.plugin.appbrand.dynamic.a.b;
import com.tencent.mm.plugin.appbrand.dynamic.e;
import com.tencent.mm.plugin.appbrand.dynamic.i;
import com.tencent.mm.plugin.appbrand.dynamic.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.Map;

final class IPCDynamicPageView$2
  implements Runnable
{
  IPCDynamicPageView$2(IPCDynamicPageView paramIPCDynamicPageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(11038);
    Object localObject1 = IPCDynamicPageView.e(this.hpw);
    if (bo.isNullOrNil((String)localObject1))
    {
      ab.i("MicroMsg.IPCDynamicPageView", "detach failed, id is null or nil.");
      AppMethodBeat.o(11038);
      return;
    }
    IPCDynamicPageView.b(this.hpw, true);
    com.tencent.mm.plugin.appbrand.dynamic.a locala = IPCDynamicPageView.f(this.hpw);
    label84: Object localObject2;
    if ((localObject1 == null) || (((String)localObject1).length() == 0))
    {
      ab.v("MicroMsg.DynamicIPCJsBridge", "detach(%s) failed, id is null or nil.", new Object[] { Integer.valueOf(locala.hashCode()) });
      localObject2 = e.azz();
      if (!bo.isNullOrNil((String)localObject1))
        break label291;
      ab.w("MicroMsg.DynamicPageViewMgr", "remove view from manager failed, key is null or nil.");
    }
    while (true)
    {
      this.hpw.cleanup();
      IPCDynamicPageView.a(this.hpw, null);
      IPCDynamicPageView.a(this.hpw, null);
      IPCDynamicPageView.a(this.hpw, null);
      IPCDynamicPageView.a(this.hpw, false);
      IPCDynamicPageView.d(this.hpw).aye();
      IPCDynamicPageView.d(this.hpw).setTraceId(null);
      AppMethodBeat.o(11038);
      break;
      ab.i("MicroMsg.DynamicIPCJsBridge", "detach(%s, id : %s)", new Object[] { Integer.valueOf(locala.hashCode()), localObject1 });
      localObject2 = new Bundle();
      ((Bundle)localObject2).putString("id", (String)localObject1);
      f.a(i.azC().zV((String)localObject1), (Parcelable)localObject2, a.b.class, new a.2(locala, (String)localObject1));
      localObject2 = j.azE();
      if (!((j)localObject2).hlB.containsKey(localObject1))
      {
        b.w("WidgetReporter_14443", "OnDettach but no keylist found, widgetId[%s]", new Object[] { localObject1 });
        break label84;
      }
      ((j)localObject2).hlB.remove(localObject1);
      break label84;
      label291: localObject1 = (WeakReference)((e)localObject2).hlz.remove(localObject1);
      if (localObject1 != null)
        ((WeakReference)localObject1).get();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView.2
 * JD-Core Version:    0.6.2
 */