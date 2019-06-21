package com.tencent.mm.plugin.appbrand.dynamic.d.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.dynamic.h.d;
import com.tencent.mm.plugin.appbrand.r.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.z.b.b.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  implements com.tencent.mm.z.c.b
{
  private Handler bOB;
  public String eIq;
  public com.tencent.mm.plugin.appbrand.dynamic.i.a hnl;
  private ae<String, JSONObject> hnm;

  public c()
  {
    AppMethodBeat.i(10871);
    HandlerThread localHandlerThread = new HandlerThread("JsApiExecutor-Thread:" + hashCode());
    localHandlerThread.start();
    this.bOB = new Handler(localHandlerThread.getLooper());
    this.hnm = new c.1(this);
    AppMethodBeat.o(10871);
  }

  final JSONObject Af(String paramString)
  {
    AppMethodBeat.i(10875);
    paramString = (JSONObject)this.hnm.get(paramString);
    AppMethodBeat.o(10875);
    return paramString;
  }

  public final String Q(String paramString1, String paramString2)
  {
    AppMethodBeat.i(10876);
    HashMap localHashMap = new HashMap();
    localHashMap.put("errMsg", paramString1 + ":" + paramString2);
    paramString1 = new JSONObject(localHashMap).toString();
    AppMethodBeat.o(10876);
    return paramString1;
  }

  public final String a(com.tencent.mm.z.c.a parama, com.tencent.mm.z.d.a parama1, com.tencent.mm.z.b.b paramb, String paramString, b.a parama2)
  {
    AppMethodBeat.i(10873);
    String str = paramb.name;
    if (!parama1.jB(paramb.index))
    {
      u.i("MicroMsg.DefaultJsApiExecutor", "JsApiFunc(%s) no permission.", new Object[] { str });
      parama = Q(str, "fail:access denied");
      AppMethodBeat.o(10873);
    }
    boolean bool;
    while (true)
    {
      return parama;
      parama1 = n.gv(System.nanoTime());
      bool = d.yN(str);
      com.tencent.mm.plugin.appbrand.collector.c.d("jsapi_draw_canvas", parama1, "start_jsapi_invoke", bool);
      com.tencent.mm.plugin.appbrand.collector.c.bE(parama1, "after_draw_actions");
      if (!(paramb instanceof b))
        break label160;
      parama1 = Af(paramString);
      if (parama1 != null)
        break;
      parama = Q(str, "fail:invalid data");
      AppMethodBeat.o(10873);
    }
    for (parama = paramb.a(parama, parama1, parama2); ; parama = "")
    {
      if (this.hnl != null)
        this.hnl.Al(str);
      AppMethodBeat.o(10873);
      break;
      label160: this.bOB.post(new c.2(this, parama1, bool, paramString, parama2, str, paramb, parama));
    }
  }

  public final String lp(String paramString)
  {
    AppMethodBeat.i(10872);
    ab.i("MicroMsg.DefaultJsApiExecutor", "JsApiFunc(%s) do not exist.", new Object[] { paramString });
    paramString = Q(paramString, "fail:not supported");
    AppMethodBeat.o(10872);
    return paramString;
  }

  public final void quit()
  {
    AppMethodBeat.i(10874);
    this.bOB.getLooper().quit();
    if (this.hnl != null)
      this.hnl.IF();
    com.tencent.mm.plugin.appbrand.dynamic.d.b.a.Ah(this.eIq);
    u.v("MicroMsg.DefaultJsApiExecutor", "cache perf hit %d, miss %d, hit rate  " + (float)(this.hnm.hitCount() * 1.0D / (this.hnm.hitCount() + this.hnm.missCount())), new Object[] { Integer.valueOf(this.hnm.hitCount()), Integer.valueOf(this.hnm.missCount()) });
    AppMethodBeat.o(10874);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.a.c
 * JD-Core Version:    0.6.2
 */