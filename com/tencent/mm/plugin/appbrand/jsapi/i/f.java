package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.websocket.d;
import com.tencent.mm.plugin.appbrand.jsapi.websocket.d.a;
import com.tencent.mm.plugin.appbrand.l.j;
import com.tencent.mm.plugin.appbrand.l.k;
import com.tencent.mm.plugin.appbrand.l.k.a;
import com.tencent.mm.plugin.appbrand.l.k.c;
import com.tencent.mm.plugin.appbrand.l.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends b
{
  public static final int CTRL_INDEX = 346;
  public static final String NAME = "createSocketTask";
  public static int hRA = 0;
  public static int hRB = 1;
  private static k.a hRy;
  private int hRC;
  private boolean hRD;
  private boolean hRE;
  private k.c hRz;

  public f(int paramInt, k.c paramc)
  {
    AppMethodBeat.i(108043);
    this.hRC = hRA;
    this.hRD = false;
    this.hRE = false;
    ab.i("MicroMsg.JsApiCreateSocketTask", "JsApiCreateSocketTask, programType:%d", new Object[] { Integer.valueOf(paramInt) });
    this.hRC = paramInt;
    this.hRz = paramc;
    AppMethodBeat.o(108043);
  }

  private static JSONObject a(com.tencent.mm.plugin.appbrand.t.e.f paramf)
  {
    AppMethodBeat.i(108048);
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramf.aOx();
    try
    {
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localJSONObject.put(str, paramf.Eq(str));
      }
    }
    catch (JSONException paramf)
    {
      ab.printErrStackTrace("MicroMsg.JsApiCreateSocketTask", paramf, "JSONExceptions ", new Object[0]);
      AppMethodBeat.o(108048);
    }
    return localJSONObject;
  }

  public static void a(c paramc, String paramString1, com.tencent.mm.plugin.appbrand.b.b paramb, String paramString2)
  {
    AppMethodBeat.i(108045);
    if ((paramb == com.tencent.mm.plugin.appbrand.b.b.gWv) || (paramb == com.tencent.mm.plugin.appbrand.b.b.gWw))
    {
      paramString1 = l.aII().CT(paramString1);
      if (paramString1 == null)
        AppMethodBeat.o(108045);
    }
    while (true)
    {
      return;
      paramString1.a(paramString1.BS(paramString2));
      paramString1 = new HashMap();
      paramString1.put("reason", "interrupted");
      paramString1.put("socketTaskId", paramString2);
      paramString1.put("state", "close");
      paramString1 = new JSONObject(paramString1).toString();
      new f.a().j(paramc).AM(paramString1).aCj();
      AppMethodBeat.o(108045);
    }
  }

  private static void a(c paramc, String paramString1, String paramString2)
  {
    AppMethodBeat.i(108049);
    if (bo.isNullOrNil(paramString2));
    for (paramString2 = "fail"; ; paramString2 = "fail:".concat(String.valueOf(paramString2)))
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("socketTaskId", paramString1);
      localHashMap.put("state", "error");
      localHashMap.put("errMsg", paramString2);
      paramString1 = new JSONObject(localHashMap).toString();
      new f.a().j(paramc).AM(paramString1).aCj();
      ab.d("MicroMsg.JsApiCreateSocketTask", "onSocketConnectFail jsonResult:%s ", new Object[] { paramString1 });
      ((com.tencent.mm.plugin.appbrand.n.a)e.C(com.tencent.mm.plugin.appbrand.n.a.class)).f(972L, 3L, 1L);
      AppMethodBeat.o(108049);
      return;
    }
  }

  public static void a(k.a parama)
  {
    hRy = parama;
  }

  public final String OA()
  {
    return "socketTaskId";
  }

  public final void a(c paramc, JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(108046);
    Object localObject1 = l.aII().CT(paramc.getAppId());
    Object localObject2 = localObject1;
    if (localObject1 == null)
      if (((this.hRC != hRA) || (!this.hRD)) && ((this.hRC != hRB) || (!this.hRE)))
        break label180;
    Object localObject3;
    label180: for (localObject1 = new com.tencent.mm.plugin.appbrand.jsapi.websocket.a((com.tencent.mm.plugin.appbrand.l.a)paramc.aa(com.tencent.mm.plugin.appbrand.l.a.class)); ; localObject1 = new k((com.tencent.mm.plugin.appbrand.l.a)paramc.aa(com.tencent.mm.plugin.appbrand.l.a.class)))
    {
      localObject3 = l.aII();
      localObject4 = paramc.getAppId();
      localObject2 = localObject1;
      if (!((l)localObject3).hGk.containsKey(localObject4))
      {
        ((l)localObject3).hGk.put(localObject4, localObject1);
        localObject2 = localObject1;
      }
      localObject3 = new f.1(this, paramc, paramString);
      localObject1 = paramJSONObject.optString("url");
      if (!bo.isNullOrNil((String)localObject1))
        break;
      ab.i("MicroMsg.JsApiCreateSocketTask", "url is null");
      a(paramc, paramString, "url is null");
      AppMethodBeat.o(108046);
      return;
    }
    ab.i("MicroMsg.JsApiCreateSocketTask", "url is ".concat(String.valueOf(localObject1)));
    com.tencent.mm.plugin.appbrand.l.a locala = (com.tencent.mm.plugin.appbrand.l.a)paramc.aa(com.tencent.mm.plugin.appbrand.l.a.class);
    Object localObject4 = j.a(paramJSONObject, locala);
    if ((locala.ioe) && (paramJSONObject.optBoolean("__skipDomainCheck__")))
    {
      i = 1;
      label261: if (i == 0)
        break label331;
    }
    label331: for (boolean bool = false; ; bool = locala.iof)
    {
      if ((!bool) || (j.a(locala.bQG, (String)localObject1, locala.bQB)))
        break label341;
      ab.i("MicroMsg.JsApiCreateSocketTask", "not in domain url %s", new Object[] { localObject1 });
      a(paramc, paramString, "url not in domain list");
      AppMethodBeat.o(108046);
      break;
      i = 0;
      break label261;
    }
    label341: int j = paramJSONObject.optInt("timeout", 0);
    int i = j;
    if (j <= 0)
      i = j.a(locala, 1);
    if (i > 0);
    while (true)
    {
      localObject2.a(paramc.getAppId(), paramString, this.hRC, i, paramJSONObject, (Map)localObject4, (d.a)localObject3);
      if ((this.hRD) || (this.hRE))
        ((com.tencent.mm.plugin.appbrand.n.a)e.C(com.tencent.mm.plugin.appbrand.n.a.class)).f(972L, 10L, 1L);
      while (true)
      {
        ab.i("MicroMsg.JsApiCreateSocketTask", "connectSocket, url is : %s , componentId: %s", new Object[] { localObject1, Integer.valueOf(paramc.aBw()) });
        AppMethodBeat.o(108046);
        break;
        ((com.tencent.mm.plugin.appbrand.n.a)e.C(com.tencent.mm.plugin.appbrand.n.a.class)).f(972L, 0L, 1L);
      }
      i = 60000;
    }
  }

  public final String aBA()
  {
    AppMethodBeat.i(108044);
    Object localObject = new StringBuilder();
    l.aII();
    localObject = l.aIA();
    AppMethodBeat.o(108044);
    return localObject;
  }

  public final void g(c paramc)
  {
    AppMethodBeat.i(108047);
    if (this.hRz != null)
    {
      this.hRD = this.hRz.xj(paramc.getAppId());
      this.hRE = this.hRz.auB();
    }
    AppMethodBeat.o(108047);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.f
 * JD-Core Version:    0.6.2
 */