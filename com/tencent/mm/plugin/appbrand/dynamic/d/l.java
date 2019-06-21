package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.dynamic.widget.a.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.z.b.b.a;
import org.json.JSONObject;

public final class l extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public l(int paramInt)
  {
    super("setWidgetSize", paramInt);
  }

  public final void a(com.tencent.mm.z.c.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    AppMethodBeat.i(10856);
    v.b localb = parama.Qy();
    parama = new a.a();
    parama.id = localb.getString("__page_view_id", "");
    parama.width = paramJSONObject.optInt("width", localb.getInt("__page_view_width", 0));
    parama.height = paramJSONObject.optInt("height", localb.getInt("__page_view_height", 0));
    XIPCInvoker.a(localb.getString("__process_name", ah.getProcessName()), parama, l.a.class, new l.1(this, parama1));
    AppMethodBeat.o(10856);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.l
 * JD-Core Version:    0.6.2
 */