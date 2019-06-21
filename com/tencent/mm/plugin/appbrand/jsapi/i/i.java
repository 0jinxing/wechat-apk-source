package com.tencent.mm.plugin.appbrand.jsapi.i;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.DiscoveryListener;
import android.text.TextUtils;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.l.p;
import com.tencent.mm.plugin.appbrand.l.p.1;
import com.tencent.mm.plugin.appbrand.l.p.b;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public final class i extends a<c>
{
  public static final int CTRL_INDEX = 529;
  public static final String NAME = "operateLocalServicesScan";
  final Map<String, i.a> gPL;

  public i()
  {
    AppMethodBeat.i(108072);
    this.gPL = new ConcurrentHashMap();
    AppMethodBeat.o(108072);
  }

  static String k(c paramc, String paramString)
  {
    AppMethodBeat.i(108074);
    paramc = paramc.getAppId() + "#" + paramString;
    AppMethodBeat.o(108074);
    return paramc;
  }

  public final void a(c paramc, JSONObject arg2, int paramInt)
  {
    AppMethodBeat.i(108073);
    ??? = ???.optString("action");
    d.i("MicroMsg.JsApiOperateLocalServicesScan", "action = ".concat(String.valueOf(???)));
    if (TextUtils.equals("start", (CharSequence)???))
    {
      ??? = ???.optString("serviceType");
      if (TextUtils.isEmpty(???))
      {
        paramc.M(paramInt, j("fail:invalid param", null));
        AppMethodBeat.o(108073);
      }
    }
    while (true)
    {
      return;
      Object localObject2;
      synchronized (this.gPL)
      {
        localObject2 = this.gPL.keySet().iterator();
        while (true)
        {
          p localp;
          NsdManager localNsdManager;
          if (((Iterator)localObject2).hasNext())
            if (((String)((Iterator)localObject2).next()).contains(paramc.getAppId()))
            {
              paramc.M(paramInt, j("fail:scan task already exist", null));
              AppMethodBeat.o(108073);
              break;
            }
        }
        ??? = new i.a(this, paramc);
        ((i.a)???).hRN.set(paramInt);
        this.gPL.put(k(paramc, ???), ???);
        localp = p.ipp;
        localNsdManager = p.aIN();
        localObject2 = new p.1(localp, (p.b)???);
        localp.ipq.put(???, localObject2);
        localNsdManager.discoverServices(???, 1, (NsdManager.DiscoveryListener)localObject2);
        al.n(new i.1(this, paramc, ???, (i.a)???), 30000L);
        AppMethodBeat.o(108073);
      }
      if (TextUtils.equals("stop", (CharSequence)???))
        synchronized (this.gPL)
        {
          ??? = this.gPL.values().iterator();
          for (int i = 1; ((Iterator)???).hasNext(); i = 0)
          {
            localObject2 = (i.a)((Iterator)???).next();
            ((i.a)localObject2).hRO.set(paramInt);
            p.ipp.a((p.b)localObject2);
          }
          if (i != 0)
            paramc.M(paramInt, j("fail:task not found", null));
          this.gPL.clear();
          AppMethodBeat.o(108073);
        }
      paramc.M(paramInt, j("fail:invalid param", null));
      AppMethodBeat.o(108073);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.i
 * JD-Core Version:    0.6.2
 */