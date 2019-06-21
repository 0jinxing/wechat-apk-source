package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.m;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.websocket.d.a;
import com.tencent.mm.plugin.appbrand.l.j;
import com.tencent.mm.plugin.appbrand.l.k.a;
import com.tencent.mm.plugin.appbrand.s.q;
import com.tencent.mm.plugin.appbrand.s.q.a;
import com.tencent.mm.plugin.appbrand.s.q.b;
import com.tencent.mm.plugin.appbrand.s.r;
import com.tencent.mm.plugin.appbrand.t.e.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class f$1
  implements d.a
{
  boolean hRF = false;

  f$1(f paramf, c paramc, String paramString)
  {
  }

  public final void BB(String paramString)
  {
    AppMethodBeat.i(108039);
    HashMap localHashMap = new HashMap();
    localHashMap.put("data", r.Ei(paramString));
    localHashMap.put("isBuffer", Boolean.FALSE);
    localHashMap.put("socketTaskId", this.hvm);
    localHashMap.put("state", "message");
    paramString = new JSONObject(localHashMap).toString();
    new f.a().j(this.hxc).AM(paramString).aCj();
    AppMethodBeat.o(108039);
  }

  public final void K(int paramInt, String paramString)
  {
    AppMethodBeat.i(108041);
    if (f.aEo() != null)
      f.aEo().e(this.hxc, this.hvm);
    HashMap localHashMap = new HashMap();
    if (j.b(this.hxc.asD()))
      localHashMap.put("reason", "interrupted");
    while (true)
    {
      localHashMap.put("code", Integer.valueOf(paramInt));
      localHashMap.put("socketTaskId", this.hvm);
      localHashMap.put("state", "close");
      paramString = new JSONObject(localHashMap).toString();
      new f.a().j(this.hxc).AM(paramString).aCj();
      AppMethodBeat.o(108041);
      return;
      if (!bo.isNullOrNil(paramString))
        localHashMap.put("reason", paramString);
    }
  }

  public final void a(com.tencent.mm.plugin.appbrand.t.e.a parama)
  {
    AppMethodBeat.i(108037);
    if ((parama == null) || (!((com.tencent.mm.plugin.appbrand.l.a)this.hxc.aa(com.tencent.mm.plugin.appbrand.l.a.class)).bQf))
      AppMethodBeat.o(108037);
    while (true)
    {
      return;
      m localm = new m();
      localm.csn.cso = "socket";
      localm.csn.csq = f.b(parama);
      localm.csn.csp = this.hvm;
      com.tencent.mm.sdk.b.a.xxA.m(localm);
      AppMethodBeat.o(108037);
    }
  }

  public final void b(h paramh)
  {
    AppMethodBeat.i(108036);
    if (f.aEo() != null)
      f.aEo().d(this.hxc, this.hvm);
    HashMap localHashMap = new HashMap();
    localHashMap.put("socketTaskId", this.hvm);
    localHashMap.put("state", "open");
    localHashMap.put("header", f.b(paramh));
    paramh = new JSONObject(localHashMap).toString();
    new f.a().j(this.hxc).AM(paramh).aCj();
    AppMethodBeat.o(108036);
  }

  public final void l(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(108040);
    HashMap localHashMap = new HashMap();
    localHashMap.put("socketTaskId", this.hvm);
    localHashMap.put("data", paramByteBuffer);
    localHashMap.put("isBuffer", Boolean.TRUE);
    localHashMap.put("state", "message");
    paramByteBuffer = (q.a)this.hxc.aa(q.a.class);
    paramByteBuffer = q.a(this.hxc.aBx(), localHashMap, paramByteBuffer);
    if (paramByteBuffer == q.b.iRI)
    {
      paramByteBuffer = new JSONObject(localHashMap).toString();
      new f.a().j(this.hxc).AM(paramByteBuffer).aCj();
      AppMethodBeat.o(108040);
    }
    while (true)
    {
      return;
      if (paramByteBuffer == q.b.iRJ)
        q.m(this.hxc, "onSocketTaskStateChange");
      AppMethodBeat.o(108040);
    }
  }

  public final void zJ(String paramString)
  {
    AppMethodBeat.i(108038);
    if (this.hRF)
    {
      ab.i("MicroMsg.JsApiCreateSocketTask", "onSocketError is true");
      AppMethodBeat.o(108038);
    }
    while (true)
    {
      return;
      this.hRF = true;
      HashMap localHashMap = new HashMap();
      localHashMap.put("socketTaskId", this.hvm);
      localHashMap.put("state", "error");
      localHashMap.put("errMsg", paramString);
      paramString = new JSONObject(localHashMap).toString();
      new f.a().j(this.hxc).AM(paramString).aCj();
      if ((f.a(this.hRG)) || (f.b(this.hRG)))
      {
        ((com.tencent.mm.plugin.appbrand.n.a)e.C(com.tencent.mm.plugin.appbrand.n.a.class)).f(972L, 2L, 1L);
        AppMethodBeat.o(108038);
      }
      else
      {
        ((com.tencent.mm.plugin.appbrand.n.a)e.C(com.tencent.mm.plugin.appbrand.n.a.class)).f(972L, 1L, 1L);
        AppMethodBeat.o(108038);
      }
    }
  }

  public final void zK(String paramString)
  {
    AppMethodBeat.i(108042);
    f.b(this.hxc, this.hvm, paramString);
    AppMethodBeat.o(108042);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.f.1
 * JD-Core Version:    0.6.2
 */