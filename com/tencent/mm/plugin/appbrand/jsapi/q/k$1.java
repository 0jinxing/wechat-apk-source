package com.tencent.mm.plugin.appbrand.jsapi.q;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

final class k$1
  implements Runnable
{
  k$1(k paramk, JSONObject paramJSONObject, c paramc, int paramInt)
  {
  }

  public final void run()
  {
    float f = 0.01F;
    AppMethodBeat.i(126431);
    this.hXL.hXK = ((float)this.hsm.optDouble("value"));
    if ((Float.isNaN(this.hXL.hXK)) || (this.hXL.hXK < 0.0F) || (this.hXL.hXK > 1.0F))
    {
      this.hxc.M(this.eIl, this.hXL.j("fail:value invalid", null));
      ab.e("MicroMsg.JsApiSetScreenBrightness", "value invalid");
      AppMethodBeat.o(126431);
    }
    while (true)
    {
      return;
      localObject = this.hxc.getContext();
      if (localObject == null)
      {
        this.hxc.M(this.eIl, this.hXL.j("fail", null));
        ab.e("MicroMsg.JsApiSetScreenBrightness", "context is null, invoke fail!");
        AppMethodBeat.o(126431);
      }
      else
      {
        if ((this.hxc.getContext() instanceof Activity))
          break;
        ab.e("MicroMsg.JsApiSetScreenBrightness", "setScreenBrightness, server context is not activity, don't do invoke");
        this.hxc.M(this.eIl, this.hXL.j("fail:context is not activity", null));
        AppMethodBeat.o(126431);
      }
    }
    Activity localActivity = (Activity)localObject;
    Object localObject = localActivity.getWindow().getAttributes();
    if (Float.isNaN(this.hXL.hXJ))
    {
      this.hXL.hXJ = ((WindowManager.LayoutParams)localObject).screenBrightness;
      g.a(this.hxc.getAppId(), new k.1.1(this, (WindowManager.LayoutParams)localObject, localActivity));
    }
    if (this.hXL.hXK < 0.01F);
    while (true)
    {
      ((WindowManager.LayoutParams)localObject).screenBrightness = f;
      localActivity.getWindow().setAttributes((WindowManager.LayoutParams)localObject);
      this.hxc.M(this.eIl, this.hXL.j("ok", null));
      AppMethodBeat.o(126431);
      break;
      f = this.hXL.hXK;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.k.1
 * JD-Core Version:    0.6.2
 */