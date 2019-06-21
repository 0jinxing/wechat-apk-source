package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.a;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.s;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

final class o$8
  implements b.s
{
  AtomicBoolean hML;
  float hMM;
  o.f hMN;
  JSONObject jsonObject;

  o$8(o paramo, int paramInt, e parame)
  {
    AppMethodBeat.i(93859);
    this.hML = new AtomicBoolean(false);
    this.jsonObject = new JSONObject();
    this.hMN = new o.f();
    AppMethodBeat.o(93859);
  }

  public final void a(b.a parama)
  {
    AppMethodBeat.i(93860);
    if (this.hML.compareAndSet(false, true));
    try
    {
      this.jsonObject.remove("mapId");
      this.jsonObject.put("mapId", this.hCN);
      this.jsonObject.remove("type");
      this.jsonObject.put("type", "begin");
      this.jsonObject.remove("causedBy");
      this.jsonObject.remove("rotate");
      this.jsonObject.remove("skew");
      this.hMN.AM(this.jsonObject.toString());
      this.hMK.b(this.hMN);
      this.hMM = parama.zoom;
      ab.v("MicroMsg.JsApiInsertMap", "onCameraChange begin");
      AppMethodBeat.o(93860);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", new Object[] { localJSONException });
    }
  }

  public final void a(b.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(93861);
    if (this.hML.compareAndSet(true, false));
    try
    {
      this.jsonObject.remove("mapId");
      this.jsonObject.put("mapId", this.hCN);
      this.jsonObject.remove("type");
      this.jsonObject.put("type", "end");
      this.jsonObject.remove("causedBy");
      int i;
      if (parama.zoom != this.hMM)
      {
        i = 1;
        if (!paramBoolean)
          break label251;
        if (i == 0)
          break label217;
        this.jsonObject.put("causedBy", "scale");
      }
      while (true)
      {
        this.jsonObject.remove("rotate");
        this.jsonObject.put("rotate", parama.rotate);
        this.jsonObject.remove("skew");
        this.jsonObject.put("skew", parama.skew);
        this.hMN.AM(this.jsonObject.toString());
        this.hMK.b(this.hMN);
        ab.v("MicroMsg.JsApiInsertMap", "onCameraChange finish, result:%s", new Object[] { this.jsonObject.toString() });
        AppMethodBeat.o(93861);
        return;
        i = 0;
        break;
        label217: this.jsonObject.put("causedBy", "drag");
      }
    }
    catch (JSONException parama)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", new Object[] { parama });
        continue;
        label251: this.jsonObject.put("causedBy", "update");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.o.8
 * JD-Core Version:    0.6.2
 */