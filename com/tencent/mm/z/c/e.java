package com.tencent.mm.z.c;

import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.z.d.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class e
{
  private volatile boolean apg;
  public String eIq;
  public c eIr;
  public f eIs;
  public com.tencent.mm.z.b.d eIt;
  private volatile boolean eIu;
  public e.a eIv;

  public final void QA()
  {
    AppMethodBeat.i(115314);
    if (!this.eIu)
      AppMethodBeat.o(115314);
    while (true)
    {
      return;
      ab.v("MicroMsg.MiniJsBridge", "onResume(%s)", new Object[] { this.eIq });
      this.eIt.resume();
      this.eIu = false;
      if (this.eIv != null)
        this.eIv.I(this.eIq, 2);
      AppMethodBeat.o(115314);
    }
  }

  public final v.b Qy()
  {
    return this.eIr.eIh.eIo;
  }

  public final void Qz()
  {
    AppMethodBeat.i(115313);
    if (this.eIu)
      AppMethodBeat.o(115313);
    while (true)
    {
      return;
      ab.v("MicroMsg.MiniJsBridge", "onPause(%s)", new Object[] { this.eIq });
      this.eIu = true;
      this.eIt.pause();
      if (this.eIv != null)
        this.eIv.I(this.eIq, 3);
      AppMethodBeat.o(115313);
    }
  }

  public final boolean R(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(115310);
    f localf = this.eIs;
    Object localObject = localf.eIw.lq(paramString1);
    if (localObject == null)
    {
      ab.i("MicroMsg.MiniJsEventDispatcher", "JsEvent(%s) do not exist.", new Object[] { paramString1 });
      AppMethodBeat.o(115310);
    }
    while (true)
    {
      return bool;
      if (!localf.eIi.jB(((com.tencent.mm.z.b.e)localObject).getIndex()))
      {
        ab.i("MicroMsg.MiniJsEventDispatcher", "JsEvent(%s) no permission.", new Object[] { paramString1 });
        AppMethodBeat.o(115310);
      }
      else
      {
        localObject = paramString2;
        if (bo.isNullOrNil(paramString2))
          localObject = "{}";
        ab.d("MicroMsg.MiniJsEventDispatcher", "dispatch, event: %s, data size: %s, srcId: %d", new Object[] { paramString1, Integer.valueOf(((String)localObject).length()), Integer.valueOf(0) });
        localf.eIt.evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler(\"%s\", %s, %s, %s)", new Object[] { paramString1, localObject, "undefined", f.QB() }), null);
        AppMethodBeat.o(115310);
        bool = true;
      }
    }
  }

  public final void a(com.tencent.mm.z.b.d paramd)
  {
    AppMethodBeat.i(115316);
    if (this.eIt != null)
    {
      ab.e("MicroMsg.MiniJsBridge", "can not initialize again.");
      AppMethodBeat.o(115316);
    }
    while (true)
    {
      return;
      this.eIt = paramd;
      AppMethodBeat.o(115316);
    }
  }

  public final boolean a(com.tencent.mm.z.b.c paramc, ValueCallback<String> paramValueCallback)
  {
    boolean bool = false;
    AppMethodBeat.i(115311);
    f localf = this.eIs;
    Object localObject = localf.eIw.lq(paramc.name);
    if (localObject == null)
    {
      ab.i("MicroMsg.MiniJsEventDispatcher", "JsEvent(%s) do not exist.", new Object[] { paramc });
      AppMethodBeat.o(115311);
    }
    while (true)
    {
      return bool;
      if (!localf.eIi.jB(((com.tencent.mm.z.b.e)localObject).getIndex()))
      {
        ab.i("MicroMsg.MiniJsEventDispatcher", "JsEvent(%s) no permission.", new Object[] { paramc });
        AppMethodBeat.o(115311);
      }
      else
      {
        localObject = paramc.toJSONObject().toString();
        ab.d("MicroMsg.MiniJsEventDispatcher", "dispatch, event: %s, data size: %s, srcId: %d", new Object[] { paramc.name, Integer.valueOf(((String)localObject).length()), Integer.valueOf(0) });
        localf.eIt.evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler(\"%s\", %s, %s, %s)", new Object[] { paramc.name, localObject, "undefined", f.QB() }), paramValueCallback);
        AppMethodBeat.o(115311);
        bool = true;
      }
    }
  }

  @JavascriptInterface
  public final String invokeHandler(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(115309);
    if (!this.apg)
    {
      paramString1 = this.eIr.eIk.Q(paramString1, "fail:JsApi core not started");
      AppMethodBeat.o(115309);
    }
    while (true)
    {
      return paramString1;
      paramString1 = this.eIr.c(paramString1, paramString2, paramInt);
      AppMethodBeat.o(115309);
    }
  }

  public final void onStart()
  {
    AppMethodBeat.i(115315);
    if (this.apg)
      AppMethodBeat.o(115315);
    while (true)
    {
      return;
      ab.v("MicroMsg.MiniJsBridge", "onStart(%s)", new Object[] { this.eIq });
      this.apg = true;
      if (this.eIv != null)
        this.eIv.I(this.eIq, 1);
      Iterator localIterator = this.eIr.eIj.eIp.values().iterator();
      while (localIterator.hasNext())
        localIterator.next();
      AppMethodBeat.o(115315);
    }
  }

  public final void onStop()
  {
    AppMethodBeat.i(115312);
    ab.v("MicroMsg.MiniJsBridge", "onStop(%s)", new Object[] { this.eIq });
    this.apg = false;
    this.eIt.cleanup();
    c localc = this.eIr;
    localc.eIk.quit();
    localc.eIh.eIo.recycle();
    if (this.eIv != null)
    {
      this.eIv.I(this.eIq, 4);
      this.eIv = null;
    }
    AppMethodBeat.o(115312);
  }

  @JavascriptInterface
  public final void publishHandler(String paramString1, String paramString2, String paramString3)
  {
    int i = 0;
    AppMethodBeat.i(115308);
    if (paramString2 == null);
    while (true)
    {
      ab.d("MicroMsg.MiniJsBridge", "publishHandler, event: %s, data size: %d", new Object[] { paramString1, Integer.valueOf(i) });
      AppMethodBeat.o(115308);
      return;
      i = paramString2.length();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.c.e
 * JD-Core Version:    0.6.2
 */