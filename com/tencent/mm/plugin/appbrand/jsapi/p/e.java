package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.u;
import com.tencent.mm.plugin.appbrand.s.t;
import com.tencent.mm.plugin.appbrand.s.t.b;
import org.json.JSONObject;

public final class e extends u
{
  public static final int CTRL_INDEX = 472;
  public static final String NAME = "enableDeviceOrientationChangeListening";
  private boolean hVI;
  protected t hVJ;
  private t.b hVK;

  public e()
  {
    AppMethodBeat.i(126380);
    this.hVI = false;
    this.hVK = new e.1(this);
    AppMethodBeat.o(126380);
  }

  public final String b(c paramc, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126381);
    if (paramJSONObject.optBoolean("enable", false))
    {
      h.s(paramc);
      if (!this.hVI)
      {
        this.hVJ = new t(paramc.getContext(), this.hVK);
        this.hVJ.enable();
        this.hVI = true;
      }
    }
    while (true)
    {
      paramc = j("ok", null);
      AppMethodBeat.o(126381);
      return paramc;
      h.t(paramc);
      if (this.hVI)
      {
        this.hVJ.disable();
        this.hVJ = null;
        this.hVI = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.e
 * JD-Core Version:    0.6.2
 */