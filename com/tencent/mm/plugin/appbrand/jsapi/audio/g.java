package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.media.record.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g extends a
{
  public static final int CTRL_INDEX = 469;
  public static final String NAME = "getAvailableAudioSources";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(137729);
    if (paramJSONObject != null);
    for (paramJSONObject = paramJSONObject.toString(); ; paramJSONObject = "")
    {
      ab.i("MicroMsg.JsApiGetAvailableAudioSources", "getAvailableAudioSources data:%s", new Object[] { paramJSONObject });
      localObject = new ArrayList();
      ((List)localObject).add(b.ikZ.toString().toLowerCase());
      ((List)localObject).add(b.ila.toString().toLowerCase());
      ((List)localObject).add(b.ilb.toString().toLowerCase());
      ((List)localObject).add(b.ilc.toString().toLowerCase());
      ((List)localObject).add(b.ild.toString().toLowerCase());
      if (d.iW(24))
        ((List)localObject).add(b.ile.toString().toLowerCase());
      paramJSONObject = new JSONArray();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        paramJSONObject.put((String)((Iterator)localObject).next());
    }
    Object localObject = new HashMap(1);
    ((HashMap)localObject).put("audioSources", paramJSONObject);
    ab.i("MicroMsg.JsApiGetAvailableAudioSources", "getAvailableAudioSources ret:%s", new Object[] { ((HashMap)localObject).toString() });
    paramc.M(paramInt, j("ok", (Map)localObject));
    AppMethodBeat.o(137729);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.g
 * JD-Core Version:    0.6.2
 */