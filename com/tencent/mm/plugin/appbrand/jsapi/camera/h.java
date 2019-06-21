package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.util.Base64;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h extends ah
{
  private static final int CTRL_INDEX = 455;
  public static final String NAME = "onCameraScanCode";
  public static h hGZ;

  static
  {
    AppMethodBeat.i(130972);
    hGZ = new h();
    AppMethodBeat.o(130972);
  }

  public static void a(c paramc, int paramInt, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(130971);
    HashMap localHashMap = new HashMap();
    localHashMap.put("cameraId", Integer.valueOf(paramInt));
    localHashMap.put("type", paramString1);
    localHashMap.put("result", paramString2);
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      paramString1 = Base64.encodeToString(paramArrayOfByte, 2);
      localHashMap.put("charSet", "utf-8");
      localHashMap.put("rawData", paramString1);
    }
    paramString1 = new JSONObject(localHashMap).toString();
    d.d("MicroMsg.JsApiCameraScanCode", "onCameraScanCode:%s", new Object[] { paramString1 });
    paramc.a(hGZ.getName(), paramString1, null);
    AppMethodBeat.o(130971);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.h
 * JD-Core Version:    0.6.2
 */