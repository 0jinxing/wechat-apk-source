package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.model.v.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.z.b.b.a;
import org.json.JSONObject;

public final class g extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public g()
  {
    super("makePhoneCall", 327);
  }

  public final void a(com.tencent.mm.z.c.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    AppMethodBeat.i(10838);
    parama = parama.Qy();
    g.a locala = new g.a((byte)0);
    locala.id = parama.getString("__page_view_id", "");
    locala.cMQ = paramJSONObject.optString("phoneNumber", "");
    XIPCInvoker.a(parama.getString("__process_name", ah.getProcessName()), locala, g.b.class, new g.1(this, parama1));
    AppMethodBeat.o(10838);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.g
 * JD-Core Version:    0.6.2
 */