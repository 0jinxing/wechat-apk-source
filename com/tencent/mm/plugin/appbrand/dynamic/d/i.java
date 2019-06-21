package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.extension.f;
import com.tencent.mm.model.v.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.z.b.b.a;
import org.json.JSONObject;

public final class i extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public i()
  {
    super("openApp", 326);
  }

  public final void a(com.tencent.mm.z.c.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    AppMethodBeat.i(10850);
    parama = parama.Qy();
    b localb = new b();
    localb.id = parama.getString("__page_view_id", "");
    localb.url = paramJSONObject.optString("url", "");
    XIPCInvoker.a(parama.getString("__process_name", ah.getProcessName()), localb, i.a.class, new i.1(this, parama1));
    AppMethodBeat.o(10850);
  }

  public static final class b
    implements f
  {
    String id;
    String url;

    public final void e(Parcel paramParcel)
    {
      AppMethodBeat.i(10848);
      paramParcel.writeString(this.id);
      paramParcel.writeString(this.url);
      AppMethodBeat.o(10848);
    }

    public final void readFromParcel(Parcel paramParcel)
    {
      AppMethodBeat.i(10849);
      this.id = paramParcel.readString();
      this.url = paramParcel.readString();
      AppMethodBeat.o(10849);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.i
 * JD-Core Version:    0.6.2
 */