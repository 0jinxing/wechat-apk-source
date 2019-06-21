package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.u;
import com.tencent.mm.plugin.music.b.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Vector;
import org.json.JSONObject;

public class d extends u
{
  public static final int CTRL_INDEX = 291;
  public static final String NAME = "createAudioInstance";
  private static Vector<String> hzY;

  static
  {
    AppMethodBeat.i(137722);
    hzY = new Vector();
    AppMethodBeat.o(137722);
  }

  public final String b(c paramc, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(137721);
    paramc = paramc.getAppId();
    Object localObject = e.bSy();
    paramJSONObject = new HashMap();
    paramJSONObject.put("audioId", localObject);
    ab.i("MicroMsg.Audio.JsApiCreateAudioInstance", "createAudioInstance appId:%s, audioId:%s", new Object[] { paramc, localObject });
    d.a locala = new d.a();
    locala.ckD = ((String)localObject);
    locala.bJt = 0;
    locala.appId = paramc;
    locala.aCr();
    localObject = new d.1(this, paramc);
    if (!hzY.contains(paramc))
    {
      g.a(paramc, (g.c)localObject);
      hzY.add(paramc);
    }
    paramc = j("ok", paramJSONObject);
    AppMethodBeat.o(137721);
    return paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.d
 * JD-Core Version:    0.6.2
 */