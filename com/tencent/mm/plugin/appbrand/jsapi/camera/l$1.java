package com.tencent.mm.plugin.appbrand.jsapi.camera;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import org.json.JSONObject;

final class l$1
  implements Runnable
{
  l$1(l paraml, JSONObject paramJSONObject, c paramc, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126251);
    int i = this.hsm.optInt("cameraId");
    String str = this.hsm.optString("type");
    ab.i("MicroMsg.JsApiOperateCamera", "cameraId=%d type=%s", new Object[] { Integer.valueOf(i), str });
    Object localObject = a.a.aDb();
    Integer localInteger = Integer.valueOf(i);
    if (((a)localObject).hGk.containsKey(localInteger))
    {
      localObject = (e)((a)localObject).hGk.get(localInteger);
      if (localObject != null)
        break label120;
      this.hyd.M(this.eIl, this.hHd.j("fail:no such camera", null));
      AppMethodBeat.o(126251);
    }
    while (true)
    {
      label114: return;
      localObject = null;
      break;
      label120: ((e)localObject).setOperateCallBack(new l.1.1(this));
      i = -1;
      switch (str.hashCode())
      {
      default:
      case 1484838379:
      case -1909077165:
      case -1391995149:
      case -374265034:
      case -2144140699:
      }
      while (true)
        switch (i)
        {
        default:
          ab.w("MicroMsg.JsApiOperateCamera", "operateType not supported: %s", new Object[] { str });
          this.hyd.M(this.eIl, this.hHd.j("fail:operateType not supported", null));
          AppMethodBeat.o(126251);
          break label114;
          if (str.equals("takePhoto"))
          {
            i = 0;
            continue;
            if (str.equals("startRecord"))
            {
              i = 1;
              continue;
              if (str.equals("stopRecord"))
              {
                i = 2;
                continue;
                if (str.equals("listenFrameChange"))
                {
                  i = 3;
                  continue;
                  if (str.equals("closeFrameChange"))
                    i = 4;
                }
              }
            }
          }
          break;
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        }
      ((e)localObject).setQuality(this.hsm.optString("quality", "high"));
      ((e)localObject).aDd();
      AppMethodBeat.o(126251);
      continue;
      ((e)localObject).aDm();
      AppMethodBeat.o(126251);
      continue;
      ((e)localObject).aDn();
      AppMethodBeat.o(126251);
      continue;
      this.hsm.optString("size");
      ((e)localObject).n(this.hyd);
      AppMethodBeat.o(126251);
      continue;
      ((e)localObject).aDg();
      this.hyd.M(this.eIl, this.hHd.j("ok", null));
      AppMethodBeat.o(126251);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.l.1
 * JD-Core Version:    0.6.2
 */