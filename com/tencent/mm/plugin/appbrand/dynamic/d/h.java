package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.model.v.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.z.b.b.a;
import org.json.JSONObject;

public final class h extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public h()
  {
    super("onTapCallback", 327);
  }

  public final void a(com.tencent.mm.z.c.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    AppMethodBeat.i(10844);
    v.b localb = parama.Qy();
    parama = new h.b();
    parama.id = localb.getString("__page_view_id", "");
    parama.cOS = paramJSONObject.optString("eventId", "");
    parama.hmZ = paramJSONObject.optBoolean("hasHandler");
    parama.hna = paramJSONObject.optBoolean("res");
    XIPCInvoker.a(localb.getString("__process_name", ah.getProcessName()), parama, h.a.class, new h.1(this, parama1));
    AppMethodBeat.o(10844);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.h
 * JD-Core Version:    0.6.2
 */