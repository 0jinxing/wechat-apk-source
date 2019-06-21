package com.tencent.mm.plugin.appbrand.jsapi.auth;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/AppBrandAuthJSAPIConcurrentQueue;", "Lcom/tencent/mm/plugin/appbrand/jsapi/auth/AppBrandAuthJSAPIExecutorService;", "mConcurrentMaxCount", "", "(I)V", "mInFlightTasks", "Ljava/util/concurrent/atomic/AtomicInteger;", "mTaskQueue", "Ljava/util/concurrent/LinkedBlockingQueue;", "Lcom/tencent/mm/sdk/thread/runnable/KeyRunnable;", "cleanup", "", "dispatch", "task", "dispatchNext", "execute", "api", "Lcom/tencent/mm/plugin/appbrand/jsapi/auth/BaseAuthJsApi;", "component", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentWithExtra;", "data", "Lorg/json/JSONObject;", "callbackId", "schedule", "Companion", "plugin-appbrand-integration_release"})
public final class a
  implements b
{
  private static final HashMap<String, a> hBu;
  private static final b hBv;

  @Deprecated
  public static final a.a hBw;
  private final LinkedBlockingQueue<com.tencent.mm.sdk.g.d.b> hBr;
  private final AtomicInteger hBs;
  private final int hBt;

  static
  {
    AppMethodBeat.i(134653);
    hBw = new a.a((byte)0);
    hBu = new HashMap();
    hBv = (b)a.b.hBx;
    AppMethodBeat.o(134653);
  }

  public a(int paramInt)
  {
    AppMethodBeat.i(134652);
    this.hBt = paramInt;
    this.hBr = new LinkedBlockingQueue();
    this.hBs = new AtomicInteger(0);
    AppMethodBeat.o(134652);
  }

  private final void a(com.tencent.mm.sdk.g.d.b paramb)
  {
    AppMethodBeat.i(134651);
    while (true)
    {
      if (this.hBs.incrementAndGet() <= this.hBt)
      {
        ab.d("MicroMsg.AppBrandAuthJSAPIConcurrentQueue", "schedule " + paramb.getKey());
        paramb.run();
        AppMethodBeat.o(134651);
      }
      while (true)
      {
        return;
        this.hBr.offer(paramb);
        if (this.hBs.decrementAndGet() >= this.hBt)
        {
          AppMethodBeat.o(134651);
        }
        else
        {
          paramb = (com.tencent.mm.sdk.g.d.b)this.hBr.poll();
          if (paramb != null)
            break;
          AppMethodBeat.o(134651);
        }
      }
    }
  }

  public static final b u(i parami)
  {
    AppMethodBeat.i(134656);
    parami = a.a.u(parami);
    AppMethodBeat.o(134656);
    return parami;
  }

  public final void a(f paramf, h paramh, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(134650);
    j.p(paramf, "api");
    j.p(paramh, "component");
    j.p(paramJSONObject, "data");
    String str = "name[" + paramf.getName() + "], callbackId[" + paramInt + "], appId[" + paramh.getAppId() + ']';
    paramf = new a.c(this, paramh, paramf, paramJSONObject, paramInt, str);
    ab.d("MicroMsg.AppBrandAuthJSAPIConcurrentQueue", "dispatch ".concat(String.valueOf(str)));
    a((com.tencent.mm.sdk.g.d.b)paramf);
    AppMethodBeat.o(134650);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.a
 * JD-Core Version:    0.6.2
 */